package X;

import android.content.Context;
import com.ss.android.ugc.aweme.composer.CreationComposerDsl;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IUIService;
import kotlin.jvm.internal.AwS0S3000000_8;
import kotlin.jvm.internal.AwS215S0300000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hs7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454570Hs7 {
    public final void LIZ(final Context context, final StickerItem stickerItem, final String str, final String str2) {
        final String str3;
        if (Intrinsics.LJFF(str2, "sticker_popup_share_panel")) {
            str3 = "sticker_popup_story";
        } else {
            str3 = "imagine_studio_story";
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            iExternalService.asyncService(String.valueOf(C13LE.LIZ(C454570Hs7.class).LJI()), new SimpleServiceLoadCallback() { // from class: X.0Mic
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    IUIService iUIServiceUiService = asyncAVService.uiService();
                    Context context2 = context;
                    CreationComposerDsl creationComposerDsl = new CreationComposerDsl();
                    String str4 = str;
                    String str5 = str2;
                    String str6 = str3;
                    C454570Hs7 c454570Hs7 = this;
                    StickerItem stickerItem2 = stickerItem;
                    Context context3 = context;
                    creationComposerDsl.basic(new AwS0S3000000_8(str4, str5, str6, 0));
                    creationComposerDsl.mixStudioShareStory(new AwS215S0300000_6(c454570Hs7, stickerItem2, context3, 31));
                    iUIServiceUiService.startCreation(context2, creationComposerDsl);
                }
            });
        }
    }
}
