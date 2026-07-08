package X;

import Y.AComparatorS35S0000000_16;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dQQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049800dQQ {
    public final Context LIZ;
    public JSONObject LIZIZ;
    public C19JH<View> LIZJ;
    public InterfaceC1049730dQJ LIZLLL;
    public C1015580cXE LJ;
    public C1015510cX7 LJFF;
    public InterfaceC1015670cXN LJI;
    public C1049810dQR LJII;
    public C1015650cXL LJIIIIZZ;
    public C1049840dQU LJIIIZ;
    public List<String> LJIIJ;
    public float LJIIJJI;
    public float LJIIL;
    public C1015690cXP LJIILIIL;
    public float LJIILJJIL;

    public C1049800dQQ(Context context) {
        this.LIZ = context;
    }

    public final void LIZJ(C19JH<View> c19jh) {
        C19JI c19jiLJJIIJZLJL;
        List<C19JH<View>> list;
        C1049830dQT c1049830dQT;
        if (c19jh == null) {
            return;
        }
        JSONObject jSONObject = c19jh.LLILLJJLI;
        Iterator<String> itKeys = jSONObject.keys();
        C1049820dQS<ViewGroup> c1049820dQS = c19jh.LLILZIL;
        if (c1049820dQS != null) {
            c19jiLJJIIJZLJL = c1049820dQS.LJJIIJZLJL();
        } else {
            c19jiLJJIIJZLJL = null;
        }
        try {
            if (c19jh.LLIZLLLIL && (c1049830dQT = c19jh.LLILZLL) != null && c1049830dQT.LIZLLL != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("i18n", c19jh.LLILZLL.LIZLLL);
                this.LIZIZ.put("xNode", jSONObject2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLIZ = C1981907pZ.LIZ(jSONObject.optString(next), this.LIZIZ);
            c19jh.LJIJ(next, strLIZ);
            if (c19jiLJJIIJZLJL != null) {
                c19jiLJJIIJZLJL.LIZIZ(this.LIZ, next, strLIZ);
            }
        }
        c19jh.LLLLLIL = this.LIZLLL;
        c19jh.LLLLLILLIL = this.LJFF;
        C1015690cXP c1015690cXP = this.LJIILIIL;
        if (c1015690cXP != null) {
            c19jh.LLLLLJIL = c1015690cXP;
        }
        if ((c19jh instanceof C1049820dQS) && (list = ((C1049820dQS) c19jh).LLLZI) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (arrayList.size() > 0) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    LIZJ((C19JH) it2.next());
                }
            }
        }
        if (c19jiLJJIIJZLJL != null) {
            ViewGroup.LayoutParams layoutParamsLIZ = c19jiLJJIIJZLJL.LIZ();
            if (c19jh.LLILZ != 0) {
                C786410Ut5.W5(c19jh.LLILZ, layoutParamsLIZ);
            }
            c19jh.LLLIIIIL = layoutParamsLIZ;
        }
        c19jh.LJIIZILJ();
    }

    public final C19JH<View> LIZ(C1049830dQT c1049830dQT, C19JH<View> c19jh) {
        boolean z;
        if (c1049830dQT != null && c1049830dQT.LIZJ != null) {
            z = true;
        } else {
            z = false;
        }
        C19JI c19jiLJJIIJZLJL = null;
        if (!z) {
            return null;
        }
        String str = c1049830dQT.LIZIZ;
        Map<String, C1049860dQW> map = C1015590cXF.LIZ;
        C1049860dQW c1049860dQW = (C1049860dQW) ((HashMap) map).get(str);
        C1049860dQW c1049860dQW2 = c1049860dQW;
        if (c1049860dQW == null) {
            if (this.LJIIJ == null) {
                this.LJIIJ = new ArrayList();
            }
            ((ArrayList) this.LJIIJ).add(str);
            str = "View";
            c1049830dQT.LIZIZ = "View";
            C1049860dQW c1049860dQW3 = (C1049860dQW) ((HashMap) map).get("View");
            c1049860dQW2 = c1049860dQW3;
            if (c1049860dQW3 == null) {
                return null;
            }
        }
        C19JH c19jhLIZ = c1049860dQW2.LIZ(this.LIZ);
        if (c19jhLIZ == null) {
            return null;
        }
        JSONObject jSONObject = c1049830dQT.LIZJ;
        c19jhLIZ.LLJ = C1981907pZ.LIZ(c1049830dQT.LIZ, this.LIZIZ);
        c19jhLIZ.LLJI = str;
        c19jhLIZ.LLILLJJLI = jSONObject;
        c19jhLIZ.LLILZLL = c1049830dQT;
        JSONObject jSONObject2 = this.LIZIZ;
        c19jhLIZ.LLILLL = jSONObject2;
        c19jhLIZ.LLLZ = jSONObject2.optBoolean("gesture_through_enable", false);
        C1049810dQR c1049810dQR = this.LJII;
        if (c1049810dQR == null) {
            c19jhLIZ.LLIZLLLIL = true;
        } else {
            c19jhLIZ.LLIZLLLIL = c1049810dQR.LJFF;
        }
        c19jhLIZ.LLIZ = this.LJIIIIZZ;
        c19jhLIZ.LLLLZLLLI = this.LJIIIZ;
        Iterator<String> itKeys = jSONObject.keys();
        if (c19jh instanceof C1049820dQS) {
            C1049820dQS<ViewGroup> c1049820dQS = (C1049820dQS) c19jh;
            c19jiLJJIIJZLJL = c1049820dQS.LJJIIJZLJL();
            c19jhLIZ.LLILZIL = c1049820dQS;
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLIZ = C1981907pZ.LIZ(jSONObject.optString(next), this.LIZIZ);
            c19jhLIZ.LJIJ(next, strLIZ);
            C1015690cXP c1015690cXP = this.LJIILIIL;
            if (c1015690cXP != null && !TextUtils.isEmpty(next) && !TextUtils.isEmpty(strLIZ) && ((TextUtils.equals(next, "src") || TextUtils.equals(next, "backgroundImage")) && strLIZ.startsWith("http"))) {
                c1015690cXP.LIZIZ.incrementAndGet();
            }
            if (c19jiLJJIIJZLJL != null) {
                c19jiLJJIIJZLJL.LIZIZ(this.LIZ, next, strLIZ);
            }
        }
        if (c19jiLJJIIJZLJL != null) {
            ViewGroup.LayoutParams layoutParamsLIZ = c19jiLJJIIJZLJL.LIZ();
            if (c19jhLIZ.LLILZ != 0) {
                C786410Ut5.W5(c19jhLIZ.LLILZ, layoutParamsLIZ);
            }
            c19jhLIZ.LLLIIIIL = layoutParamsLIZ;
        }
        if (c19jhLIZ instanceof C1049820dQS) {
            LinkedList<C1049830dQT> linkedList = c1049830dQT.LJ;
            if (linkedList != null && linkedList.size() > 0) {
                if (TextUtils.equals(c19jhLIZ.LLJI, "Swiper")) {
                    linkedList.size();
                }
                try {
                    Collections.sort(linkedList, new AComparatorS35S0000000_16(3));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                Iterator<C1049830dQT> it2 = linkedList.iterator();
                while (it2.hasNext()) {
                    C19JH<View> c19jhLIZ2 = LIZ(it2.next(), c19jhLIZ);
                    if (c19jhLIZ2 != null && !c19jhLIZ2.LLLLJI) {
                        ((C1049820dQS) c19jhLIZ).LJJIIJ(c19jhLIZ2, c19jhLIZ2.LLLIIIIL);
                    }
                }
            } else {
                if (TextUtils.equals(c19jhLIZ.LLJI, "RecyclerLayout")) {
                    C1049810dQR c1049810dQR2 = this.LJII;
                    if (c1049810dQR2.LIZIZ != null) {
                        ArrayList arrayList = new ArrayList();
                        Iterator<String> itKeys2 = c1049810dQR2.LIZIZ.keys();
                        while (itKeys2.hasNext()) {
                            C1049830dQT c1049830dQTLIZ = c1049810dQR2.LIZ(c1049810dQR2.LIZIZ.optJSONObject(itKeys2.next()));
                            if (c1049830dQTLIZ != null) {
                                arrayList.add(c1049830dQTLIZ);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                C19JH<View> c19jhLIZ3 = LIZ((C1049830dQT) it3.next(), c19jhLIZ);
                                if (c19jhLIZ3 != null && c19jhLIZ3.LLLIIII) {
                                    ((C1049820dQS) c19jhLIZ).LJJIII(c19jhLIZ3);
                                }
                            }
                        }
                    }
                }
                return c19jhLIZ;
            }
        }
        this.LIZJ = c19jhLIZ;
        return c19jhLIZ;
    }

    public final C19JH LIZIZ(JSONObject jSONObject, JSONObject jSONObject2) {
        C1049830dQT c1049830dQT;
        this.LIZIZ = jSONObject2;
        C1015580cXE c1015580cXE = this.LJ;
        if (c1015580cXE != null) {
            c1015580cXE.LJIIJ();
        }
        C1049810dQR c1049810dQR = new C1049810dQR(jSONObject, jSONObject2);
        this.LJII = c1049810dQR;
        float f = this.LJIIJJI;
        float f2 = this.LJIIL;
        c1049810dQR.LJI = f;
        c1049810dQR.LJII = f2;
        this.LJIIIZ = new C1049840dQU();
        InterfaceC1049730dQJ interfaceC1049730dQJ = this.LIZLLL;
        if (interfaceC1049730dQJ instanceof AbstractC1049870dQX) {
            interfaceC1049730dQJ.getClass();
        }
        C1049810dQR c1049810dQR2 = this.LJII;
        if (!c1049810dQR2.LJFF) {
            c1049830dQT = c1049810dQR2.LIZ(c1049810dQR2.LIZ);
        } else {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("flexDirection", "row");
                jSONObject3.put("justifyContent", "flex_start");
                jSONObject3.put("alignItems", "flex_start");
                jSONObject3.put("clickable", false);
                jSONObject3.put("width", "match_parent");
                jSONObject3.put("height", "wrap_content");
                float f3 = c1049810dQR2.LJI;
                if (f3 > 0.0f) {
                    jSONObject3.put("width", f3);
                }
                float f4 = c1049810dQR2.LJII;
                if (f4 > 0.0f) {
                    jSONObject3.put("height", f4);
                }
                String strOptString = c1049810dQR2.LIZLLL.optString("xSize");
                if (!TextUtils.isEmpty(strOptString)) {
                    JSONObject jSONObject4 = new JSONObject(strOptString);
                    if (jSONObject4.optInt("width") > 0) {
                        jSONObject3.put("width", jSONObject4.optInt("width"));
                    }
                    if (jSONObject4.optInt("height") > 0) {
                        jSONObject3.put("height", jSONObject4.optInt("height"));
                    }
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c1049830dQT = new C1049830dQT();
            c1049830dQT.LIZIZ = "View";
            c1049830dQT.LIZ = "virtualNode";
            c1049830dQT.LIZJ = jSONObject3;
            c1049830dQT.LJFF = c1049810dQR2.LIZJ;
            C1049830dQT c1049830dQTLIZ = c1049810dQR2.LIZ(c1049810dQR2.LIZ);
            if (c1049830dQT.LJ == null) {
                c1049830dQT.LJ = new LinkedList<>();
            }
            c1049830dQT.LJ.add(c1049830dQTLIZ);
        }
        this.LIZJ = LIZ(c1049830dQT, null);
        C1015690cXP c1015690cXP = this.LJIILIIL;
        if (c1015690cXP != null) {
            c1015690cXP.LIZ.set((int) (c1015690cXP.LJFF * c1015690cXP.LIZIZ.get()));
            if (this.LJIILIIL.LIZ.get() > 0) {
                this.LJIILIIL.LJII = this.LJI;
            }
            this.LJIILIIL.LJI = this.LJ;
        }
        C1015580cXE c1015580cXE2 = this.LJ;
        if (c1015580cXE2 != null) {
            c1015580cXE2.LJIIJJI();
            C19JH<View> c19jh = this.LIZJ;
            C1015580cXE c1015580cXE3 = this.LJ;
            c19jh.LLLLLLZZ = c1015580cXE3;
            c1015580cXE3.LJIIL();
        }
        LIZJ(this.LIZJ);
        C1015580cXE c1015580cXE4 = this.LJ;
        if (c1015580cXE4 != null) {
            new C1015660cXM();
            c1015580cXE4.LJIILIIL();
        }
        return this.LIZJ;
    }

    public final void LIZLLL(C19JH c19jh, JSONObject jSONObject) {
        C19JI c19jiLJJIIJZLJL;
        List<C19JH<View>> list;
        if (c19jh == null) {
            return;
        }
        this.LIZIZ = jSONObject;
        c19jh.LLILLL = jSONObject;
        c19jh.LLLZ = jSONObject.optBoolean("gesture_through_enable", false);
        c19jh.LLIZ = this.LJIIIIZZ;
        C1049820dQS<ViewGroup> c1049820dQS = c19jh.LLILZIL;
        if (c1049820dQS instanceof C1049820dQS) {
            c19jiLJJIIJZLJL = c1049820dQS.LJJIIJZLJL();
        } else {
            c19jiLJJIIJZLJL = null;
        }
        Iterator<String> itKeys = c19jh.LLILLJJLI.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strLIZ = C1981907pZ.LIZ(c19jh.LLILLJJLI.optString(next), jSONObject);
            c19jh.LJIJ(next, strLIZ);
            if (c19jiLJJIIJZLJL != null) {
                c19jiLJJIIJZLJL.LIZIZ(this.LIZ, next, strLIZ);
            }
        }
        if ((c19jh instanceof C1049820dQS) && (list = ((C1049820dQS) c19jh).LLLZI) != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    LIZLLL((C19JH) it2.next(), jSONObject);
                }
            }
        }
        if (c19jiLJJIIJZLJL != null) {
            ViewGroup.LayoutParams layoutParamsLIZ = c19jiLJJIIJZLJL.LIZ();
            if (c19jh.LLILZ != 0) {
                C786410Ut5.W5(c19jh.LLILZ, layoutParamsLIZ);
            }
            c19jh.LLLIIIIL = layoutParamsLIZ;
        }
    }
}
