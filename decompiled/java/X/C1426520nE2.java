package X;

import Y.AObjectS305S0200000_22;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.effect.EffectSearchModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS161S0101000_22;
import kotlin.jvm.internal.AwS19S2000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426520nE2 extends i<InterfaceC1426620nEC, C1427030nEr, C1426550nE5, C1426920nEg> implements InterfaceC379610EuV, InterfaceC1426620nEC {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJL;
    public final Activity LLJILJILJ;
    public final C1DRG LLJILLL;
    public final VideoPublishEditModel LLJJ;
    public String LLJJI;
    public InterfaceC1426650nEF LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public C09AE LLJJJ;
    public C09AE LLJJJIL;
    public final Function0<Boolean> LLJJJJ;
    public final Function0<C1426550nE5> LLJJJJJIL;
    public final Function0<C1426920nEg> LLJJJJLIIL;
    public final C385670FAf<Boolean> LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1426520nE2.class, "editFavoriteApi", "getEditFavoriteApi()Lcom/ss/ugc/android/editor/base/resource/base/EditPanelFavoriteApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1426520nE2.class, "searchCoreApi", "getSearchCoreApi()Lcom/ss/android/ugc/aweme/editeffect/search/middleware/IEditEffectSearchCoreApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1426520nE2.class, "searchRootApi", "getSearchRootApi()Lcom/ss/android/ugc/aweme/editeffect/search/EditEffectSearchPanelApi;", 0);
        c09r3.getClass();
        LLJL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
    }

    private final InterfaceC1635410sex K4() {
        return (InterfaceC1635410sex) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final InterfaceC361290EEl H4() {
        return (InterfaceC361290EEl) this.LLJJIJI.getValue(this, LLJL[0]);
    }

    public final InterfaceC1426440nDu O4() {
        return (InterfaceC1426440nDu) this.LLJJIJIIJIL.getValue(this, LLJL[1]);
    }

    public final InterfaceC1426280nDe P4() {
        return (InterfaceC1426280nDe) this.LLJJIJIL.getValue(this, LLJL[2]);
    }

    @Override // X.InterfaceC1426620nEC
    public void wa1() {
        i3(AFwS261S0000000_22.get$arr$(51));
    }

    private final void Xi() {
        C1426110nDN c1426110nDNIr;
        InterfaceC1426280nDe interfaceC1426280nDeP4 = P4();
        if (interfaceC1426280nDeP4 == null || (c1426110nDNIr = interfaceC1426280nDeP4.ir()) == null) {
            return;
        }
        c1426110nDNIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1426110nDNIr, this, 1));
    }

    public final void LLILZLL() {
        String str = T2().LJIIIZ;
        if (str == null) {
            str = "";
        }
        String str2 = T2().LJIIJ;
        SG0(str, str2 != null ? str2 : "");
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1426620nEC
    public C385670FAf<Boolean> getVisible() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426550nE5> o2() {
        return this.LLJJJJJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1426920nEg> w2() {
        return this.LLJJJJLIIL;
    }

    private final void F4(final Function1<? super Boolean, Unit> function1) {
        if (!C0CHQ.LIZ().getAccountService().isLogin()) {
            Activity activity = this.LLJILJILJ;
            String enterFrom = this.LLJJ.getEnterFrom();
            if (enterFrom == null) {
                enterFrom = "";
            }
            C0XPD.LIZIZ(activity, "video_edit_page", enterFrom, null, new InterfaceC849390XTt() { // from class: X.0nE8
                @Override // X.InterfaceC849390XTt
                public final void LIZ() {
                    function1.invoke(Boolean.FALSE);
                }

                @Override // X.InterfaceC849390XTt
                public final void LIZIZ() {
                    function1.invoke(Boolean.TRUE);
                }
            });
            return;
        }
        function1.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC1426620nEC
    public void Eb(InterfaceC1426650nEF interfaceC1426650nEF) {
        this.LLJJIII = interfaceC1426650nEF;
    }

    public final boolean Z4(String str) {
        if (Intrinsics.LJFF(T2().LIZIZ, Boolean.TRUE) && Intrinsics.LJFF(this.LLJJI, str)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1426620nEC
    public void aB(String str) {
        i3(new AwS72S1000000_22(str, 1));
    }

    public final void x5(int i) {
        if (!T2().LJII && T2().LJI) {
            i3(AFwS261S0000000_22.get$arr$(50));
            C09AE c09ae = this.LLJJJIL;
            if (c09ae != null) {
                c09ae.LIZIZ(null);
            }
            this.LLJJJIL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1426500nE0(this, i, null), 2);
        }
    }

    @Override // X.InterfaceC1426620nEC
    public void zR0(boolean z) {
        InterfaceC1426280nDe interfaceC1426280nDeP4;
        InterfaceC1426280nDe interfaceC1426280nDeP42 = P4();
        if (interfaceC1426280nDeP42 != null) {
            interfaceC1426280nDeP42.pt(this.LLJJJJ);
        }
        if (!Intrinsics.LJFF(T2().LIZIZ, Boolean.TRUE)) {
            return;
        }
        i3(AFwS261S0000000_22.get$arr$(49));
        if (z && (interfaceC1426280nDeP4 = P4()) != null) {
            interfaceC1426280nDeP4.Vb1(false, 8);
        }
    }

    @Override // X.InterfaceC1426620nEC
    public void SG0(String str, String str2) {
        InterfaceC1426280nDe interfaceC1426280nDeP4 = P4();
        if (interfaceC1426280nDeP4 != null) {
            interfaceC1426280nDeP4.gR0(this.LLJJJJ);
        }
        i3(new AwS19S2000000_22(str, str2, 0));
        InterfaceC1426280nDe interfaceC1426280nDeP42 = P4();
        if (interfaceC1426280nDeP42 != null) {
            interfaceC1426280nDeP42.Vb1(true, 8);
        }
        show();
        C09AE c09ae = this.LLJJJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        C09AE c09ae2 = this.LLJJJIL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
        }
        this.LLJJJ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1426490nDz(this, str, str2, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0016 A[PHI: r9
      0x0016: PHI (r9v3 boolean) = (r9v0 boolean), (r9v4 boolean) binds: [B:19:0x0047, B:10:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t5(com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse r21, boolean r22) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1426520nE2.t5(com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse, boolean):void");
    }

    public final boolean k5(EffectModel effectModel, int i, String str, boolean z) {
        InterfaceC1426650nEF interfaceC1426650nEF = this.LLJJIII;
        if (interfaceC1426650nEF == null || !interfaceC1426650nEF.LIZJ(effectModel)) {
            return false;
        }
        return true;
    }

    public final void n5(EffectModel effectModel, int i, String str, boolean z) {
        String str2;
        boolean z2;
        String str3;
        C113G c113g = T2().LIZ;
        if (T2().LIZ.LJJIIZI) {
            str2 = "editor_pro_panel";
        } else {
            str2 = "edit_page_panel";
        }
        EffectSearchModel effectSearchModel = new EffectSearchModel(str2, "editing_effect", T2().LJIIIIZZ, T2().LJIIIZ, effectModel.resourceId, String.valueOf(i), str, Boolean.valueOf(z), Boolean.FALSE, Boolean.FALSE, null);
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJ;
        String str4 = effectModel.key;
        boolean z3 = false;
        if (c113g != null) {
            z2 = c113g.LJJIIZI;
            z3 = c113g.LJJIIZI;
        } else {
            z2 = false;
        }
        Integer numValueOf = Integer.valueOf(effectModel.source);
        String str5 = effectModel.designerId;
        if (c113g == null || (str3 = c113g.LJJIJIIJI) == null) {
            str3 = "";
        }
        String str6 = effectModel.recommendReason;
        String str7 = effectModel.recommendRuleTags;
        C1413460msy c1413460msy = new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel));
        c1413450msx.getClass();
        C1413450msx.LJIILLIIL(videoPublishEditModel, str4, null, i, z2, z3, "other", numValueOf, str5, effectModel, str3, str6, str7, c1413460msy, false, effectSearchModel);
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("search_id", effectSearchModel.getSearchId());
        c0lab.LJ("enter_from", effectSearchModel.getSearchFrom());
        c0lab.LJ("search_keyword", effectSearchModel.getSearchKeyword());
        c0lab.LJ("search_result_id", effectSearchModel.getSearchResultId());
        c0lab.LJ("token_type", effectSearchModel.getTokenType());
        c0lab.LIZ(Intrinsics.LJFF(effectSearchModel.isFirstScreen(), Boolean.TRUE) ? 1 : 0, "is_first_screen");
        c0lab.LJ("universal_rank", effectSearchModel.getSearchUniversalRank());
        c0lab.LJ("creator_search_info", effectSearchModel.getCreatorSearchInfo());
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("search_result_show", c0lab.LIZ);
    }

    public final void v5(EffectModel effectModel, int i, String str, boolean z) {
        String str2;
        this.LLJJI = effectModel.key;
        if (T2().LIZ.LJJIIZI) {
            str2 = "editor_pro_panel";
        } else {
            str2 = "edit_page_panel";
        }
        EffectSearchModel effectSearchModel = new EffectSearchModel(str2, "editing_effect", T2().LJIIIIZZ, T2().LJIIIZ, effectModel.resourceId, String.valueOf(i), str, Boolean.valueOf(z), Boolean.FALSE, Boolean.FALSE, null);
        C1413450msx.LIZ.getClass();
        C1413450msx.LJIJJ(effectSearchModel);
    }

    public final boolean T4(EffectModel effectModel, int i, boolean z, String str, boolean z2) {
        String str2;
        if (T2().LIZ.LJJIIZI) {
            str2 = "editor_pro_panel";
        } else {
            str2 = "edit_page_panel";
        }
        EffectSearchModel effectSearchModel = new EffectSearchModel(str2, "editing_effect", T2().LJIIIIZZ, T2().LJIIIZ, effectModel.resourceId, String.valueOf(i), str, Boolean.valueOf(z2), Boolean.FALSE, Boolean.FALSE, Long.valueOf(System.currentTimeMillis()));
        effectModel.searchModel = effectSearchModel;
        if (!Intrinsics.LJFF(effectModel.key, this.LLJJI)) {
            C1413450msx.LIZ.getClass();
            C1413450msx.LJIJJ(effectSearchModel);
        } else {
            this.LLJJI = null;
        }
        C113G c113g = T2().LIZ;
        C1413450msx c1413450msx = C1413450msx.LIZ;
        VideoPublishEditModel videoPublishEditModel = this.LLJJ;
        String str3 = effectModel.key;
        C1413460msy c1413460msy = new C1413460msy(95, null, null, C1403680mdC.LIZLLL(effectModel));
        boolean z3 = c113g.LJJIIZI;
        String str4 = c113g.LJJIJIIJI;
        if (str4 == null) {
            str4 = "";
        }
        c1413450msx.getClass();
        C1413450msx.LJIIJJI(videoPublishEditModel, effectModel, str3, c1413460msy, i, z3, z3, "click_icon", str4, false, effectSearchModel);
        InterfaceC1426650nEF interfaceC1426650nEF = this.LLJJIII;
        if (interfaceC1426650nEF != null && interfaceC1426650nEF.LIZLLL(effectModel, i, z)) {
            return true;
        }
        return false;
    }

    public final void d5(EffectModel effectModel, int i, String str, boolean z, Function0<Unit> function0) {
        F4(new C1426530nE3(this, effectModel, i, str, z, function0));
    }

    public C1426520nE2(C19A3 c19a3, Activity activity, C1DRG c1drg, int i, C113G c113g, VideoPublishEditModel videoPublishEditModel) {
        super(c19a3);
        this.LLJILJILJ = activity;
        this.LLJILLL = c1drg;
        this.LLJJ = videoPublishEditModel;
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC361290EEl.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426440nDu.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1426280nDe.class, null);
        this.LLJJJJ = new AwS566S0100000_22(this, 82);
        this.LLJJJJJIL = new AwS161S0101000_22(c113g, i, 0);
        this.LLJJJJLIIL = new AwS566S0100000_22(this, 83);
        this.LLJJL = Z1(new C2217381BqS() { // from class: X.0nE6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1426550nE5) obj).LIZIZ;
            }
        });
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(52));
    }
}
