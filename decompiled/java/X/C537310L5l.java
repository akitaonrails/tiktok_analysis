package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS3S2400000_8;
import kotlin.jvm.internal.AwS93S1200000_8;

/* JADX INFO: renamed from: X.0L5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C537310L5l extends C09AY implements Function1<C1397620mTQ, Unit> {
    public final /* synthetic */ Function0<Unit> LL;
    public final /* synthetic */ ShortVideoContext LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String[] LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537310L5l(Function0<Unit> function0, ShortVideoContext shortVideoContext, String str, String[] strArr, C19EG c19eg, String str2, Function0<Unit> function02, Function0<Unit> function03) {
        super(1);
        this.LL = function0;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = str;
        this.LLILZ = strArr;
        this.LLILZIL = c19eg;
        this.LLILZLL = str2;
        this.LLIZ = function02;
        this.LLIZLLLIL = function03;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397620mTQ c1397620mTQ) {
        C1397620mTQ c1397620mTQ2 = c1397620mTQ;
        c1397620mTQ2.LJFF(2131829677, new AwS93S1200000_8((Function0) this.LL, (Function0<Unit>) this.LLILLJJLI, (ShortVideoContext) this.LLILLL, (String) 3));
        c1397620mTQ2.LJII(2131829676, new AwS3S2400000_8(this.LLILZ, (String[]) this.LLILZIL, (C19EG) this.LLILZLL, (String) this.LLIZ, (Function0<Unit>) this.LLILLJJLI, (ShortVideoContext) this.LLILLL, (String) 1));
        c1397620mTQ2.LJII(2131829675, new AwS3S2400000_8(this.LLILZ, (String[]) this.LLILZIL, (C19EG) this.LLILZLL, (String) this.LLIZLLLIL, (Function0<Unit>) this.LLILLJJLI, (ShortVideoContext) this.LLILLL, (String) 2));
        return Unit.LIZ;
    }
}
