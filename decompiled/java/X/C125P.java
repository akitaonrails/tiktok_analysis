package X;

import com.ss.android.ugc.aweme.live.livehostimpl.edit.text.bean.TextStickerData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.125P, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C125P {
    public static final boolean LIZ(C125R c125r) {
        String type;
        TextStickerData data = c125r.getData();
        if (data != null) {
            type = data.getType();
        } else {
            type = null;
        }
        return Intrinsics.LJFF(type, "type_text_sticker");
    }
}
