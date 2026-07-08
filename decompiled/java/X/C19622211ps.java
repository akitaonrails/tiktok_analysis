package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.11ps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19622211ps implements InterfaceC19622611pw {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJ;
    public final Context LIZ;
    public final C1DRG LIZIZ;
    public final C1664750tQH LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 642));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19622211ps.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC19622611pw
    public final ArticleStickerModel LJLI() {
        StickerModel stickerModel;
        List<StickerModel> listDt;
        StickerModel next;
        C0FVY c0fvy = (C0FVY) this.LIZLLL.getValue();
        if (c0fvy == null || (listDt = c0fvy.Dt()) == null) {
            stickerModel = null;
        } else {
            Iterator<StickerModel> it2 = listDt.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.getStickerType() == C19622411pu.LLJIJIL) {
                    break;
                }
            }
            stickerModel = next;
        }
        if (stickerModel instanceof ArticleStickerModel) {
            return (ArticleStickerModel) stickerModel;
        }
        return null;
    }

    @Override // X.InterfaceC19622611pw
    public final void Tk(ArticleStickerModel articleStickerModel) {
        C0FVY c0fvy = (C0FVY) this.LIZLLL.getValue();
        if (c0fvy != null) {
            c0fvy.J4(articleStickerModel);
            c0fvy.eb(articleStickerModel);
        }
    }

    @Override // X.InterfaceC19622611pw
    public final void Uk(ArticleStickerModel articleStickerModel) {
        C0FVY c0fvy = (C0FVY) this.LIZLLL.getValue();
        if (c0fvy != null) {
            c0fvy.LLILII(true, this.LIZ.getResources().getString(2131826639), articleStickerModel.getId(), C0FSX.BOTTOM, 51, null, null, null, null);
        }
    }

    @Override // X.InterfaceC19622611pw
    public final void Vk(AbstractC19622511pv abstractC19622511pv) {
        ((C0ETY) this.LIZIZ.LJII(C0ETY.class, null)).Sd(C0FVY.class, new AwS584S0100000_5(abstractC19622511pv, 183));
    }

    @Override // X.InterfaceC19622611pw
    public final void Wk(AbstractC19622511pv abstractC19622511pv) {
        ((C0ETY) this.LIZIZ.LJII(C0ETY.class, null)).Sd(C0FVY.class, new AwS584S0100000_5(abstractC19622511pv, 182));
    }

    @Override // X.InterfaceC19622611pw
    public final void Xk(String str) {
        StickerModel next;
        C0FVY c0fvy = (C0FVY) this.LIZLLL.getValue();
        if (c0fvy != null) {
            Iterator<StickerModel> it2 = c0fvy.Dt().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getStickerType() == C19622411pu.LLJIJIL) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            StickerModel stickerModel = next;
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LIZJ.getValue(this, LJ[0]);
            IArticleStickerService.Companion.getClass();
            InterfaceC19622811py interfaceC19622811pyLIZ = C19603211mo.LIZ();
            if (interfaceC19622811pyLIZ != null && interfaceC19622811pyLIZ.LJFF(videoPublishEditModel) && stickerModel == null) {
                Activity activityLIZ = C1388190mED.LIZ(this.LIZ);
                if (activityLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    c1389890mGx.LJIIJ(activityLIZ.getString(2131826648));
                    c1389890mGx.LJIIJJI();
                    return;
                }
                return;
            }
            c0fvy.Dr(C19622411pu.LLJIJIL, stickerModel, str, AFwS273S0000000_29.get$arr$(80));
        }
    }

    public C19622211ps(Context context, C1DRG c1drg) {
        this.LIZ = context;
        this.LIZIZ = c1drg;
        this.LIZJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
    }
}
