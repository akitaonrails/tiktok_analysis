package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryAiGeneratedPictureCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xi3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1829530xi3 extends C09AY implements Function0<C19R6> {
    public final /* synthetic */ SceneryAiGeneratedPictureCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829530xi3(SceneryAiGeneratedPictureCell sceneryAiGeneratedPictureCell) {
        super(0);
        this.LL = sceneryAiGeneratedPictureCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19R6, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C19R6 invoke() {
        return this.LL.itemView.findViewById(R.id.bnu);
    }
}
