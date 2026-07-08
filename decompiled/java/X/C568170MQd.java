package X;

import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.OnThisDayCardPreviewScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MQd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C568170MQd extends C2217421BqW implements Function0<Unit> {
    public C568170MQd(OnThisDayCardPreviewScene onThisDayCardPreviewScene) {
        super(0, onThisDayCardPreviewScene, OnThisDayCardPreviewScene.class, "onStickerPreviewTouch", "onStickerPreviewTouch()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC568220MQi interfaceC568220MQi;
        OnThisDayCardPreviewScene onThisDayCardPreviewScene = (OnThisDayCardPreviewScene) this.receiver;
        onThisDayCardPreviewScene.getClass();
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "enable_otd_ui_preview_jump_edit", true, false)) {
            onThisDayCardPreviewScene.LLLLLJIL();
        } else {
            AbstractC568240MQk abstractC568240MQkLLLLLLIL = onThisDayCardPreviewScene.LLLLLLIL();
            if (abstractC568240MQkLLLLLLIL != null && (interfaceC568220MQi = abstractC568240MQkLLLLLLIL.LLJJJJLIIL) != null) {
                interfaceC568220MQi.gx1();
            }
        }
        return Unit.LIZ;
    }
}
