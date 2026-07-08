package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0H8P, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H8P extends C09AY implements Function1<C2003707t5, C2003707t5> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H8P(long j, long j2) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ C2003707t5 invoke(C2003707t5 c2003707t5) {
        String strK4 = C786410Ut5.k4(null, "%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(this.LL), Long.valueOf(this.LLILLJJLI)}, 2));
        c2003707t5.getClass();
        return new C2003707t5(strK4);
    }
}
