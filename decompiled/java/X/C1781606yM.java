package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06yM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1781606yM extends C09AY implements Function0<Boolean> {
    public C1781606yM() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z = true;
        if (!C1786206z6.LIZ() && C0C64.LJIILLIIL().LJIJ(31744, 0, "player_prerender_texture_available_repeat_opt", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
