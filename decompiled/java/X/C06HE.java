package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.lynx.tasm.TemplateData;
import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import com.ss.android.ugc.aweme.im.streak.impl.pet.fe.event.StreakJsEventHandler;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLynxDataUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06HE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$tryCreateWidgetSparkView$1", f = "StreakPetWidget.kt", l = {305}, m = "invokeSuspend")
public final class C06HE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ C06HD LLILZIL;
    public final /* synthetic */ StreakData LLILZLL;
    public final /* synthetic */ StreakPetData LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06HE(C06HD c06hd, StreakData streakData, StreakPetData streakPetData, int i, InterfaceC1364105Vn<? super C06HE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c06hd;
        this.LLILZLL = streakData;
        this.LLIZ = streakPetData;
        this.LLIZLLLIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06HE(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        JSONObject jSONObject;
        String str;
        JSONObject jSONObject2;
        Object objLJ = obj;
        C1C7U.LIZ("StreakPetWidget@92f0.tryCreateWidgetSparkView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        if (i != 0) {
            if (i == 1) {
                jSONObject2 = (JSONObject) this.LLILLL;
                str = (String) this.LLILLJJLI;
                jSONObject = (JSONObject) this.LL;
                C155000ia.LIZIZ(objLJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJ);
            jSONObject = new JSONObject();
            C06HD c06hd = this.LLILZIL;
            StreakData streakData = this.LLILZLL;
            StreakPetData streakPetData = this.LLIZ;
            int i2 = this.LLIZLLLIL;
            StreakLynxDataUtils streakLynxDataUtils = StreakLynxDataUtils.LIZ;
            String str2 = c06hd.LLILLL;
            C06H2 c06h2 = C06H2.CHAT;
            String str3 = c06hd.LLILZIL;
            boolean z = c06hd.LLJILLL;
            int andIncrement = c06hd.LLJIJIL.getAndIncrement();
            String value = C06H4.WIDGET.getValue();
            Integer numLJ = C2286608xc.LJ(i2);
            Integer numLJ2 = C2286608xc.LJ(andIncrement);
            this.LL = jSONObject;
            str = "client_data";
            this.LLILLJJLI = "client_data";
            this.LLILLL = jSONObject;
            this.LLILZ = 1;
            objLJ = streakLynxDataUtils.LJ(str2, streakData, streakPetData, c06h2, "", "", numLJ, str3, z, null, value, numLJ2, null, this);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("StreakPetWidget@92f0.tryCreateWidgetSparkView$1");
                return objLJFF;
            }
            jSONObject2 = jSONObject;
        }
        jSONObject2.put(str, objLJ);
        final String strJ3 = C786410Ut5.J3(jSONObject);
        C06HD c06hd2 = this.LLILZIL;
        StreakJsEventHandler streakJsEventHandler = (StreakJsEventHandler) c06hd2.LLJJJJ.getValue();
        streakJsEventHandler.getClass();
        C1574006Eg c1574006Eg = C1574006Eg.LLILLJJLI;
        c1574006Eg.getClass();
        C054G c054g = C1574006Eg.LLILZ;
        C23250099c.LIZLLL(c054g, null, null, new C1574106Eh(streakJsEventHandler, null), 3);
        StreakJsEventHandler streakJsEventHandler2 = (StreakJsEventHandler) c06hd2.LLJJJJJIL.getValue();
        streakJsEventHandler2.getClass();
        c1574006Eg.getClass();
        C23250099c.LIZLLL(c054g, null, null, new C1574106Eh(streakJsEventHandler2, null), 3);
        StreakJsEventHandler streakJsEventHandler3 = (StreakJsEventHandler) c06hd2.LLJJJJLIIL.getValue();
        streakJsEventHandler3.getClass();
        c1574006Eg.getClass();
        C23250099c.LIZLLL(c054g, null, null, new C1574106Eh(streakJsEventHandler3, null), 3);
        StreakJsEventHandler streakJsEventHandler4 = (StreakJsEventHandler) c06hd2.LLJJL.getValue();
        streakJsEventHandler4.getClass();
        c1574006Eg.getClass();
        C23250099c.LIZLLL(c054g, null, null, new C1574106Eh(streakJsEventHandler4, null), 3);
        if (c06hd2.LLJJ == null) {
            C1590806Ks.LIZ("SPWidget obtainSparkView");
            SparkContext sparkContext = new SparkContext();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1583306Hv.LIZ().widgetSchema);
            sbLIZ.append("&hide_debug_label=1");
            sparkContext.LJJLIIJ(C2188811AlT.LIZIZ(sbLIZ));
            sparkContext.LJJJJZ(new AbstractC1539010q9T() { // from class: X.0PdD
                @Override // X.AbstractC1539010q9T, X.InterfaceC1057870ddR
                public final void LJJJLL(InterfaceC1531560pxS interfaceC1531560pxS) {
                    C1537910q7h c1537910q7h;
                    if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null) {
                        c1537910q7h.LJIJJ = TemplateData.LJIIIIZZ(strJ3);
                    }
                }
            });
            sparkContext.LJJJJZI(new C1770306wX(c06hd2, 3));
            sparkContext.LJJLIIIJLJLI(new AbstractC1542070qEP() { // from class: X.0qEp
                @Override // X.InterfaceC1163110gNB
                public final void LJIIJ(Context context) {
                }

                @Override // X.InterfaceC1163110gNB
                public final View LJJJLIIL(InterfaceC1051240dSk interfaceC1051240dSk) {
                    return null;
                }

                @Override // X.InterfaceC1163110gNB
                public final View LJJL() {
                    return null;
                }
            });
            C1572806Du.LL.Oh(c06hd2.LLIZLLLIL);
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            Context context = c06hd2.LLILLJJLI;
            c1537900q7g.getClass();
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ = new C1541950qED(context, sparkContext).LIZ(false);
            c06hd2.LL.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ, new FrameLayout.LayoutParams(-1, -1));
            c06hd2.LLJJ = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBLIZ.LJIIIIZZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.tryCreateWidgetSparkView$1");
        return unit;
    }
}
