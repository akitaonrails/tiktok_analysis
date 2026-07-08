package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xle, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831760xle extends C09AY implements Function0<Integer> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831760xle(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(0);
        this.LL = sceneryCropPictureAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C14KS.LJ(this.LL.getContext()));
    }
}
