package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;

/* JADX INFO: renamed from: X.0HrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454060HrI {
    public final StickerItem LIZ;
    public final EnumC454490Hrz LIZIZ;
    public final String LIZJ;
    public final Rect LIZLLL;
    public final Boolean LJ;
    public final C441010HRb LJFF;
    public final String LJI;
    public final Integer LJII;

    public C454060HrI(StickerItem stickerItem, EnumC454490Hrz enumC454490Hrz, String str, Rect rect, Boolean bool, C441010HRb c441010HRb, String str2, Integer num, int i) {
        str = (i & 4) != 0 ? null : str;
        rect = (i & 8) != 0 ? null : rect;
        bool = (i & 16) != 0 ? Boolean.FALSE : bool;
        c441010HRb = (i & 32) != 0 ? new C441010HRb(null) : c441010HRb;
        str2 = (i & 64) != 0 ? null : str2;
        num = (i & 128) != 0 ? null : num;
        this.LIZ = stickerItem;
        this.LIZIZ = enumC454490Hrz;
        this.LIZJ = str;
        this.LIZLLL = rect;
        this.LJ = bool;
        this.LJFF = c441010HRb;
        this.LJI = str2;
        this.LJII = num;
    }
}
