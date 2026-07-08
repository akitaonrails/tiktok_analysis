package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MIp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C566210MIp extends C2217421BqW implements Function0<Unit> {
    public C566210MIp(C0MJC c0mjc) {
        super(0, c0mjc, C0MJC.class, "showProgressScreen", "showProgressScreen()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0MJC c0mjc = (C0MJC) this.receiver;
        FrameLayout frameLayout = c0mjc.LLJ;
        if (frameLayout != null) {
            C786410Ut5.LJJJZ((View) c0mjc.LLJJIJI.getValue(), frameLayout);
        }
        Effect effect = c0mjc.LLJILLL;
        if (effect != null) {
            ((C566170MIl) c0mjc.LLJJI.getValue()).Ey(effect);
        }
        return Unit.LIZ;
    }
}
