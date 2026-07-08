package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JUP extends C09AY implements Function1<C0JUV, C0JUV> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ ArrayList<C0JUN> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0JUP(int i, int i2, C013C c013c, C013C c013c2, ArrayList<C0JUN> arrayList) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c013c;
        this.LLILZ = c013c2;
        this.LLILZIL = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0JUV invoke(C0JUV c0juv) {
        return C0JUV.LIZ(c0juv, null, this.LLILZIL, new Pair(Integer.valueOf(this.LL - 1), Integer.valueOf(this.LLILLJJLI)), this.LLILZ.element, null, null, new C291001Au(Boolean.valueOf(this.LLILLL.element)), 49);
    }
}
