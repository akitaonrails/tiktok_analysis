package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FVW, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FVW {
    public static final boolean LIZ(C196925122x c196925122x) {
        String type;
        TextStickerData data = c196925122x.getData();
        if (data != null) {
            type = data.getType();
        } else {
            type = null;
        }
        return Intrinsics.LJFF(type, "type_inline_caption");
    }

    public static final boolean LIZIZ(C196925122x c196925122x) {
        String type;
        TextStickerData data = c196925122x.getData();
        if (data != null) {
            type = data.getType();
        } else {
            type = null;
        }
        return Intrinsics.LJFF(type, "type_text_sticker");
    }
}
