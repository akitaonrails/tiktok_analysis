package X;

import com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.DMCameraPhotoCardAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZoU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class C910960ZoU extends C2217421BqW implements Function0<Boolean> {
    public C910960ZoU(DMCameraPhotoCardAssem dMCameraPhotoCardAssem) {
        super(0, dMCameraPhotoCardAssem, DMCameraPhotoCardAssem.class, "checkIsOnFirstScreen", "checkIsOnFirstScreen()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(((DMCameraPhotoCardAssem) this.receiver).tp());
    }
}
