package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.zhiliaoapp.musically.R;
import wh6.AbS188S0400000_7;
import wh6.AbS324S0300000_7;

/* JADX INFO: renamed from: X.0K2G, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0K2G extends C0K3V {
    public final SubSpaceFeedVM LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;
    public final C417410GYh LLILZIL;
    public final TuxIconView LLILZLL;
    public final View LLIZ;
    public final TuxIconView LLIZLLLIL;

    public C0K2G(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = subSpaceFeedVM;
        this.LLILLJJLI = (TextView) view.findViewById(R.id.rj9);
        this.LLILLL = (TextView) view.findViewById(R.id.rm0);
        this.LLILZ = (TextView) view.findViewById(R.id.video_count);
        this.LLILZIL = (C417410GYh) view.findViewById(R.id.video_cover);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.noy);
        this.LLIZ = view.findViewById(R.id.video_cover_overlay);
        this.LLIZLLLIL = (TuxIconView) view.findViewById(R.id.jw7);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        C0K2I c0k2i;
        C511370K3r c511370K3r;
        ImageModel imageModel;
        if ((abstractC511160K2w instanceof C0K2I) && (c0k2i = (C0K2I) abstractC511160K2w) != null && (interfaceC2753014t instanceof C511370K3r) && (c511370K3r = (C511370K3r) interfaceC2753014t) != null) {
            SpacePost spacePost = c0k2i.LIZ;
            this.LLILLL.setText(C2215121Bmo.LIZ(spacePost.activeTimeSec * 1000));
            TuxIconView tuxIconView = this.LLILZLL;
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_lock;
            c419910GdJ.LIZLLL = -1;
            c419910GdJ.LJFF = true;
            tuxIconView.setTuxIcon(c419910GdJ);
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            C419910GdJ c419910GdJ2 = new C419910GdJ();
            c419910GdJ2.LIZ = R.raw.icon_play_small;
            c419910GdJ2.LIZLLL = -1;
            tuxIconView2.setTuxIcon(c419910GdJ2);
            C0K0R.LIZ(this.LLILZLL);
            C0K0R.LIZ(this.LLIZ);
            this.LLIZ.setBackground(null);
            C0K0R.LIZJ(this.LLIZLLLIL);
            if (spacePost.previewMode) {
                C0K0R.LIZJ(this.LLILZLL);
                C0K0R.LIZJ(this.LLIZ);
                this.LLIZ.setBackgroundResource(R.drawable.daj);
                C0K0R.LIZ(this.LLIZLLLIL);
            }
            C786410Ut5.I7(new AbS324S0300000_7(spacePost, c511370K3r, this, 11), this.itemView);
            C786410Ut5.I7(new AbS188S0400000_7(spacePost, c511370K3r, this, c0k2i, 1), this.LLILZIL);
            SpacePost spacePost2 = c0k2i.LIZ;
            TextView textView = this.LLILLJJLI;
            String strLJII = C511520K4g.LJII(2131839620);
            String str = "";
            if (strLJII == null) {
                strLJII = "";
            }
            String str2 = spacePost2.text;
            if (str2 != null) {
                str = str2;
            }
            C0K3V.R5(textView, "ttlive_sub_space_ic_video.png", strLJII, str, 31, 33);
            SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = c0k2i.LIZ.subOnlyVideosBriefInfo;
            if (subOnlyVideosBriefInfo != null) {
                this.LLILZ.setText(subOnlyVideosBriefInfo.totalCountStr);
                SOVBriefInfo sOVBriefInfo = (SOVBriefInfo) C13LP.LJJJLL(subOnlyVideosBriefInfo.sovBriefInfo);
                if (sOVBriefInfo != null && (imageModel = sOVBriefInfo.cover) != null) {
                    C511420K3w.LJIIJ.getClass();
                    C511420K3w c511420K3w = new C511420K3w();
                    c511420K3w.LIZ = imageModel;
                    c511420K3w.LJI = ImageView.ScaleType.CENTER_CROP;
                    c511420K3w.LJFF = Float.valueOf(C418440Gaw.LIZIZ(6));
                    c511420K3w.LIZ(this.LLILZIL);
                }
            }
        }
    }
}
