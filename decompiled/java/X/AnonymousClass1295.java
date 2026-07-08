package X;

import Y.ACListenerS131S0200000_29;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicTag;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.1295, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1295 extends RecyclerView.ViewHolder {
    public final C129C LL;
    public final AnonymousClass1297 LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final C1295960jpS LLILZIL;
    public final View LLILZLL;
    public final C19470611Fo LLIZ;
    public final TextView LLIZLLLIL;
    public final TextView LLJ;
    public final TextView LLJI;
    public final TextView LLJIJIL;
    public final TuxIconView LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final TextView LLJILLL;
    public final View LLJJ;
    public final View LLJJI;
    public final View LLJJIII;
    public final View LLJJIJI;
    public final ImageView LLJJIJIIJIL;
    public final C197039127h LLJJIJIL;
    public String LLJJJ;
    public String LLJJJIL;
    public boolean LLJJJJ;

    public static final String L5(int i) {
        int i2 = i / LSPassThroughRecordSizeConfig.DEFAULT;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)}, 2));
        }
        return C786410Ut5.k4(Locale.getDefault(), "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)}, 3));
    }

    public static final void P5(C19470511Fn c19470511Fn) {
        c19470511Fn.LIZIZ(c19470511Fn.getContext().getDrawable(R.drawable.bzi));
        c19470511Fn.getImageView().setBackground(c19470511Fn.LLJLL);
    }

    public final boolean N5(MusicModel musicModel) {
        List<MusicTag> musicTags;
        String tagTitle;
        MusicTag musicTag;
        if (!this.LLILZ || (musicTags = musicModel.getMusicTags()) == null || musicTags.isEmpty()) {
            return false;
        }
        List<MusicTag> musicTags2 = musicModel.getMusicTags();
        if (musicTags2 != null && (musicTag = (MusicTag) C13LP.LJJJLL(musicTags2)) != null) {
            tagTitle = musicTag.getTagTitle();
        } else {
            tagTitle = null;
        }
        if (!C123100dR.LIZ(tagTitle)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I5(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r23, boolean r24, boolean r25) {
        /*
            Method dump skipped, instruction units count: 2261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1295.I5(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, boolean, boolean):void");
    }

    public AnonymousClass1295(C129C c129c, View view, AnonymousClass1297 anonymousClass1297, boolean z) {
        super(view);
        this.LL = c129c;
        this.LLILLJJLI = anonymousClass1297;
        this.LLILLL = false;
        this.LLILZ = z;
        C19470611Fo c19470611Fo = (C19470611Fo) view.findViewById(R.id.l2i);
        this.LLIZ = c19470611Fo;
        this.LLIZLLLIL = (TextView) view.findViewById(R.id.zy_);
        this.LLJ = (TextView) view.findViewById(R.id.tv_similar_tag);
        this.LLJI = (TextView) view.findViewById(R.id.zyg);
        this.LLJIJIL = (TextView) view.findViewById(R.id.tv_promo_tag);
        this.LLJILJIL = (TuxIconView) view.findViewById(R.id.ovk);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.title);
        this.LLJILLL = (TextView) view.findViewById(R.id.z_i);
        View viewFindViewById = view.findViewById(R.id.vma);
        this.LLJJ = viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.lv6);
        this.LLJJI = viewFindViewById2;
        this.LLJJIII = view.findViewById(R.id.lv7);
        ImageView imageView = (ImageView) view.findViewById(R.id.e6h);
        this.LLJJIJIIJIL = imageView;
        View viewFindViewById3 = view.findViewById(R.id.fe5);
        this.LLJJIJI = viewFindViewById3;
        C197039127h c197039127h = (C197039127h) view.findViewById(R.id.l4l);
        this.LLJJIJIL = c197039127h;
        this.LLILZIL = (C1295960jpS) view.findViewById(R.id.nro);
        this.LLILZLL = view.findViewById(R.id.vertical_item_music_new_rl);
        if (c19470611Fo != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, view.getContext());
            c19470611Fo.setClickStatusColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        }
        if (c197039127h != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(6));
            c197039127h.setBackground(c384050F3z.LIZ(c197039127h.getContext()));
        }
        C786410Ut5.I7(new ACListenerS131S0200000_29(this, view, 43), view);
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS131S0200000_29(this, view, 44), viewFindViewById);
        }
        if (viewFindViewById3 != null) {
            C786410Ut5.I7(new ACListenerS131S0200000_29(this, view, 45), viewFindViewById3);
        }
        if (imageView != null) {
            C786410Ut5.Q7(imageView, new ACListenerS131S0200000_29(this, view, 46));
        }
        if (c197039127h != null) {
            C786410Ut5.U8(c197039127h, new ACListenerS131S0200000_29(this, view, 47));
        }
        int iLIZJ = (int) C12ES.LIZJ(10.0f, view.getContext());
        int iLIZJ2 = (int) C12ES.LIZJ(44.0f, view.getContext());
        int iLIZJ3 = (int) C12ES.LIZJ(44.0f, view.getContext());
        if (viewFindViewById3 != null) {
            ViewGroup.LayoutParams layoutParams = viewFindViewById3.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = iLIZJ2;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById3.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = iLIZJ3;
            }
            viewFindViewById3.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
        }
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = iLIZJ2;
            }
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = iLIZJ3;
            }
            imageView.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
        }
        if (viewFindViewById2 != null) {
            ViewGroup.LayoutParams layoutParams5 = viewFindViewById2.getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.width = iLIZJ2;
            }
            ViewGroup.LayoutParams layoutParams6 = viewFindViewById2.getLayoutParams();
            if (layoutParams6 != null) {
                layoutParams6.height = iLIZJ3;
            }
            viewFindViewById2.setPadding(iLIZJ, iLIZJ, iLIZJ, iLIZJ);
        }
        AnonymousClass1250.LIZIZ(viewFindViewById3);
        AnonymousClass1250.LIZIZ(imageView);
    }
}
