package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ml.api.BertTokenizerService;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchDynamicTabViewModel;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import com.ss.android.ugc.aweme.tars.impl.TarsOutputStruct;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0PG0, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.tabs.core.viewmodel.SearchDynamicTabViewModel$enableSmartDynamicTab$1", f = "SearchDynamicTabViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0PG0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SearchDynamicTabViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PG0(String str, SearchDynamicTabViewModel searchDynamicTabViewModel, InterfaceC1364105Vn<? super C0PG0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = searchDynamicTabViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0PG0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        boolean z;
        List<SearchTabInfo> listXQ2;
        JSONArray jSONArray;
        Double d;
        AbstractC1511510pR7 abstractC1511510pR7LIZ;
        C0Z0Y c0z0yLIZJ;
        C1C7U.LIZ("SearchDynamicTabViewModel@5cfa.enableSmartDynamicTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((Number) C1820907Bf.LIZ.getValue()).intValue() != 0) {
            z = true;
        } else {
            z = false;
        }
        C1512100pS4 c1512100pS4RunSync = null;
        if (z) {
            TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
            if (tarsSharedInterface != null && (c0z0yLIZJ = tarsSharedInterface.LIZJ("tt_benchmark_search_bert", null)) != null) {
                Map<String, ? extends Object> mapLIZJ = C2097908Jt.LIZJ(new Pair("text", this.LL));
                final SearchDynamicTabViewModel searchDynamicTabViewModel = this.LLILLJJLI;
                c0z0yLIZJ.LJIIIIZZ(mapLIZJ, new InterfaceC892690Z0h() { // from class: X.0PFz
                    @Override // X.InterfaceC892690Z0h
                    public final void LIZ(C882890YkJ c882890YkJ) {
                        List<SearchTabInfo> arrayList;
                        C0Z0Y c0z0yLIZJ2;
                        TarsSharedInterface tarsSharedInterface2 = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
                        ArrayList<TarsOutputStruct> arrayList2 = null;
                        if (tarsSharedInterface2 != null && (c0z0yLIZJ2 = tarsSharedInterface2.LIZJ("tt_benchmark_search_bert", null)) != null) {
                            c0z0yLIZJ2.release();
                        }
                        if (c882890YkJ.LJ) {
                            Map<String, Object> mapLJ = c882890YkJ.LJ();
                            SearchDynamicTabViewModel searchDynamicTabViewModel2 = searchDynamicTabViewModel;
                            Object obj2 = mapLJ.get("bytenn_output");
                            if (obj2 instanceof ArrayList) {
                                arrayList2 = (ArrayList) obj2;
                            }
                            searchDynamicTabViewModel2.getClass();
                            if (arrayList2 != null && !arrayList2.isEmpty()) {
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (TarsOutputStruct tarsOutputStruct : arrayList2) {
                                    float[] fArr = tarsOutputStruct.raw;
                                    if (fArr != null && fArr.length != 0) {
                                        linkedHashMap.put(tarsOutputStruct.name, Double.valueOf(fArr[0]));
                                    }
                                }
                                arrayList = searchDynamicTabViewModel2.xQ2(linkedHashMap);
                            } else {
                                searchDynamicTabViewModel2.LLJIJIL.LJFF = C0PG1.SMART_MODEL_RETURN_EMPTY;
                                arrayList = new ArrayList<>();
                            }
                            if (!arrayList.isEmpty()) {
                                searchDynamicTabViewModel.LLJ.postValue(arrayList);
                                if (((Number) C1112304Wr.LIZ.getValue()).intValue() == 1) {
                                    C644560PPy.LIZ.getClass();
                                    C644560PPy.LJJIFFI(arrayList);
                                    searchDynamicTabViewModel.LLIZLLLIL.postValue(arrayList);
                                    searchDynamicTabViewModel.LLILZLL.postValue(Boolean.TRUE);
                                    searchDynamicTabViewModel.LLILZ.postValue(1);
                                    searchDynamicTabViewModel.LL.postValue(C0PG2.SMART_MODEL_RETURN);
                                    return;
                                }
                                return;
                            }
                            C641810PFj c641810PFj = searchDynamicTabViewModel.LLJIJIL;
                            if (c641810PFj.LJFF == C0PG1.INIT) {
                                c641810PFj.LIZIZ = C0PG1.SMART_MODEL_POSTPROCESSING_ERROR.getMsg();
                            }
                            searchDynamicTabViewModel.LL.postValue(C0PG2.ABORT_REQUEST);
                            return;
                        }
                        C641810PFj c641810PFj2 = searchDynamicTabViewModel.LLJIJIL;
                        if (c641810PFj2.LJFF == C0PG1.INIT) {
                            c641810PFj2.LIZIZ = C0PG1.SMART_MODEL_POSTPROCESSING_ERROR.getMsg();
                        }
                        searchDynamicTabViewModel.LL.postValue(C0PG2.ABORT_REQUEST);
                    }
                });
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SearchDynamicTabViewModel@5cfa.enableSmartDynamicTab$1");
            return unit;
        }
        BertTokenizerService.LIZ.getClass();
        List<Integer> listLIZIZ = C882500Yjg.LIZ().LIZIZ(this.LL);
        if (listLIZIZ == null) {
            this.LLILLJJLI.LLJIJIL.LIZIZ = C0PG1.SMART_TOKEN_ERROR.getMsg();
        } else {
            SearchDynamicTabViewModel searchDynamicTabViewModel2 = this.LLILLJJLI;
            C0N33 c0n33 = new C0N33();
            c0n33.LIZIZ().put("input_feature", C882500Yjg.LIZ().LJI(128, listLIZIZ));
            c0n33.LIZIZ().put("attention_mask", C882500Yjg.LIZ().LIZJ(128, listLIZIZ));
            AbstractC1511510pR7 abstractC1511510pR7LIZ2 = C0PGE.LIZ();
            if (abstractC1511510pR7LIZ2 != null) {
                c1512100pS4RunSync = abstractC1511510pR7LIZ2.runSync(c0n33);
            }
            if (((Number) C1108804Vi.LIZ.getValue()).intValue() == 1 && (abstractC1511510pR7LIZ = C0PGE.LIZ()) != null) {
                abstractC1511510pR7LIZ.releaseModel();
            }
            if (c1512100pS4RunSync == null) {
                searchDynamicTabViewModel2.LLJIJIL.LJFF = C0PG1.SMART_MODEL_ERROR;
                listXQ2 = new ArrayList<>();
            } else {
                searchDynamicTabViewModel2.LLJIJIL.LJI = Integer.valueOf(c1512100pS4RunSync.LIZ);
                Map<String, Object> map = c1512100pS4RunSync.LJFF;
                if (map == null) {
                    searchDynamicTabViewModel2.LLJIJIL.LJFF = C0PG1.SMART_MODEL_RETURN_ERROR;
                    listXQ2 = new ArrayList<>();
                } else if (map.isEmpty()) {
                    searchDynamicTabViewModel2.LLJIJIL.LJFF = C0PG1.SMART_MODEL_RETURN_EMPTY;
                    listXQ2 = new ArrayList<>();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Map<String, Object> map2 = c1512100pS4RunSync.LJFF;
                    if (map2 != null) {
                        for (Map.Entry<String, Object> entry : map2.entrySet()) {
                            Object value = entry.getValue();
                            if ((value instanceof JSONArray) && (jSONArray = (JSONArray) value) != null && (!JsonExtKt.toList(jSONArray).isEmpty())) {
                                Object obj2 = jSONArray.get(0);
                                if ((obj2 instanceof Double) && (d = (Double) obj2) != null) {
                                    linkedHashMap.put(entry.getKey(), Double.valueOf(d.doubleValue()));
                                }
                            }
                        }
                    }
                    listXQ2 = searchDynamicTabViewModel2.xQ2(linkedHashMap);
                }
            }
            if (!listXQ2.isEmpty()) {
                searchDynamicTabViewModel2.LLJ.postValue(listXQ2);
                if (((Number) C1112304Wr.LIZ.getValue()).intValue() == 1) {
                    C644560PPy.LIZ.getClass();
                    C644560PPy.LJJIFFI(listXQ2);
                    searchDynamicTabViewModel2.LLIZLLLIL.postValue(listXQ2);
                    searchDynamicTabViewModel2.LLILZLL.postValue(true);
                    searchDynamicTabViewModel2.LLILZ.postValue(C2286608xc.LJ(1));
                    searchDynamicTabViewModel2.LL.postValue(C0PG2.SMART_MODEL_RETURN);
                }
            } else {
                C641810PFj c641810PFj = searchDynamicTabViewModel2.LLJIJIL;
                if (c641810PFj.LJFF == C0PG1.INIT) {
                    c641810PFj.LIZIZ = C0PG1.SMART_MODEL_POSTPROCESSING_ERROR.getMsg();
                }
                searchDynamicTabViewModel2.LL.postValue(C0PG2.ABORT_REQUEST);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchDynamicTabViewModel@5cfa.enableSmartDynamicTab$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
