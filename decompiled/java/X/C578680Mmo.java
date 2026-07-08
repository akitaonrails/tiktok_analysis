package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0310200_8;
import x5h.d;

/* JADX INFO: renamed from: X.0Mmo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578680Mmo extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ d LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C578680Mmo(String str, ShortVideoContext shortVideoContext, d dVar, long j, long j2, Function1<? super Boolean, Unit> function1) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = dVar;
        this.LLILZ = j;
        this.LLILZIL = j2;
        this.LLILZLL = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C1458370o3P c1458370o3P = C1458370o3P.LIZ;
        String str = this.LL;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        c1458370o3P.getClass();
        C1458370o3P.LJJIIZI(str, shortVideoContext, true, false);
        C0CNO.LIZLLL(0L, new AwS0S0310200_8(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, this.LLILZLL, zBooleanValue, 1));
        return Unit.LIZ;
    }
}
