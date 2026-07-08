package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0310200_8;
import x5h.d;

/* JADX INFO: renamed from: X.0Mmu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578740Mmu extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ d LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C578740Mmu(d dVar, ShortVideoContext shortVideoContext, long j, long j2, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.LL = dVar;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = j;
        this.LLILZ = j2;
        this.LLILZIL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        C0CNO.LIZLLL(0L, new AwS0S0310200_8(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, bool.booleanValue(), 0));
        return Unit.LIZ;
    }
}
