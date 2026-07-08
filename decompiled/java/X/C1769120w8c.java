package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.BadgeRedDotStrongToWeakCfg;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w8c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.task.uitask.base.BadgeTaskBase$tryDelayUpdateBadgeSubStage$2$1", f = "BadgeTaskBase.kt", l = {285}, m = "invokeSuspend")
public final class C1769120w8c extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BadgeRedDotStrongToWeakCfg LLILLJJLI;
    public final /* synthetic */ AbstractC1769090w8Z LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1769120w8c(BadgeRedDotStrongToWeakCfg badgeRedDotStrongToWeakCfg, AbstractC1769090w8Z abstractC1769090w8Z, InterfaceC1364105Vn<? super C1769120w8c> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = badgeRedDotStrongToWeakCfg;
        this.LLILLL = abstractC1769090w8Z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1769120w8c(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("BadgeTaskBase@2182.tryDelayUpdateBadgeSubStage$2$1");
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
            Long l = this.LLILLJJLI.strongDuration;
            if (l != null) {
                jLongValue = l.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            } else {
                jLongValue = 0;
            }
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ShopByteSync BadgeTask=====  current reddot sub stage is ");
            sbLIZ.append(this.LLILLL.LJIIL);
            sbLIZ.append(", will change reddot sub stage to weak will");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                C1C7U.LIZIZ("BadgeTaskBase@2182.tryDelayUpdateBadgeSubStage$2$1");
                return objLJFF;
            }
        }
        AbstractC1769090w8Z abstractC1769090w8Z = this.LLILLL;
        abstractC1769090w8Z.LJIIL = EnumC1768240w7C.REDDOT_WEAK_WILL;
        C1769130w8d c1769130w8d = abstractC1769090w8Z.LJIILIIL;
        if (c1769130w8d != null) {
            C1769130w8d c1769130w8dLIZ = C1769130w8d.LIZ(c1769130w8d, abstractC1769090w8Z.LJIIL, null, abstractC1769090w8Z.LIZJ(), null, null, null, 32701);
            abstractC1769090w8Z.LJIILIIL = c1769130w8dLIZ;
            abstractC1769090w8Z.LIZIZ.mJ0(c1769130w8dLIZ);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ShopByteSync BadgeTask===== current reddot sub stage is ");
        sbLIZ2.append(this.LLILLL.LJIIL);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BadgeTaskBase@2182.tryDelayUpdateBadgeSubStage$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
