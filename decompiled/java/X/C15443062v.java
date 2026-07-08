package X;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.062v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.bullet.bridge.ad.GetAdDeviceIdentifierMethodIDL$getGAID$2", f = "GetAdDeviceIdentifierMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C15443062v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15443062v(Context context, InterfaceC1364105Vn<? super C15443062v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15443062v(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("GetAdDeviceIdentifierMethodIDL@4dc5.getGAID$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(this.LL);
        String strLLLLLIL = null;
        if (infoLIZIZ != null) {
            strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOi9b5PLyHwDdlrQqGjrmHF8G3zAzhp0qB85xQ8urVCeySEwttcIhLlhaFrAYsZ/", null));
        }
        C1C7U.LIZIZ("GetAdDeviceIdentifierMethodIDL@4dc5.getGAID$2");
        return strLLLLLIL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
