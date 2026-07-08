package Y;

import X.C0P73;
import X.C0P7K;
import X.C0P7X;
import X.C0P9Q;
import X.C0PIV;
import X.C0R42;
import X.C0R44;
import X.C1202420hOa;
import X.C1440005kM;
import X.C1546210qL5;
import X.C2188811AlT;
import X.C588260N5k;
import X.C588600N6s;
import X.C639430P6f;
import X.C639440P6g;
import X.C641860PFo;
import X.C786410Ut5;
import X.C814420VxA;
import X.C844470XAv;
import android.app.Application;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubHeaderVM;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import com.ss.android.ugc.aweme.search.player.core.viewmodel.MusicPlayHelper;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS25S0001000_10;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class AObserverS77S0400000_10 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS77S0400000_10 aObserverS77S0400000_10, Object obj) {
        Object obj2;
        String str;
        int iIntValue;
        Integer num;
        Map map = (Map) obj;
        if (map != null) {
            obj2 = map.get("keyword");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && (str = (String) obj2) != null) {
            RecyclerView recyclerView = (RecyclerView) aObserverS77S0400000_10.l0;
            ViewGroup viewGroup = (ViewGroup) aObserverS77S0400000_10.l1;
            SearchHubVM searchHubVM = (SearchHubVM) aObserverS77S0400000_10.l2;
            SearchHubHeaderVM searchHubHeaderVM = (SearchHubHeaderVM) aObserverS77S0400000_10.l3;
            C641860PFo c641860PFo = C641860PFo.LIZ;
            Map<String, String> map2 = searchHubVM.LL;
            c641860PFo.getClass();
            C0P7K.LIZ(recyclerView);
            if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                C641860PFo.LIZJ(viewGroup);
            } else {
                recyclerView.addOnLayoutChangeListener(new C0R42(viewGroup, 5));
            }
            C639430P6f c639430P6fLIZ = C639440P6g.LIZ(C1202420hOa.LIZ());
            SearchResultParam searchResultParam = new SearchResultParam();
            searchResultParam.setKeyword(str);
            searchResultParam.setEnterMethod("entity_switch");
            searchResultParam.setEntityTabIndex(-1);
            searchResultParam.setShouldRecordInHistory(1);
            C844470XAv.LIZ.getClass();
            String str2 = C844470XAv.LJ;
            if (str2 == null) {
                str2 = null;
            }
            searchResultParam.setAppName(str2);
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            double d = c639430P6fLIZ.LIZ;
            Application applicationLIZ = C1202420hOa.LIZ();
            c1546210qL5.getClass();
            searchResultParam.setScreenWidth(C1546210qL5.LJIIL(d, applicationLIZ));
            searchResultParam.setScreenHeight(C1546210qL5.LJIIL(c639430P6fLIZ.LIZIZ, C1202420hOa.LIZ()));
            C0P7X.LIZ(new C0P9Q(map2), searchResultParam);
            C1440005kM.LIZ(new C588260N5k(searchResultParam));
            Object obj3 = map.get("entity_index");
            if ((obj3 instanceof Integer) && (num = (Integer) obj3) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            searchHubHeaderVM.getClass();
            searchHubHeaderVM.setStateImmediate(new AwS25S0001000_10(iIntValue, 7));
        }
    }

    public static final void onChanged$1(AObserverS77S0400000_10 aObserverS77S0400000_10, Object obj) {
        int iOptInt;
        int i;
        int i2;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i4;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        ViewGroup.MarginLayoutParams marginLayoutParams4;
        ViewGroup.MarginLayoutParams marginLayoutParams5;
        ViewGroup.MarginLayoutParams marginLayoutParams6;
        ViewGroup.MarginLayoutParams marginLayoutParams7;
        JSONObject jSONObjectLIZIZ;
        JSONObject jSONObjectOptJSONObject;
        Boolean bool = (Boolean) obj;
        int i5 = 0;
        if (((ViewGroup) aObserverS77S0400000_10.l0).getVisibility() == 0) {
            C641860PFo c641860PFo = C641860PFo.LIZ;
            String rawData = ((DynamicPatch) aObserverS77S0400000_10.l1).getRawData();
            c641860PFo.getClass();
            try {
                jSONObjectLIZIZ = C0PIV.LIZIZ(rawData);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (jSONObjectLIZIZ != null && (jSONObjectOptJSONObject = jSONObjectLIZIZ.optJSONObject("label_info")) != null) {
                iOptInt = jSONObjectOptJSONObject.optInt("top_height");
            } else {
                iOptInt = 0;
            }
            final int iLIZIZ = C814420VxA.LIZIZ(TypedValue.applyDimension(1, iOptInt, Resources.getSystem().getDisplayMetrics()));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("return from detail page, marginTop: [");
            ViewGroup.LayoutParams layoutParams = ((ViewGroup) aObserverS77S0400000_10.l0).getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams7 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams7.topMargin;
            } else {
                i = 0;
            }
            sbLIZ.append(i);
            sbLIZ.append("] height: [");
            sbLIZ.append(((ViewGroup) aObserverS77S0400000_10.l0).getHeight());
            sbLIZ.append("] tab: ");
            sbLIZ.append(iLIZIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            ViewGroup.LayoutParams layoutParams2 = ((ViewGroup) aObserverS77S0400000_10.l0).getLayoutParams();
            if ((!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams6 = (ViewGroup.MarginLayoutParams) layoutParams2) == null || marginLayoutParams6.topMargin == 0) && !bool.booleanValue()) {
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = ((ViewGroup) aObserverS77S0400000_10.l0).getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams5 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i2 = marginLayoutParams5.topMargin;
            } else {
                i2 = 0;
            }
            if (i2 + ((ViewGroup) aObserverS77S0400000_10.l0).getHeight() >= iLIZIZ) {
                final RecyclerView recyclerView = (RecyclerView) aObserverS77S0400000_10.l2;
                final ViewGroup viewGroup = (ViewGroup) aObserverS77S0400000_10.l0;
                final SearchHubVM searchHubVM = (SearchHubVM) aObserverS77S0400000_10.l3;
                if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                    int height = viewGroup.getHeight() - iLIZIZ;
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                        i4 = marginLayoutParams4.topMargin;
                    } else {
                        i4 = 0;
                    }
                    recyclerView.scrollBy(0, i4 + height);
                    ViewGroup.LayoutParams layoutParams5 = viewGroup.getLayoutParams();
                    if (layoutParams5 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams8 = (ViewGroup.MarginLayoutParams) layoutParams5;
                        marginLayoutParams8.topMargin = -height;
                        C786410Ut5.W5(viewGroup, marginLayoutParams8);
                        int height2 = viewGroup.getHeight();
                        ViewGroup.LayoutParams layoutParams6 = viewGroup.getLayoutParams();
                        if ((layoutParams6 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams6) != null) {
                            i5 = marginLayoutParams3.topMargin;
                        }
                        searchHubVM.wQ2(height2 + i5);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                recyclerView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: X.0PFr
                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13) {
                        ViewGroup.MarginLayoutParams marginLayoutParams9;
                        int i14;
                        ViewGroup.MarginLayoutParams marginLayoutParams10;
                        view.removeOnLayoutChangeListener(this);
                        int height3 = viewGroup.getHeight() - iLIZIZ;
                        ViewGroup.LayoutParams layoutParams7 = viewGroup.getLayoutParams();
                        if (layoutParams7 instanceof ViewGroup.MarginLayoutParams) {
                            marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams7;
                        } else {
                            marginLayoutParams9 = null;
                        }
                        int i15 = 0;
                        if (marginLayoutParams9 != null) {
                            i14 = marginLayoutParams9.topMargin;
                        } else {
                            i14 = 0;
                        }
                        recyclerView.scrollBy(0, i14 + height3);
                        ViewGroup viewGroup2 = viewGroup;
                        ViewGroup.LayoutParams layoutParams8 = viewGroup2.getLayoutParams();
                        if (layoutParams8 != null) {
                            ViewGroup.MarginLayoutParams marginLayoutParams11 = (ViewGroup.MarginLayoutParams) layoutParams8;
                            marginLayoutParams11.topMargin = -height3;
                            C786410Ut5.W5(viewGroup2, marginLayoutParams11);
                            SearchHubVM searchHubVM2 = searchHubVM;
                            int height4 = viewGroup.getHeight();
                            ViewGroup.LayoutParams layoutParams9 = viewGroup.getLayoutParams();
                            if ((layoutParams9 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams10 = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                                i15 = marginLayoutParams10.topMargin;
                            }
                            searchHubVM2.wQ2(height4 + i15);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    }
                });
                return;
            }
            RecyclerView recyclerView2 = (RecyclerView) aObserverS77S0400000_10.l2;
            ViewGroup viewGroup2 = (ViewGroup) aObserverS77S0400000_10.l0;
            SearchHubVM searchHubVM2 = (SearchHubVM) aObserverS77S0400000_10.l3;
            if (recyclerView2.isLaidOut() && !recyclerView2.isLayoutRequested()) {
                ViewGroup.LayoutParams layoutParams7 = viewGroup2.getLayoutParams();
                if ((layoutParams7 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams7) != null) {
                    i3 = marginLayoutParams2.topMargin;
                } else {
                    i3 = 0;
                }
                recyclerView2.scrollBy(0, i3 + viewGroup2.getHeight());
                ViewGroup.LayoutParams layoutParams8 = viewGroup2.getLayoutParams();
                if (layoutParams8 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams9 = (ViewGroup.MarginLayoutParams) layoutParams8;
                    marginLayoutParams9.topMargin = -viewGroup2.getHeight();
                    C786410Ut5.W5(viewGroup2, marginLayoutParams9);
                    int height3 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams9 = viewGroup2.getLayoutParams();
                    if ((layoutParams9 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams9) != null) {
                        i5 = marginLayoutParams.topMargin;
                    }
                    searchHubVM2.wQ2(height3 + i5);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            recyclerView2.addOnLayoutChangeListener(new C0R44(viewGroup2, recyclerView2, searchHubVM2, 4));
        }
    }

    public static final void onChanged$2(AObserverS77S0400000_10 aObserverS77S0400000_10, Object obj) {
        if (((Number) obj).intValue() == 3) {
            ((MutableLiveData) aObserverS77S0400000_10.l0).setValue(1);
            C0P73 c0p73 = (C0P73) aObserverS77S0400000_10.l1;
            c0p73.LLILLJJLI = true;
            C588600N6s c588600N6s = c0p73.LLILLL;
            if (c588600N6s != null) {
                c0p73.LL.z1(c588600N6s);
            }
            MusicPlayHelper musicPlayHelper = (MusicPlayHelper) aObserverS77S0400000_10.l2;
            if (musicPlayHelper != null && musicPlayHelper.wQ2()) {
                return;
            }
            ((Function0) aObserverS77S0400000_10.l3).invoke();
            return;
        }
        ((MutableLiveData) aObserverS77S0400000_10.l0).setValue(0);
    }

    public AObserverS77S0400000_10(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
    }
}
