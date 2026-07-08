package X;

import com.ss.android.ugc.aweme.service.PublishResourceFirstPolicyServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.09QF, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09QF extends C09AY implements Function0<InterfaceC2188711AlJ> {
    public final /* synthetic */ PublishResourceFirstPolicyServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QF(PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl) {
        super(0);
        this.LL = publishResourceFirstPolicyServiceImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC2188711AlJ invoke() {
        final PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl = this.LL;
        return new InterfaceC2188711AlJ() { // from class: X.09QI
            @Override // X.InterfaceC2188711AlJ
            public final void LIZ(C1768270w7F c1768270w7F) {
                C09QO c09qo;
                if (c1768270w7F != null && (c09qo = c1768270w7F.LIZIZ) != null && C09QJ.LIZ[c09qo.ordinal()] == 1) {
                    PublishResourceFirstPolicyServiceImpl publishResourceFirstPolicyServiceImpl2 = publishResourceFirstPolicyServiceImpl;
                    publishResourceFirstPolicyServiceImpl2.getClass();
                    int i = C2187451AjH.LIZ;
                    C1720106oR.LJI(publishResourceFirstPolicyServiceImpl2.LIZ, "on memory low");
                    publishResourceFirstPolicyServiceImpl2.LIZJ();
                }
            }
        };
    }
}
