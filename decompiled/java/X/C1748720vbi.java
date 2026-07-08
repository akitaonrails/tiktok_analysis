package X;

import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.slark.api.data.LaneParams;
import com.ss.android.ugc.aweme.ecommerce.slark.impl.TrackNodeStore;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS28S1400000_26;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vbi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1748720vbi {
    public static final void LIZIZ(InterfaceC1748810vbr interfaceC1748810vbr, AbstractC1748750vbl abstractC1748750vbl, Function1<? super LaneParams, Unit> function1) {
        abstractC1748750vbl.LJI = interfaceC1748810vbr;
        abstractC1748750vbl.LJIIIIZZ = null;
        abstractC1748750vbl.LJIIIZ = null;
        AbstractC1748750vbl.LIZLLL(abstractC1748750vbl);
        abstractC1748750vbl.LJIIIIZZ(function1);
        abstractC1748750vbl.LIZJ(false);
    }

    public static final void LIZJ(String str, C04CK c04ck, Function1 function1) {
        C993503uX c993503uX = TrackNodeStore.LIZ.get(str);
        if (c993503uX != null) {
            LIZIZ(c993503uX, c04ck, function1);
        }
    }

    public static final void LIZLLL(View view, AbstractC1748750vbl abstractC1748750vbl, Function1<? super LaneParams, Unit> function1) {
        abstractC1748750vbl.LJ(view, function1, null, null);
    }

    public static final void LJFF(View view, AbstractC1748750vbl abstractC1748750vbl, Function0<String> function0, Function1<? super LaneParams, Unit> function1) {
        C1421670n6D.LIZIZ(view, function0, new AwS235S0300000_26(view, (View) abstractC1748750vbl, (AbstractC1748750vbl) function1, (Function1<? super LaneParams, Unit>) 58));
    }

    public static final void LIZ(InterfaceC1748810vbr interfaceC1748810vbr, C04CK c04ck, String str, PageFinder pageFinder, Function1 function1) {
        c04ck.LJI = interfaceC1748810vbr;
        c04ck.LJIIIIZZ = str;
        c04ck.LJIIIZ = pageFinder;
        AbstractC1748750vbl.LIZLLL(c04ck);
        c04ck.LJIIIIZZ(function1);
        c04ck.LIZJ(false);
    }

    public static final void LJ(View view, C04CK c04ck, String str, PageFinder pageFinder, Function1 function1) {
        if (str != null && !a0.LJJJIL(str) && pageFinder != null) {
            c04ck.LJ(view, function1, str, pageFinder);
        } else {
            LIZLLL(view, c04ck, function1);
        }
    }

    public static final void LJI(View view, C04CK c04ck, Function0 function0, String str, PageFinder pageFinder, Function1 function1) {
        if (str != null && !a0.LJJJIL(str) && pageFinder != null) {
            C1421670n6D.LIZIZ(view, function0, new AwS28S1400000_26(view, c04ck, str, pageFinder, function1, 3));
        } else {
            LJFF(view, c04ck, function0, function1);
        }
    }
}
