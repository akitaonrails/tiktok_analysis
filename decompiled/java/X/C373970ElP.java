package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ElP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C373970ElP extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C373940ElM LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C373970ElP(String str, boolean z, C373940ElM c373940ElM) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = c373940ElM;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC374290Elv interfaceC374290ElvK5;
        C563650M8t c563650M8t = C563650M8t.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cutout panel component mattingListener , onSuccess done workspace ");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showToast: ");
        sbLIZ.append(this.LLILLJJLI);
        C201955140j.LIZLLL(c563650M8t, "shiwei", C2188811AlT.LIZIZ(sbLIZ));
        C373940ElM c373940ElM = this.LLILLL;
        if (!c373940ElM.LLJLL && ((interfaceC374290ElvK5 = c373940ElM.k5()) == null || !interfaceC374290ElvK5.HL0())) {
            this.LLILLL.L1(2131830440);
        }
        this.LLILLL.e71(Float.valueOf(1.0f));
        this.LLILLL.LLJLL = false;
        return Unit.LIZ;
    }
}
