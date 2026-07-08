package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CqW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326180CqW extends C09AY implements Function1<C326170CqV, C326170CqV> {
    public final /* synthetic */ C627660Ojc<InterfaceC1891350zJl> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326180CqW(C627660Ojc<InterfaceC1891350zJl> c627660Ojc) {
        super(1);
        this.LL = c627660Ojc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C326170CqV invoke(C326170CqV c326170CqV) {
        return new C326170CqV(this.LL, c326170CqV.LLILLJJLI);
    }
}
