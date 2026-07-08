package X;

import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09b6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.duet.RecordVideoStreamLoadComponent$triggerAigcInfoGenerate$1$1", f = "RecordVideoStreamLoadComponent.kt", l = {}, m = "invokeSuspend")
public final class C2401809b6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1655220tAu LL;
    public final /* synthetic */ AIGCInfo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401809b6(C1655220tAu c1655220tAu, AIGCInfo aIGCInfo, InterfaceC1364105Vn<? super C2401809b6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1655220tAu;
        this.LLILLJJLI = aIGCInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2401809b6(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getShortVideoContext().creativeModel.duetModel.aigcInfo = this.LLILLJJLI;
        C1655220tAu c1655220tAu = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("aigcInfo set: type=");
        sbLIZ.append(this.LLILLJJLI.getType());
        sbLIZ.append(", bucketTaskId=");
        sbLIZ.append(this.LLILLJJLI.getBucketTaskId());
        c1655220tAu.W2(C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordVideoStreamLoadComponent@fd30.triggerAigcInfoGenerate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
