package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.service.ICLAPerfETService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;

/* JADX INFO: renamed from: X.160A, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160A implements C160S {
    public final AnonymousClass1607 LL;
    public final C710670RuD LLILLJJLI;
    public final AnonymousClass1602 LLILLL;
    public final C20702815zm LLILZ;
    public final List<C160K> LLILZIL;
    public VideoItemParams LLILZLL;
    public double LLIZ;
    public boolean LLIZLLLIL;

    @Override // X.C160K
    public final void EK() {
        for (C160K c160k : this.LLILZIL) {
            if (c160k != null) {
                c160k.EK();
            }
        }
    }

    @Override // X.InterfaceC20703115zp
    public final String ID() {
        C710680RuE c710680RuE = this.LLILLJJLI.LLIZ;
        if (c710680RuE != null) {
            return c710680RuE.LIZ;
        }
        return null;
    }

    @Override // X.InterfaceC20703115zp
    public final boolean YF0() {
        C20703515zt c20703515zt = C20703515zt.LIZ;
        VideoItemParams videoItemParams = getVideoItemParams();
        Aweme aweme = videoItemParams != null ? videoItemParams.getAweme() : null;
        c20703515zt.getClass();
        return !C20703515zt.LIZIZ(C20703515zt.LJIIIZ(aweme));
    }

    @Override // X.InterfaceC20703115zp
    public final String getAwemeId() {
        return AnonymousClass1604.LIZ(this);
    }

    @Override // X.InterfaceC20703115zp
    public final boolean rK() {
        return AnonymousClass1604.LIZIZ(this);
    }

    @Override // X.InterfaceC20703115zp
    public final double LF1() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC20703115zp
    public final VideoItemParams getVideoItemParams() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20703115zp
    public final boolean w1() {
        return this.LLIZLLLIL;
    }

    @Override // X.C160K
    public final void En1(VideoItemParams videoItemParams) {
        this.LLILZLL = videoItemParams;
        for (C160K c160k : this.LLILZIL) {
            if (c160k != null) {
                c160k.En1(videoItemParams);
            }
        }
    }

    @Override // X.C160K
    public final void PU1(Context context) {
        boolean z;
        Aweme aweme;
        VideoItemParams videoItemParams = this.LLILZLL;
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && C0SQQ.LIZ.LIZ(aweme, null, null, null)) {
            z = true;
        } else {
            z = false;
        }
        this.LLIZLLLIL = !z;
        this.LLIZ = C2179771ASp.LJIIIIZZ();
        for (C160K c160k : this.LLILZIL) {
            if (c160k != null) {
                c160k.PU1(context);
            }
        }
    }

    @Override // X.C160K
    public final void cL2(boolean z) {
        for (C160K c160k : this.LLILZIL) {
            if (c160k != null) {
                c160k.cL2(z);
            }
        }
    }

    @Override // X.C160K
    public final void vD2(C0Q69 c0q69) {
        for (C160K c160k : this.LLILZIL) {
            if (c160k != null) {
                c160k.vD2(c0q69);
            }
        }
    }

    public final void LIZ(AnonymousClass1629 anonymousClass1629, boolean z) {
        if (C08A4.LIZ(Integer.valueOf(C1483410ohn.LJLJJI().LJIILL().LJJLI()))) {
            return;
        }
        C1483410ohn.LJLJJI().LJIILL().LJJIJLIJ(true);
        if (anonymousClass1629 != null) {
            LIZIZ(anonymousClass1629, true, z);
        }
    }

    public final void LIZIZ(AnonymousClass1629 anonymousClass1629, boolean z, boolean z2) {
        Aweme aweme;
        CaptionItemModel captionItemModelLJIIIIZZ;
        CaptionModel captionModel;
        List<CaptionItemModel> list;
        CaptionItemModel captionItemModel;
        AnonymousClass1607 anonymousClass1607 = this.LL;
        VideoItemParams videoItemParams = anonymousClass1607.LL.getVideoItemParams();
        if (videoItemParams != null && (aweme = videoItemParams.getAweme()) != null && (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(aweme)) != null) {
            if (anonymousClass1607.LL.w1()) {
                captionItemModel = captionItemModelLJIIIIZZ;
            } else {
                Video video = aweme.getVideo();
                CaptionItemModel captionItemModel2 = null;
                if (video == null || (captionModel = video.getCaptionModel()) == null || (list = captionModel.captionList) == null) {
                    return;
                }
                Iterator<CaptionItemModel> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CaptionItemModel next = it2.next();
                    if (next.subId != captionItemModelLJIIIIZZ.subId) {
                        captionItemModel2 = next;
                        break;
                    }
                }
                captionItemModel = captionItemModel2;
                if (captionItemModel == null) {
                    return;
                }
            }
            ICLAPerfETService iCLAPerfETServiceLIZ = C1485670olR.LIZ();
            String strValueOf = String.valueOf(captionItemModel.subId);
            String strValueOf2 = String.valueOf(captionItemModel.claSubtitleId);
            String str = "";
            if (strValueOf2 == null) {
                strValueOf2 = "";
            }
            String str2 = captionItemModel.languageCode;
            if (str2 != null) {
                str = str2;
            }
            iCLAPerfETServiceLIZ.LJIILL(aweme, strValueOf, strValueOf2, str, captionItemModelLJIIIIZZ.languageCode, EnumC20038913at.OFFLINE, anonymousClass1629, C1485670olR.LIZIZ(captionItemModel), z, false, true, z2);
        }
    }

    public C160A(InterfaceC497601wk interfaceC497601wk, C160I c160i, C160M c160m, C160N c160n, C20703815zw c20703815zw) {
        C20702815zm c20702815zm;
        AnonymousClass1607 anonymousClass1607 = new AnonymousClass1607(this);
        this.LL = anonymousClass1607;
        C710670RuD c710670RuD = new C710670RuD(interfaceC497601wk, this, new C160J(this, c160i), c160m);
        this.LLILLJJLI = c710670RuD;
        AnonymousClass1602 anonymousClass1602 = new AnonymousClass1602(this, new C160P(this), c160n);
        this.LLILLL = anonymousClass1602;
        if (C305380By4.LIZ) {
            c20702815zm = new C20702815zm(this, new AwS575S0100000_31(this, 19), c20703815zw);
        } else {
            c20702815zm = null;
        }
        this.LLILZ = c20702815zm;
        this.LLILZIL = C1697810uHb.LJIIJJI(anonymousClass1607, c710670RuD, anonymousClass1602, c20702815zm);
        this.LLIZLLLIL = true;
    }
}
