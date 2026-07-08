package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;

/* JADX INFO: renamed from: X.0Ke4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C522300Ke4 {
    public boolean LIZ;
    public boolean LIZIZ;
    public EnumC2249508rd LIZJ = EnumC2249508rd.MIX;

    public final C0L9A LIZ() {
        return (this.LIZ && C0C64.LJIILLIIL().LJIJ(31744, 0, "story_standalone_album_page_layout", true) == 1) ? C0L9A.NINE_TO_SIXTEEN : (this.LIZ && C0C64.LJIILLIIL().LJIJ(31744, 0, "story_standalone_album_page_layout", true) == 2) ? C0L9A.THREE_TO_FOUR : C0L9A.ONE_TO_ONE;
    }

    public final void LIZIZ(ShortVideoContext shortVideoContext) {
        EnumC2249508rd enumC2249508rd;
        if (shortVideoContext != null && d4.LIZIZ(shortVideoContext)) {
            enumC2249508rd = EnumC2249508rd.PHOTO;
        } else {
            enumC2249508rd = EnumC2249508rd.MIX;
        }
        this.LIZJ = enumC2249508rd;
    }
}
