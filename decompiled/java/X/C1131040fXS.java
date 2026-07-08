package X;

import com.bytedance.android.livesdk.comp.api.musicgift.SaveMusicGiftFavoriteEvent;
import com.bytedance.android.livesdk.gift.base.business.dialog.v2.favorite.SaveFavoriteGiftEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0fXS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131040fXS {
    public static final void LIZ(EnumC1131030fXR enumC1131030fXR, DataChannel dataChannel, List<Long> list) {
        int i = C1131050fXT.LIZ[enumC1131030fXR.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (dataChannel != null) {
                    dataChannel.LC0(SaveMusicGiftFavoriteEvent.class, list);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
        if (dataChannel == null) {
            return;
        }
        dataChannel.LC0(SaveFavoriteGiftEvent.class, list);
    }
}
