package X;

import com.ss.android.ugc.aweme.aikit.api.create.CreateState;
import com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LjE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.social.protocol.AITheaterSocialFakeGeneratingUISlotAssem$observeGeneratingTaskState$1$1$3$1", f = "AITheaterSocialFakeGeneratingCardProtocol.kt", l = {}, m = "invokeSuspend")
public final class C550980LjE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0MXN LL;
    public final /* synthetic */ AITheaterSocialFakeGeneratingUISlotAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ CreateState LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C550980LjE(C0MXN c0mxn, AITheaterSocialFakeGeneratingUISlotAssem aITheaterSocialFakeGeneratingUISlotAssem, String str, CreateState createState, InterfaceC1364105Vn<? super C550980LjE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0mxn;
        this.LLILLJJLI = aITheaterSocialFakeGeneratingUISlotAssem;
        this.LLILLL = str;
        this.LLILZ = createState;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C550980LjE(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AITheaterSocialFakeGeneratingUISlotAssem@7d94.observeGeneratingTaskState$1$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int iLIZ = C0MXG.LIZ(C0I6Y.LIZ(this.LL).getUuid());
        C0MXF c0mxf = C0MXF.NETWORK;
        if (iLIZ != c0mxf.getType()) {
            this.LLILLJJLI.Ap(this.LL, 10009);
            C0MU2 c0mu2 = C0MU2.LIZ;
            String uuid = C0I6Y.LIZ(this.LL).getUuid();
            String str = this.LLILLL;
            Integer numLJ = C2286608xc.LJ(0);
            Integer numLJ2 = C2286608xc.LJ(10009);
            c0mu2.getClass();
            C0MU2.LJFF(numLJ, numLJ2, uuid, null, str);
        }
        this.LLILLJJLI.Bp(c0mxf, this.LL, String.valueOf(((CreateState.Failed) this.LLILZ).getErrorCode()), C2286608xc.LJFF(((CreateState.Failed) this.LLILZ).getDuration()));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AITheaterSocialFakeGeneratingUISlotAssem@7d94.observeGeneratingTaskState$1$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
