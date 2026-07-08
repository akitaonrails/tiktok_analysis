package X;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.editorpro.EPAnchorData;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.sticker.AddYoursStickerTopicRepo;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.addyours.AddYoursStickerTopicRepoApi;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0FX1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public class C0FX1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(C0FX1 c0fx1) {
        if (((View) c0fx1.l0).getWidth() != 0) {
            C786410Ut5.C3(((View) c0fx1.l0).getViewTreeObserver(), c0fx1);
            ((C0FJ1) c0fx1.l1).smoothScrollTo(((((View) c0fx1.l0).getLeft() + ((View) c0fx1.l0).getRight()) / 2) - (((C0FJ1) c0fx1.l1).getWidth() / 2), 0);
        }
    }

    public static final void onGlobalLayout$1(C0FX1 c0fx1) {
        C0FSN c0fsn;
        StickerModel stickerModelF3;
        C0FSN c0fsn2 = ((C0FSK) c0fx1.l0).LJI;
        if (c0fsn2 == null) {
            c0fsn2 = null;
        }
        FrameLayout frameLayout = c0fsn2.LLJIJIL;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (frameLayout.getRight() > 0) {
            final C0FSK c0fsk = (C0FSK) c0fx1.l0;
            Function1 function1 = (Function1) c0fx1.l1;
            Context sceneContext = c0fsk.LIZIZ.getSceneContext();
            if (sceneContext != null) {
                C0FSN c0fsn3 = c0fsk.LJI;
                if (c0fsn3 == null) {
                    c0fsn = null;
                } else {
                    c0fsn = c0fsn3;
                }
                FrameLayout frameLayout2 = c0fsn.LLJIJIL;
                if (frameLayout2 == null) {
                    frameLayout2 = null;
                }
                if (c0fsn3 == null) {
                    c0fsn3 = null;
                }
                FrameLayout frameLayout3 = c0fsn3.LLJILJIL;
                if (frameLayout3 == null) {
                    frameLayout3 = null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new C0FFO(EnumC1466150oFx.ADD_YOURS, 0, true, false, false, true, false, null, new Pair(Float.valueOf(0.8f), Float.valueOf(1.2f)), false, false, false, false, false, false, new C0FXE(4), 1828738));
                C390390FSj c390390FSj = new C390390FSj(sceneContext, frameLayout2, frameLayout3, new C0FUH(null, null, 0, null, null, false, false, false, false, arrayList, EnumC391400FWg.VIDEO_PUBLISH_PREVIEW, false, false, false, 0, false, 518143), new InterfaceC388760FMc() { // from class: X.0FSJ
                    @Override // X.InterfaceC388760FMc
                    public final C0FF8 LIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final InterfaceC386690FEd LIZIZ() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final InterfaceC19628411qs LIZJ() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final InterfaceC19639511sf LIZLLL() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C0FEQ LJFF() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C0FUB LJII() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final InterfaceC19627911qn LJIIIIZZ() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C0FKH LJIIJ() {
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
                    public final C0FLH LJIILLIIL() {
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
                    public final boolean LJIJJLI() {
                        return true;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C0FL9 LJIL() {
                        return null;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final void LJJI() {
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
                    public final void LJJIIJZLJL() {
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
                    public final float LJ() {
                        return c0fsk.LIZLLL.LLL();
                    }

                    @Override // X.InterfaceC388760FMc
                    public final float LJI() {
                        return c0fsk.LIZLLL.getDuration();
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C19647711tz LJIIIZ() {
                        return (C19647711tz) c0fsk.LJII.getValue();
                    }

                    /* JADX WARN: Type inference failed for: r0v1, types: [X.0FRn, X.0FSL] */
                    @Override // X.InterfaceC388760FMc
                    public final InterfaceC390170FRn LJIILIIL() {
                        final C0FSK c0fsk2 = c0fsk;
                        C0FSL c0fsl = c0fsk2.LJIIIZ;
                        if (c0fsl != null) {
                            return c0fsl;
                        }
                        ?? r0 = new InterfaceC390170FRn() { // from class: X.0FSL
                            @Override // X.InterfaceC390170FRn
                            public final InterfaceC390200FRq LIZ() {
                                return null;
                            }

                            @Override // X.InterfaceC390170FRn
                            public final LiveData<List<AddYoursStickerTopicRepoApi.AddYoursTopicRecommendInfo>> LIZIZ() {
                                return null;
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LIZJ(String str, String str2, boolean z) {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final boolean LIZLLL() {
                                return false;
                            }

                            @Override // X.InterfaceC390170FRn
                            public final boolean LJ() {
                                return false;
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LJFF() {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LJIIJ(String str, String str2, boolean z, String str3, int i, AddYoursStickerModel addYoursStickerModel) {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LJIIJJI(int i, String str) {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LJIIL() {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final void LJIILIIL(int i, String str, String str2, String str3, String str4, boolean z) {
                            }

                            @Override // X.InterfaceC390170FRn
                            public final boolean LJI() {
                                return u4.LJJIJIIJIL(c0fsk2.LIZ);
                            }

                            @Override // X.InterfaceC390170FRn
                            public final AddYoursStickerTopicRepo LJII() {
                                return (AddYoursStickerTopicRepo) c0fsk2.LJIIIIZZ.getValue();
                            }

                            @Override // X.InterfaceC390170FRn
                            public final int LJIIIIZZ() {
                                return u4.LJJIJIIJIL(c0fsk2.LIZ) ? 2131836221 : 2131825072;
                            }

                            @Override // X.InterfaceC390170FRn
                            public final boolean LJIIIZ() {
                                return ((Number) C0B9Q.LIZ.getValue()).intValue() == 1 && u4.LJIJI(c0fsk2.LIZ) && C0CHQ.LIZ().getAccountService().isLogin() && !C568750MSj.LIZIZ(c0fsk2.LIZ);
                            }
                        };
                        c0fsk2.LJIIIZ = r0;
                        return r0;
                    }

                    @Override // X.InterfaceC388760FMc
                    public final C0FKI LJJ() {
                        return new C0FKI() { // from class: X.0FSI
                            @Override // X.C0FKI
                            public final void LIZIZ(boolean z) {
                            }

                            @Override // X.C0FKI
                            public final C388270FKf LIZJ(ViewGroup viewGroup, C388200FJy c388200FJy, C0FK0 c0fk0) {
                                return null;
                            }

                            @Override // X.C0FKI
                            public final void LJ() {
                            }

                            @Override // X.C0FKI
                            public final void refresh() {
                            }

                            @Override // X.C0FKI
                            public final Typeface LIZ(String str) {
                                return Typeface.DEFAULT;
                            }

                            @Override // X.C0FKI
                            public final Typeface LIZLLL(TextFontModel textFontModel) {
                                return Typeface.DEFAULT;
                            }

                            @Override // X.C0FKI
                            public final Typeface getTypefaceByFontName(String str) {
                                return Typeface.DEFAULT;
                            }
                        };
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
                        c0fsk.LIZ();
                        c0fsk.LJ.invoke(Boolean.FALSE);
                    }

                    @Override // X.InterfaceC388760FMc
                    public final void LJJIIJ(int i) {
                        c0fsk.LJ.invoke(Boolean.TRUE);
                    }
                }, c0fsk.LIZIZ);
                c0fsk.LJFF = c390390FSj;
                c390390FSj.LJJZZI(new C0FTB() { // from class: X.0FSO
                    @Override // X.C0FTB
                    public final void LIZ(StickerModel stickerModel, boolean z) {
                    }

                    @Override // X.C0FTB
                    public final void LIZIZ(StickerModel stickerModel) {
                    }

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
                    public final void LJIJI(StickerModel stickerModel) {
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
                    public final void LJJIII(StickerModel stickerModel) {
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
                    public final void f4(StickerModel stickerModel) {
                    }

                    @Override // X.C0FTB
                    public final EnumC1466150oFx[] LJJIJIL() {
                        return EnumC1466150oFx.values();
                    }

                    @Override // X.C0FTB
                    public final void LIZLLL(StickerModel stickerModel) {
                        C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0fsk.LIZ;
                        c1403880mdW.getClass();
                        C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, "video_post_page_preview_page");
                    }

                    @Override // X.C0FTB
                    public final void LJ(StickerModel stickerModel) {
                        C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0fsk.LIZ;
                        c1403880mdW.getClass();
                        C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, "video_post_page_preview_page");
                    }

                    @Override // X.C0FTB
                    public final void LJIIZILJ(StickerModel stickerModel) {
                        C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0fsk.LIZ;
                        c1403880mdW.getClass();
                        C1403880mdW.LIZJ(videoPublishEditModel, null, stickerModel, "video_post_page_preview_page");
                    }

                    @Override // X.C0FTB
                    public final void LJIIJ(StickerModel stickerModel, String str) {
                        C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                        VideoPublishEditModel videoPublishEditModel = c0fsk.LIZ;
                        c1403880mdW.getClass();
                        C1403880mdW.LJ(videoPublishEditModel, null, stickerModel, "video_post_page_preview_page");
                    }
                });
                C390390FSj c390390FSj2 = c0fsk.LJFF;
                if (c390390FSj2 != null) {
                    c390390FSj2.initService();
                }
                if (function1 != null) {
                    C0FSN c0fsn4 = c0fsk.LJI;
                    if (c0fsn4 == null) {
                        c0fsn4 = null;
                    }
                    function1.invoke(c0fsn4.mView);
                }
                for (AddYoursStickerModel addYoursStickerModel : c0fsk.LIZ.creativeModel.stickerModel.addYoursStickerModels) {
                    C390390FSj c390390FSj3 = c0fsk.LJFF;
                    if (c390390FSj3 != null && (stickerModelF3 = c390390FSj3.f3(addYoursStickerModel, EnumC356070Dxd.COMMIT)) != null) {
                        C01GW c01gw = C0FSP.LIZ;
                        if (((Keva) c01gw.getValue()).getInt("add_yours_guide_show_count", 0) < 3) {
                            C390390FSj c390390FSj4 = c0fsk.LJFF;
                            if (c390390FSj4 != null) {
                                new C390340FSe(c390390FSj4).LLILII(true, c0fsk.LIZIZ.getString(2131825085), stickerModelF3.getId(), C0FSX.BOTTOM, null, null, null, null, null);
                            }
                            ((Keva) c01gw.getValue()).storeInt("add_yours_guide_show_count", ((Keva) c01gw.getValue()).getInt("add_yours_guide_show_count", 0) + 1);
                        }
                    }
                }
                C0FSN c0fsn5 = ((C0FSK) c0fx1.l0).LJI;
                if (c0fsn5 == null) {
                    c0fsn5 = null;
                }
                C786410Ut5.C3(c0fsn5.mView.getViewTreeObserver(), c0fx1);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public static final void onGlobalLayout$2(C0FX1 c0fx1) {
        ViewTreeObserver viewTreeObserver;
        NLETrackSlot nLETrackSlotLLLLLLIL;
        String str;
        RecyclerView.LayoutManager layoutManager;
        LinearLayoutManager linearLayoutManager;
        EPAnchorData ePAnchorData;
        RecyclerView recyclerView = ((C0EDF) c0fx1.l0).getRecyclerView();
        if (recyclerView != null) {
            viewTreeObserver = recyclerView.getViewTreeObserver();
        } else {
            viewTreeObserver = null;
        }
        C360890ECx c360890ECx = (C360890ECx) c0fx1.l1;
        if (c360890ECx.mView != null && !c360890ECx.mViewDestroyed && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            C0E48 c0e48LIZIZ = ((C360890ECx) c0fx1.l1).LIZIZ();
            if (c0e48LIZIZ != null) {
                nLETrackSlotLLLLLLIL = c0e48LIZIZ.LLLLLLIL();
            } else {
                nLETrackSlotLLLLLLIL = null;
            }
            String str2 = "video";
            if (nLETrackSlotLLLLLLIL != null) {
                ((C360890ECx) c0fx1.l1).LLLLLJLJLL(nLETrackSlotLLLLLLIL);
                C354260Dui.LIZ.getClass();
                if (C354260Dui.LJIIJ(nLETrackSlotLLLLLLIL) == NLEResType.IMAGE) {
                    str2 = "photo";
                }
                ((C360890ECx) c0fx1.l1).LLLLLLZZ(str2);
            } else {
                ((C360890ECx) c0fx1.l1).LLLLLLZZ("video");
            }
            C360890ECx c360890ECx2 = (C360890ECx) c0fx1.l1;
            c360890ECx2.LLLIILIL = true;
            InterfaceC360910ECz interfaceC360910ECzLLLLIL = c360890ECx2.LLLLIL();
            C360030E9p c360030E9p = (C360030E9p) ((C360890ECx) c0fx1.l1).LLLILZJ.getValue();
            if (c360030E9p != null && (ePAnchorData = c360030E9p.LLJIJIL) != null) {
                str = ePAnchorData.effectId;
            } else {
                str = null;
            }
            interfaceC360910ECzLLLLIL.LJ(str, false);
            if (recyclerView != null) {
                layoutManager = recyclerView.getLayoutManager();
            } else {
                layoutManager = null;
            }
            if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                C0EDF c0edf = (C0EDF) c0fx1.l0;
                C360890ECx c360890ECx3 = (C360890ECx) c0fx1.l1;
                IntRange intRange = new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition());
                C361100EDs resourceListAdapter = c0edf.getResourceListAdapter();
                if (resourceListAdapter != null) {
                    int i = 0;
                    for (Object obj : (ArrayList) resourceListAdapter.LLLFZ()) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            ResourceItem resourceItem = (ResourceItem) obj;
                            int i3 = intRange.LL;
                            if (i <= intRange.LLILLJJLI && i3 <= i) {
                                c360890ECx3.LLLLIL().LJII(resourceItem, i);
                            }
                            i = i2;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
            }
            C0FX1 c0fx12 = ((C360890ECx) c0fx1.l1).LLJLL;
            if (c0fx12 != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
                C786410Ut5.C3(viewTreeObserver, c0fx12);
            }
            ((C360890ECx) c0fx1.l1).LLJLL = null;
            return;
        }
        C0FX1 c0fx13 = ((C360890ECx) c0fx1.l1).LLJLL;
        if (c0fx13 != null && viewTreeObserver != null && viewTreeObserver.isAlive()) {
            C786410Ut5.C3(viewTreeObserver, c0fx13);
        }
        ((C360890ECx) c0fx1.l1).LLJLL = null;
    }

    public C0FX1(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l0 = obj2;
    }
}
