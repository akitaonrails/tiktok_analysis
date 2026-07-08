package X;

import Y.ACListenerS118S0200000_15;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import tikcast.linkmic.common.MultiGuestSpotExtra;

/* JADX INFO: renamed from: X.0aOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933290aOV extends AbstractC960470b6L<C933280aOU> {
    public final View LL;
    public final InterfaceC933310aOX<C933270aOT> LLILLJJLI;
    public final View LLILLL;
    public final C1324720kZq LLILZ;
    public final View LLILZIL;
    public final LiveIconView LLILZLL;
    public final TextView LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;

    public final void L5(C933280aOU c933280aOU) {
        Integer numValueOf;
        String strLJIJI;
        Boolean boolValueOf;
        C933270aOT c933270aOT = c933280aOU.LIZ;
        MultiGuestSpotExtra multiGuestSpotExtra = c933270aOT.LIZIZ;
        ImageModel avatarThumb = null;
        if (multiGuestSpotExtra != null) {
            numValueOf = Integer.valueOf(multiGuestSpotExtra.spotRank);
        } else {
            numValueOf = null;
        }
        C500260Jjc.LJLJLJ(this.LLILLL, c933280aOU.LIZIZ);
        if (c933270aOT.LIZ.type == 0) {
            C439101nJ.LJI(this.LLJ);
        } else {
            C12ES.LJIILL(0, this.LLJ);
            TextView textView = this.LLJ;
            User user = c933270aOT.LIZJ;
            if (user != null) {
                if (user.getId() == C950220apo.LJ()) {
                    strLJIJI = C497740JfY.LJIJI(2131851241);
                } else {
                    strLJIJI = C0KVU.LIZ(c933270aOT.LIZJ);
                }
            } else if (c933270aOT.LIZ.type == 2) {
                strLJIJI = C497740JfY.LJIJI(2131854991);
            } else {
                strLJIJI = "";
            }
            textView.setText(strLJIJI);
        }
        MultiGuestSpotExtra multiGuestSpotExtra2 = c933280aOU.LIZ.LIZIZ;
        if (multiGuestSpotExtra2 != null) {
            boolValueOf = Boolean.valueOf(multiGuestSpotExtra2.isSwitchSpotEnabled);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIL(boolValueOf)) {
            C786410Ut5.h5(this.LLILZ, 1.0f);
            C786410Ut5.T4(this.LLILZIL, 1.0f);
            C786410Ut5.i5(this.LLILZLL, 1.0f);
            C786410Ut5.S4(1.0f, this.LLIZ);
        } else {
            C786410Ut5.h5(this.LLILZ, 0.5f);
            C786410Ut5.T4(this.LLILZIL, 0.5f);
            C786410Ut5.i5(this.LLILZLL, 0.5f);
            C786410Ut5.S4(0.5f, this.LLIZ);
        }
        if (c933280aOU.LIZIZ) {
            C12ES.LJIILL(0, this.LLILLL);
        } else {
            C12ES.LJIILL(4, this.LLILLL);
        }
        int i = c933270aOT.LIZ.type;
        if (i != 0) {
            if (i != 2) {
                C12ES.LJIILL(0, this.LLILZ);
                C500260Jjc.LJLJLJ(this.LLILZIL, false);
                C500260Jjc.LJLJLJ(this.LLILZLL, false);
                C439101nJ.LJI(this.LLIZ);
                if (numValueOf != null) {
                    C12ES.LJIILL(0, this.LLIZLLLIL);
                    this.LLIZLLLIL.setText(numValueOf.toString());
                } else {
                    C439101nJ.LJI(this.LLIZLLLIL);
                }
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                User user2 = c933270aOT.LIZJ;
                if (user2 != null) {
                    avatarThumb = user2.getAvatarThumb();
                }
                C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(avatarThumb);
                c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
                int width = this.LLILZ.getWidth();
                int height = this.LLILZ.getHeight();
                c1324610kZfLJIIIZ.LJ = width;
                c1324610kZfLJIIIZ.LJFF = height;
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                c1324610kZfLJIIIZ.LJJI(this.LLILZ);
            } else {
                C439101nJ.LJI(this.LLILZ);
                C500260Jjc.LJLJLJ(this.LLILZIL, true);
                C500260Jjc.LJLJLJ(this.LLILZLL, true);
                C439101nJ.LJI(this.LLIZ);
                if (numValueOf != null) {
                    C12ES.LJIILL(0, this.LLIZLLLIL);
                    this.LLIZLLLIL.setText(numValueOf.toString());
                } else {
                    C439101nJ.LJI(this.LLIZLLLIL);
                }
                this.LLILZLL.setIconAttr(R.attr.ctk);
                this.LLILZLL.setIconTintAttr(R.attr.c5n);
            }
        } else {
            C439101nJ.LJI(this.LLILZ);
            C500260Jjc.LJLJLJ(this.LLILZIL, true);
            C500260Jjc.LJLJLJ(this.LLILZLL, true);
            if (numValueOf != null && numValueOf.intValue() > 0) {
                C12ES.LJIILL(0, this.LLIZ);
                this.LLIZ.setText(numValueOf.toString());
            } else {
                C439101nJ.LJI(this.LLIZ);
            }
            C439101nJ.LJI(this.LLIZLLLIL);
            this.LLIZ.setText(String.valueOf(numValueOf));
            this.LLILZLL.setIcon(R.drawable.eya);
            this.LLILZLL.LJ();
        }
        C786410Ut5.I7(new ACListenerS118S0200000_15(this, c933280aOU, 34), this.LL);
    }

    public C933290aOV(View view, InterfaceC933310aOX interfaceC933310aOX) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC933310aOX;
        this.LLILLL = view.findViewById(R.id.wv5);
        this.LLILZ = (C1324720kZq) view.findViewById(R.id.wus);
        this.LLILZIL = view.findViewById(R.id.wv0);
        this.LLILZLL = (LiveIconView) view.findViewById(R.id.wuz);
        this.LLIZ = (TextView) view.findViewById(R.id.wv1);
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.wv2);
        this.LLJ = (TextView) view.findViewById(R.id.wv4);
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((C933280aOU) obj);
    }
}
