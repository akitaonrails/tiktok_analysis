package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831770xlf extends C09AY implements Function0<C21513519Hh> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831770xlf(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(0);
        this.LL = sceneryCropPictureAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19Hh, android.view.View] */
    @Override // kotlin.jvm.functions.Function0
    public final C21513519Hh invoke() {
        return this.LL.getContentView().findViewById(R.id.ld7);
    }
}
