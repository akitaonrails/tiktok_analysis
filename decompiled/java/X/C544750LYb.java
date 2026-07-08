package X;

import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LYb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C544750LYb extends C1696260uF6 implements Function0<Unit> {
    public C544750LYb(AIGCGenerationComponent aIGCGenerationComponent) {
        super(0, aIGCGenerationComponent, AIGCGenerationComponent.class, "onBackPressed", "onBackPressed()Z", 8);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ((AIGCGenerationComponent) this.receiver).onBackPressed();
        return Unit.LIZ;
    }
}
