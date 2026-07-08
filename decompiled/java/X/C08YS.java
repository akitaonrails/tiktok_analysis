package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08YS, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.order.psp.ShareRecordKevaHelper$addNewShareRecord$2", f = "SmartSortStoreShareRecordHelper.kt", l = {}, m = "invokeSuspend")
public final class C08YS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C08YW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C08YS(String str, C08YW c08yw, InterfaceC1364105Vn<? super C08YS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c08yw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C08YS(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareRecordKevaHelper@cfe0.addNewShareRecord$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C08YU c08yu = C08YU.LIZ;
            List listLIZJ = C08YU.LIZJ(this.LL);
            listLIZJ.add(0, this.LLILLJJLI);
            if (listLIZJ.size() > 10) {
                listLIZJ.subList(10, listLIZJ.size()).clear();
            }
            C08YU.LIZIZ.put(this.LL, new ArrayList(listLIZJ));
            ((Keva) C08YU.LJ.getValue()).storeString(this.LL, GsonProtectorUtils.toJson((Gson) C08YU.LJFF.getValue(), listLIZJ, C08YU.LJI));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShareRecordKevaHelper@cfe0.addNewShareRecord$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
