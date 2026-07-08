package X;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SOVBriefInfo;
import com.bytedance.android.livesdk.chatroom.api.SpacePost;
import com.bytedance.android.livesdk.chatroom.api.SubOnlyVideosBriefInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.vm.SubSpaceFeedVM;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Jpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C503990Jpd extends C502700JnY {
    public final View LL;
    public final SubSpaceFeedVM LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;
    public final C1324720kZq LLILZLL;
    public final LiveIconView LLIZ;
    public final View LLIZLLLIL;
    public final LiveIconView LLJ;

    public C503990Jpd(View view, SubSpaceFeedVM subSpaceFeedVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceFeedVM;
        this.LLILLL = (C16F5) view.findViewById(R.id.rj9);
        this.LLILZ = (C16F5) view.findViewById(R.id.rm0);
        this.LLILZIL = (C16F5) view.findViewById(R.id.video_count);
        this.LLILZLL = (C1324720kZq) view.findViewById(R.id.video_cover);
        this.LLIZ = (LiveIconView) view.findViewById(R.id.noy);
        this.LLIZLLLIL = view.findViewById(R.id.video_cover_overlay);
        this.LLJ = (LiveIconView) view.findViewById(R.id.jw7);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        final C504020Jpg c504020Jpg;
        int i;
        ImageModel imageModel;
        final C504510JqT c504510JqT = null;
        if (abstractC503810JpL instanceof C504020Jpg) {
            c504020Jpg = (C504020Jpg) abstractC503810JpL;
        } else {
            c504020Jpg = null;
        }
        if (interfaceC2753014t instanceof C504510JqT) {
            c504510JqT = (C504510JqT) interfaceC2753014t;
        }
        if (c504020Jpg == null || c504510JqT == null) {
            return;
        }
        final SpacePost spacePost = c504020Jpg.LIZ;
        this.LLILZ.setText(C2215111Bmn.LIZ(spacePost.activeTimeSec * 1000));
        if (spacePost.previewMode) {
            C500260Jjc.LLFFF(this.LLIZ);
            C500260Jjc.LLFFF(this.LLIZLLLIL);
            View view = this.LLIZLLLIL;
            if (view != null) {
                view.setBackground(C507390Jv7.LIZ(C497740JfY.LIZIZ(6.0f), C20736316Cj.LIZIZ(R.attr.exj, this.LL.getContext()), 0, 0));
            }
            LiveIconView liveIconView = this.LLJ;
            if (liveIconView != null) {
                C500260Jjc.LJIILIIL(liveIconView);
            }
        }
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jpe
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                String idStr;
                String idStr2;
                int i2;
                if (view2 != null && !spacePost.previewMode) {
                    if (C500260Jjc.LJJJI(Boolean.valueOf(c504510JqT.LLILZIL)) && this.LLILLJJLI.zQ2()) {
                        if (this.LLILLJJLI.DQ2()) {
                            i2 = 2131856639;
                        } else {
                            i2 = 2131856517;
                        }
                        C766270U4b.LIZLLL(i2);
                        return;
                    }
                    C503990Jpd c503990Jpd = this;
                    C504510JqT c504510JqT2 = c504510JqT;
                    c503990Jpd.getClass();
                    Uri.Builder builderAppendQueryParameter = UriProtector.parse("sslocal://webcast_subscribe/sub_only_videos").buildUpon().appendQueryParameter("is_fullscreen", "1").appendQueryParameter("enter_from", "SubOnlySpace");
                    User user = c504510JqT2.LLILLL;
                    String str = "";
                    if (user == null || (idStr = user.getIdStr()) == null) {
                        idStr = "";
                    }
                    Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("anchor_id", idStr).appendQueryParameter("sec_anchor_id", c504510JqT2.LLILZ);
                    User user2 = c504510JqT2.LLILLL;
                    if (user2 != null && (idStr2 = user2.getIdStr()) != null) {
                        str = idStr2;
                    }
                    ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c503990Jpd.LL.getContext(), builderAppendQueryParameter2.appendQueryParameter("actual_anchor_id", str).build().toString());
                    this.LLILLJJLI.wQ2().LIZ(spacePost, "more_video");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LL);
        C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0Jpf
            @Override // X.AbstractViewOnClickListenerC1637610siV
            public final void LIZ(View view2) {
                int i2;
                if (view2 != null) {
                    if (spacePost.previewMode) {
                        C505720JsQ.LIZIZ(c504510JqT, this.LL.getContext());
                    } else if (C500260Jjc.LJJJI(Boolean.valueOf(c504510JqT.LLILZIL)) && this.LLILLJJLI.zQ2()) {
                        if (this.LLILLJJLI.DQ2()) {
                            i2 = 2131856639;
                        } else {
                            i2 = 2131856517;
                        }
                        C766270U4b.LIZLLL(i2);
                    } else {
                        C503990Jpd c503990Jpd = this;
                        SpacePost spacePost2 = c504020Jpg.LIZ;
                        c503990Jpd.getClass();
                        ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(c503990Jpd.LL.getContext(), spacePost2.videoJumpUrl);
                    }
                    this.LLILLJJLI.wQ2().LIZ(spacePost, "video_inner");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(300L);
            }
        }, this.LLILZLL);
        SpacePost spacePost2 = c504020Jpg.LIZ;
        C16F5 c16f5 = this.LLILLL;
        if (this.LLILLJJLI.DQ2()) {
            i = 2131856663;
        } else {
            i = 2131844328;
        }
        C502700JnY.P5(c16f5, "ttlive_sub_space_ic_video.png", C497740JfY.LJIJI(i), spacePost2.text);
        SubOnlyVideosBriefInfo subOnlyVideosBriefInfo = c504020Jpg.LIZ.subOnlyVideosBriefInfo;
        if (subOnlyVideosBriefInfo != null) {
            this.LLILZIL.setText(subOnlyVideosBriefInfo.totalCountStr);
            SOVBriefInfo sOVBriefInfo = (SOVBriefInfo) C13LP.LJJJLL(subOnlyVideosBriefInfo.sovBriefInfo);
            if (sOVBriefInfo != null && (imageModel = sOVBriefInfo.cover) != null) {
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
                c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
                c1324610kZfLJIIIZ.LJIJI(Float.valueOf(C418440Gaw.LIZIZ(6)));
                c1324610kZfLJIIIZ.LJJI(this.LLILZLL);
            }
        }
    }
}
