package X;

import Y.AObjectS245S0100000_22;
import Y.AObjectS305S0200000_22;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.TemplateSearchTrendingItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import ge.i;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n9l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423870n9l extends i<InterfaceC1423930n9r, C1425560nCU, C1423910n9p, C1423920n9q> implements InterfaceC1423930n9r, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final C1DRG LLJILLL;
    public final C1422410n7P LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final Function0<C1423910n9p> LLJJIJIIJIL;
    public final Function0<C1423920n9q> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1423870n9l.class, "templateTabSearchApi", "getTemplateTabSearchApi()Lcom/ss/android/ugc/aweme/template/search/TemplateTabSearchApi;", 0);
        C13LE.LIZ.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJJIL = 8;
    }

    private final InterfaceC1422570n7f H4() {
        return (InterfaceC1422570n7f) this.LLJJIII.getValue();
    }

    private final InterfaceC1423900n9o K4() {
        return (InterfaceC1423900n9o) this.LLJJI.getValue(this, LLJJJ[0]);
    }

    private final InterfaceC816210W0d<TemplateSearchNetApi> UA() {
        return (InterfaceC816210W0d) this.LLJJIJI.getValue();
    }

    private final void O4() {
        InterfaceC1422570n7f interfaceC1422570n7fH4;
        InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0dUA = UA();
        if (interfaceC816210W0dUA == null || (interfaceC1422570n7fH4 = H4()) == null) {
            return;
        }
        interfaceC1422570n7fH4.mO2(interfaceC816210W0dUA).LIZ(this, new AObjectS245S0100000_22(this, 103));
    }

    private final void Xi() {
        C1422900n8C c1422900n8CIr;
        InterfaceC1423900n9o interfaceC1423900n9oK4 = K4();
        if (interfaceC1423900n9oK4 == null || (c1422900n8CIr = interfaceC1423900n9oK4.ir()) == null) {
            return;
        }
        c1422900n8CIr.LIZ.LIZ(this, new AObjectS305S0200000_22(c1422900n8CIr, this, 9));
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Xi();
        O4();
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        C1422900n8C c1422900n8CIr;
        if (!T2().LIZIZ.isEmpty()) {
            super.show();
            return;
        }
        InterfaceC1423900n9o interfaceC1423900n9oK4 = K4();
        if (interfaceC1423900n9oK4 == null || (c1422900n8CIr = interfaceC1423900n9oK4.ir()) == null) {
            return;
        }
        c1422900n8CIr.LIZLLL(c1422900n8CIr.LIZ() & (-3));
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1423910n9p> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1423920n9q> w2() {
        return this.LLJJIJIL;
    }

    public final void T4(List<TemplateSearchTrendingItem> list) {
        C1422900n8C c1422900n8CIr;
        i3(new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 281));
        InterfaceC1423900n9o interfaceC1423900n9oK4 = K4();
        if (interfaceC1423900n9oK4 != null && (c1422900n8CIr = interfaceC1423900n9oK4.ir()) != null) {
            c1422900n8CIr.LIZJ(2, new AwS601S0100000_22(list, (List<CreateAnchorInfo>) 282));
        }
    }

    public final void F4(TemplateSearchTrendingItem templateSearchTrendingItem, int i) {
        if (((Boolean) C298930Bnf.LIZ.getValue()).booleanValue()) {
            InterfaceC1423900n9o interfaceC1423900n9oK4 = K4();
            if (interfaceC1423900n9oK4 != null) {
                interfaceC1423900n9oK4.Qo1(templateSearchTrendingItem.title, "trending", Integer.valueOf(i));
            }
            C1422480n7W c1422480n7W = C1422480n7W.LIZ;
            String string = a0.LJLIIIL(templateSearchTrendingItem.title).toString();
            Integer numValueOf = Integer.valueOf(i);
            C1422410n7P c1422410n7P = this.LLJJ;
            String str = c1422410n7P.LIZIZ;
            c1422480n7W.getClass();
            C1422480n7W.LIZLLL(false, "template_trending", string, numValueOf, str, c1422410n7P);
            return;
        }
        InterfaceC1423900n9o interfaceC1423900n9oK42 = K4();
        if (interfaceC1423900n9oK42 == null) {
            return;
        }
        interfaceC1423900n9oK42.kt2(templateSearchTrendingItem.resourceId, getDiContainer());
    }

    public final void P4(TemplateSearchTrendingItem templateSearchTrendingItem, int i) {
        C1422480n7W c1422480n7W = C1422480n7W.LIZ;
        String string = a0.LJLIIIL(templateSearchTrendingItem.title).toString();
        Integer numValueOf = Integer.valueOf(i);
        C1422410n7P c1422410n7P = this.LLJJ;
        String str = c1422410n7P.LIZIZ;
        c1422480n7W.getClass();
        C1422480n7W.LIZLLL(true, "template_trending", string, numValueOf, str, c1422410n7P);
    }

    public C1423870n9l(C19A3 c19a3, C1DRG c1drg, C1DRG c1drg2, C1422410n7P c1422410n7P) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c1drg2;
        this.LLJJ = c1422410n7P;
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1423900n9o.class, null);
        this.LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 415));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 413));
        this.LLJJIJIIJIL = new AwS566S0100000_22(this, 412);
        this.LLJJIJIL = new AwS566S0100000_22(this, 414);
    }
}
