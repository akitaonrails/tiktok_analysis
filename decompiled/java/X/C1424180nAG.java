package X;

import Y.AObjectS245S0100000_22;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.template.search.TemplateSearchHistoryItem;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS136S1100000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS72S1000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0nAG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1424180nAG extends i<InterfaceC1423900n9o, C1427280nFG, C1424190nAH, C1424250nAN> implements InterfaceC1423900n9o, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C1424220nAK LLJILJILJ;
    public final String LLJILLL;
    public final int LLJJ;
    public final boolean LLJJI;
    public final String LLJJIII;
    public final C1422900n8C LLJJIJI;
    public final C1422860n88 LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public final Function0<C1424190nAH> LLJJJ;
    public final Function0<C1424250nAN> LLJJJIL;
    public final Function0<Boolean> LLJJJJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1424180nAG.class, "navigator", "getNavigator()Lcom/ss/android/ugc/aweme/tools/mvtemplate/search/navigation/TemplateSearchNavigatorApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJJLIIL = 8;
    }

    private final InterfaceC1422590n7h H4() {
        return (InterfaceC1422590n7h) this.LLJJIJIL.getValue(this, LLJJJJJIL[0]);
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ.LIZJ;
    }

    private final void Xi() {
        ir().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 98));
        bn().LIZ.LIZ(this, new AObjectS245S0100000_22(this, 99));
    }

    private final void Z4() {
        InterfaceC1422590n7h interfaceC1422590n7hH4 = H4();
        if (interfaceC1422590n7hH4 != null) {
            interfaceC1422590n7hH4.J70(this.LLJJJJ);
        }
    }

    private final void k5() {
        InterfaceC1422590n7h interfaceC1422590n7hH4 = H4();
        if (interfaceC1422590n7hH4 != null) {
            interfaceC1422590n7hH4.ya0(this.LLJJJJ);
        }
    }

    public final void F4() {
        if (ir().LIZIZ(8)) {
            d5(bn().LIZ.LIZJ().getFirst());
        }
    }

    public final void S() {
        C1422900n8C c1422900n8CIr = ir();
        if (c1422900n8CIr.LIZIZ(8) || c1422900n8CIr.LIZIZ(4)) {
            K4(this, "", 3);
            return;
        }
        InterfaceC1422590n7h interfaceC1422590n7hH4 = H4();
        if (interfaceC1422590n7hH4 != null) {
            interfaceC1422590n7hH4.wC2(null);
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        String str;
        super.onCreate();
        Xi();
        Z4();
        if (this.LLJJI) {
            String str2 = this.LLJJIII;
            if (str2 == null) {
                str2 = "";
            }
            Qo1(a0.LJLIIIL(str2).toString(), "quick_search", null);
            C1422480n7W c1422480n7W = C1422480n7W.LIZ;
            String str3 = this.LLJJIII;
            String str4 = this.LLJILLL;
            c1422480n7W.getClass();
            C1422480n7W.LIZLLL(false, "template_search_bar", str3, null, str4, null);
            return;
        }
        if (Intrinsics.LJFF(this.LLJILLL, "create_tab")) {
            str = "from_create_tab";
        } else {
            int i = this.LLJJ;
            if (i == 3) {
                str = "from_create_tab_inner";
            } else if (i != 2) {
                return;
            } else {
                str = "from_search_result";
            }
        }
        T4(str);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        k5();
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        C1425570nCV.LIZIZ.LJ(this.LLJILJILJ.LIZ, null);
        if (ir().LIZIZ(1) || ir().LIZIZ(2)) {
            i3(AFwS261S0000000_22.get$arr$(144));
        }
    }

    @Override // X.InterfaceC1423900n9o
    public C1422860n88 bn() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC1423900n9o
    public C1422900n8C ir() {
        return this.LLJJIJI;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1424190nAH> o2() {
        return this.LLJJJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1424250nAN> w2() {
        return this.LLJJJIL;
    }

    private final void d5(String str) {
        int i;
        C1422900n8C c1422900n8CIr = ir();
        if (a0.LJJJIL(str)) {
            i = 3;
        } else {
            i = 4;
        }
        c1422900n8CIr.LIZLLL(i);
    }

    public final boolean P4(View view) {
        C20246014Ju c20246014JuLIZ = C14K4.LIZ(view);
        if (c20246014JuLIZ == null || !c20246014JuLIZ.LJIIIIZZ(8)) {
            return false;
        }
        return true;
    }

    public final void T4(String str) {
        String creationId;
        C1422530n7b c1422530n7bIF;
        ShortVideoContext shortVideoContext;
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        C1422410n7P c1422410n7P = T2().LJFF;
        InterfaceC1422590n7h interfaceC1422590n7hH4 = H4();
        if (interfaceC1422590n7hH4 != null && (c1422530n7bIF = interfaceC1422590n7hH4.iF()) != null && (shortVideoContext = c1422530n7bIF.LIZ) != null) {
            creationId = shortVideoContext.getCreationId();
        } else {
            creationId = null;
        }
        c1422480n7W.getClass();
        C0LAB c0lab = new C0LAB();
        String str2 = c1422410n7P.LJ;
        str2.toString();
        c0lab.LJ("blankpage_id", str2);
        c0lab.LJ("enter_from", c1422410n7P.LIZIZ);
        c0lab.LJ("enter_method", str);
        c0lab.LJ("creation_id", creationId);
        C20684815ws.LJIILLIIL("enter_create_tab_search_blankpage", c0lab.LIZ);
    }

    @Override // X.InterfaceC1423900n9o
    public void dg1(C1424200nAI c1424200nAI) {
        m3(new AwS601S0100000_22(c1424200nAI, 265));
    }

    @Override // X.InterfaceC1423900n9o
    public void kt2(String str, C1DRG c1drg) {
        C1422530n7b c1422530n7bIF;
        ShortVideoContext shortVideoContext;
        InterfaceC1422590n7h interfaceC1422590n7hH4;
        InterfaceC1422590n7h interfaceC1422590n7hH42 = H4();
        if (interfaceC1422590n7hH42 != null && (c1422530n7bIF = interfaceC1422590n7hH42.iF()) != null && (shortVideoContext = c1422530n7bIF.LIZ) != null && (interfaceC1422590n7hH4 = H4()) != null) {
            interfaceC1422590n7hH4.Cf1(new C1424270nAP(str, shortVideoContext, c1drg), null);
        }
    }

    public static final void K4(C1424180nAG c1424180nAG, String str, int i) {
        if (Intrinsics.LJFF(str, c1424180nAG.bn().LIZ.LIZJ().getFirst())) {
            return;
        }
        c1424180nAG.d5(str);
        c1424180nAG.bn().LIZIZ(str, i);
    }

    @Override // X.InterfaceC1423900n9o
    public void Qo1(String str, String str2, Integer num) {
        InterfaceC1425430nCH<TemplateSearchHistoryItem> interfaceC1425430nCHP10;
        if (a0.LJJJIL(str)) {
            i3(AFwS261S0000000_22.get$arr$(143));
            return;
        }
        m3(new AwS136S1100000_22(str2, num, 4));
        InterfaceC1422590n7h interfaceC1422590n7hH4 = H4();
        if (interfaceC1422590n7hH4 != null && (interfaceC1425430nCHP10 = interfaceC1422590n7hH4.p10()) != null) {
            interfaceC1425430nCHP10.LIZIZ(str);
        }
        bn().LIZIZ(str, 1);
        i3(new AwS72S1000000_22(str, 6));
        ir().LIZLLL(8);
    }

    public C1424180nAG(C1424220nAK c1424220nAK, String str, int i, boolean z, String str2) {
        super(c1424220nAK.LIZ);
        this.LLJILJILJ = c1424220nAK;
        this.LLJILLL = str;
        this.LLJJ = i;
        this.LLJJI = z;
        this.LLJJIII = str2;
        this.LLJJIJI = new C1422900n8C();
        this.LLJJIJIIJIL = new C1422860n88() { // from class: X.0nAJ
            @Override // X.C1422860n88
            public final void LIZ() {
                this.LIZIZ.i3(AFwS261S0000000_22.get$arr$(145));
            }
        };
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1422590n7h.class, null);
        this.LLJJJ = new AwS566S0100000_22(this, 398);
        this.LLJJJIL = new AwS566S0100000_22(this, 400);
        this.LLJJJJ = new AwS566S0100000_22(this, 399);
    }
}
