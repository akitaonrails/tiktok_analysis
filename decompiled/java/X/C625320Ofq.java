package X;

import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.offlinemode.ui.popup.OfflineModeSwitchComponent;
import com.ss.android.ugc.feed.platform.panel.IRootAbility;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.jvm.internal.AwS410S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0Ofq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C625320Ofq extends C0OCC implements InterfaceC19330810jy, InterfaceC1616070s9l {
    public volatile AnonymousClass0956 LL;
    public volatile AnonymousClass0956 LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;
    public EnumC623450Ocp LLILZIL;
    public final int[] LLILZLL = {1008};
    public InterfaceC539120LCk LLIZ;
    public volatile boolean LLIZLLLIL;
    public final /* synthetic */ OfflineModeSwitchComponent LLJ;

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onBeforePageChange() {
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageScrolledEnd(int i, float f, int i2) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageSelected(int i, boolean z) {
    }

    @Override // X.InterfaceC1616070s9l
    public final void onPageUnSelected(C0SZ8 c0sz8) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i) {
    }

    @Override // X.InterfaceC1616160s9u
    public final /* synthetic */ void onScrollToItemStart(int i, boolean z) {
    }

    @Override // X.C0OCC, X.InterfaceC1603270rp7
    public final void onShow() {
        Aweme awemeLJIIIIZZ;
        this.LLILZ = true;
        if (this.LLJ.bo()) {
            C19319410i8 c19319410i8 = OfflineModeSwitchComponent.LLJLLIL;
            c19319410i8.LIZIZ(new AwS553S0100000_9(this, 1396));
            if (LIZIZ()) {
                AnonymousClass0956 anonymousClass0956 = this.LL;
                if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
                    c19319410i8.LJIIJJI(AFwS195S0000000_9.get$arr$(292));
                    IViewPagerComponentAbility iViewPagerComponentAbilityLo = this.LLJ.lo();
                    this.LLILLL = (iViewPagerComponentAbilityLo == null || (awemeLJIIIIZZ = iViewPagerComponentAbilityLo.LJIIIIZZ()) == null) ? null : awemeLJIIIIZZ.getAid();
                    this.LL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C01NZ(C625360Ofu.LIZ().loadmore_count_down_duration_milli, new AwS410S0200000_9(this.LLJ, this, 56), null), 3);
                }
            }
        }
    }

    public final boolean LIZIZ() {
        boolean z = C607310Nrt.LJ;
        IRootAbility iRootAbility = (IRootAbility) this.LLJ.LLJI.getValue();
        boolean z2 = false;
        if (iRootAbility != null && iRootAbility.getUserVisibleHint() && this.LLJ.LLJILJIL && C625720OgU.LIZIZ().getInt("local_push_count", 0) < C625360Ofu.LIZ().single_user_max_push_cnt && !z && System.currentTimeMillis() - C625720OgU.LIZIZ().getLong("last_trigger_push_time", 0L) >= ((long) C625360Ofu.LIZ().push_interval_hours) * 3600000) {
            z2 = true;
        }
        OfflineModeSwitchComponent.LLJLLIL.LIZIZ(new C625350Oft(z2));
        return z2;
    }

    @Override // X.C0OCC, X.InterfaceC1603270rp7
    public final void onHide() {
        IViewPagerComponentAbility iViewPagerComponentAbilityLo;
        Aweme awemeLJIIIIZZ;
        if (this.LLILZ) {
            this.LLILZ = false;
            C625470Og5 c625470Og5 = C625470Og5.LL;
            c625470Og5.getClass();
            if (C625470Og5.LLJJIJI && (iViewPagerComponentAbilityLo = this.LLJ.lo()) != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityLo.LJIIIIZZ()) != null && C0NIZ.LIZJ(awemeLJIIIIZZ) && C0NIZ.LIZIZ(awemeLJIIIIZZ)) {
                c625470Og5.getClass();
                C625470Og5.LLJJIJI = false;
                this.LLJ.mo();
            }
        }
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LLILZLL;
    }

    public C625320Ofq(OfflineModeSwitchComponent offlineModeSwitchComponent) {
        this.LLJ = offlineModeSwitchComponent;
    }

    public final void LJ(String str) {
        OfflineModeSwitchComponent.LLJLLIL.LIZIZ(new C625340Ofs(this));
        InterfaceC539120LCk interfaceC539120LCk = this.LLIZ;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ(str, null, false);
        }
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return LIZIZ();
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        return !C1908480zlO.LIZIZ.LJIIIZ(false);
    }

    public final void LJII(EnumC623450Ocp enumC623450Ocp) {
        C19319410i8 c19319410i8 = OfflineModeSwitchComponent.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("2 tryTriggerPopupPush enterMethod ");
        sbLIZ.append(enumC623450Ocp);
        c19319410i8.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!LIZIZ()) {
            return;
        }
        this.LLILZIL = enumC623450Ocp;
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LLJ);
        c0on5.getClass();
        if (c19egLIZ != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(28));
            c419910GdJ.LIZ = R.raw.icon_cloud_play_fill;
            c419910GdJ.LJ = Integer.valueOf(R.attr.af1);
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c19egLIZ);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.atc);
            c384050F3z.LIZJ = Float.valueOf(Float.MAX_VALUE);
            new C19323510in(1008, "offline_mode_user_guide_toast", new InnerPushConfig(0L, null, 0, null, Integer.MAX_VALUE), new InnerPushUITemplate(0, null, 0, 0, 0, 0, null, null, null, null, null, null, null, Collections.singletonList(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(c19egLIZ))), null, 48, 48, 0.0f, 0.5f, null, 20, 20, null, false, -3, 3, null, 0, 0, 2, Boolean.FALSE, 0, 0, 0, 0, 0, null, null, c19egLIZ.getResources().getString(2131838577), null, 2, null, 3, c19egLIZ.getResources().getString(2131838576), null, 36, 48, 4, 0, null, null, 0.5f, null, true, 0, null, null, null, 12, null, null, null, null, null, 0), C2097608Jq.LJIIJ(new Pair("business_tag", "Product")), null, 396).LIZIZ();
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.LLIZLLLIL = false;
        } else {
            if (this.LLIZLLLIL) {
                return;
            }
            this.LLIZLLLIL = true;
            LJ("swipe video");
        }
    }

    @Override // X.InterfaceC1616070s9l, X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        OfflineModeSwitchComponent.LLJLLIL.LIZIZ(new C625330Ofr(this));
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        EnumC623450Ocp enumC623450Ocp = this.LLILZIL;
        if (i != 3 || enumC623450Ocp == null) {
            return false;
        }
        this.LLJ.fo(enumC623450Ocp);
        C0ON5 c0on5 = C0ON5.LIZ;
        C19EG c19egLIZ = C724240Sb0.LIZ(this.LLJ);
        c0on5.getClass();
        C0ON5.LIZJ(c19egLIZ, 2131838578, null);
        if (innerPushMessage != null) {
            C1908480zlO.LIZIZ.LJII(C18JY.CLICK, innerPushMessage, "click", 3);
        }
        InterfaceC539120LCk interfaceC539120LCk = this.LLIZ;
        if (interfaceC539120LCk != null) {
            interfaceC539120LCk.LIZIZ("click ok", null, false);
            return true;
        }
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        String aid;
        String value;
        Aweme awemeLJIIIIZZ;
        C19319410i8 c19319410i8 = OfflineModeSwitchComponent.LLJLLIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("3 interceptInnerPushShow, enterMethod ");
        sbLIZ.append(this.LLILZIL);
        c19319410i8.LIZ(C2188811AlT.LIZIZ(sbLIZ), null);
        this.LLIZ = c20663515tR;
        C625720OgU.LIZIZ().LJIIIIZZ("last_trigger_push_time", System.currentTimeMillis());
        C625720OgU.LIZIZ().LIZJ("local_push_count", C625720OgU.LIZIZ().getInt("local_push_count", 0) + 1);
        C625130OfX c625130OfX = C625130OfX.LIZ;
        IViewPagerComponentAbility iViewPagerComponentAbilityLo = this.LLJ.lo();
        if (iViewPagerComponentAbilityLo != null && (awemeLJIIIIZZ = iViewPagerComponentAbilityLo.LJIIIIZZ()) != null) {
            aid = awemeLJIIIIZZ.getAid();
        } else {
            aid = null;
        }
        EnumC623450Ocp enumC623450Ocp = this.LLILZIL;
        if (enumC623450Ocp != null) {
            value = enumC623450Ocp.getValue();
        } else {
            value = null;
        }
        C625130OfX.LJ(c625130OfX, "show_offline_mode_guide_toast", "homepage_hot", value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, aid, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388616, 131071);
        return null;
    }
}
