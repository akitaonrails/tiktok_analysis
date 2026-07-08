package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838010Wu7 extends C09AY implements Function1<C838310Wub, C838040WuA> {
    public final /* synthetic */ C825940Wae LL;
    public final /* synthetic */ Function1<C838040WuA, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C838010Wu7(C825940Wae c825940Wae, Function1<? super C838040WuA, ? extends Object> function1) {
        super(1);
        this.LL = c825940Wae;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C838040WuA invoke(C838310Wub c838310Wub) throws C838130WuJ {
        C838040WuA c838040WuA;
        Object objLIZ;
        C838310Wub c838310Wub2 = c838310Wub;
        C838030Wu9 c838030Wu9 = C838000Wu6.LIZ;
        C825940Wae c825940Wae = this.LL;
        try {
            System.nanoTime();
            InterfaceC838140WuK[] interfaceC838140WuKArrLIZ = C825950Waf.LIZ(c825940Wae);
            c838040WuA = new C838040WuA(0, null, 7);
            if (interfaceC838140WuKArrLIZ != null) {
                C089E c089e = new C089E(interfaceC838140WuKArrLIZ);
                while (c089e.hasNext()) {
                    InterfaceC838140WuK interfaceC838140WuK = (InterfaceC838140WuK) c089e.next();
                    JSONObject jSONObjectLIZIZ = C837830Wtp.LIZIZ((C838040WuA) C838000Wu6.LIZIZ(c825940Wae, interfaceC838140WuK.name(), C838000Wu6.LIZ, new C838020Wu8(interfaceC838140WuK, c825940Wae)));
                    if (jSONObjectLIZIZ != null) {
                        C837830Wtp.LIZ(c838040WuA, jSONObjectLIZIZ);
                    }
                }
            }
        } catch (C838130WuJ e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C838310Wub c838310WubLIZ = C838320Wuc.LIZ(c825940Wae, "InnerError");
            c838310WubLIZ.LJFF = EnumC838050WuB.WARN;
            c838310WubLIZ.LIZJ = -1;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("inner error:");
            sbLIZ.append(th.getLocalizedMessage());
            c838310WubLIZ.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
            c838310WubLIZ.LJI = th;
            C838280WuY.LIZ(c838310WubLIZ);
            String localizedMessage = c838310WubLIZ.LIZLLL;
            if (localizedMessage == null && (localizedMessage = th.getLocalizedMessage()) == null) {
                localizedMessage = "";
            }
            c838040WuA = new C838040WuA(-1, localizedMessage, 4);
        }
        c838310Wub2.LJ.LIZ();
        C838030Wu9 c838030Wu92 = C838000Wu6.LIZ;
        C825940Wae c825940Wae2 = this.LL;
        Function1<C838040WuA, Object> function1 = this.LLILLJJLI;
        if (function1 == null) {
            objLIZ = C838000Wu6.LIZ(c825940Wae2, null);
        } else {
            objLIZ = C838000Wu6.LIZ(c825940Wae2, new C838110WuH(function1, c838040WuA));
        }
        c838040WuA.LIZJ = objLIZ;
        c838310Wub2.LIZJ = c838040WuA.LIZ;
        c838310Wub2.LIZLLL = c838040WuA.LIZIZ;
        return c838040WuA;
    }
}
