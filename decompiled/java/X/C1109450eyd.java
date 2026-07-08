package X;

import Y.ACListenerS152S0100000_17;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109450eyd implements InterfaceC1109090ey3 {
    @Override // X.InterfaceC1109090ey3
    public final void LIZ() {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZIZ(C1109430eyb c1109430eyb) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZJ(C1109030exx c1109030exx) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJI(InterfaceC1109350eyT interfaceC1109350eyT) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJII(AbstractC1109730ez5 abstractC1109730ez5) {
    }

    @Override // X.InterfaceC1109090ey3
    public final void LIZLLL(InterfaceC1109320eyQ interfaceC1109320eyQ) {
        interfaceC1109320eyQ.LIZIZ(C1109490eyh.class, new InterfaceC1109180eyC<C1109490eyh>() { // from class: X.0eyf
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new AbstractC1110800f0o<C1109490eyh>((C1109490eyh) abstractC1136060ffY) { // from class: X.0eyg
                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return null;
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
        abstractC1111600f26.LLLILZ(C1109480eyg.class, new AbstractC1111810f2R<C1109480eyg, C1110740f0i>() { // from class: X.0f0h
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gry;
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(final View view) {
                return new AbstractC1110760f0k<C1109480eyg>(view) { // from class: X.0f0i
                    @Override // X.AbstractC1111020f1A
                    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
                        C1109480eyg c1109480eyg = (C1109480eyg) interfaceC1112060f2q;
                        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.kb6);
                        if (imageView != null) {
                            c1109480eyg.LJIL.getClass();
                            imageView.setImageDrawable(null);
                        }
                        TextView textView = (TextView) this.itemView.findViewById(R.id.eu1);
                        if (textView != null) {
                            c1109480eyg.LJIL.getClass();
                            textView.setText((CharSequence) null);
                        }
                        TextView textView2 = (TextView) this.itemView.findViewById(R.id.d6g);
                        if (textView2 != null) {
                            c1109480eyg.LJIL.getClass();
                            textView2.setText((CharSequence) null);
                        }
                        C16F5 c16f5 = (C16F5) this.itemView.findViewById(R.id.d6g);
                        if (c16f5 != null) {
                            C786410Ut5.l8(c16f5, new ACListenerS152S0100000_17(c1109480eyg, 191));
                        }
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
        interfaceC1109340eyS.LIZLLL(C001A.STREAM_GOAL_ACHIEVE_MESSAGE.getIntType());
    }
}
