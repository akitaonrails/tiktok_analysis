package X;

import com.ss.android.ugc.aweme.photo.PhotoStrategyImplService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1ApF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191151ApF extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PhotoStrategyImplService LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2191151ApF(PhotoStrategyImplService photoStrategyImplService) {
        super(0);
        this.LL = photoStrategyImplService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0S78.LIZJ(new C2191161ApG(this.LL), true);
        return Unit.LIZ;
    }
}
