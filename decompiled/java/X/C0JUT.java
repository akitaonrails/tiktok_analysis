package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUT, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUT extends C09AY implements Function1<C0JUV, C0JUV> {
    public final /* synthetic */ List<C0JUN> LL;
    public final /* synthetic */ List<C0JUN> LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C118300cf LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUT(List<C0JUN> list, List<C0JUN> list2, int i, C118300cf c118300cf, C013C c013c) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = i;
        this.LLILZ = c118300cf;
        this.LLILZIL = c013c;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JUV invoke(C0JUV c0juv) {
        return C0JUV.LIZ(c0juv, this.LL, this.LLILLJJLI, new Pair(Integer.valueOf(this.LLILLL), Integer.valueOf(this.LLILZ.element)), this.LLILZIL.element, null, null, null, 112);
    }
}
