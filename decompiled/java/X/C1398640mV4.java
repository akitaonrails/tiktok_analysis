package X;

import Y.ACListenerS155S0100000_21;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BehindTheSongMetaData;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1398640mV4 extends AbstractC1261240ivS {
    public final View LLIZ;
    public final String LLIZLLLIL;
    public final InterfaceC1260110itd LLJ;
    public final TuxTextView LLJI;
    public final LinearLayout LLJIJIL;
    public final TuxTextView LLJILJIL;
    public final C427660Gpo LLJILJILJ;
    public final View LLJILLL;

    @Override // X.AbstractC1261240ivS
    public final void a6() {
        Video video;
        BehindTheSongMetaData behindTheSongMetaData;
        UrlModel urlModel;
        Aweme aweme = this.LL;
        if (aweme != null && (behindTheSongMetaData = aweme.getBehindTheSongMetaData()) != null && (urlModel = behindTheSongMetaData.cover) != null) {
            S5(urlModel, "DetailAwemeViewHolder", C294660Bgm.LIZ() ? Bitmap.Config.ARGB_8888 : null, null);
            return;
        }
        Aweme aweme2 = this.LL;
        if (aweme2 == null || (video = aweme2.getVideo()) == null) {
            return;
        }
        if (C294660Bgm.LIZ()) {
            if (!W5(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, false, false)) {
                S5(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, null);
                return;
            }
            this.LLILLL = true;
            this.LLILLJJLI.setAttached(true);
            this.LLILLJJLI.LJI();
            return;
        }
        if (!T5(video, "DetailAwemeViewHolder")) {
            S5(video.getCover(), "DetailAwemeViewHolder", null, null);
            return;
        }
        this.LLILLL = true;
        this.LLILLJJLI.setAttached(true);
        this.LLILLJJLI.LJI();
    }

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Video video = this.LL.getVideo();
        if (video != null) {
            if (!T5(video, "DetailAwemeViewHolder")) {
                S5(video.getCover(), "DetailAwemeViewHolder", null, null);
                return;
            }
            this.LLILLL = true;
            this.LLILLJJLI.setAttached(true);
            this.LLILLJJLI.LJI();
        }
    }

    public C1398640mV4(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = view;
        this.LLIZLLLIL = str;
        this.LLJ = interfaceC1260110itd;
        this.LLJILLL = this.itemView.findViewById(R.id.o0y);
        this.LLILLJJLI = (SmartImageView) this.itemView.findViewById(R.id.cover);
        this.LLILLJJLI.setAnimationListener(this.LLILZLL);
        this.LLJI = (TuxTextView) this.itemView.findViewById(R.id.lvn);
        this.LLJIJIL = (LinearLayout) this.itemView.findViewById(R.id.lvo);
        this.LLJILJIL = (TuxTextView) this.itemView.findViewById(R.id.lvq);
        this.LLJILJILJ = (C427660Gpo) this.itemView.findViewById(R.id.lvp);
        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 289), this.itemView);
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        LinearLayout linearLayout;
        View view;
        C427660Gpo c427660Gpo;
        TuxTextView tuxTextView;
        String nickname;
        UrlModel avatar168;
        C427660Gpo c427660Gpo2;
        String string;
        String str;
        I5(i, aweme);
        this.LL = aweme;
        if (aweme != null) {
            if (z) {
                a6();
            }
            TuxTextView tuxTextView2 = this.LLJI;
            TuxIconView tuxIconView = null;
            if (tuxTextView2 != null) {
                BehindTheSongMetaData behindTheSongMetaData = aweme.getBehindTheSongMetaData();
                if (behindTheSongMetaData != null && (str = behindTheSongMetaData.title) != null && str.length() != 0) {
                    BehindTheSongMetaData behindTheSongMetaData2 = aweme.getBehindTheSongMetaData();
                    if (behindTheSongMetaData2 != null) {
                        string = behindTheSongMetaData2.title;
                    } else {
                        string = null;
                    }
                } else {
                    string = this.LLIZ.getContext().getString(2131827922);
                }
                tuxTextView2.setText(string);
            }
            TuxTextView tuxTextView3 = this.LLJI;
            if (tuxTextView3 != null) {
                tuxTextView3.setTextColorRes(R.attr.e1);
            }
            if (C1394640mOc.LIZ()) {
                TuxTextView tuxTextView4 = this.LLJI;
                if (tuxTextView4 != null) {
                    C786410Ut5.LLLLZLL(tuxTextView4, 4);
                }
                LinearLayout linearLayout2 = this.LLJIJIL;
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(0, linearLayout2);
                }
                User author = aweme.getAuthor();
                if (author != null && (avatar168 = author.getAvatar168()) != null && (c427660Gpo2 = this.LLJILJILJ) != null) {
                    C427660Gpo.LJIIJJI(c427660Gpo2, C438710HIf.LIZ(avatar168), false, null, null, false, false, null, null, false, null, 1022);
                }
                TuxTextView tuxTextView5 = this.LLJILJIL;
                if (tuxTextView5 != null) {
                    User author2 = aweme.getAuthor();
                    if (author2 != null) {
                        nickname = author2.getNickname();
                    } else {
                        nickname = null;
                    }
                    tuxTextView5.setText(nickname);
                }
                View view2 = this.itemView;
                if (view2 != null) {
                    tuxIconView = (TuxIconView) view2.findViewById(R.id.qcw);
                }
                View view3 = this.LLJILLL;
                if (view3 != null && (linearLayout = this.LLJIJIL) != null && (view = this.itemView) != null && (c427660Gpo = this.LLJILJILJ) != null && (tuxTextView = this.LLJILJIL) != null) {
                    C1398500mUq.LIZ.getClass();
                    C1398500mUq.LIZJ(view3, view, linearLayout, c427660Gpo, tuxIconView, tuxTextView, aweme);
                }
            }
        }
    }
}
