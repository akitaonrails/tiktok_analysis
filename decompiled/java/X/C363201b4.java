package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01b4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinImageGeckoManagerV2$getBulletinStyleResourcesIndividually$1$1", f = "BulletinImageGeckoManagerV2.kt", l = {100}, m = "invokeSuspend")
public final class C363201b4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> LLILLJJLI;
    public final /* synthetic */ EnumC368901bz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C363201b4(InterfaceC1631620sYq<? super Boolean, ? super String, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> interfaceC1631620sYq, EnumC368901bz enumC368901bz, InterfaceC1364105Vn<? super C363201b4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1631620sYq;
        this.LLILLL = enumC368901bz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C363201b4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinImageGeckoManagerV2@3246.getBulletinStyleResourcesIndividually$1$1");
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
            InterfaceC1631620sYq<Boolean, String, InterfaceC1364105Vn<? super Unit>, Object> interfaceC1631620sYq = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(" path is empty");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            this.LL = 1;
            if (interfaceC1631620sYq.invoke(false, strLIZIZ, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.getBulletinStyleResourcesIndividually$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinImageGeckoManagerV2@3246.getBulletinStyleResourcesIndividually$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
