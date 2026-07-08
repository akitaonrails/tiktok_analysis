package X;

import com.bytedance.android.livesdkapi.host.user.IHostPad;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C480280IsU extends C09AY implements Function0<Boolean> {
    public C480280IsU() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0C64.LJIILLIIL().LJIIIZ(31744, "toplive_new_page_enable", true, false) && !((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).o4());
    }
}
