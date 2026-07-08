package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.layout.imageselector.picturechunk.SceneryPictureAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05vT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1508905vT extends C09AY implements Function0<ViewOnAttachStateChangeListenerC20604515jv> {
    public final /* synthetic */ SceneryPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1508905vT(SceneryPictureAssem sceneryPictureAssem) {
        super(0);
        this.LL = sceneryPictureAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.15jv, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final ViewOnAttachStateChangeListenerC20604515jv invoke() {
        return this.LL.LJJIJL().findViewById(R.id.qfp);
    }
}
