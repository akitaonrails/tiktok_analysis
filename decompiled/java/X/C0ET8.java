package X;

import Y.AAListenerS316S0100000_5;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0ET8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0ET8 extends AbstractC364960ESo<C360020E9o, Unit> {
    public C364040EPa LLJJLIIIJLLLLLLLZ;
    public C1426800nEU LLJL;
    public final C01GW LLJLIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 512));
    public final C0EZ4 LLJLILLLLZIIL = new C0EZ4(AFwS191S0000000_5.get$arr$(149), null, AFwS191S0000000_5.get$arr$(150), AFwS191S0000000_5.get$arr$(151), 2);

    @Override // X.AbstractC364960ESo
    public final int LLLLIILL() {
        return R.layout.c2x;
    }

    @Override // X.AbstractC364960ESo
    public final Function1<C539960LFq, Unit> LLLLIL() {
        return new AwS584S0100000_5(this, 415);
    }

    @Override // X.AbstractC364960ESo
    public final Function1<C1DRF, Unit> LLLLILI() {
        return new AwS584S0100000_5(this, 416);
    }

    @Override // X.AbstractC364960ESo
    public final C0EZ4 LLLLJ() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.AbstractC364960ESo
    public final C0ESS LLLLJI() {
        return C0ESS.DEFAULT;
    }

    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C0ETQ c0etq = (C0ETQ) this.LLJLIL.getValue();
        if (c0etq != null) {
            c0etq.fx1(new AwS549S0100000_5(this, 513));
        }
        LLLLL().LJIILLIIL(new AAListenerS316S0100000_5(this, 4));
        LLLLL().LJIILL(new AAListenerS316S0100000_5(this, 5));
    }

    @Override // X.AbstractC364960ESo, com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C426750GoL.LJIIIZ(view.findViewById(R.id.ud_), null, null, null, Integer.valueOf(C1257310ip7.LIZ(view)), false, 23);
        view.setOnTouchListener(new View.OnTouchListener() { // from class: X.0ET9
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
    }
}
