package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0FDN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.sticker.core.text.resource.TextResourceRepository", f = "TextResourceRepository.kt", l = {428}, m = "downloadEffect-yxL6bBk")
public final class C0FDN extends AbstractC23140094w {
    public Object LL;
    public Function1 LLILLJJLI;
    public InterfaceC1631620sYq LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C0FDM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FDN(C0FDM c0fdm, InterfaceC1364105Vn<? super C0FDN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c0fdm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextResourceRepository@b217.downloadEffect$3");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILZIL.LIZJ(null, null, null, null, this);
        if (objLIZJ == C099R.LJFF()) {
            C1C7U.LIZIZ("TextResourceRepository@b217.downloadEffect$3");
            return objLIZJ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZJ);
        C1C7U.LIZIZ("TextResourceRepository@b217.downloadEffect$3");
        return c189200o6M1boximpl;
    }
}
