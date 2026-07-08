package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function2;
import webcast.api.sub.PreviewDisplay;
import webcast.api.sub.SMBPreviewResponse;

/* JADX INFO: renamed from: X.0gG8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158740gG8 {
    public static final C07YJ LIZ(C1158720gG6 c1158720gG6) {
        PreviewDisplay previewDisplay;
        if (c1158720gG6 == null) {
            return new C07YJ(false, "SmbPreviewData is null");
        }
        SMBPreviewResponse.ResponseData responseData = c1158720gG6.LIZ;
        if (responseData != null && (previewDisplay = responseData.displaySwitch) != null && previewDisplay.activeSkuCount > 0) {
            return new C07YJ(true, "");
        }
        return new C07YJ(false, "SmbPreviewData has no displayable sku");
    }

    public static final boolean LIZJ(String str) {
        return !C13LP.LJJJJ(str, C1697810uHb.LJIIJJI(CardStruct.IStatusCode.DEFAULT, "null", ""));
    }

    public static void LIZIZ(View view, String str, Function2 function2) {
        C1546210qL5.LIZ.getClass();
        C2211631BhB.LJ(view, new C1161900gLE(str, C814420VxA.LIZIZ(C1546210qL5.LIZ(50)), function2));
    }
}
