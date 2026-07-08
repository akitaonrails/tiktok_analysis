package X;

import Y.ALAdapterS0S0110000_5;
import android.view.View;
import com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.SoftKeyBoardListener;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS234S0000000_5;

/* JADX INFO: renamed from: X.0FJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C388210FJz extends C388270FKf {
    public final C388170FJv LIZIZ;
    public final C385340F8y LIZJ;
    public final C388200FJy LIZLLL;
    public final C1664680tQA<TextStickerModel> LJ;

    public final void LJIIIZ() {
        this.LIZJ.setEnabled(false);
        LJIIIIZZ(false);
        this.LIZJ.animate().scaleX(this.LJ.LIZ.getBaseStickerModel().getScale()).scaleY(this.LJ.LIZ.getBaseStickerModel().getScale()).rotationBy(this.LJ.LIZ.getBaseStickerModel().getRotation()).setDuration(100L).setListener(new ALAdapterS0S0110000_5(this, 8)).start();
    }

    public final void LJIIIIZZ(boolean z) {
        int i;
        C388200FJy c388200FJy = this.LIZLLL;
        if (!z) {
            C0FKW c0fkw = (C0FKW) c388200FJy.LIZJ(C13LE.LIZ(C0FKW.class));
            if (c0fkw != null) {
                c0fkw.LJIIJ();
            }
            this.LIZLLL.LJIIJ.LIZLLL(AFwS234S0000000_5.get$arr$(567), true);
        }
        C0FKS c0fks = (C0FKS) c388200FJy.LIZJ(C13LE.LIZ(C0FKS.class));
        if (c0fks != null) {
            c0fks.LJIIJ(z);
        }
        View viewFindViewById = this.LIZIZ.findViewById(R.id.xqd);
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        C786410Ut5.LJLLLLLL(i, viewFindViewById);
        C786410Ut5.c2(this.LIZJ, 0);
        C786410Ut5.T5(this.LIZJ, 1.0f);
    }

    public C388210FJz(C388170FJv c388170FJv, C385340F8y c385340F8y, C388200FJy c388200FJy, SoftKeyBoardListener softKeyBoardListener, C1664680tQA<TextStickerModel> c1664680tQA) {
        super(c388200FJy);
        this.LIZIZ = c388170FJv;
        this.LIZJ = c385340F8y;
        this.LIZLLL = c388200FJy;
        this.LJ = c1664680tQA;
    }
}
