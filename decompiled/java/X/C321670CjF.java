package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CjF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoContentAssem$bind$2$10$2", f = "TakoContentAssem.kt", l = {}, m = "invokeSuspend")
public final class C321670CjF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C321670CjF(String str, String str2, String str3, String str4, String str5, C013C c013c, String str6, String str7, String str8, InterfaceC1364105Vn<? super C321670CjF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = c013c;
        this.LLIZ = str6;
        this.LLIZLLLIL = str7;
        this.LLJ = str8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C321670CjF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("TakoContentAssem@bd9.bind$2$10$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        String str5 = this.LLILZIL;
        boolean z = this.LLILZLL.element;
        String str6 = this.LLIZ;
        String str7 = this.LLIZLLLIL;
        String str8 = this.LLJ;
        C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
        c1862330yYx.getClass();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("process_id", str);
            jSONObject.put("enter_from", str2);
            jSONObject.put("enter_method", str3);
            if (str4 == null) {
                str4 = "";
            }
            jSONObject.put("query_message_id", str4);
            if (str5 == null) {
                str5 = "";
            }
            jSONObject.put("message_id", str5);
            if (z) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("is_cross_screen", i);
            jSONObject.put("screen_type", str6);
            jSONObject.put("tako_session_id", str7);
            if (str8 != null && str8.length() > 0) {
                jSONObject.put("tako_chat_id", str8);
            }
            c20235014FoLIZ.LIZIZ("tikbot_render_message", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoContentAssem@bd9.bind$2$10$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
