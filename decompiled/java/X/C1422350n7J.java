package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.h0;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0n7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422350n7J extends AbstractC2255721DQs<InterfaceC1422440n7S> implements InterfaceC1422440n7S, InterfaceC379610EuV {
    public static final C1422400n7O LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LL;
    public final C1DRG LLILLJJLI;
    public final C1422410n7P LLILLL;
    public String LLIZLLLIL;
    public long LLJ;
    public String LLJI;
    public final h0<TemplateCategoryData> LLJILJIL;
    public final h0<C1419590n2r> LLJILJILJ;
    public final h0<Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>>> LLJILLL;
    public final C560530Lyd<C1422880n8A> LLJJ;
    public final C560530Lyd<Integer> LLJJI;
    public final C1419620n2u LLJJIII;
    public final InterfaceC1422440n7S LLILZ = this;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1422310n7F.class, null);
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 408));
    public final C01GW LLIZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 409));
    public final C1419220n2G LLJIJIL = new C1419220n2G();

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0n7O] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1422350n7J.class, "monitorApi", "getMonitorApi()Lcom/ss/android/ugc/aweme/tools/mvtemplate/monitor/TemplateMonitorApi;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJJIJI = new Object() { // from class: X.0n7O
        };
        LLJJIJIL = 8;
    }

    @Override // X.InterfaceC1422570n7f
    public void GO2(boolean z) {
    }

    @Override // X.InterfaceC1422570n7f
    public boolean NJ2(C1422430n7R c1422430n7R) {
        return false;
    }

    @Override // X.InterfaceC1422570n7f
    public boolean dy2() {
        return false;
    }

    @Override // X.InterfaceC1422570n7f
    public FilteredAsset kQ0(C1419590n2r c1419590n2r) {
        return null;
    }

    @Override // X.InterfaceC1422570n7f
    public void pG1(TemplateCategoryData templateCategoryData) {
    }

    @Override // X.InterfaceC1422570n7f
    public boolean yG1() {
        return false;
    }

    @Override // X.InterfaceC1422570n7f
    public void zp1(boolean z, String str, int i, boolean z2, InterfaceC1422520n7a interfaceC1422520n7a) {
    }

    private final InterfaceC1422310n7F X1() {
        return (InterfaceC1422310n7F) this.LLILZIL.getValue(this, LLJJIJIIJIL[0]);
    }

    private final InterfaceC1422570n7f o2() {
        return (InterfaceC1422570n7f) this.LLIZ.getValue();
    }

    @Override // X.InterfaceC1422570n7f
    public C1419590n2r RN() {
        return this.LLJILJILJ.LIZJ();
    }

    @Override // X.InterfaceC1422440n7S
    public Pair<String, String> XY1() {
        return new Pair<>(this.LLIZLLLIL, this.LLJI);
    }

    @Override // X.InterfaceC1422570n7f
    public TemplateCategoryData Y8() {
        return this.LLJILJIL.LIZJ();
    }

    public final InterfaceC1422590n7h Z1() {
        return (InterfaceC1422590n7h) this.LLILZLL.getValue();
    }

    @Override // X.InterfaceC1422570n7f
    public Pair<EnumC1423670n9R, EnumC1423670n9R> ix2() {
        EnumC1423670n9R enumC1423670n9R = EnumC1423670n9R.NONE;
        return new Pair<>(enumC1423670n9R, enumC1423670n9R);
    }

    @Override // X.InterfaceC1422440n7S
    public void reset() {
        this.LLJ = 0L;
        this.LLJI = null;
        this.LLIZLLLIL = null;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1409190mm5(this, null), 2);
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<List<TemplateCategoryData>> xe() {
        return new C385670FAf<>();
    }

    @Override // X.InterfaceC1422570n7f
    public C1422960n8I AB1() {
        C1422960n8I c1422960n8IAB1;
        InterfaceC1422570n7f interfaceC1422570n7fO2 = o2();
        return (interfaceC1422570n7fO2 == null || (c1422960n8IAB1 = interfaceC1422570n7fO2.AB1()) == null) ? new C1422960n8I(LifecycleOwnerKt.getLifecycleScope(this)) : c1422960n8IAB1;
    }

    @Override // X.InterfaceC1422570n7f
    public void fo2() {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1409180mm4(this, null), 2);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1422590n7h interfaceC1422590n7hZ1 = Z1();
        if (interfaceC1422590n7hZ1 != null) {
            interfaceC1422590n7hZ1.rB1(this.LLJJIII);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        InterfaceC1422590n7h interfaceC1422590n7hZ1 = Z1();
        if (interfaceC1422590n7hZ1 != null) {
            interfaceC1422590n7hZ1.BN2(this.LLJJIII);
        }
    }

    @Override // X.InterfaceC1422570n7f
    public boolean wO1() {
        InterfaceC1422570n7f interfaceC1422570n7fO2 = o2();
        return interfaceC1422570n7fO2 != null && interfaceC1422570n7fO2.wO1();
    }

    @Override // X.InterfaceC1422570n7f
    public LiveEvent<Integer> CX0() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<TemplateCategoryData> Hv() {
        return this.LLJILJIL;
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>>> Jb2() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1422440n7S
    public C1422410n7P MC1() {
        return this.LLILLL;
    }

    public InterfaceC1422440n7S W1() {
        return this.LLILZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.InterfaceC1422570n7f
    public Set<C1422430n7R> pf0() {
        return C08CX.INSTANCE;
    }

    @Override // X.InterfaceC1422570n7f
    public List<TemplateCategoryData> t() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<C1419590n2r> vO1() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1422570n7f
    public LiveEvent<C1422880n8A> wo() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC1422570n7f
    public void Ff1(int i) {
        this.LLJJI.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1422570n7f
    public List<C1419590n2r> PE(TemplateCategoryData templateCategoryData) {
        Pair<C1422890n8B, List<C1419590n2r>> pair = this.LLJILLL.LIZJ().get(templateCategoryData);
        if (pair != null) {
            return pair.getSecond();
        }
        return null;
    }

    @Override // X.InterfaceC1422570n7f
    public void bA0(CutsameDataItem cutsameDataItem) {
        InterfaceC1422570n7f interfaceC1422570n7fO2 = o2();
        if (interfaceC1422570n7fO2 != null) {
            interfaceC1422570n7fO2.bA0(cutsameDataItem);
        }
    }

    @Override // X.InterfaceC1422570n7f
    public void fR0(C1419590n2r c1419590n2r) {
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1409200mm6(this, c1419590n2r, null), 2);
    }

    @Override // X.InterfaceC1422570n7f
    public void iE0(C1419590n2r c1419590n2r) {
        InterfaceC1422570n7f interfaceC1422570n7fO2 = o2();
        if (interfaceC1422570n7fO2 != null) {
            interfaceC1422570n7fO2.iE0(c1419590n2r);
        }
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<AbstractC788620Uwe> mO2(InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d) {
        return new C385670FAf<>();
    }

    @Override // X.InterfaceC1422570n7f
    public Object rG(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0n2u] */
    public C1422350n7J(C1DRG c1drg, C1DRG c1drg2, C1422410n7P c1422410n7P) {
        this.LL = c1drg;
        this.LLILLJJLI = c1drg2;
        this.LLILLL = c1422410n7P;
        String str = c1422410n7P.LIZ;
        this.LLJILJIL = new h0<>(new TemplateCategoryData(str, str, null, false, null));
        this.LLJILJILJ = new h0<>(null);
        this.LLJILLL = new h0<>(C2097608Jq.LJ());
        this.LLJJ = new C560530Lyd<>();
        this.LLJJI = new C560530Lyd<>();
        this.LLJJIII = new InterfaceC1422390n7N() { // from class: X.0n2u
            @Override // X.InterfaceC1422390n7N
            public final void LIZ(String str2, boolean z) {
                Iterator<T> it2 = this.LIZ.LLJILLL.LIZJ().values().iterator();
                while (it2.hasNext()) {
                    for (C1419590n2r c1419590n2r : (List) ((Pair) it2.next()).getSecond()) {
                        if (Intrinsics.LJFF(c1419590n2r.LIZ.getResource_id(), str2)) {
                            c1419590n2r.LIZ.getBusiness_extra().set_favorite(Boolean.valueOf(z));
                        }
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC1422440n7S
    public boolean R62(String str, int i, boolean z) {
        if (a0.LJJJIL(str)) {
            return false;
        }
        if (!z) {
            reset();
        }
        this.LLIZLLLIL = str;
        return s92(this.LLJILJIL.LIZJ(), false, z, false, 0, i);
    }

    @Override // X.InterfaceC1422570n7f
    public void ES1(C1419590n2r c1419590n2r, int i, InterfaceC1422310n7F interfaceC1422310n7F, TemplateCategoryData templateCategoryData, Function1<? super Boolean, Unit> function1) {
        InterfaceC1422570n7f interfaceC1422570n7fO2 = o2();
        if (interfaceC1422570n7fO2 != null) {
            interfaceC1422570n7fO2.ES1(c1419590n2r, i, X1(), templateCategoryData, new AwS231S0300000_22((Function1) function1, (Function1<? super Boolean, Unit>) this, (C1422350n7J) c1419590n2r, (C1419590n2r) 14));
        }
    }

    @Override // X.InterfaceC1422570n7f
    public boolean s92(TemplateCategoryData templateCategoryData, boolean z, boolean z2, boolean z3, int i, int i2) {
        InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0dUA;
        TemplateSearchNetApi api;
        String str;
        InterfaceC1422590n7h interfaceC1422590n7hZ1 = Z1();
        if (interfaceC1422590n7hZ1 == null || (interfaceC816210W0dUA = interfaceC1422590n7hZ1.UA()) == null || (api = interfaceC816210W0dUA.getApi()) == null || (str = this.LLIZLLLIL) == null) {
            return false;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[start] fetch search result, cursor=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", count=");
        sbLIZ.append(i2);
        sbLIZ.append(", loadMore=");
        sbLIZ.append(z2);
        sbLIZ.append(", preload=");
        sbLIZ.append(z3);
        sbLIZ.append(", from=");
        sbLIZ.append(i);
        C201955140j.LIZLLL(c1398350mUb, "TemplateSearchCoreComponent", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1422360n7K(api, str, this, i2, interfaceC816210W0dUA, z2, templateCategoryData, z3, i, z, System.currentTimeMillis(), null), 2);
        return true;
    }
}
