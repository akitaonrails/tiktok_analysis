package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U9n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C767690U9n extends C09AY implements Function1<LiveEffect, Unit> {
    public final /* synthetic */ C767630U9h LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767690U9n(C767630U9h c767630U9h, String str, long j, long j2) {
        super(1);
        this.LL = c767630U9h;
        this.LLILLJJLI = str;
        this.LLILLL = j;
        this.LLILZ = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(LiveEffect liveEffect) {
        C767630U9h c767630U9h = this.LL;
        String str = this.LLILLJJLI;
        long j = this.LLILLL;
        long j2 = this.LLILZ;
        c767630U9h.getClass();
        C767630U9h.LIZIZ(liveEffect, str, j, j2);
        return Unit.LIZ;
    }
}
