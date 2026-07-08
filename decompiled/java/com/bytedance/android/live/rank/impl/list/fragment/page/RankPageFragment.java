package com.bytedance.android.live.rank.impl.list.fragment.page;

import X.AbstractC1809750xC9;
import X.AbstractC990620bsy;
import X.AbstractViewOnClickListenerC1105820esm;
import X.AnonymousClass0956;
import X.C098200Yq;
import X.C0GZ2;
import X.C0JT6;
import X.C0TZM;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C1091250eVH;
import X.C1099160ei2;
import X.C1105870esr;
import X.C1105900esu;
import X.C1117370fBP;
import X.C1133830fbx;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C1685300txQ;
import X.C16BC;
import X.C16F5;
import X.C16G1;
import X.C16GU;
import X.C16GX;
import X.C16GZ;
import X.C1790730whT;
import X.C1809330xBT;
import X.C1810070xCf;
import X.C1810240xCw;
import X.C1810310xD3;
import X.C1810350xD7;
import X.C1810410xDD;
import X.C1810560xDS;
import X.C1810610xDX;
import X.C1810690xDf;
import X.C1810810xDr;
import X.C1811430xEr;
import X.C1819620xS4;
import X.C189200o6;
import X.C19EG;
import X.C19GS;
import X.C19ME;
import X.C20533215Wg;
import X.C2097608Jq;
import X.C21543519Sv;
import X.C21556219Xs;
import X.C21556619Xw;
import X.C2188811AlT;
import X.C2200821BBo;
import X.C416760GVu;
import X.C432120Gx0;
import X.C475510Ikn;
import X.C497740JfY;
import X.C749170Ta7;
import X.C755780Tkm;
import X.C786410Ut5;
import X.EnumC1811400xEo;
import X.InterfaceC1094280eaA;
import X.InterfaceC1790880whi;
import X.InterfaceC1810050xCd;
import X.InterfaceC1810130xCl;
import X.InterfaceC21556819Xy;
import X.RunnableC781530UlD;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.rank.impl.list.controller.RankPageController;
import com.bytedance.android.live.rank.impl.list.controller.RankRootController;
import com.bytedance.android.live.rank.impl.list.fragment.behavior.RankBottomBehavior;
import com.bytedance.android.live.rank.impl.list.fragment.list.VisibilityFragment;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankListViewModel;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankPageViewModel;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingBonusTimeSetting;
import com.bytedance.android.livesdk.livesetting.rank.LivePopularityRankingPerceptionImprovementSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.list.model.RankListV2Response;
import com.bytedance.android.livesdk.rank.model.SubRankTabInfo;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.gson.Gson;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS269S0000000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class RankPageFragment extends BaseFragment implements InterfaceC1810050xCd {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/HELIOSZiklOjt9LjctLiI2JjFiOS40LWseKCE4GCQrLAkhKSIhLCEn";
    public RunnableC781530UlD LL;
    public FrameLayout LLILLJJLI;
    public C1099160ei2 LLILLL;
    public C21556619Xw LLILZ;
    public RankTypeV2 LLILZIL;
    public EnumC1811400xEo LLILZLL;
    public String LLIZ;
    public RankPageController LLIZLLLIL;
    public RankRootController LLJ;
    public Function0<Unit> LLJI;
    public C1810350xD7 LLJIJIL;
    public C16GX LLJILJIL;
    public C21543519Sv LLJILJILJ;
    public C1105870esr LLJILLL;
    public C1091250eVH LLJJ;
    public ConstraintLayout LLJJI;
    public C1811430xEr LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C16F5 LLJJJ;
    public C432120Gx0 LLJJJIL;
    public LiveIconView LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public C16F5 LLJJJJLIIL;
    public C16F5 LLJJL;
    public C1324720kZq LLJJLIIIJLLLLLLLZ;
    public C1324720kZq LLJL;
    public final Map<Integer, Boolean> LLJLIL;
    public String LLJLILLLLZIIL;
    public long LLJLL;
    public boolean LLJLLIL;
    public ValueAnimator LLJLLL;
    public ValueAnimator LLJZ;
    public ValueAnimator LLJZIJLIL;
    public ValueAnimator LLL;
    public ValueAnimator LLLF;
    public ValueAnimator LLLFF;
    public ValueAnimator LLLFFI;
    public ValueAnimator LLLFZ;
    public ValueAnimator LLLI;
    public ValueAnimator LLLII;
    public C1790730whT LLLIIII;
    public String LLLIIIIL;
    public C1810610xDX LLLIIIL;
    public boolean LLLIIL;
    public C1810810xDr LLLIILIL;
    public boolean LLLIL;
    public final C1810310xD3 LLLILZ;
    public final C1810240xCw LLLILZJ;
    public C1117370fBP LLLILZLLLI;
    public boolean LLLIZZ;

    @Override // X.InterfaceC1810050xCd
    public final void AR() {
        RankBottomBehavior rankBottomBehavior;
        C16GU c16gu;
        C16G1 c16g1;
        C16G1 c16g12;
        if (this.LLJJIJIIJIL) {
            C1099160ei2 c1099160ei2ZR = ZR();
            C16BC c16bc = null;
            ViewGroup.LayoutParams layoutParams = c1099160ei2ZR != null ? c1099160ei2ZR.getLayoutParams() : null;
            C16BC c16bc2 = (!(layoutParams instanceof C16G1) || (c16g12 = (C16G1) layoutParams) == null) ? null : c16g12.LIZ;
            if (!(c16bc2 instanceof RankBottomBehavior) || (rankBottomBehavior = (RankBottomBehavior) c16bc2) == null) {
                return;
            }
            C16GX c16gx = this.LLJILJIL;
            C1099160ei2 c1099160ei2ZR2 = ZR();
            if (!rankBottomBehavior.LJFF || c1099160ei2ZR2 == null || c1099160ei2ZR2.getPaddingBottom() <= 0) {
                return;
            }
            C16GX c16gx2 = rankBottomBehavior.LJ;
            int totalScrollRange = c16gx2 != null ? c16gx2.getTotalScrollRange() : 0;
            ViewGroup.LayoutParams layoutParams2 = c16gx != null ? c16gx.getLayoutParams() : null;
            if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
                c16bc = c16g1.LIZ;
            }
            if ((c16bc instanceof AppBarLayout$Behavior) && (c16gu = (C16GU) c16bc) != null) {
                c16gu.setTopAndBottomOffset(-totalScrollRange);
            }
            if (c1099160ei2ZR2 != null) {
                c1099160ei2ZR2.setPadding(c1099160ei2ZR2.getPaddingLeft(), c1099160ei2ZR2.getPaddingTop(), c1099160ei2ZR2.getPaddingRight(), 0);
            }
        }
    }

    public final void NR() {
        if (this.LLLIL) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        LiveIconView liveIconView = this.LLJJJJ;
        if (liveIconView != null) {
            liveIconView.getGlobalVisibleRect(rect);
        }
        C1324720kZq c1324720kZq = this.LLJJLIIIJLLLLLLLZ;
        if (c1324720kZq != null) {
            c1324720kZq.getGlobalVisibleRect(rect2);
        }
        LiveIconView liveIconView2 = this.LLJJJJ;
        if (liveIconView2 == null || liveIconView2.getVisibility() == 0) {
            C1324720kZq c1324720kZq2 = this.LLJJLIIIJLLLLLLLZ;
            if (c1324720kZq2 == null || c1324720kZq2.getVisibility() == 0) {
                C16F5 c16f5 = this.LLJJJ;
                if (c16f5 == null || c16f5.getVisibility() == 0) {
                    if (C497740JfY.LJJ()) {
                        if (rect.left < rect2.right) {
                            gS();
                            this.LLLIL = true;
                        }
                    } else if (rect2.left < rect.right) {
                        gS();
                        this.LLLIL = true;
                    }
                    C1091250eVH c1091250eVH = this.LLJJ;
                    if (c1091250eVH != null) {
                        c1091250eVH.setEnableSizeChange(true);
                    }
                    C1091250eVH c1091250eVH2 = this.LLJJ;
                    if (c1091250eVH2 != null) {
                        c1091250eVH2.setEnableFixedSize(false);
                    }
                }
            }
        }
    }

    public final void OR() {
        ValueAnimator valueAnimator = this.LLJLLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LLJZ;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LLJZIJLIL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LLL;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LLLF;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LLLFF;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator valueAnimator7 = this.LLLFFI;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        ValueAnimator valueAnimator8 = this.LLLFZ;
        if (valueAnimator8 != null) {
            valueAnimator8.cancel();
        }
        ValueAnimator valueAnimator9 = this.LLLI;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
        ValueAnimator valueAnimator10 = this.LLLII;
        if (valueAnimator10 != null) {
            valueAnimator10.cancel();
        }
    }

    public final void PR() {
        RankBottomBehavior rankBottomBehavior;
        C16G1 c16g1;
        C21543519Sv c21543519Sv = this.LLJILJILJ;
        C16BC c16bc = null;
        ViewGroup.LayoutParams layoutParams = c21543519Sv != null ? c21543519Sv.getLayoutParams() : null;
        C16GZ c16gz = layoutParams instanceof C16GZ ? (C16GZ) layoutParams : null;
        if (c16gz != null) {
            c16gz.LIZ = 0;
        }
        C1099160ei2 c1099160ei2ZR = ZR();
        ViewGroup.LayoutParams layoutParams2 = c1099160ei2ZR != null ? c1099160ei2ZR.getLayoutParams() : null;
        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
            c16bc = c16g1.LIZ;
        }
        if (!(c16bc instanceof RankBottomBehavior) || (rankBottomBehavior = (RankBottomBehavior) c16bc) == null) {
            return;
        }
        C16GX c16gx = this.LLJILJIL;
        C1099160ei2 c1099160ei2ZR2 = ZR();
        rankBottomBehavior.LJFF = false;
        if (c16gx == null || c1099160ei2ZR2 == null) {
            return;
        }
        c1099160ei2ZR2.setPadding(c1099160ei2ZR2.getPaddingLeft(), c1099160ei2ZR2.getPaddingTop(), c1099160ei2ZR2.getPaddingRight(), 0);
    }

    public final void RR() {
        C16GZ c16gz;
        C21543519Sv c21543519Sv = this.LLJILJILJ;
        ViewGroup.LayoutParams layoutParams = c21543519Sv != null ? c21543519Sv.getLayoutParams() : null;
        if (!(layoutParams instanceof C16GZ) || (c16gz = (C16GZ) layoutParams) == null) {
            return;
        }
        Integer numValueOf = Integer.valueOf(c16gz.LIZ);
        if (numValueOf.intValue() <= 0) {
            numValueOf.intValue();
            c16gz.LIZ = 3;
        }
    }

    public final void SR() {
        RankBottomBehavior rankBottomBehavior;
        C16GU c16gu;
        C16G1 c16g1;
        C16G1 c16g12;
        RankPageController rankPageController = this.LLIZLLLIL;
        C16BC c16bc = null;
        if (rankPageController == null) {
            rankPageController = null;
        }
        rankPageController.LJII();
        C1099160ei2 c1099160ei2ZR = ZR();
        ViewGroup.LayoutParams layoutParams = c1099160ei2ZR != null ? c1099160ei2ZR.getLayoutParams() : null;
        C16BC c16bc2 = (!(layoutParams instanceof C16G1) || (c16g12 = (C16G1) layoutParams) == null) ? null : c16g12.LIZ;
        if (!(c16bc2 instanceof RankBottomBehavior) || (rankBottomBehavior = (RankBottomBehavior) c16bc2) == null) {
            return;
        }
        C16GX c16gx = this.LLJILJIL;
        C1099160ei2 c1099160ei2ZR2 = ZR();
        rankBottomBehavior.LJFF = false;
        ViewGroup.LayoutParams layoutParams2 = c16gx != null ? c16gx.getLayoutParams() : null;
        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
            c16bc = c16g1.LIZ;
        }
        if ((c16bc instanceof AppBarLayout$Behavior) && (c16gu = (C16GU) c16bc) != null) {
            c16gu.setTopAndBottomOffset(0);
        }
        if (c1099160ei2ZR2 != null) {
            int paddingLeft = c1099160ei2ZR2.getPaddingLeft();
            int paddingTop = c1099160ei2ZR2.getPaddingTop();
            int paddingRight = c1099160ei2ZR2.getPaddingRight();
            C16GX c16gx2 = rankBottomBehavior.LJ;
            c1099160ei2ZR2.setPadding(paddingLeft, paddingTop, paddingRight, c16gx2 != null ? c16gx2.getTotalScrollRange() : 0);
        }
        rankBottomBehavior.LJFF = true;
    }

    public final RunnableC781530UlD VR() {
        View viewFindViewById = this.LL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.t0q) : null;
            this.LL = (RunnableC781530UlD) viewFindViewById;
        }
        return (RunnableC781530UlD) viewFindViewById;
    }

    public final C21556619Xw WR() {
        View viewFindViewById = this.LLILZ;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.wya) : null;
            this.LLILZ = (C21556619Xw) viewFindViewById;
        }
        return (C21556619Xw) viewFindViewById;
    }

    @Override // X.InterfaceC1810050xCd
    public final void X1() {
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        RankPageViewModel rankPageViewModelLJIIL = rankPageController.LJIIL();
        RankPageController rankPageController2 = this.LLIZLLLIL;
        if (rankPageController2 == null) {
            rankPageController2 = null;
        }
        RankTypeV2 rankTypeV2 = rankPageController2.LJIIL().LLJJIII;
        RankPageController rankPageController3 = this.LLIZLLLIL;
        if (rankPageController3 == null) {
            rankPageController3 = null;
        }
        long j = rankPageController3.LJIIJJI().LIZIZ;
        RankPageController rankPageController4 = this.LLIZLLLIL;
        if (rankPageController4 == null) {
            rankPageController4 = null;
        }
        long j2 = rankPageController4.LJIIJJI().LIZ;
        RankPageController rankPageController5 = this.LLIZLLLIL;
        if (rankPageController5 == null) {
            rankPageController5 = null;
        }
        EnumC1811400xEo enumC1811400xEo = rankPageController5.LJIIL().LLILLL;
        RankPageController rankPageController6 = this.LLIZLLLIL;
        if (rankPageController6 == null) {
            rankPageController6 = null;
        }
        int i = rankPageController6.LIZ().LLILZIL.type;
        RankPageController rankPageController7 = this.LLIZLLLIL;
        if (rankPageController7 == null) {
            rankPageController7 = null;
        }
        int i2 = rankPageController7.LIZ().LLILZIL.rankPhase;
        RankPageController rankPageController8 = this.LLIZLLLIL;
        if (rankPageController8 == null) {
            rankPageController8 = null;
        }
        C1810070xCf c1810070xCf = new C1810070xCf(enumC1811400xEo, i, i2, rankPageController8.LIZ().LL);
        InterfaceC1810130xCl interfaceC1810130xCl = new InterfaceC1810130xCl() { // from class: X.0xD2
            @Override // X.InterfaceC1810130xCl
            public final void LIZJ() {
            }

            /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
            @Override // X.InterfaceC1810130xCl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response.RankView r24, long r25, boolean r27) {
                /*
                    Method dump skipped, instruction units count: 539
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1810300xD2.LIZ(com.bytedance.android.livesdk.rank.list.model.RankListV2Response$RankView, long, boolean):void");
            }
        };
        RankRootController rankRootController = this.LLJ;
        if (rankRootController == null) {
            rankRootController = null;
        }
        InterfaceC1790880whi interfaceC1790880whi = rankRootController.LLILZ;
        rankPageViewModelLJIIL.zQ2(rankTypeV2, this, j, j2, true, false, c1810070xCf, interfaceC1810130xCl, interfaceC1790880whi != null ? interfaceC1790880whi.Gc() : null);
    }

    public final C1099160ei2 ZR() {
        View viewFindViewById = this.LLILLL;
        if (viewFindViewById == null) {
            View view = getView();
            viewFindViewById = view != null ? view.findViewById(R.id.view_pager) : null;
            this.LLILLL = (C1099160ei2) viewFindViewById;
        }
        return (C1099160ei2) viewFindViewById;
    }

    public final boolean aS() {
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        RankTypeV2 rankTypeV2 = rankPageController.LJIIL().LLJJIII;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        return Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI) && LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime();
    }

    public final boolean dS() {
        C1810350xD7 c1810350xD7 = this.LLJIJIL;
        if (c1810350xD7 == null || ((ArrayList) c1810350xD7.LLJI).size() <= 1) {
            return true;
        }
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        RankTypeV2 rankTypeV2 = rankPageController.LJIIL().LLJJIII;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        return Intrinsics.LJFF(rankTypeV2, RankTypeV2.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void gS() {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.gS():void");
    }

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
    public final void hS() {
        C1810610xDX c1810610xDX;
        Resources resources;
        if (this.LLLIIL || (c1810610xDX = this.LLLIIIL) == null) {
            return;
        }
        this.LLLIIL = true;
        String str = this.LLLIIIIL;
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        Context context = getContext();
        C416760GVu c416760GVu = null;
        Drawable drawable = (context == null || (resources = context.getResources()) == null) ? null : resources.getDrawable(R.drawable.exk);
        if (C497740JfY.LJJ()) {
            if (drawable != null) {
                Bitmap bitmapLIZ = C0GZ2.LIZ(drawable, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), null);
                if (bitmapLIZ != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(-1.0f, 1.0f, bitmapLIZ.getWidth() / 2.0f, bitmapLIZ.getHeight() / 2.0f);
                    drawable = new BitmapDrawable(getResources(), Bitmap.createBitmap(bitmapLIZ, 0, 0, bitmapLIZ.getWidth(), bitmapLIZ.getHeight(), matrix, true));
                }
                drawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.67f), (int) C497740JfY.LIZIZ(14.67f));
                c416760GVu = new C416760GVu(drawable);
            }
        } else if (drawable != null) {
            drawable.setBounds(0, 0, (int) C497740JfY.LIZIZ(14.67f), (int) C497740JfY.LIZIZ(14.67f));
            c416760GVu = new C416760GVu(drawable);
        }
        SpannableString spannableString = new SpannableString("{0:icon}");
        C786410Ut5.p2(spannableString, c416760GVu, 0, 8, 18);
        C786410Ut5.p2(spannableString, c1810610xDX, 0, 8, 18);
        spannableStringBuilder.append((CharSequence) " ");
        spannableStringBuilder.append((CharSequence) spannableString);
        C16F5 c16f5 = this.LLJJJ;
        if (c16f5 != null) {
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
        }
        C16F5 c16f52 = this.LLJJJ;
        if (c16f52 != null) {
            c16f52.setHighlightColor(0);
        }
        C16F5 c16f53 = this.LLJJJ;
        if (c16f53 != null) {
            c16f53.setText(spannableStringBuilder);
        }
    }

    @Override // X.InterfaceC1810050xCd
    public final void mi() {
        CharSequence text;
        C16F5 c16f5;
        C16F5 c16f52;
        Object objGg0;
        C432120Gx0 c432120Gx0 = this.LLJJJIL;
        if (c432120Gx0 != null) {
            C786410Ut5.LLLFF(c432120Gx0, 8);
        }
        C16F5 c16f53 = this.LLJJJ;
        if (c16f53 != null) {
            C786410Ut5.LLJJJJ(c16f53, 0);
        }
        C16F5 c16f54 = this.LLJJJ;
        if (c16f54 != null) {
            c16f54.setText(C497740JfY.LJIJI(2131842390));
        }
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        RankTypeV2 rankTypeV2 = rankPageController.LJIIL().LLJJIII;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        if (Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIL) && (c16f52 = this.LLJJJ) != null) {
            Object[] objArr = new Object[1];
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            if (dataChannelLJ == null || (objGg0 = dataChannelLJ.gg0(C755780Tkm.class)) == null) {
                objGg0 = "";
            }
            objArr[0] = objGg0;
            c16f52.setText(C497740JfY.LJIJJ(2131851972, objArr));
        }
        if (this.LLILZIL.group_type == EnumC1811400xEo.GAME_RANK.getType() && (c16f5 = this.LLJJJ) != null) {
            c16f5.setText(C497740JfY.LJIJI(2131852548));
        }
        C16F5 c16f55 = this.LLJJJ;
        this.LLLIIIIL = (c16f55 == null || (text = c16f55.getText()) == null) ? null : text.toString();
        ConstraintLayout constraintLayout = this.LLJJI;
        ViewGroup.LayoutParams layoutParams = constraintLayout != null ? constraintLayout.getLayoutParams() : null;
        layoutParams.height = -2;
        ConstraintLayout constraintLayout2 = this.LLJJI;
        if (constraintLayout2 != null) {
            C786410Ut5.m6(constraintLayout2, layoutParams);
        }
        C16F5 c16f56 = this.LLJJJ;
        if (c16f56 != null) {
            ViewGroup.LayoutParams layoutParams2 = c16f56.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C19ME c19me = (C19ME) layoutParams2;
            c19me.startToStart = 0;
            c19me.endToEnd = 0;
            ((ViewGroup.MarginLayoutParams) c19me).width = 0;
            ((ViewGroup.MarginLayoutParams) c19me).topMargin = (int) C497740JfY.LIZIZ(12.0f);
            ((ViewGroup.MarginLayoutParams) c19me).bottomMargin = (int) C497740JfY.LIZIZ(12.0f);
            c19me.setMarginStart((int) C497740JfY.LIZIZ(16.0f));
            c19me.setMarginEnd((int) C497740JfY.LIZIZ(16.0f));
            C786410Ut5.W5(c16f56, c19me);
        }
        C16F5 c16f57 = this.LLJJJ;
        if (c16f57 != null) {
            c16f57.setSingleLine(false);
        }
        hS();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        DataChannel dataChannelLJ;
        Map map;
        C1810810xDr c1810810xDr = this.LLLIILIL;
        if (c1810810xDr != null) {
            c1810810xDr.LLJJJ = false;
            ValueAnimator valueAnimator = c1810810xDr.LLJJJJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = c1810810xDr.LLJJJJLIIL;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            ValueAnimator valueAnimator3 = c1810810xDr.LLJJJJJIL;
            if (valueAnimator3 != null) {
                valueAnimator3.cancel();
            }
            c1810810xDr.LLJJJJ = null;
            c1810810xDr.LLJJJJLIIL = null;
            c1810810xDr.LLJJJJJIL = null;
            AnonymousClass0956 anonymousClass0956 = c1810810xDr.LLJJJIL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c1810810xDr.LLJJJIL = null;
        }
        C1105870esr c1105870esr = this.LLJILLL;
        if (c1105870esr != null) {
            c1105870esr.LIZIZ();
        }
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        if (!rankPageController.LJIIL().LLILZIL && (dataChannelLJ = C475510Ikn.LJ(this)) != null && (map = (Map) dataChannelLJ.gg0(C749170Ta7.class)) != null) {
            map.clear();
        }
        OR();
        super.onDestroyView();
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment
    public final void onVisible() {
        if (this.LLLIZZ) {
            return;
        }
        this.LLLIZZ = true;
        X1();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0xD3] */
    public RankPageFragment() {
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        this.LLILZIL = RankTypeV2.LJJIJIIJI;
        this.LLILZLL = EnumC1811400xEo.DEFAULT;
        this.LLJJIJIIJIL = true;
        this.LLJJIJIL = true;
        this.LLJLIL = new LinkedHashMap();
        this.LLJLILLLLZIIL = "normal";
        this.LLLILZ = new InterfaceC21556819Xy() { // from class: X.0xD3
            @Override // X.InterfaceC21556819Xy
            public final void LIZ() {
            }

            /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00d9  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
            @Override // X.InterfaceC21556819Xy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(X.C21556219Xs r8) {
                /*
                    Method dump skipped, instruction units count: 237
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1810310xD3.LIZIZ(X.19Xs):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
            @Override // X.InterfaceC21556819Xy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(X.C21556219Xs r7) {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1810310xD3.LIZJ(X.19Xs):void");
            }
        };
        this.LLLILZJ = new C1810240xCw(this);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [X.0xDP] */
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v268 java.util.Map<java.lang.String, java.lang.String>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    @Override // X.InterfaceC1810050xCd
    public final void AO(X.C1810160xCo r19) {
        /*
            Method dump skipped, instruction units count: 1688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.AO(X.0xCo):void");
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0xDX] */
    @Override // X.InterfaceC1810050xCd
    public final void Oj(final C1790730whT c1790730whT) {
        String str;
        LiveIconView liveIconView = this.LLJJJJ;
        if (liveIconView != null) {
            C786410Ut5.LLJJIJIL(liveIconView, 0);
        }
        if (TextUtils.isEmpty(c1790730whT.LIZIZ)) {
            LiveIconView liveIconView2 = this.LLJJJJ;
            if (liveIconView2 != null) {
                C786410Ut5.LLJJIJIL(liveIconView2, 8);
                return;
            }
            return;
        }
        C1790730whT c1790730whT2 = this.LLLIIII;
        RankPageController rankPageController = null;
        if (c1790730whT2 != null) {
            str = c1790730whT2.LIZIZ;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, c1790730whT.LIZIZ)) {
            return;
        }
        this.LLLIIII = c1790730whT;
        this.LLLIIL = false;
        RankPageController rankPageController2 = this.LLIZLLLIL;
        if (rankPageController2 != null) {
            rankPageController = rankPageController2;
        }
        if (rankPageController.LJIIL().LLILZIL) {
            LiveIconView liveIconView3 = this.LLJJJJ;
            if (liveIconView3 != null) {
                C786410Ut5.LLJJIJIL(liveIconView3, 8);
            }
            this.LLLIIIL = new AbstractC990620bsy() { // from class: X.0xDX
                @Override // X.AbstractC990620bsy
                public final void LIZ() {
                    this.LLILZIL.bS(c1790730whT);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            };
            hS();
            return;
        }
        LiveIconView liveIconView4 = this.LLJJJJ;
        if (liveIconView4 != null) {
            C786410Ut5.g8(liveIconView4, new AbstractViewOnClickListenerC1105820esm() { // from class: X.0xDY
                @Override // X.AbstractViewOnClickListenerC1105820esm
                public final void LIZ() {
                    this.LLILZIL.bS(c1790730whT);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1200L);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0094  */
    @Override // X.InterfaceC1810050xCd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ok(webcast.api.ranklist.LynxRankView r7) {
        /*
            r6 = this;
            X.19Sv r3 = r6.LLJILJILJ
            if (r3 == 0) goto L8f
            java.lang.String r0 = r7.lynxSchema
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L27
            r1 = 0
            com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker.recordViewRemovedPoint(r3, r1)
            r3.removeAllViews()
            X.0esr r0 = r6.LLJILLL
            if (r0 == 0) goto L1c
            r0.LIZIZ()
        L1c:
            r6.LLJILLL = r1
            r6.PR()
            r6.LLJJIJIL = r4
            r6.cS(r2)
            return
        L27:
            boolean r0 = X.C1105900esu.LIZIZ
            r6.getContext()
            java.lang.String r1 = r7.lynxSchema
            if (r1 == 0) goto L94
            boolean r0 = kotlin.text.a0.LJJJIL(r1)
            if (r0 != 0) goto L94
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r1)
            java.lang.String r0 = "height"
            java.lang.String r1 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L94
            int r0 = X.C0IZJ.LIZ(r1)
            float r0 = (float) r0
            float r0 = X.C497740JfY.LIZIZ(r0)
            int r5 = (int) r0
        L50:
            X.0esr r0 = r6.LLJILLL
            if (r0 != 0) goto L6c
            X.0esr r4 = new X.0esr
            android.content.Context r0 = r3.getContext()
            r4.<init>(r0)
            r6.LLJILLL = r4
            X.19Sv r3 = r6.LLJILJILJ
            if (r3 == 0) goto L6c
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams
            r0 = -1
            r1.<init>(r0, r5)
            r3.addView(r4, r1)
        L6c:
            X.0esr r3 = r6.LLJILLL
            if (r3 == 0) goto L7f
            java.lang.String r1 = r7.lynxSchema
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = X.C475510Ikn.LJ(r6)
            java.lang.String r1 = X.C1105900esu.LIZ(r0, r1)
            java.lang.String r0 = r7.LIZ
            r3.LIZ(r5, r1, r0)
        L7f:
            boolean r0 = r6.LLJJIJIIJIL
            if (r0 == 0) goto L90
            r6.RR()
        L86:
            boolean r0 = r6.LLJJIJIL
            if (r0 == 0) goto L8f
            r6.LLJJIJIL = r2
            r6.SR()
        L8f:
            return
        L90:
            r6.PR()
            goto L86
        L94:
            r5 = -2
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.Ok(webcast.api.ranklist.LynxRankView):void");
    }

    public final String UR(long j) {
        String strLIZIZ;
        StringBuilder sbLIZ;
        StringBuilder sbLIZ2;
        StringBuilder sbLIZ3;
        RankTypeV2 rankTypeV2 = this.LLILZIL;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        RankTypeV2 rankTypeV23 = RankTypeV2.LIZ;
        if ((!Intrinsics.LJFF(rankTypeV2, rankTypeV23) || !dS()) && !aS()) {
            long j2 = 86400;
            long j3 = j / j2;
            long j4 = j % j2;
            long j5 = 3600;
            long j6 = j4 / j5;
            long j7 = j4 % j5;
            long j8 = 60;
            long j9 = j7 / j8;
            long j10 = j7 % j8;
            iS(j3, false);
            if (j3 > 1) {
                return C497740JfY.LJIJJ(2131843902, Long.valueOf(j3));
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            if (j6 < 10 && j3 <= 0) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append('0');
                sbLIZ5.append(j6);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("");
                sbLIZ6.append(j6 + ((j3 * j2) / j5));
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ6);
            }
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append(':');
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            if (j9 < 10) {
                sbLIZ7.append('0');
            } else {
                sbLIZ7.append("");
            }
            sbLIZ7.append(j9);
            sbLIZ4.append(C2188811AlT.LIZIZ(sbLIZ7));
            sbLIZ4.append(':');
            if (j10 < 10) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('0');
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
            }
            sbLIZ.append(j10);
            sbLIZ4.append(C2188811AlT.LIZIZ(sbLIZ));
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        long j11 = j % ((long) 3600);
        long j12 = 60;
        long j13 = j11 / j12;
        long j14 = j11 % j12;
        RankPageController rankPageController = this.LLIZLLLIL;
        if (rankPageController == null) {
            rankPageController = null;
        }
        iS(0L, Intrinsics.LJFF(rankPageController.LJIIL().LLJJIII, rankTypeV23));
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        if (j13 < 10) {
            sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('0');
        } else {
            sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
        }
        sbLIZ2.append(j13);
        sbLIZ8.append(C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ8.append(':');
        if (j14 < 10) {
            sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append('0');
        } else {
            sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("");
        }
        sbLIZ3.append(j14);
        sbLIZ8.append(C2188811AlT.LIZIZ(sbLIZ3));
        return C2188811AlT.LIZIZ(sbLIZ8);
    }

    @Override // X.InterfaceC1810050xCd
    public final void Ug(List<RankListV2Response.Bulletin> list) {
        ViewStub viewStub;
        View view = getView();
        if (view != null && (viewStub = (ViewStub) view.findViewById(R.id.sqh)) != null) {
            C1810810xDr c1810810xDr = (C1810810xDr) C786410Ut5.LJLLLL(viewStub);
            this.LLLIILIL = c1810810xDr;
            DataChannel dataChannelLJ = C475510Ikn.LJ(this);
            RankPageController rankPageController = this.LLIZLLLIL;
            if (rankPageController == null) {
                rankPageController = null;
            }
            int iLJ = rankPageController.LLILZLL.LJ();
            c1810810xDr.LLJJIII = dataChannelLJ;
            c1810810xDr.LLJJ = iLJ;
        }
        C1810810xDr c1810810xDr2 = this.LLLIILIL;
        if (c1810810xDr2 != null) {
            RankPageController rankPageController2 = this.LLIZLLLIL;
            if (rankPageController2 == null) {
                rankPageController2 = null;
            }
            RankTypeV2 rankTypeV2 = rankPageController2.LJIIL().LLJJIII;
            if (!Intrinsics.LJFF(c1810810xDr2.LLJJIJIIJIL, list)) {
                c1810810xDr2.LLJJJ = false;
                ValueAnimator valueAnimator = c1810810xDr2.LLJJJJ;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator valueAnimator2 = c1810810xDr2.LLJJJJLIIL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = c1810810xDr2.LLJJJJJIL;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                c1810810xDr2.LLJJJJ = null;
                c1810810xDr2.LLJJJJLIIL = null;
                c1810810xDr2.LLJJJJJIL = null;
                AnonymousClass0956 anonymousClass0956 = c1810810xDr2.LLJJJIL;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1810810xDr2.LLJJJIL = null;
                ((ArrayList) c1810810xDr2.LLJJIJIIJIL).clear();
                c1810810xDr2.LLJJIJIL = 0;
                c1810810xDr2.LLILLL.setScrollX(c1810810xDr2.LIZIZ());
            }
            if (!(!((ArrayList) c1810810xDr2.LLJJIJIIJIL).isEmpty())) {
                C1809330xBT.LIZ(list, AFwS269S0000000_27.get$arr$(464));
                if (!LivePopularityRankingPerceptionImprovementSetting.INSTANCE.spotlightMomentNoticeOpt()) {
                    C1809330xBT.LIZ(list, AFwS269S0000000_27.get$arr$(465));
                }
                if (LivePopularityRankingBonusTimeSetting.INSTANCE.isInBonusTime()) {
                    C0JT6<String> c0jt6 = InterfaceC1094280eaA.ud;
                    String strLIZ = c0jt6.LIZ();
                    if (strLIZ == null) {
                        strLIZ = "";
                    }
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (strLIZ.length() == 0) {
                        c0jt6.LIZJ(String.valueOf(jCurrentTimeMillis));
                    } else {
                        try {
                            if (jCurrentTimeMillis - CastLongProtector.parseLong(strLIZ) >= 604800000) {
                                C1809330xBT.LIZ(list, AFwS269S0000000_27.get$arr$(466));
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } else {
                    C1809330xBT.LIZ(list, AFwS269S0000000_27.get$arr$(467));
                }
                C1809330xBT.LIZ(list, AFwS269S0000000_27.get$arr$(468));
                if (list.isEmpty() || (LivePopularityRankingPerceptionImprovementSetting.INSTANCE.spotlightMomentNoticeOpt() && !c1810810xDr2.LLJJIJI && list.size() == 1 && ((RankListV2Response.Bulletin) ListProtector.get(list, 0)).noticeType.equals("team_rank_spotlight_rule"))) {
                    int visibility = c1810810xDr2.getVisibility();
                    c1810810xDr2.setVisibility(8);
                    C1602160rnK.LIZIZ(visibility, 8, c1810810xDr2);
                    return;
                }
                int visibility2 = c1810810xDr2.getVisibility();
                c1810810xDr2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility2, 0, c1810810xDr2);
                c1810810xDr2.LLJJJ = true;
                ((ArrayList) c1810810xDr2.LLJJIJIIJIL).addAll(list);
                c1810810xDr2.LLJJIJIL = 0;
                C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(((RankListV2Response.Bulletin) ListProtector.get(c1810810xDr2.LLJJIJIIJIL, 0)).icon.getUrls());
                c1324610kZfLIZJ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                int width = c1810810xDr2.LLILLJJLI.getWidth();
                int height = c1810810xDr2.LLILLJJLI.getHeight();
                c1324610kZfLIZJ.LJ = width;
                c1324610kZfLIZJ.LJFF = height;
                c1324610kZfLIZJ.LJJI(c1810810xDr2.LLILLJJLI);
                c1810810xDr2.LIZLLL((RankListV2Response.Bulletin) ListProtector.get(c1810810xDr2.LLJJIJIIJIL, 0));
                c1810810xDr2.LLJJI = rankTypeV2;
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                DataChannel dataChannel = c1810810xDr2.LLJJIII;
                String str = ((RankListV2Response.Bulletin) ListProtector.get(c1810810xDr2.LLJJIJIIJIL, 0)).noticeType;
                c1810690xDf.getClass();
                C1810690xDf.LJJIII(rankTypeV2, dataChannel, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    @Override // X.InterfaceC1810050xCd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V2(long r12) {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.V2(long):void");
    }

    public final void bS(C1790730whT c1790730whT) {
        RankRootController rankRootController = this.LLJ;
        RankPageController rankPageController = null;
        if (rankRootController == null) {
            rankRootController = null;
        }
        rankRootController.LIZIZ(c1790730whT);
        RankPageController rankPageController2 = this.LLIZLLLIL;
        if (rankPageController2 == null) {
            rankPageController2 = null;
        }
        RankListViewModel rankListViewModelLJIIIZ = rankPageController2.LJIIIZ();
        if (rankListViewModelLJIIIZ != null) {
            if (!Intrinsics.LJFF(c1790730whT.LIZ.LIZIZ, RankTypeV2.LIZJ)) {
                C1810690xDf c1810690xDf = C1810690xDf.LIZ;
                RankPageController rankPageController3 = this.LLIZLLLIL;
                if (rankPageController3 == null) {
                    rankPageController3 = null;
                }
                RankListV2Response.RankView rankViewLJIIJ = rankPageController3.LJIIJ();
                C1810410xDD c1810410xDD = rankListViewModelLJIIIZ.LL;
                RankPageController rankPageController4 = this.LLIZLLLIL;
                if (rankPageController4 != null) {
                    rankPageController = rankPageController4;
                }
                String str = rankPageController.LJIIL().LLJJIII.rankName;
                DataChannel dataChannelLJ = C475510Ikn.LJ(this);
                c1810690xDf.getClass();
                C1810690xDf.LJIILJJIL(c1810410xDD, rankViewLJIIJ, dataChannelLJ, str);
                return;
            }
            C1810690xDf c1810690xDf2 = C1810690xDf.LIZ;
            RankPageController rankPageController5 = this.LLIZLLLIL;
            if (rankPageController5 != null) {
                rankPageController = rankPageController5;
            }
            RankListV2Response.RankView rankViewLJIIJ2 = rankPageController.LJIIJ();
            C1810410xDD c1810410xDD2 = rankListViewModelLJIIIZ.LL;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            c1810690xDf2.getClass();
            C1810690xDf.LJIILJJIL(c1810410xDD2, rankViewLJIIJ2, dataChannelLJ2, "rookie_star_rank_right_top");
        }
    }

    @Override // X.InterfaceC1810050xCd
    public final void c2(List<AbstractC1809750xC9> list) {
        C1117370fBP c1117370fBP;
        if (list != null && !list.isEmpty()) {
            C786410Ut5.LLLILZJ(VR(), 0);
            if (list != null && (c1117370fBP = this.LLLILZLLLI) != null) {
                c1117370fBP.LLLI(list);
            }
            C1117370fBP c1117370fBP2 = this.LLLILZLLLI;
            if (c1117370fBP2 != null) {
                c1117370fBP2.notifyDataSetChanged();
                return;
            }
            return;
        }
        C786410Ut5.LLLILZJ(VR(), 8);
    }

    public final void cS(boolean z) {
        ViewStub viewStub;
        if (this.LLJJIJI == z) {
            return;
        }
        if (this.LLJJIII == null) {
            View view = getView();
            View viewLJLLLL = null;
            if (view != null) {
                viewStub = (ViewStub) view.findViewById(R.id.fex);
            } else {
                viewStub = null;
            }
            if (viewStub != null) {
                viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
            }
            this.LLJJIII = new C1811430xEr(viewLJLLLL, new C1810560xDS(this));
        }
        if (z) {
            C1811430xEr c1811430xEr = this.LLJJIII;
            if (c1811430xEr != null) {
                c1811430xEr.LIZIZ.start();
            }
        } else {
            C1811430xEr c1811430xEr2 = this.LLJJIII;
            if (c1811430xEr2 != null) {
                c1811430xEr2.LIZ.start();
            }
        }
        this.LLJJIJI = z;
    }

    @Override // X.InterfaceC1810050xCd
    public final void hc(boolean z) {
        if (this.LLJJIJIIJIL == z) {
            return;
        }
        if (z) {
            RR();
        } else {
            PR();
        }
        this.LLJJIJIIJIL = z;
    }

    public final void kS(boolean z) {
        RankListV2Response.BulletinLoop bulletinLoop;
        List<RankListV2Response.Bulletin> list;
        RankPageController rankPageController = this.LLIZLLLIL;
        RankPageController rankPageController2 = null;
        if (rankPageController == null) {
            rankPageController = null;
        }
        RankTypeV2 rankTypeV2 = rankPageController.LJIIL().LLJJIII;
        RankTypeV2 rankTypeV22 = RankTypeV2.LIZ;
        if (!Intrinsics.LJFF(rankTypeV2, RankTypeV2.LJIJJLI)) {
            return;
        }
        C1810810xDr c1810810xDr = this.LLLIILIL;
        boolean z2 = false;
        if (c1810810xDr != null) {
            if (c1810810xDr.LLJJIJI != z) {
                z2 = true;
            }
            c1810810xDr.LLJJIJI = z;
            if (z2) {
                RankPageController rankPageController3 = this.LLIZLLLIL;
                if (rankPageController3 != null) {
                    rankPageController2 = rankPageController3;
                }
                RankListV2Response.RankView rankViewLJIIJ = rankPageController2.LJIIJ();
                if (rankViewLJIIJ != null && (bulletinLoop = rankViewLJIIJ.bulletinLoop) != null && (list = bulletinLoop.bulletins) != null) {
                    Ug(list);
                }
            }
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202263);
        super.onCreate(bundle);
        if (this.LLIZLLLIL == null) {
            RankTypeV2 rankTypeV2 = this.LLILZIL;
            EnumC1811400xEo enumC1811400xEo = this.LLILZLL;
            RankRootController rankRootController = this.LLJ;
            if (rankRootController == null) {
                rankRootController = null;
            }
            RankPageController rankPageController = new RankPageController(rankTypeV2, enumC1811400xEo, this, rankRootController);
            getLifecycle().addObserver(rankPageController);
            rankPageController.LJIIL().LLJJIJI = this.LLIZ;
            this.LLIZLLLIL = rankPageController;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        boolean z2;
        Object obj;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/page/RankPageFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYDppl4GSl8P5Bz7n26I/p8sVgQxPiOzGbFXXeADrRQR+0iDveEcHe+OokG8B4", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        super.setUserVisibleHint(z);
        if (isAdded()) {
            for (Fragment fragment : getChildFragmentManager().LJJLIIIJL()) {
                if (fragment instanceof VisibilityFragment) {
                    VisibilityFragment visibilityFragment = (VisibilityFragment) fragment;
                    if (z != visibilityFragment.LLILLJJLI) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    visibilityFragment.LLILLJJLI = z;
                    if (visibilityFragment.isResumed() && z2 && visibilityFragment.getUserVisibleHint()) {
                        visibilityFragment.MR(visibilityFragment.LLILLJJLI);
                    }
                }
            }
        }
        C2200821BBo.LIZ.getClass();
        if (!C2200821BBo.LIZ() && C2200821BBo.LJI && z) {
            C20533215Wg.LIZ(RankPageFragment.class);
        }
    }

    @Override // X.InterfaceC1810050xCd
    public final void z8(RankListV2Response.RankView rankView) {
        Map map;
        Boolean bool;
        boolean zLJFF;
        List<SubRankTabInfo> list;
        User user;
        RankPageController rankPageController = null;
        if (!LivePopularityRankingPerceptionImprovementSetting.INSTANCE.historicalAchievementSharingPageOpt()) {
            RankPageController rankPageController2 = this.LLIZLLLIL;
            if (rankPageController2 == null) {
                rankPageController2 = null;
            }
            if (rankPageController2.LJIIL().LLILLL != EnumC1811400xEo.GAME_RANK) {
                return;
            }
        }
        RankPageController rankPageController3 = this.LLIZLLLIL;
        if (rankPageController3 == null) {
            rankPageController3 = null;
        }
        String strValueOf = String.valueOf(rankPageController3.LJIIJJI().LIZ);
        RankPageController rankPageController4 = this.LLIZLLLIL;
        if (rankPageController4 == null) {
            rankPageController4 = null;
        }
        String strValueOf2 = String.valueOf(rankPageController4.LJIIL().LLJJIII.type);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strValueOf);
        sbLIZ.append(',');
        sbLIZ.append(strValueOf2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        DataChannel dataChannelLJ = C475510Ikn.LJ(this);
        if (dataChannelLJ != null && (map = (Map) dataChannelLJ.gg0(C749170Ta7.class)) != null && (bool = (Boolean) map.get(strValueOf2)) != null && bool.booleanValue()) {
            C0JT6<Map<String, Boolean>> c0jt6 = InterfaceC1094280eaA.sd;
            Map<String, Boolean> mapLIZ = c0jt6.LIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (mapLIZ != null) {
                linkedHashMap.putAll(mapLIZ);
            }
            linkedHashMap.put(strLIZIZ, Boolean.TRUE);
            c0jt6.LIZJ(linkedHashMap);
            for (RankListV2Response.RankInfo rankInfo : rankView.ranks) {
                User user2 = rankInfo.user;
                if (user2 != null) {
                    rankInfo.rankUser = user2;
                }
            }
            RankListV2Response.RankInfo rankInfo2 = rankView.ownerRank;
            if (rankInfo2 != null && (user = rankInfo2.user) != null) {
                rankInfo2.rankUser = user;
            }
            RankPageController rankPageController5 = this.LLIZLLLIL;
            if (rankPageController5 == null) {
                rankPageController5 = null;
            }
            String str = "";
            if (rankPageController5.LJIIL().LLILLL == EnumC1811400xEo.GAME_RANK && (list = rankView.subTabs) != null) {
                String string = "";
                for (SubRankTabInfo subRankTabInfo : list) {
                    if (subRankTabInfo.rankType == rankView.rankType) {
                        string = C1133830fbx.LJIILIIL(subRankTabInfo.title, "").toString();
                    }
                }
                str = string;
            }
            String json = GsonProtectorUtils.toJson(new Gson(), rankView);
            Uri.Builder builderAppendQueryParameter = UriProtector.parse("aweme://roma_redirect/?spark_page=popularity_achievement_share").buildUpon().appendQueryParameter("enter_from", "history_ranking_entrance");
            C1810690xDf c1810690xDf = C1810690xDf.LIZ;
            RankPageController rankPageController6 = this.LLIZLLLIL;
            if (rankPageController6 == null) {
                rankPageController6 = null;
            }
            RankTypeV2 rankTypeV2 = rankPageController6.LJIIL().LLJJIII;
            RankPageController rankPageController7 = this.LLIZLLLIL;
            if (rankPageController7 == null) {
                rankPageController7 = null;
            }
            EnumC1811400xEo enumC1811400xEo = rankPageController7.LJIIL().LLILLL;
            DataChannel dataChannelLJ2 = C475510Ikn.LJ(this);
            c1810690xDf.getClass();
            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_rank", C1810690xDf.LJIIIIZZ(rankTypeV2, enumC1811400xEo, dataChannelLJ2));
            DataChannel dataChannelLJ3 = C475510Ikn.LJ(this);
            if (dataChannelLJ3 != null) {
                zLJFF = Intrinsics.LJFF(dataChannelLJ3.gg0(C0TZM.class), Boolean.FALSE);
            } else {
                zLJFF = false;
            }
            if (!zLJFF) {
                RankPageController rankPageController8 = this.LLIZLLLIL;
                if (rankPageController8 != null) {
                    rankPageController = rankPageController8;
                }
                builderAppendQueryParameter2.appendQueryParameter("height", String.valueOf(rankPageController.LLILZLL.LJ()));
            }
            String string2 = builderAppendQueryParameter2.build().toString();
            boolean z = C1105900esu.LIZIZ;
            C1105900esu.LJ(C475510Ikn.LJ(this), string2, true, true, json, C2097608Jq.LJIIJ(new Pair("game_rank_name", str)));
        }
    }

    public final void iS(long j, boolean z) {
        float fLIZIZ;
        LiveIconView liveIconView = this.LLJJJJ;
        if (liveIconView != null) {
            ViewGroup.LayoutParams layoutParams = liveIconView.getLayoutParams();
            if (layoutParams != null) {
                C19ME c19me = (C19ME) layoutParams;
                if (z) {
                    c19me.startToEnd = -1;
                    C432120Gx0 c432120Gx0 = this.LLJJJIL;
                    if (c432120Gx0 != null) {
                        c19me.startToStart = c432120Gx0.getId();
                    }
                    C432120Gx0 c432120Gx02 = this.LLJJJIL;
                    if (c432120Gx02 == null) {
                        fLIZIZ = C497740JfY.LIZIZ(39.0f);
                    } else {
                        float dimension = c432120Gx02.getResources().getDimension(R.dimen.awx);
                        float textSize = c432120Gx02.getTextSize();
                        float f = 1.0f;
                        if (dimension > 0.0f) {
                            float f2 = textSize / dimension;
                            if (f2 >= 1.0f) {
                                f = f2;
                            }
                        }
                        fLIZIZ = ((int) C497740JfY.LIZIZ(39.0f)) * f;
                    }
                    c19me.setMarginStart((int) fLIZIZ);
                } else if (j <= 1) {
                    if (aS()) {
                        C432120Gx0 c432120Gx03 = this.LLJJJIL;
                        if (c432120Gx03 != null) {
                            c19me.startToEnd = c432120Gx03.getId();
                        }
                        c19me.startToStart = -1;
                        c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
                    } else {
                        c19me.startToStart = -1;
                        C432120Gx0 c432120Gx04 = this.LLJJJIL;
                        if (c432120Gx04 != null) {
                            c19me.startToEnd = c432120Gx04.getId();
                        }
                        c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
                    }
                } else {
                    C432120Gx0 c432120Gx05 = this.LLJJJIL;
                    if (c432120Gx05 != null) {
                        c19me.startToEnd = c432120Gx05.getId();
                    }
                    c19me.startToStart = -1;
                    c19me.setMarginStart((int) C497740JfY.LIZIZ(4.0f));
                }
                C786410Ut5.W5(liveIconView, c19me);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    @Override // X.InterfaceC1810050xCd
    public final void ko(View view, boolean z) {
        View viewFindViewById = null;
        if (!z) {
            View viewFindViewById2 = this.LLILLJJLI;
            if (viewFindViewById2 == null) {
                View view2 = getView();
                if (view2 != null) {
                    viewFindViewById2 = view2.findViewById(R.id.inn);
                } else {
                    viewFindViewById2 = null;
                }
                this.LLILLJJLI = (FrameLayout) viewFindViewById2;
            }
            ViewGroup.LayoutParams layoutParams = viewFindViewById2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = 0;
                C786410Ut5.W5(viewFindViewById2, marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        View view3 = this.LLILLJJLI;
        if (view3 == null) {
            View view4 = getView();
            if (view4 != null) {
                viewFindViewById = view4.findViewById(R.id.inn);
            }
            this.LLILLJJLI = (FrameLayout) viewFindViewById;
            view3 = viewFindViewById;
        }
        FrameLayout frameLayout = (FrameLayout) view3;
        C786410Ut5.LJJJJIZL(frameLayout);
        frameLayout.addView(view);
    }

    public final void nS(C21556219Xs c21556219Xs, boolean z) {
        View view;
        TextView textView;
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        float fLIZIZ4;
        if (c21556219Xs != null && (view = c21556219Xs.LJ) != null && (textView = (TextView) view.findViewById(android.R.id.text1)) != null) {
            boolean zLJJ = C497740JfY.LJJ();
            if (this.LLILZLL == EnumC1811400xEo.GIFT_RANK) {
                if (z && !zLJJ) {
                    fLIZIZ3 = C497740JfY.LIZIZ(30.0f);
                } else {
                    fLIZIZ3 = C497740JfY.LIZIZ(14.0f);
                }
                int i = (int) fLIZIZ3;
                if (z && zLJJ) {
                    fLIZIZ4 = C497740JfY.LIZIZ(30.0f);
                } else {
                    fLIZIZ4 = C497740JfY.LIZIZ(14.0f);
                }
                textView.setPadding(i, 0, (int) fLIZIZ4, 0);
                return;
            }
            if (z && !zLJJ) {
                fLIZIZ = C497740JfY.LIZIZ(28.0f);
            } else {
                fLIZIZ = C497740JfY.LIZIZ(12.0f);
            }
            int i2 = (int) fLIZIZ;
            int iLIZIZ = (int) C497740JfY.LIZIZ(7.0f);
            if (z && zLJJ) {
                fLIZIZ2 = C497740JfY.LIZIZ(28.0f);
            } else {
                fLIZIZ2 = C497740JfY.LIZIZ(12.0f);
            }
            textView.setPadding(i2, iLIZIZ, (int) fLIZIZ2, (int) C497740JfY.LIZIZ(7.0f));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x01e3  */
    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.list.fragment.page.RankPageFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void mS(C21556219Xs c21556219Xs, C1810350xD7 c1810350xD7, boolean z) {
        View view;
        ImageView imageView;
        if (c21556219Xs != null && (view = c21556219Xs.LJ) != null && (imageView = (ImageView) view.findViewById(android.R.id.icon)) != null) {
            C786410Ut5.LJZI(8, imageView);
            if (!z) {
                nS(c21556219Xs, z);
                return;
            }
            ImageModel imageModel = ((SubRankTabInfo) ListProtector.get(c1810350xD7.LLJI, c21556219Xs.LIZLLL)).icon;
            if (imageModel == null) {
                return;
            }
            C786410Ut5.LJZI(0, imageView);
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER;
            c1324610kZfLJIIIZ.LJJI(imageView);
            nS(c21556219Xs, z);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewTd = C786410Ut5.Td(layoutInflater, R.layout.gkg, viewGroup, false);
        C19GS c19gs = null;
        if (!(viewTd instanceof View)) {
            viewTd = null;
        }
        if (viewTd != null) {
            try {
                ViewTreeLifecycleOwner.set(viewTd, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(viewTd, this);
                viewTd.setTag(R.id.view_tree_saved_state_registry_owner, this);
                C19EG activity = getActivity();
                if (activity instanceof C19GS) {
                    c19gs = (C19GS) activity;
                }
                C1685300txQ.LIZ(c19gs);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return viewTd;
            }
        }
        C189200o6.m2constructorimpl(Unit.LIZ);
        return viewTd;
    }
}
