package X;

import Y.ACListenerS140S0100000_5;
import Y.AgS164S0300000_5;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.scene.Scene;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Evh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380350Evh extends AbstractC1664490tPr<C377400Eqw, C1260204wS> {
    public View LLJJJIL;
    public C426320Gne LLJJJJ;
    public C426320Gne LLJJJJJIL;
    public TuxTextView LLJJJJLIIL;
    public TuxTextView LLJJL;
    public TuxTextView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public AnonymousClass0956 LLJLIL;
    public AnonymousClass0956 LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public int LLJLLL = -1;
    public final C01GW LLJZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 762));
    public boolean LLJZIJLIL;

    public final void LLLLLJIL() {
        C426320Gne c426320Gne = this.LLJJJJ;
        if (c426320Gne != null) {
            C786410Ut5.LLLZZ(c426320Gne, 0);
        }
        TuxTextView tuxTextView = this.LLJJJJLIIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 4);
        }
    }

    public final void LLLLLLL() {
        TuxTextView tuxTextView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView2 != null) {
            C786410Ut5.Vc(tuxTextView2, 0.0f);
        }
        TuxTextView tuxTextView3 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxTextView3 != null) {
            C786410Ut5.LLLLZLL(tuxTextView3, 8);
        }
    }

    public final Object LLLLLJLJLL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Pair pair;
        View view;
        Scene scene = this.mParentScene;
        if (scene != null && (view = scene.mView) != null) {
            pair = new Pair(Integer.valueOf(view.getWidth() / 2), Integer.valueOf(view.getHeight() / 2));
        } else {
            pair = new Pair(0, 0);
        }
        Object objCollect = C380400Evm.LIZIZ(true).collect(new AgS164S0300000_5(pair, new Pair(C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(16)))), C2286608xc.LJ(LLLLILI().LIZ.LIZIZ)), this, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLLIL(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380350Evh.LLLLLLIL(X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AbstractC1664490tPr.LLLLLIL(this, new AwS584S0100000_5(this, 691));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C380340Evg(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C380320Eve(this, null), 3);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C380330Evf(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLL(boolean r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380350Evh.LLLLLL(boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.LLJJJIL = view;
        this.LLJJJJ = (C426320Gne) view.findViewById(R.id.s91);
        this.LLJJJJJIL = (C426320Gne) view.findViewById(R.id.s8p);
        this.LLJJJJLIIL = (TuxTextView) view.findViewById(R.id.xe6);
        this.LLJJL = (TuxTextView) view.findViewById(R.id.rnw);
        this.LLJJLIIIJLLLLLLLZ = (TuxTextView) view.findViewById(R.id.xeh);
        this.LLJL = (TuxIconView) view.findViewById(R.id.xe7);
        View view2 = this.LLJJJIL;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS140S0100000_5(this, 80), view2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLLLLLJ(com.bytedance.tux.input.TuxTextView r14, boolean r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380350Evh.LLLLLLJ(com.bytedance.tux.input.TuxTextView, boolean, X.05Vn):java.lang.Object");
    }

    @Override // com.bytedance.scene.group.UserVisibleHintGroupScene, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.byd, viewGroup, false);
    }
}
