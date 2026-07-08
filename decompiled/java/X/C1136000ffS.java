package X;

import Y.ACListenerS120S0200000_17;
import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ffS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136000ffS extends AbstractC1132750faD implements InterfaceC1138050fil {
    public ImageView LJFF;
    public C16F5 LJI;
    public ImageView LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;
    public final C1136930fgx LJIIJ;

    @Override // X.InterfaceC1137250fhT
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIIIZZ(C1135810ff9 c1135810ff9) {
    }

    @Override // X.InterfaceC1137250fhT
    public final void dispose() {
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJII() {
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, null);
        }
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.I7(null, view);
        }
    }

    @Override // X.InterfaceC1138050fil
    public final View LJFF() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC1137250fhT
    public final InterfaceC1137400fhi LJIILLIIL() {
        return this.LJIIJ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0fgx] */
    public C1136000ffS(FrameLayout frameLayout) {
        super(frameLayout);
        this.LJIIJ = new InterfaceC1137400fhi() { // from class: X.0fgx
            @Override // X.InterfaceC1137400fhi
            public final void LIZ() {
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZJ(boolean z, C1136900fgu c1136900fgu) {
            }

            @Override // X.InterfaceC1137400fhi
            public final void LIZLLL(boolean z) {
            }

            @Override // X.InterfaceC1137400fhi
            public final void LJ(boolean z, boolean z2, boolean z3) {
            }
        };
    }

    @Override // X.InterfaceC1137250fhT
    public final void LIZJ(Context context) {
        View view = this.LJIIIZ;
        if (view != null) {
            C786410Ut5.I7(new ACListenerS152S0100000_17(this, 6), view);
        }
        C16F5 c16f5 = this.LJI;
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS120S0200000_17(context, this, 3));
        }
    }

    @Override // X.InterfaceC1137250fhT
    public final void LJIIJJI(DataChannel dataChannel, EnumC1136790fgj enumC1136790fgj) {
        this.LIZLLL = dataChannel;
        this.LIZJ = enumC1136790fgj;
        this.LJFF = (ImageView) this.LIZ.findViewById(R.id.user_avatar_iv_new);
        C16F5 c16f5 = (C16F5) this.LIZ.findViewById(R.id.uq6);
        this.LJI = c16f5;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, c16f5.getContext()));
        }
        this.LJII = (ImageView) this.LIZ.findViewById(R.id.user_avatar_board_iv);
        this.LJIIIIZZ = this.LIZ.findViewById(R.id.bts);
        this.LJIIIZ = this.LIZ.findViewById(R.id.bi2);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a0  */
    @Override // X.InterfaceC1137250fhT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C1135810ff9 r10, final X.EnumC1137240fhS r11, final int r12) {
        /*
            Method dump skipped, instruction units count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1136000ffS.LJ(X.0ff9, X.0fhS, int):void");
    }
}
