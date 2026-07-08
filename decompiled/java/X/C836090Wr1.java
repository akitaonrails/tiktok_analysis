package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.pipo.googlepay.pushprovisioning.api.EphemeralKeyResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wr1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.pipo.googlepay.pushprovisioning.EphemeralKeyProvider$createEphemeralKey$1$1", f = "TokenizeGooglePayFragment.kt", l = {}, m = "invokeSuspend")
public final class C836090Wr1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0X52<EphemeralKeyResponse> LL;
    public final /* synthetic */ InterfaceC834570WoZ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C836090Wr1(C0X52<EphemeralKeyResponse> c0x52, InterfaceC834570WoZ interfaceC834570WoZ, InterfaceC1364105Vn<? super C836090Wr1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0x52;
        this.LLILLJJLI = interfaceC834570WoZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C836090Wr1(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String string;
        C1C7U.LIZ("EphemeralKeyProvider@346d.createEphemeralKey$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0X52<EphemeralKeyResponse> c0x52 = this.LL;
        if (c0x52 != null && c0x52.LIZJ()) {
            InterfaceC834570WoZ interfaceC834570WoZ = this.LLILLJJLI;
            try {
                string = JSONObjectProtectorUtils.getString(new JSONObject(this.LL.LIZIZ.response), "ephemeral_key");
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                string = "";
            }
            ((C836600Wrq) interfaceC834570WoZ).LIZ(string);
        } else {
            ((C836600Wrq) this.LLILLJJLI).LIZIZ("api error");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EphemeralKeyProvider@346d.createEphemeralKey$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
