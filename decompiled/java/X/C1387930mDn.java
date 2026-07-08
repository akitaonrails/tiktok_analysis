package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0mDn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1387930mDn extends C09AY implements Function1<C2002007so, C2002007so> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI = true;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1387930mDn(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2002007so invoke(C2002007so c2002007so) {
        String str = this.LL;
        boolean z = this.LLILLJJLI;
        c2002007so.getClass();
        return new C2002007so(str, z);
    }
}
