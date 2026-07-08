package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.ss.android.ugc.aweme.im.common.model.StickerBase;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.im.common.model.StickerVariant;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.Intrinsics;
import wh6.AbS498S0200000_6;

/* JADX INFO: renamed from: X.0HQb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440750HQb extends LinearLayout {
    public final InterfaceC497601wk LL;
    public final C441470HSv LLILLJJLI;
    public C440830HQj LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;
    public final C01GW LLIZLLLIL;
    public AnonymousClass0956 LLJ;
    public C440820HQi LLJI;
    public String LLJIJIL;
    public InterfaceC440090HNn LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;

    public final void LIZLLL() {
        View childAt = getChildAt(1);
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeViewAt(1);
        addView(childAt, 0);
        if (getChildAt(0) instanceof TuxTextView) {
            C426750GoL.LJIIIZ(getToggleTrackText(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, false, 26);
        } else {
            C426750GoL.LJIIIZ(getToggleTrackText(), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(9))), null, false, 26);
        }
    }

    private final TuxIconView getAliveIcon() {
        return (TuxIconView) this.LLJJJIL.getValue();
    }

    private final Drawable getOffBackground() {
        return (Drawable) this.LLJJIII.getValue();
    }

    private final StateListDrawable getOnBackground() {
        return (StateListDrawable) this.LLJJIJIIJIL.getValue();
    }

    private final TuxSpinner getSpinner() {
        return (TuxSpinner) this.LLJJJ.getValue();
    }

    private final FrameLayout getToggleButton() {
        return (FrameLayout) this.LLJJJJ.getValue();
    }

    private final int getTrackHeight() {
        return ((Number) this.LLIZLLLIL.getValue()).intValue();
    }

    private final int getTrackWidth() {
        return ((Number) this.LLIZ.getValue()).intValue();
    }

    private final Drawable getUiChangeOffBackground() {
        return (Drawable) this.LLJJIJI.getValue();
    }

    private final Drawable getUiChangeOnBackground() {
        return (Drawable) this.LLJJIJIL.getValue();
    }

    public final int getButtonSize() {
        return ((Number) this.LLILZ.getValue()).intValue();
    }

    public final int getIconSize() {
        return ((Number) this.LLILZIL.getValue()).intValue();
    }

    public final C1910890zpH getLogger() {
        return (C1910890zpH) this.LLJJI.getValue();
    }

    public final int getSpinnerSize() {
        return ((Number) this.LLILZLL.getValue()).intValue();
    }

    public final InterfaceC447740Hh6 getStickerStoreService() {
        return (InterfaceC447740Hh6) this.LLJILJILJ.getValue();
    }

    public final MixStudioStatusRepository getTaskStatusDataService() {
        return (MixStudioStatusRepository) this.LLJILLL.getValue();
    }

    public final TuxTextView getToggleTrackText() {
        return (TuxTextView) this.LLJJJJJIL.getValue();
    }

    public final C1351210lGZ getTuxVibrationHelper() {
        return (C1351210lGZ) this.LLJJ.getValue();
    }

    public final void LIZJ() {
        if (C440480HPa.LIZJ()) {
            setBackground(getUiChangeOffBackground());
            getAliveIcon().setIconRes(R.raw.icon_live_photo_slash);
            getAliveIcon().setTintColorRes(R.attr.a1k);
            getToggleTrackText().setTextColorRes(R.attr.a1k);
        } else {
            setBackground(getOffBackground());
            getAliveIcon().setTintColorRes(R.attr.e1);
        }
        if (getChildAt(0) instanceof TuxTextView) {
            LIZLLL();
        }
        getToggleTrackText().setText(getContext().getString(2131833913));
        C786410Ut5.LJJJJIZL(getToggleButton());
        getToggleButton().addView(getAliveIcon());
    }

    public final void LJ(@StickerVariant int i) {
        StickerItem stickerItem;
        StickerBase stickerBase;
        Long l;
        C440790HQf c440790HQf;
        C440830HQj c440830HQj = this.LLILLL;
        if (c440830HQj != null && (stickerItem = c440830HQj.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null && (l = stickerBase.id) != null) {
            long jLongValue = l.longValue();
            MixStudioStatusRepository taskStatusDataService = getTaskStatusDataService();
            if (taskStatusDataService != null) {
                StickerVariant.Companion.getClass();
                if (i == 2) {
                    c440790HQf = new C440790HQf(true);
                } else {
                    c440790HQf = new C440790HQf(false);
                }
                taskStatusDataService.LJIIIZ(jLongValue, c440790HQf);
            }
        }
    }

    public final void setCountdown(int i) {
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJ = C23250099c.LIZLLL(this.LL, null, null, new C1438405k6(i, this, null), 3);
    }

    public final void LIZ(C440830HQj c440830HQj, C440820HQi c440820HQi) {
        Unit unit;
        C440790HQf c440790HQf;
        if (Intrinsics.LJFF(c440830HQj, this.LLILLL)) {
            return;
        }
        this.LLILLL = c440830HQj;
        this.LLJI = c440820HQi;
        AnonymousClass0956 anonymousClass0956 = this.LLJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        C440830HQj c440830HQj2 = this.LLILLL;
        if (c440830HQj2 != null) {
            AbstractC440840HQk abstractC440840HQk = c440830HQj2.LIZJ;
            if (abstractC440840HQk instanceof C440800HQg) {
                if (!C440480HPa.LIZJ()) {
                    setBackground(getOffBackground());
                    if (!(getChildAt(0) instanceof TuxTextView)) {
                        LIZLLL();
                    }
                } else {
                    setBackground(getUiChangeOffBackground());
                    getToggleTrackText().setTextColorRes(R.attr.a1k);
                }
                getToggleTrackText().setText("");
                C786410Ut5.LJJJJIZL(getToggleButton());
                getToggleButton().addView(getSpinner());
                Double d = ((C440800HQg) c440830HQj2.LIZJ).LIZIZ;
                if (d != null) {
                    setCountdown((int) Math.ceil(Math.max(0.0d, d.doubleValue() - SystemClock.uptimeMillis()) / ((double) LSPassThroughRecordSizeConfig.DEFAULT)));
                    unit = Unit.LIZ;
                }
            } else {
                boolean z = abstractC440840HQk instanceof C440790HQf;
                if (z && ((C440790HQf) abstractC440840HQk).LIZ) {
                    if (!C440480HPa.LIZJ()) {
                        setBackground(getOnBackground());
                        if (!(getChildAt(0) instanceof TuxTextView)) {
                            LIZLLL();
                        }
                        getAliveIcon().setTintColorRes(R.attr.d2);
                    } else {
                        setBackground(getUiChangeOnBackground());
                        getAliveIcon().setIconRes(R.raw.icon_live_photo_ai_on);
                        getAliveIcon().setTintColorRes(R.attr.d2);
                        getToggleTrackText().setTextColorRes(R.attr.d2);
                    }
                    getToggleTrackText().setText(getContext().getString(2131833913));
                    C786410Ut5.LJJJJIZL(getToggleButton());
                    getToggleButton().addView(getAliveIcon());
                    unit = Unit.LIZ;
                } else if (!Intrinsics.LJFF(abstractC440840HQk, C440850HQl.LIZ) && z && (c440790HQf = (C440790HQf) abstractC440840HQk) != null && !c440790HQf.LIZ) {
                    LIZJ();
                    unit = Unit.LIZ;
                } else {
                    LIZJ();
                    unit = Unit.LIZ;
                }
            }
            if (unit != null) {
                return;
            }
        }
        new AwS550S0100000_6(this, 1451);
    }

    public final Object LJFF(@StickerVariant int i, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        Activity activityLIZIZ;
        C19EG c19egLIZIZ;
        LifecycleCoroutineScope lifecycleScope;
        C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt.LJIJJ();
        AbstractC1387200mCc abstractC1387200mCcLJFF = C1906580ziK.LJFF();
        if (abstractC1387200mCcLJFF != null && (activityLIZIZ = abstractC1387200mCcLJFF.LIZIZ()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(activityLIZIZ)) != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C440760HQc(this, c2252611DEt, i, null), 3);
        }
        Object objLJIJ = c2252611DEt.LJIJ();
        if (objLJIJ == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ;
    }

    public C440750HQb(LifecycleCoroutineScope lifecycleCoroutineScope, Context context, C441470HSv c441470HSv) {
        super(context, null, 0);
        this.LL = lifecycleCoroutineScope;
        this.LLILLJJLI = c441470HSv;
        this.LLILLL = null;
        this.LLILZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(486));
        this.LLILZIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(557));
        this.LLILZLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(559));
        this.LLIZ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(556));
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(555));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(560));
        this.LLJILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(561));
        this.LLJJ = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1452));
        this.LLJJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(558));
        this.LLJJIII = C452501pT.LIZIZ(new AwS545S0100000_1(context, 1721));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS545S0100000_1(context, 1720));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1454));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS548S0100000_4(context, 528));
        this.LLJJJ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 99));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 94));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS407S0200000_6(context, this, 100));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1450));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(getTrackWidth(), getTrackHeight());
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        setMinimumWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(64)));
        setOrientation(0);
        setGravity(16);
        addView(getToggleButton());
        addView(getToggleTrackText());
        LIZJ();
        C786410Ut5.I7(new AbS498S0200000_6(this, context, 6), this);
    }

    public final void LIZIZ(boolean z, EnumC440870HQn enumC440870HQn, EnumC440870HQn enumC440870HQn2) {
        EnumC441640HTm enumC441640HTm;
        Long l;
        StickerItem stickerItem;
        StickerBase stickerBase;
        C440820HQi c440820HQi = this.LLJI;
        Integer numValueOf = null;
        if (c440820HQi != null) {
            enumC441640HTm = c440820HQi.LIZ;
        } else {
            enumC441640HTm = null;
        }
        C440830HQj c440830HQj = this.LLILLL;
        if (c440830HQj != null && (stickerItem = c440830HQj.LIZ) != null && (stickerBase = stickerItem.stickerBase) != null) {
            l = stickerBase.id;
        } else {
            l = null;
        }
        if (c440820HQi != null) {
            numValueOf = Integer.valueOf(c440820HQi.LIZIZ);
        }
        if (enumC441640HTm != null && l != null && numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            long jLongValue = l.longValue();
            C440370HOp c440370HOp = C440370HOp.LIZ;
            String strValueOf = String.valueOf(jLongValue);
            c440370HOp.getClass();
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("enter_from", C441660HTo.LIZIZ(enumC441640HTm).getParam());
            c2344009Gk.LJIIIIZZ("sticker_id", strValueOf);
            c2344009Gk.LIZJ(iIntValue, "sticker_list_rank");
            c2344009Gk.LIZJ(z ? 1 : 0, "is_success");
            c2344009Gk.LJIIIIZZ("from_status", enumC440870HQn.getParam());
            c2344009Gk.LJIIIIZZ("to_status", enumC440870HQn2.getParam());
            C20684815ws.LJIILLIIL("ttsocial_mix_studio_make_alive_toggle_response", c2344009Gk.LIZ);
        }
    }
}
