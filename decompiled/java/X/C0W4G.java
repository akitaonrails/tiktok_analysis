package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0W4G, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W4G {
    public final SharedPreferences LIZ;

    public final synchronized void LIZ() {
        long j = this.LIZ.getLong("fire-count", 0L);
        String key = "";
        String str = null;
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str2 : (Set) entry.getValue()) {
                    if (str == null || str.compareTo(str2) > 0) {
                        key = entry.getKey();
                        str = str2;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(key, new HashSet()));
        hashSet.remove(str);
        this.LIZ.edit().putStringSet(key, hashSet).putLong("fire-count", j - 1).commit();
    }

    public final synchronized void LIZIZ() {
        SharedPreferences.Editor editorEdit = this.LIZ.edit();
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                editorEdit.remove(entry.getKey());
            }
        }
        editorEdit.remove("fire-count");
        editorEdit.commit();
    }

    public final synchronized List<C0W4I> LIZJ() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                final String key = entry.getKey();
                final ArrayList arrayList2 = new ArrayList((Set) entry.getValue());
                arrayList.add(new C0W4I(key, arrayList2) { // from class: X.0W4H
                    public final String LIZ;
                    public final List<String> LIZIZ;

                    public final int hashCode() {
                        return ((this.LIZ.hashCode() ^ 1000003) * 1000003) ^ this.LIZIZ.hashCode();
                    }

                    public final String toString() {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("HeartBeatResult{userAgent=");
                        sbLIZ.append(this.LIZ);
                        sbLIZ.append(", usedDates=");
                        sbLIZ.append(this.LIZIZ);
                        sbLIZ.append("}");
                        return C2188811AlT.LIZIZ(sbLIZ);
                    }

                    @Override // X.C0W4I
                    public final List<String> LIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.C0W4I
                    public final String LIZIZ() {
                        return this.LIZ;
                    }

                    public final boolean equals(Object obj) {
                        if (obj == this) {
                            return true;
                        }
                        if (!(obj instanceof C0W4I)) {
                            return false;
                        }
                        C0W4I c0w4i = (C0W4I) obj;
                        if (this.LIZ.equals(c0w4i.LIZIZ()) && this.LIZIZ.equals(c0w4i.LIZ())) {
                            return true;
                        }
                        return false;
                    }

                    {
                        if (key != null) {
                            this.LIZ = key;
                            this.LIZIZ = arrayList2;
                            return;
                        }
                        throw new NullPointerException("Null userAgent");
                    }
                });
            }
        }
        LJIIJJI(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized void LJI() {
        String strLIZLLL = LIZLLL(System.currentTimeMillis());
        this.LIZ.edit().putString("last-used-date", strLIZLLL).commit();
        LJII(strLIZLLL);
    }

    public final synchronized String LIZLLL(long j) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String LJ(String str) {
        for (Map.Entry<String, ?> entry : this.LIZ.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it2 = ((Set) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    if (str.equals((String) it2.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void LJII(String str) {
        String strLJ = LJ(str);
        if (strLJ == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(strLJ, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.LIZ.edit().remove(strLJ).commit();
        } else {
            this.LIZ.edit().putStringSet(strLJ, hashSet).commit();
        }
    }

    public final synchronized boolean LJIIIIZZ(long j) {
        return LJIIIZ(j);
    }

    public final synchronized boolean LJIIIZ(long j) {
        if (this.LIZ.contains("fire-global")) {
            if (!LJFF(this.LIZ.getLong("fire-global", -1L), j)) {
                this.LIZ.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.LIZ.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void LJIIJJI(long j) {
        this.LIZ.edit().putLong("fire-global", j).commit();
    }

    public C0W4G(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirebaseHeartBeat");
        sbLIZ.append(str);
        this.LIZ = C810670Vr7.LIZJ(context, 0, C2188811AlT.LIZIZ(sbLIZ));
    }

    public final synchronized boolean LJFF(long j, long j2) {
        return LIZLLL(j).equals(LIZLLL(j2));
    }

    public final synchronized void LJIIJ(long j, String str) {
        String strLIZLLL = LIZLLL(j);
        if (this.LIZ.getString("last-used-date", "").equals(strLIZLLL)) {
            return;
        }
        long j2 = this.LIZ.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            LIZ();
            j2 = this.LIZ.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.LIZ.getStringSet(str, new HashSet()));
        hashSet.add(strLIZLLL);
        this.LIZ.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", strLIZLLL).commit();
    }
}
