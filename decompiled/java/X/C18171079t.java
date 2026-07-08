package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.079t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18171079t extends C09AY implements Function0<Boolean> {
    public C18171079t() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Boolean invoke() {
        boolean z = false;
        try {
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "photo_mode_swipe_detect_on_non_image_area", true, false)) {
                z = true;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.valueOf(z);
    }
}
