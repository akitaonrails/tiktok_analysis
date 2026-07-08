package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.1290, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1290 extends RecyclerView.ViewHolder {
    public final AnonymousClass1297 LL;
    public MusicModel LLILLJJLI;
    public final View LLILLL;
    public final C19470511Fn LLILZ;
    public final TextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public final View LLIZLLLIL;
    public final TuxTextView LLJ;
    public final TextView LLJI;
    public final TuxIconView LLJIJIL;
    public String LLJILJIL;

    public static final void L5(C19470511Fn c19470511Fn) {
        c19470511Fn.LIZIZ(new BitmapDrawable(c19470511Fn.getResources(), C417560GYw.LIZ(BitmapFactory.decodeResource(c19470511Fn.getResources(), R.drawable.bzi), C418440Gaw.LIZIZ(4))));
        c19470511Fn.getImageView().setBackground(c19470511Fn.LLJLL);
    }

    public final void I5(MusicModel musicModel) {
        int size;
        int i;
        String quantityString;
        Resources resources;
        List<MusicModel> similarMusicList;
        if (musicModel != null && (similarMusicList = musicModel.getSimilarMusicList()) != null) {
            size = similarMusicList.size();
        } else {
            size = 0;
        }
        TuxTextView tuxTextView = this.LLILZLL;
        if (tuxTextView != null) {
            Context context = this.itemView.getContext();
            if (context != null && (resources = context.getResources()) != null) {
                quantityString = resources.getQuantityString(2131755637, size, Integer.valueOf(size));
            } else {
                quantityString = null;
            }
            tuxTextView.setText(quantityString);
        }
        TuxIconView tuxIconView = this.LLIZ;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            if (musicModel != null && musicModel.isUnfold()) {
                i = R.raw.icon_chevron_up_fill;
            } else {
                i = R.raw.icon_chevron_down_fill;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AnonymousClass1290(X.C129C r17, android.view.View r18, X.AnonymousClass1297 r19) {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1290.<init>(X.129C, android.view.View, X.1297):void");
    }
}
