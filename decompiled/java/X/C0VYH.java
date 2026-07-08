package X;

import Y.AComparatorS32S0000000_13;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VYH, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VYH {
    public static boolean LJIIJ = true;
    public static int LJIIJJI = 1;
    public static long LJIIL = -1;
    public static boolean LJIILIIL;
    public static boolean LJIILJJIL;
    public static boolean LJIILL;
    public static final String[] LJIILLIIL = {"last_create_activity", "last_start_activity", "last_resume_activity", "last_pause_activity", "last_stop_activity", "last_destroy_activity"};
    public static final String[] LJIIZILJ = {"onCreate", "onStart", "onResume", "onPause", "onStop", "onDestroy"};
    public static volatile C0VYH LJIJ;
    public String LIZ;
    public boolean LIZIZ;
    public int LIZJ;
    public C0VYM LJI;
    public C0VYN LJIIIZ;
    public final Map<Integer, C0VYK> LIZLLL = new HashMap();
    public final List<C0VYK> LJ = new ArrayList();
    public final C0VYM[] LJFF = new C0VYM[6];
    public final LinkedList<C0VYF> LJII = new LinkedList<>();
    public final ArrayList<WeakReference<Activity>> LJIIIIZZ = new ArrayList<>();

    public static C0VYH LIZIZ() {
        if (LJIJ == null) {
            synchronized (C0VYH.class) {
                try {
                    if (LJIJ == null) {
                        LJIJ = new C0VYH();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIJ;
    }

    public final boolean LIZLLL() {
        ArrayList arrayList = new ArrayList(((HashMap) this.LIZLLL).entrySet());
        for (int i = 0; i < arrayList.size(); i++) {
            if (((C0VYK) ((Map.Entry) ListProtector.get(arrayList, i)).getValue()).LIZJ < 3) {
                return true;
            }
        }
        return false;
    }

    public C0VYH() {
        Application application = C0VX9.LIZIZ().LIZJ;
        if (Build.VERSION.SDK_INT < 24 || application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: X.0VYI
            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(Activity activity) {
                this.LL.LJII(5, activity);
                try {
                    Object objInvoke = activity.getClass().getMethod("getSupportFragmentManager", new Class[0]).invoke(activity, new Object[0]);
                    try {
                        if (Class.forName("androidx.fragment.app.FragmentManager").isAssignableFrom(objInvoke.getClass())) {
                            ((FragmentManager) objInvoke).LLIILZL(C0VYJ.LIZ());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
                C0VYR c0vyr = C0VYR.LIZJ;
                if (c0vyr.LIZ == null) {
                    c0vyr.LIZ = new C0VYQ();
                }
                C0VYQ c0vyq = c0vyr.LIZ;
                c0vyq.getClass();
                PrintStream printStream = System.out;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NPTH:addToWatchList: ");
                sbLIZ.append(activity);
                printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                ((ConcurrentHashMap) c0vyq.LIZJ).put(UUID.randomUUID().toString(), new C2031907xd(activity, System.currentTimeMillis(), c0vyq.LIZLLL));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(Activity activity) {
                String strLIZ;
                C0VYH c0vyh = this.LL;
                if (c0vyh.LJIIIZ == null) {
                    strLIZ = activity.getClass().getName();
                } else {
                    strLIZ = C0VYO.LIZ(activity);
                }
                c0vyh.LIZ = strLIZ;
                C0VYH c0vyh2 = this.LL;
                int i = c0vyh2.LIZJ - 1;
                c0vyh2.LIZJ = i;
                if (i == 0) {
                    c0vyh2.LIZIZ = false;
                    C0VYH.LJIILIIL = false;
                } else if (i < 0) {
                    c0vyh2.LIZJ = 0;
                    c0vyh2.LIZIZ = false;
                    C0VYH.LJIILIIL = false;
                }
                c0vyh2.LJII(3, activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(Activity activity) {
                String strLIZ;
                C0VYK c0vyk;
                C0VYH c0vyh = this.LL;
                C0VYM c0vym = c0vyh.LJFF[2];
                if (c0vym != null && (c0vyk = c0vym.LIZ) != null) {
                    if (c0vyh.LJI == null) {
                        c0vyh.LJI = new C0VYM();
                    }
                    C0VYM c0vym2 = c0vyh.LJI;
                    c0vym2.LIZ = c0vyk;
                    c0vym2.LIZIZ = c0vym.LIZIZ;
                }
                c0vyh.LJII(2, activity);
                if (this.LL.LJIIIZ == null) {
                    strLIZ = activity.getClass().getName();
                } else {
                    strLIZ = C0VYO.LIZ(activity);
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                C0VYH c0vyh2 = this.LL;
                c0vyh2.LIZJ++;
                if (!c0vyh2.LIZIZ) {
                    c0vyh2.LIZIZ = true;
                    if (C0VYH.LJIIJ) {
                        C0VYH.LJIIJ = false;
                        C0VYH.LJIIJJI = 1;
                        C0VYH.LJIIL = jCurrentTimeMillis;
                    }
                    if (strLIZ.equals(c0vyh2.LIZ)) {
                        if (C0VYH.LJIILIIL && !C0VYH.LJIILJJIL) {
                            C0VYH.LJIIJJI = 4;
                            C0VYH.LJIIL = jCurrentTimeMillis;
                        } else {
                            if (C0VYH.LJIILIIL) {
                                return;
                            }
                            C0VYH.LJIIJJI = 3;
                            C0VYH.LJIIL = jCurrentTimeMillis;
                        }
                    }
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(Activity activity) {
                this.LL.LJII(1, activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(Activity activity) {
                this.LL.LJII(4, activity);
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(Activity activity, Bundle bundle) {
                boolean z;
                if (bundle != null) {
                    z = true;
                } else {
                    z = false;
                }
                C0VYH.LJIILJJIL = z;
                this.LL.LJII(0, activity);
                C0VYH.LJIILIIL = true;
                this.LL.LJIIIIZZ.add(new WeakReference<>(activity));
                try {
                    Object objInvoke = activity.getClass().getMethod("getSupportFragmentManager", new Class[0]).invoke(activity, new Object[0]);
                    try {
                        if (Class.forName("androidx.fragment.app.FragmentManager").isAssignableFrom(objInvoke.getClass())) {
                            C2095308It.LIZ = true;
                            ((FragmentManager) objInvoke).LJZL(C0VYJ.LIZ(), false);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                }
            }
        });
    }

    public static boolean LIZJ() {
        if (((HashMap) LIZIZ().LIZLLL).isEmpty()) {
            Context contextLJ = C0VX9.LJ();
            if (contextLJ != null) {
                contextLJ.getPackageName();
                try {
                    return true;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            return true;
        }
        if (LIZIZ().LIZLLL()) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0VYH c0vyhLIZIZ = LIZIZ();
        c0vyhLIZIZ.getClass();
        ArrayList arrayList = new ArrayList(((HashMap) c0vyhLIZIZ.LIZLLL).entrySet());
        long j = 0;
        int i = 0;
        long j2 = 0;
        while (true) {
            if (i >= arrayList.size()) {
                j = j2;
                break;
            }
            C0VYK c0vyk = (C0VYK) ((Map.Entry) ListProtector.get(arrayList, i)).getValue();
            if (c0vyk.LIZJ < 3) {
                break;
            }
            long j3 = c0vyk.LIZLLL;
            if (j2 < j3) {
                j2 = j3;
            }
            i++;
        }
        return jCurrentTimeMillis - j > 2000;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ba A[LOOP:3: B:44:0x01b4->B:46:0x01ba, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(java.io.File r10) {
        /*
            Method dump skipped, instruction units count: 549
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VYH.LIZ(java.io.File):void");
    }

    public static void LJFF(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < 6; i++) {
                if (LIZIZ().LJFF[i] != null && LIZIZ().LJFF[i].LIZ != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("name", LIZIZ().LJFF[i].LIZ.LIZ);
                    jSONObject3.put("time", LIZIZ().LJFF[i].LIZIZ);
                    jSONObject2.put(LJIILLIIL[i], jSONObject3);
                }
            }
            if (LIZIZ().LJI != null && LIZIZ().LJI.LIZ != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("name", LIZIZ().LJI.LIZ.LIZ);
                jSONObject4.put("time", LIZIZ().LJI.LIZIZ);
                jSONObject2.put("last_last_resume_activity", jSONObject4);
            }
            ArrayList<Map.Entry> arrayList = new ArrayList(((HashMap) LIZIZ().LIZLLL).entrySet());
            Collections.sort(arrayList, new AComparatorS32S0000000_13(16));
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : arrayList) {
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("name", ((C0VYK) entry.getValue()).LIZ);
                jSONObject5.put("time", ((C0VYK) entry.getValue()).LJ);
                jSONArray.put(jSONObject5);
            }
            jSONObject2.put("alive_activities", jSONArray);
            Object jSONArray2 = new JSONArray();
            int size = ((ArrayList) LIZIZ().LJ).size();
            while (true) {
                size--;
                if (size >= 0) {
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("name", ((C0VYK) ((ArrayList) LIZIZ().LJ).get(size)).LIZ);
                    jSONObject6.put("time", ((C0VYK) ((ArrayList) LIZIZ().LJ).get(size)).LIZLLL);
                } else {
                    jSONObject2.put("finish_activities", jSONArray2);
                    jSONObject.put("activity_trace", jSONObject2);
                    return;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJI(JSONObject jSONObject) {
        JSONArray jSONArray = new JSONArray();
        try {
            for (C0VYF c0vyf : new ArrayList(LIZIZ().LJII)) {
                long j = c0vyf.LIZIZ;
                C0VYK c0vyk = c0vyf.LIZ;
                jSONArray.put(C0VYF.LIZ(c0vyk.LIZIZ, c0vyf.LIZJ, j, c0vyk.LIZ));
            }
            C0VYL.LIZ("activity_track", jSONArray, jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca A[Catch: all -> 0x00e5, TryCatch #3 {all -> 0x00e5, blocks: (B:39:0x00bd, B:41:0x00ca, B:43:0x00d9, B:44:0x00e1), top: B:58:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(org.json.JSONObject r9, java.io.File r10) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0VYH.LJ(org.json.JSONObject, java.io.File):void");
    }

    public final void LJII(int i, Activity activity) {
        C0VYF c0vyf;
        final String str;
        long j;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iHashCode = activity.hashCode();
        C0VYK c0vyk = (C0VYK) ((HashMap) this.LIZLLL).get(Integer.valueOf(iHashCode));
        String name = null;
        if (c0vyk == null) {
            if (i == 0) {
                j = jCurrentTimeMillis;
            } else {
                j = 0;
            }
            if (this.LJIIIZ != null) {
                name = C0VYO.LIZ(activity);
            }
            if (TextUtils.isEmpty(name)) {
                name = activity.getClass().getName();
            }
            c0vyk = new C0VYK(name, j, iHashCode);
            ((HashMap) this.LIZLLL).put(Integer.valueOf(iHashCode), c0vyk);
        }
        c0vyk.LIZJ = i;
        c0vyk.LIZLLL = jCurrentTimeMillis;
        if (C0VXM.LJI.LIZ) {
            final String str2 = c0vyk.LIZ;
            final long j2 = c0vyk.LJ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    str = "";
                                } else {
                                    str = "onDestroy";
                                }
                            } else {
                                str = "onStop";
                            }
                        } else {
                            str = "onPause";
                        }
                    } else {
                        str = "onResume";
                    }
                } else {
                    str = "onStart";
                }
            } else {
                str = "onCreate";
            }
            final int iHashCode2 = activity.hashCode();
            C0VXF.post(new Runnable() { // from class: X.0VXK
                public final void LIZ() {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str2);
                    sbLIZ.append('.');
                    sbLIZ.append(str);
                    sbLIZ.append('@');
                    sbLIZ.append(Long.toHexString(iHashCode2));
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    long j3 = j2;
                    try {
                        File fileLIZ = C0VXM.LIZ();
                        if (fileLIZ != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("activityLifeCycle");
                            sbLIZ2.append(' ');
                            sbLIZ2.append(strLIZIZ);
                            sbLIZ2.append(' ');
                            if (C0VXL.LIZJ == null) {
                                C0VXL.LIZJ = new SimpleDateFormat("yyyy-MM-dd@HH-mm-ss", Locale.getDefault());
                            }
                            sbLIZ2.append(C0VXL.LIZJ.format(new Date(j3)));
                            sbLIZ2.append('\n');
                            C08SE.LJIIIIZZ(fileLIZ, C2188811AlT.LIZIZ(sbLIZ2), true);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ActivityLifecycle@e30b.recordActivityLife$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ActivityLifecycle@e30b.recordActivityLife$1");
                }
            });
        }
        if (this.LJII.size() < 50 || (c0vyf = this.LJII.poll()) == null) {
            c0vyf = new C0VYF();
        }
        this.LJII.add(c0vyf);
        c0vyf.LIZ = c0vyk;
        long j3 = c0vyk.LIZLLL;
        c0vyf.LIZIZ = j3;
        c0vyf.LIZJ = c0vyk.LIZJ;
        C0VYM[] c0vymArr = this.LJFF;
        if (c0vymArr[i] == null) {
            c0vymArr[i] = new C0VYM();
        }
        C0VYM c0vym = c0vymArr[i];
        c0vym.LIZ = c0vyk;
        c0vym.LIZIZ = j3;
        if (i == 5) {
            ((HashMap) this.LIZLLL).remove(Integer.valueOf(c0vyk.LIZIZ));
            if (((ArrayList) this.LJ).size() == 20) {
                ListProtector.remove(this.LJ, 19);
            }
            ((ArrayList) this.LJ).add(c0vyk);
        }
    }
}
