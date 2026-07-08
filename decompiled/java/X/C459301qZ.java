package X;

import android.content.Context;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import java.util.List;

/* JADX INFO: renamed from: X.01qZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C459301qZ {
    public static C459401qa LIZ(Context context, GiftHintInfo giftHintInfo) {
        List urls;
        C459401qa c459401qa = new C459401qa(context);
        ImageModel imageModel = giftHintInfo.hintIcon;
        c459401qa.LL.setBackground(null);
        if (imageModel != null && (urls = imageModel.getUrls()) != null) {
            C1819620xS4.LIZ().LIZJ(urls).LJJI(c459401qa.LL);
        }
        c459401qa.setText(giftHintInfo.hintText);
        return c459401qa;
    }
}
