package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Iwi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C482900Iwi extends C09AY implements Function0<String> {
    public final /* synthetic */ C0J70 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482900Iwi(C0J70 c0j70) {
        super(0);
        this.LL = c0j70;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str = (Intrinsics.LJFF(this.LL.LIZIZ, "toplive_core") || Intrinsics.LJFF(this.LL.LIZIZ, "social_core") || Intrinsics.LJFF(this.LL.LIZIZ, "game_core")) ? "live_toplive_discover" : !Intrinsics.LJFF(this.LL.LIZIZ, "newfollow") ? "live_toplive_following" : "";
        this.LL.getClass();
        this.LL.getClass();
        return str;
    }
}
