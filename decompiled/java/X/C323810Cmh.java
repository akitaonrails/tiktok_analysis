package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightApi;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.anchor.EditElementResult;
import tikcast.api.anchor.GetFragmentEditElementsReq;
import tikcast.api.anchor.GetFragmentEditElementsResp;
import tikcast.api.anchor.RecommendMusicList;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Cmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$getLiveHighlightsMusics$2$1", f = "LiveHighlightViewModel.kt", l = {252}, m = "invokeSuspend")
public final class C323810Cmh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ Map<String, List<MusicSong>> LLILZ;
    public final /* synthetic */ LiveHighlightViewModel LLILZIL;
    public final /* synthetic */ List<Long> LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323810Cmh(Map<String, List<MusicSong>> map, LiveHighlightViewModel liveHighlightViewModel, List<Long> list, int i, InterfaceC1364105Vn<? super C323810Cmh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = map;
        this.LLILZIL = liveHighlightViewModel;
        this.LLILZLL = list;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323810Cmh c323810Cmh = new C323810Cmh(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c323810Cmh.LLILLL = obj;
        return c323810Cmh;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [T] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.HashMap, java.util.LinkedHashMap] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU c259800zU;
        C259800zU c259800zU2;
        Object c098200Yq;
        ?? LJ;
        Map<String, EditElementResult> map;
        List list;
        ?? r0;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                c259800zU2 = (C259800zU) this.LLILLL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = new C259800zU();
            LiveHighlightViewModel liveHighlightViewModel = this.LLILZIL;
            List<Long> list2 = this.LLILZLL;
            try {
                C323990Cmz c323990Cmz = liveHighlightViewModel.LL.LLILLJJLI;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                Iterator<Long> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(String.valueOf(it2.next().longValue()));
                }
                List listSingletonList = Collections.singletonList(C2286608xc.LJ(1));
                this.LLILLL = c259800zU;
                this.LL = c259800zU;
                this.LLILLJJLI = 1;
                LiveHighlightApi liveHighlightApiLIZ = c323990Cmz.LL.LIZ();
                GetFragmentEditElementsReq getFragmentEditElementsReq = new GetFragmentEditElementsReq();
                getFragmentEditElementsReq.fragmentIds.addAll(arrayList);
                getFragmentEditElementsReq.types.addAll(listSingletonList);
                obj = liveHighlightApiLIZ.getLiveHighlightEditElements(getFragmentEditElementsReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2$1");
                    return objLJFF;
                }
                c259800zU2 = c259800zU;
            } catch (Throwable th2) {
                th = th2;
                c259800zU2 = c259800zU;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        C470590Icr c470590Icr = (C470590Icr) obj;
        if (c470590Icr != null) {
            r0 = (GetFragmentEditElementsResp.ResponseData) c470590Icr.data;
        } else {
            r0 = 0;
        }
        c259800zU.element = r0;
        c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        List<Long> list3 = this.LLILZLL;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            C20441214yg.LJ("LiveHighlightViewModel", "queryLiveHighlightEditElements failed... fragmentIds: " + list3);
        }
        Map<String, List<MusicSong>> map2 = this.LLILZ;
        GetFragmentEditElementsResp.ResponseData responseData = (GetFragmentEditElementsResp.ResponseData) c259800zU2.element;
        if (responseData != null && (map = responseData.editElementResultMap) != null) {
            LJ = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
            Iterator it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                Object key = entry.getKey();
                RecommendMusicList recommendMusicList = ((EditElementResult) entry.getValue()).musicList;
                if (recommendMusicList == null || (list = recommendMusicList.recommendMusic) == null) {
                    list = C13BV.INSTANCE;
                }
                LJ.put(key, list);
            }
        } else {
            LJ = C2097608Jq.LJ();
        }
        map2.putAll((Map<? extends String, ? extends List<MusicSong>>) LJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.getLiveHighlightsMusics$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
