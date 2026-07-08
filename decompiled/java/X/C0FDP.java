package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FDP, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository", f = "TextResourceRepository.kt", l = {145}, m = "downloadEffect-0E7RQCE")
public final class C0FDP extends AbstractC23140094w {
    public Function1 LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0FDM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDP(C0FDM c0fdm, InterfaceC1364105Vn<? super C0FDP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c0fdm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextResourceRepository@b217.downloadEffect$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(null, null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("TextResourceRepository@b217.downloadEffect$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("TextResourceRepository@b217.downloadEffect$1");
        return c189200o6M1boximpl;
    }
}
