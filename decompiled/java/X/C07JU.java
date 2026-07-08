package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07JU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07JU extends C09AY implements Function0<Boolean> {
    public C07JU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "player_cold_cache_keep_unused_video", true, false) && !C07JK.LIZ()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
