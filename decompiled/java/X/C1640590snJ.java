package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0snJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640590snJ {
    public static final C1640590snJ LIZ = new C1640590snJ();
    public static final List<Pair<FrameLayout, C1662850tND>> LIZIZ = new ArrayList();

    public static Pair LIZ(Activity activity) {
        Context context;
        ArrayList arrayList = (ArrayList) LIZIZ;
        if (!(!arrayList.isEmpty())) {
            return null;
        }
        Pair pair = (Pair) C13LP.LJJJJZI(arrayList);
        View view = (View) pair.getSecond();
        if (view == null || (context = view.getContext()) == null) {
            context = null;
        } else {
            while (context instanceof ContextWrapper) {
                if (context instanceof Activity) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            context = null;
        }
        if (!Intrinsics.LJFF(context, activity)) {
            return null;
        }
        C19719612Di.LJJIIZ(LIZIZ);
        return new Pair(pair.getFirst(), pair.getSecond());
    }

    public static Pair LIZIZ(Context context) {
        if (C300240Bpm.LIZ()) {
            return new Pair(Integer.valueOf((int) C11VU.LIZIZ(C1640600snK.LIZ, context)), Integer.valueOf((int) C11VU.LIZIZ(C1640600snK.LIZ, context)));
        }
        if (new C1640840sni(null).LIZIZ) {
            return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86))));
        }
        return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(93))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(93))));
    }

    public static Pair LIZJ(Context context, boolean z) {
        if (C1641230soL.LIZIZ() && !z) {
            if (C1641230soL.LIZJ()) {
                return C1640600snK.LIZJ(context);
            }
            return C1640600snK.LIZIZ(context);
        }
        if (C300240Bpm.LIZ()) {
            return C1640600snK.LJI(context);
        }
        if (new C1640840sni(null).LIZIZ) {
            return C1640600snK.LJFF(context);
        }
        return C1640600snK.LJ(context);
    }
}
