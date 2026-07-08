package X;

import Y.AObjectS247S0100000_29;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.ArticleStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.article.IArticleStickerComponentService;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.embed.EmbedHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.hashtag.single.SingleHashTagStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.social.mention.MentionStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19626011qU extends AbstractC2255721DQs<C0FVY> implements C0FVY, InterfaceC379610EuV, InterfaceC19627811qm {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public static final int LLJJL;
    public final C1DRG LL;
    public final ViewStub LLILLJJLI;
    public final FrameLayout LLILLL;
    public final CreativeInfo LLILZ;
    public final SingleImageData LLILZIL;
    public final Function0<C1462070o9N> LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public FrameLayout LLJJIJIL;
    public C0FT7 LLJJJIL;
    public InterfaceC1451050nrb LLJ = (InterfaceC1451050nrb) getDiContainer().LJIIL(null, InterfaceC1451050nrb.class);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1465010oE7.class, null);
    public final InterfaceC1731706qJ LLJILJILJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1464960oE2.class, null);
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 194));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 196));
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 198));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new AwS566S0100000_22(this, 197));
    public final InterfaceC1731706qJ LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC19639511sf.class, null);
    public final InterfaceC1731706qJ LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
    public final C01GW LLJJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 127));
    public final C1466170oFz LLJJJJ = new C1466170oFz(LJJJLIIL());
    public final InterfaceC1731706qJ LLJJJJJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1450920nrO.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19626011qU.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19626011qU.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19626011qU.class, "addYoursApi", "getAddYoursApi()Lcom/ss/android/ugc/gamora/editor/sticker/addyours/EditAddYoursStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19626011qU.class, "imageGlobalStickerApi", "getImageGlobalStickerApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/GlobalEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19626011qU.class, "articleStickerApi", "getArticleStickerApi()Lcom/ss/android/ugc/aweme/tools/sticker/core/article/IArticleStickerManagerComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19626011qU.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19626011qU.class, "isolateClipEditApi", "getIsolateClipEditApi()Lcom/ss/android/ugc/aweme/image/base/ImageIsolateClipEditApi;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJJL = 8;
    }

    @Override // X.C0FVY
    public void OT() {
    }

    public C0FVY X1() {
        return this;
    }

    private final InterfaceC1461390o8H H2() {
        return (InterfaceC1461390o8H) this.LLJI.getValue(this, LLJJJJLIIL[0]);
    }

    private final C0FTB m3() {
        return new C0FTB() { // from class: X.11qX
            @Override // X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJFF(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJI(StickerModel stickerModel, boolean z) {
            }

            @Override // X.C0FTB
            public final void LJII() {
            }

            @Override // X.C0FTB
            public final void LJIIIIZZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
            }

            @Override // X.C0FTB
            public final void LJIILIIL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILJJIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIILL(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIILLIIL(int i) {
            }

            @Override // X.C0FTB
            public final void LJIJ(int i) {
            }

            @Override // X.C0FTB
            public final void LJIJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIJJLI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJIL() {
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIFFI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJII(StickerModel stickerModel, MotionEvent motionEvent) {
            }

            @Override // X.C0FTB
            public final void LJJIIJ(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIIJZLJL(StickerModel stickerModel, boolean z, boolean z2) {
            }

            @Override // X.C0FTB
            public final void LJJIIZ() {
            }

            @Override // X.C0FTB
            public final void LJJIIZI(int i) {
            }

            @Override // X.C0FTB
            public final void LJJIJ() {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJI(StickerModel stickerModel) {
            }

            @Override // X.C0FTB
            public final void LJJIJIIJIL(int i) {
            }

            @Override // X.C0FTB
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void LIZIZ(StickerModel stickerModel) {
                C1451630nsX c1451630nsXW2;
                if (stickerModel.getStickerType() == EnumC1466150oFx.TEXT && (c1451630nsXW2 = this.LL.w2()) != null) {
                    c1451630nsXW2.LIZIZ(AFwS273S0000000_29.get$arr$(73));
                }
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                LJJIJL(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
                LJJIJL(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
                LJJIJL(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIJI(StickerModel stickerModel) {
                this.LL.o2().LJJIIJ(1);
            }

            @Override // X.C0FTB
            public final void LJJIII(StickerModel stickerModel) {
                this.LL.o2().LJJIIJ(1);
            }

            public final void LJJIJL(StickerModel stickerModel) {
                this.LL.o2().LJIILJJIL(1);
                this.LL.eb(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
            }

            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
                C1451630nsX c1451630nsXW2;
                if (stickerModel.getStickerType() == EnumC1466150oFx.TEXT && (c1451630nsXW2 = this.LL.w2()) != null) {
                    c1451630nsXW2.LIZIZ(AFwS273S0000000_29.get$arr$(74));
                }
                this.LL.eb(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                String str2;
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
                if (Intrinsics.LJFF(str, "SLIDE_UP")) {
                    str2 = "drag";
                } else {
                    str2 = "other";
                }
                this.LL.LLJJJJ.LIZJ(stickerModel, str2, 0);
                C1466090oFr.LIZJ(this.LL.LJJJLIIL().creativeModel.stickerModel, stickerModel);
                ImageStickerInfoNewEngine stickerInfoNewEngine = this.LL.LLILZIL.getStickerInfoNewEngine();
                if (stickerInfoNewEngine != null) {
                    stickerInfoNewEngine.clearStickerById(stickerModel);
                }
            }
        };
    }

    public final InterfaceC388760FMc B3() {
        return new InterfaceC388760FMc() { // from class: X.11qb
            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FEQ LJFF() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                return 0.0f;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19627911qn LJIIIIZZ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C390610FTf LJIIJJI() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19604511n1 LJIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19656311vN LJIILL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19605411nA LJIJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIJI(boolean z) {
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJ() {
                return false;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FL9 LJIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIFFI() {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJII() {
            }

            @Override // X.InterfaceC388760FMc
            public final int LJJIII() {
                return 0;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19614111oZ getHashTagService() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUI w() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FF8 LIZ() {
                C0FVT c0fvtG2 = this.LIZ.G2();
                if (c0fvtG2 != null) {
                    return c0fvtG2.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                return new C386390FCz(this.LIZ.i3());
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19628411qs LIZJ() {
                InterfaceC19627111qf interfaceC19627111qfC3 = this.LIZ.c3();
                if (interfaceC19627111qfC3 != null) {
                    return interfaceC19627111qfC3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19639511sf LIZLLL() {
                return this.LIZ.Z1();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUB LJII() {
                return new C0FUB() { // from class: X.11qh
                    @Override // X.C0FUB
                    public final void LIZ() {
                    }
                };
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return this.LIZ.E3();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKH LJIIJ() {
                InterfaceC1409680mms interfaceC1409680mmsQ3 = this.LIZ.q3();
                if (interfaceC1409680mmsQ3 != null) {
                    return interfaceC1409680mmsQ3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC390170FRn LJIILIIL() {
                InterfaceC1465010oE7 interfaceC1465010oE7W1 = this.LIZ.W1();
                if (interfaceC1465010oE7W1 != null) {
                    return interfaceC1465010oE7W1.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FLH LJIILLIIL() {
                InterfaceC19627611qk interfaceC19627611qkV3 = this.LIZ.v3();
                if (interfaceC19627611qkV3 != null) {
                    return interfaceC19627611qkV3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJLI() {
                return this.LIZ.LJJJLIIL().creativeModel.editModel.showFirstTimeAnim;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJIIIZ(this.LIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJI() {
                this.LIZ.LJJJLIIL().creativeModel.editModel.showFirstTimeAnim = false;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJZLJL() {
                InterfaceC1465010oE7 interfaceC1465010oE7W1 = this.LIZ.W1();
                if (interfaceC1465010oE7W1 != null) {
                    interfaceC1465010oE7W1.LJLLL("");
                }
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                return new ArrayList();
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
                InterfaceC1451050nrb interfaceC1451050nrb;
                LiveData<C1456890o11> liveDataYh;
                C1456890o11 value;
                InterfaceC1451050nrb interfaceC1451050nrb2 = this.LIZ.LLJ;
                if ((interfaceC1451050nrb2 == null || (liveDataYh = interfaceC1451050nrb2.Yh()) == null || (value = liveDataYh.getValue()) == null || !value.LIZ || value.LIZIZ || !value.LIZJ) && (interfaceC1451050nrb = this.LIZ.LLJ) != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, true, false, true, false, 8);
                }
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJ(int i) {
                InterfaceC1451050nrb interfaceC1451050nrb;
                LiveData<C1456890o11> liveDataYh;
                C1456890o11 value;
                InterfaceC1451050nrb interfaceC1451050nrb2 = this.LIZ.LLJ;
                if ((interfaceC1451050nrb2 == null || (liveDataYh = interfaceC1451050nrb2.Yh()) == null || (value = liveDataYh.getValue()) == null || value.LIZ || value.LIZIZ || value.LIZJ) && (interfaceC1451050nrb = this.LIZ.LLJ) != null) {
                    C1456140nzo.LIZIZ(interfaceC1451050nrb, false, false, false, false, 8);
                }
            }
        };
    }

    @Override // X.C0FVY
    public View Ck() {
        if (this.LLJJIJIL == null) {
            return null;
        }
        C0FT7 c0ft7 = this.LLJJJIL;
        return (c0ft7 != null ? c0ft7 : null).Ja().LJI().LIZ();
    }

    @Override // X.C0FVY
    public List<StickerModel> Dt() {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LIZLLL();
    }

    public final C0FVT G2() {
        return (C0FVT) this.LLJILLL.getValue();
    }

    @Override // X.C0FVY
    public InterfaceC1444160ngU LJJIFFI() {
        return new InterfaceC1444160ngU() { // from class: X.0FW5
            @Override // X.InterfaceC1444160ngU
            public final boolean ve1(RectF rectF) {
                C0FT7 c0ft7 = this.LL.LLJJJIL;
                if (c0ft7 == null) {
                    c0ft7 = null;
                }
                List<StickerModel> listLIZLLL = c0ft7.LIZLLL();
                if (listLIZLLL == null || listLIZLLL.isEmpty()) {
                    return false;
                }
                for (StickerModel stickerModel : listLIZLLL) {
                    RectF visibleRectWithoutRotationInContainer = stickerModel.getBaseModel().getVisibleRectWithoutRotationInContainer();
                    Matrix matrix = new Matrix();
                    matrix.postRotate(stickerModel.getBaseModel().getRotation(), visibleRectWithoutRotationInContainer.centerX(), visibleRectWithoutRotationInContainer.centerY());
                    matrix.mapRect(visibleRectWithoutRotationInContainer);
                    if (visibleRectWithoutRotationInContainer.top < rectF.top || visibleRectWithoutRotationInContainer.bottom > rectF.bottom) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJIJIL.getValue(this, LLJJJJLIIL[1]);
    }

    public final InterfaceC1464960oE2 T2() {
        return (InterfaceC1464960oE2) this.LLJILJILJ.getValue(this, LLJJJJLIIL[3]);
    }

    @Override // X.C0FVY
    public void VY() {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(EnumC1466150oFx.PICTURE_HASHTAG_SINGLE, null, null, "", AFwS273S0000000_29.get$arr$(77));
    }

    public final InterfaceC1465010oE7 W1() {
        return (InterfaceC1465010oE7) this.LLJILJIL.getValue(this, LLJJJJLIIL[2]);
    }

    public final InterfaceC1450920nrO W2() {
        return (InterfaceC1450920nrO) this.LLJJJJJIL.getValue(this, LLJJJJLIIL[6]);
    }

    @Override // X.C0FVY
    public void Yp2() {
        if (C20612915lH.LIZIZ.LJIIIIZZ().LJFF(new AwS601S0100000_22(this, 128))) {
            return;
        }
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(EnumC1466150oFx.MENTION, null, null, "", AFwS273S0000000_29.get$arr$(76));
    }

    public final InterfaceC19639511sf Z1() {
        return (InterfaceC19639511sf) this.LLJJIJI.getValue(this, LLJJJJLIIL[4]);
    }

    @Override // X.C0FVY
    public View ZO1() {
        if (this.LLJJIJIL == null) {
            return null;
        }
        C0FT7 c0ft7 = this.LLJJJIL;
        return (c0ft7 != null ? c0ft7 : null).Ja().LJIIJJI();
    }

    @Override // X.C0FVY
    public void ai2() {
        if (this.LLIZLLLIL) {
            return;
        }
        this.LLIZLLLIL = true;
        ImageStickerInfoNewEngine stickerInfoNewEngine = this.LLILZIL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null) {
            for (TextStickerModel textStickerModel : stickerInfoNewEngine.getTextStickerModels()) {
                if (O3(textStickerModel)) {
                    C0FT7 c0ft7 = this.LLJJJIL;
                    if (c0ft7 == null) {
                        c0ft7 = null;
                    }
                    c0ft7.f3(textStickerModel, EnumC356070Dxd.COMMIT);
                }
            }
        }
    }

    @Override // X.C0FVY
    public Pair<Integer, Integer> al() {
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        Integer numValueOf = Integer.valueOf(frameLayout.getLayoutParams().width);
        FrameLayout frameLayout2 = this.LLJJIJIL;
        return new Pair<>(numValueOf, Integer.valueOf((frameLayout2 != null ? frameLayout2 : null).getLayoutParams().height));
    }

    public final InterfaceC19627111qf c3() {
        return (InterfaceC19627111qf) this.LLJJ.getValue();
    }

    @Override // X.C0FVY
    public boolean ck() {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.Ja().LJIIIZ();
    }

    @Override // X.C0FVY
    public void h51() {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(EnumC1466150oFx.PICTURE_HASHTAG_EMBED, null, null, "", AFwS273S0000000_29.get$arr$(75));
    }

    public final InterfaceC1452170ntP i3() {
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1451050nrb interfaceC1451050nrb = this.LLJ;
        if (interfaceC1451050nrb == null || (liveDataG = interfaceC1451050nrb.g()) == null) {
            return null;
        }
        return liveDataG.getValue();
    }

    public final InterfaceC388760FMc o2() {
        return (InterfaceC388760FMc) this.LLJJJ.getValue();
    }

    public final InterfaceC1409680mms q3() {
        return (InterfaceC1409680mms) this.LLJJIII.getValue();
    }

    @Override // X.C0FVY
    public void ud() {
        if (this.LLIZ) {
            return;
        }
        this.LLIZ = true;
        ImageStickerInfoNewEngine stickerInfoNewEngine = this.LLILZIL.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null) {
            Iterator<SingleHashTagStickerModel> it2 = stickerInfoNewEngine.getHashStickersSingle().iterator();
            while (true) {
                C0FT7 c0ft7 = null;
                if (!it2.hasNext()) {
                    break;
                }
                SingleHashTagStickerModel next = it2.next();
                C0FT7 c0ft72 = this.LLJJJIL;
                if (c0ft72 != null) {
                    c0ft7 = c0ft72;
                }
                c0ft7.f3(next, EnumC356070Dxd.COMMIT);
            }
            for (EmbedHashTagStickerModel embedHashTagStickerModel : stickerInfoNewEngine.getHashStickersEmbed()) {
                C0FT7 c0ft73 = this.LLJJJIL;
                if (c0ft73 == null) {
                    c0ft73 = null;
                }
                c0ft73.f3(embedHashTagStickerModel, EnumC356070Dxd.COMMIT);
            }
            for (TextStickerModel textStickerModel : stickerInfoNewEngine.getTextStickerModels()) {
                if (!O3(textStickerModel)) {
                    C0FT7 c0ft74 = this.LLJJJIL;
                    if (c0ft74 == null) {
                        c0ft74 = null;
                    }
                    c0ft74.f3(textStickerModel, EnumC356070Dxd.COMMIT);
                }
            }
            for (MentionStickerModel mentionStickerModel : stickerInfoNewEngine.getMentionStickerModels()) {
                C0FT7 c0ft75 = this.LLJJJIL;
                if (c0ft75 == null) {
                    c0ft75 = null;
                }
                c0ft75.f3(mentionStickerModel, EnumC356070Dxd.COMMIT);
            }
            for (ArticleStickerModel articleStickerModel : stickerInfoNewEngine.getArticleStickers()) {
                C0FT7 c0ft76 = this.LLJJJIL;
                if (c0ft76 == null) {
                    c0ft76 = null;
                }
                c0ft76.f3(articleStickerModel, EnumC356070Dxd.COMMIT);
            }
        }
    }

    public final InterfaceC19627611qk v3() {
        return (InterfaceC19627611qk) this.LLJJI.getValue();
    }

    public final C1451630nsX w2() {
        return (C1451630nsX) this.LLJJIJIIJIL.getValue(this, LLJJJJLIIL[5]);
    }

    @Override // X.C0FVY
    public View xw() {
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.0FSj, X.0FT7, X.0FVb] */
    private final C0FT7 H3() {
        C19774612Ym c19774612YmLIZIZ;
        Pair<Float, Float> pairLIZ = C07LA.LIZ();
        C0FFO c0ffo = null;
        C0FFO c0ffo2 = new C0FFO(EnumC1466150oFx.PICTURE_HASHTAG_SINGLE, 35, true, true, true, true, true, C1697810uHb.LJ(2), null, false, false, false, false, false, false, new C19774612Ym(4), 1834624);
        C0FFO c0ffo3 = new C0FFO(EnumC1466150oFx.PICTURE_HASHTAG_EMBED, 35, true, true, true, false, true, C1697810uHb.LJ(2), null, false, false, false, false, false, false, new C19774612Ym(3), 1834624);
        C0FFO c0ffo4 = new C0FFO(EnumC1466150oFx.TEXT, 0, true, true, true, true, true, C1697810uHb.LJ(2, 1), new Pair(Float.valueOf(0.2f), Float.valueOf(10.0f)), true, false, false, false, false, false, new C0FXE(1), 206466);
        C0FFO c0ffo5 = new C0FFO(EnumC1466150oFx.MENTION, 0, false, false, false, false, true, C1697810uHb.LJ(2), pairLIZ, false, false, true, true, false, false, new C19774612Ym(5), 1783486);
        IArticleStickerComponentService.LIZ.getClass();
        IArticleStickerComponentService value = C19607911nZ.LIZIZ.getValue();
        if (value != null && (c19774612YmLIZIZ = value.LIZIZ()) != null) {
            c0ffo = new C0FFO(EnumC1466150oFx.ARTICLE, 0, true, true, true, true, true, C1697810uHb.LJ(2), new Pair(Float.valueOf(0.75f), Float.valueOf(3.0f)), false, false, false, false, false, false, c19774612YmLIZIZ, 1832578);
        }
        ArrayList arrayListLJ = C1697810uHb.LJ(c0ffo2, c0ffo3, c0ffo4, c0ffo5);
        if (c0ffo != null) {
            arrayListLJ.add(c0ffo);
        }
        final C0FUH c0fuh = new C0FUH(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LLILZ, EnumC20228214Cy.IMAGE_STICKER, null, false, 12), null, 0, null, null, false, false, false, true, arrayListLJ, EnumC391400FWg.IMAGE_NON_GLOBAL_EDIT, C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_fix_z_index", true, true), !C1441980ncy.LIZIZ(LJJJLIIL()), C1441980ncy.LIZIZ(LJJJLIIL()), C1441980ncy.LIZIZ(LJJJLIIL()) ? C1428150nGf.LIZLLL() : 0, C0C64.LJIILLIIL().LJIIIZ(31744, "tt_photo_template_fix_z_index", true, true), 1019);
        this.LLILLJJLI.setLayoutResource(R.layout.fac);
        this.LLJJIJIL = (FrameLayout) C786410Ut5.LJLLLL(this.LLILLJJLI);
        final Activity activityLJII = C1664590tQ1.LJII(this);
        FrameLayout frameLayout = this.LLJJIJIL;
        FrameLayout frameLayout2 = frameLayout != null ? frameLayout : null;
        final FrameLayout frameLayout3 = this.LLILLL;
        final InterfaceC388760FMc interfaceC388760FMcO2 = o2();
        final FrameLayout frameLayout4 = frameLayout2;
        ?? r5 = new C390390FSj(c0fuh, this, activityLJII, frameLayout4, frameLayout3, interfaceC388760FMcO2) { // from class: X.0FVb
            public final /* synthetic */ C19626011qU LJIJI;

            @Override // X.C390390FSj, X.C0FT7
            public final <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx) {
                if (enumC1466150oFx == EnumC1466150oFx.ADD_YOURS) {
                    InterfaceC1464960oE2 interfaceC1464960oE2T2 = this.LJIJI.T2();
                    if (interfaceC1464960oE2T2 != null) {
                        return (T) interfaceC1464960oE2T2.LLIIIZ(enumC1466150oFx);
                    }
                    return null;
                }
                return (T) super.LLIIIZ(enumC1466150oFx);
            }

            @Override // X.C390390FSj, X.C0FT7
            public final List<C0FTJ<StickerModel>> LLLLLZ(EnumC1466150oFx enumC1466150oFx) {
                List<C0FTJ<StickerModel>> listLLLLLZ;
                if (enumC1466150oFx == EnumC1466150oFx.ADD_YOURS) {
                    InterfaceC1464960oE2 interfaceC1464960oE2T2 = this.LJIJI.T2();
                    if (interfaceC1464960oE2T2 == null || (listLLLLLZ = interfaceC1464960oE2T2.LLLLLZ(enumC1466150oFx)) == null) {
                        return C13BV.INSTANCE;
                    }
                    return listLLLLLZ;
                }
                return super.LLLLLZ(enumC1466150oFx);
            }

            @Override // X.C390390FSj, X.C0FT7
            public final StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
                StickerModel stickerModelF4;
                if (stickerModel.getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                    InterfaceC1464960oE2 interfaceC1464960oE2T2 = this.LJIJI.T2();
                    if (interfaceC1464960oE2T2 == null || (stickerModelF4 = interfaceC1464960oE2T2.f4(stickerModel)) == null) {
                        return super.f3(stickerModel, enumC356070Dxd);
                    }
                    return stickerModelF4;
                }
                return super.f3(stickerModel, enumC356070Dxd);
            }

            @Override // X.C390390FSj, X.C0FT7
            public final void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
                if (stickerModel.getStickerType() == EnumC1466150oFx.ADD_YOURS) {
                    InterfaceC1464960oE2 interfaceC1464960oE2T2 = this.LJIJI.T2();
                    if (interfaceC1464960oE2T2 != null) {
                        interfaceC1464960oE2T2.J4(stickerModel);
                        return;
                    }
                    return;
                }
                super.k3(stickerModel, enumC356070Dxd);
            }

            {
                this.LJIJI = this;
            }
        };
        r5.LJJZZI(m3());
        H2().LIZIZ(new GestureInteractItem(250, r5.LJIIIIZZ));
        r5.initService();
        if (C297370Bl9.LIZ()) {
            InterfaceC1464960oE2 interfaceC1464960oE2T2 = T2();
            if (interfaceC1464960oE2T2 != null) {
                interfaceC1464960oE2T2.Zw0(getLifecycle(), this, new AwS608S0100000_29((C391090FVb) r5, 109));
            }
        } else {
            InterfaceC1464960oE2 interfaceC1464960oE2T22 = T2();
            if (interfaceC1464960oE2T22 != null) {
                interfaceC1464960oE2T22.FD0(this, new AwS608S0100000_29((C391090FVb) r5, 110));
            }
        }
        IArticleStickerService.Companion.getClass();
        InterfaceC19622811py interfaceC19622811pyLIZ = C19603211mo.LIZ();
        if (interfaceC19622811pyLIZ != null && interfaceC19622811pyLIZ.LJII()) {
            new C390340FSe(r5).LIZ().LLJL = new AwS566S0100000_22(this, 195);
        }
        return r5;
    }

    private final void Xi() {
        C1451630nsX c1451630nsXW2 = w2();
        if (c1451630nsXW2 != null) {
            c1451630nsXW2.LIZ(Collections.singletonList(new C2217381BqS() { // from class: X.0mky
                @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
                public final Object get(Object obj) {
                    return Boolean.valueOf(((C1408460mku) obj).LIZIZ);
                }
            }), this, new AObjectS247S0100000_29(this, 43));
        }
    }

    public final C19647711tz E3() {
        String strLIZJ;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        UrlModel avatarThumb = currentUser != null ? currentUser.getAvatarThumb() : null;
        if (C0FEA.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('@');
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw.getClass();
            sbLIZ.append(C1464900oDw.LIZJ(currentUser2, resources));
            strLIZJ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            C1464900oDw c1464900oDw2 = C1464900oDw.LIZ;
            C19292410dm currentUser3 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources2 = C1664590tQ1.LJIIIZ(this).getResources();
            c1464900oDw2.getClass();
            strLIZJ = C1464900oDw.LIZJ(currentUser3, resources2);
        }
        float f = C0FEA.LIZIZ() ? 17.0f : 15.0f;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("");
        C1464900oDw c1464900oDw3 = C1464900oDw.LIZ;
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        C19292410dm currentUser4 = C0CHQ.LIZ().getAccountService().getCurrentUser();
        c1464900oDw3.getClass();
        sbLIZ2.append(C1464900oDw.LIZ(contextLJIIIZ, currentUser4));
        return new C19647711tz(avatarThumb, strLIZJ != null ? strLIZJ : "", f, C2188811AlT.LIZIZ(sbLIZ2), 63);
    }

    @Override // X.C0FVY
    public void Ie0() {
        InterfaceC19639511sf interfaceC19639511sfZ1 = Z1();
        if (interfaceC19639511sfZ1 != null) {
            interfaceC19639511sfZ1.jm0(C1664590tQ1.LJIIIZ(this), "2");
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJJJIL = H3();
        Xi();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final boolean O3(TextStickerModel textStickerModel) {
        return textStickerModel.getForceEffectRender();
    }

    @Override // X.C0FVY
    public void J4(StickerModel stickerModel) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.k3(stickerModel, EnumC356070Dxd.COMMIT);
    }

    @Override // X.C0FVY
    public void L2(int i) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJ(i, null, true, EnumC356070Dxd.COMMIT);
    }

    @Override // X.C0FVY
    public void LJJJJJ(int i) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.rd(i, null);
    }

    @Override // X.C0FVY
    public void LJJZZI(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJJZZI(c0ftb);
    }

    @Override // X.C0FVY
    public void LJLLLL(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJLLLL(c0ftb);
    }

    @Override // X.InterfaceC19627811qm
    public void LLF(C0FT5 c0ft5) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 != null) {
            c0ft7.ur(new AwS608S0100000_29(c0ft5, 111));
        }
    }

    @Override // X.C0FVY
    public <T> T LLIIIZ(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            return null;
        }
        return (T) c0ft7.LLIIIZ(enumC1466150oFx);
    }

    @Override // X.C0FVY
    public StickerModel LLJJIJI(int i) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LLJJIJI(i);
    }

    @Override // X.C0FVY
    public List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.LJIIIZ(enumC1466150oFx);
    }

    @Override // X.C0FVY
    public void LLLLZLL(boolean z) {
        int i;
        FrameLayout frameLayout = this.LLJJIJIL;
        if (frameLayout != null) {
            if (z) {
                i = 0;
            } else {
                i = 4;
            }
            C786410Ut5.LJZ(i, frameLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0FVY
    public void eb(StickerModel stickerModel) {
        SingleImageData singleImageData;
        List<SingleImageData> imageList;
        SingleImageData next;
        if (this.LLILZIL.getStickerInfoNewEngine() == null) {
            this.LLILZIL.setStickerInfoNewEngine(new ImageStickerInfoNewEngine(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0));
        }
        StickerModel stickerModelUpdateMediaSize = stickerModel.updateMediaSize(new Pair<>(Integer.valueOf(stickerModel.getBaseModel().getContainerWidth()), Integer.valueOf((int) (stickerModel.getBaseModel().getContainerWidth() / this.LLILZIL.getEditImageInfo().getRatio()))));
        if (stickerModelUpdateMediaSize.isNotEmptyModel()) {
            ImageStickerInfoNewEngine stickerInfoNewEngine = this.LLILZIL.getStickerInfoNewEngine();
            if (stickerInfoNewEngine != null) {
                stickerInfoNewEngine.addStickerByType(stickerModelUpdateMediaSize);
            }
        } else {
            ImageStickerInfoNewEngine stickerInfoNewEngine2 = this.LLILZIL.getStickerInfoNewEngine();
            if (stickerInfoNewEngine2 != null) {
                stickerInfoNewEngine2.clearStickerById(stickerModelUpdateMediaSize);
            }
        }
        ImageAlbumData imageAlbumData = LJJJLIIL().getImageAlbumData();
        ImageStickerInfoNewEngine stickerInfoNewEngine3 = null;
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            Iterator<SingleImageData> it2 = imageList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getId(), this.LLILZIL.getId())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            singleImageData = next;
        } else {
            singleImageData = null;
        }
        ImageStickerInfoNewEngine stickerInfoNewEngine4 = this.LLILZIL.getStickerInfoNewEngine();
        if (singleImageData != null) {
            stickerInfoNewEngine3 = singleImageData.getStickerInfoNewEngine();
        }
        if (stickerInfoNewEngine4 != stickerInfoNewEngine3 && singleImageData != null) {
            singleImageData.setStickerInfoNewEngine(this.LLILZIL.getStickerInfoNewEngine());
        }
    }

    @Override // X.C0FVY
    public StickerModel f4(StickerModel stickerModel) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        return c0ft7.f3(stickerModel, EnumC356070Dxd.COMMIT);
    }

    @Override // X.C0FVY
    public TextStickerModel ll(TextStickerModel textStickerModel) {
        X1();
        return (TextStickerModel) f4(textStickerModel);
    }

    @Override // X.C0FVY
    public TextStickerModel zD1(TextStickerData textStickerData) {
        X1();
        al();
        return ll(C0F7U.LJ(textStickerData, null, 3));
    }

    @Override // X.C0FVY
    public void lm(int i, List<? extends Function1<? super StickerModel, Unit>> list) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LJIIJJI(i);
    }

    @Override // X.C0FVY
    public void Dr(EnumC1466150oFx enumC1466150oFx, StickerModel stickerModel, String str, Function1<? super StickerModel, Unit> function1) {
        int id;
        if (this.LLJJIJIL == null) {
            return;
        }
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        if (stickerModel != null) {
            id = stickerModel.getId();
        } else {
            id = -1;
        }
        c0ft7.LIZIZ(enumC1466150oFx, c0ft7.tq(id), null, str, function1);
    }

    @Override // X.C0FVY
    public void Va1(EnumC1466150oFx enumC1466150oFx, C0FTJ<? extends StickerModel> c0ftj, C388340FKm c388340FKm, String str, Function1<? super StickerModel, Unit> function1) {
        if (this.LLJJIJIL == null) {
            return;
        }
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 == null) {
            c0ft7 = null;
        }
        c0ft7.LIZIZ(enumC1466150oFx, c0ftj, c388340FKm, str, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19626011qU(C1DRG c1drg, ViewStub viewStub, FrameLayout frameLayout, CreativeInfo creativeInfo, SingleImageData singleImageData, Function0<? extends C1462070o9N> function0) {
        this.LL = c1drg;
        this.LLILLJJLI = viewStub;
        this.LLILLL = frameLayout;
        this.LLILZ = creativeInfo;
        this.LLILZIL = singleImageData;
        this.LLILZLL = function0;
    }

    @Override // X.C0FVY
    public void LLILII(boolean z, String str, int i, C0FSX c0fsx, Integer num, Integer num2, Integer num3, Integer num4, C0FSZ c0fsz) {
        C0FT7 c0ft7 = this.LLJJJIL;
        if (c0ft7 != null) {
            c0ft7.Ja().LLILII(z, str, i, c0fsx, num, num2, num3, num4, c0fsz);
        }
    }
}
