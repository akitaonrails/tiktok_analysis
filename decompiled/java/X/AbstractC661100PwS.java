package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS43S0300000_10;
import android.content.Context;
import android.graphics.PointF;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchVideoHolder;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchCoverLowResAndBlurDataExperiment;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0PwS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC661100PwS extends AbstractC1260080ita {
    public static int LLIZLLLIL = -1;
    public static int LLJ = -1;
    public final Context LLIZ;

    @Override // X.AbstractC1260080ita
    public final boolean P5() {
        return false;
    }

    public abstract void a6();

    public abstract boolean d6();

    public abstract void e6();

    public abstract void h6();

    @Override // X.AbstractC1260080ita
    public int[] R5() {
        return C422830Gi1.LIZ(201);
    }

    public AbstractC661100PwS(View view) {
        super(view);
        this.LLIZ = view.getContext();
    }

    public static void b6(SmartImageView smartImageView) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(C1913107eT.LJII());
        }
        smartImageView.getHierarchy().LJIILIIL(2).LJIJ(new PointF(0.5f, 0.0f));
    }

    public void X5(InterfaceC658750Psf interfaceC658750Psf) {
        Video video;
        UrlModel cover;
        Aweme aweme = this.LL;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            if (T5(video, "AbsCellViewHolder")) {
                this.LLILLL = true;
                return;
            }
            int iIntValue = 0;
            if (video.getCover() != null && video.getCover().getUrlList() != null && video.getCover().getUrlList().size() != 0 && !TextUtils.isEmpty((CharSequence) ListProtector.get(video.getCover().getUrlList(), 0))) {
                if (C1840907Ix.LIZIZ()) {
                    long jLIZ = C1840907Ix.LIZ();
                    if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().isEmpty() || C1322200kVm.LIZ().LJIIJJI(UriProtector.parse((String) ListProtector.get(video.getCover().getUrlList(), 0)))) {
                        jLIZ = 0;
                    }
                    if (Looper.getMainLooper() != Looper.myLooper()) {
                        HandlerHook.viewPostDelay(this.LLILLJJLI, new ARunnableS43S0300000_10(interfaceC658750Psf, video, (SearchVideoHolder) this, 18), jLIZ);
                        return;
                    } else {
                        HandlerHook.viewPostDelay(this.LLILLJJLI, new ARunnableS43S0300000_10(interfaceC658750Psf, video, (SearchVideoHolder) this, 19), jLIZ);
                        return;
                    }
                }
                if ((C07F9.LIZ() & 1) == 1 && C0Q51.LIZ() == 1 && video.getLowResCover() != null && !video.getLowResCover().getUrlList().isEmpty()) {
                    cover = video.getLowResCover();
                } else {
                    cover = video.getCover();
                }
                f6(cover, interfaceC658750Psf, video.getBlurPreview());
                return;
            }
            if (Looper.getMainLooper() != Looper.myLooper()) {
                C2487409ou.LIZJ(new ARunnableS110S0100000_10((SearchVideoHolder) this, 171));
                return;
            }
            SmartImageView smartImageView = this.LLILLJJLI;
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bv, this.LLIZ);
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            smartImageView.setImageResource(iIntValue);
        }
    }

    public static void c6(SmartImageView smartImageView, float f) {
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            ((FixedRatioFrameLayout) viewGroup).setWhRatio(f);
        }
        smartImageView.getHierarchy().LJIILIIL(2).LJIJ(new PointF(0.5f, 0.0f));
    }

    public final void f6(UrlModel urlModel, InterfaceC658750Psf interfaceC658750Psf, String str) {
        int i;
        int i2;
        int iIntValue;
        C1331070kk5 hierarchy;
        String strLIZIZ = "AbsCellViewHolder";
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
        int[] iArrR5 = R5();
        if (iArrR5 != null) {
            c1331670kl3LJIIIIZZ.LJJIJ(iArrR5);
        }
        if ((((Number) C04WL.LIZ.getValue()).intValue() & 1) == 1) {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.IMMEDIATE;
        } else {
            c1331670kl3LJIIIIZZ.LJJIII = EnumC1334360kpO.HIGH;
        }
        c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.CUSTOM;
        c1331670kl3LJIIIIZZ.LJJJJJ = "search_cache";
        if ((C07F9.LIZ() & 2) == 2) {
            if (Looper.getMainLooper() == Looper.myLooper() && (hierarchy = this.LLILLJJLI.getHierarchy()) != null && hierarchy.LJIILJJIL()) {
                hierarchy.LJIJ(null, 1);
            }
            if (str != null && !str.isEmpty()) {
                int iIntValue2 = LLIZLLLIL;
                if (iIntValue2 <= 0) {
                    Integer num = ((SearchCoverLowResAndBlurDataExperiment.Config) SearchCoverLowResAndBlurDataExperiment.LIZIZ.getValue()).placeholderDefaultWidth;
                    if (num != null) {
                        iIntValue2 = num.intValue();
                    } else {
                        iIntValue2 = 500;
                    }
                }
                int iIntValue3 = LLJ;
                if (iIntValue3 <= 0) {
                    Integer num2 = ((SearchCoverLowResAndBlurDataExperiment.Config) SearchCoverLowResAndBlurDataExperiment.LIZIZ.getValue()).placeholderDefaultHeight;
                    if (num2 != null) {
                        iIntValue3 = num2.intValue();
                    } else {
                        iIntValue3 = 800;
                    }
                }
                c1331670kl3LJIIIIZZ.LJJJLZIJ = iIntValue2;
                c1331670kl3LJIIIIZZ.LJJJZ = iIntValue3;
                c1331670kl3LJIIIIZZ.LIZIZ(str);
                Integer num3 = ((SearchCoverLowResAndBlurDataExperiment.Config) SearchCoverLowResAndBlurDataExperiment.LIZIZ.getValue()).fadeDuration;
                if (num3 != null && (iIntValue = num3.intValue()) > 0) {
                    c1331670kl3LJIIIIZZ.LJIILJJIL = iIntValue;
                }
                c1331670kl3LJIIIIZZ.LJJJJI = "Search";
                c1331670kl3LJIIIIZZ.LJJJJIZL = "cover_with_preview";
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AbsCellViewHolder");
                sbLIZ.append("-preview");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        C01GW c01gw = SearchResultPictureSrExperiment.LIZIZ;
        if (((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).enableAdaptive > 0) {
            int i3 = LLIZLLLIL;
            if (i3 > 0 && LLJ > 0 && i3 >= ((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).thresholdWidth && LLJ >= ((SearchResultPictureSrExperiment.SearchSrAbModel) c01gw.getValue()).thresholdHeight) {
                int i4 = LLIZLLLIL;
                int i5 = LLJ;
                c1331670kl3LJIIIIZZ.LJJLIIIJLJLI = i4;
                c1331670kl3LJIIIIZZ.LJJLIIIJLLLLLLLZ = i5;
                c1331670kl3LJIIIIZZ.LJJIJIL(new C1331570kkt());
            }
        } else if (SearchResultPictureSrExperiment.LIZ() > 0.0f) {
            c1331670kl3LJIIIIZZ.LJJIJIL((C1331570kkt) C658900Psu.LIZ.getValue());
        }
        c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
        c1331670kl3LJIIIIZZ.LIZLLL(strLIZIZ);
        if (C04WO.LIZ() && (i = LLIZLLLIL) > 0 && (i2 = LLJ) > 0) {
            c1331670kl3LJIIIIZZ.LJIIIIZZ = i;
            c1331670kl3LJIIIIZZ.LJIIIZ = i2;
        }
        if (interfaceC658750Psf != null) {
            c1331670kl3LJIIIIZZ.LJJJIL = interfaceC658750Psf;
        }
        if (((Boolean) C271710Akr.LIZ.getValue()).booleanValue()) {
            C1483205rK<UrlModel> c1483205rK = C1483305rL.LIZ;
            synchronized (c1483205rK) {
                if (!c1483205rK.LIZ.contains(urlModel)) {
                    if (c1483205rK.LIZ.size() >= 4) {
                        c1483205rK.LIZ.remove(c1483205rK.LIZ.iterator().next());
                    }
                    c1483205rK.LIZ.add(urlModel);
                }
            }
            C689680R3m c689680R3m = new C689680R3m(urlModel, 1);
            if (SearchCoverLowResAndBlurDataExperiment.LIZ()) {
                c1331670kl3LJIIIIZZ.LJIIL(c689680R3m);
            } else {
                c1331670kl3LJIIIIZZ.LJIIJ(c689680R3m);
            }
        } else if (SearchCoverLowResAndBlurDataExperiment.LIZ()) {
            c1331670kl3LJIIIIZZ.LJIIJJI();
        } else {
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        }
        Aweme aweme = this.LL;
        if (aweme != null && aweme.getVideo() != null && !C661110PwT.LIZ()) {
            this.LL.getVideo().setCachedOuterCoverUrl(urlModel);
            this.LL.getVideo().setCachedOuterCoverSize(iArrR5);
        }
    }
}
