package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05hF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.applog.params.extract.JsonUtils$keysOf$1", f = "JsonUtils.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1420705hF extends C09AW implements Function2<AbstractC1421005hI<? super String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ JSONObject LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420705hF(JSONObject jSONObject, InterfaceC1364105Vn<? super C1420705hF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1420705hF c1420705hF = new C1420705hF(this.LLILZIL, interfaceC1364105Vn);
        c1420705hF.LLILZ = obj;
        return c1420705hF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AbstractC1421005hI abstractC1421005hI;
        Iterator<String> itKeys;
        C1C7U.LIZ("JsonUtils@2dbd.keysOf$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                itKeys = (Iterator) this.LLILLJJLI;
                abstractC1421005hI = (AbstractC1421005hI) this.LLILZ;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            abstractC1421005hI = (AbstractC1421005hI) this.LLILZ;
            itKeys = this.LLILZIL.keys();
        }
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            this.LLILZ = abstractC1421005hI;
            this.LLILLJJLI = itKeys;
            this.LLILLL = 1;
            if (abstractC1421005hI.LIZ(next, this) == objLJFF) {
                C1C7U.LIZIZ("JsonUtils@2dbd.keysOf$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("JsonUtils@2dbd.keysOf$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1421005hI<? super String> abstractC1421005hI, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1421005hI, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
