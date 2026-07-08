package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0m3W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl$doPrivacyControlReport$1", f = "PrivacyServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C1381560m3W extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C1381570m3X> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1381560m3W(List<C1381570m3X> list, InterfaceC1364105Vn<? super C1381560m3W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1381560m3W(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PrivacyServiceImpl@87d1.doPrivacyControlReport$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (C1381570m3X c1381570m3X : this.LL) {
            c1381570m3X.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("object_id", c1381570m3X.LIZ);
            linkedHashMap.put(Scene.SCENE_SERVICE, c1381570m3X.LIZIZ);
            linkedHashMap.put("log_id", c1381570m3X.LIZJ);
            linkedHashMap.put("result", c1381570m3X.LIZLLL.getValue());
            linkedHashMap.put("timestamp", c1381570m3X.LJ);
            String str = c1381570m3X.LJFF;
            if (str != null) {
                linkedHashMap.put("author_id", str);
            }
            String str2 = c1381570m3X.LJI;
            if (str2 != null) {
                linkedHashMap.put("reason_code", str2);
            }
            String str3 = c1381570m3X.LJII;
            if (str3 != null) {
                linkedHashMap.put("reason", str3);
            }
            JSONObject jSONObject = c1381570m3X.LJIIIIZZ;
            if (jSONObject != null) {
                linkedHashMap.put("extra", C786410Ut5.J3(jSONObject));
            }
            C20684815ws.LJIILLIIL("pns_privacy_control", linkedHashMap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PrivacyServiceImpl@87d1.doPrivacyControlReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
