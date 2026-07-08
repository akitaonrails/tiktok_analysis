package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XF6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.user.SOTLBlobStore$saveOidcToken$1", f = "SOTLBlobStore.kt", l = {}, m = "invokeSuspend")
public final class C0XF6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XF6(Context context, String str, JSONObject jSONObject, InterfaceC1364105Vn<? super C0XF6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0XF6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SOTLBlobStore@88ed.saveOidcToken$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            AdvertisingIdClient.Info infoLIZIZ = C837870Wtt.LIZIZ(this.LL);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("got gaid: ");
            sbLIZ.append(infoLIZIZ);
            sbLIZ.append(", cost: ");
            sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            C0XFF.LIZJ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ));
            if (infoLIZIZ == null) {
                C0XFF.LIZJ("SOTLBlobStore", "gaidPair is null, skip write blob");
                C0XF8.LIZ.getClass();
                C0XF8.LIZIZ("gaidPair is null");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SOTLBlobStore@88ed.saveOidcToken$1");
                return unit;
            }
            String strLLLLLIL = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+7Zo2A7x3aNvOrAzzXTT8ajg==", null));
            if (strLLLLLIL != null && strLLLLLIL.length() != 0 && !Intrinsics.LJFF(C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+7Zo2A7x3aNvOrAzzXTT8ajg==", null)), "00000000-0000-0000-0000-000000000000")) {
                if (infoLIZIZ.LIZIZ) {
                    C0XFF.LIZJ("SOTLBlobStore", "isLimitAdTrackingEnabled is true, skip write blob");
                    C0XF8.LIZ.getClass();
                    C0XF8.LIZIZ("isLimitAdTrackingEnabled is true");
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("SOTLBlobStore@88ed.saveOidcToken$1");
                    return unit2;
                }
                String strLLLLLIL2 = C2204961BRm.LLLLLIL(infoLIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP+7Zo2A7x3aNvOrAzzXTT8ajg==", null));
                try {
                    C0XF8 c0xf8 = C0XF8.LIZ;
                    Context context = this.LL;
                    String str = this.LLILLJJLI;
                    JSONObject jSONObject = this.LLILLL;
                    c0xf8.getClass();
                    C0XF8.LIZLLL(context, str, strLLLLLIL2, jSONObject);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("write blob exception, e: ");
                    sbLIZ2.append(e);
                    C0XFF.LIZIZ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ2));
                    C0XF8.LIZ.getClass();
                    C0XF8.LIZIZ("write blob exception");
                }
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("SOTLBlobStore@88ed.saveOidcToken$1");
                return unit3;
            }
            C0XFF.LIZJ("SOTLBlobStore", "gaid is invalid, skip write blob");
            C0XF8.LIZ.getClass();
            C0XF8.LIZIZ("gaid is invalid");
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("SOTLBlobStore@88ed.saveOidcToken$1");
            return unit4;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("get gaid exception, e: ");
            sbLIZ3.append(e2);
            C0XFF.LIZIZ("SOTLBlobStore", C2188811AlT.LIZIZ(sbLIZ3));
            C0XF8.LIZ.getClass();
            C0XF8.LIZIZ("get gaid exception");
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("SOTLBlobStore@88ed.saveOidcToken$1");
            return unit5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
