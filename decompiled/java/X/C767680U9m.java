package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0U9m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767680U9m extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767680U9m(LiveEffect liveEffect, long j, long j2) {
        super(0);
        this.LL = liveEffect;
        this.LLILLJJLI = j;
        this.LLILLL = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C767630U9h.LL.LIZ(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
