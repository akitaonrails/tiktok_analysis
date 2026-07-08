package X;

import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492920JUs extends C09AY implements Function1<C492830JUj, C492830JUj> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ ArrayList<AbstractC492880JUo> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C492920JUs(int i, int i2, C013C c013c, ArrayList<AbstractC492880JUo> arrayList) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = c013c;
        this.LLILZ = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C492830JUj invoke(C492830JUj c492830JUj) {
        return C492830JUj.LIZ(c492830JUj, this.LLILZ, new Pair(Integer.valueOf(this.LL - 1), Integer.valueOf(this.LLILLJJLI)), this.LLILLL.element, null, null, new C291001Au(Boolean.TRUE), null, 88);
    }
}
