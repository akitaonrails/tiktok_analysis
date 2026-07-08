package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdinstall.BDInstallProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0WUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C824230WUz {
    public static final Map<String, String> LIZJ = new ConcurrentHashMap();
    public static final Map<String, List<C0WV2>> LIZLLL = new ConcurrentHashMap();
    public static final C0WV1 LJ = new AbstractC824140WUq<C824230WUz>() { // from class: X.0WV1
        @Override // X.AbstractC824140WUq
        public final C824230WUz LIZ(Object[] objArr) {
            return new C824230WUz((Context) objArr[0]);
        }
    };
    public final Context LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public C824230WUz(Context context) {
        this.LIZ = context;
    }

    public static C824230WUz LIZ(Context context) {
        return LJ.LIZIZ(context);
    }

    public final void LIZIZ(String str, String str2, C0WV2 c0wv2) {
        Uri uriLIZ;
        if (this.LIZIZ.compareAndSet(false, true) && (uriLIZ = BDInstallProvider.LIZ(this.LIZ)) != null) {
            ContentResolver contentResolver = this.LIZ.getContentResolver();
            final Handler handlerLIZIZ = C824170WUt.LIZIZ(C824170WUt.LIZ(C824170WUt.LIZLLL));
            contentResolver.registerContentObserver(uriLIZ, true, new ContentObserver(handlerLIZIZ) { // from class: X.0WV0
                @Override // android.database.ContentObserver
                public final void onChange(boolean z, Uri uri) {
                    onChange(z);
                    synchronized (this.LIZ) {
                        try {
                            String queryParameter = uri.getQueryParameter("key");
                            String queryParameter2 = uri.getQueryParameter("value");
                            String queryParameter3 = uri.getQueryParameter("aid");
                            if (TextUtils.isEmpty(queryParameter)) {
                                return;
                            }
                            ((ConcurrentHashMap) C824230WUz.LIZJ).put(queryParameter, queryParameter2);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("install_info send to child process onUpdate ");
                            sbLIZ.append(queryParameter2);
                            sbLIZ.append(" aid ：");
                            sbLIZ.append(queryParameter3);
                            C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                            List<C0WV2> list = (List) ((ConcurrentHashMap) C824230WUz.LIZLLL).get(queryParameter);
                            if (list != null) {
                                for (C0WV2 c0wv22 : list) {
                                    if (c0wv22 != null) {
                                        c0wv22.LIZJ(queryParameter2, queryParameter3);
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            });
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        synchronized (this) {
            try {
                Map<String, List<C0WV2>> map = LIZLLL;
                List arrayList = (List) ((ConcurrentHashMap) map).get(str2);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    ((ConcurrentHashMap) map).put(str2, arrayList);
                }
                arrayList.add(c0wv2);
                Map<String, String> map2 = LIZJ;
                if (((ConcurrentHashMap) map2).containsKey(str2)) {
                    String str3 = (String) ((ConcurrentHashMap) map2).get(str2);
                    if (c0wv2 != null) {
                        c0wv2.LIZJ(str3, str);
                    }
                    return;
                }
                SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(this.LIZ, 0, "ug_install_op_pref");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append("_");
                sbLIZ.append(str);
                String string = sharedPreferencesLIZJ.getString(C2188811AlT.LIZIZ(sbLIZ), null);
                if (!TextUtils.isEmpty(string) && c0wv2 != null) {
                    c0wv2.LIZJ(string, str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(final String str, String str2, String str3) {
        try {
            SharedPreferences.Editor editorEdit = C810670Vr7.LIZJ(this.LIZ, 0, "ug_install_op_pref").edit();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str2);
            sbLIZ.append("_");
            sbLIZ.append(str);
            editorEdit.putString(C2188811AlT.LIZIZ(sbLIZ), str3).apply();
            Uri uriLIZ = BDInstallProvider.LIZ(this.LIZ);
            if (uriLIZ == null) {
                return;
            }
            final Uri uriBuild = uriLIZ.buildUpon().appendQueryParameter("key", str2).appendQueryParameter("aid", str).appendQueryParameter("value", str3).build();
            final int[] iArr = new int[1];
            new Runnable() { // from class: X.0WUy
                public final void LIZ() {
                    try {
                        this.LLILZ.LIZ.getContentResolver().notifyChange(uriBuild, null);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        int[] iArr2 = iArr;
                        int i = iArr2[0] + 1;
                        iArr2[0] = i;
                        if (i <= 4) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(this);
                            sbLIZ2.append("retry ");
                            sbLIZ2.append(iArr[0]);
                            sbLIZ2.append(" times after 1 second");
                            C844830XCf.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                            C786410Ut5.LJLIIL(1000L, C824170WUt.LIZIZ(str), this);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SubpSyncManager@10e5.sendSubpEvent$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SubpSyncManager@10e5.sendSubpEvent$1");
                }
            }.run();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C844830XCf.LIZJ("sendSubpEvent error", e);
        }
    }
}
