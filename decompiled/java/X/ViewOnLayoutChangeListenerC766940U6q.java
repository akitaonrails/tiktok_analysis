package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import Y.ATListenerS446S0100000_12;
import Y.AfS181S0100000_12;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.filter.data.ComposerFilterViewModel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAIBeautySetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyReverseExperiment;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.livesetting.effect.LiveBeautyPanelAlphaOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0U6q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class ViewOnLayoutChangeListenerC766940U6q implements C0U5V, View.OnLayoutChangeListener {
    public final Context LL;
    public final DataChannel LLILLJJLI;
    public final View LLILLL;
    public final C19P4 LLILZ;
    public final ViewOnClickListenerC1836610xtT LLILZIL;
    public final View LLILZLL;
    public final C767010U6x LLIZ;
    public final ImageView LLIZLLLIL;
    public final C16F5 LLJ;
    public final ViewGroup LLJI;
    public final LiveIconView LLJIJIL;
    public ConstraintLayout LLJILJIL;
    public C16F5 LLJILJILJ;
    public final ComposerFilterViewModel LLJILLL;
    public final LiveSmallItemBeautyViewModel LLJJ;
    public final C766950U6r LLJJI;
    public String LLJJIII;
    public String LLJJIJI;
    public String LLJJIJIIJIL;
    public final C0U5W LLJJIJIL;
    public final C766960U6s LLJJJ;
    public final C0U6R LLJJJIL;
    public long LLJJJJ;
    public long LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public final ArrayList<String> LLJLIL;
    public C11LS LLJLILLLLZIIL;

    @Override // X.C0U5V
    public final void onDialogForeground() {
    }

    @Override // X.C0U5V
    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956;
        C0U7R.LIZ.LJFF("quit beautify", "");
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LLJJ;
        DataChannel dataChannel = this.LLILLJJLI;
        boolean zEQ2 = liveSmallItemBeautyViewModel.EQ2();
        String strLIZJ = C0U75.LIZJ(liveSmallItemBeautyViewModel.LLJI);
        String strLIZIZ = C0U75.LIZIZ(liveSmallItemBeautyViewModel.LLJI);
        int i = zEQ2 ? liveSmallItemBeautyViewModel.LLJILJILJ ? 4 : 3 : 0;
        String str = liveSmallItemBeautyViewModel.LLJIJIL;
        int iDQ2 = liveSmallItemBeautyViewModel.DQ2();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_ai_optimize_exit");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "anchor_id");
        c474500IjALIZ.LJJII(str, "task_id");
        c474500IjALIZ.LJJII(Integer.valueOf(iDQ2), "task_round");
        C767030U6z c767030U6z = C0U7R.LJIILL;
        c474500IjALIZ.LJJII(c767030U6z.LIZ.toString(), "task_trace");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(zEQ2)) ? 1 : 0), "is_ai_color_apply");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_default_value");
        c474500IjALIZ.LJJIIZ(strLIZJ, "ai_color_correction_setting", new AwS88S1000000_3(strLIZJ, 11));
        c474500IjALIZ.LJJIIZ(strLIZIZ, "ai_beauty_setting", new AwS88S1000000_3(strLIZIZ, 12));
        c474500IjALIZ.LIZ();
        c767030U6z.LIZ = new JSONArray();
        this.LLJJL = true;
        this.LLJJJJLIIL = false;
        C11LS c11ls = this.LLJLILLLLZIIL;
        if (c11ls != null) {
            C500260Jjc.LJJLIIIJLJLI(c11ls);
        }
        this.LLJLILLLLZIIL = null;
        LJI(false);
        C766950U6r c766950U6r = this.LLJJI;
        C766590U5h c766590U5h = c766950U6r.LLIZLLLIL;
        if (c766590U5h != null) {
            c766590U5h.LIZ();
        }
        Iterator<Map.Entry<String, AbstractC761520Tu2>> it2 = c766950U6r.LLIZ.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().LIZ();
        }
        C761510Tu1 c761510Tu1 = c766950U6r.LLJ;
        if (c761510Tu1 != null) {
            c761510Tu1.LIZ();
        }
        c766950U6r.LLJILJIL = null;
        this.LLJJIJIL.getClass();
        C0U5Z c0u5zLIZ = C760630Tsb.LIZ();
        c0u5zLIZ.getClass();
        InterfaceC766480U4w.LJIL.LJFF(c0u5zLIZ.LIZIZ);
        InterfaceC766480U4w.LJIJJLI.LJFF(Long.valueOf(System.currentTimeMillis()));
        C0U6S c0u6s = this.LLJJJIL.LJIJ;
        if (c0u6s != null) {
            C500260Jjc.LLFFF(c0u6s.LIZ);
            C500260Jjc.LJIILIIL(c0u6s.LJIIJ);
            AnonymousClass0956 anonymousClass09562 = c0u6s.LJIILLIIL;
            if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = c0u6s.LJIILLIIL) != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c0u6s.LJII.LLILLJJLI = null;
            C781710UlV c781710UlV = c0u6s.LJIIZILJ;
            if (c781710UlV != null) {
                c781710UlV.LIZIZ();
            }
        }
        C766960U6s c766960U6s = this.LLJJJ;
        C500260Jjc.LJIILIIL(c766960U6s.LIZ.findViewById(R.id.wys));
        c766960U6s.LIZ.removeOnTabSelectedListener((InterfaceC1584740rLE) c766960U6s.LJFF);
        c766960U6s.LIZIZ.removeOnPageChangeListener(c766960U6s.LJ);
        if (LiveBeautyPanelAlphaOptSetting.INSTANCE.enable()) {
            this.LLILLL.removeOnLayoutChangeListener(this);
            this.LLJJLIIIJLLLLLLLZ = 0;
            this.LLILLJJLI.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.BEAUTY_PANEL));
        }
    }

    public final void LJFF() {
        String str;
        if (LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            C500260Jjc.LJIILIIL(this.LLIZLLLIL);
            return;
        }
        boolean z = false;
        if (LiveBeautySwitchSetting.INSTANCE.inExperiment() && (str = this.LLJJIJI) != null && u.LJJIIJZLJL(str, "beauty", false) && C0U7C.LJII(null) == -1) {
            this.LLIZLLLIL.setEnabled(true);
            C786410Ut5.V4(this.LLIZLLLIL, 0.4f);
            return;
        }
        C786410Ut5.V4(this.LLIZLLLIL, 1.0f);
        ImageView imageView = this.LLIZLLLIL;
        List<LiveEffect> listQr = C0UA1.LIZ().qr(C0UD4.LJFF);
        ArrayList<LiveEffect> arrayList = new ArrayList();
        for (LiveEffect liveEffect : listQr) {
            if (Intrinsics.LJFF(liveEffect.LLILL(), this.LLJJIII)) {
                arrayList.add(liveEffect);
            }
        }
        if (!arrayList.isEmpty()) {
            for (LiveEffect liveEffect2 : arrayList) {
                if (!liveEffect2.LJJIJIIJI()) {
                    if (liveEffect2.LJIILIIL() && !liveEffect2.LJLJLJ()) {
                        z = true;
                        break;
                    }
                    boolean zLJJ = C0UA1.LIZ().LJJ(liveEffect2);
                    if (zLJJ) {
                        z = true;
                        break;
                    }
                }
            }
        }
        imageView.setEnabled(z);
    }

    @Override // X.C0U5V
    public final void onDialogBackground() {
        HandlerHook.viewPost(this.LLILLL, new ARunnableS112S0100000_12(this, 386));
    }

    public final void LJIIIIZZ() {
        C16F5 c16f5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startTipsRolling:");
        sbLIZ.append(this.LLJLIL.size());
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJLILLLLZIIL);
        C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
        if ((!this.LLJLIL.isEmpty()) && this.LLJLILLLLZIIL == null && this.LLJJ.EQ2()) {
            int i = this.LLJL;
            if (i < 0 || i >= this.LLJLIL.size()) {
                this.LLJL = 0;
            }
            String str = (String) C13LP.LJJJLZIJ(this.LLJL, this.LLJLIL);
            if (str != null && (c16f5 = this.LLJILJILJ) != null) {
                c16f5.setText(str);
            }
            LJII(true);
            this.LLJLILLLLZIIL = (C11LS) C11NN.LJII(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS).LJIIJ(C1701940uOG.LIZIZ()).LJIIL(new AfS181S0100000_12(this, 252));
        }
    }

    @Override // X.C0U5V
    public final boolean LIZJ() {
        return this.LLJJJJLIIL;
    }

    @Override // X.C0U5V
    public final View getView() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0255  */
    @Override // X.C0U5V
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final androidx.fragment.app.DialogFragment r9) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC766940U6q.LIZLLL(androidx.fragment.app.DialogFragment):void");
    }

    public final void LJI(boolean z) {
        C21546519Tz c21546519Tz;
        C766590U5h c766590U5h;
        C21411818qq c21411818qq;
        C21546519Tz c21546519Tz2;
        C766590U5h c766590U5h2;
        C21411818qq c21411818qq2;
        C761910Tuf.LIZ = z;
        AbstractC761520Tu2 abstractC761520Tu2 = null;
        if (z) {
            this.LLILZ.LLJLLL = false;
            C766950U6r c766950U6r = this.LLJJJIL.LJIILIIL;
            if (c766950U6r != null) {
                abstractC761520Tu2 = c766950U6r.LLJIJIL;
            }
            if ((abstractC761520Tu2 instanceof C766590U5h) && (c766590U5h2 = (C766590U5h) abstractC761520Tu2) != null && (c21411818qq2 = c766590U5h2.LJIIJJI) != null) {
                c21411818qq2.setEnabled(false);
            }
            C766960U6s c766960U6s = this.LLJJJ;
            int tabCount = c766960U6s.LIZ.getTabCount();
            for (int i = 0; i < tabCount; i++) {
                C19U0 tabAt = c766960U6s.LIZ.getTabAt(i);
                if (tabAt != null && (c21546519Tz2 = tabAt.LJIIIIZZ) != null) {
                    c21546519Tz2.setClickable(false);
                }
            }
            c766960U6s.LIZ.removeOnTabSelectedListener((InterfaceC1584740rLE) c766960U6s.LJFF);
            c766960U6s.LIZIZ.removeOnPageChangeListener(c766960U6s.LJ);
            if (C500260Jjc.LJJJJIZL(this.LLIZLLLIL)) {
                this.LLIZLLLIL.setClickable(false);
                return;
            }
            return;
        }
        this.LLILZ.LLJLLL = true;
        C766950U6r c766950U6r2 = this.LLJJJIL.LJIILIIL;
        if (c766950U6r2 != null) {
            abstractC761520Tu2 = c766950U6r2.LLJIJIL;
        }
        if ((abstractC761520Tu2 instanceof C766590U5h) && (c766590U5h = (C766590U5h) abstractC761520Tu2) != null && (c21411818qq = c766590U5h.LJIIJJI) != null) {
            c21411818qq.setEnabled(true);
        }
        C766960U6s c766960U6s2 = this.LLJJJ;
        int tabCount2 = c766960U6s2.LIZ.getTabCount();
        for (int i2 = 0; i2 < tabCount2; i2++) {
            C19U0 tabAt2 = c766960U6s2.LIZ.getTabAt(i2);
            if (tabAt2 != null && (c21546519Tz = tabAt2.LJIIIIZZ) != null) {
                c21546519Tz.setClickable(true);
            }
        }
        c766960U6s2.LIZ.addOnTabSelectedListener((InterfaceC1584740rLE) c766960U6s2.LJFF);
        c766960U6s2.LIZIZ.addOnPageChangeListener(c766960U6s2.LJ);
        if (C500260Jjc.LJJJJIZL(this.LLIZLLLIL)) {
            this.LLIZLLLIL.setClickable(true);
            LJFF();
        }
    }

    public final void LJII(boolean z) {
        if (C500260Jjc.LJJJJIZL(this.LLJILJIL) != z) {
            C500260Jjc.LJLJLJ(this.LLJILJIL, z);
            CharSequence text = null;
            if (z) {
                C0U7R c0u7r = C0U7R.LIZ;
                DataChannel dataChannel = this.LLILLJJLI;
                C16F5 c16f5 = this.LLJILJILJ;
                if (c16f5 != null) {
                    text = c16f5.getText();
                }
                String strValueOf = String.valueOf(text);
                LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LLJJ;
                C0U7R.LJIIJ(liveSmallItemBeautyViewModel.DQ2(), dataChannel, "show", strValueOf, liveSmallItemBeautyViewModel.LLJIJIL);
                return;
            }
            C11LS c11ls = this.LLJLILLLLZIIL;
            if (c11ls != null) {
                C500260Jjc.LJJLIIIJLJLI(c11ls);
            }
            this.LLJLILLLLZIIL = null;
        }
    }

    public final void LJIIIZ(int i) {
        boolean z;
        String str;
        this.LLJJIII = String.valueOf(this.LLJJI.LJIJJLI(i));
        C766950U6r c766950U6r = this.LLJJI;
        if (i == ((ArrayList) c766950U6r.LLILZIL).size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "livefilter";
        } else {
            str = (String) ListProtector.get(c766950U6r.LLILZLL, i);
        }
        this.LLJJIJI = str;
        String str2 = this.LLJJIII;
        if ((str2 == null || str2.length() == 0) && LiveBeautyReverseExperiment.INSTANCE.isInExperiment()) {
            this.LLJJIII = C0UD4.LJI;
            this.LLJJIJI = "livefilter";
        }
    }

    public ViewOnLayoutChangeListenerC766940U6q(Context context, DataChannel dataChannel) {
        this.LL = context;
        this.LLILLJJLI = dataChannel;
        View viewSd = C786410Ut5.Sd(R.layout.g81, C786410Ut5.ne(C1834150xpV.LJII(context)), null);
        this.LLILLL = viewSd;
        C19P4 c19p4 = (C19P4) viewSd.findViewById(R.id.vm3);
        this.LLILZ = c19p4;
        C19U1 c19u1 = (C19U1) viewSd.findViewById(R.id.h5k);
        ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = (ViewOnClickListenerC1836610xtT) viewSd.findViewById(R.id.gxc);
        this.LLILZIL = viewOnClickListenerC1836610xtT;
        this.LLILZLL = viewSd.findViewById(R.id.h5l);
        C767010U6x c767010U6x = (C767010U6x) viewSd.findViewById(R.id.gx7);
        this.LLIZ = c767010U6x;
        ImageView imageView = (ImageView) viewSd.findViewById(R.id.tcc);
        this.LLIZLLLIL = imageView;
        C16F5 c16f5 = (C16F5) viewSd.findViewById(R.id.fh5);
        this.LLJ = c16f5;
        ViewGroup viewGroup = (ViewGroup) viewSd.findViewById(R.id.vm6);
        this.LLJI = viewGroup;
        LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.bur);
        this.LLJIJIL = liveIconView;
        ComposerFilterViewModel composerFilterViewModel = (ComposerFilterViewModel) C0U61.LIZ(new C761460Ttw()).get(ComposerFilterViewModel.class);
        this.LLJILLL = composerFilterViewModel;
        LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = (LiveSmallItemBeautyViewModel) C0U61.LIZ(new C0U76()).get(LiveSmallItemBeautyViewModel.class);
        this.LLJJ = liveSmallItemBeautyViewModel;
        C766950U6r c766950U6r = new C766950U6r(dataChannel, liveSmallItemBeautyViewModel, composerFilterViewModel);
        this.LLJJI = c766950U6r;
        this.LLJJIJIL = new C0U5W(composerFilterViewModel, dataChannel, c19p4);
        this.LLJJJ = new C766960U6s(c19u1, c767010U6x, dataChannel);
        this.LLJJJIL = new C0U6R(liveSmallItemBeautyViewModel, dataChannel, c766950U6r, viewGroup, viewOnClickListenerC1836610xtT, c19p4, c16f5);
        this.LLJLIL = new ArrayList<>();
        if (C500260Jjc.LJJIZ(dataChannel)) {
            viewOnClickListenerC1836610xtT.setBackgroundResource(R.drawable.dsn);
        } else if (!LiveBeautyPanelAlphaOptSetting.INSTANCE.inV2()) {
            viewOnClickListenerC1836610xtT.setBackgroundResource(R.drawable.dm1);
            Drawable background = viewOnClickListenerC1836610xtT.getBackground();
            if (background != null) {
                background.setAlpha(255);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewSd.findViewById(R.id.arj);
        if (constraintLayout != null) {
            C786410Ut5.Y7(constraintLayout, new ACListenerS147S0100000_12(this, 395));
        } else {
            constraintLayout = null;
        }
        this.LLJILJIL = constraintLayout;
        LiveAIBeautySetting liveAIBeautySetting = LiveAIBeautySetting.INSTANCE;
        if (liveAIBeautySetting.enableAIBeauty()) {
            C16F5 c16f52 = (C16F5) viewSd.findViewById(R.id.xyu);
            if (c16f52 != null) {
                c16f52.setTextColor(C497740JfY.LIZLLL(R.attr.eth, C1834150xpV.LJIIIIZZ(c16f52.getContext())));
            } else {
                c16f52 = null;
            }
            this.LLJILJILJ = c16f52;
            LiveIconView liveIconView2 = (LiveIconView) viewSd.findViewById(R.id.xyp);
            if (liveIconView2 != null) {
                liveIconView2.setIconTint(C497740JfY.LIZLLL(R.attr.eth, C1834150xpV.LJIIIIZZ(liveIconView2.getContext())));
            }
        }
        c767010U6x.setAdapter(c766950U6r);
        c767010U6x.addOnPageChangeListener(new C360660ECa() { // from class: X.0U6p
            @Override // X.C360660ECa, X.InterfaceC469360Ias
            public final void onPageSelected(int i) {
                Boolean boolValueOf;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPageSelected: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("AIBeauty", C2188811AlT.LIZIZ(sbLIZ));
                this.LL.LJIIIZ(i);
                ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q = this.LL;
                viewOnLayoutChangeListenerC766940U6q.LLJJI.LLJI = i;
                if (Intrinsics.LJFF(viewOnLayoutChangeListenerC766940U6q.LLJJIII, C0UD4.LJI)) {
                    C0U5W c0u5w = this.LL.LLJJIJIL;
                    c0u5w.LJI = true;
                    c0u5w.LIZ(c0u5w.LJ);
                    this.LL.LJII(false);
                    C500260Jjc.LJIILIIL(this.LL.LLIZLLLIL);
                    return;
                }
                if (Intrinsics.LJFF(this.LL.LLJJIII, "optimize")) {
                    this.LL.LJIIIIZZ();
                    C500260Jjc.LJIILIIL(this.LL.LLILZ);
                    C500260Jjc.LJIILIIL(this.LL.LLIZLLLIL);
                    this.LL.LLJJIJIL.LJI = false;
                    return;
                }
                if (!LiveBeautyReverseExperiment.INSTANCE.notInExperiment()) {
                    return;
                }
                ViewOnLayoutChangeListenerC766940U6q viewOnLayoutChangeListenerC766940U6q2 = this.LL;
                viewOnLayoutChangeListenerC766940U6q2.LLJJIJIL.LJI = false;
                C0U6R c0u6r = viewOnLayoutChangeListenerC766940U6q2.LLJJJIL;
                String str = viewOnLayoutChangeListenerC766940U6q2.LLJJIII;
                String str2 = viewOnLayoutChangeListenerC766940U6q2.LLJJIJI;
                c0u6r.LJI = str;
                c0u6r.LJII = str2;
                LiveEffect liveEffectLIZJ = (LiveEffect) ((LinkedHashMap) c0u6r.LJIIIIZZ).get(str);
                if (liveEffectLIZJ == null) {
                    liveEffectLIZJ = c0u6r.LIZJ();
                }
                c0u6r.LJII(liveEffectLIZJ);
                if (LiveBeautySwitchSetting.INSTANCE.inExperiment() && C0U6R.LJIIJJI(c0u6r.LJII) && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ())) {
                    C500260Jjc.LJIILIIL(c0u6r.LJIILLIIL);
                } else {
                    c0u6r.LJIIIZ(c0u6r.LJFF, false);
                    LiveEffect liveEffect = c0u6r.LJFF;
                    if (liveEffect != null) {
                        boolValueOf = Boolean.valueOf(liveEffect.LLLIIII());
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        C500260Jjc.LJIILIIL(c0u6r.LJIILLIIL);
                    }
                }
                this.LL.LJII(false);
                C500260Jjc.LLFFF(this.LL.LLIZLLLIL);
                this.LL.LJFF();
            }
        });
        C786410Ut5.Q7(imageView, new ACListenerS147S0100000_12(this, 396));
        if (C500260Jjc.LJJIJLIJ()) {
            C500260Jjc.LLFFF(liveIconView);
            liveIconView.setOnTouchListener(new ATListenerS446S0100000_12(this, 24));
        } else {
            C500260Jjc.LJIILIIL(liveIconView);
        }
        if (C497740JfY.LJJ()) {
            C19P4 c19p42 = this.LLILZ;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19p42);
            c19p42.setScaleX(-1.0f);
        }
        if (liveAIBeautySetting.enableDialogUpdate()) {
            int iLIZIZ = C20736316Cj.LIZIZ(R.attr.exp, context);
            int iLIZIZ2 = C20736316Cj.LIZIZ(R.attr.exr, context);
            int iLIZIZ3 = C20736316Cj.LIZIZ(R.attr.exp, context);
            c19p4.LLIZ = iLIZIZ;
            c19p4.LLIZLLLIL = iLIZIZ2;
            c19p4.LLLII = iLIZIZ3;
            c19p4.setUpUiColor(false);
        } else {
            int iLIZIZ4 = C20736316Cj.LIZIZ(R.attr.eu5, context);
            int iLIZIZ5 = C20736316Cj.LIZIZ(R.attr.c9l, context);
            int iLIZIZ6 = C20736316Cj.LIZIZ(R.attr.exp, context);
            c19p4.LLIZ = iLIZIZ4;
            c19p4.LLIZLLLIL = iLIZIZ5;
            c19p4.LLLII = iLIZIZ6;
            c19p4.setUpUiColor(false);
        }
        c19p4.setOnLevelChangeListener(new C764410Tyh() { // from class: X.0U5b
            @Override // X.C764410Tyh, X.C19P8
            public final void LIZ(int i) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onFreeze: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Beauty#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                if (!Intrinsics.LJFF(this.LIZ.LLJJIII, C0UD4.LJI)) {
                    this.LIZ.LLJJJIL.LJIILIIL(false);
                }
            }

            @Override // X.C19P8
            public final void LIZJ(int i) {
                int i2;
                int i3;
                float f;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onChanged: ");
                sbLIZ.append(i);
                C20441214yg.LIZIZ("Beauty#SeekBar", C2188811AlT.LIZIZ(sbLIZ));
                if (Intrinsics.LJFF(this.LIZ.LLJJIII, C0UD4.LJI)) {
                    C0U5W c0u5w = this.LIZ.LLJJIJIL;
                    c0u5w.getClass();
                    C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIFFI;
                    if (C500260Jjc.LJJIFFI(c20337914i1.LIZIZ())) {
                        c20337914i1.LJFF(Boolean.TRUE);
                    }
                    LiveEffect liveEffect = c0u5w.LJ;
                    if (liveEffect != null) {
                        if (C0U7C.LJIIJ(liveEffect) != null || C0U7C.LJIIJ(liveEffect) == null) {
                            LiveEffect.ComposerConfig composerConfigLJIIJ = C0U7C.LJIIJ(liveEffect);
                            if (composerConfigLJIIJ != null) {
                                i2 = composerConfigLJIIJ.maxValue;
                            } else {
                                i2 = 100;
                            }
                            LiveEffect.ComposerConfig composerConfigLJIIJ2 = C0U7C.LJIIJ(liveEffect);
                            if (composerConfigLJIIJ2 != null) {
                                i3 = composerConfigLJIIJ2.minValue;
                            } else {
                                i3 = 0;
                            }
                            if (i == 0) {
                                f = 0.0f;
                            } else {
                                f = (i * 1.0f) / (i2 - i3);
                            }
                            C760630Tsb.LIZ().LIZLLL(liveEffect, Float.valueOf(f));
                            return;
                        }
                        return;
                    }
                    return;
                }
                C20337914i1<Boolean> c20337914i12 = InterfaceC766480U4w.LJJ;
                if (C500260Jjc.LJJIFFI(c20337914i12.LIZIZ())) {
                    c20337914i12.LJFF(Boolean.TRUE);
                }
                this.LIZ.LLJJJIL.LJIIL(i);
                this.LIZ.LJFF();
            }
        });
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height = this.LLILLL.getHeight();
        if (this.LLJJLIIIJLLLLLLLZ != height) {
            this.LLJJLIIIJLLLLLLLZ = height;
            this.LLILLJJLI.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.BEAUTY_PANEL));
        }
    }
}
