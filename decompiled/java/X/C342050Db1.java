package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Db1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM$preRenderNimbleTemplateContext$lastJob$1", f = "SearchMarkdownContentCacheVM.kt", l = {}, m = "invokeSuspend")
public final class C342050Db1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ List<PreRenderCard> LLILLL;
    public final /* synthetic */ SearchMarkdownContentCacheVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342050Db1(Fragment fragment, List<PreRenderCard> list, SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, InterfaceC1364105Vn<? super C342050Db1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = list;
        this.LLILZ = searchMarkdownContentCacheVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342050Db1 c342050Db1 = new C342050Db1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c342050Db1.LL = obj;
        return c342050Db1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        ArrayList arrayList2;
        Object obj8;
        String str;
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Object obj9;
        String str2;
        Map map5;
        Map map6;
        C1C7U.LIZ("SearchMarkdownContentCacheVM@d5b0.preRenderNimbleTemplateContext$lastJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragment = this.LLILLJJLI;
        List<PreRenderCard> list = this.LLILLL;
        SearchMarkdownContentCacheVM searchMarkdownContentCacheVM = this.LLILZ;
        try {
            if (fragment.getContext() != null) {
                for (PreRenderCard preRenderCard : list) {
                    if (C342060Db2.LIZ[C648920Pco.LIZ(preRenderCard).ordinal()] == 1) {
                        Map<Object, ? extends Object> map7 = preRenderCard.detail;
                        if (map7 != null) {
                            obj2 = map7.get("top1_multi_summary");
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof Map) && (map6 = (Map) obj2) != null) {
                            obj3 = map6.get("multi_video");
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof ArrayList) {
                            arrayList = (ArrayList) obj3;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            for (Object obj10 : arrayList) {
                                if ((obj10 instanceof Map) && (map5 = (Map) obj10) != null) {
                                    obj9 = map5.get("layout_name");
                                } else {
                                    obj9 = null;
                                }
                                if ((obj9 instanceof String) && (str2 = (String) obj9) != null) {
                                    searchMarkdownContentCacheVM.getClass();
                                    SearchMarkdownContentCacheVM.xQ2(fragment, str2);
                                }
                            }
                        }
                        Map<Object, ? extends Object> map8 = preRenderCard.detail;
                        if (map8 != null) {
                            obj4 = map8.get("top1_summary_card");
                        } else {
                            obj4 = null;
                        }
                        if (!(obj4 instanceof Map) || (map4 = (Map) obj4) == null) {
                            obj5 = null;
                        } else {
                            obj5 = map4.get("fusion_card");
                        }
                        if ((obj5 instanceof Map) && (map3 = (Map) obj5) != null) {
                            obj6 = map3.get("result_page");
                        } else {
                            obj6 = null;
                        }
                        if ((obj6 instanceof Map) && (map2 = (Map) obj6) != null) {
                            obj7 = map2.get("blocks");
                        } else {
                            obj7 = null;
                        }
                        if ((obj7 instanceof ArrayList) && (arrayList2 = (ArrayList) obj7) != null) {
                            for (Object obj11 : arrayList2) {
                                if ((obj11 instanceof Map) && (map = (Map) obj11) != null) {
                                    obj8 = map.get("layout_name");
                                } else {
                                    obj8 = null;
                                }
                                if ((obj8 instanceof String) && (str = (String) obj8) != null) {
                                    searchMarkdownContentCacheVM.getClass();
                                    SearchMarkdownContentCacheVM.xQ2(fragment, str);
                                }
                            }
                        }
                    }
                }
            }
            Set set = (Set) C292990Be5.LIZIZ.getValue();
            ArrayList<String> arrayList3 = new ArrayList();
            for (Object obj12 : set) {
                if (C123100dR.LIZ((String) obj12)) {
                    arrayList3.add(obj12);
                }
            }
            for (String str3 : arrayList3) {
                searchMarkdownContentCacheVM.getClass();
                SearchMarkdownContentCacheVM.xQ2(fragment, str3);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchMarkdownContentCacheVM@d5b0.preRenderNimbleTemplateContext$lastJob$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
