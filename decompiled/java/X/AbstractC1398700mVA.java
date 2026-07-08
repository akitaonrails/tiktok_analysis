package X;

import Y.ACListenerS155S0100000_21;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.service.IMusicDetailService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.service.ISocPubStatusRepoService;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AFwS209S0000000_21;
import kotlin.jvm.internal.AwS387S0200000_21;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1398700mVA extends AbstractC1261240ivS {
    public final String LLIZ;
    public final InterfaceC1260110itd LLIZLLLIL;
    public final LifecycleOwner LLJ;
    public final View LLJI;
    public final C01GW LLJIJIL;
    public InterfaceC1398730mVD LLJILJIL;
    public final C01GW LLJILJILJ;
    public final ISocPubStatusRepoService LLJILLL;
    public final C01GW LLJJ;
    public final IMusicDetailService LLJJI;

    @Override // X.AbstractC1620180sGO
    public final boolean L5() {
        return false;
    }

    public abstract EnumC1606080rte e6();

    public abstract String getEnterFrom();

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || aweme.getVideo() == null) {
            return;
        }
        Aweme aweme2 = this.LL;
        if (T5(aweme2 != null ? aweme2.getVideo() : null, "DetailAwemeViewHolder")) {
            this.LLILLL = true;
        } else {
            Aweme aweme3 = this.LL;
            S5((aweme3 == null || (video = aweme3.getVideo()) == null) ? null : video.getCover(), "DetailAwemeViewHolder", null, null);
        }
    }

    @Override // X.AbstractC1261240ivS
    public final void a6() {
        Video video;
        Aweme aweme = this.LL;
        if (aweme == null || (video = aweme.getVideo()) == null) {
            return;
        }
        if (C294660Bgm.LIZ() && (this instanceof C1398740mVE)) {
            if (U5(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888)) {
                this.LLILLL = true;
                return;
            }
            if (!C290610BaF.LIZ() || (!f6() && !TextUtils.equals(this.LLIZ, "sticker_prop_detail"))) {
                S5(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888, null);
                return;
            } else if (f6()) {
                d6(video, "music_detail_page_panel");
                return;
            } else {
                if (TextUtils.equals(this.LLIZ, "sticker_prop_detail")) {
                    d6(video, "effects_detail_page_panel");
                    return;
                }
                return;
            }
        }
        if (T5(video, "DetailAwemeViewHolder")) {
            this.LLILLL = true;
            return;
        }
        if (!C290610BaF.LIZ() || (!f6() && !TextUtils.equals(this.LLIZ, "sticker_prop_detail"))) {
            S5(video.getCover(), "DetailAwemeViewHolder", null, null);
        } else if (f6()) {
            d6(video, "music_detail_page_panel");
        } else if (TextUtils.equals(this.LLIZ, "sticker_prop_detail")) {
            d6(video, "effects_detail_page_panel");
        }
    }

    public final boolean f6() {
        return TextUtils.equals(this.LLIZ, "single_song") || TextUtils.equals(this.LLIZ, "single_song_fresh");
    }

    public void b6(View view) {
        AwemeStatus statusSafety;
        Aweme aweme = this.LL;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && statusSafety.isDelete()) {
            C1389890mGx c1389890mGx = new C1389890mGx(view);
            c1389890mGx.LJIIIZ(2131858124);
            c1389890mGx.LJIIJJI();
            return;
        }
        InterfaceC1260110itd interfaceC1260110itd = this.LLIZLLLIL;
        if (interfaceC1260110itd != null) {
            interfaceC1260110itd.xe(view, this.LL, this.LLIZ, getItemViewType());
        }
        InterfaceC1398730mVD interfaceC1398730mVD = this.LLJILJIL;
        if (interfaceC1398730mVD != null) {
            interfaceC1398730mVD.LJIIZILJ();
        }
    }

    public final void d6(Video video, String str) {
        int i;
        int i2;
        EnumC1325560kbC enumC1325560kbC;
        String str2;
        Video video2;
        UrlModel cover = video.getCover();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int[] iArrR5 = R5();
        if (iArrR5 != null) {
            i = iArrR5[0];
            i2 = iArrR5[1];
        } else {
            i = -1;
            i2 = -1;
        }
        float fLIZ = C274220Aou.LIZ();
        int i3 = (int) (i * fLIZ);
        int i4 = (int) (i2 * fLIZ);
        if (Intrinsics.LJFF("AwemeViewHolder", "DetailAwemeViewHolder") && C295250Bhj.LIZ()) {
            enumC1325560kbC = EnumC1325560kbC.CUSTOM;
            str2 = "profile_post_img";
        } else {
            enumC1325560kbC = null;
            str2 = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("@@");
        sbLIZ.append("creation-entrance");
        C1324840ka2.LIZLLL(this.LLILLJJLI, cover, i3, i4, config, C2188811AlT.LIZIZ(sbLIZ), enumC1325560kbC, str2);
        Aweme aweme = this.LL;
        if (aweme != null && (video2 = aweme.getVideo()) != null && !C661110PwT.LIZ()) {
            video2.setCachedOuterCoverUrl(cover);
            video2.setCachedOuterCoverSize(iArrR5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1398700mVA(View view, String str, InterfaceC1260110itd interfaceC1260110itd, DetailAwemeListFragment detailAwemeListFragment) {
        SmartImageView smartImageView;
        View viewFindViewById;
        Activity activityLIZ;
        C19EG c19eg;
        Activity activityLIZ2;
        C19FO c19fo;
        super(view);
        LifecycleOwner lifecycleOwner = detailAwemeListFragment;
        this.LLIZ = str;
        this.LLIZLLLIL = interfaceC1260110itd;
        this.LLJ = lifecycleOwner;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS565S0100000_21(view, 1664));
        this.LLJIJIL = c01gwLIZIZ;
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1665));
        ISocPubStatusRepoService iSocPubStatusRepoService = (ISocPubStatusRepoService) PluggableExtentionKt.pluggableSpi$default(ISocPubStatusRepoService.class, false, false, false, 14, null);
        this.LLJILLL = iSocPubStatusRepoService;
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1667));
        this.LLJJ = c01gwLIZIZ2;
        this.LLJJI = (IMusicDetailService) PluggableExtentionKt.pluggableSpi$default(IMusicDetailService.class, false, false, false, 14, null);
        if (view != null) {
            smartImageView = (SmartImageView) view.findViewById(R.id.cover);
        } else {
            smartImageView = null;
        }
        this.LLILLJJLI = smartImageView;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.video_cover_mask);
        } else {
            viewFindViewById = null;
        }
        this.LLJI = viewFindViewById;
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            C786410Ut5.Q8(smartImageView2, new ACListenerS155S0100000_21(this, 279));
        }
        SmartImageView smartImageView3 = this.LLILLJJLI;
        if (smartImageView3 != null) {
            smartImageView3.setAnimationListener(this.LLILZLL);
        }
        Context context = this.itemView.getContext();
        if (context != null) {
            activityLIZ = C1388190mED.LIZ(context);
        } else {
            activityLIZ = null;
        }
        if (activityLIZ instanceof C19EG) {
            c19eg = (C19EG) activityLIZ;
        } else {
            c19eg = null;
        }
        AvatarComponentView avatarComponentView = (AvatarComponentView) c01gwLIZIZ.getValue();
        if (avatarComponentView != null) {
            C1608750rxx config = avatarComponentView.getConfig();
            new AwS387S0200000_21(this, c19eg, 109).invoke(config.LIZ);
            config.LIZJ(new C737760Swo(new C1606750ruj(e6(), new C1606770rul(null, null, null, new AwS635S0100000_21(this, 215), new AwS565S0100000_21(this, 1666), AFwS209S0000000_21.get$arr$(669), new AwS600S0100000_21(this, 424), null, null, 391), 4)));
            new AwS600S0100000_21(this, 425).invoke(config.LIZJ);
            avatarComponentView.LJFF(avatarComponentView.getConfig());
        }
        Context context2 = this.itemView.getContext();
        if (context2 != null) {
            activityLIZ2 = C1388190mED.LIZ(context2);
        } else {
            activityLIZ2 = null;
        }
        if (activityLIZ2 instanceof C19EG) {
            c19fo = (C19FO) activityLIZ2;
        } else {
            c19fo = null;
        }
        if (iSocPubStatusRepoService != null) {
            iSocPubStatusRepoService.LJIJJ(lifecycleOwner == null ? c19fo : lifecycleOwner, (InterfaceC1605670rsz) c01gwLIZIZ2.getValue());
        }
    }

    @Override // X.AbstractC1261240ivS
    public final void X5(Aweme aweme, int i, boolean z, Bundle bundle) {
        c6(aweme, i, z, bundle);
    }

    public void c6(Aweme aweme, int i, boolean z, Bundle bundle) {
        InterfaceC1398730mVD interfaceC1398730mVD;
        String aid;
        boolean z2;
        ISocPubStatusRepoService iSocPubStatusRepoService;
        C427660Gpo avatar;
        User author;
        UrlModel avatarThumb;
        List<Aweme> stories;
        String string;
        I5(i, aweme);
        SmartImageView smartImageView = this.LLILLJJLI;
        List<String> urlList = null;
        if (smartImageView != null) {
            Context context = this.itemView.getContext();
            if (context != null) {
                string = context.getString(2131849134);
            } else {
                string = null;
            }
            smartImageView.setContentDescription(string);
        }
        if (aweme == null) {
            return;
        }
        if (C729510SjV.LJJIIZ(aweme)) {
            UserStory userStory = aweme.getUserStory();
            if (userStory != null && (stories = userStory.getStories()) != null) {
                aweme = (Aweme) C13LP.LJJJLL(stories);
            } else {
                aweme = null;
            }
        }
        this.LL = aweme;
        if (z) {
            a6();
            AvatarComponentView avatarComponentView = (AvatarComponentView) this.LLJIJIL.getValue();
            if (avatarComponentView != null && (avatar = avatarComponentView.getAvatar()) != null) {
                Aweme aweme2 = this.LL;
                if (aweme2 != null && (author = aweme2.getAuthor()) != null && (avatarThumb = author.getAvatarThumb()) != null) {
                    urlList = avatarThumb.getUrlList();
                }
                avatar.LIZ(C1331660kl2.LJIIJ(new C03IT(urlList)).LIZJ());
            }
            Aweme aweme3 = this.LL;
            if (aweme3 != null && (aid = aweme3.getAid()) != null) {
                Story story = this.LL.getStory();
                boolean z3 = false;
                if (story != null) {
                    z2 = story.viewed;
                } else {
                    z2 = false;
                }
                int i2 = 1;
                if (z2 || ((iSocPubStatusRepoService = this.LLJILLL) != null && iSocPubStatusRepoService.LJFF(aid))) {
                    z3 = true;
                }
                InterfaceC1398760mVG interfaceC1398760mVG = (InterfaceC1398760mVG) this.LLJILJILJ.getValue();
                if (interfaceC1398760mVG != null) {
                    if (z3) {
                        i2 = 2;
                    }
                    interfaceC1398760mVG.LJIILLIIL(i2, aid, "music_effect_detail_page");
                }
            }
        }
        if (C10IT.LJIIJJI(this.LL)) {
            C339190DRl.LIZLLL(this.LLJI);
        } else {
            C339190DRl.LIZIZ(this.LLJI);
        }
        IMusicDetailService iMusicDetailService = this.LLJJI;
        if (iMusicDetailService != null) {
            View view = this.itemView;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("story_show");
            sbLIZ.append(this.LL.getAid());
            if (!iMusicDetailService.LJIJJLI(view, C2188811AlT.LIZIZ(sbLIZ)) && (interfaceC1398730mVD = this.LLJILJIL) != null) {
                interfaceC1398730mVD.LJIIL();
            }
        }
    }
}
