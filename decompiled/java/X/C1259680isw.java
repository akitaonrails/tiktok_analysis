package X;

import Y.ACListenerS154S0100000_19;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.story.UserStory;
import com.ss.android.ugc.aweme.feed.model.story.UserStoryKt;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0isw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259680isw extends AbstractC1620180sGO<Aweme> {
    public static final /* synthetic */ int LLJ = 0;
    public final View LLILZIL;
    public final String LLILZLL;
    public final C1259360isQ LLIZ;
    public Aweme LLIZLLLIL;

    public final Aweme R5() {
        UserStory userStory;
        List<Aweme> listLJIILL;
        User author;
        Aweme aweme = this.LLIZLLLIL;
        if (C729510SjV.LJIILJJIL((aweme == null || (author = aweme.getAuthor()) == null) ? null : author.getUid()) && (listLJIILL = C1618440sDa.LIZIZ.LJJIFFI().LJIILL()) != null && !listLJIILL.isEmpty()) {
            return (Aweme) C13LP.LJJLIIIJJI(listLJIILL);
        }
        Aweme aweme2 = this.LLIZLLLIL;
        if (aweme2 == null || (userStory = aweme2.getUserStory()) == null) {
            return null;
        }
        Aweme awemeCurrentStory = UserStoryKt.currentStory(userStory);
        return awemeCurrentStory == null ? (Aweme) C13LP.LJJJLZIJ(0, userStory.getStories()) : awemeCurrentStory;
    }

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        P5(R5());
    }

    public final void P5(Aweme aweme) {
        Video video;
        if ((aweme == null || AwemeExtKt.isSharedStoryVisible(aweme)) && 0 == 0) {
            if (aweme != null) {
                if (!AwemeExtKt.isCommentPostInvisible(aweme)) {
                    Bitmap.Config config = null;
                    if (aweme != null && (video = aweme.getVideo()) != null && video.getCover() != null) {
                        List<String> urlList = video.getCover().getUrlList();
                        if (C294660Bgm.LIZ()) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        if (AbstractC1620180sGO.N5() && video.isCallback() && C1620160sGM.LIZIZ((SmartImageView) this.LLILZIL.findViewById(R.id.ld7), video, "StoryCollectionViewHolder", true, null, null, true, config, false, false, false, false)) {
                            this.LLILLL = true;
                            C727890Sgt c727890Sgt = C727890Sgt.LIZ;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("refreshCover: use dynamic img, url list: ");
                            sbLIZ.append(urlList);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            c727890Sgt.getClass();
                            C727890Sgt.LIZ("StoryV5VH", strLIZIZ);
                            return;
                        }
                        this.LLILLL = false;
                        C727890Sgt c727890Sgt2 = C727890Sgt.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("refreshCover: use static img, url list: ");
                        sbLIZ2.append(urlList);
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c727890Sgt2.getClass();
                        C727890Sgt.LIZ("StoryV5VH", strLIZIZ2);
                        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
                        int[] iArrLIZ = C422830Gi1.LIZ(200);
                        if (iArrLIZ != null) {
                            c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
                        }
                        c1331670kl3LJIIIIZZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.ld7));
                        c1331670kl3LJIIIIZZ.LIZLLL("StoryCollectionViewHolder");
                        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                        return;
                    }
                }
            }
            ((C1322110kVd) this.LLILZIL.findViewById(R.id.ld7)).setActualImageResource(R.attr.br);
            return;
        }
        C705950Rmb.LIZ((SmartImageView) this.LLILZIL.findViewById(R.id.ld7));
    }

    public C1259680isw(View view, String str, C1259360isQ c1259360isQ) {
        super(view);
        this.LLILZIL = view;
        this.LLILZLL = str;
        this.LLIZ = c1259360isQ;
        this.LLILLJJLI = (SmartImageView) view.findViewById(R.id.ld7);
        View viewFindViewById = view.findViewById(R.id.tv_top);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(2));
        viewFindViewById.setBackground(c384050F3z.LIZ(view.getContext()));
        C786410Ut5.I7(new ACListenerS154S0100000_19(this, 211), view);
        view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1265900j2y(this, 4));
        C2211751BhN.LIZ(this.itemView, new C1266300j3c(this, 2));
    }
}
