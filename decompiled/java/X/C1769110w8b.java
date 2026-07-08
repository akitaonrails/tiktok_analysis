package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w8b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.task.uitask.base.BadgeTaskBase$tryScheduleNumberCleanup$1$1", f = "BadgeTaskBase.kt", l = {314}, m = "invokeSuspend")
public final class C1769110w8b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC1769090w8Z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769110w8b(long j, AbstractC1769090w8Z abstractC1769090w8Z, InterfaceC1364105Vn<? super C1769110w8b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = abstractC1769090w8Z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1769110w8b(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BadgeTaskBase@2182.tryScheduleNumberCleanup$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z2 = false;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                long j = this.LLILLJJLI;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("BadgeTaskBase@2182.tryScheduleNumberCleanup$1$1");
                    return objLJFF;
                }
            }
            AbstractC1769090w8Z abstractC1769090w8Z = this.LLILLL;
            C1769130w8d c1769130w8d = abstractC1769090w8Z.LJIILIIL;
            if (c1769130w8d == null || !c1769130w8d.LIZ) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                EnumC1769240w8o enumC1769240w8o = c1769130w8d.LIZJ;
                EnumC1769240w8o enumC1769240w8o2 = EnumC1769240w8o.NUMBER;
                if (enumC1769240w8o == enumC1769240w8o2) {
                    EnumC1769240w8o enumC1769240w8o3 = EnumC1769240w8o.NORMAL;
                    C1768560w7i c1768560w7i = C1768560w7i.LIZ;
                    Map<String, Object> mapLIZJ = abstractC1769090w8Z.LIZJ();
                    c1768560w7i.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(mapLIZJ);
                    linkedHashMap.put("red_dot_number_type", EnumC1994307rZ.NORMAL.getValue());
                    linkedHashMap.remove("red_dot_number");
                    C1769130w8d c1769130w8dLIZ = C1769130w8d.LIZ(c1769130w8d, this.LLILLL.LJIIL, enumC1769240w8o3, linkedHashMap, null, enumC1769240w8o2, c1769130w8d.LJI, 8113);
                    AbstractC1769090w8Z abstractC1769090w8Z2 = this.LLILLL;
                    abstractC1769090w8Z2.LJIILIIL = c1769130w8dLIZ;
                    abstractC1769090w8Z2.LIZIZ.mJ0(c1769130w8dLIZ);
                    AnonymousClass0956 anonymousClass0956 = this.LLILLL.LJIILLIIL;
                    if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
                        z2 = true;
                    }
                    if (!z2) {
                        this.LLILLL.LJIILLIIL = null;
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BadgeTaskBase@2182.tryScheduleNumberCleanup$1$1");
                    return unit;
                }
            }
            Unit unit2 = Unit.LIZ;
            AnonymousClass0956 anonymousClass09562 = abstractC1769090w8Z.LJIILLIIL;
            if (anonymousClass09562 != null && anonymousClass09562.isActive()) {
                z2 = true;
            }
            if (!z2) {
                this.LLILLL.LJIILLIIL = null;
            }
            C1C7U.LIZIZ("BadgeTaskBase@2182.tryScheduleNumberCleanup$1$1");
            return unit2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AnonymousClass0956 anonymousClass09563 = this.LLILLL.LJIILLIIL;
            if (anonymousClass09563 != null && anonymousClass09563.isActive()) {
                z2 = true;
            }
            if (!z2) {
                this.LLILLL.LJIILLIIL = null;
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
