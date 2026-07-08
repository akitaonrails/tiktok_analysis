package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IVideoCellAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.feed.platform.cell.component.adaption.CellAdaptionComponentAbility;
import com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0R6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R6Y {
    public final C0R6B LIZ;
    public final C0R6W LIZIZ;
    public CellSurveyComponentAbility LIZJ;
    public IVideoCellAbility LIZLLL;
    public final C21385918mf LJ;
    public final C0R6A LJFF;
    public final C0R6Z LJI;

    public final IVideoCellAbility LIZ() {
        IVideoCellAbility iVideoCellAbility = this.LIZLLL;
        if (iVideoCellAbility != null) {
            return iVideoCellAbility;
        }
        InterfaceC665370Q7z interfaceC665370Q7zLLIIJLIL = this.LIZ.LIZIZ().LLIIJLIL();
        IVideoCellAbility iVideoCellAbility2 = interfaceC665370Q7zLLIIJLIL != null ? (IVideoCellAbility) C1558520qew.LIZ(interfaceC665370Q7zLLIIJLIL, IVideoCellAbility.class, null) : null;
        this.LIZLLL = iVideoCellAbility2;
        return iVideoCellAbility2;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0R6A] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0R6Z] */
    public C0R6Y(C0R6G c0r6g) {
        boolean z;
        this.LIZ = c0r6g;
        this.LIZIZ = new C0R6W(c0r6g);
        if (((Boolean) C2279941ELw.LIZIZ.getValue()).booleanValue()) {
            z = true;
        } else {
            C844470XAv.LIZ.getClass();
            if (C2188561Al4.LJIIJ(C844470XAv.LIZ())) {
                z = C2528609vY.LIZ;
            } else {
                z = false;
            }
        }
        this.LJ = new C21385918mf(z, ((Boolean) C2279941ELw.LJ.getValue()).booleanValue(), C1E8Y.LIZ(), C2551609zG.LIZ, ((Number) C1E8Y.LIZJ.getValue()).intValue());
        this.LJFF = new InterfaceC21385618mc() { // from class: X.0R6A
            @Override // X.InterfaceC21386618mm
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC21386618mm
            public final void LJ() {
            }

            @Override // X.InterfaceC21386618mm
            public final void LJI() {
            }

            @Override // X.InterfaceC21386618mm
            public final void LJIIIZ() {
            }

            /* JADX WARN: Type inference failed for: r15v0, types: [X.0OnP] */
            /* JADX WARN: Type inference failed for: r15v1, types: [X.0OnP] */
            /* JADX WARN: Type inference failed for: r15v2, types: [X.0OnP] */
            /* JADX WARN: Type inference failed for: r15v3, types: [X.0OnP] */
            @Override // X.InterfaceC21386618mm
            public final C21386818mo LIZJ() {
                UrlModel originCover;
                List<String> urlList;
                final String aid;
                UrlModel originCover2;
                List<String> urlList2;
                C1325710kbR c1325710kbRLIZ;
                BaseFeedPageParams baseFeedPageParams;
                UrlModel cachedOuterCoverUrl;
                List<String> urlList3;
                VideoUrlModel playAddr;
                List<String> urlList4;
                Video video;
                UrlModel originCover3;
                List<String> urlList5;
                Aweme aweme;
                Video video2;
                C690990R8n c690990R8nFF0;
                InterfaceC690040R4w interfaceC690040R4wLIZLLL = this.LIZ.LIZ.LIZLLL();
                if (interfaceC690040R4wLIZLLL != null && C19252910Tv.LIZIZ.LIZLLL().LJIJI().LJJJI() && (aweme = this.LIZ.LIZ.getAweme()) != null && (video2 = aweme.getVideo()) != null) {
                    ImageUrlModel imageUrlModelLIZ = C438710HIf.LIZ(video2.getOriginCover());
                    int width = video2.getWidth();
                    int height = video2.getHeight();
                    CellAdaptionComponentAbility cellAdaptionComponentAbilityLIZJ = this.LIZ.LIZ.LIZJ();
                    interfaceC690040R4wLIZLLL.LIZJ(width, height, (cellAdaptionComponentAbilityLIZJ == null || (c690990R8nFF0 = cellAdaptionComponentAbilityLIZJ.FF0(this.LIZ.LIZ.getContext(), this.LIZ.LIZ.getAweme(), null, this.LIZ.LIZ.LLLLLLLZIL())) == null) ? 0 : c690990R8nFF0.LIZ, imageUrlModelLIZ);
                }
                C0R6W c0r6w = this.LIZ.LIZIZ;
                Aweme aweme2 = c0r6w.LIZ.getAweme();
                Video video3 = aweme2 != null ? aweme2.getVideo() : null;
                if (C1019620cdk.LIZIZ(3, aweme2)) {
                    if (aweme2 == null || (video = aweme2.getVideo()) == null || (originCover3 = video.getOriginCover()) == null || (urlList5 = originCover3.getUrlList()) == null || urlList5.isEmpty()) {
                        try {
                            return new C21386818mo(C800330VaR.LIZIZ(c0r6w.LIZ.getContext(), R.drawable.bb4), 0, (Drawable) null, 14);
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }
                    String strLIZIZ = C0R6W.LIZIZ(video);
                    ImageUrlModel imageUrlModelLIZ2 = C438710HIf.LIZ(video.getOriginCover());
                    EnumC1334360kpO enumC1334360kpO = EnumC1334360kpO.HIGH;
                    C708750Rr7 c708750Rr7LIZ = c0r6w.LIZ();
                    Aweme aweme3 = c0r6w.LIZ.getAweme();
                    aid = aweme3 != null ? aweme3.getAid() : null;
                    return new C21386418mk(imageUrlModelLIZ2, enumC1334360kpO, c708750Rr7LIZ, new InterfaceC658750Psf(aid) { // from class: X.0OnP
                        public final String LL;

                        @Override // X.InterfaceC658750Psf
                        public final /* synthetic */ void Ck(JSONObject jSONObject) {
                        }

                        {
                            this.LL = aid;
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                            if (C0BSQ.LIZ && !z2) {
                                C720650SOp.LIZ(this.LL, "video_cover", jSONObject);
                            }
                        }
                    }, null, null, strLIZIZ, 2017);
                }
                if ((video3 == null || (playAddr = video3.getPlayAddr()) == null || (urlList4 = playAddr.getUrlList()) == null || urlList4.isEmpty()) || video3 == null || (originCover = video3.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || urlList.isEmpty() || video3 == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("res://");
                    sbLIZ.append(c0r6w.LIZ.getContext().getPackageName());
                    sbLIZ.append('/');
                    sbLIZ.append(R.drawable.cg7);
                    return new C0R6D(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)), 14);
                }
                Aweme aweme4 = c0r6w.LIZ.getAweme();
                if (aweme4 != null && aweme4.getAwemeType() == 31) {
                    String strLIZIZ2 = C0R6W.LIZIZ(video3);
                    ImageUrlModel imageUrlModelLIZ3 = C438710HIf.LIZ(video3.getOriginCover());
                    C708750Rr7 c708750Rr7LIZ2 = c0r6w.LIZ();
                    Aweme aweme5 = c0r6w.LIZ.getAweme();
                    aid = aweme5 != null ? aweme5.getAid() : null;
                    return new C21386418mk(imageUrlModelLIZ3, null, c708750Rr7LIZ2, new InterfaceC658750Psf(aid) { // from class: X.0OnP
                        public final String LL;

                        @Override // X.InterfaceC658750Psf
                        public final /* synthetic */ void Ck(JSONObject jSONObject) {
                        }

                        {
                            this.LL = aid;
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                            if (C0BSQ.LIZ && !z2) {
                                C720650SOp.LIZ(this.LL, "video_cover", jSONObject);
                            }
                        }
                    }, null, null, strLIZIZ2, 2021);
                }
                if (C729980SkG.LJI(aweme2) || AwemeExtKt.isCommentPostInvisible(aweme2)) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("res://");
                    sbLIZ2.append(c0r6w.LIZ.getContext().getPackageName());
                    sbLIZ2.append('/');
                    sbLIZ2.append(R.drawable.cg7);
                    return new C0R6D(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ2)), 14);
                }
                C690870R8b c690870R8bJm = c0r6w.LIZ.LIZIZ().jm();
                if (c690870R8bJm != null && (baseFeedPageParams = c690870R8bJm.LJ) != null && 2 == baseFeedPageParams.awemeFromPage && (cachedOuterCoverUrl = video3.getCachedOuterCoverUrl()) != null && (urlList3 = cachedOuterCoverUrl.getUrlList()) != null && !urlList3.isEmpty() && C0C64.LJIILLIIL().LJIIIZ(31744, "enable_reuse_external_image", true, false)) {
                    Pair pair = (video3.getCachedOuterCoverSize() == null || video3.getCachedOuterCoverSize().length != 2) ? null : new Pair(Integer.valueOf(video3.getCachedOuterCoverSize()[0]), Integer.valueOf(video3.getCachedOuterCoverSize()[1]));
                    String strLIZIZ3 = C0R6W.LIZIZ(video3);
                    ImageUrlModel imageUrlModelLIZ4 = C438710HIf.LIZ(video3.getCachedOuterCoverUrl());
                    C708750Rr7 c708750Rr7LIZ3 = c0r6w.LIZ();
                    Aweme aweme6 = c0r6w.LIZ.getAweme();
                    aid = aweme6 != null ? aweme6.getAid() : null;
                    return new C21386418mk(imageUrlModelLIZ4, null, c708750Rr7LIZ3, new InterfaceC658750Psf(aid) { // from class: X.0OnP
                        public final String LL;

                        @Override // X.InterfaceC658750Psf
                        public final /* synthetic */ void Ck(JSONObject jSONObject) {
                        }

                        {
                            this.LL = aid;
                        }

                        @Override // X.InterfaceC658750Psf
                        public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                            if (C0BSQ.LIZ && !z2) {
                                C720650SOp.LIZ(this.LL, "video_cover", jSONObject);
                            }
                        }
                    }, pair, null, strLIZIZ3, 1989);
                }
                EnumC714850S2h enumC714850S2h = EnumC714850S2h.DEFAULT;
                if (C609820Nvw.LIZ && (originCover2 = video3.getOriginCover()) != null && (urlList2 = originCover2.getUrlList()) != null && !urlList2.isEmpty() && (c1325710kbRLIZ = C1325710kbR.LIZ(UriProtector.parse((String) ListProtector.get(video3.getOriginCover().getUrlList(), 0)))) != null) {
                    C1324810kZz c1324810kZzLJI = C1324810kZz.LJI();
                    c1324810kZzLJI.getClass();
                    if (C1328130kfL.LJIILIIL().LJIJJ().LJII(c1324810kZzLJI.LJ(c1325710kbRLIZ.LIZIZ))) {
                        enumC714850S2h = EnumC714850S2h.SMALL;
                    }
                }
                String strLIZIZ4 = C0R6W.LIZIZ(video3);
                ImageUrlModel imageUrlModelLIZ5 = C438710HIf.LIZ(video3.getOriginCover());
                EnumC1334360kpO enumC1334360kpO2 = EnumC1334360kpO.HIGH;
                C708750Rr7 c708750Rr7LIZ4 = c0r6w.LIZ();
                Aweme aweme7 = c0r6w.LIZ.getAweme();
                aid = aweme7 != null ? aweme7.getAid() : null;
                return new C21386418mk(imageUrlModelLIZ5, enumC1334360kpO2, c708750Rr7LIZ4, new InterfaceC658750Psf(aid) { // from class: X.0OnP
                    public final String LL;

                    @Override // X.InterfaceC658750Psf
                    public final /* synthetic */ void Ck(JSONObject jSONObject) {
                    }

                    {
                        this.LL = aid;
                    }

                    @Override // X.InterfaceC658750Psf
                    public final void onImageLoaded(boolean z2, String str, JSONObject jSONObject) {
                        if (C0BSQ.LIZ && !z2) {
                            C720650SOp.LIZ(this.LL, "video_cover", jSONObject);
                        }
                    }
                }, null, enumC714850S2h, strLIZIZ4, 1953);
            }

            @Override // X.InterfaceC21386618mm
            public final String LIZLLL() {
                Aweme aweme = this.LIZ.LIZ.getAweme();
                if (aweme != null) {
                    return aweme.getDesc();
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:54:0x00c5 A[PHI: r0
              0x00c5: PHI (r0v24 com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility) = 
              (r0v23 com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility)
              (r0v37 com.ss.android.ugc.feed.platform.cell.component.survey.CellSurveyComponentAbility)
             binds: [B:48:0x00ab, B:53:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.InterfaceC21386618mm
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean LJFF() {
                /*
                    Method dump skipped, instruction units count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0R6A.LJFF():boolean");
            }

            @Override // X.InterfaceC21386618mm
            public final String LJII() {
                Video video;
                UrlModel originCover;
                List<String> urlList;
                Aweme aweme = this.LIZ.LIZ.getAweme();
                if (aweme == null || (video = aweme.getVideo()) == null || (originCover = video.getOriginCover()) == null || (urlList = originCover.getUrlList()) == null || urlList.isEmpty()) {
                    return null;
                }
                return (String) ListProtector.get(urlList, 0);
            }

            @Override // X.InterfaceC21386618mm
            public final void LJIIIIZZ() {
                String aid;
                Video video;
                ViewGroup viewGroupLJ;
                InterfaceC690350R6b interfaceC690350R6b;
                CellAdaptionComponentAbility cellAdaptionComponentAbilityLIZJ = this.LIZ.LIZ.LIZJ();
                ViewGroup viewGroupLLLLLLLZIL = this.LIZ.LIZ.LLLLLLLZIL();
                Aweme aweme = this.LIZ.LIZ.getAweme();
                if (cellAdaptionComponentAbilityLIZJ != null) {
                    Context context = this.LIZ.LIZ.getContext();
                    IVideoCellAbility iVideoCellAbilityLIZ = this.LIZ.LIZ();
                    View videoView = iVideoCellAbilityLIZ != null ? iVideoCellAbilityLIZ.getVideoView() : null;
                    C0R5Z c0r5zLIZLLL = this.LIZ.LIZ.LIZ().LIZLLL();
                    cellAdaptionComponentAbilityLIZJ.CX1(context, aweme, videoView, (c0r5zLIZLLL == null || (interfaceC690350R6b = c0r5zLIZLLL.LIZ) == null) ? null : interfaceC690350R6b.LIZ(), null, viewGroupLLLLLLLZIL);
                }
                if (aweme != null) {
                    aid = aweme.getAid();
                    video = aweme.getVideo();
                } else {
                    aid = null;
                    video = null;
                }
                C692910RFx.LJII(aid, video, viewGroupLLLLLLLZIL);
                Context context2 = this.LIZ.LIZ.getContext();
                if (context2 == null || (viewGroupLJ = this.LIZ.LIZ.LJ()) == null || viewGroupLLLLLLLZIL == null || cellAdaptionComponentAbilityLIZJ == null) {
                    return;
                }
                cellAdaptionComponentAbilityLIZJ.FH1(context2, aweme, viewGroupLJ, aweme != null ? AwemeExtKt.getOcrLocation(aweme) : null, viewGroupLLLLLLLZIL);
            }

            @Override // X.InterfaceC21386618mm
            public final String getSourceId() {
                C0R6C c0r6cLIZIZ;
                if (C288430BSf.LIZ && (c0r6cLIZIZ = this.LIZ.LIZ.LIZIZ()) != null && c0r6cLIZIZ.km()) {
                    Aweme awemeIm = this.LIZ.LIZ.LIZIZ().im();
                    if (awemeIm != null) {
                        return awemeIm.getAid();
                    }
                    return null;
                }
                Aweme aweme = this.LIZ.LIZ.getAweme();
                if (aweme != null) {
                    return aweme.getAid();
                }
                return null;
            }

            /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[PHI: r2
              0x00a3: PHI (r2v1 int) = (r2v0 int), (r2v3 int), (r2v3 int), (r2v3 int) binds: [B:43:0x00d0, B:27:0x0097, B:29:0x009b, B:31:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
            @Override // X.InterfaceC21385618mc
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(int r15, int r16) {
                /*
                    Method dump skipped, instruction units count: 222
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0R6A.LIZ(int, int):void");
            }
        };
        this.LJI = new InterfaceC21387018mq() { // from class: X.0R6Z
            @Override // X.InterfaceC21387018mq
            public final void LIZ(String str) {
                C583420MuS.LIZJ(str, C0RRP.H_COVER);
            }

            @Override // X.InterfaceC21387018mq
            public final void LIZIZ(String str) {
                C583420MuS.LIZJ(str, C0RRP.S_COVER);
            }
        };
    }
}
