package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.LynxView;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.EcomSearchListPlayer;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import com.ss.android.ugc.aweme.search.pages.result.pov.SearchNestedLocatorAbilityImp;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.hub.core.viewmodel.SearchHubVM;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R44, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R44 implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws JSONException {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0R44(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }

    public static final void onLayoutChange$0(C0R44 c0r44, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
        view.removeOnLayoutChangeListener(c0r44);
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((C652750Piz) c0r44.l0).LIZ.findViewHolderForAdapterPosition(((C640750PBh) c0r44.l1).LIZ);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            searchServiceCenter$AutoPlayAbilityLIZ = C641100PCq.LIZ(viewHolderFindViewHolderForAdapterPosition);
        } else {
            searchServiceCenter$AutoPlayAbilityLIZ = null;
        }
        ((C652750Piz) c0r44.l0).LJFF = searchServiceCenter$AutoPlayAbilityLIZ;
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            C640750PBh c640750PBh = ((C640750PBh) c0r44.l1).LIZIZ;
            if (c640750PBh != null) {
                searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh, (Function0) c0r44.l2);
            } else {
                ((Function0) c0r44.l2).invoke();
            }
        }
    }

    public static final void onLayoutChange$1(C0R44 c0r44, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0r44);
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((EcomSearchListPlayer) c0r44.l0).LLILZLL.findViewHolderForAdapterPosition(((C640750PBh) c0r44.l1).LIZ);
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ = null;
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolderFindViewHolderForAdapterPosition);
        }
        ((EcomSearchListPlayer) c0r44.l0).LLIZ = searchServiceCenter$AutoPlayAbilityLIZ;
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            C640750PBh c640750PBh = ((C640750PBh) c0r44.l1).LIZIZ;
            if (c640750PBh != null && c640750PBh != null) {
                searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh, (Function0) c0r44.l2);
            } else {
                ((Function0) c0r44.l2).invoke();
            }
        }
    }

    public static final void onLayoutChange$2(C0R44 c0r44, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws JSONException {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbilityLIZ;
        C1537720q7O c1537720q7O;
        View view2;
        C1537720q7O c1537720q7O2;
        Object objValueOf;
        view.removeOnLayoutChangeListener(c0r44);
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = ((SearchListPlayer) c0r44.l0).LLILZIL.findViewHolderForAdapterPosition(((C640750PBh) c0r44.l1).LIZ);
        C653720PkY c653720PkY = null;
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            searchServiceCenter$AutoPlayAbilityLIZ = C641080PCo.LIZ(viewHolderFindViewHolderForAdapterPosition);
        } else {
            searchServiceCenter$AutoPlayAbilityLIZ = null;
        }
        SearchListPlayer searchListPlayer = (SearchListPlayer) c0r44.l0;
        for (Map.Entry<InterfaceC652740Piy, SearchServiceCenter$AutoPlayAbility> entry : searchListPlayer.LJJIZ(searchListPlayer.vi()).entrySet()) {
            SearchServiceCenter$AutoPlayAbility value = entry.getValue();
            if ((value != null && value.isPlaying()) || ((SearchListPlayer) c0r44.l0).LLILZ) {
                SearchServiceCenter$AutoPlayAbility value2 = entry.getValue();
                if (value2 != null) {
                    value2.LLZZZZ();
                }
            }
        }
        SearchListPlayer searchListPlayer2 = (SearchListPlayer) c0r44.l0;
        if (searchListPlayer2.LLILZ) {
            LynxView lynxViewLJIILJJIL = searchListPlayer2.LL.mContext.LJIILJJIL();
            if (lynxViewLJIILJJIL instanceof C1537720q7O) {
                c1537720q7O = (C1537720q7O) lynxViewLJIILJJIL;
            } else {
                c1537720q7O = null;
            }
            if (c1537720q7O != null) {
                JSONObject jSONObject = new JSONObject();
                InterfaceC652740Piy interfaceC652740Piy = ((SearchListPlayer) c0r44.l0).LLILZLL;
                if (interfaceC652740Piy != null) {
                    objValueOf = Integer.valueOf(interfaceC652740Piy.getPosition());
                } else {
                    objValueOf = "-1";
                }
                jSONObject.put("position", objValueOf);
                c1537720q7O.LIZ("autoplayDeactivate", jSONObject);
            }
            LynxView lynxViewLJIILJJIL2 = ((SearchListPlayer) c0r44.l0).LL.mContext.LJIILJJIL();
            if ((lynxViewLJIILJJIL2 instanceof C1537720q7O) && (c1537720q7O2 = (C1537720q7O) lynxViewLJIILJJIL2) != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("position", ((C640750PBh) c0r44.l1).LIZ);
                c1537720q7O2.LIZ("autoplayActivate", jSONObject2);
            }
            SearchListPlayer searchListPlayer3 = (SearchListPlayer) c0r44.l0;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = searchListPlayer3.LLILZIL.findViewHolderForAdapterPosition(((C640750PBh) c0r44.l1).LIZ);
            if (viewHolderFindViewHolderForAdapterPosition2 != null && (view2 = viewHolderFindViewHolderForAdapterPosition2.itemView) != null) {
                c653720PkY = new C653720PkY(view2, new AwS554S0100000_10((C640750PBh) c0r44.l1, 327));
            }
            searchListPlayer3.LLILZLL = c653720PkY;
        }
        ((SearchListPlayer) c0r44.l0).LLIZ = searchServiceCenter$AutoPlayAbilityLIZ;
        if (searchServiceCenter$AutoPlayAbilityLIZ != null) {
            C640750PBh c640750PBh = ((C640750PBh) c0r44.l1).LIZIZ;
            if (c640750PBh != null && c640750PBh != null) {
                searchServiceCenter$AutoPlayAbilityLIZ.Ot0(c640750PBh, (Function0) c0r44.l2);
            } else {
                ((Function0) c0r44.l2).invoke();
                searchServiceCenter$AutoPlayAbilityLIZ.J0();
            }
            ((SearchListPlayer) c0r44.l0).LLJ = false;
        }
    }

    public static final void onLayoutChange$3(C0R44 c0r44, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility;
        view.removeOnLayoutChangeListener(c0r44);
        for (Object obj : ((SearchNestedLocatorAbilityImp) c0r44.l0).LIZ().keySet()) {
            if (((InterfaceC652740Piy) obj).getPosition() == ((C640750PBh) c0r44.l1).LIZ) {
                if (obj != null && (searchServiceCenter$AutoPlayAbility = ((SearchNestedLocatorAbilityImp) c0r44.l0).LIZ().get(obj)) != null) {
                    C640750PBh c640750PBh = ((C640750PBh) c0r44.l1).LIZIZ;
                    if (c640750PBh != null) {
                        searchServiceCenter$AutoPlayAbility.Ot0(c640750PBh, (Function0) c0r44.l2);
                        return;
                    } else {
                        ((Function0) c0r44.l2).invoke();
                        return;
                    }
                }
                return;
            }
        }
    }

    public static final void onLayoutChange$4(C0R44 c0r44, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i9;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        view.removeOnLayoutChangeListener(c0r44);
        ViewGroup.LayoutParams layoutParams = ((ViewGroup) c0r44.l0).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i10 = 0;
        if (marginLayoutParams != null) {
            i9 = marginLayoutParams.topMargin;
        } else {
            i9 = 0;
        }
        ((RecyclerView) c0r44.l1).scrollBy(0, i9 + ((ViewGroup) c0r44.l0).getHeight());
        ViewGroup viewGroup = (ViewGroup) c0r44.l0;
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams2;
            marginLayoutParams3.topMargin = -((ViewGroup) c0r44.l0).getHeight();
            C786410Ut5.W5(viewGroup, marginLayoutParams3);
            SearchHubVM searchHubVM = (SearchHubVM) c0r44.l2;
            int height = ((ViewGroup) c0r44.l0).getHeight();
            ViewGroup.LayoutParams layoutParams3 = ((ViewGroup) c0r44.l0).getLayoutParams();
            if ((layoutParams3 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) != null) {
                i10 = marginLayoutParams2.topMargin;
            }
            searchHubVM.wQ2(height + i10);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
