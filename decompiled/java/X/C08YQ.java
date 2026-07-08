package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08YQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.order.psp.ShareRecordKevaHelper$addShareRecordAsync$1", f = "SmartSortStoreShareRecordHelper.kt", l = {111, 117}, m = "invokeSuspend")
public final class C08YQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08YQ(String str, String str2, InterfaceC1364105Vn<? super C08YQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08YQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareRecordKevaHelper@cfe0.addShareRecordAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (Intrinsics.LJFF(this.LLILLJJLI, "more_share_list")) {
                Map map = (Map) C07K6.LIZIZ.getValue();
                if (!map.isEmpty()) {
                    String str = (String) map.get(this.LLILLL);
                    if (C123100dR.LIZ(str)) {
                        C08YW c08yw = new C08YW(str, System.currentTimeMillis());
                        String str2 = this.LLILLJJLI;
                        this.LL = 1;
                        if (C08YU.LIZ(str2, c08yw, this) == objLJFF) {
                            C1C7U.LIZIZ("ShareRecordKevaHelper@cfe0.addShareRecordAsync$1");
                            return objLJFF;
                        }
                    }
                }
            } else {
                C08YW c08yw2 = new C08YW(this.LLILLL, System.currentTimeMillis());
                String str3 = this.LLILLJJLI;
                this.LL = 2;
                if (C08YU.LIZ(str3, c08yw2, this) == objLJFF) {
                    C1C7U.LIZIZ("ShareRecordKevaHelper@cfe0.addShareRecordAsync$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareRecordKevaHelper@cfe0.addShareRecordAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
