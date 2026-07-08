package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.browser.emote.CropEmoteFragment;

/* JADX INFO: renamed from: X.15xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20689715xf {
    public static CropEmoteFragment LIZ(String str) {
        CropEmoteFragment cropEmoteFragment = new CropEmoteFragment();
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("arg_origin_data", str, bundle);
        cropEmoteFragment.setArguments(bundle);
        return cropEmoteFragment;
    }
}
