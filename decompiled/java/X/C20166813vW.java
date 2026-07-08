package X;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.13vW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.contact.filter.ContactBookFilterByPsi", f = "ContactFilterByPsi.kt", l = {196, 260}, m = "tryFilterBeforeUpload")
public final class C20166813vW extends AbstractC23140094w {
    public C20166313vR LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C20166613vU LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20166813vW(C20166613vU c20166613vU, InterfaceC1364105Vn<? super C20166813vW> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c20166613vU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, null, null, this);
        C1C7U.LIZIZ("ContactBookFilterByPsi@dd2a.tryFilterBeforeUpload$1");
        return objLIZ;
    }
}
