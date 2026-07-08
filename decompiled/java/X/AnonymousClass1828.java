package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.DaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.SellingItem;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.1828, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AnonymousClass1828<T extends ViewGroup> extends C185J<T, C0HAQ> implements C185Z {
    public static final Set<Integer> LJII = Collections.singleton(0);
    public final ArrayList<SellingItem> LIZLLL;
    public C0HAI LJ;
    public final Map<String, String> LJFF;
    public boolean LJI;

    @Override // X.C185Z
    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIJJI(linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.C185Z
    public final void LIZJ() {
        if (this.LJI) {
            this.LJI = false;
            LJIIJJI(this.LJFF);
        }
    }

    @Override // X.C185Z
    public final Map<String, String> LIZ() {
        return (!LJFF() || this.LIZ.getAlpha() <= 0.0f) ? C2097608Jq.LJ() : this.LJFF;
    }

    public AnonymousClass1828(T t) {
        super(t);
        this.LIZLLL = new ArrayList<>();
        this.LJ = new C0GSB();
        this.LJFF = new LinkedHashMap();
        this.LJI = true;
    }

    @Override // X.C185J
    public final boolean LJIIIZ(boolean z) {
        boolean zLJIIIZ = super.LJIIIZ(z);
        if (zLJIIIZ) {
            this.LJI = true;
        }
        return zLJIIIZ;
    }

    public final void LJIIJ(View view) {
        ((ViewGroup) this.LIZ).addView(view, new ViewGroup.MarginLayoutParams(-2, this.LJ.getItemHeight()));
    }

    public final void LJIIJJI(Map<String, String> map) {
        int i;
        String str;
        DaInfo daInfo;
        Type type;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        if (LJFF()) {
            int childCount = ((ViewGroup) this.LIZ).getChildCount();
            i = 0;
            for (int i2 = 0; i2 < childCount && i2 < this.LIZLLL.size(); i2++) {
                if (((ViewGroup) this.LIZ).getChildAt(i2).getWidth() > 0) {
                    SellingItem sellingItem = (SellingItem) C13LP.LJJJLZIJ(i2, this.LIZLLL);
                    if (sellingItem != null && (daInfo = sellingItem.daInfo) != null) {
                        String str2 = daInfo.extra;
                        if (str2 != null) {
                            try {
                                Gson gsonLJFF = C1741890vQh.LJFF();
                                C1120604Zw.LIZ.getClass();
                                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                                    C13JX c13jx = KTypeProjection.LIZJ;
                                    C13JW c13jwLJII = C13LE.LJII(String.class);
                                    c13jx.getClass();
                                    type = C2371409Qy.LIZJ(C13LE.LJIIIZ(HashMap.class, C13JX.LIZ(c13jwLJII), C13JX.LIZ(C13LE.LJII(String.class))));
                                } else {
                                    type = new TypeToken<HashMap<String, String>>() { // from class: X.1829
                                    }.getType();
                                }
                                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                                if (!(objFromJson instanceof HashMap)) {
                                    objFromJson = null;
                                }
                                HashMap map3 = (HashMap) objFromJson;
                                if (map3 != null) {
                                    for (Map.Entry entry : map3.entrySet()) {
                                        map2.put(entry.getKey(), entry.getValue());
                                    }
                                }
                            } catch (s e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                        String str3 = daInfo.name;
                        if (str3 != null) {
                            arrayList.add(str3);
                        }
                    }
                    i++;
                }
            }
        } else {
            i = 0;
        }
        if (!map2.containsKey("sold_amt_type")) {
            map2.put("sold_amt_type", "no_volume");
        }
        if (map != null) {
            map.put("selling_point_da_info", C1741890vQh.LJIIIIZZ(map2));
            map.put("sellingpoint_cnt", String.valueOf(i));
        }
        if (arrayList.size() >= 1) {
            if (map != null) {
                map.put("pos_selling_point", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            } else {
                return;
            }
        } else if (map == null) {
            return;
        }
        if (arrayList.isEmpty()) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        map.put("has_sellingpoint", str);
    }
}
