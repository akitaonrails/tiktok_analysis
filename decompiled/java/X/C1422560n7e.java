package X;

import Y.AObjectS245S0100000_22;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.PUgcTemplateData;
import com.ss.android.ugc.aweme.creative.model.template.MvModel;
import com.ss.android.ugc.aweme.creative.model.template.TemplateTabSearchModel;
import com.ss.android.ugc.aweme.cutsame.AuthorInfo;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import com.zhiliaoapp.musically.R;
import ge.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS129S0101000_22;
import kotlin.jvm.internal.AwS19S0111000_22;
import kotlin.jvm.internal.AwS35S0010000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422560n7e extends i<InterfaceC1422770n7z, C1423960n9u, C1423070n8T, C1422690n7r> implements InterfaceC1422770n7z {
    public static final C1422650n7n LLLF = new Object() { // from class: X.0n7n
    };
    public static final int LLLFF = 8;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1DRG LLJJ;
    public final ShortVideoContext LLJJI;
    public final int LLJJIII;
    public final InterfaceC1422570n7f LLJJIJI;
    public final InterfaceC1648020szI LLJJIJIIJIL;
    public final InterfaceC1422310n7F LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final Function0<C1423070n8T> LLJJJJ;
    public final C1423960n9u LLJJJJJIL;
    public final Function0<C1423960n9u> LLJJJJLIIL;
    public final Function0<C1422690n7r> LLJJL;
    public InterfaceC524950KiL LLJJLIIIJLLLLLLLZ;
    public final C1422610n7j LLJL;
    public final C01GW LLJLIL;
    public C1419590n2r LLJLILLLLZIIL;
    public final h0<C443120HZe<Boolean, C1419590n2r, Float>> LLJLL;
    public final C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> LLJLLIL;
    public final C560530Lyd<Unit> LLJLLL;
    public final LiveEvent<Unit> LLJZ;
    public boolean LLJZIJLIL;
    public final C1422600n7i LLL;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void M5() {
        /*
            r4 = this;
            X.0mUb r3 = X.C1398350mUb.LIZIZ
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TemplateFeedUIComponent updateCurTemplate: "
            r2.append(r0)
            X.0n2r r0 = r4.LLJLILLLLZIIL
            if (r0 == 0) goto L36
            com.ss.android.ugc.effectmanager.effect.model.Asset r1 = r0.LIZ
            if (r1 == 0) goto L36
            com.ss.android.ugc.aweme.autocut.s r0 = com.ss.android.ugc.aweme.autocut.s.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = com.ss.android.ugc.aweme.autocut.s.LJJLIIIJLJLI(r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.title
        L20:
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C201955140j.LJIILJJIL(r3, r0)
            X.0n2r r1 = r4.LLJLILLLLZIIL
            if (r1 == 0) goto L35
            X.0n7f r0 = r4.LLJJIJI
            if (r0 == 0) goto L35
            r0.fR0(r1)
        L35:
            return
        L36:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422560n7e.M5():void");
    }

    private final C536500L2i Z4() {
        return (C536500L2i) this.LLJJJIL.getValue();
    }

    private final Function0<Boolean> d5() {
        return (Function0) this.LLJLIL.getValue();
    }

    private final void nD1() {
        h0 h0Var;
        LiveEvent<C1422880n8A> liveEventWo;
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            interfaceC1422570n7f.Jb2().LIZ(this, new AObjectS245S0100000_22(this, 0));
        }
        InterfaceC1422570n7f interfaceC1422570n7f2 = this.LLJJIJI;
        if (interfaceC1422570n7f2 != null && (liveEventWo = interfaceC1422570n7f2.wo()) != null) {
            liveEventWo.LJII(this, Lifecycle.State.RESUMED, new AObjectS245S0100000_22(this, 1));
        }
        C1422960n8I c1422960n8IN5 = n5();
        if (c1422960n8IN5 == null || (h0Var = c1422960n8IN5.LJ) == null) {
            return;
        }
        h0Var.LIZ(this, new AObjectS245S0100000_22(this, 2));
    }

    private final void v5() {
        i3(AFwS261S0000000_22.get$arr$(10));
    }

    public final void H5() {
        C19A3 c19a3 = this.LLJILJILJ;
        Activity activity = c19a3.mActivity;
        if (activity == null || C545820Lau.LIZLLL(activity, c19a3)) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(activity);
        c1389880mGw.LJIIIIZZ(2131850002);
        c1389880mGw.LJ(R.raw.icon_exclamation_mark_circle);
        c1389880mGw.LJI(R.attr.a1h);
        c1389880mGw.LIZLLL(3000L);
        c1389880mGw.LJIIJ();
    }

    public final void P4() {
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJI;
        C1419590n2r c1419590n2r = this.LLJLILLLLZIIL;
        TemplateCategoryData templateCategoryDataT4 = T4();
        InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
        c1419580n2q.getClass();
        C1419580n2q.LJ(shortVideoContext, c1419590n2r, templateCategoryDataT4, interfaceC1422310n7F);
        C19A3 c19a3 = this.LLJILJILJ;
        Activity activity = c19a3.mActivity;
        if (activity == null || C545820Lau.LIZLLL(activity, c19a3)) {
            return;
        }
        activity.finish();
    }

    public final TemplateCategoryData T4() {
        if (this.LLJJIII == 2) {
            return new TemplateCategoryData("create_tab_search_trending", "create_tab_search_trending", null, false, null);
        }
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            return interfaceC1422570n7f.Y8();
        }
        return null;
    }

    public final InterfaceC1422590n7h k5() {
        return (InterfaceC1422590n7h) this.LLJJJ.getValue();
    }

    public final C1422960n8I n5() {
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            return interfaceC1422570n7f.AB1();
        }
        return null;
    }

    public final void retry() {
        this.LLJLLL.LJIIJ(Unit.LIZ);
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        C2253081DGo c2253081DGoIU1;
        InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) this.LLJILLL.LJIIL(null, InterfaceC1650230t2r.class);
        if (interfaceC1650230t2r != null && (c2253081DGoIU1 = interfaceC1650230t2r.IU1()) != null) {
            c2253081DGoIU1.LIZLLL(EnumC545560LaU.TEMPLATE_FEED_SCENE, CertProviderManagerKt.findCert("bpea-tools_show_template_feed_scene", 1476788484));
        }
        super.show();
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.AH(this.LLJL);
        }
        this.LLJLL.LJII(new C443120HZe<>(Boolean.TRUE, null, Float.valueOf(0.0f)));
        InterfaceC1648020szI interfaceC1648020szI = this.LLJJIJIIJIL;
        if (interfaceC1648020szI != null) {
            interfaceC1648020szI.showBottomTab(false);
        }
    }

    @Override // X.InterfaceC1422770n7z
    public Pair<Integer, Integer> IF2() {
        return new Pair<>(Integer.valueOf(C1415610mwR.LIZIZ()), Integer.valueOf(C1415610mwR.LIZ() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(70))));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        InterfaceC1422590n7h interfaceC1422590n7hK5;
        InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0dUA;
        InterfaceC1422570n7f interfaceC1422570n7f;
        InterfaceC1422590n7h interfaceC1422590n7hK52;
        super.onCreate();
        InterfaceC1422590n7h interfaceC1422590n7hK53 = k5();
        if (interfaceC1422590n7hK53 == null || !interfaceC1422590n7hK53.zM1()) {
            this.LLJJLIIIJLLLLLLLZ = C0MWZ.LIZ(this.LLJILJILJ);
        } else {
            InterfaceC1422590n7h interfaceC1422590n7hK54 = k5();
            if (interfaceC1422590n7hK54 != null) {
                interfaceC1422590n7hK54.J70(d5());
            }
        }
        if (this.LLJJIII != 1 && (interfaceC1422590n7hK52 = k5()) != null) {
            interfaceC1422590n7hK52.rB1(this.LLL);
        }
        if (C298920Bne.LIZ() && this.LLJJIII != 1 && (interfaceC1422590n7hK5 = k5()) != null && (interfaceC816210W0dUA = interfaceC1422590n7hK5.UA()) != null && (interfaceC1422570n7f = this.LLJJIJI) != null) {
            interfaceC1422570n7f.mO2(interfaceC816210W0dUA);
        }
        v5();
        nD1();
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1422590n7h interfaceC1422590n7hK5 = k5();
        if (interfaceC1422590n7hK5 != null) {
            interfaceC1422590n7hK5.ya0(d5());
        }
        InterfaceC1422590n7h interfaceC1422590n7hK52 = k5();
        if (interfaceC1422590n7hK52 != null) {
            interfaceC1422590n7hK52.BN2(this.LLL);
        }
    }

    @Override // X.InterfaceC1422770n7z
    public boolean onKeyBack() {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            i3(AFwS261S0000000_22.get$arr$(12));
        }
        return zIsShowing;
    }

    @Override // ge.i
    public Function0<C1423960n9u> E3() {
        return this.LLJJJJLIIL;
    }

    @Override // X.InterfaceC1422770n7z
    public LiveEvent<Unit> Iz() {
        return this.LLJZ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1423070n8T> o2() {
        return this.LLJJJJ;
    }

    @Override // X.InterfaceC1422770n7z
    public C385670FAf<C443120HZe<Boolean, C1419590n2r, Float>> qx1() {
        return this.LLJLLIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1422690n7r> w2() {
        return this.LLJJL;
    }

    public final void D5(String str) {
        String str2;
        if (!isShowing() && getLifecycle().getCurrentState() != Lifecycle.State.RESUMED) {
            return;
        }
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        if (T2().LIZIZ == 3) {
            str2 = "create_tab_search_result_page";
        } else {
            str2 = "create_tab_template_detail";
        }
        c1422480n7W.getClass();
        C1422480n7W.LIZLLL(true, "template_search_bar", str, null, str2, null);
    }

    public final void F1(C1422540n7c c1422540n7c) {
        TemplateCategoryData templateCategoryDataT4 = T4();
        int i = c1422540n7c.LIZ;
        String str = c1422540n7c.LIZIZ;
        int i2 = c1422540n7c.LIZJ;
        long j = c1422540n7c.LJ;
        long j2 = c1422540n7c.LJFF;
        int i3 = c1422540n7c.LJI;
        C1419590n2r c1419590n2r = c1422540n7c.LJII;
        c1422540n7c.getClass();
        C1422540n7c c1422540n7c2 = new C1422540n7c(i, str, i2, templateCategoryDataT4, j, j2, i3, c1419590n2r);
        InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.F1(c1422540n7c2);
        }
    }

    public final void F4(float f) {
        InterfaceC1422570n7f interfaceC1422570n7f;
        C2253081DGo c2253081DGoIU1;
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJI;
        C1419590n2r c1419590n2r = this.LLJLILLLLZIIL;
        TemplateCategoryData templateCategoryDataT4 = T4();
        InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
        c1419580n2q.getClass();
        C1419580n2q.LJ(shortVideoContext, c1419590n2r, templateCategoryDataT4, interfaceC1422310n7F);
        InterfaceC1422590n7h interfaceC1422590n7hK5 = k5();
        if (interfaceC1422590n7hK5 != null) {
            interfaceC1422590n7hK5.BN2(this.LLL);
        }
        if (this.LLJJIII == 2) {
            InterfaceC1422590n7h interfaceC1422590n7hK52 = k5();
            if (interfaceC1422590n7hK52 != null) {
                interfaceC1422590n7hK52.ya0(d5());
            }
            InterfaceC1422590n7h interfaceC1422590n7hK53 = k5();
            if (interfaceC1422590n7hK53 != null) {
                interfaceC1422590n7hK53.wC2(null);
            }
            InterfaceC1422570n7f interfaceC1422570n7f2 = this.LLJJIJI;
            if (interfaceC1422570n7f2 != null) {
                interfaceC1422570n7f2.iE0(null);
                return;
            }
            return;
        }
        InterfaceC1650230t2r interfaceC1650230t2r = (InterfaceC1650230t2r) this.LLJILLL.LJIIL(null, InterfaceC1650230t2r.class);
        if (interfaceC1650230t2r != null && (c2253081DGoIU1 = interfaceC1650230t2r.IU1()) != null) {
            c2253081DGoIU1.LIZIZ(EnumC545560LaU.TEMPLATE_FEED_SCENE, CertProviderManagerKt.findCert("bpea-tools_hide_template_feed_scene", 1476788229), Boolean.FALSE);
        }
        if (!C1423570n9H.LIZJ(T4()) || (interfaceC1422570n7f = this.LLJJIJI) == null || !interfaceC1422570n7f.wO1()) {
            M5();
        }
        hide();
        InterfaceC1422570n7f interfaceC1422570n7f3 = this.LLJJIJI;
        if (interfaceC1422570n7f3 != null) {
            interfaceC1422570n7f3.GO2(false);
            interfaceC1422570n7f3.iE0(this.LLJLILLLLZIIL);
        }
        this.LLJLL.LJII(new C443120HZe<>(Boolean.FALSE, this.LLJLILLLLZIIL, Float.valueOf(f)));
        InterfaceC1648020szI interfaceC1648020szI = this.LLJJIJIIJIL;
        if (interfaceC1648020szI != null) {
            interfaceC1648020szI.showBottomTab(true);
        }
        InterfaceC524950KiL interfaceC524950KiL = this.LLJJLIIIJLLLLLLLZ;
        if (interfaceC524950KiL != null) {
            interfaceC524950KiL.b8(this.LLJL);
        }
        C536500L2i c536500L2iZ4 = Z4();
        if (c536500L2iZ4 != null) {
            View view = (View) c536500L2iZ4.LIZJ.getValue();
            if (view != null) {
                C375780EoK.LIZIZ(view, false);
            }
            ViewGroup viewGroup = (ViewGroup) c536500L2iZ4.LIZIZ.getValue();
            if (viewGroup != null) {
                C786410Ut5.LJJJLZIJ((View) c536500L2iZ4.LIZJ.getValue(), viewGroup);
            }
        }
    }

    public final void H4(boolean z) {
        if (!C298920Bne.LIZ()) {
            return;
        }
        int i = 3;
        if (this.LLJJIII == 3) {
            i = 2;
        }
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        ShortVideoContext shortVideoContext = this.LLJJI;
        c1422480n7W.getClass();
        C1422480n7W.LIZJ(shortVideoContext, z, i);
        InterfaceC1422590n7h interfaceC1422590n7hK5 = k5();
        if (interfaceC1422590n7hK5 != null) {
            interfaceC1422590n7hK5.qp1(null, null, new AwS19S0111000_22(this, i, z, 0));
        }
    }

    public final void O4(boolean z) {
        TemplateCategoryData templateCategoryDataT4;
        String str;
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null && (templateCategoryDataT4 = T4()) != null) {
            if (z) {
                str = "auto";
            } else {
                str = "manual";
            }
            ShortVideoContext shortVideoContext = this.LLJJI;
            C1419580n2q.LJIILJJIL(str, templateCategoryDataT4, shortVideoContext.shootWay, shortVideoContext.getCreationId());
            interfaceC1422570n7f.s92(templateCategoryDataT4, false, true, z, 1, C1337770kut.LIZ());
        }
    }

    @Override // X.InterfaceC1422770n7z
    public void Q01(C1419590n2r c1419590n2r) {
        String str;
        int i = this.LLJJIII;
        if (i != 1 && i != 2) {
            return;
        }
        this.LLJZIJLIL = true;
        if (!Intrinsics.LJFF(this.LLJJI.creativeModel.templateSchemaData.schemaTag, "template_schema") || this.LLJJI.creativeModel.templateSchemaData.throughTemplateSquareH5) {
            InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
            if (interfaceC1422310n7F != null) {
                interfaceC1422310n7F.cr2(1, new C1422430n7R(0, c1419590n2r, T4(), false));
            }
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJI;
            if (this.LLJJIII == 2) {
                str = "template_search";
            } else {
                str = "mv_preview_page";
            }
            TemplateCategoryData templateCategoryDataT4 = T4();
            InterfaceC1422310n7F interfaceC1422310n7F2 = this.LLJJIJIL;
            c1419580n2q.getClass();
            C1419580n2q.LJIILIIL(shortVideoContext, str, 0, c1419590n2r, templateCategoryDataT4, false, interfaceC1422310n7F2);
        }
        this.LLJLILLLLZIIL = c1419590n2r;
        i3(new AwS601S0100000_22(c1419590n2r, 7));
    }

    @Override // X.InterfaceC1422770n7z
    public void el2(EnumC1423210n8h enumC1423210n8h) {
        i3(new AwS601S0100000_22(enumC1423210n8h, 8));
    }

    @Override // X.InterfaceC1422770n7z
    public void jr1(boolean z) {
        i3(new AwS35S0010000_22(z, 0));
    }

    public final FilteredAsset kQ0(C1419590n2r c1419590n2r) {
        InterfaceC1422570n7f interfaceC1422570n7f;
        if (!C1423570n9H.LIZJ(T4()) || (interfaceC1422570n7f = this.LLJJIJI) == null) {
            return null;
        }
        return interfaceC1422570n7f.kQ0(c1419590n2r);
    }

    public final void t5(C1419590n2r c1419590n2r) {
        AuthorInfo authorInfo;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI != null && (authorInfo = cutsameDataItemLJJLIIIJLJLI.author) != null) {
            C19724912Fj c19724912FjLIZLLL = C19724912Fj.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("aweme://user/profile/");
            sbLIZ.append(authorInfo.uid);
            C686150Qvl c686150Qvl = new C686150Qvl(C2188811AlT.LIZIZ(sbLIZ));
            c686150Qvl.LIZIZ("enter_from", "mv_preview_page");
            c19724912FjLIZLLL.LJII(c686150Qvl.LIZJ());
        }
    }

    @Override // X.InterfaceC1422770n7z
    public void th1(boolean z) {
        i3(new AwS35S0010000_22(z, 3));
    }

    @Override // X.InterfaceC1422770n7z
    public void vh0(boolean z) {
        i3(new AwS35S0010000_22(z, 2));
    }

    public final void C5(int i, C1419590n2r c1419590n2r) {
        TemplateCategoryData templateCategoryDataT4 = T4();
        if (c1419590n2r != null && templateCategoryDataT4 != null) {
            InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
            if (interfaceC1422570n7f != null) {
                interfaceC1422570n7f.Ff1(i);
            }
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJI;
            InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
            c1419580n2q.getClass();
            C1419580n2q.LJIILIIL(shortVideoContext, "mv_preview_page", i, c1419590n2r, templateCategoryDataT4, false, interfaceC1422310n7F);
            InterfaceC1422310n7F interfaceC1422310n7F2 = this.LLJJIJIL;
            if (interfaceC1422310n7F2 != null) {
                interfaceC1422310n7F2.cr2(1, new C1422430n7R(i, c1419590n2r, templateCategoryDataT4, false));
            }
        }
    }

    public final void K4(C1419590n2r c1419590n2r, int i) {
        InterfaceC1422570n7f interfaceC1422570n7f = this.LLJJIJI;
        if (interfaceC1422570n7f != null) {
            interfaceC1422570n7f.ES1(c1419590n2r, i, this.LLJJIJIL, T4(), new AwS129S0101000_22(this, i, 0));
        }
    }

    public final void N5(C1419590n2r c1419590n2r, int i) {
        boolean z;
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        if (cutsameDataItemLJJLIIIJLJLI == null) {
            return;
        }
        ITemplateConsumeService iTemplateConsumeService = C522540KeS.LIZ;
        EnumC1412640mre enumC1412640mreLIZIZ = cutsameDataItemLJJLIIIJLJLI.LIZIZ();
        if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(2, enumC1412640mreLIZIZ, null, null) && this.LLJJIII == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLJJIII != 1 ? !(iTemplateConsumeService == null || !iTemplateConsumeService.LJFF(1, enumC1412640mreLIZIZ, null, null)) : z) {
            R5(this, i, c1419590n2r, cutsameDataItemLJJLIIIJLJLI, z, iTemplateConsumeService);
            return;
        }
        C536500L2i c536500L2iZ4 = Z4();
        if (c536500L2iZ4 == null) {
            return;
        }
        c536500L2iZ4.LIZ(cutsameDataItemLJJLIIIJLJLI.templateType, this.LLJJI.getCreationId(), cutsameDataItemLJJLIIIJLJLI.templateId, cutsameDataItemLJJLIIIJLJLI.extra, new C1422620n7k(this, i, c1419590n2r, cutsameDataItemLJJLIIIJLJLI, z, iTemplateConsumeService));
    }

    public final void x5(int i, C1419590n2r c1419590n2r, long j) {
        TemplateCategoryData templateCategoryDataT4 = T4();
        if (c1419590n2r != null) {
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            ShortVideoContext shortVideoContext = this.LLJJI;
            InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
            c1419580n2q.getClass();
            C1419580n2q.LJII(shortVideoContext, "mv_preview_page", i, c1419590n2r, templateCategoryDataT4, j, false, interfaceC1422310n7F);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void E5(X.C1419590n2r r14, android.graphics.Rect r15, float r16, android.graphics.Bitmap r17) {
        /*
            r13 = this;
            X.0n7f r5 = r13.LLJJIJI
            if (r5 == 0) goto La5
            X.0mUb r4 = X.C1398350mUb.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "refreshData: curCategory = "
            r1.append(r0)
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r0 = r13.T4()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "TemplateFeedUIComponent"
            X.C201955140j.LIZLLL(r4, r0, r1)
            com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData r3 = r13.T4()
            if (r3 == 0) goto La5
            java.util.List r7 = r5.PE(r3)
            if (r7 == 0) goto La5
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TemplateFeedUIComponent refreshData: curTemplate = "
            r6.append(r0)
            X.0n2r r0 = r5.RN()
            r2 = 0
            if (r0 == 0) goto La6
            com.ss.android.ugc.effectmanager.effect.model.Asset r1 = r0.LIZ
            if (r1 == 0) goto La6
            com.ss.android.ugc.aweme.autocut.s r0 = com.ss.android.ugc.aweme.autocut.s.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = com.ss.android.ugc.aweme.autocut.s.LJJLIIIJLJLI(r1)
            if (r0 == 0) goto La6
            java.lang.String r0 = r0.title
        L4c:
            r6.append(r0)
            java.lang.String r0 = ", template = "
            r6.append(r0)
            com.ss.android.ugc.aweme.autocut.s r1 = com.ss.android.ugc.aweme.autocut.s.LIZ
            r8 = r14
            com.ss.android.ugc.effectmanager.effect.model.Asset r0 = r8.LIZ
            r1.getClass()
            com.ss.android.ugc.aweme.cutsame.CutsameDataItem r0 = com.ss.android.ugc.aweme.autocut.s.LJJLIIIJLJLI(r0)
            if (r0 == 0) goto L64
            java.lang.String r2 = r0.title
        L64:
            r6.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r6)
            X.C201955140j.LJIILJJIL(r4, r0)
            X.0FAf r0 = r5.Jb2()
            java.lang.Object r0 = r0.LIZJ()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r3)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 == 0) goto La5
            java.lang.Object r12 = r0.getFirst()
            X.0n8B r12 = (X.C1422890n8B) r12
            if (r12 == 0) goto La5
            r13.LLJLILLLLZIIL = r8
            X.0n7g r6 = new X.0n7g
            r11 = r17
            r10 = r16
            r9 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.i3(r6)
            X.0n2q r2 = X.C1419580n2q.LIZ
            com.ss.android.ugc.aweme.shortvideo.ShortVideoContext r1 = r13.LLJJI
            int r0 = r7.indexOf(r8)
            r2.getClass()
            X.C1419580n2q.LIZJ(r1, r0, r8, r3)
        La5:
            return
        La6:
            r0 = r2
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1422560n7e.E5(X.0n2r, android.graphics.Rect, float, android.graphics.Bitmap):void");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [X.0n7j] */
    /* JADX WARN: Type inference failed for: r0v23, types: [X.0n7i] */
    public C1422560n7e(C19A3 c19a3, C1DRG c1drg, C1DRG c1drg2, ShortVideoContext shortVideoContext, int i) {
        InterfaceC1422310n7F interfaceC1422310n7F;
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = c1drg2;
        this.LLJJI = shortVideoContext;
        this.LLJJIII = i;
        InterfaceC1422570n7f interfaceC1422570n7f = (InterfaceC1422570n7f) c1drg.LJIIL(null, InterfaceC1422570n7f.class);
        if (interfaceC1422570n7f == null) {
            if (c1drg2 != null) {
                interfaceC1422570n7f = (InterfaceC1422570n7f) c1drg2.LJIIL(null, InterfaceC1422570n7f.class);
            } else {
                interfaceC1422570n7f = null;
            }
        }
        this.LLJJIJI = interfaceC1422570n7f;
        this.LLJJIJIIJIL = (InterfaceC1648020szI) c1drg.LJIIL(null, InterfaceC1648020szI.class);
        if (c1drg2 != null) {
            interfaceC1422310n7F = (InterfaceC1422310n7F) c1drg2.LJIIL(null, InterfaceC1422310n7F.class);
        } else {
            interfaceC1422310n7F = null;
        }
        this.LLJJIJIL = interfaceC1422310n7F;
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 15));
        this.LLJJJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 11));
        this.LLJJJJ = new AwS566S0100000_22(this, 10);
        this.LLJJJJJIL = new C1423960n9u();
        this.LLJJJJLIIL = new AwS566S0100000_22(this, 14);
        this.LLJJL = new AwS566S0100000_22(this, 13);
        this.LLJL = new InterfaceC362610EJn() { // from class: X.0n7j
            @Override // X.InterfaceC362610EJn
            public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
                InterfaceC1422590n7h interfaceC1422590n7hK5;
                if (i2 != 4 || ((interfaceC1422590n7hK5 = this.LL.k5()) != null && interfaceC1422590n7hK5.zM1())) {
                    return false;
                }
                this.LL.i3(AFwS261S0000000_22.get$arr$(11));
                return true;
            }
        };
        this.LLJLIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 12));
        h0<C443120HZe<Boolean, C1419590n2r, Float>> h0Var = new h0<>(new C443120HZe(Boolean.FALSE, null, Float.valueOf(0.0f)));
        this.LLJLL = h0Var;
        this.LLJLLIL = h0Var;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJLLL = c560530Lyd;
        this.LLJZ = c560530Lyd;
        this.LLL = new InterfaceC1422390n7N() { // from class: X.0n7i
            @Override // X.InterfaceC1422390n7N
            public final void LIZ(String str, boolean z) {
                String resource_id;
                Asset asset;
                C1419590n2r c1419590n2r = this.LIZ.LLJLILLLLZIIL;
                if (c1419590n2r != null && (asset = c1419590n2r.LIZ) != null) {
                    resource_id = asset.getResource_id();
                } else {
                    resource_id = null;
                }
                if (Intrinsics.LJFF(resource_id, str)) {
                    this.LIZ.i3(new AwS35S0010000_22(z, 1));
                }
            }
        };
    }

    @Override // X.InterfaceC1422770n7z
    public void RQ1(Rect rect, C1419590n2r c1419590n2r, int i, float f, Bitmap bitmap) {
        InterfaceC1422570n7f interfaceC1422570n7f;
        this.LLJJJJJIL.LLLIL = true;
        show();
        E5(c1419590n2r, rect, f, bitmap);
        i3(AFwS261S0000000_22.get$arr$(13));
        InterfaceC1422590n7h interfaceC1422590n7hK5 = k5();
        if ((interfaceC1422590n7hK5 == null || !interfaceC1422590n7hK5.zM1()) && (interfaceC1422570n7f = this.LLJJIJI) != null) {
            interfaceC1422570n7f.GO2(true);
        }
        InterfaceC1422310n7F interfaceC1422310n7F = this.LLJJIJIL;
        if (interfaceC1422310n7F != null) {
            interfaceC1422310n7F.cr2(1, new C1422430n7R(i, c1419590n2r, T4(), false));
        }
    }

    public static final void R5(C1422560n7e c1422560n7e, int i, C1419590n2r c1419590n2r, CutsameDataItem cutsameDataItem, boolean z, ITemplateConsumeService iTemplateConsumeService) {
        String str;
        String str2;
        List<String> hashtag;
        List<String> hashtag2;
        InterfaceC1422440n7S interfaceC1422440n7S;
        C1422410n7P c1422410n7PMC1;
        String str3;
        String strLIZLLL;
        TemplateCategoryData templateCategoryDataT4 = c1422560n7e.T4();
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        ShortVideoContext shortVideoContext = c1422560n7e.LLJJI;
        InterfaceC1422310n7F interfaceC1422310n7F = c1422560n7e.LLJJIJIL;
        c1419580n2q.getClass();
        s sVar = s.LIZ;
        Asset asset = c1419590n2r.LIZ;
        sVar.getClass();
        CutsameDataItem cutsameDataItemLJJLIIIJLJLI = s.LJJLIIIJLJLI(asset);
        TemplateTabSearchModel templateTabSearchModel = null;
        if (cutsameDataItemLJJLIIIJLJLI != null) {
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("creation_id", shortVideoContext.getCreationId());
            c0lab.LJ("shoot_way", shortVideoContext.shootWay);
            c0lab.LJ("enter_from", "mv_preview_page");
            c0lab.LIZ(i, "impr_position");
            EnumC1412640mre enumC1412640mreLIZJ = C1412660mrg.LIZJ(cutsameDataItemLJJLIIIJLJLI.templateType);
            if (enumC1412640mreLIZJ != null) {
                strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZJ);
            } else {
                strLIZLLL = null;
            }
            c0lab.LJ("tt_template_type", strLIZLLL);
            c0lab.LJ("mv_id", cutsameDataItemLJJLIIIJLJLI.templateId);
            c0lab.LJ("mv_name", cutsameDataItemLJJLIIIJLJLI.title);
            c0lab.LJ("template_tags", cutsameDataItemLJJLIIIJLJLI.templateTag);
            c0lab.LJ("is_cache_template", C1402490mbH.LIZ(c1419590n2r.LIZIZ));
            c0lab.LIZLLL(c1419590n2r.LIZ.getBusiness_extra().getAsset_from(), "asset_from");
            c0lab.LJ("ai_template_func_list", cutsameDataItemLJJLIIIJLJLI.aiTemplateFuncList);
            if (templateCategoryDataT4 != null) {
                c0lab.LJ("tab_name", templateCategoryDataT4.name);
                c0lab.LJ("category_key", templateCategoryDataT4.key);
            }
            if (interfaceC1422310n7F != null) {
                interfaceC1422310n7F.d91(c0lab, templateCategoryDataT4, Integer.valueOf(i), c1419590n2r, "click_try_this_template");
            }
            C20684815ws.LJIILLIIL("click_try_this_template", c0lab.LIZ);
        }
        if (Intrinsics.LJFF(c1422560n7e.LLJJI.creativeModel.templateSchemaData.schemaTag, "template_schema") && c1422560n7e.LLJZIJLIL) {
            C1419580n2q.LJIIL(c1422560n7e.LLJJI, cutsameDataItem);
        }
        MvModel mvModel = c1422560n7e.LLJJI.creativeModel.mvModel;
        mvModel.templateId = cutsameDataItem.templateId;
        mvModel.templateType = cutsameDataItem.templateType;
        if (templateCategoryDataT4 != null) {
            str = templateCategoryDataT4.name;
        } else {
            str = null;
        }
        mvModel.templateCategoryName = str;
        if (templateCategoryDataT4 != null) {
            str2 = templateCategoryDataT4.key;
        } else {
            str2 = null;
        }
        mvModel.templateCategoryKey = str2;
        mvModel.templatePosition = i;
        mvModel.templateFromCache = c1419590n2r.LIZIZ;
        mvModel.isFromTemplateTabUseNow = false;
        InterfaceC1422570n7f interfaceC1422570n7f = c1422560n7e.LLJJIJI;
        if ((interfaceC1422570n7f instanceof InterfaceC1422440n7S) && (interfaceC1422440n7S = (InterfaceC1422440n7S) interfaceC1422570n7f) != null && (c1422410n7PMC1 = interfaceC1422440n7S.MC1()) != null && (str3 = c1422410n7PMC1.LIZIZ) != null && str3.length() != 0) {
            templateTabSearchModel = new TemplateTabSearchModel(null, null, null, null, null, null, null, null, null, 0, null);
            templateTabSearchModel.templateSearchEnterFrom = str3;
            templateTabSearchModel.creatorSearchInfo = templateTabSearchModel.creatorSearchInfo;
            templateTabSearchModel.createTabSearchLocation = String.valueOf(c1422410n7PMC1.LIZJ);
            templateTabSearchModel.tabSearchEnterMethod = c1422410n7PMC1.LJFF;
            templateTabSearchModel.isQuickSearch = c1422410n7PMC1.LIZLLL ? 1 : 0;
            templateTabSearchModel.wordsPosition = c1422410n7PMC1.LJI;
            if (!C1422460n7U.LIZIZ(c1422560n7e.T4())) {
                templateTabSearchModel.searchKeyword = interfaceC1422440n7S.XY1().getFirst();
                templateTabSearchModel.searchId = interfaceC1422440n7S.XY1().getSecond();
                templateTabSearchModel.searchType = "create_tab_search_general";
                templateTabSearchModel.searchResultId = c1419590n2r.LIZ.getAsset_id();
                templateTabSearchModel.searchUniversalRank = String.valueOf(i);
            }
        }
        mvModel.templateTabSearchModel = templateTabSearchModel;
        if (Intrinsics.LJFF(c1422560n7e.LLJJI.creativeModel.templateSchemaData.schemaTag, "template_schema") && (hashtag = c1419590n2r.LIZ.getBusiness_extra().getHashtag()) != null && !hashtag.isEmpty() && (hashtag2 = c1419590n2r.LIZ.getBusiness_extra().getHashtag()) != null) {
            PUgcTemplateData pUgcTemplateData = c1422560n7e.LLJJI.creativeModel.pugcTemplateData;
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(hashtag2);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C1953307kx.LIZ.getClass();
                if (C1953307kx.LIZLLL((String) obj)) {
                    arrayList2.add(obj);
                }
            }
            pUgcTemplateData.hashtags = arrayList2;
        }
        if (z) {
            ShortVideoContext shortVideoContext2 = c1422560n7e.LLJJI;
            shortVideoContext2.creativeModel.templateConsumeData.nleSummary = cutsameDataItem.templateData;
            Activity activity = c1422560n7e.LLJILJILJ.mActivity;
            if (activity != null) {
                iTemplateConsumeService.LJ(activity, cutsameDataItem.LIZIZ(), shortVideoContext2, C1412390mrF.LJIILLIIL, cutsameDataItem.templateId);
                return;
            }
            return;
        }
        InterfaceC1422570n7f interfaceC1422570n7f2 = c1422560n7e.LLJJIJI;
        if (interfaceC1422570n7f2 == null) {
            return;
        }
        interfaceC1422570n7f2.bA0(cutsameDataItem);
    }
}
