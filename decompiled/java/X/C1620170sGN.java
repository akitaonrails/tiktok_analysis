package X;

import Y.ACListenerS158S0100000_24;
import Y.ACallableS6S0211000_9;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0sGN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1620170sGN extends AbstractC1620200sGQ {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LLILZIL;
    public final InterfaceC1620210sGR LLILZLL;
    public final boolean LLIZ;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
        Aweme aweme = this.LL;
        if (aweme != null) {
            R5(aweme.getVideo());
        }
    }

    public final void P5(Aweme aweme) {
        VideoMaskInfo videoMaskInfo;
        String str;
        VideoMaskInfo videoMaskInfo2;
        VideoMaskInfo videoMaskInfo3;
        int i;
        int i2 = 8;
        if (aweme != null) {
            this.LL = aweme;
            R5(aweme.getVideo());
            AwemeStatistics statistics = aweme.getStatistics();
            if (this.LLIZ) {
                LinearLayout linearLayout = (LinearLayout) this.itemView.findViewById(R.id.m1n);
                if (linearLayout != null) {
                    if (statistics == null) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    C786410Ut5.LJZL(i, linearLayout);
                }
                if (statistics != null) {
                    ((TextView) this.itemView.findViewById(R.id.m1o)).setText(C1843500y4a.LIZIZ(statistics.getPlayCount()));
                }
            } else {
                LinearLayout linearLayout2 = (LinearLayout) this.itemView.findViewById(R.id.m1n);
                if (linearLayout2 != null) {
                    C786410Ut5.LJZL(8, linearLayout2);
                }
            }
        }
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.m1m);
        if (frameLayout != null) {
            Aweme aweme2 = this.LL;
            if (aweme2 != null && (videoMaskInfo = aweme2.getVideoMaskInfo()) != null && Intrinsics.LJFF(videoMaskInfo.showMask, Boolean.TRUE)) {
                String str2 = null;
                if (aweme2 != null && (videoMaskInfo3 = aweme2.getVideoMaskInfo()) != null) {
                    str = videoMaskInfo3.title;
                } else {
                    str = null;
                }
                if (C123100dR.LIZ(str)) {
                    if (aweme2 != null && (videoMaskInfo2 = aweme2.getVideoMaskInfo()) != null) {
                        str2 = videoMaskInfo2.cancelMaskLabel;
                    }
                    if (C123100dR.LIZ(str2)) {
                        i2 = 0;
                    }
                }
            }
            C786410Ut5.LJZ(i2, frameLayout);
        }
    }

    public final void R5(final Video video) {
        String str;
        List<String> urlList;
        UrlModel dynamicCover;
        String strLIZIZ;
        if (video == null) {
            return;
        }
        final boolean z = true;
        if (L5()) {
            final SmartImageView smartImageView = this.LLILLJJLI;
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            if (!C20595415iS.LIZIZ()) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!C036E.LIZ.LIZIZ() || C0XJA.LIZ(contextLIZ)) {
                    if (C0VO3.LIZIZ("use_dynamic_cover", true) && (dynamicCover = video.getDynamicCover()) != null && dynamicCover.getUrlList() != null && !dynamicCover.getUrlList().isEmpty()) {
                        Iterator<String> it2 = dynamicCover.getUrlList().iterator();
                        while (it2.hasNext()) {
                            if (!TextUtils.isEmpty(it2.next())) {
                                final UrlModel dynamicCover2 = video.getDynamicCover();
                                final ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(dynamicCover2);
                                if (!TextUtils.isEmpty("") && !imageUrlModelLIZ.isEmpty()) {
                                    List<String> urls = imageUrlModelLIZ.getUrls();
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(urls, 10));
                                    for (String str2 : urls) {
                                        if (a0.LJJIIZI(str2, "?", false)) {
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(str2);
                                            sbLIZ.append("&ilog=");
                                            sbLIZ.append("");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                        } else {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append(str2);
                                            sbLIZ2.append("?ilog=");
                                            sbLIZ2.append("");
                                            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        }
                                        arrayList.add(strLIZIZ);
                                    }
                                    imageUrlModelLIZ.setUrls(arrayList);
                                }
                                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModelLIZ);
                                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                                c1331670kl3LJIIIIZZ.LIZLLL("KidsAewmeViewHolder");
                                InterfaceC1331190kkH interfaceC1331190kkH = new InterfaceC1331190kkH() { // from class: X.0O2k
                                    public final /* synthetic */ boolean LIZ = false;

                                    @Override // X.InterfaceC1331190kkH
                                    public final void onError(int i) {
                                        C15O7.LIZIZ(new ACallableS6S0211000_9(this.LIZ, i, imageUrlModelLIZ, video, 1), C823050WQl.LIZIZ(), null);
                                    }
                                };
                                c1331670kl3LJIIIIZZ.LJJJ = -1;
                                c1331670kl3LJIIIIZZ.LJJJI = interfaceC1331190kkH;
                                c1331670kl3LJIIIIZZ.LJJIJL = true;
                                c1331670kl3LJIIIIZZ.LJFF = 1;
                                c1331670kl3LJIIIIZZ.LJIIJ(new AbstractC1335900krs() { // from class: X.0OD5
                                    public final /* synthetic */ boolean LLILZLL = false;

                                    @Override // X.InterfaceC427850Gq7
                                    public final void cm(Uri uri, View view, Throwable th) {
                                        String message;
                                        if (this.LLILZLL && !imageUrlModelLIZ.isEmpty() && video.getPlayAddr() != null && !TextUtils.isEmpty(video.getPlayAddr().getUri())) {
                                            JSONObject jSONObject = new JSONObject();
                                            try {
                                                jSONObject.put("frames", -1);
                                                jSONObject.put("vid", video.getPlayAddr().getUri());
                                                jSONObject.put("url", imageUrlModelLIZ.getUrls().get(0));
                                                if (th != null) {
                                                    message = th.getMessage();
                                                } else {
                                                    message = null;
                                                }
                                                jSONObject.put("errMsg", message);
                                                C794240VDq.LIZJ("aweme_animated_image_frames_error", jSONObject);
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append("animated frame error: ");
                                                sbLIZ3.append(jSONObject);
                                                C2188811AlT.LIZIZ(sbLIZ3);
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                            }
                                        }
                                    }

                                    @Override // X.InterfaceC427850Gq7
                                    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                                        smartImageView.setUserVisibleHint(true);
                                        if (z) {
                                            smartImageView.LJI();
                                        }
                                        UrlModel urlModel = new UrlModel();
                                        UrlModel urlModel2 = dynamicCover2;
                                        ImageUrlModel imageUrlModel = imageUrlModelLIZ;
                                        urlModel.setUri(urlModel2.getUri());
                                        urlModel.setUrlList(imageUrlModel.getUrls());
                                        video.setCachedOuterCoverUrl(urlModel);
                                    }
                                });
                                this.LLILLL = true;
                                return;
                            }
                        }
                    }
                }
            }
        }
        UrlModel cover = video.getCover();
        if (cover != null && (urlList = cover.getUrlList()) != null) {
            str = (String) C13LP.LJJJLL(urlList);
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str)) {
            C1331670kl3 c1331670kl3LJIIIIZZ2 = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(video.getCover()));
            int[] iArrLIZ = C422830Gi1.LIZ(200);
            if (iArrLIZ != null) {
                c1331670kl3LJIIIIZZ2.LJJIJ(iArrLIZ);
            }
            c1331670kl3LJIIIIZZ2.LJJ(this.LLILLJJLI);
            c1331670kl3LJIIIIZZ2.LIZLLL("KidsAewmeViewHolder");
            C786410Ut5.h3(c1331670kl3LJIIIIZZ2);
            return;
        }
        this.LLILLJJLI.setActualImageResource(R.attr.bv);
    }

    public C1620170sGN(final View view, String str, InterfaceC1620210sGR interfaceC1620210sGR, boolean z) {
        new AbstractC1620180sGO<Aweme>(view) { // from class: X.0sGQ
        };
        this.LLILZIL = str;
        this.LLILZLL = interfaceC1620210sGR;
        this.LLIZ = z;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.m1l);
        this.LLILLJJLI = smartImageView;
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS158S0100000_24(this, 89));
        }
        SmartImageView smartImageView2 = this.LLILLJJLI;
        if (smartImageView2 != null) {
            smartImageView2.setForeground(C800330VaR.LIZIZ(view.getContext(), R.drawable.cec));
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.m1m);
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
    }
}
