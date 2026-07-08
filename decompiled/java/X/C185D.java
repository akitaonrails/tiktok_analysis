package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightDaInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.UserRightItem;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: renamed from: X.185D, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C185D<T extends ViewGroup> extends C185J<T, C2297981ExA> implements C185Z {
    public final ArrayList<UserRightItem> LIZLLL;
    public AnonymousClass1861 LJ;
    public final Map<String, String> LJFF;
    public boolean LJI;

    @Override // X.C185Z
    public final Map<String, String> LIZIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LJIIJ(linkedHashMap);
        return linkedHashMap;
    }

    @Override // X.C185Z
    public final void LIZJ() {
        if (this.LJI) {
            this.LJI = false;
            LJIIJ(this.LJFF);
        }
    }

    @Override // X.C185Z
    public final Map<String, String> LIZ() {
        return (!LJFF() || this.LIZ.getAlpha() <= 0.0f) ? C2097608Jq.LJ() : this.LJFF;
    }

    public C185D(T t) {
        super(t);
        this.LIZLLL = new ArrayList<>();
        this.LJ = new C19340910lb();
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

    public final void LJIIJ(Map<String, String> map) {
        UserRightItem userRightItem;
        UserRightDaInfo userRightDaInfo;
        Type type;
        ArrayList arrayList = new ArrayList();
        if (LJFF()) {
            int childCount = ((ViewGroup) this.LIZ).getChildCount();
            int i = 0;
            for (int i2 = 0; i2 < childCount && i2 < this.LIZLLL.size(); i2++) {
                if (((ViewGroup) this.LIZ).getChildAt(i2).getWidth() > 0 && (userRightItem = (UserRightItem) C13LP.LJJJLZIJ(i2, this.LIZLLL)) != null && (userRightDaInfo = userRightItem.daInfo) != null) {
                    String str = userRightDaInfo.extra;
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
                            type = new TypeToken<HashMap<String, String>>() { // from class: X.185X
                            }.getType();
                        }
                        Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str, type);
                        if ((objFromJson instanceof HashMap) && objFromJson != null) {
                            arrayList.add(objFromJson);
                        }
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
                i++;
            }
            if (i > 0 && map != null) {
                map.put("rights_content_new", C1741890vQh.LJIIIIZZ(arrayList));
            }
        }
    }
}
