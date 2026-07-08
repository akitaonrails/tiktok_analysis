package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.im.b2c.entitlementlist.B2CEntitlementListResponse;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.06f8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.entitlementlist.B2CEntitlementListManager$refresh$1", f = "B2CEntitlementListManager.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1662406f8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1662906fD LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1662406f8(InterfaceC1662906fD interfaceC1662906fD, String str, InterfaceC1364105Vn<? super C1662406f8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1662906fD;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1662406f8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("B2CEntitlementListManager@fea5.refresh$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC1662906fD interfaceC1662906fD = this.LLILLJJLI;
                this.LL = 1;
                obj = interfaceC1662906fD.LIZ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("B2CEntitlementListManager@fea5.refresh$1");
                    return objLJFF;
                }
            }
            List<String> list = ((B2CEntitlementListResponse) obj).matchedEntitlements;
            C1662306f7 c1662306f7 = C1662306f7.LL;
            if (!Intrinsics.LJFF(C1662306f7.LIZIZ(), this.LLILLL)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("B2CEntitlementListManager@fea5.refresh$1");
                return unit;
            }
            C1662306f7.LLILLJJLI.set(C2097908Jt.LIZJ(new Pair(this.LLILLL, list)));
            String str = this.LLILLL;
            Keva keva = (Keva) C1663506fJ.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("matched_feature_ids:");
            sbLIZ.append(str);
            keva.storeStringArray(C2188811AlT.LIZIZ(sbLIZ), (String[]) list.toArray(new String[0]));
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("B2CEntitlementListManager@fea5.refresh$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("B2CEntitlementListManager@fea5.refresh$1");
            return unit3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
