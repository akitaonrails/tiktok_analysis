package X;

import android.os.Message;
import com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointGetVideoFrameManager;

/* JADX INFO: renamed from: X.0oBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1463270oBJ implements InterfaceC1464150oCj {
    public final /* synthetic */ StickPointGetVideoFrameManager LIZ;

    public C1463270oBJ(StickPointGetVideoFrameManager stickPointGetVideoFrameManager) {
        this.LIZ = stickPointGetVideoFrameManager;
    }

    @Override // X.InterfaceC1464150oCj
    public final void onProgress(float f) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 1001;
        messageObtain.obj = Float.valueOf(f);
        sendMessage(messageObtain);
    }
}
