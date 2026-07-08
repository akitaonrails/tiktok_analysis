package X;

import com.ss.android.vesdk.VEImageDetectUtils;
import java.util.List;

/* JADX INFO: renamed from: X.18jb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21366918jb {
    public VEImageDetectUtils LIZ;

    public final synchronized void LIZ(String str, String str2, List list, VEImageDetectUtils.IDetectImageResultListener iDetectImageResultListener) {
        VEImageDetectUtils vEImageDetectUtils = new VEImageDetectUtils();
        this.LIZ = vEImageDetectUtils;
        vEImageDetectUtils.init();
        this.LIZ.setDetectImageContentListener(iDetectImageResultListener);
        this.LIZ.detectImageContent(str, str2, list, 1280, 1280);
        this.LIZ.destroy();
    }
}
