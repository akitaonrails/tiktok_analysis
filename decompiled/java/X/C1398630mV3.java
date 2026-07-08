package X;

import Y.ACListenerS124S0200000_21;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0mV3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1398630mV3 extends AbstractC1261240ivS {
    public final Context LLIZ;
    public final String LLIZLLLIL;
    public final ViewGroup LLJ;
    public final RemoteImageView LLJI;
    public final TextView LLJIJIL;
    public final TextView LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final LinearLayout LLJILLL;
    public final TuxTextView LLJJ;
    public TuxTextView LLJJI;
    public final View LLJJIII;
    public final C427660Gpo LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final SmartImageView LLJJIJIL;
    public final TuxTextView LLJJJ;
    public final TextView LLJJJIL;
    public final TuxTextView LLJJJJ;
    public final TuxTextView LLJJJJJIL;
    public final TuxIconView LLJJJJLIIL;
    public final View LLJJL;
    public C0M3E LLJJLIIIJLLLLLLLZ;
    public final InterfaceC1260110itd LLJL;
    public final View LLJLIL;
    public String LLJLILLLLZIIL;
    public String LLJLL;
    public long LLJLLIL;

    public boolean c6() {
        return false;
    }

    public boolean d6() {
        return this instanceof C1398590mUz;
    }

    public boolean u6() {
        return false;
    }

    public void v6() {
    }

    public void M0() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        if (T5(video, "DetailAwemeViewHolder")) {
            this.LLILLL = true;
        } else {
            S5(video.getCover(), "DetailAwemeViewHolder", null, null);
        }
    }

    @Override // X.AbstractC1260080ita
    public int[] R5() {
        return C422830Gi1.LIZ(200);
    }

    @Override // X.AbstractC1261240ivS
    public void a6() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        if (C294660Bgm.LIZ() && d6()) {
            if (U5(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888)) {
                this.LLILLL = true;
                return;
            }
            if (!C290610BaF.LIZ() || (!i6() && !TextUtils.equals(this.LLIZLLLIL, "sticker_prop_detail"))) {
                S5(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, null);
                return;
            } else if (i6()) {
                e6(video, "music_detail_page_panel");
                return;
            } else {
                if (TextUtils.equals(this.LLIZLLLIL, "sticker_prop_detail")) {
                    e6(video, "effects_detail_page_panel");
                    return;
                }
                return;
            }
        }
        if (T5(video, "DetailAwemeViewHolder")) {
            this.LLILLL = true;
            return;
        }
        if (!C290610BaF.LIZ() || (!i6() && !TextUtils.equals(this.LLIZLLLIL, "sticker_prop_detail"))) {
            S5(video.getCover(), "DetailAwemeViewHolder", null, null);
        } else if (i6()) {
            e6(video, "music_detail_page_panel");
        } else if (TextUtils.equals(this.LLIZLLLIL, "sticker_prop_detail")) {
            e6(video, "effects_detail_page_panel");
        }
    }

    public final void h6() {
        C0M3E c0m3eLJIIJJI = C1EE2.LIZIZ.LJIIJJI(this.LLJ);
        this.LLJJLIIIJLLLLLLLZ = c0m3eLJIIJJI;
        c0m3eLJIIJJI.LIZ(this.LLJIJIL);
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJILJIL);
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJILJILJ);
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJJJIL);
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJI);
        this.LLJJLIIIJLLLLLLLZ.LIZ(this.LLJJIJIIJIL);
    }

    public final boolean i6() {
        return TextUtils.equals(this.LLIZLLLIL, "single_song") || TextUtils.equals(this.LLIZLLLIL, "single_song_fresh");
    }

    public static String f6(UrlModel urlModel) {
        if (urlModel != null && urlModel.getUrlList() != null && !urlModel.getUrlList().isEmpty()) {
            return (String) ListProtector.get(urlModel.getUrlList(), 0);
        }
        return null;
    }

    public static final void r6(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            C786410Ut5.LLIL(textView, 8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, C341940Daq.LIZ(12.0d));
        textView.setTextColor(ColorProtector.parseColor(awemeTextLabelModel.getTextColor()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorProtector.parseColor(awemeTextLabelModel.getBgColor()));
        gradientDrawable.setCornerRadius(C418440Gaw.LIZIZ(2));
        textView.setBackground(gradientDrawable);
        textView.setSingleLine();
    }

    public final void e6(Video video, String str) {
        int iLIZ;
        int iLIZ2;
        Aweme aweme;
        AbstractC1320710kTN abstractC1320710kTN;
        C1325710kbR c1325710kbR;
        Uri uri;
        AbstractC1320710kTN abstractC1320710kTN2;
        UrlModel cover = video.getCover();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int[] iArrR5 = R5();
        if (iArrR5 != null) {
            iLIZ = iArrR5[0];
            iLIZ2 = iArrR5[1];
        } else {
            iLIZ = -1;
            iLIZ2 = -1;
        }
        if (c6()) {
            iLIZ = (int) (iLIZ * C274220Aou.LIZ());
            iLIZ2 = (int) (iLIZ2 * C274220Aou.LIZ());
        }
        if (u6() && (aweme = this.LL) != null) {
            String aid = aweme.getAid();
            String strF6 = f6(cover);
            if (!TextUtils.isEmpty(aid) && !TextUtils.isEmpty(strF6) && TextUtils.equals(aid, this.LLJLILLLLZIIL) && TextUtils.equals(strF6, this.LLJLL)) {
                InterfaceC1320850kTb controller = this.LLILLJJLI.getController();
                if ((controller instanceof AbstractC1320710kTN) && (abstractC1320710kTN = (AbstractC1320710kTN) controller) != null && (c1325710kbR = abstractC1320710kTN.LJIJJLI) != null && (uri = c1325710kbR.LIZIZ) != null && TextUtils.equals(strF6, uri.toString())) {
                    C1324630kZh c1324630kZh = c1325710kbR.LJIIJJI;
                    if (iLIZ <= 0 || iLIZ2 <= 0 || c1324630kZh == null || (c1324630kZh.LIZ == iLIZ && c1324630kZh.LIZIZ == iLIZ2)) {
                        if (!this.LLILLJJLI.LIZLLL()) {
                            InterfaceC1320850kTb controller2 = this.LLILLJJLI.getController();
                            if ((!(controller2 instanceof AbstractC1320710kTN) || (abstractC1320710kTN2 = (AbstractC1320710kTN) controller2) == null || !abstractC1320710kTN2.LJIILIIL) && System.currentTimeMillis() - this.LLJLLIL < 150) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("@@");
        sbLIZ.append("creation-entrance");
        C1324840ka2.LIZLLL(this.LLILLJJLI, cover, iLIZ, iLIZ2, config, C2188811AlT.LIZIZ(sbLIZ), null, null);
        if (this.LL != null && cover != null) {
            String strF62 = f6(cover);
            if (!TextUtils.isEmpty(strF62)) {
                this.LLJLILLLLZIIL = this.LL.getAid();
                this.LLJLL = strF62;
                this.LLJLLIL = System.currentTimeMillis();
            }
        }
        Aweme aweme2 = this.LL;
        if (aweme2 != null && aweme2.getVideo() != null && !C661110PwT.LIZ()) {
            this.LL.getVideo().setCachedOuterCoverUrl(cover);
            this.LL.getVideo().setCachedOuterCoverSize(iArrR5);
        }
    }

    public void q6(View view, InterfaceC1260110itd interfaceC1260110itd) {
        interfaceC1260110itd.xe(view, this.LL, this.LLIZLLLIL, getItemViewType());
    }

    public C1398630mV3(View view, String str, InterfaceC1260110itd interfaceC1260110itd) {
        super(view);
        this.LLIZ = view.getContext();
        this.LLIZLLLIL = str;
        this.LLJL = interfaceC1260110itd;
        this.LLJ = (ViewGroup) view.findViewById(R.id.eqx);
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.cover);
        this.LLJI = (RemoteImageView) view.findViewById(R.id.lee);
        this.LLJJJIL = (TextView) view.findViewById(R.id.x1n);
        this.LLJILJIL = (TextView) view.findViewById(R.id.lvf);
        this.LLJILJILJ = (TuxTextView) view.findViewById(R.id.lvn);
        this.LLJILLL = (LinearLayout) view.findViewById(R.id.lvo);
        this.LLJJ = (TuxTextView) view.findViewById(R.id.lvq);
        this.LLJJIJI = (C427660Gpo) view.findViewById(R.id.lvp);
        this.LLJJIII = view.findViewById(R.id.o0y);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.lfa);
        this.LLJJIJIIJIL = tuxTextView;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.hrg);
        this.LLJJIJIL = smartImageView;
        C786410Ut5.LLFF(8, smartImageView);
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.hrk);
        this.LLJJJ = tuxTextView2;
        C786410Ut5.LLLLZLL(tuxTextView2, 8);
        C786410Ut5.h9(tuxTextView, new ACListenerS124S0200000_21(this, interfaceC1260110itd, 100));
        this.LLJIJIL = (TextView) view.findViewById(R.id.lwp);
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.mnh);
        this.LLJJJJ = tuxTextView3;
        C786410Ut5.LLLLZLL(tuxTextView3, 8);
        TuxTextView tuxTextView4 = (TuxTextView) view.findViewById(R.id.view_count);
        this.LLJJJJJIL = tuxTextView4;
        C786410Ut5.LLLLZLL(tuxTextView4, 8);
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.view_count_icon);
        this.LLJJJJLIIL = tuxIconView;
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        View viewFindViewById = view.findViewById(R.id.video_cover_mask);
        this.LLJJL = viewFindViewById;
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.cev);
        this.LLJLIL = viewFindViewById2;
        C786410Ut5.LJLLLLLL(8, viewFindViewById2);
        C786410Ut5.Q8(this.LLILLJJLI, new ACListenerS124S0200000_21(this, interfaceC1260110itd, 101));
        this.LLILLJJLI.setAnimationListener(this.LLILZLL);
    }

    @Override // X.AbstractC1261240ivS
    public void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        b6(aweme, i, z, bundle);
    }

    public void b6(Aweme aweme, int i, boolean z, Bundle bundle) {
        I5(i, aweme);
        this.LLILLJJLI.setContentDescription("");
        this.LL = aweme;
        if (aweme == null) {
            return;
        }
        if (AwemeBizExtKt.isForMusicDetailLoading(aweme)) {
            v6();
        }
        if (z) {
            a6();
        }
        C0M3E c0m3e = this.LLJJLIIIJLLLLLLLZ;
        if (c0m3e != null) {
            c0m3e.LJ(aweme);
        }
        C786410Ut5.l(this.LLJI, 4);
        C786410Ut5.LLIL(this.LLJIJIL, 8);
        C786410Ut5.LLIL(this.LLJILJIL, 8);
        C786410Ut5.LLLLZLL(this.LLJILJILJ, 8);
        LinearLayout linearLayout = this.LLJILLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        C786410Ut5.LLLLZLL(this.LLJJIJIIJIL, 8);
        C786410Ut5.LJLLLLLL(8, this.LLJLIL);
        C1212130heF.LIZ(this.LLJJL, this.LL);
        C786410Ut5.LLIL(this.LLJJJIL, 8);
        C1212130heF.LIZ(this.LLJJJIL, aweme);
    }
}
