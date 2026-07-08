package Y;

import X.AbstractC212214182y;
import X.AnonymousClass1830;
import X.AnonymousClass1833;
import X.C1507790pL7;
import X.C183F;
import X.C183H;
import X.C212203182n;
import X.C212206182q;
import X.C212207182r;
import X.C212208182s;
import X.C2188811AlT;
import X.C2341109Fh;
import android.animation.Animator;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public class ACListenerS45S0210000_32 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws JSONException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS45S0210000_32 aCListenerS45S0210000_32, View view) throws JSONException {
        if (view.getId() == R.id.gl8) {
            C212208182s c212208182s = ((C212203182n) aCListenerS45S0210000_32.l0).LLJIJIL;
            if (c212208182s != null) {
                AnonymousClass1830 anonymousClass1830 = (AnonymousClass1830) aCListenerS45S0210000_32.l1;
                Map<String, String> mapH0 = null;
                if (anonymousClass1830 != null) {
                    mapH0 = anonymousClass1830.h0(null);
                }
                c212208182s.LIZLLL(mapH0);
            }
            ((C212203182n) aCListenerS45S0210000_32.l0).LJIIJ((AnonymousClass1830) aCListenerS45S0210000_32.l1, aCListenerS45S0210000_32.z2);
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("no need to handle this id");
    }

    public static final void onClick$1(ACListenerS45S0210000_32 aCListenerS45S0210000_32, View view) throws JSONException {
        int id = view.getId();
        if (id != R.id.gl8 && id != R.id.hvm) {
            if (id == R.id.hvj) {
                ((C212203182n) aCListenerS45S0210000_32.l0).LJIIJ((AnonymousClass1830) aCListenerS45S0210000_32.l1, aCListenerS45S0210000_32.z2);
                return;
            } else {
                C2341109Fh.LIZ.getClass();
                C2341109Fh.LJII("no need to handle this id");
                return;
            }
        }
        C212208182s c212208182s = ((C212203182n) aCListenerS45S0210000_32.l0).LLJIJIL;
        if (c212208182s != null) {
            AnonymousClass1830 anonymousClass1830 = (AnonymousClass1830) aCListenerS45S0210000_32.l1;
            Map<String, String> mapH0 = null;
            if (anonymousClass1830 != null) {
                mapH0 = anonymousClass1830.h0(null);
            }
            c212208182s.LIZLLL(mapH0);
        }
        ((C212203182n) aCListenerS45S0210000_32.l0).LJIIJ((AnonymousClass1830) aCListenerS45S0210000_32.l1, aCListenerS45S0210000_32.z2);
    }

    public static final void onClick$2(ACListenerS45S0210000_32 aCListenerS45S0210000_32, View view) throws JSONException {
        C212207182r c212207182r;
        Map<String, String> contentShowParams;
        boolean zLIZ;
        String str;
        Set<Map.Entry<String, String>> setEntrySet;
        if (view.getId() == R.id.gl8) {
            AnonymousClass1833 anonymousClass1833 = null;
            if (!((C212206182q) aCListenerS45S0210000_32.l0).LJIILJJIL() && (c212207182r = ((C212206182q) aCListenerS45S0210000_32.l0).LLJJI) != null) {
                AbstractC212214182y abstractC212214182y = (AbstractC212214182y) aCListenerS45S0210000_32.l1;
                if (abstractC212214182y != null) {
                    contentShowParams = abstractC212214182y.getContentShowParams();
                } else {
                    contentShowParams = null;
                }
                AbstractC212214182y abstractC212214182y2 = (AbstractC212214182y) aCListenerS45S0210000_32.l1;
                if (abstractC212214182y2 != null) {
                    zLIZ = C183H.LIZ(abstractC212214182y2);
                } else {
                    zLIZ = false;
                }
                JSONObject jSONObjectLIZJ = c212207182r.LIZJ();
                if (contentShowParams != null && (setEntrySet = contentShowParams.entrySet()) != null) {
                    Iterator<T> it2 = setEntrySet.iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        jSONObjectLIZJ.put((String) entry.getKey(), entry.getValue());
                    }
                }
                C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                if (zLIZ) {
                    str = "livesdk_tiktokec_livecard_close";
                } else {
                    str = "livesdk_tiktokec_card_close";
                }
                c1507790pL7.getClass();
                C1507790pL7.LIZLLL(str, jSONObjectLIZJ);
                jSONObjectLIZJ.put("stay_time", System.currentTimeMillis() - c212207182r.LJIIIZ);
                C1507790pL7.LIZLLL("livesdk_tiktokec_product_entrance_stay_time", jSONObjectLIZJ);
                if (contentShowParams != null && contentShowParams.get("task_id") != null) {
                    jSONObjectLIZJ.put("click_for", "close");
                    jSONObjectLIZJ.put("page_name", "live_preview_page");
                    jSONObjectLIZJ.put("page_type", "module");
                    jSONObjectLIZJ.put("module_name", "mission_card");
                    C1507790pL7.LIZLLL("button_click", jSONObjectLIZJ);
                    C1507790pL7.LIZLLL("tiktokec_live_preview_seller_mission_card_click", jSONObjectLIZJ);
                }
                c212207182r.LJI("user_close", contentShowParams);
            }
            C212206182q c212206182q = (C212206182q) aCListenerS45S0210000_32.l0;
            AbstractC212214182y abstractC212214182y3 = (AbstractC212214182y) aCListenerS45S0210000_32.l1;
            boolean z = aCListenerS45S0210000_32.z2;
            c212206182q.getClass();
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start dismiss showState = ");
            sbLIZ.append(c212206182q.LLIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            if (abstractC212214182y3 != null) {
                int i = c212206182q.LLIZ;
                if (i != 2 && i != 3) {
                    C2341109Fh.LJII("no need dismiss");
                    return;
                }
                Animator animator = c212206182q.LLILZLL;
                if (animator != null) {
                    animator.cancel();
                }
                AnonymousClass1833 anonymousClass18332 = c212206182q.LLILLL;
                if (anonymousClass18332 != null) {
                    anonymousClass1833 = anonymousClass18332;
                }
                Animator animatorLIZ = anonymousClass1833.LIZ(abstractC212214182y3);
                if (animatorLIZ == null) {
                    return;
                }
                c212206182q.LLILZLL = animatorLIZ;
                animatorLIZ.addListener(new AAListenerS70S0110000_32(c212206182q, z, 1));
                animatorLIZ.start();
                C183F c183f = c212206182q.LLIZLLLIL;
                if (c183f == null) {
                    return;
                }
                c183f.LIZIZ();
                return;
            }
            return;
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJII("no need to handle this id");
    }

    public ACListenerS45S0210000_32(Object obj, Object obj2, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.z2 = z;
    }
}
