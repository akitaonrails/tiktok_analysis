package X;

import android.os.Parcelable;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsPluginService;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetPanelResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS190S0000000_4;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS636S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.b;

/* JADX INFO: renamed from: X.0n99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1423490n99 extends AbstractC1423370n8x<TemplateCategoryData, C1419590n2r, C1422880n8A, CategoryInfo, Asset, C1423740n9Y, C1423470n97, C1422890n8B> {
    public final InterfaceC497601wk LIZJ;
    public C1423810n9f LJFF;
    public AnonymousClass0956 LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public TemplateCategoryData LJIIJJI;
    public boolean LJIIL;
    public EnumC1423670n9R LJIILIIL;
    public EnumC1423670n9R LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final C01GW LJIIZILJ;
    public Set<C1419590n2r> LJIJ;
    public InterfaceC1423360n8w<TemplateCategoryData, C1419590n2r, C1422880n8A, C1423470n97, C1422890n8B> LJIJI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(509));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4783));
    public final C1423020n8O LJI = new C1423020n8O();
    public C1423710n9V LJIIIZ = new C1423710n9V(0);
    public final C1DEV LJIIJ = C2191201ApK.LIZ();

    public final boolean LJIIIIZZ() {
        return ((Boolean) this.LJIIZILJ.getValue()).booleanValue();
    }

    public C1423490n99(LifecycleCoroutineScope lifecycleCoroutineScope) {
        this.LIZJ = lifecycleCoroutineScope;
        EnumC1423670n9R enumC1423670n9R = EnumC1423670n9R.NONE;
        this.LJIILIIL = enumC1423670n9R;
        this.LJIILJJIL = enumC1423670n9R;
        this.LJIILL = ((Boolean) C283150B7x.LIZ.getValue()).booleanValue();
        this.LJIILLIIL = ((Boolean) C265450Aal.LIZ.getValue()).booleanValue();
        this.LJIIZILJ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(4784));
        this.LJIJ = C08CX.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    @Override // X.AbstractC1423370n8x, X.InterfaceC1423420n92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r7) {
        /*
            r6 = this;
            X.0mUb r2 = X.C1398350mUb.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "TemplateTabCategoryNewFetcher cancelTask: fetchCategoriesJob = "
            r1.append(r0)
            X.0956 r0 = r6.LJII
            r1.append(r0)
            java.lang.String r0 = ", fetchTemplatesJob = "
            r1.append(r0)
            X.0956 r0 = r6.LJIIIIZZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C201955140j.LIZJ(r2, r0)
            boolean r0 = r6.LJIIIIZZ()
            r5 = 0
            if (r0 == 0) goto L48
            java.lang.String r0 = "fetch_template_list"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            if (r0 == 0) goto L48
            X.0n9R r1 = r6.LJIILIIL
            X.0n9R r0 = X.EnumC1423670n9R.PROGRESS
            if (r1 != r0) goto L48
            X.0956 r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L3d
            r0.LIZIZ(r5)
        L3d:
            r6.LJIIIIZZ = r5
            X.0n9V r0 = r6.LJIIIZ
            r0.LIZIZ = r5
            X.0n9R r0 = X.EnumC1423670n9R.CANCEL
            r6.LJIILJJIL = r0
            return
        L48:
            X.0956 r4 = r6.LJII
            r3 = 0
            if (r4 != 0) goto L51
            X.0956 r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L91
        L51:
            X.0n9R r0 = r6.LJIILIIL
            X.0n9R r1 = X.EnumC1423670n9R.PROGRESS
            if (r0 == r1) goto L5b
            X.0n9R r0 = r6.LJIILJJIL
            if (r0 != r1) goto L91
        L5b:
            r2 = 1
        L5c:
            if (r4 == 0) goto L61
            r4.LIZIZ(r5)
        L61:
            X.0956 r0 = r6.LJIIIIZZ
            if (r0 == 0) goto L68
            r0.LIZIZ(r5)
        L68:
            r6.LJII = r5
            r6.LJIIIIZZ = r5
            X.0n9V r0 = new X.0n9V
            r0.<init>(r3)
            r6.LJIIIZ = r0
            r6.LJIIJJI = r5
            X.0n9R r0 = r6.LJIILIIL
            X.0n9R r1 = X.EnumC1423670n9R.PROGRESS
            if (r0 != r1) goto L7f
            X.0n9R r0 = X.EnumC1423670n9R.CANCEL
            r6.LJIILIIL = r0
        L7f:
            X.0n9R r0 = r6.LJIILJJIL
            if (r0 != r1) goto L87
            X.0n9R r0 = X.EnumC1423670n9R.CANCEL
            r6.LJIILJJIL = r0
        L87:
            if (r2 == 0) goto L90
            X.0n8w<com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData, X.0n2r, X.0n8A, X.0n97, X.0n8B> r0 = r6.LJIJI
            if (r0 == 0) goto L90
            r0.onCancel()
        L90:
            return
        L91:
            r2 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423490n99.LIZ(java.lang.String):void");
    }

    public final C1423660n9Q LIZJ(C1423740n9Y c1423740n9Y) {
        C1423660n9Q c1423660n9QLJII = LJII(c1423740n9Y);
        if (c1423660n9QLJII != null && c1423660n9QLJII.LIZ == EnumC1423670n9R.SUCCESS) {
            String str = c1423740n9Y.LIZJ;
            if (str == null) {
                str = "mv_filter_libra1";
            }
            List<TemplateCategoryData> list = c1423660n9QLJII.LIZIZ;
            if (list != null) {
                boolean z = false;
                for (TemplateCategoryData templateCategoryData : list) {
                    boolean zLJFF = Intrinsics.LJFF(str, templateCategoryData.key);
                    if (!z && !zLJFF) {
                        z = false;
                    } else {
                        z = true;
                    }
                    templateCategoryData.isDefault = zLJFF;
                }
                if (z) {
                    return c1423660n9QLJII;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final AssetPanelResponse LJFF(C1423740n9Y c1423740n9Y) {
        String str;
        if (C296620Bjw.LIZ()) {
            str = "tt_template__api";
        } else {
            str = "tt_template";
        }
        AssetPanelResponse assetPanelResponseLJIJJ = ((InterfaceC1635390sev) this.LIZLLL.getValue()).LJIJJ(str, c1423740n9Y.LIZJ, c1423740n9Y.LIZ);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabCategoryNewFetcher fetchCategoriesFromCache: category = ");
        sbLIZ.append(c1423740n9Y.LIZJ);
        sbLIZ.append(", cache = ");
        sbLIZ.append(assetPanelResponseLJIJJ);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        return assetPanelResponseLJIJJ;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final C1423660n9Q LJII(C1423740n9Y c1423740n9Y) {
        AssetPanelModel data;
        List<CategoryInfo> list;
        String str;
        Object objLIZ;
        List<String> list2 = null;
        try {
            AssetPanelResponse assetPanelResponseLJFF = LJFF(c1423740n9Y);
            if (assetPanelResponseLJFF != null && (data = assetPanelResponseLJFF.getData()) != null && (list = data.category_list) != null) {
                ArrayList arrayList = new ArrayList();
                for (Parcelable parcelable : list) {
                    InterfaceC1423480n98<ORI_CATEGORY, CATEGORY> interfaceC1423480n98 = this.LIZ;
                    if (interfaceC1423480n98 != 0 && (objLIZ = interfaceC1423480n98.LIZ((ORI_CATEGORY) parcelable)) != null) {
                        arrayList.add(objLIZ);
                    }
                }
                if (!arrayList.isEmpty()) {
                    EnumC1423670n9R enumC1423670n9R = EnumC1423670n9R.SUCCESS;
                    assetPanelResponseLJFF.getLogId();
                    AssetPanelModel data2 = assetPanelResponseLJFF.getData();
                    if (data2 != null) {
                        str = data2.extra;
                    } else {
                        str = null;
                    }
                    AssetPanelModel data3 = assetPanelResponseLJFF.getData();
                    if (data3 != null) {
                        list2 = data3.url_prefix;
                    }
                    return new C1423660n9Q(enumC1423670n9R, arrayList, new C1423470n97(str, list2, true), null, false);
                }
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIZ(C1398350mUb.LIZIZ, "TemplateTabCategoryNewFetcher", "getCacheCategoryResult failed by dirty cache", e);
            return null;
        }
    }

    public static final C1423660n9Q LIZLLL(C1423490n99 c1423490n99, C1423740n9Y c1423740n9Y) {
        C201955140j.LIZJ(C1398350mUb.LIZIZ, "TemplateTabCategoryNewFetcher createFetchCategoriesFlow: failed then try to load cache");
        if (c1423490n99.LJIILLIIL) {
            return c1423490n99.LJII(c1423740n9Y);
        }
        return null;
    }

    public static final C1423630n9N LJ(C1423490n99 c1423490n99, C1423740n9Y c1423740n9Y) {
        String str;
        boolean z;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C201955140j.LIZJ(c1398350mUb, "TemplateTabCategoryNewFetcher createFetchTemplatesFlow: failed then try to load cache");
        TemplateCategoryData templateCategoryData = c1423490n99.LJIIJJI;
        if (templateCategoryData != null && (str = templateCategoryData.key) != null && c1423490n99.LJIILLIIL) {
            List<C1419590n2r> listLJI = c1423490n99.LJI(str, c1423740n9Y, false);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TemplateTabCategoryNewFetcher getCacheAssetResult: category = ");
            sbLIZ.append(str);
            sbLIZ.append(", param = ");
            sbLIZ.append(c1423740n9Y);
            sbLIZ.append(", updated = ");
            sbLIZ.append(false);
            sbLIZ.append(": result is null? ");
            if (listLJI != null && !listLJI.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            sbLIZ.append(z);
            C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
            if (listLJI != null && !listLJI.isEmpty()) {
                return new C1423630n9N(EnumC1423670n9R.SUCCESS, listLJI, new C1422890n8B(true, (String) null, false, true, false, (List) null, (Integer) null, 204), 0, null);
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC1423420n92
    public final void LIZIZ(Object obj, C1423290n8p c1423290n8p) {
        InterfaceC346201Wa interfaceC346201WaLJ;
        C1423740n9Y c1423740n9Y = (C1423740n9Y) obj;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabCategoryNewFetcher start fetchCategoryList: isPreload = ");
        sbLIZ.append(c1423740n9Y.LIZIZ);
        sbLIZ.append(", currentTime = ");
        sbLIZ.append(System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        this.LJIJI = c1423290n8p;
        LIZ("");
        this.LJIIL = false;
        CreativeToolsPluginService creativeToolsPluginService = (CreativeToolsPluginService) PluggableExtentionKt.pluggableSpi$default(CreativeToolsPluginService.class, false, false, false, 14, null);
        if (creativeToolsPluginService != null) {
            C844470XAv.LIZ.getClass();
            if (creativeToolsPluginService.LJI(C844470XAv.LIZ())) {
                if (((Boolean) C265470Aan.LIZ.getValue()).booleanValue()) {
                    C1429050nI7.LIZ.getClass();
                    C1429050nI7.LIZIZ();
                }
                b bVarLJ = C09IC.LJ(new C1423510n9B(this, c1423740n9Y, null));
                if (Intrinsics.LJFF(c1423740n9Y.LIZJ, "my_favorite")) {
                    interfaceC346201WaLJ = new C095D(new C1423560n9G(this.LJFF, 0, c1423740n9Y.LIZ, new AwS636S0100000_22(this, 61), null));
                } else {
                    interfaceC346201WaLJ = C09IC.LJ(new C1423500n9A(this, c1423740n9Y, null));
                }
                InterfaceC497601wk interfaceC497601wk = this.LIZJ;
                C1DFB c1dfb = C0PEM.LIZJ;
                this.LJII = C23250099c.LIZLLL(interfaceC497601wk, c1dfb, null, new C1423590n9J(bVarLJ, this, c1423740n9Y, c1423290n8p, null), 2);
                this.LJIIIIZZ = C23250099c.LIZLLL(this.LIZJ, c1dfb, null, new C1423600n9K(interfaceC346201WaLJ, this, c1423740n9Y, c1423290n8p, null), 2);
                return;
            }
        }
        C201955140j.LIZJ(c1398350mUb, "TemplateTabCategoryNewFetcher fetchCategoryList skipped: VE plugin not installed");
    }

    public final void LJIIJJI(TemplateCategoryData templateCategoryData, C1423740n9Y c1423740n9Y) {
        String str;
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        if (c1423740n9Y.LIZLLL) {
            str = "retry";
        } else {
            str = "initialize";
        }
        C1423760n9a c1423760n9a = c1423740n9Y.LJ;
        C1419580n2q.LJIILL(str, templateCategoryData, c1423760n9a.LIZ, c1423760n9a.LIZIZ, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C1419590n2r> LJI(java.lang.String r36, X.C1423740n9Y r37, boolean r38) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1423490n99.LJI(java.lang.String, X.0n9Y, boolean):java.util.List");
    }

    public static final List<C1419590n2r> LJIIJ(C1423490n99 c1423490n99, TemplateCategoryData templateCategoryData, C1423740n9Y c1423740n9Y, C259800zU<C1423660n9Q> c259800zU) {
        Pair<String, ? extends List<C1419590n2r>> pair = c1423490n99.LJIIIZ.LIZJ;
        String first = pair.getFirst();
        List<C1419590n2r> second = pair.getSecond();
        if (!Intrinsics.LJFF(first, templateCategoryData.key) && (second = c1423490n99.LJI(templateCategoryData.key, c1423740n9Y, c259800zU.element.LJ)) != null && !second.isEmpty()) {
            c1423490n99.LJIIIZ.LIZJ = new Pair<>(templateCategoryData.key, second);
        }
        return second;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0n9Q] */
    /* JADX WARN: Type inference failed for: r12v6, types: [T, X.0n9Q] */
    public final void LJIIIZ(boolean z, C1423740n9Y c1423740n9Y, InterfaceC1423360n8w<TemplateCategoryData, C1419590n2r, C1422880n8A, C1423470n97, C1422890n8B> interfaceC1423360n8w, Function0<Unit> function0) {
        TemplateCategoryData next;
        List<C1419590n2r> list;
        List<C1419590n2r> listLJIIJ;
        boolean z2;
        TemplateCategoryData next2;
        ArrayList arrayList;
        function0.invoke();
        C259800zU c259800zU = new C259800zU();
        C1423710n9V c1423710n9V = this.LJIIIZ;
        c259800zU.element = c1423710n9V.LIZ;
        C1423630n9N c1423630n9N = c1423710n9V.LIZIZ;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TemplateTabCategoryNewFetcher handleFinalResult: categoriesResult = ");
        sbLIZ.append(c259800zU.element);
        sbLIZ.append(", templatesResult = ");
        sbLIZ.append(c1423630n9N);
        C201955140j.LIZJ(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
        if (c259800zU.element == 0) {
            return;
        }
        boolean z3 = true;
        Integer numValueOf = null;
        if (!((Boolean) this.LJ.getValue()).booleanValue()) {
            C1423660n9Q c1423660n9Q = (C1423660n9Q) c259800zU.element;
            List<TemplateCategoryData> list2 = c1423660n9Q.LIZIZ;
            if (list2 != null) {
                arrayList = new ArrayList();
                for (TemplateCategoryData templateCategoryData : list2) {
                    if (!C1423570n9H.LIZJ(templateCategoryData)) {
                        arrayList.add(templateCategoryData);
                    }
                }
            } else {
                arrayList = null;
            }
            c259800zU.element = new C1423660n9Q(c1423660n9Q.LIZ, arrayList, c1423660n9Q.LIZJ, c1423660n9Q.LIZLLL, c1423660n9Q.LJ);
        }
        C1423660n9Q c1423660n9Q2 = (C1423660n9Q) c259800zU.element;
        EnumC1423670n9R enumC1423670n9R = c1423660n9Q2.LIZ;
        if (enumC1423670n9R != EnumC1423670n9R.FAIL && c1423660n9Q2.LIZIZ != null && c1423660n9Q2.LIZJ != null) {
            if (enumC1423670n9R == EnumC1423670n9R.SUCCESS) {
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("TemplateTabCategoryNewFetcher categoryList: ");
                sbLIZ2.append(C13LP.LJJLIIIJ(((C1423660n9Q) c259800zU.element).LIZIZ, null, null, null, 0, null, AFwS261S0000000_22.get$arr$(337), 31));
                C201955140j.LIZJ(c1398350mUb2, C2188811AlT.LIZIZ(sbLIZ2));
                Iterator<TemplateCategoryData> it2 = ((C1423660n9Q) c259800zU.element).LIZIZ.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.isDefault) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                TemplateCategoryData templateCategoryData2 = next;
                String str = "mv_filter_libra1";
                if (templateCategoryData2 == null) {
                    Iterator<TemplateCategoryData> it3 = ((C1423660n9Q) c259800zU.element).LIZIZ.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next2 = it3.next();
                            if (Intrinsics.LJFF(next2.key, "mv_filter_libra1")) {
                                break;
                            }
                        } else {
                            next2 = null;
                            break;
                        }
                    }
                    templateCategoryData2 = next2;
                    if (templateCategoryData2 == null) {
                        templateCategoryData2 = (TemplateCategoryData) C13LP.LJJJJZI(((C1423660n9Q) c259800zU.element).LIZIZ);
                    }
                }
                this.LJIIJJI = templateCategoryData2;
                int iMax = 0;
                if (c1423630n9N == null) {
                    if (this.LJIILJJIL == EnumC1423670n9R.CANCEL && LJIIIIZZ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.LJIILL && !z2) {
                        List<C1419590n2r> listLJIIJ2 = LJIIJ(this, templateCategoryData2, c1423740n9Y, c259800zU);
                        C1398350mUb c1398350mUb3 = C1398350mUb.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("TemplateTabCategoryNewFetcher showCache when category requesting success and template requesting: ");
                        if (listLJIIJ2 != null) {
                            numValueOf = Integer.valueOf(listLJIIJ2.size());
                        }
                        sbLIZ3.append(numValueOf);
                        C201955140j.LIZJ(c1398350mUb3, C2188811AlT.LIZIZ(sbLIZ3));
                        if (listLJIIJ2 != null && !listLJIIJ2.isEmpty()) {
                            if (interfaceC1423360n8w != null) {
                                C1423660n9Q c1423660n9Q3 = (C1423660n9Q) c259800zU.element;
                                interfaceC1423360n8w.LIZJ(c1423660n9Q3.LIZIZ, c1423660n9Q3.LIZJ, templateCategoryData2, listLJIIJ2, new C1422890n8B(true, (String) null, true, false, false, (List) null, (Integer) null, 216));
                            }
                            LJIIJJI(templateCategoryData2, c1423740n9Y);
                            return;
                        }
                    }
                    if (interfaceC1423360n8w != null) {
                        C1423660n9Q c1423660n9Q4 = (C1423660n9Q) c259800zU.element;
                        interfaceC1423360n8w.LIZJ(c1423660n9Q4.LIZIZ, c1423660n9Q4.LIZJ, templateCategoryData2, null, null);
                    }
                    LJIIJJI(templateCategoryData2, c1423740n9Y);
                    if (z2) {
                        LIZ("");
                        return;
                    }
                    return;
                }
                LJIIJJI(templateCategoryData2, c1423740n9Y);
                String str2 = templateCategoryData2.key;
                String str3 = c1423740n9Y.LIZJ;
                if (str3 != null) {
                    str = str3;
                }
                if (!Intrinsics.LJFF(str2, str) && LJIIIIZZ()) {
                    z3 = false;
                }
                if (c1423630n9N.LIZ == EnumC1423670n9R.SUCCESS && z3 && (list = c1423630n9N.LIZIZ) != null && c1423630n9N.LIZJ != null) {
                    ArrayList arrayList2 = new ArrayList();
                    if (this.LJIILL && (listLJIIJ = LJIIJ(this, templateCategoryData2, c1423740n9Y, c259800zU)) != null) {
                        int size = listLJIIJ.size();
                        while (iMax < size) {
                            C1419590n2r c1419590n2r = (C1419590n2r) ListProtector.get(listLJIIJ, iMax);
                            Set<C1419590n2r> set = this.LJIJ;
                            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(set, 10));
                            Iterator<T> it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList3.add(((C1419590n2r) it4.next()).LIZ.getAsset_id());
                            }
                            if (!arrayList3.contains(c1419590n2r.LIZ.getAsset_id())) {
                                break;
                            }
                            arrayList2.add(c1419590n2r);
                            iMax++;
                        }
                        iMax = -1;
                    } else {
                        iMax = -1;
                    }
                    C1422890n8B c1422890n8B = c1423630n9N.LIZJ;
                    if (!C0BOM.LIZ()) {
                        iMax = Math.max(iMax, 6);
                    }
                    c1422890n8B.LIZLLL = iMax;
                    for (C1419590n2r c1419590n2r2 : list) {
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                        Iterator it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            arrayList4.add(((C1419590n2r) it5.next()).LIZ.getAsset_id());
                        }
                        if (!arrayList4.contains(c1419590n2r2.LIZ.getAsset_id())) {
                            arrayList2.add(c1419590n2r2);
                        }
                    }
                    C1423320n8s<TemplateCategoryData, C1419590n2r, C1422890n8B, C1422880n8A> c1423320n8s = new C1423320n8s<>(templateCategoryData2, arrayList2, c1423630n9N.LIZLLL, c1423630n9N.LIZJ, null);
                    C1398350mUb c1398350mUb4 = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("TemplateTabCategoryNewFetcher postDataList = ");
                    sbLIZ4.append(C13LP.LJJLIIIJ(arrayList2, "\n", null, null, 0, null, AFwS261S0000000_22.get$arr$(338), 30));
                    C201955140j.LIZJ(c1398350mUb4, C2188811AlT.LIZIZ(sbLIZ4));
                    if (interfaceC1423360n8w != null) {
                        C1423660n9Q c1423660n9Q5 = (C1423660n9Q) c259800zU.element;
                        interfaceC1423360n8w.LIZIZ(c1423660n9Q5.LIZIZ, c1423660n9Q5.LIZJ, c1423320n8s);
                        return;
                    }
                    return;
                }
                if (this.LJIILL && z3) {
                    List<C1419590n2r> listLJIIJ3 = LJIIJ(this, templateCategoryData2, c1423740n9Y, c259800zU);
                    if (listLJIIJ3 != null && interfaceC1423360n8w != null) {
                        C1423660n9Q c1423660n9Q6 = (C1423660n9Q) c259800zU.element;
                        interfaceC1423360n8w.LIZIZ(c1423660n9Q6.LIZIZ, c1423660n9Q6.LIZJ, new C1423320n8s<>(templateCategoryData2, listLJIIJ3, 0, new C1422890n8B(true, (String) null, false, false, false, (List) null, (Integer) null, 216), null));
                        return;
                    }
                    return;
                }
                if (interfaceC1423360n8w == null) {
                    return;
                }
                C1423660n9Q c1423660n9Q7 = (C1423660n9Q) c259800zU.element;
                List<TemplateCategoryData> list3 = c1423660n9Q7.LIZIZ;
                C1423470n97 c1423470n97 = c1423660n9Q7.LIZJ;
                C1422880n8A c1422880n8A = c1423630n9N.LJ;
                if (c1422880n8A != null) {
                    c1422880n8A.LIZLLL = templateCategoryData2;
                }
                interfaceC1423360n8w.LIZIZ(list3, c1423470n97, new C1423320n8s<>(templateCategoryData2, null, 0, null, c1422880n8A));
                return;
            }
            return;
        }
        if (!z) {
            return;
        }
        if (interfaceC1423360n8w != null) {
            C1422880n8A c1422880n8A2 = c1423660n9Q2.LIZLLL;
            if (c1422880n8A2 == null) {
                c1422880n8A2 = new C1422880n8A(EnumC1423060n8S.FETCH_CATEGORY_ERROR, 10001, "response data is illegal", null, c1423740n9Y.LIZIZ, null);
            }
            interfaceC1423360n8w.LIZ(c1422880n8A2);
        }
        LIZ("");
    }
}
