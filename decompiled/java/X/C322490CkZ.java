package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C322490CkZ {
    public static final Map<String, String> LIZ(NewFaceStickerBean newFaceStickerBean, String str, boolean z) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LIZJ(newFaceStickerBean.effectSource, "effect_source");
        c2344009Gk.LJIIIIZZ("prop_id", newFaceStickerBean.effectId);
        if (str == null) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("enter_from", str);
        String str3 = newFaceStickerBean.ownerId;
        boolean z2 = false;
        if (str3 != null && str3.length() != 0 && Intrinsics.LJFF(str3, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            z2 = true;
        }
        String str4 = "1";
        if (z2) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("is_self", str2);
        if (!z) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        c2344009Gk.LJIIIIZZ("if_has_post", str4);
        return c2344009Gk.LIZ;
    }
}
