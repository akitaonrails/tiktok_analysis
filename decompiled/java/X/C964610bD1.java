package X;

import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCohostQuickCohostPreferencePanelLynxUrlSetting;
import com.bytedance.hybrid.spark.SparkContext;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0bD1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964610bD1 extends AbstractC970950bNF {
    public final int LLIZ;
    public final List<Integer> LLIZLLLIL;
    public final EnumC964540bCu LLJ;
    public final Function1<List<Integer>, Unit> LLJI;
    public final InterfaceC1631620sYq<Integer, List<Integer>, EnumC964540bCu, Unit> LLJIJIL;
    public final Function0<Unit> LLJILJIL;
    public long LLJILJILJ;
    public final String LLJILLL = LiveCohostQuickCohostPreferencePanelLynxUrlSetting.INSTANCE.getValue();

    @Override // X.AbstractC970950bNF
    public final List<String> LJLLLL() {
        return C1697810uHb.LJIIJJI("quickCoHostPreferencesChanged", "ConfirmPreferencesButtonClicked");
    }

    @Override // X.AbstractC970950bNF
    public final String LJLLLLLL() {
        return this.LLJILLL;
    }

    public static List LJZL(InterfaceC1107590evd interfaceC1107590evd) {
        InterfaceC1107590evd interfaceC1107590evdLJ;
        if (interfaceC1107590evd != null && (interfaceC1107590evdLJ = C1871910yoP.LJ(interfaceC1107590evd, "preferences")) != null) {
            InterfaceC1871920yoQ interfaceC1871920yoQLIZ = C1871910yoP.LIZ(interfaceC1107590evdLJ, "selected_tag_ids", null);
            if (interfaceC1871920yoQLIZ != null) {
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                int size = interfaceC1871920yoQLIZ.size();
                for (int i = 0; i < size; i++) {
                    if (!interfaceC1871920yoQLIZ.isNull(i)) {
                        c13dvLIZIZ.add(Integer.valueOf(interfaceC1871920yoQLIZ.getInt(i)));
                    }
                }
                return C1697820uHc.LIZ(c13dvLIZIZ);
            }
            if (interfaceC1107590evdLJ.hasKey("selected_tag_ids") && !interfaceC1107590evdLJ.isNull("selected_tag_ids")) {
                int i2 = C971770bOZ.LIZ[interfaceC1107590evdLJ.getType("selected_tag_ids").ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        return C13BV.INSTANCE;
                    }
                    return Collections.singletonList(Integer.valueOf((int) interfaceC1107590evdLJ.getDouble("selected_tag_ids")));
                }
                return Collections.singletonList(Integer.valueOf(interfaceC1107590evdLJ.getInt("selected_tag_ids")));
            }
            return C13BV.INSTANCE;
        }
        return C13BV.INSTANCE;
    }

    @Override // X.AbstractC970950bNF, X.AbstractC1537870q7d
    public final void LJJZ(InterfaceC1541990qEH interfaceC1541990qEH) throws JSONException {
        super.LJJZ(interfaceC1541990qEH);
        if (this.LLJILJILJ > 0) {
            String str = this.LLJILLL;
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILJILJ;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str);
            jSONObject.put("duration_ms", jCurrentTimeMillis);
            C1CC2.LJIIIIZZ("livesdk_match_preference_lynx_render_success", 0, jSONObject);
            this.LLJILJILJ = 0L;
        }
        this.LLJILJIL.invoke();
    }

    @Override // X.AbstractC970950bNF
    public final void LJLZ(SparkContext sparkContext) throws JSONException {
        this.LLJILJILJ = System.currentTimeMillis();
        C520710KbV.LIZIZ(sparkContext);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("confirm_action", this.LLIZ);
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it2 = this.LLIZLLLIL.iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next().intValue());
        }
        jSONObject.put("preferences", jSONObject2.put("selected_tag_ids", jSONArray));
        jSONObject.put("entrance", this.LLJ.getWireValue());
        this.LLILLJJLI.put("initialData", jSONObject);
        this.LLILLJJLI.put("initial_data", jSONObject);
        JSONObject jSONObjectPut = new JSONObject().put("initial_data", jSONObject);
        sparkContext.LJJLIIIJILLIZJL(this.LLILLJJLI);
        sparkContext.initData = C786410Ut5.J3(jSONObjectPut);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onInit url=");
        sbLIZ.append(this.LLJILLL);
        sbLIZ.append(" payload=");
        sbLIZ.append(jSONObject);
        sbLIZ.append(" wrappedInitData=");
        sbLIZ.append(jSONObjectPut);
        C20441214yg.LJIIIZ("PreferencePanelLynxPage", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJZI(boolean z) {
        AbstractC970950bNF.LJZ(this, "preference_panel_dismiss", z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dismiss isSticky=");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("PreferencePanelLynxPage", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // X.AbstractC970950bNF, X.InterfaceC1141530foN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mh2(X.C262100zr r10) {
        /*
            r9 = this;
            java.lang.String r1 = r10.LIZ
            java.lang.String r0 = "quickCoHostPreferencesChanged"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            java.lang.String r5 = "PreferencePanelLynxPage"
            if (r0 == 0) goto L2b
            X.0evd r0 = r10.LIZIZ
            java.util.List r2 = LJZL(r0)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FE→Native preferencesChanged ids="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r5, r0)
            kotlin.jvm.functions.Function1<java.util.List<java.lang.Integer>, kotlin.Unit> r0 = r9.LLJI
            r0.invoke(r2)
        L2a:
            return
        L2b:
            java.lang.String r0 = "ConfirmPreferencesButtonClicked"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2a
            X.0evd r2 = r10.LIZIZ
            if (r2 == 0) goto L7c
            X.0bCt r0 = X.EnumC964530bCt.APPLY_PREFERENCE_ONLY
            int r1 = r0.getRawValue()
            java.lang.String r0 = "confirm_action"
            int r4 = X.C1871910yoP.LIZLLL(r2, r0, r1)
        L43:
            X.0evd r0 = r10.LIZIZ
            java.util.List r3 = LJZL(r0)
            X.0evd r2 = r10.LIZIZ
            if (r2 == 0) goto L83
            java.lang.String r1 = ""
            java.lang.String r0 = "entrance"
            java.lang.String r8 = X.C1871910yoP.LJFF(r2, r0, r1)
            if (r8 == 0) goto L83
            int r0 = r8.length()
            r7 = 0
            if (r0 <= 0) goto L83
            r0 = 1
            if (r0 == 0) goto L83
            X.0bD0 r0 = X.EnumC964540bCu.Companion
            r0.getClass()
            X.0bCu[] r6 = X.EnumC964540bCu.values()
            int r1 = r6.length
        L6b:
            if (r7 >= r1) goto L83
            r2 = r6[r7]
            java.lang.String r0 = r2.getWireValue()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r8)
            if (r0 != 0) goto L85
            int r7 = r7 + 1
            goto L6b
        L7c:
            X.0bCt r0 = X.EnumC964530bCt.APPLY_PREFERENCE_ONLY
            int r4 = r0.getRawValue()
            goto L43
        L83:
            X.0bCu r2 = r9.LLJ
        L85:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "FE→Native confirm action="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " ids="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " entrance="
            r1.append(r0)
            java.lang.String r0 = r2.getWireValue()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LJIIIZ(r5, r0)
            X.0sYq<java.lang.Integer, java.util.List<java.lang.Integer>, X.0bCu, kotlin.Unit> r1 = r9.LLJIJIL
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r1.invoke(r0, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C964610bD1.mh2(X.00zr):void");
    }

    @Override // X.AbstractC1537870q7d
    public final void LJL(InterfaceC1541990qEH interfaceC1541990qEH, String str, C1542120qEU c1542120qEU) throws JSONException {
        int iIntValue;
        LJLI(interfaceC1541990qEH, str, c1542120qEU.LIZIZ);
        Integer num = c1542120qEU.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        String str2 = c1542120qEU.LIZIZ;
        if (str2 == null) {
            str2 = "unknown_error";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLoadFailed url=");
        sbLIZ.append(str);
        sbLIZ.append(" code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(" msg=");
        sbLIZ.append(str2);
        C20441214yg.LJ("PreferencePanelLynxPage", C2188811AlT.LIZIZ(sbLIZ));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", str);
        jSONObject.put("error_code", iIntValue);
        jSONObject.put("error_msg", str2);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("render error url=");
        sbLIZ2.append(str);
        sbLIZ2.append(" code=");
        sbLIZ2.append(iIntValue);
        sbLIZ2.append(" msg=");
        sbLIZ2.append(str2);
        C20441214yg.LJIIL("PreferencePanelMonitor", C2188811AlT.LIZIZ(sbLIZ2));
        C1CC2.LJIIIIZZ("livesdk_match_preference_lynx_render_error", 1, jSONObject);
        LJZI(true);
    }

    public C964610bD1(int i, List list, EnumC964540bCu enumC964540bCu, C964510bCr c964510bCr, C964500bCq c964500bCq, C964560bCw c964560bCw) {
        this.LLIZ = i;
        this.LLIZLLLIL = list;
        this.LLJ = enumC964540bCu;
        this.LLJI = c964510bCr;
        this.LLJIJIL = c964500bCq;
        this.LLJILJIL = c964560bCw;
    }
}
