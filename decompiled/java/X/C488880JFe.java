package X;

import com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessToolbarWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JFe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C488880JFe extends C2217421BqW implements Function0<Unit> {
    public C488880JFe(DrawGuessToolbarWidget drawGuessToolbarWidget) {
        super(0, drawGuessToolbarWidget, DrawGuessToolbarWidget.class, "resetRevealingAnswer", "resetRevealingAnswer()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((DrawGuessToolbarWidget) this.receiver).LLJJ = false;
        return Unit.LIZ;
    }
}
