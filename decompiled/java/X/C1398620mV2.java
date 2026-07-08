package X;

import Y.ARunnableS52S0300000_19;
import Y.ARunnableS9S0210000_6;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0mV2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398620mV2 extends C1398630mV3 {
    public boolean LLJLLL;
    public final View LLJZ;

    @Override // X.C1398630mV3
    public final boolean d6() {
        return true;
    }

    @Override // X.AbstractC1620180sGO
    public final boolean L5() {
        if (((Boolean) C280800AzW.LIZ.getValue()).booleanValue()) {
            return false;
        }
        return super.L5();
    }

    @Override // X.C1398630mV3, X.AbstractC1261240ivS
    public final void a6() {
        Aweme aweme;
        Video video;
        UrlModel cover;
        List<String> urlList;
        String str;
        Pair pair;
        if (((Boolean) C0AN4.LIZ.getValue()).booleanValue() && C290610BaF.LIZ() && (aweme = this.LL) != null && (video = aweme.getVideo()) != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
            int[] iArrR5 = R5();
            if (iArrR5 == null) {
                pair = new Pair(-1, -1);
            } else {
                int i = iArrR5[0];
                int i2 = iArrR5[1];
                if (((Boolean) C280970Azn.LIZ.getValue()).booleanValue()) {
                    float fLIZ = C274220Aou.LIZ();
                    i = (int) (i * fLIZ);
                    i2 = (int) (i2 * fLIZ);
                }
                pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            try {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                if (iIntValue > 0 && iIntValue2 > 0) {
                    c1325700kbQLIZLLL.LIZJ = new C1324630kZh(iIntValue, iIntValue2);
                }
                C1325710kbR c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
                C1325540kbA c1325540kbALIZ = C1322200kVm.LIZ();
                if (!c1325540kbALIZ.LJIIL(c1325710kbRLIZ) && c1325540kbALIZ.LJIILJJIL(c1325710kbRLIZ)) {
                    c1325540kbALIZ.LJIIZILJ(c1325710kbRLIZ, null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (AwemeExtKt.isCommentPostInvisible(this.LL)) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_video_slash;
            c419910GdJ.LJ = Integer.valueOf(R.attr.ee);
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LLIZ);
            this.LLILLJJLI.setScaleType(ImageView.ScaleType.CENTER);
            this.LLILLJJLI.setImageDrawable(tuxIconDrawableLIZ);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.LLIZ);
            this.LLILLJJLI.setBackgroundColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        super.a6();
    }

    @Override // X.C1398630mV3
    public final boolean c6() {
        return ((Boolean) C280970Azn.LIZ.getValue()).booleanValue();
    }

    @Override // X.C1398630mV3
    public final boolean u6() {
        return ((Boolean) C0AN4.LIZ.getValue()).booleanValue();
    }

    @Override // X.C1398630mV3
    public final void v6() {
        if (this.LLJLLL) {
            C20627315nb c20627315nb = new C20627315nb(this.LLIZ, null, 6);
            Drawable[] drawableArr = {new ColorDrawable(C446980Hfs.LIZ(this.LLIZ, R.color.av)), new ColorDrawable(c20627315nb.getPlaceholderColor())};
            drawableArr[1] = new ColorDrawable(c20627315nb.getPulsingColor());
            TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
            this.LLILLJJLI.setBackground(transitionDrawable);
            transitionDrawable.startTransition(LSPassThroughRecordSizeConfig.DEFAULT);
            HandlerHook.viewPostDelay(this.LLILLJJLI, new ARunnableS9S0210000_6(this, transitionDrawable, true, 2), 1200L);
        }
    }

    public static boolean J6(Aweme aweme) {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_detail_page_cc_templatestyle_adjustment", true, false)) {
            C1398500mUq.LIZ.getClass();
            if (C1398500mUq.LIZIZ(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void C6(Aweme aweme) {
        if (this.LLJILJILJ == null) {
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJ.findViewById(R.id.qcw);
        if (C1394640mOc.LIZ()) {
            C1398500mUq c1398500mUq = C1398500mUq.LIZ;
            c1398500mUq.getClass();
            if (!C1398500mUq.LIZ(aweme) && !C1398500mUq.LIZIZ(aweme)) {
                C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
                C786410Ut5.LJZL(8, this.LLJILLL);
                this.LLJILJILJ.setBackgroundResource(R.drawable.bgz);
                this.LLJILJILJ.setTuxFont(82);
                this.LLJILJILJ.setPadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(7)), 0);
                return;
            }
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 4);
            C786410Ut5.LJZL(0, this.LLJILLL);
            this.LLJILLL.setBackgroundResource(R.drawable.bh2);
            if (C1398500mUq.LIZ(this.LL)) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_twinkle_star_fill;
                c419910GdJ.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                this.LLJJIJI.setImageDrawable(c419910GdJ.LIZ(this.LLIZ));
            } else if (C1398500mUq.LIZIZ(this.LL)) {
                C419910GdJ c419910GdJ2 = new C419910GdJ();
                c419910GdJ2.LIZ = R.raw.icon_templates_cards_fill;
                c419910GdJ2.LJ = Integer.valueOf(R.attr.zi);
                c419910GdJ2.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                c419910GdJ2.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
                this.LLJJIJI.setImageDrawable(c419910GdJ2.LIZ(this.LLIZ));
            }
            C427660Gpo c427660Gpo = this.LLJJIJI;
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(11));
            c1398500mUq.getClass();
            ViewGroup.LayoutParams layoutParams = c427660Gpo.getLayoutParams();
            layoutParams.width = iLIZIZ;
            layoutParams.height = iLIZIZ2;
            C786410Ut5.H6(c427660Gpo, layoutParams);
            View view = this.LLJJIII;
            TuxTextView tuxTextView = this.LLJJ;
            C427660Gpo c427660Gpo2 = this.LLJJIJI;
            LinearLayout linearLayout = this.LLJILLL;
            ViewGroup viewGroup = this.LLJ;
            c1398500mUq.getClass();
            C1398500mUq.LIZJ(view, viewGroup, linearLayout, c427660Gpo2, tuxIconView, tuxTextView, aweme);
            return;
        }
        C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
        C786410Ut5.LJZL(8, this.LLJILLL);
        this.LLJILJILJ.setBackgroundResource(R.drawable.bh1);
    }

    public final void D6(Aweme aweme) {
        UrlModel avatar168;
        if (C1394640mOc.LIZ()) {
            C786410Ut5.LLLLZLL(this.LLJILJILJ, 4);
            C786410Ut5.LJZL(0, this.LLJILLL);
            User author = aweme.getAuthor();
            if (author != null && (avatar168 = author.getAvatar168()) != null) {
                C427660Gpo.LJIIJJI(this.LLJJIJI, C438710HIf.LIZ(avatar168), false, null, null, false, false, null, null, false, null, 1022);
            }
            this.LLJJ.setText(aweme.getAuthor().getNickname());
            TuxIconView tuxIconView = (TuxIconView) this.LLJ.findViewById(R.id.qcw);
            C1398500mUq c1398500mUq = C1398500mUq.LIZ;
            View view = this.LLJJIII;
            TuxTextView tuxTextView = this.LLJJ;
            C427660Gpo c427660Gpo = this.LLJJIJI;
            LinearLayout linearLayout = this.LLJILLL;
            ViewGroup viewGroup = this.LLJ;
            c1398500mUq.getClass();
            C1398500mUq.LIZJ(view, viewGroup, linearLayout, c427660Gpo, tuxIconView, tuxTextView, aweme);
            return;
        }
        C786410Ut5.LLLLZLL(this.LLJILJILJ, 0);
        C786410Ut5.LJZL(8, this.LLJILLL);
        this.LLJILJILJ.setBackgroundResource(R.drawable.bh3);
    }

    public final void z6(Aweme aweme) {
        if (this.LLJILJILJ == null) {
            return;
        }
        TuxIconView tuxIconView = (TuxIconView) this.LLJ.findViewById(R.id.qcw);
        C630120Ona.LIZ(this.LLJILJILJ);
        C630120Ona.LIZIZ(this.LLJILLL);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_anchor_capcut;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        this.LLJJIJI.setImageDrawable(c419910GdJ.LIZ(this.LLIZ));
        C1398500mUq c1398500mUq = C1398500mUq.LIZ;
        C427660Gpo c427660Gpo = this.LLJJIJI;
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
        c1398500mUq.getClass();
        ViewGroup.LayoutParams layoutParams = c427660Gpo.getLayoutParams();
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ2;
        C786410Ut5.H6(c427660Gpo, layoutParams);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.e1, this.LLIZ);
        if (numLIZJ != null) {
            this.LLJJ.setTextColor(numLIZJ.intValue());
        }
        this.LLJILLL.setBackgroundResource(R.drawable.bh3);
        View view = this.LLJJIII;
        TuxTextView tuxTextView = this.LLJJ;
        C427660Gpo c427660Gpo2 = this.LLJJIJI;
        LinearLayout linearLayout = this.LLJILLL;
        ViewGroup viewGroup = this.LLJ;
        c1398500mUq.getClass();
        C1398500mUq.LIZJ(view, viewGroup, linearLayout, c427660Gpo2, tuxIconView, tuxTextView, aweme);
        int i = 2131849995;
        this.LLJJ.setText(2131849995);
        if (C1398290mUV.LIZ()) {
            this.LLJJ.setText(2131849995);
        } else {
            if (!C1398290mUV.LIZIZ()) {
                return;
            }
            if (!C7884036c.LIZ()) {
                i = 2131857995;
            }
            this.LLJJ.setText(i);
        }
    }

    @Override // X.C1398630mV3
    public final void q6(View view, InterfaceC1260110itd interfaceC1260110itd) {
        if (C1EE2.LIZIZ.LJJIZ(this.LL) && this.LLILLJJLI.LIZLLL()) {
            C823050WQl.LIZLLL().execute(new ARunnableS52S0300000_19(this, interfaceC1260110itd, view, 14));
        } else {
            super.q6(view, interfaceC1260110itd);
        }
    }

    public C1398620mV2(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view, str, interfaceC1260110itd);
        View viewFindViewById = view.findViewById(R.id.hpz);
        this.LLJZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        view.findViewById(R.id.hq0);
        h6();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0202 A[PHI: r1
      0x0202: PHI (r1v31 android.view.View) = (r1v30 android.view.View), (r1v37 android.view.View) binds: [B:160:0x0399, B:101:0x0200] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f1 A[PHI: r4
      0x02f1: PHI (r4v11 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) = 
      (r4v7 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
      (r4v14 com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct)
     binds: [B:136:0x02ef, B:127:0x02c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x051a  */
    @Override // X.C1398630mV3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b6(com.ss.android.ugc.aweme.feed.model.Aweme r18, int r19, boolean r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instruction units count: 1348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1398620mV2.b6(com.ss.android.ugc.aweme.feed.model.Aweme, int, boolean, android.os.Bundle):void");
    }
}
