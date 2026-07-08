package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0xld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831750xld extends C09AY implements Function0<Integer> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831750xld(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(0);
        this.LL = sceneryCropPictureAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(C14KS.LJI(this.LL.getContext()));
    }
}
