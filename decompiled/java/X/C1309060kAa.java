package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ttkmedia.datacenter.settings.StarShipFetcher;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0kAa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309060kAa {
    public int LJ;
    public final String LJI;
    public final ReentrantReadWriteLock LIZ = new ReentrantReadWriteLock();
    public JSONObject LIZIZ = null;
    public Context LIZJ = null;
    public int LIZLLL = 0;
    public SharedPreferences LJFF = null;

    public final JSONObject LIZIZ() {
        LJI(this.LIZJ);
        this.LIZ.readLock().lock();
        try {
            try {
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
            JSONObject jSONObject = this.LIZIZ != null ? new JSONObject(C786410Ut5.J3(this.LIZIZ)) : null;
            this.LIZ.readLock().unlock();
            return jSONObject;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZ.readLock().unlock();
            throw th;
        }
    }

    public final void LJFF() {
        SharedPreferences sharedPreferences;
        this.LIZ.writeLock().lock();
        if (this.LIZIZ != null) {
            this.LIZIZ = new JSONObject();
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.clear();
            editorEdit.apply();
        }
        this.LIZ.writeLock().unlock();
    }

    public final long LIZJ(String str) {
        long jOptLong;
        SharedPreferences sharedPreferences;
        int length;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.readLock().lock();
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null && !jSONObject.isNull(str)) {
                jOptLong = this.LIZIZ.optLong(str);
                length = this.LIZIZ.length();
            } else {
                length = 0;
                jOptLong = 0;
            }
            this.LIZ.readLock().unlock();
            if (length != 0 || jOptLong != 0) {
                return jOptLong;
            }
        } else {
            jOptLong = 0;
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            long j = sharedPreferences.getLong(str, 0L);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get long from SP, key = ");
            sbLIZ.append(str);
            sbLIZ.append(", retValue = ");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            return j;
        }
        return jOptLong;
    }

    public final synchronized boolean LJI(Context context) {
        if (this.LIZLLL == 2) {
            return true;
        }
        this.LIZJ = context;
        if (context == null) {
            return false;
        }
        this.LIZLLL = 1;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("loading local settings, name = ");
        sbLIZ.append(this.LJI);
        C2188811AlT.LIZIZ(sbLIZ);
        int i = this.LJ;
        if ((i & 2) > 0) {
            Context context2 = this.LIZJ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("com.ttkmedia.datacenter.settings.");
            sbLIZ2.append(this.LJI);
            SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context2, 0, C2188811AlT.LIZIZ(sbLIZ2));
            this.LJFF = sharedPreferencesLIZJ;
            if ((this.LJ & 1) > 0 && sharedPreferencesLIZJ != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LJI);
                sbLIZ3.append("_whole");
                String string = sharedPreferencesLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ3), "");
                if (!TextUtils.isEmpty(string)) {
                    this.LIZ.writeLock().lock();
                    try {
                        try {
                            this.LIZIZ = new JSONObject(string);
                            this.LIZ.writeLock().unlock();
                        } catch (JSONException e) {
                            TryCatchGuardChecker.doCheck(e);
                            e.toString();
                            this.LIZLLL = 0;
                            this.LIZ.writeLock().unlock();
                            return false;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LIZ.writeLock().unlock();
                        throw th;
                    }
                }
            }
        } else if ((i & 4) > 0) {
            if (this.LJI.equals("common")) {
                JSONObject extraConfig = StarShipFetcher.getExtraConfig();
                if (extraConfig != null && extraConfig.length() > 0) {
                    this.LIZ.writeLock().lock();
                    this.LIZIZ = extraConfig;
                    this.LIZ.writeLock().unlock();
                }
            } else if (this.LJI.equals("vod")) {
                ArrayList arrayList = new ArrayList();
                arrayList.add("playback");
                arrayList.add("mdl");
                JSONObject vodConfig = StarShipFetcher.getVodConfig(arrayList);
                if (vodConfig != null) {
                    this.LIZ.writeLock().lock();
                    this.LIZIZ = vodConfig;
                    this.LIZ.writeLock().unlock();
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(this.LJI);
                JSONObject vodConfig2 = StarShipFetcher.getVodConfig(arrayList2);
                if (vodConfig2 != null) {
                    this.LIZ.writeLock().lock();
                    this.LIZIZ = vodConfig2.optJSONObject(this.LJI);
                    this.LIZ.writeLock().unlock();
                }
            }
        }
        this.LIZ.writeLock().lock();
        if (this.LIZIZ == null) {
            this.LIZIZ = new JSONObject();
        }
        this.LIZ.writeLock().unlock();
        this.LIZLLL = 2;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("load local settings, name = ");
        sbLIZ4.append(this.LJI);
        C2188811AlT.LIZIZ(sbLIZ4);
        return true;
    }

    public C1309060kAa(String str, int i) {
        this.LJI = str;
        this.LJ = i;
    }

    public final int LIZ(String str, int i) {
        int iOptInt;
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return i;
        }
        LJI(this.LIZJ);
        int length = 0;
        if ((this.LJ & 1) > 0) {
            this.LIZ.readLock().lock();
            JSONObject jSONObject = this.LIZIZ;
            if (jSONObject != null && !jSONObject.isNull(str)) {
                iOptInt = this.LIZIZ.optInt(str);
                length = this.LIZIZ.length();
            } else {
                iOptInt = i;
            }
            this.LIZ.readLock().unlock();
            if (length != 0) {
                return iOptInt;
            }
        } else {
            iOptInt = i;
        }
        if ((this.LJ & 2) > 0 && iOptInt == i && (sharedPreferences = this.LJFF) != null) {
            int i2 = sharedPreferences.getInt(str, i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get int from SP, key = ");
            sbLIZ.append(str);
            sbLIZ.append(", retValue = ");
            sbLIZ.append(i2);
            C2188811AlT.LIZIZ(sbLIZ);
            return i2;
        }
        return iOptInt;
    }

    public final void LIZLLL(String str, int i) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.writeLock().lock();
            try {
                try {
                    JSONObject jSONObject = this.LIZIZ;
                    if (jSONObject != null) {
                        jSONObject.put(str, i);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                }
                this.LIZ.writeLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.writeLock().unlock();
                throw th;
            }
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putInt(str, i);
            editorEdit.apply();
        }
    }

    public final void LJ(String str, long j) {
        SharedPreferences sharedPreferences;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJI(this.LIZJ);
        if ((this.LJ & 1) > 0) {
            this.LIZ.writeLock().lock();
            try {
                try {
                    JSONObject jSONObject = this.LIZIZ;
                    if (jSONObject != null) {
                        jSONObject.put(str, j);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                }
                this.LIZ.writeLock().unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZ.writeLock().unlock();
                throw th;
            }
        }
        if ((this.LJ & 2) > 0 && (sharedPreferences = this.LJFF) != null) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(str, j);
            editorEdit.apply();
        }
    }
}
