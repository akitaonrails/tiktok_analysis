package X;

import android.os.Parcelable;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetCategoryModel;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsQueryAdditionalParameters;
import com.ss.android.ugc.effectmanager.effect.model.MixedAssetsRequestBodyInfo;
import com.ss.android.ugc.effectmanager.effect.model.net.AssetCategoryResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import njp.a;

/* JADX INFO: renamed from: X.0n9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCategoryFetcher$createFetchTemplatesFlow$2", f = "TemplateTabCategoryFetcher.kt", l = {706}, m = "invokeSuspend")
public final class C1423500n9A extends C09AX implements Function2<C094D<? super C1423630n9N>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1423490n99 LLILLL;
    public final /* synthetic */ C1423740n9Y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1423500n9A(C1423490n99 c1423490n99, C1423740n9Y c1423740n9Y, InterfaceC1364105Vn<? super C1423500n9A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1423490n99;
        this.LLILZ = c1423740n9Y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1423500n9A c1423500n9A = new C1423500n9A(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1423500n9A.LLILLJJLI = obj;
        return c1423500n9A;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("TemplateTabCategoryFetcher@9acf.createFetchTemplatesFlow$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            this.LLILLL.LJIILJJIL = EnumC1423670n9R.PROGRESS;
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1419580n2q c1419580n2q = C1419580n2q.LIZ;
            AwS423S0200000_22 awS423S0200000_22 = new AwS423S0200000_22(this.LLILLL, this.LLILZ, 103);
            C1423740n9Y c1423740n9Y = this.LLILZ;
            boolean z = c1423740n9Y.LIZIZ;
            int i2 = c1423740n9Y.LIZ;
            C1423760n9a c1423760n9a = c1423740n9Y.LJ;
            c1419580n2q.getClass();
            final C1423300n8q c1423300n8q = new C1423300n8q(0, i2, jCurrentTimeMillis, c1423760n9a, awS423S0200000_22, z);
            InterfaceC1635390sev interfaceC1635390sev = (InterfaceC1635390sev) this.LLILLL.LIZLLL.getValue();
            String str2 = "mv_filter_libra1";
            if (C0BOM.LIZ()) {
                str = "1234";
            } else {
                str = this.LLILZ.LIZJ;
                if (str == null) {
                    str = "mv_filter_libra1";
                }
            }
            int i3 = this.LLILZ.LIZ;
            if (C0BOM.LIZ()) {
                String str3 = this.LLILZ.LIZJ;
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                str2 = null;
            }
            C1423760n9a c1423760n9a2 = this.LLILZ.LJ;
            String str4 = c1423760n9a2.LIZ;
            C1449490np5 c1449490np5 = C1449490np5.LIZ;
            String str5 = c1423760n9a2.LIZIZ;
            c1449490np5.getClass();
            String strLJIIIZ = C1449490np5.LJIIIZ(str5);
            boolean z2 = this.LLILZ.LIZIZ;
            IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
            if (iToolsDebugGpService != null) {
                iToolsDebugGpService.isOpen();
                Boolean bool = false;
                bool.booleanValue();
            }
            MixedAssetsRequestBodyInfo mixedAssetsRequestBodyInfo = new MixedAssetsRequestBodyInfo("tt_template", null, null, null, null, str2, null, null, null, null, null, str4, null, null, null, null, null, null, null, null, null, null, null, "", strLJIIIZ, "", null, null, null, null, Boolean.FALSE, Boolean.valueOf(z2), "", null);
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            TemplateScene templateScene = TemplateScene.TEMPLATE_TAB;
            c1429050nI7.getClass();
            Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
            Map<C0CIJ, C311200CHu> map = C311170CHr.LIZ;
            MixedAssetsQueryAdditionalParameters mixedAssetsQueryAdditionalParameters = new MixedAssetsQueryAdditionalParameters(pairLIZJ, "2", this.LLILZ.LJ.LIZIZ, null, null, false, null, null, false);
            final C1423740n9Y c1423740n9Y2 = this.LLILZ;
            final C1423490n99 c1423490n99 = this.LLILLL;
            interfaceC1635390sev.LJIILL(mixedAssetsQueryAdditionalParameters, "tt_template", str, 0, i3, mixedAssetsRequestBodyInfo, new IFetchAssetCategoryInfo() { // from class: X.0n9D
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchAssetCategoryInfo
                public final void onFailed(ExceptionResult exceptionResult) {
                    int errorCode;
                    String msg;
                    String logId;
                    EnumC1423060n8S enumC1423060n8S = EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
                    if (exceptionResult != null) {
                        errorCode = exceptionResult.getErrorCode();
                    } else {
                        errorCode = 10004;
                    }
                    if (exceptionResult == null || (msg = exceptionResult.getMsg()) == null) {
                        msg = "";
                    }
                    boolean z3 = c1423740n9Y2.LIZIZ;
                    if (exceptionResult != null) {
                        logId = exceptionResult.getLogId();
                    } else {
                        logId = null;
                    }
                    C1422880n8A c1422880n8A = new C1422880n8A(enumC1423060n8S, errorCode, msg, null, z3, logId);
                    C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A);
                    C094D<C1423630n9N> c094d2 = c094d;
                    C1423630n9N c1423630n9NLJ = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                    if (c1423630n9NLJ == null) {
                        c1423630n9NLJ = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A);
                    }
                    c094d2.LJIIIIZZ(c1423630n9NLJ);
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(AssetCategoryResponse assetCategoryResponse) {
                    AssetCategoryModel data;
                    C1419590n2r c1419590n2r;
                    AssetCategoryResponse assetCategoryResponse2 = assetCategoryResponse;
                    String logId = null;
                    if (assetCategoryResponse2 != null && (data = assetCategoryResponse2.getData()) != null) {
                        List<Asset> list = data.asset_list;
                        if (list != null && !list.isEmpty()) {
                            C1423490n99 c1423490n992 = c1423490n99;
                            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            int i4 = 0;
                            for (Parcelable parcelable : list) {
                                int i5 = i4 + 1;
                                if (i4 >= 0) {
                                    InterfaceC1423480n98<ORI_DATA, DATA> interfaceC1423480n98 = c1423490n992.LIZIZ;
                                    if (interfaceC1423480n98 != 0 && (c1419590n2r = (C1419590n2r) interfaceC1423480n98.LIZ((ORI_DATA) parcelable)) != null) {
                                        c1419590n2r.LIZJ = 0;
                                        c1419590n2r.LIZLLL = i4;
                                    } else {
                                        c1419590n2r = null;
                                    }
                                    arrayList.add(c1419590n2r);
                                    i4 = i5;
                                } else {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                            }
                            List listLJJJJLI = C13LP.LJJJJLI(arrayList);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj2 : (ArrayList) listLJJJJLI) {
                                if (hashSet.add(((C1419590n2r) obj2).LIZ.getAsset_id())) {
                                    arrayList2.add(obj2);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                C1422880n8A c1422880n8A = new C1422880n8A(EnumC1423060n8S.FETCH_TEMPLATE_ERROR, 10004, "parsed templateList is empty", null, c1423740n9Y2.LIZIZ, assetCategoryResponse2.getLogId());
                                C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A);
                                C094D<C1423630n9N> c094d2 = c094d;
                                C1423630n9N c1423630n9NLJ = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                                if (c1423630n9NLJ == null) {
                                    c1423630n9NLJ = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A);
                                }
                                c094d2.LJIIIIZZ(c1423630n9NLJ);
                                return;
                            }
                            Boolean bool2 = data.has_more;
                            Integer num = data.next_position;
                            if (bool2 == null) {
                                C1422880n8A c1422880n8A2 = new C1422880n8A(EnumC1423060n8S.FETCH_TEMPLATE_ERROR, 10004, "has_more is null", null, c1423740n9Y2.LIZIZ, assetCategoryResponse2.getLogId());
                                C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A2);
                                C094D<C1423630n9N> c094d3 = c094d;
                                C1423630n9N c1423630n9NLJ2 = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                                if (c1423630n9NLJ2 == null) {
                                    c1423630n9NLJ2 = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A2);
                                }
                                c094d3.LJIIIIZZ(c1423630n9NLJ2);
                                return;
                            }
                            if (num == null) {
                                C1422880n8A c1422880n8A3 = new C1422880n8A(EnumC1423060n8S.FETCH_TEMPLATE_ERROR, 10004, "next_position is null", null, c1423740n9Y2.LIZIZ, assetCategoryResponse2.getLogId());
                                C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A3);
                                C094D<C1423630n9N> c094d4 = c094d;
                                C1423630n9N c1423630n9NLJ3 = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                                if (c1423630n9NLJ3 == null) {
                                    c1423630n9NLJ3 = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A3);
                                }
                                c094d4.LJIIIIZZ(c1423630n9NLJ3);
                                return;
                            }
                            C1422890n8B c1422890n8B = new C1422890n8B(bool2.booleanValue(), assetCategoryResponse2.getLogId(), false, false, false, (List) null, (Integer) null, 220);
                            C1423490n99 c1423490n993 = c1423490n99;
                            InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B> interfaceC1423460n96 = c1423300n8q;
                            EnumC1423670n9R enumC1423670n9R = EnumC1423670n9R.SUCCESS;
                            c1423490n993.LJIILJJIL = enumC1423670n9R;
                            interfaceC1423460n96.LIZIZ(c1422890n8B, arrayList2);
                            c094d.LJIIIIZZ(new C1423630n9N(enumC1423670n9R, arrayList2, c1422890n8B, num.intValue(), null));
                            return;
                        }
                        C1422880n8A c1422880n8A4 = new C1422880n8A(EnumC1423060n8S.FETCH_TEMPLATE_ERROR, 10004, "templateList is empty", null, c1423740n9Y2.LIZIZ, assetCategoryResponse2.getLogId());
                        C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A4);
                        C094D<C1423630n9N> c094d5 = c094d;
                        C1423630n9N c1423630n9NLJ4 = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                        if (c1423630n9NLJ4 == null) {
                            c1423630n9NLJ4 = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A4);
                        }
                        c094d5.LJIIIIZZ(c1423630n9NLJ4);
                        return;
                    }
                    EnumC1423060n8S enumC1423060n8S = EnumC1423060n8S.FETCH_TEMPLATE_ERROR;
                    boolean z3 = c1423740n9Y2.LIZIZ;
                    if (assetCategoryResponse2 != null) {
                        logId = assetCategoryResponse2.getLogId();
                    }
                    C1422880n8A c1422880n8A5 = new C1422880n8A(enumC1423060n8S, 10004, "response is null", null, z3, logId);
                    C1423500n9A.LIZ(c1423490n99, c1423300n8q, c1422880n8A5);
                    C094D<C1423630n9N> c094d6 = c094d;
                    C1423630n9N c1423630n9NLJ5 = C1423490n99.LJ(c1423490n99, c1423740n9Y2);
                    if (c1423630n9NLJ5 == null) {
                        c1423630n9NLJ5 = new C1423630n9N(EnumC1423670n9R.FAIL, null, null, 0, c1422880n8A5);
                    }
                    c094d6.LJIIIIZZ(c1423630n9NLJ5);
                }
            });
            AFwS210S0000000_22 aFwS210S0000000_22 = AFwS210S0000000_22.get$arr$(461);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS210S0000000_22, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.createFetchTemplatesFlow$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabCategoryFetcher@9acf.createFetchTemplatesFlow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C1423630n9N> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    public static final void LIZ(C1423490n99 c1423490n99, InterfaceC1423460n96<C1419590n2r, C1422880n8A, C1422890n8B> interfaceC1423460n96, C1422880n8A c1422880n8A) {
        c1423490n99.LJIILJJIL = EnumC1423670n9R.FAIL;
        interfaceC1423460n96.LIZ(c1422880n8A);
    }
}
