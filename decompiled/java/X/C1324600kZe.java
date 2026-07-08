package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.livesetting.other.EnableImageDefault565Setting;

/* JADX INFO: renamed from: X.0kZe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1324600kZe {
    public final ImageModel LIZ;
    public final boolean LIZIZ = EnableImageDefault565Setting.INSTANCE.getValue();

    public C1324600kZe(ImageModel imageModel) {
        this.LIZ = imageModel;
    }

    public final void LIZ(C1324720kZq c1324720kZq) {
        C1324570kZb.LIZLLL(c1324720kZq, this.LIZ, null, null, null, false, this.LIZIZ);
    }
}
