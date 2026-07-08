package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;

/* JADX INFO: renamed from: X.0ZSY, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public interface C0ZSY {
    boolean isVESDKReady();

    void openStickerCreationActivity(Context context, Integer num, String str, Integer num2, C0ZQT c0zqt, Bundle bundle);

    void photo2sticker(Activity activity, MediaModel mediaModel, C0ZQT c0zqt, EnumC902270ZaT enumC902270ZaT, IVideo2StickerService.Callback callback);

    void photo2sticker(Activity activity, String str, C0ZQT c0zqt, EnumC902270ZaT enumC902270ZaT, IVideo2StickerService.Callback callback);
}
