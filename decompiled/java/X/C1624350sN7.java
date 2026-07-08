package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* JADX INFO: renamed from: X.0sN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1624350sN7 {
    public static final AVMusic LIZ(FaceStickerBean faceStickerBean) {
        InterfaceC1629560sVW interfaceC1629560sVW = C1624360sN8.LIZ.get(String.valueOf(faceStickerBean.getStickerId()));
        if (interfaceC1629560sVW instanceof AVMusic) {
            return (AVMusic) interfaceC1629560sVW;
        }
        return null;
    }
}
