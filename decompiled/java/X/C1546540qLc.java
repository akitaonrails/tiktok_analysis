package X;

import android.util.LruCache;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qLc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546540qLc extends C09AY implements Function1<InterfaceC1105930esx, Unit> {
    public final /* synthetic */ C1546510qLZ LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546540qLc(C1546510qLZ c1546510qLZ, String str) {
        super(1);
        this.LL = c1546510qLZ;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC1105930esx interfaceC1105930esx) {
        ((LruCache) this.LL.LJ.getValue()).remove(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
