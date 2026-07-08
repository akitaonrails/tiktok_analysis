package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureSelectorCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1829910xif extends C09AY implements Function0<C19R6> {
    public final /* synthetic */ SceneryPictureSelectorCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1829910xif(SceneryPictureSelectorCell sceneryPictureSelectorCell) {
        super(0);
        this.LL = sceneryPictureSelectorCell;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19R6, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C19R6 invoke() {
        return this.LL.itemView.findViewById(R.id.bnu);
    }
}
