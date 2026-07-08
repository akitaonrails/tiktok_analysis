package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM;
import com.ss.android.ugc.aweme.search.performance.chunk.core.model.PreRenderCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Db3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.markdown.config.SearchMarkdownContentCacheVM$preRenderMarkDownContent$lastJob$1", f = "SearchMarkdownContentCacheVM.kt", l = {}, m = "invokeSuspend")
public final class C342070Db3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ Fragment LLILLJJLI;
    public final /* synthetic */ List<PreRenderCard> LLILLL;
    public final /* synthetic */ SearchMarkdownContentCacheVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C342070Db3(Fragment fragment, List<PreRenderCard> list, SearchMarkdownContentCacheVM searchMarkdownContentCacheVM, InterfaceC1364105Vn<? super C342070Db3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = fragment;
        this.LLILLL = list;
        this.LLILZ = searchMarkdownContentCacheVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342070Db3 c342070Db3 = new C342070Db3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c342070Db3.LL = obj;
        return c342070Db3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        ArrayList arrayList;
        Map map;
        Object obj4;
        Object obj5;
        String str;
        ArrayList arrayList2;
        Map map2;
        C1C7U.LIZ("SearchMarkdownContentCacheVM@d5b0.preRenderMarkDownContent$lastJob$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Fragment fragment = this.LLILLJJLI;
        List<PreRenderCard> list = this.LLILLL;
        SearchMarkdownContentCacheVM searchMarkdownContentCacheVM = this.LLILZ;
        try {
            Context context = fragment.getContext();
            Unit unit = null;
            if (context != null) {
                for (PreRenderCard preRenderCard : list) {
                    if (C342080Db4.LIZ[C648920Pco.LIZ(preRenderCard).ordinal()] == 1) {
                        C342090Db5 c342090Db5 = new C342090Db5(context);
                        Map<Object, ? extends Object> map3 = preRenderCard.detail;
                        if (map3 != null) {
                            obj2 = map3.get("top1_multi_summary");
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof Map) && (map2 = (Map) obj2) != null) {
                            obj3 = map2.get("multi_video");
                        } else {
                            obj3 = null;
                        }
                        if ((obj3 instanceof ArrayList) && (arrayList = (ArrayList) obj3) != null) {
                            for (Object obj6 : arrayList) {
                                if (obj6 instanceof Map) {
                                    map = (Map) obj6;
                                } else {
                                    map = null;
                                }
                                if (map == null) {
                                    obj4 = null;
                                } else {
                                    obj4 = map.get("multi_video_summaries");
                                }
                                if ((obj4 instanceof ArrayList) && (arrayList2 = (ArrayList) obj4) != null) {
                                    for (Object obj7 : arrayList2) {
                                        if (obj7 instanceof String) {
                                            searchMarkdownContentCacheVM.yQ2((String) obj7, context, c342090Db5, 1, null);
                                        }
                                    }
                                } else {
                                    if (map == null) {
                                        obj5 = null;
                                    } else {
                                        obj5 = map.get("multi_video_summaries");
                                    }
                                    if ((obj5 instanceof String) && (str = (String) obj5) != null) {
                                        searchMarkdownContentCacheVM.yQ2(str, context, c342090Db5, 1, null);
                                    }
                                }
                            }
                        }
                    }
                }
                unit = Unit.LIZ;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchMarkdownContentCacheVM@d5b0.preRenderMarkDownContent$lastJob$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
