package X;

import Y.ACListenerS146S0100000_11;
import Y.ACallableS179S0300000_11;
import Y.AfS147S0200000_11;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ability.IPhotoModeAbility;
import com.ss.android.ugc.aweme.ability.IPhotoSlidesAbility;
import com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService;
import com.ss.android.ugc.aweme.api.IGetApps;
import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.editpost.ClientText;
import com.ss.android.ugc.aweme.feed.VideoViewCellRootView;
import com.ss.android.ugc.aweme.feed.adapter.VideoViewModel;
import com.ss.android.ugc.aweme.feed.assem.desc.SmartSearchFeedCacheVM;
import com.ss.android.ugc.aweme.feed.assem.desc.TranslationAbility;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescAssem;
import com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM;
import com.ss.android.ugc.aweme.feed.collection.friends.ability.IFriendsDetailPageAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PlayListInfo;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.translation.delegates.TranslationControlsAbility;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.AdaptionPaddingValues;
import com.ss.android.ugc.aweme.videoadaption.adaptionparams.VideoAdaptionResult;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaMobCommonAbility;
import com.ss.android.ugc.feed.platform.container.info.ConstraintSizeVM;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS198S0000000_11;
import kotlin.jvm.internal.AFwS243S0000000_11;
import kotlin.jvm.internal.AwS220S0300000_11;
import kotlin.jvm.internal.AwS377S0200000_11;
import kotlin.jvm.internal.AwS412S0200000_11;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS590S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS99S0110000_11;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0SHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C718770SHj implements InterfaceC724530SbT, InterfaceC718870SHt {
    public final VideoDescAssem LL;
    public final VideoDescVM LLILLJJLI;
    public final ConstraintSizeVM LLILLL;
    public final VideoViewModel LLILZ;
    public final LinearLayout LLILZIL;
    public final LinearLayout LLILZLL;
    public final TuxTextView LLIZ;
    public final TuxIconView LLIZLLLIL;
    public final TuxTextView LLJ;
    public final FrameLayout LLJI;
    public final View LLJIJIL;
    public final LinearLayout LLJILJIL;
    public final SmartSearchFeedCacheVM LLJILJILJ;
    public final C01GW LLJILLL = C452501pT.LIZIZ(new C709220Rrs(this));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1491));
    public final C630740Ooa LLJJI = C628500Oky.LIZ(new C709260Rrw(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C709390Rs9(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C709240Rru(this));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new C717110SAz(this));
    public final C01GW LLJJIJIL = C452501pT.LIZIZ(new C709230Rrt(this));
    public final C01GW LLJJJ = C452501pT.LIZIZ(new C0SIY(this));
    public final C01GW LLJJJIL = C452501pT.LIZIZ(new C716770S9r(this));
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new C709250Rrv(this));
    public final C01GW LLJJJJJIL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1492));
    public Aweme LLJJJJLIIL;
    public int LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public boolean LLJLIL;
    public final int LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public C0GU3 LLJLLIL;
    public C21415018rM LLJLLL;
    public C21415018rM LLJZ;
    public C718800SHm LLJZIJLIL;
    public C718800SHm LLL;
    public final C0SF9 LLLF;
    public final int LLLFF;
    public final int LLLFFI;
    public int LLLFZ;
    public Animator LLLI;
    public Layout LLLII;
    public Layout LLLIIII;
    public Layout LLLIIIIL;
    public Layout LLLIIIL;
    public Layout LLLIIL;
    public C710300Rtc LLLIILIL;
    public C710300Rtc LLLIL;
    public C710300Rtc LLLILZ;
    public C710300Rtc LLLILZJ;
    public C710300Rtc LLLILZLLLI;
    public C710300Rtc LLLIZZ;
    public final int LLLJ;
    public int LLLJIL;
    public int LLLJL;
    public final C11NJ LLLL;
    public C11NJ LLLLII;
    public C0S64 LLLLIIIILLL;
    public Aweme LLLLIIL;
    public final C01GW LLLLIILL;
    public Set<String> LLLLIILLL;
    public final Set<String> LLLLIL;
    public final Map<String, Long> LLLLILI;
    public C718930SHz LLLLJ;
    public String LLLLJI;
    public boolean LLLLL;
    public boolean LLLLLIL;
    public AnonymousClass0956 LLLLLILLIL;
    public boolean LLLLLJIL;
    public final C01GW LLLLLJLJLL;
    public final C01GW LLLLLL;
    public boolean LLLLLLIL;
    public LinearLayout LLLLLLJ;
    public TuxTextView LLLLLLL;
    public LinearLayout LLLLLLLLL;
    public LinearLayout LLLLLLLLLL;
    public TuxTextView LLLLLLLZIL;
    public C0SKK LLLLLLZ;
    public final C630740Ooa LLLLLLZZ;
    public final C630740Ooa LLLLLZ;
    public C718810SHn LLLLLZIL;
    public AnonymousClass0956 LLLLLZL;
    public boolean LLLLZ;
    public final C630740Ooa LLLLZI;
    public String LLLLZIL;
    public String LLLLZLL;
    public String LLLLZLLIL;
    public final String LLLLZLLLI;
    public final ViewOnLayoutChangeListenerC718830SHp LLLZ;
    public final C01GW LLLZI;
    public final C01GW LLLZIIL;

    @Override // X.InterfaceC718870SHt
    public final void LJIL(int i, int i2, Integer num) {
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIIJ() {
    }

    public final float LJJJJLL() {
        Iterator it2 = C13LP.LJJJJLI(C1697810uHb.LJIIJJI(this.LLLLZIL, this.LLLLZLL, this.LLLLZLLIL)).iterator();
        if (!it2.hasNext()) {
            return 0.0f;
        }
        float fMeasureText = this.LLJ.getPaint().measureText((String) it2.next());
        while (it2.hasNext()) {
            fMeasureText = Math.max(fMeasureText, this.LLJ.getPaint().measureText((String) it2.next()));
        }
        Float fValueOf = Float.valueOf(fMeasureText);
        if (fValueOf != null) {
            return fValueOf.floatValue();
        }
        return 0.0f;
    }

    public final void LJJLIIJ() {
        IFriendsDetailPageAbility iFriendsDetailPageAbility;
        this.LLJI.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        this.LLJ.setTuxFont(LJJJJI());
        this.LLJ.setTextColorRes(LJJJJ());
        C21415018rM c21415018rM = this.LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.setTextAlignment(5);
        C21415018rM titleView = LJJJJZI().getTitleView();
        PostModeEntranceMechanism postModeEntranceMechanism = PostModeEntranceMechanism.CLICK_TITLE;
        if (titleView != null) {
            C786410Ut5.I7(new ViewOnClickListenerC718850SHr(this, postModeEntranceMechanism), titleView);
        }
        C21415018rM c21415018rM2 = this.LLJZ;
        if (c21415018rM2 == null) {
            c21415018rM2 = null;
        }
        PostModeEntranceMechanism postModeEntranceMechanism2 = PostModeEntranceMechanism.TAP_TEXT;
        if (c21415018rM2 != null) {
            C786410Ut5.I7(new ViewOnClickListenerC718850SHr(this, postModeEntranceMechanism2), c21415018rM2);
        }
        C21415018rM c21415018rM3 = this.LLJZ;
        if (c21415018rM3 == null) {
            c21415018rM3 = null;
        }
        C2271391DvN.LIZ(c21415018rM3, (C1A5L) C2271381DvM.LJII.getValue());
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0S6X
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.LL.LJIIL("click_mask");
            }
        }, this.LLJIJIL);
        C948503nH.LJ(this.LL, C23271099x.INSTANCE, new C709270Rrx(this, null));
        C736680Sv4.LJIIIIZZ(this, this.LLILZ, new C2217381BqS() { // from class: X.0RCI
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, new C718820SHo(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILZ, new C2217381BqS() { // from class: X.0SIl
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLILLJJLI;
            }
        }, null, new AwS625S0100000_11(this, 129), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILZ, new C2217381BqS() { // from class: X.0RCJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, C736820SvI.LIZLLL(), new AwS625S0100000_11(this, 130), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLILZ, new C2217381BqS() { // from class: X.0Rsh
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJIJIIJIL;
            }
        }, null, new C715950S6n(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILZ, new C2217381BqS() { // from class: X.0Rsw
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLJJI;
            }
        }, null, new C715820S6a(this), 6);
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI, new C2217381BqS() { // from class: X.0SCq
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C715890S6h) obj).LL;
            }
        }, C736820SvI.LIZJ(), new C0SFQ(this), 4);
        C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI, new C2217381BqS() { // from class: X.0S6i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C715890S6h) obj).LLILZ;
            }
        }, C736820SvI.LJ(), new AwS625S0100000_11(this, 128), 4);
        if (C0BJH.LIZ()) {
            C736680Sv4.LJIIIIZZ(this, this.LLILLJJLI, new C2217381BqS() { // from class: X.0S7G
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return ((C715890S6h) obj).LLJ;
                }
            }, null, new C0S65(this), 6);
        }
        if (C294320BgE.LIZ()) {
            this.LLLLLILLIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C709180Rro(this, null), 3);
        }
        VideoItemParams item = this.LLILLJJLI.getItem();
        Fragment fragment = item != null ? item.fragment : null;
        if ((C1389300mG0.LJIILIIL(fragment) || C1389300mG0.LJIILLIIL(fragment)) && (iFriendsDetailPageAbility = (IFriendsDetailPageAbility) this.LLJJJIL.getValue()) != null) {
            C21415018rM c21415018rM4 = this.LLJZ;
            iFriendsDetailPageAbility.Fy1(c21415018rM4 != null ? c21415018rM4 : null, new AwS590S0100000_11(this, 459));
        }
    }

    @Override // X.InterfaceC718870SHt
    public final void LLILLL(Aweme aweme) {
    }

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ() {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJIIIZ():boolean");
    }

    public final void LJIIJJI() {
        Aweme aweme;
        C1022620cia.LIZ("VideoDescView", "collapseAdDesc");
        VideoItemParams item = this.LLILLJJLI.getItem();
        if (item != null && (aweme = item.getAweme()) != null) {
            AwemeBizExtKt.setAdDescMaxLines(aweme, ((Number) C275590Ar7.LIZ.getValue()).intValue());
        }
        this.LLLLLJIL = true;
        VideoItemParams item2 = this.LLILLJJLI.getItem();
        LJLLLL(item2 != null ? item2.getAweme() : null);
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJI() {
        Aweme aweme = this.LLLLIIL;
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme)) {
            return false;
        }
        return ((Boolean) C277150Atd.LIZ.getValue()).booleanValue();
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJJLI() {
        C21415018rM c21415018rM = this.LLJLLL;
        return c21415018rM != null && c21415018rM.getVisibility() == 0;
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJJIJIIJI() {
        Aweme aweme = this.LLLLIIL;
        if (aweme == null || !AwemeExtKt.isPhotoMode(aweme) || !LJJJJZI().LJIJJLI()) {
            return false;
        }
        C21415018rM titleView = LJJJJZI().getTitleView();
        Layout textLayout = titleView != null ? titleView.getTextLayout() : null;
        return C0SI6.LIZIZ(textLayout) || C0SI6.LIZ(textLayout) || C0SI6.LIZJ(textLayout, LJJJLIIL(false).getText());
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIJLIJ() {
        C21415018rM c21415018rM = this.LLJLLL;
        if (c21415018rM != null) {
            C786410Ut5.LJLLLLLL(8, c21415018rM);
        }
    }

    public final IAdDescAreaReplaceService LJJIZ() {
        return (IAdDescAreaReplaceService) this.LLLZIIL.getValue();
    }

    public final InteractAreaMobCommonAbility LJJJ() {
        return (InteractAreaMobCommonAbility) this.LLJJIII.getValue();
    }

    public final int LJJJI() {
        if (this.LLJLIL) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.av1, this.LLJ.getContext());
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -16777216;
        }
        Aweme aweme = this.LLLLIIL;
        boolean zLJJL = LJJL();
        if (C0SK2.LIZLLL() && C0SK2.LIZ(aweme, zLJJL) && ((Boolean) C0SK2.LIZJ.getValue()).booleanValue()) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zl, this.LLJ.getContext());
            if (numLIZJ2 != null) {
                return numLIZJ2.intValue();
            }
            return 0;
        }
        if (LJJL()) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, this.LLJ.getContext());
            if (numLIZJ3 != null) {
                return numLIZJ3.intValue();
            }
            return 0;
        }
        Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.ee, this.LLJ.getContext());
        if (numLIZJ4 != null) {
            return numLIZJ4.intValue();
        }
        return 0;
    }

    public final int LJJJJ() {
        return this.LLJLIL ? R.attr.av3 : LJJL() ? R.attr.a1k : R.attr.zl;
    }

    public final int LJJJJI() {
        return this.LLILLJJLI.LLILLJJLI ? 52 : 42;
    }

    public final C0SI8 LJJJJIZL() {
        C21415018rM c21415018rM = this.LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        if (c21415018rM.getVisibility() != 0) {
            return C0SI8.LL;
        }
        C0GU3 c0gu3 = this.LLJLLIL;
        if (c0gu3 == null || c0gu3.getVisibility() != 0) {
            return C0SI8.LLILLJJLI;
        }
        Layout textLayout = c21415018rM.getTextLayout();
        return textLayout == null ? C0SI8.LLILLL : textLayout.getText().length() > 0 ? C0SI8.LLILZ : C0SI8.LLILZIL;
    }

    public final Integer LJJJJJL() {
        return this.LLJLIL ? Integer.valueOf(this.LLJJLIIIJLLLLLLLZ) : C1308910kAL.LIZJ(R.attr.a01, new C1361400lX0(this.LLJ.getContext(), R.style.y0));
    }

    public final int LJJJJLI() {
        if (this.LLJLIL) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.av1, this.LLJ.getContext());
            if (numLIZJ != null) {
                return numLIZJ.intValue();
            }
            return -16777216;
        }
        if ((C0SK2.LIZLLL() && C0SK2.LIZ(this.LLLLIIL, LJJL())) ? ((Boolean) C0SK2.LIZIZ.getValue()).booleanValue() : false) {
            Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.zl, this.LLJ.getContext());
            if (numLIZJ2 != null) {
                return numLIZJ2.intValue();
            }
            return 0;
        }
        Aweme aweme = this.LLLLIIL;
        boolean zLJJL = LJJL();
        if (C0SK2.LIZLLL() && C0SK2.LIZ(aweme, zLJJL) && ((Boolean) C0SK2.LIZJ.getValue()).booleanValue()) {
            Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.zl, this.LLJ.getContext());
            if (numLIZJ3 != null) {
                return numLIZJ3.intValue();
            }
            return 0;
        }
        if (LJJL()) {
            Integer numLIZJ4 = C1308910kAL.LIZJ(R.attr.a1h, this.LLJ.getContext());
            if (numLIZJ4 != null) {
                return numLIZJ4.intValue();
            }
            return 0;
        }
        Integer numLIZJ5 = C1308910kAL.LIZJ(R.attr.ee, this.LLJ.getContext());
        if (numLIZJ5 != null) {
            return numLIZJ5.intValue();
        }
        return 0;
    }

    public final InterfaceC718870SHt LJJJJZI() {
        return (InterfaceC718870SHt) this.LLJJ.getValue();
    }

    public final TranslationAbility LJJJLZIJ() {
        return (TranslationAbility) this.LLLLLLZZ.getValue();
    }

    public final boolean LJJJZ() {
        boolean z = Intrinsics.LJFF(this.LLLIZZ, this.LLLIILIL) || Intrinsics.LJFF(this.LLLIZZ, this.LLLILZJ);
        Aweme aweme = this.LLLLIIL;
        return (aweme == null || !C582980Mtk.LIZIZ(aweme)) ? z : z && LJJJJZI().LJIJ();
    }

    public final boolean LJJL() {
        return ((Boolean) this.LLJL.getValue()).booleanValue();
    }

    public final Boolean LJJLI() {
        return (Boolean) this.LLLLZI.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLJ() {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJLJ():void");
    }

    public final void LJLI() {
        if (this.LLILZLL.getWidth() > 0) {
            C21415018rM c21415018rM = this.LLJZ;
            if (c21415018rM == null) {
                c21415018rM = null;
            }
            int iApplyDimension = (int) TypedValue.applyDimension(1, 2, c21415018rM.getContext().getResources().getDisplayMetrics());
            C21415018rM c21415018rM2 = this.LLJZ;
            this.LLIZ.setMaxWidth((((this.LLILZIL.getWidth() - this.LLJ.getWidth()) - this.LLIZLLLIL.getWidth()) - iApplyDimension) - ((int) TypedValue.applyDimension(1, 16, (c21415018rM2 != null ? c21415018rM2 : null).getContext().getResources().getDisplayMetrics())));
        }
    }

    public final void LJLILLLLZI() {
        C718810SHn c718810SHnLJFF;
        C718810SHn c718810SHnLJFF2;
        if (LJIIJ(this.LLLLIIL) && this.LLJ.getVisibility() == 0) {
            LJZL(this.LLILLJJLI.LLJILJIL);
            LJLZ(this.LLLLLLZ);
        } else {
            LinearLayout linearLayout = this.LLLLLLLLLL;
            if (linearLayout != null) {
                C786410Ut5.LJZL(8, linearLayout);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTranslateButtonVisibility, toggle visible:");
        sbLIZ.append(this.LLJ.getVisibility() == 0);
        sbLIZ.append(", toggle text:");
        sbLIZ.append((Object) this.LLJ.getText());
        sbLIZ.append(", translate button visible:");
        LinearLayout linearLayout2 = this.LLLLLLLLLL;
        sbLIZ.append(linearLayout2 != null && linearLayout2.getVisibility() == 0);
        sbLIZ.append(", position(");
        C718800SHm c718800SHm = this.LLJZIJLIL;
        Integer numValueOf = null;
        sbLIZ.append((c718800SHm == null || (c718810SHnLJFF2 = c718800SHm.LJFF()) == null) ? null : Integer.valueOf(c718810SHnLJFF2.LJI));
        sbLIZ.append(", ");
        C718800SHm c718800SHm2 = this.LLL;
        if (c718800SHm2 != null && (c718810SHnLJFF = c718800SHm2.LJFF()) != null) {
            numValueOf = Integer.valueOf(c718810SHnLJFF.LJI);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJLJJL() {
        Aweme aweme;
        VideoItemParams item = this.LLILLJJLI.getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Desc: Trigger aid ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(" turn back original source");
        c2276411E8h.LIZJ("common_feed", 4, "VideoDescView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLIILIL == null) {
            LJJLJLI(this.LLJZIJLIL, aweme, false);
        }
        C710300Rtc c710300Rtc = this.LLLIILIL;
        if (c710300Rtc == null) {
            return;
        }
        this.LLLF.LJIIIZ = false;
        LJLJLJ(c710300Rtc, this.LLLILZ, false);
        LJJLIIIJLJLI(this.LLLIZZ, false);
    }

    public final void LJLJL() {
        Aweme aweme;
        VideoItemParams item = this.LLILLJJLI.getItem();
        if (item == null || (aweme = item.getAweme()) == null) {
            return;
        }
        C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Desc: Trigger aid ");
        sbLIZ.append(aweme.getAid());
        sbLIZ.append(" turn back original source");
        c2276411E8h.LIZJ("common_feed", 4, "VideoDescView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLLILZJ == null) {
            LJJLJLI(this.LLL, aweme, true);
        }
        C710300Rtc c710300Rtc = this.LLLILZJ;
        if (c710300Rtc == null) {
            return;
        }
        this.LLLF.LJIIIZ = true;
        LJLJLJ(c710300Rtc, this.LLLILZLLLI, true);
        LJJLIIIJLJLI(this.LLLIZZ, true);
        this.LLJI.getLayoutParams().height = -2;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL.getLifecycle();
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJIJ() {
        return Intrinsics.LJFF(LJJJJZI().LJJIJIIJIL(), LJJJJZI().LJIJJ()) || Intrinsics.LJFF(LJJJJZI().LJJIJIIJIL(), LJJJJZI().LJIIZILJ());
    }

    public final void LJJLIIIJJI() {
        LJJZZI();
        this.LLLL.dispose();
        C11NJ c11nj = this.LLLLII;
        if (c11nj != null) {
            c11nj.dispose();
        }
        LJJZZIII();
        if (C294320BgE.LIZ()) {
            AnonymousClass0956 anonymousClass0956 = this.LLLLLILLIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LLLLLILLIL = null;
        }
    }

    public final void LJJZZI() {
        if (C0HD0.LIZ()) {
            Set<String> set = this.LLLLIILLL;
            C718930SHz c718930SHz = this.LLLLJ;
            InterfaceC1602300rnY interfaceC1602300rnY = (InterfaceC1602300rnY) this.LLLLIILL.getValue();
            if (!(!set.isEmpty()) || c718930SHz == null || interfaceC1602300rnY == null) {
                return;
            }
            interfaceC1602300rnY.LJIILJJIL(c718930SHz, "mention");
            interfaceC1602300rnY.LJIJ(6, "mention", C13LP.LLIIIZ(set), false);
            this.LLLLIILLL = C08CX.INSTANCE;
            this.LLLLIL.clear();
            ((LinkedHashMap) this.LLLLILI).clear();
            this.LLLLJ = null;
            this.LLLLL = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJZZIII() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService r0 = r3.LJJIZ()
            r2 = 0
            if (r0 == 0) goto L39
            boolean r0 = r0.LJ()
            r1 = 1
            if (r0 != r1) goto L39
        Le:
            com.ss.android.ugc.aweme.ad.feed.IAdDescAreaReplaceService r0 = r3.LJJIZ()
            if (r0 == 0) goto L17
            r0.LIZJ()
        L17:
            if (r1 == 0) goto L38
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r3.LLILLJJLI
            r0.LLJILJIL = r2
            r0 = 8
            r3.LJLIIL(r0)
            r1 = 0
            r3.LLJZIJLIL = r1
            r3.LLL = r1
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r3.LLILLJJLI
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L35
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r0.getAweme()
        L35:
            r3.LJLLLL(r1)
        L38:
            return
        L39:
            r1 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJZZIII():void");
    }

    public final void LJLLL() {
        if (C294240Bg6.LIZ()) {
            VideoDescVM videoDescVM = this.LLILLJJLI;
            if (!videoDescVM.LLJILJIL) {
                this.LLIZ.setText("");
                LJLI();
                return;
            }
            VideoItemParams item = videoDescVM.getItem();
            if (item == null || item.getAweme() == null) {
                return;
            }
            if (this.LLLF.LIZ()) {
                this.LLIZ.setText(C20642515q3.LJI(2131828754));
                C786410Ut5.LLLLLLZZ(this.LLIZLLLIL, 0);
            } else {
                this.LLIZ.setText(C20642515q3.LJI(2131828753));
                C786410Ut5.LLLLLLZZ(this.LLIZLLLIL, 8);
            }
            LJLI();
        }
    }

    @Override // X.InterfaceC718870SHt
    public final int LIZIZ() {
        return this.LLLJ;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJIIZILJ() {
        return this.LLLIIIL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJIJJ() {
        return this.LLLIIII;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJI() {
        return this.LLLIIIIL;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJIJIIJIL() {
        return this.LLLII;
    }

    @Override // X.InterfaceC718870SHt
    public final Layout LJJIJIL() {
        return this.LLLIIL;
    }

    @Override // X.InterfaceC718870SHt
    public final C21415018rM getTitleView() {
        return this.LLJLLL;
    }

    public static boolean LJJIL(Aweme aweme) {
        boolean z;
        float fFloatValue;
        AwemeRawAd awemeRawAd;
        Float subtitlePosPercentageToTop;
        AwemeRawAd awemeRawAd2;
        if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null && awemeRawAd2.getHasEmbeddedSubtitle() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (subtitlePosPercentageToTop = awemeRawAd.getSubtitlePosPercentageToTop()) != null) {
            fFloatValue = subtitlePosPercentageToTop.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        if (((Number) C275610Ar9.LIZ.getValue()).intValue() > 0 && ((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme) && z && fFloatValue > 0.0f) {
            return true;
        }
        return false;
    }

    public static int LJJJJJ(Layout layout) {
        CharSequence text;
        if (layout == null || (text = layout.getText()) == null || text.length() == 0) {
            return 0;
        }
        if (C0SI6.LIZIZ(layout)) {
            int lineCount = layout.getLineCount() - 1;
            if (lineCount < 0) {
                lineCount = 0;
            }
            int ellipsisStart = layout.getEllipsisStart(lineCount);
            if (ellipsisStart >= 0) {
                return layout.getLineStart(lineCount) + ellipsisStart;
            }
        }
        int iLJJJJI = a0.LJJJJI(layout.getText(), "…", 0, 6);
        if (iLJJJJI >= 0) {
            return iLJJJJI;
        }
        return layout.getText().length();
    }

    public static boolean LJJLIIIIJ(Aweme aweme) {
        String strLLIIZ = C161N.LIZIZ.LLIIZ();
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return Intrinsics.LJFF(aweme.getPhotoTitleLanguageCode(), strLLIIZ);
        }
        return Intrinsics.LJFF(aweme.getDescLanguage(), strLLIIZ);
    }

    public final void LIZ(View view) {
        boolean z;
        FrameLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        C0GU3 c0gu3 = (C0GU3) view.findViewById(R.id.fo_);
        this.LLJLLIL = c0gu3;
        LJJJJZI().LJJIIZ(view);
        this.LLJZ = (C21415018rM) c0gu3.findViewById(R.id.desc);
        C01GW c01gw = C270650Aj9.LIZ;
        if (((Number) c01gw.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        FrameLayout.LayoutParams layoutParams3 = null;
        if (z) {
            C21415018rM c21415018rM = this.LLJZ;
            if (c21415018rM == null) {
                c21415018rM = null;
            }
            c21415018rM.setEnableFlingScroll(true);
            C21415018rM c21415018rM2 = this.LLJZ;
            if (c21415018rM2 == null) {
                c21415018rM2 = null;
            }
            c21415018rM2.setEnableScrollBoundaryHandoff(false);
        } else if (((Number) c01gw.getValue()).intValue() == 2) {
            C21415018rM c21415018rM3 = this.LLJZ;
            if (c21415018rM3 == null) {
                c21415018rM3 = null;
            }
            c21415018rM3.setEnableFlingScroll(true);
            C21415018rM c21415018rM4 = this.LLJZ;
            if (c21415018rM4 == null) {
                c21415018rM4 = null;
            }
            c21415018rM4.setEnableScrollBoundaryHandoff(true);
        }
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme = this.LLLLIIL;
        boolean zLJJL = LJJL();
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, zLJJL)) {
            this.LLLLZIL = C20642515q3.LJI(2131847255);
            this.LLLLZLL = C20642515q3.LJI(R.string.dzs);
            this.LLLLZLLIL = C20642515q3.LJI(R.string.suj);
            this.LLLLLLLLL = (LinearLayout) view.findViewById(R.id.cc2);
            this.LLLLLLLLLL = (LinearLayout) view.findViewById(R.id.yim);
            TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.yil);
            if (tuxTextView != null) {
                tuxTextView.setTuxFont(LJJJJI());
                tuxTextView.setTextColorRes(LJJJJ());
                C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 65));
                C2271391DvN.LIZ(tuxTextView, (C1A5L) C2271381DvM.LJIIL.getValue());
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
                    layoutParams2.gravity = 80;
                    C786410Ut5.R6(tuxTextView, layoutParams2);
                }
            } else {
                tuxTextView = null;
            }
            this.LLLLLLLZIL = tuxTextView;
        }
        this.LLLLLLJ = (LinearLayout) view.findViewById(R.id.ac4);
        this.LLLLLLL = (TuxTextView) view.findViewById(R.id.ac6);
        LinearLayout linearLayout = this.LLLLLLJ;
        PostModeEntranceMechanism postModeEntranceMechanism = PostModeEntranceMechanism.TAP_TEXT;
        if (linearLayout != null) {
            C786410Ut5.I7(new ViewOnClickListenerC718850SHr(this, postModeEntranceMechanism), linearLayout);
        }
        if (LJJL()) {
            LJJJJZI().LJJIJLIJ();
            LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.cc2);
            if (linearLayout2 != null) {
                ViewGroup.LayoutParams layoutParams5 = linearLayout2.getLayoutParams();
                if ((layoutParams5 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams5) != null) {
                    layoutParams.gravity = 8388691;
                    layoutParams3 = layoutParams;
                }
                C786410Ut5.d6(linearLayout2, layoutParams3);
            }
        }
        c0gu3.setFadingEdgeLength(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        c0gu3.setVerticalFadingEdgeEnabled(true);
    }

    public final void LIZJ(C718800SHm c718800SHm) {
        c718800SHm.LJIIJ = (TuxIconDrawable) this.LLLLLL.getValue();
        c718800SHm.LJIIL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c718800SHm.LJIIJJI = C426750GoL.LIZLLL(this.LLJ.getContext());
    }

    public final void LIZLLL(C0S5P c0s5p) {
        Pair pair;
        C0SKK c0skk;
        C0SKK c0skk2 = c0s5p.LIZ;
        this.LLLLLLZ = c0skk2;
        LJLZ(c0skk2);
        if (this.LLLLLIL) {
            return;
        }
        int i = C0SI7.LIZ[this.LLLLLLZ.ordinal()];
        C0S5S c0s5s = null;
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4 && this.LLLIILIL != null && this.LLLF.LJIIIIZZ == null) {
                    pair = new Pair(this.LLJZIJLIL, Boolean.FALSE);
                } else {
                    pair = new Pair(null, Boolean.FALSE);
                }
            } else {
                C718800SHm c718800SHm = this.LLL;
                if (c718800SHm == null) {
                    pair = new Pair(this.LLJZIJLIL, Boolean.FALSE);
                } else {
                    pair = new Pair(c718800SHm, Boolean.TRUE);
                }
            }
        } else {
            pair = new Pair(this.LLJZIJLIL, Boolean.FALSE);
        }
        C718800SHm c718800SHm2 = (C718800SHm) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        Aweme aweme = this.LLLLIIL;
        if (aweme == null) {
            return;
        }
        LJZ(aweme);
        if (AwemeExtKt.isPhotoMode(aweme) && ((c0skk = this.LLLLLLZ) == C0SKK.INITIALIZED || c0skk == C0SKK.ORIGINAL || c0skk == C0SKK.TRANSLATED)) {
            LJJJJZI().LJJIFFI(null);
            if (this.LLLLLLZ == C0SKK.TRANSLATED) {
                C0S64 c0s64 = this.LLLLIIIILLL;
                if (c0s64 != null) {
                    c0s5s = c0s64.LIZIZ;
                }
                LJZI(aweme, c0s5s, this.LLILLJJLI.LLJILJIL);
            } else {
                LJZI(aweme, null, this.LLILLJJLI.LLJILJIL);
            }
        }
        if (c718800SHm2 != null) {
            LJJLJLI(c718800SHm2, aweme, zBooleanValue);
        }
    }

    public final boolean LJIIJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        boolean zLJJL = LJJL();
        c299210Bo7.getClass();
        if (!C299210Bo7.LIZ(aweme, zLJJL)) {
            return false;
        }
        TranslationAbility translationAbilityLJJJLZIJ = LJJJLZIJ();
        if ((translationAbilityLJJJLZIJ != null && translationAbilityLJJJLZIJ.R2(aweme)) || LJJLIIIIJ(aweme) || this.LLLLLLZ == C0SKK.INITIALIZED || Intrinsics.LJFF(LJJLI(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    public final void LJIIL(String str) {
        PostModeEntranceMechanism postModeEntranceMechanism;
        if (Intrinsics.LJFF(str, "click_hide")) {
            postModeEntranceMechanism = PostModeEntranceMechanism.SEE_MORE_BTN;
        } else if (Intrinsics.LJFF(str, "click_descr")) {
            postModeEntranceMechanism = PostModeEntranceMechanism.TAP_TEXT;
        } else {
            postModeEntranceMechanism = PostModeEntranceMechanism.TAP_PHOTO;
        }
        LJLJLLL(false, str, postModeEntranceMechanism);
    }

    public final void LJIILJJIL(boolean z) {
        String str;
        if (z) {
            str = "";
        } else {
            str = "click_hide";
        }
        LJLJLLL(z, str, PostModeEntranceMechanism.SEE_MORE_BTN);
    }

    @Override // X.InterfaceC718870SHt
    public final void LJIILL(int i) {
        this.LLJJL = i;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJIILLIIL(Layout layout) {
        this.LLLIIII = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJ(Layout layout) {
        this.LLLIIIL = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIFFI(Layout layout) {
        this.LLLIIL = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIIZ(View view) {
        C21415018rM c21415018rM = (C21415018rM) view.findViewById(R.id.fo_).findViewById(R.id.title);
        this.LLJLLL = c21415018rM;
        if (c21415018rM != null) {
            c21415018rM.setTextAlignment(5);
        }
        C21415018rM c21415018rM2 = this.LLJLLL;
        if (c21415018rM2 != null) {
            c21415018rM2.setLayoutDirection(0);
        }
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIIZI(Layout layout) {
        this.LLLII = layout;
    }

    @Override // X.InterfaceC718870SHt
    public final void LJJIJ(Layout layout) {
        this.LLLIIIIL = layout;
    }

    public final int LJJJIL(int i) {
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C21415018rM titleView = LJJJJZI().getTitleView();
        int i3 = 0;
        if (titleView != null && titleView.getVisibility() == 0) {
            int height = titleView.getHeight();
            ViewGroup.LayoutParams layoutParams = titleView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i2 = marginLayoutParams.bottomMargin;
            } else {
                i2 = 0;
            }
            i3 = height + i2;
        }
        return i + i3;
    }

    public final C0SJA LJJJLIIL(boolean z) {
        final Context context = this.LLJILJIL.getContext();
        if (z) {
            if (LJJL()) {
                return new C719080SIo(context) { // from class: X.0SIm
                    public final String LIZIZ;
                    public final String LIZJ;

                    @Override // X.C719080SIo, X.C0SJA
                    public final String LIZ() {
                        return this.LIZIZ;
                    }

                    @Override // X.C719080SIo, X.C0SJA
                    public final String getText() {
                        return this.LIZJ;
                    }

                    {
                        super(context);
                        this.LIZIZ = "less";
                        this.LIZJ = context.getString(2131838842);
                    }
                };
            }
            return new C719080SIo(context);
        }
        if (LJJL()) {
            return new C719040SIk(context);
        }
        return new C719020SIi(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJ(android.text.Layout r14) {
        /*
            Method dump skipped, instruction units count: 473
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJLIIIJ(android.text.Layout):void");
    }

    public final boolean LJJLIIIJILLIZJL(Aweme aweme) {
        PlayListInfo playListInfo;
        BaseFeedPageParams baseFeedPageParams;
        if (aweme == null) {
            return false;
        }
        PlayListInfo playListInfo2 = aweme.playlist_info;
        Fragment fragment = null;
        if (playListInfo2 == null || playListInfo2.getMixId() == null || (playListInfo = aweme.playlist_info) == null || playListInfo.getIndex() == null) {
            return false;
        }
        C0S4N c0s4n = C0S4N.LIZ;
        VideoItemParams item = this.LLILLJJLI.getItem();
        if (item != null) {
            baseFeedPageParams = item.baseFeedPageParams;
        } else {
            baseFeedPageParams = null;
        }
        C1599640rjG c1599640rjG = C1599640rjG.LIZIZ;
        VideoItemParams item2 = this.LLILLJJLI.getItem();
        if (item2 != null) {
            fragment = item2.fragment;
        }
        boolean zPu = c1599640rjG.Pu(fragment);
        c0s4n.getClass();
        if (!C0S4N.LIZ(aweme, baseFeedPageParams, zPu)) {
            return false;
        }
        return true;
    }

    public final void LJJLIIIJLLLLLLLZ(C0S64 c0s64) {
        String aid;
        Aweme aweme;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTransDataChanged aid:");
        Aweme aweme2 = this.LLLLIIL;
        if (aweme2 != null) {
            aid = aweme2.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", cur state:");
        sbLIZ.append(this.LLLLLLZ);
        sbLIZ.append(", new data:");
        sbLIZ.append(c0s64);
        sbLIZ.append(", old data:");
        sbLIZ.append(this.LLLLIIIILLL);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0s64 == null) {
            return;
        }
        this.LLLLIIIILLL = c0s64;
        LJJJJZI().LJJIIJ();
        if (this.LLLLLIL) {
            return;
        }
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme3 = this.LLLLIIL;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme3, false) && Intrinsics.LJFF(LJJLI(), Boolean.FALSE) && (aweme = this.LLLLIIL) != null && AwemeExtKt.isPhotoMode(aweme) && LJJJJZI().LJIJJLI() && this.LLLLLLZ == C0SKK.TRANSLATED) {
            this.LLLILZJ = null;
        }
        LJZ(this.LLLLIIL);
        LJJLJ();
    }

    public final void LJLIIL(int i) {
        boolean z;
        String xiaomiSupplementalInfo;
        AwemeRawAd awemeRawAdLIZIZ;
        if (!C0SK2.LJ(this.LLLLIIL, LJJL()) && !LJLJJI(this.LLLLIIL)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C786410Ut5.LLLLZLL(this.LLJ, i);
            LJLILLLLZI();
            Aweme aweme = this.LLLLIIL;
            if (this.LLLLLLIL && this.LLJ.getVisibility() == 0) {
                LinearLayout linearLayout = this.LLLLLLJ;
                if (linearLayout != null) {
                    C786410Ut5.LJZL(0, linearLayout);
                }
                TuxTextView tuxTextView = this.LLLLLLL;
                if (tuxTextView != null) {
                    if (aweme != null && (awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme)) != null) {
                        xiaomiSupplementalInfo = awemeRawAdLIZIZ.getXiaomiSupplementalInfo();
                    } else {
                        xiaomiSupplementalInfo = null;
                    }
                    tuxTextView.setText(xiaomiSupplementalInfo);
                }
            } else {
                LinearLayout linearLayout2 = this.LLLLLLJ;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
            }
            if (LJJL()) {
                if (C1599640rjG.LIZIZ.fv(this.LLILLJJLI.getItem())) {
                    C786410Ut5.LJLLLLLL(this.LLJ.getVisibility(), this.LLJIJIL);
                    return;
                } else {
                    C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
                    C786410Ut5.LLLLZLL(this.LLJ, 8);
                    return;
                }
            }
            return;
        }
        LinearLayout linearLayout3 = this.LLLLLLJ;
        if (linearLayout3 != null) {
            C786410Ut5.LJZL(8, linearLayout3);
        }
        if (!this.LLILLJJLI.LLJILJIL && i == 0) {
            C786410Ut5.LLLLZLL(this.LLJ, 4);
        } else {
            C786410Ut5.LLLLZLL(this.LLJ, i);
        }
        if (LJJL()) {
            if (C1599640rjG.LIZIZ.fv(this.LLILLJJLI.getItem())) {
                C786410Ut5.LJLLLLLL(this.LLJ.getVisibility(), this.LLJIJIL);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LLJIJIL);
                C786410Ut5.LLLLZLL(this.LLJ, 8);
            }
        }
        LJLILLLLZI();
    }

    public final void LJLIL(int i) {
        TuxTextView tuxTextView;
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme = this.LLLLIIL;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false) && (tuxTextView = this.LLLLLLLZIL) != null) {
            tuxTextView.setTuxFont(i);
        }
        TuxTextView tuxTextView2 = this.LLLLLLL;
        if (tuxTextView2 != null) {
            tuxTextView2.setTuxFont(i);
        }
    }

    public final void LJLJI(C718800SHm c718800SHm) {
        c718800SHm.LJI = true;
        int iIntValue = 0;
        c718800SHm.LJII = LJJJLIIL(false);
        c718800SHm.LJIIIZ(LJJJJI());
        Integer numLIZJ = C1308910kAL.LIZJ(LJJJJ(), this.LLJ.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        }
        c718800SHm.LJIIIIZZ(iIntValue);
        c718800SHm.LJIILIIL = new AwS555S0100000_11(this, 1494);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJLJJI(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = this;
            boolean r0 = r3.LJJL()
            r2 = 0
            if (r0 != 0) goto L17
            r1 = 1
            if (r4 == 0) goto L18
            boolean r0 = com.ss.android.ugc.aweme.feed.model.AwemeExtKt.isAdTraffic(r4)
            if (r0 == r1) goto L17
            boolean r0 = X.C582980Mtk.LIZIZ(r4)
            if (r0 != r1) goto L18
        L16:
            r2 = 1
        L17:
            return r2
        L18:
            boolean r0 = X.C295600BiI.LIZIZ(r4)
            if (r0 != 0) goto L16
            boolean r0 = X.C0BUZ.LIZ(r4)
            if (r0 == 0) goto L17
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJLJJI(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Type inference failed for: r0v77, types: [T, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJLL(final X.C0S64 r21) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJLJJLL(X.0S64):void");
    }

    public final void LJLLLL(Aweme aweme) {
        boolean z;
        String desc;
        int length;
        String str;
        String imprId;
        C718840SHq c718840SHqLIZ;
        Integer numValueOf;
        String str2;
        Fragment fragment;
        Integer numValueOf2;
        C0S5R c0s5r;
        C718800SHm c718800SHm;
        AwemeTextLabelModel label;
        Context context;
        Integer numLIZJ;
        LJZ(aweme);
        LJJJJZI().LJIL(this.LLJJL, this.LLJJLIIIJLLLLLLLZ, Integer.valueOf(LJJJJ()));
        if (aweme == null) {
            return;
        }
        this.LLLLIIL = aweme;
        String strLIZIZ = null;
        IGetApps iGetApps = (IGetApps) PluggableExtentionKt.pluggableSpi$default(IGetApps.class, false, false, false, 14, null);
        if (iGetApps != null && iGetApps.LIZJ(aweme)) {
            z = true;
        } else {
            z = false;
        }
        this.LLLLLLIL = z;
        LJJJJZI().LLILLL(aweme);
        this.LLLIZZ = null;
        LJJJJZI().LJJIIZI(null);
        LJJJJZI().LJIILLIIL(null);
        LJJJJZI().LJJIJ(null);
        LJJJJZI().LJJ(null);
        LJJJJZI().LJJIFFI(null);
        this.LLLILZ = null;
        this.LLLIILIL = null;
        this.LLLIL = null;
        this.LLLILZJ = null;
        this.LLLILZLLLI = null;
        this.LLJZIJLIL = null;
        this.LLL = null;
        LJL(aweme, null);
        this.LLILLJJLI.LLJJLIIIJLLLLLLLZ = this;
        LJLIIL(8);
        if (C294240Bg6.LIZ()) {
            C786410Ut5.LJZL(8, this.LLILZLL);
        }
        LJZI(aweme, null, false);
        ClientText originalClientText = aweme.getOriginalClientText();
        int iIntValue = -1;
        if ((originalClientText != null && (desc = originalClientText.markupText) != null) || (desc = aweme.getDesc()) != null) {
            length = desc.length();
        } else {
            length = -1;
        }
        Npth.addTag("video_desc_length", String.valueOf(length));
        if (originalClientText != null) {
            if (this.LLLLIIL != null) {
                this.LLLL.LJ();
            }
            C0SF9 c0sf9 = this.LLLF;
            c0sf9.LJIIIIZZ = null;
            c0sf9.LJIIIZ = false;
            c0sf9.LJ = null;
            c0sf9.LJFF = null;
            c0sf9.LJI = null;
            c0sf9.LJII = null;
            LJJLJ();
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        VideoItemParams item = this.LLILLJJLI.getItem();
        if (item != null) {
            str = item.mEventType;
        } else {
            str = null;
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("aweme_id", aweme.getAid());
        c2344009Gk.LIZJ(((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme) ? 1 : 0, "is_ad");
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean != null) {
            imprId = logPbBean.getImprId();
        } else {
            imprId = null;
        }
        c2344009Gk.LJIIIIZZ("impr_id", imprId);
        C20684815ws.LJIILLIIL("no_original_client_text", c2344009Gk.LIZ);
        C21415018rM c21415018rM = this.LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        float fLJIIJ = C12ES.LJIIJ(c21415018rM.getContext()) - this.LLILLL.wQ2();
        if (this.LLILLJJLI.FQ2()) {
            C0SID c0sid = C0SID.LIZ;
            C21415018rM c21415018rM2 = this.LLJZ;
            if (c21415018rM2 == null) {
                c21415018rM2 = null;
            }
            Context context2 = c21415018rM2.getContext();
            String contentDesc = aweme.getContentDesc();
            List<TextExtraStruct> contentDescExtra = aweme.getContentDescExtra();
            c0sid.getClass();
            c718840SHqLIZ = C0SID.LIZIZ(context2, contentDesc, contentDescExtra);
        } else {
            C0SID c0sid2 = C0SID.LIZ;
            C21415018rM c21415018rM3 = this.LLJZ;
            if (c21415018rM3 == null) {
                c21415018rM3 = null;
            }
            Context context3 = c21415018rM3.getContext();
            String desc2 = aweme.getDesc();
            List<TextExtraStruct> textExtra = aweme.getTextExtra();
            c0sid2.getClass();
            c718840SHqLIZ = C0SID.LIZ(context3, desc2, textExtra);
        }
        C0SFC c0sfc = C0SFC.LIZIZ;
        C21415018rM c21415018rM4 = this.LLJZ;
        if (c21415018rM4 == null) {
            c21415018rM4 = null;
        }
        Context context4 = c21415018rM4.getContext();
        VideoItemParams item2 = this.LLILLJJLI.getItem();
        if (C0SKM.LJ()) {
            numValueOf = Integer.valueOf(this.LLJJLIIIJLLLLLLLZ);
        } else {
            numValueOf = null;
        }
        C0SIM.LIZIZ(c718840SHqLIZ, context4, aweme, item2, numValueOf);
        VideoItemParams item3 = this.LLILLJJLI.getItem();
        if (item3 == null || (str2 = item3.mEventType) == null) {
            str2 = "";
        }
        C21415018rM c21415018rM5 = this.LLJZ;
        if (c21415018rM5 == null) {
            c21415018rM5 = null;
        }
        C0SIM.LIZ(c718840SHqLIZ, str2, c21415018rM5);
        C21415018rM c21415018rM6 = this.LLJZ;
        if (c21415018rM6 == null) {
            c21415018rM6 = null;
        }
        C718840SHq c718840SHqLJFF = c0sfc.LJFF(c718840SHqLIZ, c21415018rM6.getContext(), aweme);
        VideoItemParams item4 = this.LLILLJJLI.getItem();
        if (item4 != null) {
            fragment = item4.fragment;
        } else {
            fragment = null;
        }
        if (C1599640rjG.LIZIZ.Pu(fragment)) {
            PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
            if (photoModeImageInfo != null) {
                strLIZIZ = photoModeImageInfo.getTitle();
            }
            if (C123100dR.LIZ(strLIZIZ)) {
                AwemeBizExtKt.setPhotoModeTitleLine(aweme, new SpannableString(strLIZIZ));
                if (C123100dR.LIZ(aweme.getDesc())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append('\n');
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C0SIR c0sir = new C0SIR(strLIZIZ, (List) null, C0SIK.PURE, 10);
                List<Object> list = c0sir.LIZIZ;
                list.add(new C444920HcY(42, false));
                if (fragment != null && (context = fragment.getContext()) != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, context)) != null) {
                    iIntValue = numLIZJ.intValue();
                }
                list.add(new ForegroundColorSpan(iIntValue));
                c718840SHqLJFF.LIZ(new AwS555S0100000_11(c0sir, 1488));
            }
            c718840SHqLJFF.LJ(AFwS243S0000000_11.get$arr$(677));
        }
        String strLIZLLL = c718840SHqLJFF.LIZLLL();
        C21415018rM c21415018rM7 = this.LLJZ;
        if (c21415018rM7 == null) {
            c21415018rM7 = null;
        }
        Context context5 = c21415018rM7.getContext();
        int iLJJJJLI = LJJJJLI();
        if (this.LLJLIL) {
            numValueOf2 = Integer.valueOf(R.attr.av1);
        } else if (!LJJL()) {
            numValueOf2 = null;
        } else {
            numValueOf2 = Integer.valueOf(R.attr.a1h);
        }
        c718840SHqLJFF.LJ(new C0SIG(aweme, iLJJJJLI, context5, fLJIIJ, strLIZLLL, numValueOf2));
        C21415018rM c21415018rM8 = this.LLJZ;
        if (c21415018rM8 == null) {
            c21415018rM8 = null;
        }
        Context context6 = c21415018rM8.getContext();
        AwS590S0100000_11 awS590S0100000_11 = new AwS590S0100000_11(this, 462);
        int iLJJJI = LJJJI();
        if (C0HD0.LIZ()) {
            c718840SHqLJFF.LJ(new C718900SHw(awS590S0100000_11, iLJJJI, context6, fLJIIJ, strLIZLLL));
        }
        c718840SHqLJFF.LJ(new AwS590S0100000_11(aweme, 454));
        C21415018rM c21415018rM9 = this.LLJZ;
        if (c21415018rM9 == null) {
            c21415018rM9 = null;
        }
        Context context7 = c21415018rM9.getContext();
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        if (awemeRawAd != null && (label = awemeRawAd.getLabel()) != null && label.getCompliancePosition() == 2) {
            c718840SHqLJFF.LIZ(new AwS412S0200000_11(context7, aweme, 76));
        }
        c718840SHqLJFF.LIZIZ = new AwS377S0200000_11(this, aweme, 125);
        C0SF9 c0sf92 = this.LLLF;
        c0sf92.LJIIIIZZ = null;
        c0sf92.LJIIIZ = false;
        c0sf92.LJ = c718840SHqLJFF;
        c0sf92.LJFF = null;
        c0sf92.LJI = null;
        c0sf92.LJII = null;
        C718800SHm c718800SHm2 = new C718800SHm(c718840SHqLJFF.LIZIZ());
        if (LJLJJI(aweme)) {
            LJLJI(c718800SHm2);
        }
        this.LLJZIJLIL = c718800SHm2;
        if (this.LLILLJJLI.FQ2() && !this.LLILLJJLI.GQ2() && (c718800SHm = this.LLJZIJLIL) != null) {
            c718800SHm.LIZLLL = c718840SHqLJFF.LIZJ();
        }
        C0S64 c0s64 = this.LLILLJJLI.LLJJL;
        if (c0s64 != null && (c0s5r = c0s64.LIZ) != null && c0s5r.LIZJ) {
            LJJLJLI(this.LLL, aweme, true);
        } else {
            LJJLJLI(this.LLJZIJLIL, aweme, false);
        }
        this.LLJI.getLayoutParams().height = -2;
    }

    public final void LJLLLLLL(Layout layout) {
        Layout textLayout;
        String string;
        CharSequence text;
        C21415018rM titleView;
        Aweme aweme = this.LLLLIIL;
        int length = 0;
        if (aweme != null && !AwemeExtKt.isPhotoMode(aweme)) {
            return;
        }
        Aweme aweme2 = this.LLLLIIL;
        if (aweme2 != null && aweme2.isAd()) {
            return;
        }
        HashMap<String, String> map = this.LLILLJJLI.LLJJJJ;
        if (map == null) {
            map = new HashMap<>();
        }
        if (LJJJJZI().LJIJJLI() && (titleView = LJJJJZI().getTitleView()) != null) {
            textLayout = titleView.getTextLayout();
        } else {
            textLayout = null;
        }
        int iLJJJJJ = LJJJJJ(textLayout);
        int iLJJJJJ2 = LJJJJJ(layout);
        if (layout == null || (text = layout.getText()) == null || text.length() == 0) {
            string = "";
        } else {
            string = layout.getText().subSequence(0, C13LZ.LJ(LJJJJJ(layout), 0, layout.getText().length())).toString();
        }
        if (string.length() != 0) {
            length = C720080SMk.LIZ(new Regex("@\\S+").replace(string, "")).length();
        }
        map.put("displayed_title_length", String.valueOf(iLJJJJJ));
        map.put("displayed_description_length", String.valueOf(iLJJJJJ2));
        map.put("displayed_desc_without_hashtag_mention_emoji_length", String.valueOf(length));
        this.LLILLJJLI.LLJJJJ = map;
    }

    public final void LJLZ(C0SKK c0skk) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (this.LLJ.getVisibility() != 0) {
            return;
        }
        LinearLayout linearLayout = this.LLLLLLLLLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        TranslationAbility translationAbilityLJJJLZIJ = LJJJLZIJ();
        if (translationAbilityLJJJLZIJ != null) {
            translationAbilityLJJJLZIJ.rA2(4);
        }
        if (c0skk == null) {
            i = -1;
        } else {
            i = C0SI7.LIZ[c0skk.ordinal()];
        }
        Integer numValueOf = null;
        if (i != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            throw new C1954807lC();
                        }
                    } else {
                        TuxTextView tuxTextView = this.LLLLLLLZIL;
                        if (tuxTextView != null) {
                            tuxTextView.setText(this.LLLLZLLIL);
                            C786410Ut5.h9(tuxTextView, new ACListenerS146S0100000_11(this, 66));
                            return;
                        }
                        return;
                    }
                } else {
                    TuxTextView tuxTextView2 = this.LLLLLLLZIL;
                    if (tuxTextView2 != null) {
                        tuxTextView2.setText(this.LLLLZLL);
                        C786410Ut5.h9(tuxTextView2, null);
                        return;
                    }
                    return;
                }
            } else {
                TuxTextView tuxTextView3 = this.LLLLLLLZIL;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(this.LLLLZIL);
                    C786410Ut5.h9(tuxTextView3, new ACListenerS146S0100000_11(this, 67));
                    return;
                }
                return;
            }
        }
        LinearLayout linearLayout2 = this.LLLLLLLLLL;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
        LinearLayout linearLayout3 = this.LLLLLLLLL;
        if (linearLayout3 != null && (layoutParams2 = linearLayout3.getLayoutParams()) != null) {
            layoutParams2.width = (int) LJII(this, 0.0f, this.LLJ.getText().toString(), false, false, 25);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSeeXXXButtonText, not show translate button, state:");
        sbLIZ.append(c0skk);
        sbLIZ.append(", width:");
        LinearLayout linearLayout4 = this.LLLLLLLLL;
        if (linearLayout4 != null && (layoutParams = linearLayout4.getLayoutParams()) != null) {
            numValueOf = Integer.valueOf(layoutParams.width);
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", translData:");
        sbLIZ.append(this.LLLLIIIILLL);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJZ(com.ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJZ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public final void LJZL(boolean z) {
        View view;
        ViewGroup.LayoutParams layoutParams;
        Integer numValueOf;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        Drawable drawable;
        Drawable drawable2;
        C0SJA c0sjaLJJJLIIL = LJJJLIIL(z);
        this.LLJ.setText(c0sjaLJJJLIIL.getText());
        Float fValueOf = null;
        if ((c0sjaLJJJLIIL instanceof C719020SIi) && LJIIIZ()) {
            boolean zLIZLLL = C426750GoL.LIZLLL(this.LLJ.getContext());
            TuxTextView tuxTextView = this.LLJ;
            if (zLIZLLL) {
                drawable = (Drawable) this.LLLLLL.getValue();
                drawable2 = null;
            } else {
                drawable = null;
                drawable2 = (Drawable) this.LLLLLL.getValue();
            }
            tuxTextView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, drawable2, (Drawable) null);
            this.LLJ.setCompoundDrawablePadding(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        } else {
            this.LLJ.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            this.LLJ.setCompoundDrawablePadding(0);
        }
        C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
        Aweme aweme = this.LLLLIIL;
        c299210Bo7.getClass();
        if (C299210Bo7.LIZ(aweme, false)) {
            LinearLayout linearLayout = this.LLLLLLLLL;
            if (linearLayout != null && (layoutParams3 = linearLayout.getLayoutParams()) != null) {
                layoutParams3.width = (int) LJII(this, 0.0f, c0sjaLJJJLIIL.getText(), LJIIJ(this.LLLLIIL), false, 25);
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateToggleViewText, width:");
            LinearLayout linearLayout2 = this.LLLLLLLLL;
            if (linearLayout2 != null && (layoutParams2 = linearLayout2.getLayoutParams()) != null) {
                numValueOf = Integer.valueOf(layoutParams2.width);
            } else {
                numValueOf = null;
            }
            sbLIZ.append(numValueOf);
            sbLIZ.append(", translate text size:");
            TuxTextView tuxTextView2 = this.LLLLLLLZIL;
            if (tuxTextView2 != null) {
                fValueOf = Float.valueOf(tuxTextView2.getTextSize());
            }
            sbLIZ.append(fValueOf);
            sbLIZ.append(", toggle text size:");
            sbLIZ.append(this.LLJ.getTextSize());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (LJJL() && (layoutParams = (view = this.LLJIJIL).getLayoutParams()) != null) {
            Paint.FontMetrics fontMetrics = this.LLJ.getPaint().getFontMetrics();
            layoutParams.height = ((int) (fontMetrics.descent - fontMetrics.ascent)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            C786410Ut5.W5(view, layoutParams);
        }
    }

    public static C0SJF LJJLIL(Aweme aweme, ClientText clientText) {
        String str;
        String strLIZ = clientText.markupText;
        if (AwemeExtKt.isPhotoMode(aweme) && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJI(aweme)) {
            strLIZ = C719030SIj.LIZ(strLIZ);
        }
        List list = clientText.textExtra;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        C0SJF c0sjfLIZJ = C719200SJa.LIZJ(strLIZ, list);
        C013C c013c = new C013C();
        c0sjfLIZJ.LIZLLL(new C718990SIf(c013c));
        if (c013c.element) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            ClientText originalClientText = aweme.getOriginalClientText();
            if (originalClientText != null) {
                str = originalClientText.markupText;
            } else {
                str = null;
            }
            c2344009Gk.LJIIIIZZ("markup_text", str);
            c2344009Gk.LJIIIIZZ("aweme_id", aweme.getAid());
            C20684815ws.LJIILLIIL("unknown_tag_in_markup_text", c2344009Gk.LIZ);
        }
        return c0sjfLIZJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    @Override // X.InterfaceC718870SHt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<java.lang.Integer, java.lang.Integer> LJJII(com.ss.android.ugc.aweme.feed.model.Aweme r22, X.C0S64 r23) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJII(com.ss.android.ugc.aweme.feed.model.Aweme, X.0S64):kotlin.Pair");
    }

    public final int LJJJJL(int i, boolean z) {
        if (LJJL()) {
            return i + this.LLJ.getHeight() + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        }
        int height = 0;
        if (this.LLILLJJLI.xQ2()) {
            if (this.LLILLJJLI.LLJILJIL) {
                height = this.LLJ.getHeight();
            }
            int i2 = this.LLLJL;
            if (i > i2) {
                i = i2;
            }
            return i + height;
        }
        if (z) {
            height = this.LLJ.getHeight();
        }
        int i3 = this.LLLJL;
        if (i > i3) {
            i = i3;
        }
        return i + height;
    }

    public final void LJJLIIIJLJLI(C710300Rtc c710300Rtc, boolean z) {
        if (C277370Atz.LIZ() && c710300Rtc != null && z && this.LLLLZ) {
            C736680Sv4.LJIJJ(this.LLILZ, new AwS377S0200000_11(c710300Rtc, this, 123));
            this.LLLLZ = false;
        }
    }

    public final void LJJLL(final Aweme aweme, final ClientText clientText) {
        if (this.LLLF.LJI != null && this.LLJZIJLIL != null) {
            LJLJJL();
            this.LLJI.getLayoutParams().height = -2;
        } else {
            this.LLLL.LIZ(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0SF5
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshOriginalLayout$1");
                    C718770SHj c718770SHj = this.LL;
                    Aweme aweme2 = aweme;
                    ClientText clientText2 = clientText;
                    C0SJF c0sjfLJJLIL = c718770SHj.LLLF.LJI;
                    if (c0sjfLJJLIL == null) {
                        c0sjfLJJLIL = C718770SHj.LJJLIL(aweme2, clientText2);
                    }
                    C718770SHj c718770SHj2 = this.LL;
                    Aweme aweme3 = aweme;
                    C718800SHm c718800SHmLJIILIIL = c718770SHj2.LLJZIJLIL;
                    if (c718800SHmLJIILIIL == null) {
                        c718800SHmLJIILIIL = c718770SHj2.LJIILIIL(c0sjfLJJLIL, aweme3, null);
                    }
                    Pair pair = new Pair(c0sjfLJJLIL, c718800SHmLJIILIIL);
                    C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshOriginalLayout$1");
                    return pair;
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new C09JN(this) { // from class: X.0SF4
                public final /* synthetic */ C718770SHj LLILLJJLI;

                {
                    this.LLILLJJLI = this;
                }

                @Override // X.C09JN
                public final void accept(Object obj) {
                    String aid;
                    Aweme aweme2;
                    C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshOriginalLayout$2");
                    Pair pair = (Pair) obj;
                    String aid2 = aweme.getAid();
                    VideoItemParams item = this.LLILLJJLI.LLILLJJLI.getItem();
                    if (item != null && (aweme2 = item.getAweme()) != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        this.LLILLJJLI.LLLF.LJI = (C0SJF) pair.getFirst();
                        this.LLILLJJLI.LLJZIJLIL = (C718800SHm) pair.getSecond();
                        this.LLILLJJLI.LJLJJL();
                        this.LLILLJJLI.LLJI.getLayoutParams().height = -2;
                    }
                    C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshOriginalLayout$2");
                }
            }));
        }
    }

    public final void LJJZ(Aweme aweme, ClientText clientText) {
        C0SF9 c0sf9 = this.LLLF;
        if (c0sf9.LJI != null && c0sf9.LJFF != null) {
            C0S64 c0s64 = this.LLLLIIIILLL;
            if (c0s64 != null) {
                LJLJJLL(c0s64);
                return;
            }
            return;
        }
        this.LLLL.LIZ(AbstractC19484711Kz.LJIJI(new ACallableS179S0300000_11(this, aweme, clientText, 1)).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIJZLJL(new AfS147S0200000_11(this, aweme, 9)));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL(com.ss.android.ugc.aweme.feed.model.Aweme r6, X.C0S64 r7) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJL(com.ss.android.ugc.aweme.feed.model.Aweme, X.0S64):void");
    }

    public final void LJLIIIL(C710300Rtc c710300Rtc, boolean z) {
        Aweme aweme;
        String aid;
        boolean z2;
        LinearLayout.LayoutParams layoutParams;
        int i;
        String requestId;
        String str;
        Music music;
        CharSequence text;
        IPhotoSlidesAbility iPhotoSlidesAbility;
        InterfaceC710220RtU interfaceC710220RtUYn;
        VideoItemParams item = this.LLILLJJLI.getItem();
        String str2 = null;
        if (item != null) {
            aweme = item.getAweme();
        } else {
            aweme = null;
        }
        Object objValueOf = "";
        if (aweme == null || (aid = aweme.getAid()) == null) {
            aid = "";
        }
        Layout layout = c710300Rtc.LIZIZ;
        C21415018rM c21415018rM = this.LLJZ;
        if (c21415018rM == null) {
            c21415018rM = null;
        }
        c21415018rM.setTextLayout(layout);
        if (C0SKM.LIZIZ() && (iPhotoSlidesAbility = (IPhotoSlidesAbility) this.LLJJJJJIL.getValue()) != null && (interfaceC710220RtUYn = iPhotoSlidesAbility.yn()) != null) {
            interfaceC710220RtUYn.LJFF(aid);
        }
        LJLLLLLL(layout);
        this.LLLIZZ = c710300Rtc;
        int i2 = Integer.MAX_VALUE;
        if (LJJL()) {
            this.LLLJL = Integer.MAX_VALUE;
        }
        C21415018rM c21415018rM2 = this.LLJZ;
        if (c21415018rM2 == null) {
            c21415018rM2 = null;
        }
        if (z) {
            i2 = this.LLLJL;
        }
        c21415018rM2.setMaxHeight(i2);
        int i3 = 0;
        if (LJJJJZI().LJIJJLI() && ((text = layout.getText()) == null || text.length() == 0)) {
            z2 = true;
        } else {
            z2 = false;
        }
        C21415018rM c21415018rM3 = this.LLJZ;
        if (c21415018rM3 == null) {
            c21415018rM3 = null;
        }
        if (z2) {
            i3 = 8;
        }
        C786410Ut5.LLLLZIL(c21415018rM3, i3);
        if (C294240Bg6.LIZ()) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.LLILZIL.getLayoutParams();
            layoutParams2.gravity = 80;
            C786410Ut5.d6(this.LLILZIL, layoutParams2);
            if (this.LLILLJJLI.xQ2()) {
                LJLLL();
            }
        } else {
            try {
                int paragraphDirection = layout.getParagraphDirection(layout.getLineCount() - 1);
                ViewGroup.LayoutParams layoutParams3 = this.LLJ.getLayoutParams();
                if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams3;
                    if (layoutParams != null) {
                        if (LJJL()) {
                            i = 8388691;
                        } else if (paragraphDirection == 1) {
                            i = 85;
                        } else {
                            i = 83;
                        }
                        layoutParams.gravity = i;
                    }
                } else {
                    layoutParams = null;
                }
                C786410Ut5.R6(this.LLJ, layoutParams);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2276411E8h c2276411E8h = C2276411E8h.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VideoDescViewmaxlines:");
                sbLIZ.append(this.LLLJIL);
                c2276411E8h.LJFF(C2188811AlT.LIZIZ(sbLIZ), e);
            }
        }
        if (!Intrinsics.LJFF(c710300Rtc.LIZ, aid)) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("function_name", "mismatch");
            c2344009Gk.LJIIIIZZ("aweme_id", aid);
            if (aweme != null && (music = aweme.getMusic()) != null) {
                objValueOf = Long.valueOf(music.getId());
            }
            c2344009Gk.LJ(objValueOf, "music_id");
            c2344009Gk.LJIIIIZZ("layout_aid", c710300Rtc.LIZ);
            if (aweme != null) {
                requestId = aweme.getRequestId();
            } else {
                requestId = null;
            }
            c2344009Gk.LJIIIIZZ("request_id", requestId);
            String str3 = "1";
            if (c710300Rtc.LIZJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("is_full", str);
            if (!c710300Rtc.LIZLLL) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ("isTrans", str3);
            VideoItemParams item2 = this.LLILLJJLI.getItem();
            if (item2 != null) {
                str2 = item2.mEventType;
            }
            c2344009Gk.LJIIIIZZ("enter_from", str2);
            Map<String, String> map = c2344009Gk.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("desc_layout_id_not_match ");
            sbLIZ2.append(c710300Rtc.LIZ);
            sbLIZ2.append(" != ");
            sbLIZ2.append(aid);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            Npth.reportBizException("NewVideoDescDelegate", new Throwable(strLIZIZ), strLIZIZ, map, true);
            C20684815ws.LJIILLIIL("feed_desc_monitor", map);
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) this.LLJLL.getValue();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("message:");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", params:");
            sbLIZ3.append(map);
            abstractC1604130rqV.LJ(C2188811AlT.LIZIZ(sbLIZ3));
        }
        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
        C0SZC.LIZIZ("NewVideoDescDelegate setLayout: awemeId: " + c710300Rtc.LIZ + " text " + ((Object) c710300Rtc.LIZIZ.getText()) + ", isFull: " + c710300Rtc.LIZJ + ", isTrans: " + c710300Rtc.LIZLLL + " isFullContent: " + z + " state: " + LJJJJIZL().name());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0760  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x076d  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0779  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x05d7 A[EDGE_INSN: B:411:0x05d7->B:326:0x05d7 BREAK  A[LOOP:1: B:188:0x03b2->B:196:0x03d0], SYNTHETIC] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C718800SHm LJIILIIL(X.C0SJF r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, X.C0S64 r24) {
        /*
            Method dump skipped, instruction units count: 1973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJIILIIL(X.0SJF, com.ss.android.ugc.aweme.feed.model.Aweme, X.0S64):X.0SHm");
    }

    public final void LJJLJLI(final C718800SHm c718800SHm, final Aweme aweme, final boolean z) {
        final C0SJF c0sjf;
        if (c718800SHm == null) {
            return;
        }
        C0SIV c0siv = this.LL.LLLLJ;
        if (c0siv != null) {
            c0siv.LLIIIZ();
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        final Pair<Layout, Layout> pairLJLL = LJLL(c718800SHm, this.LLLFFI, z, aweme, false, false);
        C0SF9 c0sf9 = this.LLLF;
        if (z) {
            c0sjf = c0sf9.LJII;
        } else {
            c0sjf = c0sf9.LJI;
        }
        C0SFO c0sfo = C0SFR.LIZ;
        if (!LJJL() && c0sjf != null && aweme != null && AwemeBizExtKt.getDescWithHashTagTruncation(aweme) != null && AwemeExtKt.isPhotoMode(aweme) && !aweme.isAd() && C04W9.LIZIZ) {
            C11NJ c11nj = this.LLLLII;
            if (c11nj != null) {
                c11nj.LJ();
            } else {
                c11nj = new C11NJ();
                this.LLLLII = c11nj;
            }
            c11nj.LIZ(AbstractC19484711Kz.LJIJI(new Callable() { // from class: X.0SFE
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v1, types: [T, kotlin.Pair<android.text.Layout, android.text.Layout>] */
                /* JADX WARN: Type inference failed for: r2v2, types: [T, X.0SHm] */
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    CharSequence text;
                    CharSequence text2;
                    C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$1");
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C0SFO c0sfo2 = C0SFR.LIZ;
                    c0sfo2.LIZ(null, null, new C050B(jCurrentTimeMillis2, jCurrentTimeMillis, aweme, z));
                    C259800zU c259800zU = new C259800zU();
                    c259800zU.element = pairLJLL;
                    C259800zU c259800zU2 = new C259800zU();
                    c259800zU2.element = c718800SHm;
                    if (pairLJLL.getSecond() == null) {
                        pairLJLL.getFirst();
                    }
                    Aweme aweme2 = aweme;
                    C0SJF c0sjf2 = c0sjf;
                    Pair<Layout, Layout> pair = pairLJLL;
                    C718770SHj c718770SHj = this;
                    boolean z2 = z;
                    C0SFR.LIZ(aweme2.getAid(), c0sjf2, pair.getFirst(), "refreshDesc", C718770SHj.LJIIIIZZ(c718770SHj, null, false, null, 7), new C0SFD(c718770SHj, aweme2, z2, c259800zU2, c259800zU));
                    c0sfo2.LIZ(null, null, new C050C(jCurrentTimeMillis2, aweme2, z2));
                    Pair pair2 = ((Pair) c259800zU.element).getSecond() != null ? new Pair(pair.getFirst(), ((Pair) c259800zU.element).getSecond()) : (Pair) c259800zU.element;
                    Layout layout = (Layout) pair2.getSecond();
                    CharSequence charSequence = "";
                    if (layout == null || (text = layout.getText()) == null) {
                        text = "";
                    }
                    Layout second = pairLJLL.getSecond();
                    if (second != null && (text2 = second.getText()) != null) {
                        charSequence = text2;
                    }
                    this.LLILLJJLI.LLJJJJJIL = Math.abs(charSequence.length() - text.length()) > 3;
                    C0SFF c0sff = new C0SFF(pair2, (C718800SHm) c259800zU2.element);
                    C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$1");
                    return c0sff;
                }
            }).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new C09JN() { // from class: X.0SFL
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String aid;
                    Aweme aweme2;
                    C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$2");
                    C0SFF c0sff = (C0SFF) obj;
                    Pair<Layout, Layout> pair = c0sff.LIZ;
                    String aid2 = aweme.getAid();
                    VideoItemParams item = this.LLILLJJLI.getItem();
                    if (item != null && (aweme2 = item.getAweme()) != null) {
                        aid = aweme2.getAid();
                    } else {
                        aid = null;
                    }
                    if (Intrinsics.LJFF(aid2, aid)) {
                        this.LJJLIIIJJIZ(pair.getFirst(), pair.getSecond(), c0sff.LIZIZ, z);
                        Layout second = pair.getSecond();
                        if (second == null) {
                            second = pair.getFirst();
                        }
                        if (!this.LLILLJJLI.LLJILJIL && (C0SI6.LIZ(second) || this.LJJJJZI().LJJIJIIJI())) {
                            C718770SHj c718770SHj = this;
                            VideoDescVM videoDescVM = c718770SHj.LLILLJJLI;
                            videoDescVM.LLJJJIL = true;
                            videoDescVM.LLILZ = true;
                            c718770SHj.LJZL(false);
                            this.LJLIIL(0);
                        } else {
                            C718770SHj c718770SHj2 = this;
                            VideoDescVM videoDescVM2 = c718770SHj2.LLILLJJLI;
                            videoDescVM2.LLJJJIL = false;
                            videoDescVM2.LLILZ = false;
                            c718770SHj2.LJLIIL(8);
                        }
                        C0SFR.LIZ.LIZLLL(null, null, new C0SFK(this, aweme, pairLJLL, jCurrentTimeMillis));
                        this.LJJLIIIJL(z, pair, aweme, jCurrentTimeMillis);
                        this.LJLLLLLL(second);
                    }
                    C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$2");
                }
            }, new C09JN() { // from class: X.0SFM
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$3");
                    C0SFR.LIZ.LIZJ(null, (Throwable) obj, AFwS198S0000000_11.get$arr$(421));
                    this.LL.LJJLIIIJJIZ(pairLJLL.getFirst(), pairLJLL.getSecond(), c718800SHm, z);
                    this.LL.LJJLIIIJL(z, pairLJLL, aweme, jCurrentTimeMillis);
                    Layout second = pairLJLL.getSecond();
                    if (second == null) {
                        second = pairLJLL.getFirst();
                    }
                    this.LL.LJLLLLLL(second);
                    C1C7U.LIZIZ("NewVideoDescDelegate@fb8f.refreshDescLayoutWithHashTagTruncation$3");
                }
            }));
            return;
        }
        LJJLIIIJJIZ(pairLJLL.getFirst(), pairLJLL.getSecond(), c718800SHm, z);
        LJJLIIIJL(z, pairLJLL, aweme, jCurrentTimeMillis);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ed A[PHI: r8
      0x00ed: PHI (r8v1 X.0Rtc) = (r8v0 X.0Rtc), (r8v4 X.0Rtc) binds: [B:6:0x000f, B:35:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLJ(X.C710300Rtc r8, X.C710300Rtc r9, boolean r10) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJLJLJ(X.0Rtc, X.0Rtc, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013e  */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.04zO] */
    /* JADX WARN: Type inference failed for: r20v1, types: [com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService] */
    /* JADX WARN: Type inference failed for: r2v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r31v0, types: [X.0SHj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v101, types: [X.18rM] */
    /* JADX WARN: Type inference failed for: r3v103 */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v139 */
    /* JADX WARN: Type inference failed for: r3v36, types: [X.18rM] */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v72, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v93, types: [com.ss.android.ugc.feed.platform.cell.interact.mob.InteractAreaMobCommonAbility] */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r5v20, types: [X.0SIV] */
    /* JADX WARN: Type inference failed for: r5v29, types: [X.0SIV] */
    /* JADX WARN: Type inference failed for: r6v3, types: [X.0S5S] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r7v14, types: [X.04zN] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJLLL(final boolean r32, java.lang.String r33, com.ss.android.ugc.aweme.model.PostModeEntranceMechanism r34) {
        /*
            Method dump skipped, instruction units count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJLJLLL(boolean, java.lang.String, com.ss.android.ugc.aweme.model.PostModeEntranceMechanism):void");
    }

    public final void LJLLJ(C718800SHm c718800SHm, C0SIB c0sib, boolean z) {
        C0SJA c719020SIi;
        String str;
        int i = C0SI7.LIZIZ[c0sib.ordinal()];
        C21415018rM c21415018rM = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c718800SHm.LJII = C719190SIz.LIZ;
                    c718800SHm.LJIIJ = null;
                    return;
                }
                throw new C1954807lC();
            }
            c718800SHm.LJII = LJJJLIIL(false);
            if (!C0SK2.LJ(this.LLLLIIL, LJJL())) {
                C718860SHs c718860SHs = C718860SHs.LIZ;
                Aweme aweme = this.LLLLIIL;
                VideoItemParams item = this.LLILLJJLI.getItem();
                if (item != null) {
                    str = item.mEventType;
                } else {
                    str = null;
                }
                c718860SHs.getClass();
                if (!C718860SHs.LIZIZ(aweme, str)) {
                    c718800SHm.LJIIJ = null;
                    return;
                }
            }
            if (LJIIIZ()) {
                LIZJ(c718800SHm);
                return;
            } else {
                c718800SHm.LJIIJ = null;
                return;
            }
        }
        if (C295600BiI.LIZ()) {
            C21415018rM c21415018rM2 = this.LLJZ;
            if (c21415018rM2 != null) {
                c21415018rM = c21415018rM2;
            }
            c719020SIi = new C719070SIn(c21415018rM.getContext());
        } else {
            C21415018rM c21415018rM3 = this.LLJZ;
            if (c21415018rM3 != null) {
                c21415018rM = c21415018rM3;
            }
            c719020SIi = new C719020SIi(c21415018rM.getContext());
        }
        c718800SHm.LJII = c719020SIi;
        if (z) {
            LIZJ(c718800SHm);
            return;
        }
        C718860SHs c718860SHs2 = C718860SHs.LIZ;
        Aweme aweme2 = this.LLLLIIL;
        c718860SHs2.getClass();
        if (!C718860SHs.LJFF(aweme2)) {
            LIZJ(c718800SHm);
        } else {
            if (!LJIIIZ()) {
                return;
            }
            LIZJ(c718800SHm);
        }
    }

    public final void LJZI(Aweme aweme, C0S5S c0s5s, boolean z) {
        LJJJJZI().LJJIII(aweme, c0s5s, z, this.LLLFZ, LJJLI(), (int) LJII(this, 0.0f, null, false, true, 23), LJIIIIZZ(this, null, false, null, 7), this.LLLLLLZ, LJIIJ(aweme), this.LLLLZIL, this.LLLLZLL, this.LLLLZLLIL);
    }

    @Override // X.InterfaceC718870SHt
    public final boolean LJJIIJZLJL(Aweme aweme, PostModeEntranceMechanism postModeEntranceMechanism, Boolean bool, String str) {
        String aid;
        Aweme aweme2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleNavigateToPostModeDetail: ");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(", expand: ");
        sbLIZ.append(bool);
        sbLIZ.append(", hideMethod: ");
        sbLIZ.append(str);
        sbLIZ.append(", mech: ");
        sbLIZ.append(postModeEntranceMechanism);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!LJJL() && !LJJL()) {
            C1EE2 c1ee2 = C1EE2.LIZIZ;
            VideoItemParams item = this.LLILLJJLI.getItem();
            if (item != null) {
                aweme2 = item.getAweme();
            } else {
                aweme2 = null;
            }
            if (c1ee2.LJJLIIIJJIZ(aweme2) && !this.LLILLJJLI.yQ2(aweme)) {
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    VideoDescVM videoDescVM = this.LLILLJJLI;
                    videoDescVM.getClass();
                    videoDescVM.setState(new AwS377S0200000_11(aweme, postModeEntranceMechanism, 90));
                }
                if (postModeEntranceMechanism == PostModeEntranceMechanism.SEE_MORE_BTN && str != null) {
                    IPhotoModeAbility iPhotoModeAbility = (IPhotoModeAbility) this.LLJILLL.getValue();
                    this.LLILLJJLI.LLJ = str;
                    C15O7.LIZIZ(new C0SIQ(this, true, iPhotoModeAbility), C20684815ws.LJFF(), null);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJLIIIJJIZ(android.text.Layout r5, android.text.Layout r6, X.C718800SHm r7, boolean r8) {
        /*
            r4 = this;
            if (r6 != 0) goto Lc
            X.0SHt r0 = r4.LJJJJZI()
            boolean r0 = r0.LJJIJIIJI()
            if (r0 == 0) goto Lb5
        Lc:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r6, r5)
            if (r0 != 0) goto Lb5
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            r0.OQ2(r5, r6, r7, r8)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            boolean r0 = r0.LLJILJIL
            r3 = 0
            if (r0 != 0) goto L27
            if (r8 == 0) goto Lb1
            X.0Rtc r2 = r4.LLLILZLLLI
        L22:
            if (r6 == 0) goto L6f
            r4.LJLIIL(r3)
        L27:
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            r2 = 1
            r0.LLJJJIL = r2
            r0.LLILZ = r2
            r4.LJLIIL(r3)
            boolean r0 = r4.LJJL()
            if (r0 == 0) goto L3e
            X.0SHt r0 = r4.LJJJJZI()
            r0.LJJIJLIJ()
        L3e:
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r1 = r4.LLILLJJLI
            int r0 = r5.getLineCount()
            r2 = r2 ^ r8
            if (r2 == 0) goto L6b
            r1.LLJILJILJ = r0
        L49:
            r4.LJJLIIIJ(r5)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            boolean r0 = r0.LLJILJIL
            r4.LJZL(r0)
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            boolean r0 = r0.xQ2()
            if (r0 == 0) goto L6a
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            boolean r0 = r0.LLJILJIL
            if (r0 != 0) goto L67
            android.widget.LinearLayout r1 = r4.LLILZLL
            r0 = 4
            X.C786410Ut5.LJZL(r0, r1)
        L67:
            r4.LJLLL()
        L6a:
            return
        L6b:
            r1.getClass()
            goto L49
        L6f:
            if (r2 == 0) goto Lae
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LLLLIIL
            boolean r0 = r4.LJJL()
            boolean r0 = X.C0SK2.LJ(r1, r0)
            if (r0 != 0) goto L85
            android.text.Layout r0 = r2.LIZIZ
            boolean r0 = X.C0SI6.LIZIZ(r0)
            if (r0 == 0) goto Lae
        L85:
            X.0SHs r2 = X.C718860SHs.LIZ
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r4.LLLLIIL
            com.ss.android.ugc.aweme.feed.assem.desc.VideoDescVM r0 = r4.LLILLJJLI
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.mEventType
        L95:
            r2.getClass()
            boolean r0 = X.C718860SHs.LIZIZ(r1, r0)
            if (r0 != 0) goto Lae
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.LLLLIIL
            boolean r0 = r4.LJLJJI(r0)
            if (r0 != 0) goto Lae
            r0 = 0
        La7:
            r4.LJLIIL(r0)
            goto L27
        Lac:
            r0 = 0
            goto L95
        Lae:
            r0 = 8
            goto La7
        Lb1:
            X.0Rtc r2 = r4.LLLILZ
            goto L22
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJLIIIJJIZ(android.text.Layout, android.text.Layout, X.0SHm, boolean):void");
    }

    public final void LJJLIIIJL(boolean z, Pair<? extends Layout, ? extends Layout> pair, Aweme aweme, long j) {
        int length;
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis > 2000) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("function_name", "tryEllpsize");
            c2344009Gk.LIZLLL(jCurrentTimeMillis, "cost_time");
            ClientText originalClientText = aweme.getOriginalClientText();
            if (originalClientText != null && (str = originalClientText.markupText) != null) {
                length = str.length();
            } else {
                length = 0;
            }
            c2344009Gk.LIZJ(length, "desc_length");
            c2344009Gk.LJIIIIZZ("aweme_id", aweme.getAid());
            C20684815ws.LJIILLIIL("feed_desc_monitor", c2344009Gk.LIZ);
        }
        C710300Rtc c710300Rtc = null;
        if (z) {
            this.LLLF.LJIIIZ = true;
            this.LLLILZJ = new C710300Rtc(aweme.getAid(), pair.getFirst(), true, true);
            Layout second = pair.getSecond();
            if (second != null) {
                c710300Rtc = new C710300Rtc(aweme.getAid(), second, false, true);
            }
            this.LLLILZLLLI = c710300Rtc;
        } else {
            this.LLLF.LJIIIZ = false;
            this.LLLIILIL = new C710300Rtc(aweme.getAid(), pair.getFirst(), true, false);
            Layout second2 = pair.getSecond();
            if (second2 != null) {
                c710300Rtc = new C710300Rtc(aweme.getAid(), second2, false, false);
            }
            this.LLLILZ = c710300Rtc;
        }
        if (pair.getSecond() != null && !this.LLILLJJLI.LLJILJIL) {
            if (z) {
                C710300Rtc c710300Rtc2 = this.LLLILZLLLI;
                if (c710300Rtc2 != null) {
                    LJLIIIL(c710300Rtc2, false);
                }
            } else {
                C710300Rtc c710300Rtc3 = this.LLLILZ;
                if (c710300Rtc3 != null) {
                    LJLIIIL(c710300Rtc3, false);
                }
            }
        } else if (z) {
            C710300Rtc c710300Rtc4 = this.LLLILZJ;
            if (c710300Rtc4 != null) {
                LJLIIIL(c710300Rtc4, true);
            }
        } else {
            C710300Rtc c710300Rtc5 = this.LLLIILIL;
            if (c710300Rtc5 != null) {
                LJLIIIL(c710300Rtc5, true);
            }
        }
        LJJLIIIJLJLI(this.LLLIZZ, z);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    public static float LJIIIIZZ(C718770SHj c718770SHj, Aweme aweme, boolean z, C718800SHm c718800SHm, int i) {
        float fMeasureText;
        float fLIZIZ;
        float fMeasureText2;
        int iLIZIZ;
        String text;
        ViewGroup.LayoutParams layoutParams;
        TextPaint paint;
        AwemeRawAd awemeRawAdLIZIZ;
        String xiaomiSupplementalInfo;
        ViewGroup.LayoutParams layoutParams2;
        if ((i & 1) != 0) {
            aweme = c718770SHj.LLLLIIL;
        }
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            c718800SHm = null;
        }
        int iMeasureText = 0;
        String str = "";
        if (c718770SHj.LJJL()) {
            fMeasureText = 0.0f;
        } else {
            if (c718800SHm == null || (!C0SK2.LJ(c718770SHj.LLLLIIL, c718770SHj.LJJL()) && !c718770SHj.LJLJJI(c718770SHj.LLLLIIL))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(new C719020SIi(c718770SHj.LLJILJIL.getContext()).LIZ);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (c718770SHj.LJIIIZ()) {
                    fLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    fMeasureText2 = c718770SHj.LLJ.getPaint().measureText(strLIZIZ);
                } else {
                    fMeasureText = c718770SHj.LLJ.getPaint().measureText(strLIZIZ);
                }
            } else {
                if (c718800SHm.LJIIJ != null) {
                    iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                } else {
                    iLIZIZ = 0;
                }
                TextPaint paint2 = c718770SHj.LLJ.getPaint();
                C0SJA c0sja = c718800SHm.LJII;
                if (c0sja == null || (text = c0sja.getText()) == null) {
                    text = "";
                }
                fMeasureText2 = paint2.measureText(text);
                fLIZIZ = iLIZIZ;
            }
            fMeasureText = fMeasureText2 + fLIZIZ;
        }
        if (c718770SHj.LJIIJ(aweme) && z) {
            fMeasureText = LJII(c718770SHj, fMeasureText, null, false, false, 30);
            LinearLayout linearLayout = c718770SHj.LLLLLLLLL;
            if (linearLayout != null && (layoutParams2 = linearLayout.getLayoutParams()) != null) {
                layoutParams2.width = (int) fMeasureText;
            }
        }
        if (c718770SHj.LLLLLLIL) {
            if (aweme != null && (awemeRawAdLIZIZ = C587350N1x.LIZIZ(aweme)) != null && (xiaomiSupplementalInfo = awemeRawAdLIZIZ.getXiaomiSupplementalInfo()) != null) {
                str = xiaomiSupplementalInfo;
            }
            TuxTextView tuxTextView = c718770SHj.LLLLLLL;
            if (tuxTextView != null && (paint = tuxTextView.getPaint()) != null) {
                iMeasureText = (int) paint.measureText(str);
            }
            fMeasureText += C814420VxA.LIZIZ(C418440Gaw.LIZIZ(17)) + iMeasureText + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d)));
            LinearLayout linearLayout2 = c718770SHj.LLLLLLLLL;
            if (linearLayout2 != null && (layoutParams = linearLayout2.getLayoutParams()) != null) {
                layoutParams.width = (int) fMeasureText;
            }
        }
        return fMeasureText;
    }

    public final Layout LJ(C444830HcP c444830HcP, Layout layout, String str, boolean z, Aweme aweme) {
        String desc = aweme.getDesc();
        int iIntValue = 0;
        if ((desc == null || a0.LJJJIL(desc)) && LJLJJI(aweme) && !LJJLIIIJILLIZJL(aweme)) {
            C718800SHm c718800SHm = new C718800SHm(str);
            c718800SHm.LJIIZILJ = C017O.LIZ();
            c718800SHm.LJI(LJJJJZI().LIZIZ());
            c718800SHm.LJI = true;
            c718800SHm.LJII = LJJJLIIL(false);
            c718800SHm.LJIIIZ(LJJJJI());
            c718800SHm.LIZLLL(LJIIIIZZ(this, null, false, null, 7));
            Integer numLIZJ = C1308910kAL.LIZJ(LJJJJ(), this.LLJ.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            c718800SHm.LJIIIIZZ(iIntValue);
            c718800SHm.LJIILIIL = new AwS555S0100000_11(this, 1493);
            C719090SIp c719090SIpLIZJ = C718950SIb.LIZJ(null, null, new AwS220S0300000_11(this, c718800SHm, aweme, 25), new AwS377S0200000_11(c718800SHm, c444830HcP, 124), new AwS99S0110000_11(z, this, 5), C295600BiI.LIZIZ(this.LLLLIIL), C0BUZ.LIZ(this.LLLLIIL));
            this.LLILLJJLI.OQ2(c719090SIpLIZJ.LIZ, c719090SIpLIZJ.LIZIZ, c718800SHm, z);
            Layout layout2 = c719090SIpLIZJ.LIZIZ;
            if (layout2 == null) {
                return c719090SIpLIZJ.LIZ;
            }
            return layout2;
        }
        return layout;
    }

    public final Layout LJI(C444830HcP c444830HcP, Layout layout, String str, boolean z, Aweme aweme) {
        String desc;
        C718810SHn c718810SHn = this.LLLLLZIL;
        if (c718810SHn == null) {
            C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
            Aweme aweme2 = this.LLLLIIL;
            boolean zLJJL = LJJL();
            c299210Bo7.getClass();
            if (!C299210Bo7.LIZ(aweme2, zLJJL)) {
                c718810SHn = null;
            } else {
                c718810SHn = new C718810SHn();
                c718810SHn.LJIIIIZZ(this.LLLLZIL, this.LLLLZLL, this.LLLLZLLIL);
                c718810SHn.LJIILJJIL(LJJJJI());
                c718810SHn.LJIILIIL(C1308910kAL.LIZJ(LJJJJ(), this.LLJ.getContext()));
                c718810SHn.LJ = LJJJJJL();
                c718810SHn.LJIL = new InterfaceC719180SIy() { // from class: X.0SI0
                    @Override // X.InterfaceC719180SIy
                    public final void LIZ(boolean z2) {
                        C01GW<AbstractC1604130rqV> c01gw = C207128163i.LJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("NewVideoDescDelegate onTranslateClick ");
                        sbLIZ.append(z2);
                        sbLIZ.append(" seeTranslationText: ");
                        sbLIZ.append(this.LIZ.LLLLZIL);
                        sbLIZ.append(" seeOriginalText: ");
                        sbLIZ.append(this.LIZ.LLLLZLLIL);
                        sbLIZ.append(" translatingText: ");
                        sbLIZ.append(this.LIZ.LLLLZLL);
                        C0SZC.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                        if (z2) {
                            TranslationAbility translationAbilityLJJJLZIJ = this.LIZ.LJJJLZIJ();
                            if (translationAbilityLJJJLZIJ != null) {
                                translationAbilityLJJJLZIJ.Ol(EnumC715590S5d.CLICK);
                                return;
                            }
                            return;
                        }
                        TranslationAbility translationAbilityLJJJLZIJ2 = this.LIZ.LJJJLZIJ();
                        if (translationAbilityLJJJLZIJ2 == null) {
                            return;
                        }
                        translationAbilityLJJJLZIJ2.ww0(EnumC715590S5d.CLICK);
                    }
                };
                this.LLLLLZIL = c718810SHn;
            }
        }
        C299210Bo7 c299210Bo72 = C299210Bo7.LIZ;
        boolean zLJJL2 = LJJL();
        c299210Bo72.getClass();
        if (C299210Bo7.LIZ(aweme, zLJJL2) && c718810SHn != null && (((desc = aweme.getDesc()) == null || a0.LJJJIL(desc)) && !Intrinsics.LJFF(LJJLI(), Boolean.TRUE))) {
            if (C0SI6.LIZIZ(layout)) {
                return LJ(c444830HcP, layout, str, z, aweme);
            }
            c718810SHn.LJIJJLI = aweme;
            c718810SHn.LJIJJ = this.LLLLLLZ;
            c718810SHn.LIZIZ = LJIIJ(aweme);
            Layout layoutLIZ = c718810SHn.LIZ(c444830HcP, c444830HcP.LIZIZ(), LJJJJZI().LIZIZ(), null, LJIIJ(aweme));
            TranslationControlsAbility translationControlsAbility = (TranslationControlsAbility) this.LLLLLZ.getValue();
            if (translationControlsAbility != null) {
                translationControlsAbility.gh(c718810SHn.LIZJ);
            }
            return layoutLIZ;
        }
        return LJ(c444830HcP, layout, str, z, aweme);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C719090SIp LJLLILLLL(X.C718800SHm r21, int r22, com.ss.android.ugc.aweme.feed.model.Aweme r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJLLILLLL(X.0SHm, int, com.ss.android.ugc.aweme.feed.model.Aweme, boolean, boolean):X.0SIp");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    public static float LJII(C718770SHj c718770SHj, float f, String str, boolean z, boolean z2, int i) {
        float fMeasureText;
        Pair pair;
        float fMeasureText2;
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        if (C123100dR.LIZ(null)) {
            fMeasureText = c718770SHj.LLJ.getPaint().measureText(null);
        } else {
            fMeasureText = 0.0f;
        }
        if (z2) {
            fMeasureText2 = c718770SHj.LJJJJLL();
        } else {
            c718770SHj.getClass();
            if (z) {
                pair = new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Float.valueOf(c718770SHj.LJJJJLL()));
            } else {
                pair = new Pair(0, Float.valueOf(0.0f));
            }
            int iIntValue = ((Number) pair.getFirst()).intValue();
            float fFloatValue = ((Number) pair.getSecond()).floatValue();
            fMeasureText = c718770SHj.LLJ.getPaint().measureText("|");
            if (f > 0.0f) {
                return f + iIntValue + fFloatValue + fMeasureText;
            }
            if (str == null || str.length() == 0) {
                return fFloatValue;
            }
            fMeasureText2 = fFloatValue + c718770SHj.LLJ.getPaint().measureText(str) + iIntValue;
        }
        return fMeasureText2 + fMeasureText;
    }

    public final Pair<Layout, Layout> LJLL(C718800SHm c718800SHm, int i, boolean z, Aweme aweme, boolean z2, boolean z3) {
        boolean z4;
        boolean z5;
        boolean z6;
        C0S5S c0s5s;
        PhotoModeImageInfo photoModeImageInfo;
        Layout layoutLJJI;
        C718810SHn c718810SHnLJFF;
        CharSequence charSequence = c718800SHm.LIZ;
        if (charSequence != null && charSequence.length() != 0) {
            C299210Bo7 c299210Bo7 = C299210Bo7.LIZ;
            boolean zLJJL = LJJL();
            c299210Bo7.getClass();
            if (C299210Bo7.LIZ(aweme, zLJJL) && (c718810SHnLJFF = c718800SHm.LJFF()) != null && c718810SHnLJFF.LJ()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (C295600BiI.LIZIZ(aweme) && !z4) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (C0BUZ.LIZ(aweme) && !z4) {
                z6 = true;
            } else {
                z6 = false;
            }
            C0S64 c0s64 = this.LLLLIIIILLL;
            String title = null;
            if (c0s64 != null) {
                c0s5s = c0s64.LIZIZ;
            } else {
                c0s5s = null;
            }
            if (z) {
                if (c0s5s != null) {
                    title = c0s5s.LIZ;
                }
            } else if (aweme != null && (photoModeImageInfo = aweme.getPhotoModeImageInfo()) != null) {
                title = photoModeImageInfo.getTitle();
            }
            InterfaceC718870SHt interfaceC718870SHtLJJJJZI = LJJJJZI();
            if (z) {
                layoutLJJI = interfaceC718870SHtLJJJJZI.LJJIJIL();
            } else {
                layoutLJJI = interfaceC718870SHtLJJJJZI.LJJI();
            }
            C719090SIp c719090SIpLIZJ = C718950SIb.LIZJ(title, layoutLJJI, new C0SIW(this, c718800SHm, aweme), new C0SIT(this, c718800SHm, i, aweme, z2, z3), new C718960SIc(z, aweme, this), z5, z6);
            return new Pair<>(c719090SIpLIZJ.LIZ, c719090SIpLIZJ.LIZIZ);
        }
        C719090SIp c719090SIpLJLLILLLL = LJLLILLLL(c718800SHm, i, aweme, z2, z3);
        return new Pair<>(c719090SIpLJLLILLLL.LIZ, c719090SIpLJLLILLLL.LIZIZ);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // X.InterfaceC718870SHt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIII(com.ss.android.ugc.aweme.feed.model.Aweme r18, X.C0S5S r19, boolean r20, int r21, java.lang.Boolean r22, int r23, float r24, X.C0SKK r25, boolean r26, java.lang.String r27, java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C718770SHj.LJJIII(com.ss.android.ugc.aweme.feed.model.Aweme, X.0S5S, boolean, int, java.lang.Boolean, int, float, X.0SKK, boolean, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Type inference failed for: r0v89, types: [X.0SHp] */
    public C718770SHj(VideoDescAssem videoDescAssem, VideoDescVM videoDescVM, ConstraintSizeVM constraintSizeVM, VideoViewModel videoViewModel, LinearLayout linearLayout, LinearLayout linearLayout2, TuxTextView tuxTextView, TuxIconView tuxIconView, TuxTextView tuxTextView2, FrameLayout frameLayout, View view, LinearLayout linearLayout3, SmartSearchFeedCacheVM smartSearchFeedCacheVM) {
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        Function1 c0sf6;
        int iLIZIZ;
        int i;
        this.LL = videoDescAssem;
        this.LLILLJJLI = videoDescVM;
        this.LLILLL = constraintSizeVM;
        this.LLILZ = videoViewModel;
        this.LLILZIL = linearLayout;
        this.LLILZLL = linearLayout2;
        this.LLIZ = tuxTextView;
        this.LLIZLLLIL = tuxIconView;
        this.LLJ = tuxTextView2;
        this.LLJI = frameLayout;
        this.LLJIJIL = view;
        this.LLJILJIL = linearLayout3;
        this.LLJILJILJ = smartSearchFeedCacheVM;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, tuxTextView2.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        this.LLJJL = iIntValue;
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ef, tuxTextView2.getContext());
        if (numLIZJ2 != null) {
            iIntValue2 = numLIZJ2.intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LLJJLIIIJLLLLLLLZ = iIntValue2;
        this.LLJL = C452501pT.LIZIZ(new C709280Rry(this));
        Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.a1h, tuxTextView2.getContext());
        if (numLIZJ3 != null) {
            iIntValue3 = numLIZJ3.intValue();
        } else {
            iIntValue3 = 0;
        }
        this.LLJLILLLLZIIL = iIntValue3;
        this.LLJLL = C452501pT.LIZIZ(new C0SJ0());
        if (C294320BgE.LIZ()) {
            c0sf6 = new C0SF3(this);
        } else {
            c0sf6 = new C0SF6(this);
        }
        this.LLLF = new C0SF9(videoDescVM, c0sf6, new C0SFA(this), new C718940SIa(this));
        C497820Jfg.LIZIZ(tuxTextView2.getContext());
        C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100));
        if (C07HF.LIZ()) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        } else {
            iLIZIZ = 0;
        }
        int iLIZIZ3 = C497820Jfg.LIZIZ(tuxTextView2.getContext()) - (C693570RIl.LIZ() ? constraintSizeVM.wQ2() : iLIZIZ2 - iLIZIZ);
        this.LLLFF = iLIZIZ3;
        if (videoDescVM.LLILLJJLI) {
            i = 14;
        } else {
            i = 15;
        }
        int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) i) * 1.3d)));
        if (LJJL()) {
            iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(((double) (videoDescVM.LLILLJJLI ? 14 : 15)) * 1.4d)));
        }
        C0SN2.Companion.getClass();
        int iLIZIZ5 = iLIZIZ4 + (C0SN3.LIZIZ(false) ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)));
        this.LLLFFI = iLIZIZ5;
        this.LLLFZ = iLIZIZ3;
        this.LLLJ = 2;
        this.LLLJIL = 4;
        this.LLLJL = iLIZIZ5 * 24;
        this.LLLL = new C11NJ();
        this.LLLLIILL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(422));
        this.LLLLIILLL = C08CX.INSTANCE;
        this.LLLLIL = new LinkedHashSet();
        this.LLLLILI = new LinkedHashMap();
        this.LLLLLJLJLL = C452501pT.LIZIZ(new C0SJ2());
        this.LLLLLL = C452501pT.LIZIZ(new C0SI3(this));
        this.LLLLLLZ = C0SKK.INITIALIZED;
        this.LLLLLLZZ = C628500Oky.LIZ(new C709210Rrr(this));
        this.LLLLLZ = C628500Oky.LIZ(new C709200Rrq(this));
        this.LLLLZI = C628500Oky.LIZ(new C718880SHu(this));
        this.LLLLZLLLI = "NewVideoDescDelegate";
        this.LLLZ = new View.OnLayoutChangeListener() { // from class: X.0SHp
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                Rect rect;
                Layout layout;
                VideoItemParams item;
                Aweme aweme;
                int hasEmbeddedSubtitle;
                float fFloatValue;
                CellAdaptionComponentAbility cellAdaptionComponentAbility;
                AdaptionPaddingValues adaptionPaddingValuesN81;
                VideoAdaptionResult videoAdaptionResultYc2;
                Float subtitlePosPercentageToTop;
                Aweme aweme2;
                int[] iArr = {0, 0};
                Aweme aweme3 = null;
                if (view2 == null) {
                    rect = null;
                } else {
                    View view3 = view2;
                    while (!(view3 instanceof VideoViewCellRootView)) {
                        iArr[0] = iArr[0] + view3.getLeft();
                        iArr[1] = iArr[1] + view3.getTop();
                        Object parent = view3.getParent();
                        if (parent instanceof View) {
                            view3 = (View) parent;
                        } else {
                            throw new RuntimeException("View has no ancestor View of the provided ancestor View");
                        }
                    }
                    int i10 = iArr[0];
                    rect = new Rect(i10, iArr[1], view2.getWidth() + i10, iArr[1] + view2.getHeight());
                }
                VideoItemParams item2 = this.LL.LLILLJJLI.getItem();
                if (item2 != null) {
                    aweme3 = item2.getAweme();
                }
                if (C718770SHj.LJJIL(aweme3)) {
                    C718770SHj c718770SHj = this.LL;
                    Animator animator = c718770SHj.LLLI;
                    if ((animator != null && animator.isRunning()) || c718770SHj.LLLLLJIL || rect == null) {
                        return;
                    }
                    Integer numValueOf = Integer.valueOf(rect.top);
                    if (numValueOf.intValue() <= 0) {
                        return;
                    }
                    int iIntValue4 = numValueOf.intValue();
                    C710300Rtc c710300Rtc = c718770SHj.LLLIZZ;
                    if (c710300Rtc == null || (layout = c710300Rtc.LIZIZ) == null) {
                        return;
                    }
                    int lineCount = layout.getLineCount();
                    int iIntValue5 = ((Number) C275590Ar7.LIZ.getValue()).intValue();
                    if (lineCount > 4) {
                        return;
                    }
                    VideoItemParams item3 = c718770SHj.LLILLJJLI.getItem();
                    if ((item3 != null && (aweme2 = item3.getAweme()) != null && AwemeBizExtKt.getAdDescMaxLines(aweme2) == iIntValue5) || (item = c718770SHj.LLILLJJLI.getItem()) == null || (aweme = item.getAweme()) == null) {
                        return;
                    }
                    AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                    if (awemeRawAd != null) {
                        hasEmbeddedSubtitle = awemeRawAd.getHasEmbeddedSubtitle();
                    } else {
                        hasEmbeddedSubtitle = 0;
                    }
                    AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
                    if (awemeRawAd2 != null && (subtitlePosPercentageToTop = awemeRawAd2.getSubtitlePosPercentageToTop()) != null) {
                        fFloatValue = subtitlePosPercentageToTop.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                    if (hasEmbeddedSubtitle != 1 || fFloatValue <= 0.0f || (cellAdaptionComponentAbility = (CellAdaptionComponentAbility) c718770SHj.LLJJI.getValue()) == null || (adaptionPaddingValuesN81 = cellAdaptionComponentAbility.n81()) == null) {
                        return;
                    }
                    Integer numValueOf2 = Integer.valueOf(adaptionPaddingValuesN81.getTop());
                    if (numValueOf2.intValue() <= 0) {
                        return;
                    }
                    int iIntValue6 = numValueOf2.intValue();
                    CellAdaptionComponentAbility cellAdaptionComponentAbility2 = (CellAdaptionComponentAbility) c718770SHj.LLJJI.getValue();
                    if (cellAdaptionComponentAbility2 == null || (videoAdaptionResultYc2 = cellAdaptionComponentAbility2.yc2()) == null) {
                        return;
                    }
                    if (Integer.valueOf(videoAdaptionResultYc2.getHeight()).intValue() <= 0) {
                        return;
                    }
                    float fIntValue = iIntValue6 + (r1.intValue() * fFloatValue);
                    if (fIntValue <= iIntValue4) {
                        return;
                    }
                    ((AbstractC1023360cjm) c718770SHj.LLLLLJLJLL.getValue()).logAd(C1000720c9G.LIZ, aweme.getAwemeRawAd());
                    if (c718770SHj.LLLJIL <= iIntValue5 || lineCount <= iIntValue5) {
                        return;
                    }
                    C01GW c01gw = C275610Ar9.LIZ;
                    if (((Number) c01gw.getValue()).intValue() == 1) {
                        if (iIntValue4 + ((lineCount - iIntValue5) * c718770SHj.LLLFFI) <= fIntValue) {
                            return;
                        }
                        c718770SHj.LJIIJJI();
                        ((AbstractC1023360cjm) c718770SHj.LLLLLJLJLL.getValue()).logAd(C1000710c9F.LIZ, aweme.getAwemeRawAd());
                    }
                    if (((Number) c01gw.getValue()).intValue() != 2) {
                        return;
                    }
                    c718770SHj.LJIIJJI();
                    ((AbstractC1023360cjm) c718770SHj.LLLLLJLJLL.getValue()).logAd(C1000710c9F.LIZ, aweme.getAwemeRawAd());
                }
            }
        };
        this.LLLZI = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1497));
        this.LLLZIIL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(423));
    }
}
