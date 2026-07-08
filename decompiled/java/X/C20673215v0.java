package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.nita.memory.MemoryManager;

/* JADX INFO: renamed from: X.15v0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20673215v0 {
    public static C21265018Js LIZ;

    public static void LJIIIIZZ(int i) {
        C21264218Jk c21264218JkLIZ = C710340Rtg.LIZ(i);
        if (c21264218JkLIZ == null) {
            return;
        }
        MemoryManager memoryManager = MemoryManager.LLJIJIL;
        String str = c21264218JkLIZ.LL;
        memoryManager.getClass();
        MemoryManager.LJIJ(i, str);
    }

    public static void LJIIIZ(String str) {
        C21264218Jk c21264218JkLIZIZ = C710340Rtg.LIZIZ(str);
        if (c21264218JkLIZIZ == null) {
            return;
        }
        MemoryManager memoryManager = MemoryManager.LLJIJIL;
        String str2 = c21264218JkLIZIZ.LL;
        int i = c21264218JkLIZIZ.LLILLJJLI[0];
        memoryManager.getClass();
        MemoryManager.LJIJ(i, str2);
    }

    public static boolean LIZ(int i, Context context) {
        C21264218Jk c21264218JkLIZ = C710340Rtg.LIZ(i);
        if (c21264218JkLIZ == null) {
            return false;
        }
        return C21263918Jh.LIZLLL(context, i, c21264218JkLIZ.LL);
    }

    public static boolean LIZIZ(Context context, String str) {
        C21264218Jk c21264218JkLIZIZ = C710340Rtg.LIZIZ(str);
        if (c21264218JkLIZIZ == null) {
            return false;
        }
        return C21263918Jh.LIZLLL(context, c21264218JkLIZIZ.LLILLJJLI[0], c21264218JkLIZIZ.LL);
    }

    public static View LIZJ(int i, Activity activity) {
        return LIZLLL(i, activity, new FrameLayout(activity), false);
    }

    public static View LJ(int i, Context context) {
        return LJFF(context, context, i, new FrameLayout(context), false);
    }

    public static void LJI(int i, Context context) {
        C21264218Jk c21264218JkLIZ;
        C21265018Js c21265018Js = LIZ;
        if (c21265018Js == null || !c21265018Js.LJI || (c21264218JkLIZ = C710340Rtg.LIZ(i)) == null) {
            return;
        }
        C21263918Jh.LJFF(context, c21264218JkLIZ.LLIZ, c21264218JkLIZ.LL);
    }

    public static void LJII(Context context, String str) {
        C21265018Js c21265018Js = LIZ;
        if (c21265018Js == null || !c21265018Js.LJI || C710340Rtg.LIZIZ(str) == null) {
            return;
        }
        C21264218Jk c21264218JkLIZIZ = C710340Rtg.LIZIZ(str);
        c21264218JkLIZIZ.getClass();
        C21263918Jh.LJFF(context, c21264218JkLIZIZ.LLIZ, c21264218JkLIZIZ.LL);
    }

    public static View LIZLLL(int i, Activity activity, ViewGroup viewGroup, boolean z) {
        C21264218Jk c21264218JkLIZ = C710340Rtg.LIZ(i);
        if (LIZ != null && c21264218JkLIZ != null) {
            C21264218Jk c21264218JkLIZ2 = C710340Rtg.LIZ(i);
            c21264218JkLIZ2.getClass();
            View view = (View) C21263318Jb.LIZ(c21264218JkLIZ2.LL, i, activity);
            if (viewGroup != null && z) {
                viewGroup.addView(view, view.getLayoutParams());
                return viewGroup;
            }
            return view;
        }
        return C20742916Ex.LIZ(activity, i, viewGroup, z, -1);
    }

    public static View LJFF(Context context, Context context2, int i, ViewGroup viewGroup, boolean z) {
        C21264218Jk c21264218JkLIZ = C710340Rtg.LIZ(i);
        if (LIZ != null && c21264218JkLIZ != null) {
            C21264218Jk c21264218JkLIZ2 = C710340Rtg.LIZ(i);
            c21264218JkLIZ2.getClass();
            View view = (View) C21263318Jb.LIZ(c21264218JkLIZ2.LL, i, context);
            if (viewGroup != null && z) {
                viewGroup.addView(view, view.getLayoutParams());
                return viewGroup;
            }
            return view;
        }
        return C20742916Ex.LIZ(context2, i, viewGroup, z, -1);
    }
}
