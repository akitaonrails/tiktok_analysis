package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;

/* JADX INFO: renamed from: X.0HrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454070HrJ {
    public final StickerItem LIZ;
    public final EnumC454490Hrz LIZIZ;
    public final Rect LIZJ;
    public final C441010HRb LIZLLL;

    public /* synthetic */ C454070HrJ(StickerItem stickerItem, EnumC454490Hrz enumC454490Hrz, Rect rect, int i) {
        C441010HRb c441010HRb;
        Rect rect2 = (i & 8) != 0 ? null : rect;
        if ((i & 16) != 0) {
            c441010HRb = new C441010HRb(null);
        } else {
            c441010HRb = null;
        }
        this(stickerItem, enumC454490Hrz, null, rect2, c441010HRb);
    }

    public C454070HrJ(StickerItem stickerItem, EnumC454490Hrz enumC454490Hrz, String str, Rect rect, C441010HRb c441010HRb) {
        this.LIZ = stickerItem;
        this.LIZIZ = enumC454490Hrz;
        this.LIZJ = rect;
        this.LIZLLL = c441010HRb;
    }
}
