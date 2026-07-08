package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.LiveEvent;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.TemplateConsumeData;
import com.ss.android.ugc.aweme.creative.model.UgcTemplateData;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.aweme.tools.mvtemplate.search.datasource.TemplateSearchNetApi;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.FilteredAsset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import r4m.i;
import r4m.k0;

/* JADX INFO: renamed from: X.0n8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423230n8j extends AbstractC2255721DQs<InterfaceC1422570n7f> implements InterfaceC1422570n7f {
    public static final C1423750n9Z LLJJI = new Object() { // from class: X.0n9Z
    };
    public static final int LLJJIII = 8;
    public final C19EG LL;
    public final ShortVideoContext LLILLJJLI;
    public final C1423230n8j LLILLL = this;
    public final C1423490n99 LLILZ;
    public final k0 LLILZIL;
    public boolean LLILZLL;
    public final Set<C1422430n7R> LLIZ;
    public final C01GW LLIZLLLIL;
    public final Set<String> LLJ;
    public boolean LLJI;
    public final C01GW LLJIJIL;
    public final C01GW LLJILJIL;
    public boolean LLJILJILJ;
    public final C560530Lyd<Integer> LLJILLL;
    public final C1423380n8y LLJJ;

    private final C1422960n8I H2() {
        return (C1422960n8I) this.LLJILJIL.getValue();
    }

    private final boolean T2() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    public final C1423350n8v G2() {
        Object obj = this.LLILZIL.LIZ;
        if (obj instanceof C1423350n8v) {
            return (C1423350n8v) obj;
        }
        return null;
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<TemplateCategoryData> Hv() {
        return this.LLILZIL.LIZ.Hv();
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<Map<TemplateCategoryData, Pair<C1422890n8B, List<C1419590n2r>>>> Jb2() {
        return this.LLILZIL.LIZ.Kv();
    }

    @Override // X.InterfaceC1422570n7f
    public C1419590n2r RN() {
        return (C1419590n2r) this.LLILZIL.LIZ.Mv();
    }

    @Override // X.InterfaceC1422570n7f
    public TemplateCategoryData Y8() {
        return (TemplateCategoryData) this.LLILZIL.LIZ.Y8();
    }

    @Override // X.InterfaceC1422570n7f
    public void fo2() {
        this.LLILZIL.LIZ.Qv(null);
    }

    @Override // X.InterfaceC1422570n7f
    public Pair<EnumC1423670n9R, EnumC1423670n9R> ix2() {
        C1423490n99 c1423490n99 = this.LLILZ;
        c1423490n99.getClass();
        return new Pair<>(c1423490n99.LJIILIIL, c1423490n99.LJIILJJIL);
    }

    public final InterfaceC1457290o1f o2() {
        return (InterfaceC1457290o1f) this.LLJIJIL.getValue();
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<C1419590n2r> vO1() {
        return this.LLILZIL.LIZ.Jv();
    }

    @Override // X.InterfaceC1422570n7f
    public LiveEvent<C1422880n8A> wo() {
        return this.LLILZIL.LIZ.wo();
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<List<TemplateCategoryData>> xe() {
        return this.LLILZIL.LIZ.xe();
    }

    @Override // X.InterfaceC1422570n7f
    public C1422960n8I AB1() {
        return H2();
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        InterfaceC1457290o1f interfaceC1457290o1fO2 = o2();
        if (interfaceC1457290o1fO2 != null) {
            interfaceC1457290o1fO2.LIZIZ(this.LLJJ);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C1422960n8I c1422960n8IH2 = H2();
        AnonymousClass0956 anonymousClass0956 = c1422960n8IH2.LJFF;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c1422960n8IH2.LJFF = null;
        AnonymousClass0956 anonymousClass09562 = c1422960n8IH2.LJI;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        c1422960n8IH2.LJI = null;
        c1422960n8IH2.LJII = 0;
        c1422960n8IH2.LJIIIIZZ = 0;
        c1422960n8IH2.LJIIIZ = null;
        c1422960n8IH2.LJIIJ = C13BV.INSTANCE;
        c1422960n8IH2.LIZLLL.LJII(new C1422970n8J(0));
        InterfaceC1457290o1f interfaceC1457290o1fO2 = o2();
        if (interfaceC1457290o1fO2 != null) {
            interfaceC1457290o1fO2.LJFF(this.LLJJ);
        }
    }

    @Override // X.InterfaceC1422570n7f
    public List<TemplateCategoryData> t() {
        return xe().LIZJ();
    }

    @Override // X.InterfaceC1422570n7f
    public boolean wO1() {
        List<Pair<C1419590n2r, Boolean>> list;
        C1423350n8v c1423350n8vG2 = G2();
        return (c1423350n8vG2 == null || (list = c1423350n8vG2.LJI) == null || !(list.isEmpty() ^ true)) ? false : true;
    }

    @Override // X.InterfaceC1422570n7f
    public LiveEvent<Integer> CX0() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1422570n7f
    public boolean dy2() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1422570n7f
    public Set<C1422430n7R> pf0() {
        return this.LLIZ;
    }

    public C1423230n8j w2() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1422570n7f
    public boolean yG1() {
        return this.LLILZLL;
    }

    public static boolean W1(Context context) {
        try {
            return C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    @Override // X.InterfaceC1422570n7f
    public void Ff1(int i) {
        this.LLJILLL.LJIIJ(Integer.valueOf(i));
    }

    @Override // X.InterfaceC1422570n7f
    public void GO2(boolean z) {
        this.LLJI = z;
    }

    @Override // X.InterfaceC1422570n7f
    public boolean NJ2(C1422430n7R c1422430n7R) {
        Set<C1422430n7R> set = this.LLIZ;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it2 = set.iterator();
            while (it2.hasNext()) {
                if (((C1422430n7R) it2.next()).LIZ(c1422430n7R)) {
                    return true;
                }
            }
        }
        this.LLIZ.add(c1422430n7R);
        C1423490n99 c1423490n99 = this.LLILZ;
        Set<C1422430n7R> set2 = this.LLIZ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set2) {
            TemplateCategoryData templateCategoryData = ((C1422430n7R) obj).LIZ;
            if (templateCategoryData != null && templateCategoryData.isDefault) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((C1422430n7R) it3.next()).LIZIZ);
        }
        c1423490n99.LJIJ = C13LP.LLIIJI(arrayList2);
        return false;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1422570n7f
    public List<C1419590n2r> PE(TemplateCategoryData templateCategoryData) {
        return this.LLILZIL.LIZ.Ov((CATEGORY) templateCategoryData);
    }

    @Override // X.InterfaceC1422570n7f
    public void bA0(CutsameDataItem cutsameDataItem) {
        UgcTemplateData ugcTemplateData;
        CreativeModel creativeModel;
        CreativeModel creativeModel2;
        TemplateConsumeData templateConsumeData;
        EnumC1412640mre enumC1412640mreLIZIZ = cutsameDataItem.LIZIZ();
        ITemplateConsumeService iTemplateConsumeService = C522540KeS.LIZ;
        if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(1, enumC1412640mreLIZIZ, null, null)) {
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            if (shortVideoContext != null && (creativeModel2 = shortVideoContext.creativeModel) != null && (templateConsumeData = creativeModel2.templateConsumeData) != null) {
                templateConsumeData.nleSummary = cutsameDataItem.templateData;
            }
            String str = null;
            if (shortVideoContext != null && (creativeModel = shortVideoContext.creativeModel) != null) {
                ugcTemplateData = creativeModel.ugcTemplateData;
            } else {
                ugcTemplateData = null;
            }
            if (C0LE0.LIZIZ(cutsameDataItem.templateData).audioSlot != null) {
                if (ugcTemplateData != null) {
                    ArrayList<String> arrayList = cutsameDataItem.musicIds;
                    if (arrayList != null) {
                        str = (String) C13LP.LJJJLL(arrayList);
                    }
                    ugcTemplateData.musicId = str;
                }
            } else if (ugcTemplateData != null) {
                ugcTemplateData.musicId = null;
            }
            iTemplateConsumeService.LJ(this.LL, enumC1412640mreLIZIZ, this.LLILLJJLI, C1412390mrF.LJI, cutsameDataItem.templateId);
            return;
        }
        int i = C524750Ki1.LIZ[enumC1412640mreLIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                return;
            }
            C0L0E.LIZIZ(this.LL, this.LLILLJJLI, cutsameDataItem, false, EnumC538340L9k.TAB);
            return;
        }
        C1403010mc7.LIZ.LJFF().LJFF(this.LL, cutsameDataItem, this.LLILLJJLI);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1422570n7f
    public void fR0(C1419590n2r c1419590n2r) {
        this.LLILZIL.LIZ.Iv((DATA) c1419590n2r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1422570n7f
    public void iE0(C1419590n2r c1419590n2r) {
        Integer numValueOf;
        Object next;
        List<C1419590n2r> listOv;
        Object first;
        String resource_id;
        Asset asset;
        C1423350n8v c1423350n8vG2 = G2();
        if (c1423350n8vG2 == null) {
            return;
        }
        ArrayList arrayList = (ArrayList) c1423350n8vG2.LJI;
        if (!arrayList.isEmpty()) {
            Iterator<TemplateCategoryData> it2 = t().iterator();
            do {
                numValueOf = null;
                resource_id = null;
                resource_id = null;
                if (it2.hasNext()) {
                    next = it2.next();
                } else {
                    return;
                }
            } while (!C1423570n9H.LIZJ((TemplateCategoryData) next));
            if (next == null || (listOv = c1423350n8vG2.Ov(next)) == null) {
                return;
            }
            Pair pair = (Pair) ((Map) c1423350n8vG2.LIZLLL.LIZJ()).get(next);
            if (pair != null) {
                first = pair.getFirst();
            } else {
                first = null;
            }
            C1422890n8B c1422890n8B = (C1422890n8B) first;
            if (c1422890n8B == null) {
                return;
            }
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList2.add(((C1419590n2r) ((Pair) it3.next()).getFirst()).LIZ.getResource_id());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList2);
            ArrayList arrayList3 = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it4 = new C13EO(arrayList).iterator();
            while (true) {
                C13EN c13en = (C13EN) it4;
                if (!c13en.hasNext()) {
                    break;
                }
                Pair pair2 = (Pair) c13en.next();
                C1419590n2r c1419590n2r2 = (C1419590n2r) pair2.getFirst();
                boolean zBooleanValue = ((Boolean) pair2.getSecond()).booleanValue();
                if (linkedHashSet.add(c1419590n2r2.LIZ.getResource_id())) {
                    c1419590n2r2.LIZ.getBusiness_extra().set_favorite(Boolean.valueOf(zBooleanValue));
                    if (zBooleanValue) {
                        arrayList3.add(c1419590n2r2);
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (C1419590n2r c1419590n2r3 : listOv) {
                if (!setLLIIJI.contains(c1419590n2r3.LIZ.getResource_id())) {
                    arrayList4.add(c1419590n2r3);
                }
            }
            List listLJLIL = C13LP.LJLIL(arrayList4, arrayList3);
            if (C1423570n9H.LIZJ(Y8())) {
                if (c1419590n2r != null && (asset = c1419590n2r.LIZ) != null) {
                    resource_id = asset.getResource_id();
                }
                int i = -1;
                if (resource_id != null) {
                    Iterator it5 = ((ArrayList) listLJLIL).iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((C1419590n2r) it5.next()).LIZ.getResource_id(), resource_id)) {
                            if (i2 != -1) {
                                i = i2;
                            }
                        } else {
                            i2++;
                        }
                    }
                    C717620SCy c717620SCyLLIIL = C13LP.LLIIL(listLJLIL);
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(c717620SCyLLIIL, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
                    Iterator it6 = c717620SCyLLIIL.iterator();
                    while (true) {
                        C717610SCx c717610SCx = (C717610SCx) it6;
                        if (!c717610SCx.hasNext()) {
                            break;
                        }
                        IndexedValue indexedValue = (IndexedValue) c717610SCx.next();
                        Pair pair3 = new Pair(((C1419590n2r) indexedValue.LIZIZ).LIZ.getResource_id(), Integer.valueOf(indexedValue.LIZ));
                        linkedHashMap.put(pair3.getFirst(), pair3.getSecond());
                    }
                    Iterator<C1419590n2r> it7 = listOv.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it7.next().LIZ.getResource_id(), resource_id)) {
                            if (i3 > 0) {
                                int i4 = i3 - 1;
                                while (true) {
                                    if (-1 >= i4) {
                                        break;
                                    }
                                    Integer num = (Integer) linkedHashMap.get(((C1419590n2r) ListProtector.get(listOv, i4)).LIZ.getResource_id());
                                    if (num != null) {
                                        int iIntValue = num.intValue();
                                        if (iIntValue != -1) {
                                            i = iIntValue;
                                        }
                                    } else {
                                        i4--;
                                    }
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                    if (!r8.isEmpty()) {
                        i = 0;
                    }
                    numValueOf = Integer.valueOf(i);
                } else {
                    numValueOf = -1;
                }
            }
            this.LLILZIL.LIZ.Nv((CATEGORY) next, (FETCH_DATA_RESULT_EXTRA_DATA) new C1422890n8B(c1422890n8B.LIZ, (String) null, false, false, false, (List) null, numValueOf, 92), (List<? extends DATA>) listLJLIL);
        }
        arrayList.clear();
    }

    @Override // X.InterfaceC1422570n7f
    public FilteredAsset kQ0(C1419590n2r c1419590n2r) {
        C1423350n8v c1423350n8vG2;
        if (!T2() || Y8() == null || (c1423350n8vG2 = G2()) == null) {
            return null;
        }
        return (FilteredAsset) ((LinkedHashMap) c1423350n8vG2.LJFF).get(c1419590n2r.LIZ.getAsset_id());
    }

    @Override // X.InterfaceC1422570n7f
    public C385670FAf<AbstractC788620Uwe> mO2(InterfaceC816210W0d<TemplateSearchNetApi> interfaceC816210W0d) {
        C1422960n8I c1422960n8IH2 = H2();
        AbstractC788620Uwe abstractC788620UweLIZJ = c1422960n8IH2.LIZIZ.LIZJ();
        if (!(abstractC788620UweLIZJ instanceof C788610Uwd) && !(abstractC788620UweLIZJ instanceof C788600Uwc)) {
            if (!(abstractC788620UweLIZJ instanceof C788630Uwf) && !(abstractC788620UweLIZJ instanceof C788590Uwb)) {
                throw new C1954807lC();
            }
            TemplateSearchNetApi api = interfaceC816210W0d.getApi();
            if (api != null) {
                c1422960n8IH2.LIZIZ.LJII(new AbstractC788620Uwe() { // from class: X.0Uwd
                });
                AnonymousClass0956 anonymousClass0956 = c1422960n8IH2.LJFF;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                c1422960n8IH2.LJFF = C23250099c.LIZLLL(c1422960n8IH2.LIZ, C0PEM.LIZJ, null, new C816200W0c(api, interfaceC816210W0d, c1422960n8IH2, null), 2);
            }
        }
        return c1422960n8IH2.LIZJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC1422570n7f
    public void pG1(TemplateCategoryData templateCategoryData) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setCurCategory: TemplateCoreComponent-by user ");
        sbLIZ.append(templateCategoryData);
        C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        this.LLILZIL.LIZ.Pv((CATEGORY) templateCategoryData, null);
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0n8y] */
    public C1423230n8j(C19EG c19eg, ShortVideoContext shortVideoContext) {
        this.LL = c19eg;
        this.LLILLJJLI = shortVideoContext;
        C1423490n99 c1423490n99 = new C1423490n99(LifecycleOwnerKt.getLifecycleScope(this));
        this.LLILZ = c1423490n99;
        k0 k0Var = new k0(LifecycleOwnerKt.getLifecycleScope(this));
        k0Var.LIZ(c1423490n99, new i(), new InterfaceC1423480n98<CategoryInfo, TemplateCategoryData>() { // from class: X.0mv6
            @Override // X.InterfaceC1423480n98
            public final TemplateCategoryData LIZ(CategoryInfo categoryInfo) {
                CategoryInfo categoryInfo2 = categoryInfo;
                return new TemplateCategoryData(categoryInfo2.getCategory_key(), categoryInfo2.getCategory_name(), categoryInfo2.getIcon_url(), categoryInfo2.is_default(), categoryInfo2.getExtra());
            }
        }, new C1419220n2G(), null);
        this.LLILZIL = k0Var;
        this.LLIZ = C13LP.LLIIIZ(C08CX.INSTANCE);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(458));
        this.LLJ = new LinkedHashSet();
        this.LLJIJIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(457));
        this.LLJILJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1029));
        this.LLJILLL = new C560530Lyd<>();
        this.LLJJ = new InterfaceC1398820mVM() { // from class: X.0n8y
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1398820mVM
            public final void LLLLLLL(int i, boolean z) {
                InterfaceC1457290o1f interfaceC1457290o1fO2 = this.LIZ.o2();
                if (interfaceC1457290o1fO2 != null) {
                    interfaceC1457290o1fO2.LJIIL();
                    if (i == 1 && z) {
                        InterfaceC1423310n8r<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> interfaceC1423310n8r = this.LIZ.LLILZIL.LIZ;
                        interfaceC1423310n8r.Lv((List<? extends CATEGORY>) C13LP.LLIIII(interfaceC1423310n8r.t()));
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC1422570n7f
    public Object rG(String str, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C1423490n99 c1423490n99 = this.LLILZ;
        int iLIZ = C1337770kut.LIZ();
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        C1423740n9Y c1423740n9Y = new C1423740n9Y(iLIZ, true, str, false, new C1423760n9a(shortVideoContext.shootWay, shortVideoContext.getCreationId()));
        c1423490n99.getClass();
        if (C0BOM.LIZ()) {
            return true;
        }
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C1423610n9L(c1423490n99, str, c1423740n9Y, null));
    }

    private final void X1(String str, List<TemplateCategoryData> list, List<String> list2) {
        Object c098200Yq;
        Object c098200Yq2;
        try {
            if (str == null) {
                str = "";
            }
            c098200Yq = new JSONObject(str).optString("activity_id");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        if (str2 == null) {
            str2 = " ";
        }
        for (TemplateCategoryData templateCategoryData : list) {
            String str3 = templateCategoryData.extra;
            if (str3 != null) {
                try {
                    c098200Yq2 = new JSONObject(str3).optString("lottie");
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                    c098200Yq2 = null;
                }
                String str4 = (String) c098200Yq2;
                if (str4 != null) {
                    C0L62 c0l62 = C0L62.LIZ;
                    C0L67 c0l67 = C0L67.LIZ;
                    String str5 = templateCategoryData.key;
                    c0l62.getClass();
                    if (str4.length() != 0 && (!C2137908Zd.LIZJ.LJFF(C0L62.LJII(c0l67, str5)) || !Intrinsics.LJFF(Keva.getRepo("template_operation").getString(C0L62.LJFF(c0l67, str5), ""), str2) || !Intrinsics.LJFF(Keva.getRepo("template_operation").getString(C0L62.LJIIIIZZ(c0l67, str5), ""), str4))) {
                        C23250099c.LIZLLL(C0L64.LL, C0PEM.LIZJ, null, new C0L60(list2, str4, c0l67, str5, str2, null), 2);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z1(X.C1423230n8j r6, java.util.List<com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData> r7, X.C1423470n97 r8) {
        /*
            java.lang.String r0 = r8.LIZ
            if (r0 == 0) goto L53
            int r0 = r0.length()
            if (r0 <= 0) goto L53
            X.0L62 r0 = X.C0L62.LIZ
            java.lang.String r2 = r8.LIZ
            java.util.List<java.lang.String> r5 = r8.LIZIZ
            if (r5 != 0) goto L14
            X.13BV r5 = X.C13BV.INSTANCE
        L14:
            r0.getClass()
            r4 = 0
            X.04rF r1 = X.C1227904rF.LIZ     // Catch: com.google.gson.s -> L28
            java.lang.Class<com.ss.android.ugc.aweme.template.TemplateOperationData> r0 = com.ss.android.ugc.aweme.template.TemplateOperationData.class
            r1.getClass()     // Catch: com.google.gson.s -> L28
            java.lang.Object r3 = X.C1227904rF.LIZIZ(r2, r0)     // Catch: com.google.gson.s -> L28
            com.ss.android.ugc.aweme.template.TemplateOperationData r3 = (com.ss.android.ugc.aweme.template.TemplateOperationData) r3     // Catch: com.google.gson.s -> L28
            if (r3 == 0) goto L53
            goto L34
        L28:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            X.0mUb r1 = X.C1398350mUb.LIZIZ
            java.lang.String r0 = "msg-log"
            X.C201955140j.LJIIJ(r1, r0, r2)
            goto L53
        L34:
            java.util.List r0 = X.C13LP.LJJJJLI(r5)
            r3.setUrlPrefix(r0)
            java.lang.String r0 = r3.activityId
            int r0 = r0.length()
            if (r0 == 0) goto L53
            java.lang.String r0 = r3.lottie
            int r0 = r0.length()
            if (r0 != 0) goto L5f
            java.lang.String r0 = r3.autocutLottie
            int r0 = r0.length()
            if (r0 != 0) goto L5f
        L53:
            java.lang.String r1 = r8.LIZ
            java.util.List<java.lang.String> r0 = r8.LIZIZ
            if (r0 != 0) goto L5b
            X.13BV r0 = X.C13BV.INSTANCE
        L5b:
            r6.X1(r1, r7, r0)
            return
        L5f:
            X.08Zd r1 = X.C2137908Zd.LIZJ
            java.lang.String r0 = "auto_cut_album_button_lottie.json"
            java.lang.String r0 = X.C0L62.LIZLLL(r0)
            boolean r0 = r1.LJFF(r0)
            if (r0 == 0) goto L9d
            java.lang.String r0 = "template_eoy_camera_tab.json"
            java.lang.String r0 = X.C0L62.LIZLLL(r0)
            boolean r0 = r1.LJFF(r0)
            if (r0 == 0) goto L9d
            com.ss.android.ugc.aweme.template.TemplateOperationData r2 = X.C0L62.LJ()
            if (r2 == 0) goto Lbb
            java.lang.String r1 = r2.activityId
        L81:
            java.lang.String r0 = r3.activityId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            java.lang.String r1 = r2.lottie
            java.lang.String r0 = r3.lottie
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L9d
            java.lang.String r1 = r2.autocutLottie
            java.lang.String r0 = r3.autocutLottie
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L53
        L9d:
            java.lang.String r0 = r3.activityId
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r4, r0)
            if (r0 != 0) goto L53
            X.0956 r0 = X.C0L62.LIZIZ
            if (r0 == 0) goto Lac
            r0.LIZIZ(r4)
        Lac:
            X.0L64 r2 = X.C0L64.LL
            X.0L5x r1 = new X.0L5x
            r1.<init>(r3, r5, r4)
            r0 = 3
            X.0956 r0 = X.C23250099c.LIZLLL(r2, r4, r4, r1, r0)
            X.C0L62.LIZIZ = r0
            goto L53
        Lbb:
            r1 = r4
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423230n8j.Z1(X.0n8j, java.util.List, X.0n97):void");
    }

    @Override // X.InterfaceC1422570n7f
    public void ES1(final C1419590n2r c1419590n2r, final int i, final InterfaceC1422310n7F interfaceC1422310n7F, TemplateCategoryData templateCategoryData, final Function1<? super Boolean, Unit> function1) {
        String strLIZLLL;
        String str;
        EnumC1412640mre enumC1412640mreLIZLLL;
        final TemplateCategoryData templateCategoryDataY8 = templateCategoryData;
        String resource_id = c1419590n2r.LIZ.getResource_id();
        boolean z = !Intrinsics.LJFF(c1419590n2r.LIZ.getBusiness_extra().is_favorite(), Boolean.TRUE);
        if (!T2()) {
            function1.invoke(Boolean.valueOf(!z));
            return;
        }
        if (!W1(this.LL)) {
            C1389880mGw c1389880mGw = new C1389880mGw(this.LL);
            c1389880mGw.LJIIIIZZ(2131834035);
            c1389880mGw.LJIIJ();
            function1.invoke(Boolean.valueOf(!z));
            return;
        }
        if (!o2().isLogin()) {
            function1.invoke(Boolean.valueOf(!z));
            o2().LJIIIIZZ(this.LL, "template_tab_preview_page", "click_favorite_button", null, new InterfaceC19305710fv() { // from class: X.0n90
                @Override // X.InterfaceC19305710fv
                public final void onCancel() {
                }

                @Override // X.InterfaceC19305710fv
                public final void onSuccess() {
                    this.LIZ.ES1(c1419590n2r, i, interfaceC1422310n7F, templateCategoryDataY8, function1);
                }
            });
            return;
        }
        if (!this.LLJ.add(resource_id)) {
            function1.invoke(Boolean.valueOf(!z));
            return;
        }
        function1.invoke(Boolean.valueOf(z));
        String str2 = null;
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZJ, null, new C1423250n8l(this, c1419590n2r, z, function1, resource_id, i, null), 2);
        C1419580n2q c1419580n2q = C1419580n2q.LIZ;
        if (templateCategoryDataY8 == null) {
            templateCategoryDataY8 = Y8();
        }
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        c1419580n2q.getClass();
        C0LAB c0lab = new C0LAB();
        AssetType assetType = AssetPanelModelKt.toAssetType(c1419590n2r.LIZ.getAsset_type());
        if (assetType != null && (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) != null) {
            strLIZLLL = C1412630mrd.LIZLLL(enumC1412640mreLIZLLL);
        } else {
            strLIZLLL = null;
        }
        c0lab.LJ("creation_id", shortVideoContext.getCreationId());
        c0lab.LJ("shoot_way", shortVideoContext.shootWay);
        c0lab.LJ("enter_from", "template_tab");
        c0lab.LIZ(z ? 1 : 0, "to_status");
        c0lab.LJ("tt_template_type", strLIZLLL);
        if (templateCategoryDataY8 != null) {
            str = templateCategoryDataY8.key;
        } else {
            str = null;
        }
        c0lab.LJ("category_key", str);
        c0lab.LJ("tt_template_id", c1419590n2r.LIZ.getAsset_id());
        if (templateCategoryDataY8 != null) {
            str2 = templateCategoryDataY8.name;
        }
        c0lab.LJ("tab_name", str2);
        c0lab.LIZ(i, "impr_position");
        if (interfaceC1422310n7F != null) {
            c0lab = c0lab;
            interfaceC1422310n7F.d91(c0lab, templateCategoryDataY8, Integer.valueOf(i), c1419590n2r, "click_favorite_template");
        }
        C20684815ws.LJIILLIIL("click_favorite_template", c0lab.LIZ);
    }

    @Override // X.InterfaceC1422570n7f
    public void zp1(boolean z, String str, int i, boolean z2, final InterfaceC1422520n7a interfaceC1422520n7a) {
        InterfaceC1422520n7a interfaceC1422520n7a2 = new InterfaceC1422520n7a() { // from class: X.0n91
            @Override // X.InterfaceC1423360n8w
            public final void onCancel() {
                this.LIZ.LLILZLL = false;
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZ(C1422880n8A c1422880n8A) {
                this.LIZ.LLILZLL = false;
                InterfaceC1422520n7a interfaceC1422520n7a3 = interfaceC1422520n7a;
                if (interfaceC1422520n7a3 != null) {
                    interfaceC1422520n7a3.LIZ(c1422880n8A);
                }
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZIZ(List<? extends TemplateCategoryData> list, C1423470n97 c1423470n97, C1423320n8s<TemplateCategoryData, C1419590n2r, C1422890n8B, C1422880n8A> c1423320n8s) {
                C1423470n97 c1423470n972 = c1423470n97;
                this.LIZ.LLILZLL = false;
                InterfaceC1422520n7a interfaceC1422520n7a3 = interfaceC1422520n7a;
                if (interfaceC1422520n7a3 != null) {
                    interfaceC1422520n7a3.LIZIZ(list, c1423470n972, c1423320n8s);
                }
                C1423230n8j c1423230n8j = this.LIZ;
                c1423230n8j.LLJILJILJ = c1423470n972.LIZJ;
                C1423230n8j.Z1(c1423230n8j, list, c1423470n972);
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
                InterfaceC1422520n7a interfaceC1422520n7a3 = interfaceC1422520n7a;
                if (interfaceC1422520n7a3 != null) {
                    interfaceC1422520n7a3.LIZJ(list, c1423470n97, templateCategoryData, list2, c1422890n8B);
                }
                C1423230n8j c1423230n8j = this.LIZ;
                c1423230n8j.LLJILJILJ = c1423470n97.LIZJ;
                C1423230n8j.Z1(c1423230n8j, list, c1423470n97);
            }
        };
        this.LLILZLL = true;
        final k0 k0Var = this.LLILZIL;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        C1423740n9Y c1423740n9Y = new C1423740n9Y(i, z, str, z2, new C1423760n9a(shortVideoContext.shootWay, shortVideoContext.getCreationId()));
        k0Var.getClass();
        final List listLJIIJJI = C1697810uHb.LJIIJJI(interfaceC1422520n7a2, new InterfaceC1423360n8w<TemplateCategoryData, C1419590n2r, C1422880n8A, C1423470n97, C1422890n8B>() { // from class: X.0n8o
            @Override // X.InterfaceC1423360n8w
            public final /* bridge */ /* synthetic */ void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
            }

            @Override // X.InterfaceC1423360n8w
            public final void onCancel() {
            }

            @Override // X.InterfaceC1423360n8w
            public final /* bridge */ /* synthetic */ void LIZ(C1422880n8A c1422880n8A) {
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1423360n8w
            public final void LIZIZ(List<? extends TemplateCategoryData> list, C1423470n97 c1423470n97, C1423320n8s<TemplateCategoryData, C1419590n2r, C1422890n8B, C1422880n8A> c1423320n8s) {
                List<FilteredAsset> list2;
                C1423350n8v c1423350n8v;
                if (C289620BWu.LIZ()) {
                    if (c1423320n8s != null) {
                        k0 k0Var2 = k0Var;
                        if (!Intrinsics.LJFF(k0Var2.LIZ.Y8(), c1423320n8s.LIZ)) {
                            C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("setCurCategory: TemplateTabDataManager ");
                            sbLIZ.append(c1423320n8s.LIZ);
                            C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                            k0Var2.LIZ.Pv(c1423320n8s.LIZ, (List<? extends CATEGORY>) list);
                        }
                    } else {
                        return;
                    }
                } else if (c1423320n8s == null) {
                    return;
                }
                C1422890n8B c1422890n8B = c1423320n8s.LIZLLL;
                if (c1422890n8B != null && (list2 = c1422890n8B.LJI) != null) {
                    InterfaceC1423310n8r<CATEGORY, DATA, ERROR_DATA, FETCH_DATA_RESULT_EXTRA_DATA, DATA_INFO> interfaceC1423310n8r = k0Var.LIZ;
                    if ((interfaceC1423310n8r instanceof C1423350n8v) && (c1423350n8v = (C1423350n8v) interfaceC1423310n8r) != null) {
                        c1423350n8v.LJFF.putAll(C2097608Jq.LJIJ(C09RB.LJIJI(new C1939607ik(list2), AFwS261S0000000_22.get$arr$(336))));
                    }
                    c1422890n8B.LJI = null;
                }
            }
        });
        InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> interfaceC1423360n8w = new InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA>(listLJIIJJI) { // from class: X.0n8t
            public final List<InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA>> LIZ;

            @Override // X.InterfaceC1423360n8w
            public final void onCancel() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LIZ = listLJIIJJI;
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZ(ERROR_DATA error_data) {
                Iterator<InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZ(error_data);
                }
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZIZ(List<? extends CATEGORY> list, FETCH_CATEGORY_RESULT_EXTRA fetch_category_result_extra, C1423320n8s<CATEGORY, DATA, FETCH_DATA_RESULT_EXTRA_DATA, ERROR_DATA> c1423320n8s) {
                Iterator<InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ(list, fetch_category_result_extra, c1423320n8s);
                }
            }

            @Override // X.InterfaceC1423360n8w
            public final void LIZJ(List list, C1423470n97 c1423470n97, TemplateCategoryData templateCategoryData, List list2, C1422890n8B c1422890n8B) {
                Iterator<InterfaceC1423360n8w<CATEGORY, DATA, ERROR_DATA, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA>> it2 = this.LIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZJ(list, c1423470n97, templateCategoryData, list2, c1422890n8B);
                }
            }
        };
        InterfaceC1423420n92<CATEGORY, DATA, ERROR_DATA, ORI_CATEGORY, ORI_DATA, FETCH_CATEGORY_PARAM, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> interfaceC1423420n92 = k0Var.LIZIZ;
        if (interfaceC1423420n92 != 0) {
            interfaceC1423420n92.LIZIZ(c1423740n9Y, new C1423290n8p(k0Var, interfaceC1423360n8w));
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0n8m] */
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
    @Override // X.InterfaceC1422570n7f
    public boolean s92(final TemplateCategoryData templateCategoryData, boolean z, boolean z2, boolean z3, int i, int i2) {
        Pair pair;
        InterfaceC1423430n93<CATEGORY, DATA, ERROR_DATA, ORI_DATA, FETCH_DATA_PARAM, FETCH_DATA_RESULT_EXTRA_DATA> interfaceC1423430n93;
        Boolean boolValueOf;
        InterfaceC1423420n92<CATEGORY, DATA, ERROR_DATA, ORI_CATEGORY, ORI_DATA, FETCH_CATEGORY_PARAM, FETCH_CATEGORY_RESULT_EXTRA, FETCH_DATA_RESULT_EXTRA_DATA> interfaceC1423420n92;
        Pair pair2 = (Pair) ((Map) this.LLILZIL.LIZ.Kv().LIZJ()).get(templateCategoryData);
        if (pair2 != null) {
            pair = new Pair(Boolean.valueOf(((C1422890n8B) pair2.getFirst()).LIZ), pair2.getSecond());
        } else {
            pair = new Pair(Boolean.TRUE, C13BV.INSTANCE);
        }
        boolean zBooleanValue = ((Boolean) pair.getFirst()).booleanValue();
        List list = (List) pair.getSecond();
        C1423350n8v c1423350n8vG2 = G2();
        List<Pair<C1419590n2r, Boolean>> list2 = null;
        if (c1423350n8vG2 != null && z2 && i == 1 && C1423570n9H.LIZJ(templateCategoryData)) {
            list2 = c1423350n8vG2.LJI;
        }
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        C1423690n9T c1423690n9T = new C1423690n9T(z3, z, z2, i2, zBooleanValue, list, new C1423760n9a(shortVideoContext.shootWay, shortVideoContext.getCreationId()), list2);
        final k0 k0Var = this.LLILZIL;
        k0Var.getClass();
        if (templateCategoryData.isDefault && (interfaceC1423420n92 = k0Var.LIZIZ) != 0) {
            interfaceC1423420n92.LIZ("fetch_template_list");
        }
        final InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B> interfaceC1423460n96 = new InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B>() { // from class: X.0n8n
            @Override // X.InterfaceC1423460n96
            public final /* bridge */ /* synthetic */ void LIZ(C1422880n8A c1422880n8A) {
            }

            @Override // X.InterfaceC1423460n96
            public final void LIZIZ(C1422890n8B c1422890n8B, List list3) {
                C1423350n8v c1423350n8v;
                List<FilteredAsset> list4 = c1422890n8B.LJI;
                if (list4 != null) {
                    Object obj = k0Var.LIZ;
                    if ((obj instanceof C1423350n8v) && (c1423350n8v = (C1423350n8v) obj) != null) {
                        c1423350n8v.LJFF.putAll(C2097608Jq.LJIJ(C09RB.LJIJI(new C1939607ik(list4), AFwS261S0000000_22.get$arr$(336))));
                    }
                    c1422890n8B.LJI = null;
                }
            }
        };
        if (k0Var.LIZ.t().contains(templateCategoryData) && (interfaceC1423430n93 = k0Var.LIZJ) != 0 && (boolValueOf = Boolean.valueOf(interfaceC1423430n93.LIZJ(templateCategoryData, c1423690n9T, new InterfaceC1423460n96<Object, Object, Object>() { // from class: X.0n8m
            @Override // X.InterfaceC1423460n96
            public final void LIZ(Object obj) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BaseDataManager fetchDataList onError: ");
                sbLIZ.append(obj);
                C201955140j.LJII(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                k0Var.LIZ.Qv(obj);
                InterfaceC1423460n96<Object, Object, Object> interfaceC1423460n962 = interfaceC1423460n96;
                if (interfaceC1423460n962 != null) {
                    interfaceC1423460n962.LIZ(obj);
                }
            }

            @Override // X.InterfaceC1423460n96
            public final void LIZIZ(C1422890n8B c1422890n8B, List list3) {
                C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BaseDataManager fetchDataList onSuccess: dataList.size = ");
                sbLIZ.append(list3.size());
                sbLIZ.append(", extra = ");
                sbLIZ.append(c1422890n8B);
                C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                k0Var.LIZ.Nv(templateCategoryData, c1422890n8B, list3);
                InterfaceC1423460n96<Object, Object, Object> interfaceC1423460n962 = interfaceC1423460n96;
                if (interfaceC1423460n962 != null) {
                    interfaceC1423460n962.LIZIZ(c1422890n8B, list3);
                }
            }
        }))) != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }
}
