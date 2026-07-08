package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.als.h0;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sxJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646790sxJ {
    /* JADX WARN: Removed duplicated region for block: B:65:0x046f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C539960LFq r39, X.C1DRG r40, X.C19A3 r41) {
        /*
            Method dump skipped, instruction units count: 6661
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1646790sxJ.LIZ(X.0LFq, X.1DRG, X.19A3):void");
    }

    public static final Pair<EnumC1642750sqn, C385670FAf<Boolean>> LIZIZ(C1DRG c1drg) {
        h0 h0VarLIZLLL = ((C1453870nw9) c1drg.LJII(C1453870nw9.class, null)).LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END);
        if (Intrinsics.LJFF(h0VarLIZLLL.LIZJ(), Boolean.TRUE)) {
            return new Pair<>(EnumC1642750sqn.IMMEDIATE, null);
        }
        return new Pair<>(C1646800sxK.LIZ(EnumC1642750sqn.LAZY), h0VarLIZLLL);
    }

    public static final Pair<EnumC1642750sqn, C385670FAf<Boolean>> LIZJ(C1DRG c1drg) {
        if (((Boolean) C0BNR.LIZ.getValue()).booleanValue()) {
            return new Pair<>(EnumC1642750sqn.LAZY, ((C1453870nw9) c1drg.LJII(C1453870nw9.class, null)).LIZLLL(EnumC1641390sob.ACTIVITY_ENTER_ANIMATION_END));
        }
        return new Pair<>(EnumC1642750sqn.IMMEDIATE, null);
    }

    public static final int LIZLLL(ViewGroup viewGroup) {
        int iGenerateViewId = View.generateViewId();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        C786410Ut5.a6(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setId(iGenerateViewId);
        viewGroup.addView(frameLayout);
        return iGenerateViewId;
    }
}
