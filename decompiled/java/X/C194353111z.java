package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.scene.Scene;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.111z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194353111z {
    public static long LIZIZ;
    public static long LIZLLL;
    public static long LJFF;
    public static long LJI;
    public static final C194353111z LIZ = new C194353111z();
    public static final BPEAHandler LIZJ = new BPEAHandler(Looper.getMainLooper());
    public static final List<Integer> LJ = new ArrayList();
    public static final List<Integer> LJII = new ArrayList();

    public static void LJFF(int i, C0MVY c0mvy, long j, String str) {
        C0LAB c0lab = new C0LAB();
        EnumC19387710t9 enumC19387710t9 = EnumC19387710t9.TOAST;
        c0lab.LIZ(enumC19387710t9.getValue(), "type");
        c0lab.LIZ(i, Scene.SCENE_SERVICE);
        c0lab.LIZ(c0mvy.getValue(), "action");
        c0lab.LIZIZ(j, "duration_time");
        if (str != null) {
            c0lab.LJ("msg", str);
        }
        C20684815ws.LJIILLIIL("tool_performance_loading", c0lab.LIZ);
        if (C0MVY.SHOW == c0mvy) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = LJI;
            if (j2 == 0) {
                ((ArrayList) LJII).add(Integer.valueOf(i));
                LJI = jCurrentTimeMillis + j;
                return;
            }
            if (jCurrentTimeMillis - j2 > 1000) {
                LJI = 0L;
                ((ArrayList) LJII).clear();
                return;
            }
            LJI = jCurrentTimeMillis + j;
            List<Integer> list = LJII;
            ((ArrayList) list).add(Integer.valueOf(i));
            C0LAB c0lab2 = new C0LAB();
            c0lab2.LIZ(enumC19387710t9.getValue(), "type");
            c0lab2.LIZ(9999, Scene.SCENE_SERVICE);
            c0lab2.LJ("msg", C13LP.LJJLIIIJ(list, "-", null, null, 0, null, null, 62));
            C20684815ws.LJIILLIIL("tool_performance_loading", c0lab2.LIZ);
        }
    }

    public final void LIZIZ(int i, C0MVY c0mvy, C0LD3 c0ld3, C0LEP c0lep) {
        LIZJ(i, c0mvy, c0ld3, c0lep, false);
    }

    public final void LIZJ(int i, C0MVY c0mvy, C0LD3 c0ld3, C0LEP c0lep, boolean z) {
        LIZ(this, i, c0mvy, c0ld3, c0lep, null, null, z, 0, 128);
    }

    public final void LJ(int i, C0MVY c0mvy, C0LD3 c0ld3, C0LEP c0lep, int i2) {
        LIZ(this, i, c0mvy, c0ld3, c0lep, null, null, false, i2, 96);
    }

    public final void LIZLLL(int i, C0MVY c0mvy, C0LD3 c0ld3, C0LEP c0lep, String str, CreativeDialogWrapper creativeDialogWrapper) {
        LIZ(this, i, c0mvy, c0ld3, c0lep, str, creativeDialogWrapper, false, 0, 192);
    }

    public static void LIZ(C194353111z c194353111z, int i, C0MVY c0mvy, C0LD3 c0ld3, C0LEP c0lep, String str, CreativeDialogWrapper creativeDialogWrapper, boolean z, int i2, int i3) {
        CreativeDialogWrapper creativeDialogWrapper2 = creativeDialogWrapper;
        String str2 = str;
        int i4 = i2;
        if ((i3 & 16) != 0) {
            str2 = null;
        }
        if ((i3 & 32) != 0) {
            creativeDialogWrapper2 = null;
        }
        if ((i3 & 64) != 0) {
            z = false;
        }
        if ((i3 & 128) != 0) {
            i4 = -1;
        }
        c194353111z.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(EnumC19387710t9.LOADING.getValue(), "type");
        c0lab.LIZ(i, Scene.SCENE_SERVICE);
        c0lab.LIZ(c0mvy.getValue(), "action");
        c0lab.LIZ(c0ld3.getValue(), "style_type");
        c0lab.LIZ(c0lep.getValue(), "close_type");
        c0lab.LJ("creation_id", C19576911iZ.LIZJ);
        C1661300tKi.LIZ.getClass();
        c0lab.LIZ(TTNetInit.getEffectiveConnectionType(), "net_level");
        if (str2 != null) {
            c0lab.LJ("msg", str2);
        }
        C0MVY c0mvy2 = C0MVY.SHOW;
        if (c0mvy2 == c0mvy) {
            LIZIZ = System.currentTimeMillis();
        }
        if (C0MVY.CLICK_CLOSE == c0mvy) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            c0lab.LIZIZ(jCurrentTimeMillis - LIZIZ, "waiting_time");
            if (i4 != -1) {
                c0lab.LIZ(i4, "real_progress");
            }
            if (creativeDialogWrapper2 != null) {
                c0lab.LIZ(creativeDialogWrapper2.LJII, "waiting_progress");
                c0lab.LIZIZ(jCurrentTimeMillis - creativeDialogWrapper2.LJIIJ, "lag_time");
                c0lab.LIZ(creativeDialogWrapper2.LJIIIIZZ, "real_progress");
                c0lab.LIZ(creativeDialogWrapper2.LJII - creativeDialogWrapper2.LJIIIIZZ, "gap_progress");
                c0lab.LIZIZ(jCurrentTimeMillis - creativeDialogWrapper2.LJIIIZ, "real_progress_time");
            }
        }
        C0MVY c0mvy3 = C0MVY.DISMISS;
        if (c0mvy3 == c0mvy) {
            c0lab.LIZIZ(System.currentTimeMillis() - LIZIZ, "cost_time");
            LIZIZ = 0L;
        }
        if (z) {
            C0CNO.LIZ(C15O7.LJI, new AwS573S0100000_29(c0lab, 880));
        } else {
            C20684815ws.LJIILLIIL("tool_performance_loading", c0lab.LIZ);
        }
        if (c0mvy == c0mvy2) {
            long j = LIZIZ;
            long j2 = LJFF;
            if (j - j2 < 2000 || j2 == 0) {
                ((ArrayList) LJ).add(Integer.valueOf(i));
                LIZLLL = System.currentTimeMillis();
            }
        }
        if (c0mvy == c0mvy3) {
            LJFF = System.currentTimeMillis();
            LIZLLL = System.currentTimeMillis();
            C786410Ut5.LJLIIL(2000L, LIZJ, new Runnable() { // from class: X.10yF
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CreativeDialogEventMonitorHelper@532d.saveOrPostBlockScene$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CreativeDialogEventMonitorHelper@532d.saveOrPostBlockScene$1");
                }

                public static void LIZ() {
                    if (System.currentTimeMillis() - C194353111z.LIZLLL < 2000) {
                        return;
                    }
                    List<Integer> list = C194353111z.LJ;
                    ArrayList arrayList = (ArrayList) list;
                    if (arrayList.size() > 1) {
                        C194353111z c194353111z2 = C194353111z.LIZ;
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(list, null, null, null, 0, null, null, 63);
                        c194353111z2.getClass();
                        C0LAB c0lab2 = new C0LAB();
                        c0lab2.LIZ(EnumC19387710t9.LOADING.getValue(), "type");
                        c0lab2.LIZ(9999, Scene.SCENE_SERVICE);
                        c0lab2.LJ("msg", strLJJLIIIJ);
                        C20684815ws.LJIILLIIL("tool_performance_loading", c0lab2.LIZ);
                    }
                    C194353111z.LJFF = 0L;
                    arrayList.clear();
                }
            });
        }
    }
}
