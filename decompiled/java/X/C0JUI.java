package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUI extends C09AY implements Function1<C0JUV, C0JUV> {
    public final /* synthetic */ C0JUN LL;
    public final /* synthetic */ C0JUO LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUI(C0JUN c0jun, C0JUO c0juo) {
        super(1);
        this.LL = c0jun;
        this.LLILLJJLI = c0juo;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JUV invoke(C0JUV c0juv) {
        return C0JUV.LIZ(c0juv, null, null, null, false, new C291001Au(new Pair(this.LL, this.LLILLJJLI)), null, null, 111);
    }
}
