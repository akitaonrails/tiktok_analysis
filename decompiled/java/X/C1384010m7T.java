package X;

import android.view.View;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.DanmakuPresentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0m7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class C1384010m7T extends C2217421BqW implements Function0<Unit> {
    public C1384010m7T(ReusedUIAssem reusedUIAssem) {
        super(0, reusedUIAssem, DanmakuPresentAssem.class, "toastJump", "toastJump()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        DanmakuPresentAssem danmakuPresentAssem = (DanmakuPresentAssem) this.receiver;
        if (danmakuPresentAssem.LLJZIJLIL != null) {
            View view = danmakuPresentAssem.LLJZIJLIL;
            C1389890mGx c1389890mGx = new C1389890mGx(view != null ? view : null);
            c1389890mGx.LJIIIZ(2131838742);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }
}
