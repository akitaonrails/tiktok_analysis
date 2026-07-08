package X;

import Y.ACListenerS163S0100000_29;
import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.122L, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C122L extends C122I {
    public VideoPublishEditModel LJIIL;
    public StickerItemModel LJIILIIL;

    public final boolean LJIIJ() {
        VideoPublishEditModel videoPublishEditModel = this.LJIIL;
        return (videoPublishEditModel == null || C1428470nHB.LLIIIJ(videoPublishEditModel)) ? false : true;
    }

    public final boolean LJIIJJI() {
        VideoPublishEditModel videoPublishEditModel;
        VideoPublishEditModel videoPublishEditModel2 = this.LJIIL;
        return (videoPublishEditModel2 == null || C1428470nHB.LJJZZI(videoPublishEditModel2) || (videoPublishEditModel = this.LJIIL) == null || !C1416310mxZ.LJJJLZIJ(videoPublishEditModel, C1428550nHJ.LIZ())) ? false : true;
    }

    public final boolean LJIIL() {
        StickerItemModel stickerItemModel;
        if (this.LIZJ == null || (stickerItemModel = this.LJIILIIL) == null || stickerItemModel.type != 7) {
            return false;
        }
        return C0FWJ.LIZIZ();
    }

    @Override // X.C122I
    public final View LJFF() {
        LinearLayout linearLayoutLIZIZ;
        LinearLayout linearLayoutLIZLLL = LIZLLL();
        VideoPublishEditModel videoPublishEditModel = this.LJIIL;
        if (videoPublishEditModel != null && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            LinearLayout linearLayoutLIZIZ2 = LIZIZ(R.drawable.bxh, 2131826910);
            C786410Ut5.R7(linearLayoutLIZIZ2, new ACListenerS163S0100000_29(this, 248));
            linearLayoutLIZLLL.addView(linearLayoutLIZIZ2);
            return linearLayoutLIZLLL;
        }
        LinearLayout linearLayoutLIZIZ3 = LIZIZ(R.drawable.a_s, 2131829856);
        C786410Ut5.R7(linearLayoutLIZIZ3, new ACListenerS163S0100000_29(this, 249));
        LinearLayout linearLayoutLIZIZ4 = LIZIZ(R.drawable.a_u, 2131829851);
        C786410Ut5.R7(linearLayoutLIZIZ4, new ACListenerS163S0100000_29(this, 250));
        if (LJIIL()) {
            linearLayoutLIZIZ = LIZIZ(R.drawable.a_v, 2131844799);
            C786410Ut5.R7(linearLayoutLIZIZ, new ACListenerS163S0100000_29(this, 251));
        } else {
            linearLayoutLIZIZ = null;
        }
        if (LJIIJ()) {
            linearLayoutLIZLLL.addView(linearLayoutLIZIZ3);
            linearLayoutLIZLLL.addView(LIZJ());
        }
        if (LJIIJJI()) {
            C786410Ut5.W4(linearLayoutLIZIZ3, 0.5f);
            C786410Ut5.R7(linearLayoutLIZIZ3, new View.OnClickListener() { // from class: X.122N
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        if (linearLayoutLIZIZ != null) {
            linearLayoutLIZLLL.addView(linearLayoutLIZIZ);
            linearLayoutLIZLLL.addView(LIZJ());
        }
        linearLayoutLIZLLL.addView(linearLayoutLIZIZ4);
        return linearLayoutLIZLLL;
    }

    @Override // X.C122I
    public final boolean LIZ(C451220Hmi c451220Hmi) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel = this.LJIIL;
        if (videoPublishEditModel != null && C1428470nHB.LJJZZI(videoPublishEditModel)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C450840Hm6 c450840Hm6 = new C450840Hm6();
            c450840Hm6.LIZ = R.drawable.bxh;
            c450840Hm6.LIZJ = 2131826910;
            c450840Hm6.LJ = R.attr.ee;
            c450840Hm6.LIZIZ = R.attr.ee;
            c450840Hm6.LJFF = new ACListenerS163S0100000_29(this, 244);
            c451220Hmi.LIZIZ(c450840Hm6);
            return true;
        }
        if (LJIIJ()) {
            C450840Hm6 c450840Hm62 = new C450840Hm6();
            c450840Hm62.LIZ = R.drawable.a_s;
            c450840Hm62.LIZJ = 2131829856;
            c450840Hm62.LJ = R.attr.ee;
            c450840Hm62.LIZIZ = R.attr.ee;
            if (LJIIJJI()) {
                c450840Hm62.LJ = R.attr.eh;
                c450840Hm62.LIZIZ = R.attr.eh;
            }
            c450840Hm62.LJFF = new ACListenerS163S0100000_29(this, 245);
            c451220Hmi.LIZIZ(c450840Hm62);
        }
        if (LJIIL()) {
            C450840Hm6 c450840Hm63 = new C450840Hm6();
            c450840Hm63.LIZ = R.drawable.a_v;
            c450840Hm63.LIZJ = 2131844799;
            c450840Hm63.LJ = R.attr.ee;
            c450840Hm63.LIZIZ = R.attr.ee;
            c450840Hm63.LJFF = new ACListenerS163S0100000_29(this, 246);
            c451220Hmi.LIZIZ(c450840Hm63);
        }
        C450840Hm6 c450840Hm64 = new C450840Hm6();
        c450840Hm64.LIZ = R.drawable.a_u;
        c450840Hm64.LJ = R.attr.ee;
        c450840Hm64.LIZIZ = R.attr.ee;
        c450840Hm64.LIZJ = 2131829851;
        c450840Hm64.LJFF = new ACListenerS163S0100000_29(this, 247);
        c451220Hmi.LIZIZ(c450840Hm64);
        int i = (LJIIJ() ? 1 : 0) + 1 + (LJIIL() ? 1 : 0);
        if (i > 0) {
            this.LJIIIZ = i;
        }
        return true;
    }

    public C122L(View view, C122J c122j) {
        super(view, c122j);
    }
}
