package X;

import Y.ACListenerS117S0200000_14;
import Y.ACListenerS149S0100000_14;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z7M, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z7M extends RecyclerView.ViewHolder implements C0Z37<C1261860iwS>, C0Z9B, InterfaceC1508640pMU {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public final C01GW LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final C1908730zln LLILZ;
    public final TuxTextView LLILZIL;
    public final ImageView LLILZLL;
    public final FrameLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public AnimatorSet LLJILLL;
    public AnimatorSet LLJJ;
    public Fragment LLJJI;
    public C0Z3J LLJJIII;
    public C0HZQ LLJJIJI;
    public C1261860iwS LLJJIJIIJIL;

    @Override // X.C0Z9B
    public final void C1(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final List<Animator> D5(boolean z) {
        return null;
    }

    @Override // X.C0Z9B
    public final void LJLL(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
    }

    @Override // X.C0Z9B
    public final void LLLLZI(float f) {
    }

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "MafChatListViewHolder";
    }

    @Override // X.C0Z9B
    public final C0HZQ b() {
        return null;
    }

    public static Pair I5() {
        return new Pair(41, new Pair(51, Integer.valueOf(R.attr.nb)));
    }

    @Override // X.C0Z9B
    public final List<View> LLLLJI() {
        return (List) this.LLJIJIL.getValue();
    }

    @Override // X.C0Z9B
    public final List<View> M() {
        return (List) this.LLJILJIL.getValue();
    }

    @Override // X.C0Z9B
    public final C0Z9D g3() {
        return (C0Z9D) this.LLJILJILJ.getValue();
    }

    @Override // X.C0Z9B
    public final AnimatorSet l0() {
        return this.LLJILLL;
    }

    @Override // X.C0Z9B
    public final AnimatorSet v3() {
        return this.LLJJ;
    }

    public C0Z7M(View view) {
        super(view);
        this.LL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 258));
        this.LLIZLLLIL = C452501pT.LIZIZ(new AwS558S0100000_14(view, 263));
        this.LLJ = C452501pT.LIZIZ(new AwS558S0100000_14(view, 264));
        this.LLJI = C452501pT.LIZIZ(new AwS558S0100000_14(view, 260));
        this.LLJIJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 259));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 262));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 261));
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.user_name);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.zf0);
        this.LLILZ = (C1908730zln) view.findViewById(R.id.p0c);
        try {
            TuxTextView tuxTextView = null;
            ImageView imageView = null;
            if (((Number) C278900AwS.LIZ.getValue()).intValue() == 1) {
                ImageView imageView2 = (ImageView) view.findViewById(R.id.nvc);
                if (imageView2 != null) {
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = Integer.valueOf(R.attr.bs);
                    c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(42));
                    c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(21));
                    imageView2.setBackground(c384050F3z.LIZ(view.getContext()));
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_bitmap_sticker_hi;
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(26));
                    imageView2.setImageDrawable(c419910GdJ.LIZ(imageView2.getContext()));
                    C384050F3z c384050F3z2 = new C384050F3z();
                    c384050F3z2.LIZIZ = Integer.valueOf(R.attr.bs);
                    c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(21));
                    imageView2.setBackground(c384050F3z2.LIZ(imageView2.getContext()));
                    imageView = imageView2;
                }
                this.LLILZLL = imageView;
            } else {
                TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.u09);
                if (tuxTextView2 != null) {
                    tuxTextView2.setText("👋");
                    C384050F3z c384050F3z3 = new C384050F3z();
                    c384050F3z3.LIZIZ = Integer.valueOf(R.attr.bs);
                    c384050F3z3.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(21));
                    tuxTextView2.setBackground(c384050F3z3.LIZ(view.getContext()));
                    tuxTextView = tuxTextView2;
                }
                this.LLILZIL = tuxTextView;
            }
            View viewFindViewById = view.findViewById(R.id.u0_);
            C786410Ut5.LJZ(0, (FrameLayout) viewFindViewById);
            this.LLIZ = (FrameLayout) viewFindViewById;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0Z9B, X.InterfaceC892580Yzw
    public final void LJLJI(InterfaceC887660Ys0<?> interfaceC887660Ys0) {
        C0Z9A.LIZJ(this, interfaceC887660Ys0);
    }

    @Override // X.C0Z9B
    public final void LLIIII(AnimatorSet animatorSet) {
        this.LLJILLL = animatorSet;
    }

    @Override // X.C0Z9B
    public final void LLILII(AnimatorSet animatorSet) {
        this.LLJJ = animatorSet;
    }

    public final void L5(String str, String str2) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", "notification_page"), new Pair("enter_method", "guide_dm"), new Pair("is_recommended_chat", "1"));
        if (Intrinsics.LJFF(str2, "show")) {
            C1336205Ku.LIZ(false).getImSayhiAnalytics().LIZIZ(str, mapLJIIJ, C0SY5.LIZIZ(this.itemView.getContext()), false);
        } else {
            if (!Intrinsics.LJFF(str2, "click")) {
                return;
            }
            C1336205Ku.LIZ(false).getImSayhiAnalytics().LIZJ(str, mapLJIIJ);
        }
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        String remarkName;
        C1261860iwS c1261860iwS = (C1261860iwS) interfaceC1891350zJl;
        this.LLJJIJIIJIL = c1261860iwS;
        if (C1336205Ku.LIZ(false).getLightInteractService().LIZ(c1261860iwS.getUid())) {
            if (((Number) C278900AwS.LIZ.getValue()).intValue() == 1) {
                TuxTextView tuxTextView = this.LLILZIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                ImageView imageView = this.LLILZLL;
                if (imageView != null) {
                    C786410Ut5.LJZI(0, imageView);
                }
            } else {
                TuxTextView tuxTextView2 = this.LLILZIL;
                if (tuxTextView2 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView2, 0);
                }
                ImageView imageView2 = this.LLILZLL;
                if (imageView2 != null) {
                    C786410Ut5.LJZI(8, imageView2);
                }
            }
        } else {
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                C786410Ut5.LLLLZLL(tuxTextView3, 8);
            }
            ImageView imageView3 = this.LLILZLL;
            if (imageView3 != null) {
                C786410Ut5.LJZI(8, imageView3);
            }
            FrameLayout frameLayout = this.LLIZ;
            if (frameLayout != null) {
                C337180DJs.LIZ(frameLayout);
            }
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(c1261860iwS.getAvatarThumb()));
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJJIIZI(c419910GdJ.LIZ(this.itemView.getContext()));
        C419910GdJ c419910GdJ2 = new C419910GdJ();
        c419910GdJ2.LIZ = R.raw.icon_color_default_avatar;
        c1331670kl3LJIIIIZZ.LJIL(c419910GdJ2.LIZ(this.itemView.getContext()));
        c1331670kl3LJIIIIZZ.LJJ((SmartImageView) this.LL.getValue());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        if (TextUtils.isEmpty(c1261860iwS.getRemarkName())) {
            remarkName = c1261860iwS.getNickname();
        } else {
            remarkName = c1261860iwS.getRemarkName();
        }
        TuxTextView tuxTextView4 = this.LLILLJJLI;
        Integer num = (Integer) I5().getFirst();
        if (num != null) {
            tuxTextView4.setTuxFont(num.intValue());
        }
        tuxTextView4.setText(remarkName);
        TuxTextView tuxTextView5 = this.LLILLL;
        Pair pair = (Pair) I5().getSecond();
        if (pair != null) {
            tuxTextView5.setTuxFont(((Number) pair.getFirst()).intValue());
            tuxTextView5.setTextColorRes(((Number) pair.getSecond()).intValue());
        }
        tuxTextView5.setText(this.itemView.getContext().getString(2131835785, remarkName));
        C1908730zln c1908730zln = this.LLILZ;
        C0SWE c0swe = new C0SWE(c1261860iwS);
        c0swe.LIZIZ = EnumC1357230lQH.NORMAL;
        c0swe.LJ = true;
        c1908730zln.LLLLZIL(c0swe.LIZ());
        this.LLILZ.setTracker(AFwS207S0000000_19.get$arr$(7));
        this.LLILZ.setFollowClickInterceptor(new C0Z3I(this, c1261860iwS, null));
        AwS380S0200000_14 awS380S0200000_14 = new AwS380S0200000_14(this, c1261860iwS, 12);
        TuxTextView tuxTextView6 = this.LLILZIL;
        if (tuxTextView6 != null) {
            C786410Ut5.h9(tuxTextView6, new ACListenerS149S0100000_14(awS380S0200000_14, 16));
        }
        FrameLayout frameLayout2 = this.LLIZ;
        if (frameLayout2 != null) {
            C786410Ut5.O7(frameLayout2, new ACListenerS149S0100000_14(awS380S0200000_14, 16));
        }
        C786410Ut5.I7(new ACListenerS117S0200000_14(this, c1261860iwS, 5), this.itemView);
        C1390850mIV c1390850mIV = new C1390850mIV();
        c1390850mIV.LIZ.LLJJIJI = this.itemView.getContext().getString(2131830943, remarkName);
        C1247530iZL c1247530iZL = new C1247530iZL();
        c1247530iZL.LIZJ(R.raw.icon_trash_bin);
        c1247530iZL.LIZIZ(2131835695);
        c1247530iZL.LIZJ = 1;
        c1247530iZL.LIZ(new AwS380S0200000_14(this, c1261860iwS, 16));
        c1390850mIV.LIZ(c1247530iZL);
        C2213981Bky c2213981Bky = C2213981Bky.LIZIZ;
        if (c2213981Bky.isOffline() || c2213981Bky.isRegressionTest()) {
            C1247530iZL c1247530iZL2 = new C1247530iZL();
            c1247530iZL2.LIZJ(R.raw.icon_3pt_paperplane);
            c1247530iZL2.LIZIZ(2131835688);
            c1247530iZL2.LIZJ = 1;
            c1247530iZL2.LIZ(new AwS380S0200000_14(this, c1261860iwS, 17));
            c1390850mIV.LIZ(c1247530iZL2);
        }
        this.itemView.setOnLongClickListener(new ViewOnLongClickListenerC913830Zt7(this, c1390850mIV.LIZJ(), 0));
    }
}
