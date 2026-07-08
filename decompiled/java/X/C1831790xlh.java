package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xlh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831790xlh extends C09AY implements Function0<C1836120xsg> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831790xlh(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(0);
        this.LL = sceneryCropPictureAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0xsg, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C1836120xsg invoke() {
        return this.LL.getContentView().findViewById(R.id.rp_);
    }
}
