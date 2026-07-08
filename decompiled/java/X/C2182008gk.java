package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08gk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.dynamic.card.preserve.data.DynamicCardPreserveDataMgr$sendJsEvent$1", f = "DynamicCardPreserveDataMgr.kt", l = {167}, m = "invokeSuspend")
public final class C2182008gk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1107590evd LLILLL;
    public final /* synthetic */ C2184008h4 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2182008gk(String str, InterfaceC1107590evd interfaceC1107590evd, C2184008h4 c2184008h4, InterfaceC1364105Vn<? super C2182008gk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1107590evd;
        this.LLILZ = c2184008h4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2182008gk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("DynamicCardPreserveDataMgr@a13.sendJsEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!Intrinsics.LJFF(this.LLILLJJLI, "dm_preserve_data_register")) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.sendJsEvent$1");
                return unit;
            }
            InterfaceC1107590evd interfaceC1107590evd = this.LLILLL;
            if (interfaceC1107590evd != null && (string = interfaceC1107590evd.getString("message_id")) != null) {
                String string2 = this.LLILLL.getString("key");
                List listLJJLL = C13LQ.LJJLL((Object[]) GsonProtectorUtils.fromJson(C09EF.LIZ, this.LLILLL.getString("ids"), String[].class));
                C2184008h4 c2184008h4 = this.LLILZ;
                this.LL = 1;
                if (c2184008h4.LIZ(listLJJLL, string, string2, this) == objLJFF) {
                    C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.sendJsEvent$1");
                    return objLJFF;
                }
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.sendJsEvent$1");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("DynamicCardPreserveDataMgr@a13.sendJsEvent$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
