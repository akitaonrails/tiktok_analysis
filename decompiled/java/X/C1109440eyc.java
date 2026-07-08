package X;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eyc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1109440eyc implements InterfaceC1109090ey3 {
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
        interfaceC1109320eyQ.LIZIZ(C087700Up.class, new InterfaceC1109180eyC<C087700Up>() { // from class: X.00iM
            @Override // X.InterfaceC1109180eyC
            public final InterfaceC1112060f2q Oo(AbstractC1136060ffY abstractC1136060ffY) {
                return new AbstractC1110800f0o<C087700Up>((C087700Up) abstractC1136060ffY) { // from class: X.00iC
                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final int LIZLLL() {
                        return ((C087700Up) this.LJIL).LLILLL;
                    }

                    @Override // X.AbstractC1110790f0n
                    public final CharSequence LLFF() {
                        return ((C087700Up) this.LJIL).LLILLJJLI;
                    }

                    @Override // X.AbstractC1110790f0n, X.InterfaceC1113750f5Z
                    public final ImageModel LJLLLLLL() {
                        User user = LLIIIILZ().LJIIIIZZ;
                        if (user != null) {
                            return user.getAvatarThumb();
                        }
                        return null;
                    }

                    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
                    public final User getUser() {
                        return LLIIIILZ().LJIIIIZZ;
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJ(AbstractC1111600f26 abstractC1111600f26) {
        abstractC1111600f26.LLLILZ(C152600iC.class, new AbstractC1111810f2R<C152600iC, C432601mG>() { // from class: X.0f0g
            @Override // X.AbstractC1111810f2R
            public final int LJIIIIZZ() {
                return R.layout.gq1;
            }

            @Override // X.AbstractC1111810f2R
            public final AbstractC1111020f1A LJIILJJIL(View view) {
                return new AbstractC1110760f0k<C152600iC>(view) { // from class: X.01mG
                    public final TextView LLILZ;
                    public final TextView LLILZIL;
                    public final C1324720kZq LLILZLL;

                    {
                        super(view);
                        this.LLILZ = (TextView) view.findViewById(R.id.a2t);
                        this.LLILZIL = (TextView) view.findViewById(R.id.cmn);
                        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.jxe);
                    }

                    @Override // X.AbstractC1111020f1A
                    public final void L5(C1109770ez9 c1109770ez9, InterfaceC1112060f2q interfaceC1112060f2q) {
                        C152600iC c152600iC = (C152600iC) interfaceC1112060f2q;
                        TextView textView = this.LLILZ;
                        if (textView != null) {
                            textView.setText(c152600iC.getContent());
                        }
                        C1324720kZq c1324720kZq = this.LLILZLL;
                        if (c1324720kZq != null) {
                            c1324720kZq.setActualImageResource(c152600iC.LIZLLL());
                        }
                        TextView textView2 = this.LLILZIL;
                        if (textView2 != null) {
                            textView2.setText(((C087700Up) c152600iC.LJIL).LLILZ);
                            C786410Ut5.T7(textView2, new ViewOnClickListenerC511801z2(c1109770ez9, c152600iC, 8));
                        }
                    }
                };
            }
        });
    }

    @Override // X.InterfaceC1109090ey3
    public final void LJFF(InterfaceC1109340eyS interfaceC1109340eyS) {
        if (interfaceC1109340eyS.LIZ()) {
            return;
        }
        interfaceC1109340eyS.LIZLLL(C001A.LOCAL_ACTION_MESSAGE.getIntType());
    }
}
