package X;

import kotlin.Unit;
import kotlin.jvm.internal.AwS45S0600000_22;

/* JADX INFO: renamed from: X.0mqZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411970mqZ extends C09AY implements InterfaceC1631620sYq<Integer, Exception, String, Unit> {
    public final /* synthetic */ C1413340msm LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Exception, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1411970mqZ(C1413340msm c1413340msm, String str, AwS45S0600000_22 awS45S0600000_22) {
        super(3);
        this.LL = c1413340msm;
        this.LLILLJJLI = str;
        this.LLILLL = awS45S0600000_22;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Integer num, Exception exc, String str) {
        int iIntValue = num.intValue();
        Exception exc2 = exc;
        String str2 = str;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onItemImageSynthesisFailed: code=");
        sbLIZ.append(iIntValue);
        sbLIZ.append(", msg=");
        sbLIZ.append(str2);
        sbLIZ.append(", index = ");
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append(" src=");
        sbLIZ.append(this.LLILLJJLI);
        c1437510nVlLJJLIIIJ.LIZ("compile", C2188811AlT.LIZIZ(sbLIZ));
        if (exc2 != null) {
            C0CHQ.LIZ().getPublishService().LJJLIIIJ().LIZIZ("compile", exc2);
        }
        InterfaceC1631620sYq<Integer, Exception, String, Unit> interfaceC1631620sYq = this.LLILLL;
        if (interfaceC1631620sYq != null) {
            interfaceC1631620sYq.invoke(Integer.valueOf(iIntValue), exc2, str2);
        }
        return Unit.LIZ;
    }
}
