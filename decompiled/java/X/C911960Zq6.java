package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creation.sender.AIGroupShotSender$initiateProcess$1$1$1", f = "AIGroupShotSender.kt", l = {64}, m = "invokeSuspend")
public final class C911960Zq6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC912050ZqF LLILLL;
    public final /* synthetic */ EnumC900350ZTt LLILZ;
    public final /* synthetic */ C0Y8T LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C911960Zq6(long j, AbstractC912050ZqF abstractC912050ZqF, EnumC900350ZTt enumC900350ZTt, C0Y8T c0y8t, InterfaceC1364105Vn<? super C911960Zq6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = abstractC912050ZqF;
        this.LLILZ = enumC900350ZTt;
        this.LLILZIL = c0y8t;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911960Zq6(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotSender@665.initiateProcess$1$1$1");
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
            String strValueOf = String.valueOf(this.LLILLJJLI);
            String creationId = ((C912030ZqD) this.LLILLL).LIZJ.getCreationId();
            EnumC900350ZTt enumC900350ZTt = this.LLILZ;
            String str = ((C912030ZqD) this.LLILLL).LIZLLL;
            boolean zIsGroupChat = this.LLILZIL.isGroupChat();
            this.LL = 1;
            if (c900300ZTo.LJ(strValueOf, creationId, enumC900350ZTt, str, zIsGroupChat, this) == objLJFF) {
                C1C7U.LIZIZ("AIGroupShotSender@665.initiateProcess$1$1$1");
                return objLJFF;
            }
        }
        C911490ZpL c911490ZpL = C911490ZpL.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationData.JoinData. AIGroupShotPublishStatusManager.onStartPublish uuid=");
        sbLIZ.append(this.LLILLJJLI);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c911490ZpL.getClass();
        C911490ZpL.LIZ(strLIZIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotSender@665.initiateProcess$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
