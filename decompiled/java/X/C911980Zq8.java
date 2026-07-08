package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zq8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.AIGroupShotSender$initiateProcess$2$onSuccess$1$1$success$1$1", f = "AIGroupShotSender.kt", l = {155}, m = "invokeSuspend")
public final class C911980Zq8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AbstractC912050ZqF LLILLL;
    public final /* synthetic */ EnumC900350ZTt LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911980Zq8(String str, AbstractC912050ZqF abstractC912050ZqF, EnumC900350ZTt enumC900350ZTt, InterfaceC1364105Vn<? super C911980Zq8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = abstractC912050ZqF;
        this.LLILZ = enumC900350ZTt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911980Zq8(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotSender@665.initiateProcess$2$onSuccess$1$1$success$1$1");
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
            C900300ZTo c900300ZTo = C900300ZTo.LIZ;
            String str = this.LLILLJJLI;
            String creationId = this.LLILLL.LIZ().getCreationId();
            EnumC900350ZTt enumC900350ZTt = this.LLILZ;
            this.LL = 1;
            if (c900300ZTo.LIZLLL(str, creationId, enumC900350ZTt, this) == objLJFF) {
                C1C7U.LIZIZ("AIGroupShotSender@665.initiateProcess$2$onSuccess$1$1$success$1$1");
                return objLJFF;
            }
        }
        C911490ZpL c911490ZpL = C911490ZpL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("success. AIGroupShotPublishStatusManager.onPublishFinish (");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append("): uuid=");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c911490ZpL.getClass();
        C911490ZpL.LIZ(strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotSender@665.initiateProcess$2$onSuccess$1$1$success$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
