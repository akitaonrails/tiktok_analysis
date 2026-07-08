package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.PairIntInt;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.info.InfoStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FE8, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FE8 extends AbstractC381020Ewm<C0EOK> implements C0EOK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIL;
    public static final int LLJJJ;
    public final C1DRG LLILLL;
    public boolean LLILZ;
    public MutableLiveData<Boolean> LLILZIL;
    public MutableLiveData<Boolean> LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final InterfaceC1731706qJ LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final InterfaceC1731706qJ LLJIJIL;
    public final C0FEI LLJILJIL;
    public final C1466170oFz LLJILJILJ;
    public final C01GW LLJILLL;
    public C0FT7 LLJJ;
    public FrameLayout LLJJI;
    public final C1407160mio LLJJIII;
    public final C01GW LLJJIJI;
    public final List<InterfaceC363790EOb> LLJJIJIIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0FE8.class, "rootEditModel", "getRootEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0FE8.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/text/api/EditorProTextNewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0FE8.class, "infoStickerApi", "getInfoStickerApi()Lcom/ss/android/ugc/gamora/editorpro/capabilities/text/sticker/info/EditorProInfoStickerApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0FE8.class, "lyricStickerApi", "getLyricStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/lyric/LyricStickerEditorProApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C0FE8.class, "editorProStateApi", "getEditorProStateApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProStateApi;", 0);
        c09r3.getClass();
        LLJJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJJJ = 8;
    }

    public C0EOK Z1() {
        return this;
    }

    private final InterfaceC359950E9h G2() {
        return (InterfaceC359950E9h) this.LLJIJIL.getValue(this, LLJJIJIL[4]);
    }

    private final VideoPublishEditModel W2() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJJIJIL[0]);
    }

    private final C0FTB c3() {
        return new C0FTB() { // from class: X.0FET
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
            public final EnumC1466150oFx[] LJJIJIL() {
                return EnumC1466150oFx.values();
            }

            @Override // X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJ(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJIIZILJ(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LIZJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
            }

            @Override // X.C0FTB
            public final void LJJ(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
            }

            @Override // X.C0FTB
            public final void f4(StickerModel stickerModel) {
                this.LL.eb(stickerModel);
            }

            @Override // X.C0FTB
            public final void LIZ(StickerModel stickerModel, boolean z) {
                this.LL.eb(stickerModel);
            }

            @Override // X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                String str2;
                CreativeModel creativeModel;
                StickerNewEngineModel stickerNewEngineModel;
                C1403880mdW c1403880mdW = C1403880mdW.LIZ;
                VideoPublishEditModel videoPublishEditModelLJJJLIIL = this.LL.LJJJLIIL();
                c1403880mdW.getClass();
                C1403880mdW.LJ(videoPublishEditModelLJJJLIIL, null, stickerModel, null);
                if (Intrinsics.LJFF(str, "SLIDE_UP")) {
                    str2 = "drag";
                } else {
                    str2 = "other";
                }
                this.LL.LLJILJILJ.LIZJ(stickerModel, str2, 1);
                VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = this.LL.LJJJLIIL();
                if (videoPublishEditModelLJJJLIIL2 != null && (creativeModel = videoPublishEditModelLJJJLIIL2.creativeModel) != null && (stickerNewEngineModel = creativeModel.stickerModel) != null) {
                    C1466090oFr.LIZJ(stickerNewEngineModel, stickerModel);
                }
            }
        };
    }

    private final Drawable o2() {
        return (Drawable) this.LLJJIJI.getValue();
    }

    private final InterfaceC388760FMc w2() {
        return (InterfaceC388760FMc) this.LLJILLL.getValue();
    }

    public final InterfaceC363820EOe H2() {
        return (InterfaceC363820EOe) this.LLJ.getValue(this, LLJJIJIL[2]);
    }

    @Override // X.C0EOK
    public C0EOH Ja() {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            return c0ft7.Ja();
        }
        return null;
    }

    @Override // X.C0EOK
    public List<C0FEO> Kd2() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 == null || (listLLLLLZ = c0ft7.LLLLLZ(EnumC1466150oFx.INFO)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : listLLLLLZ) {
            if (c0ftj instanceof C0FEO) {
                arrayList.add(c0ftj);
            }
        }
        return arrayList;
    }

    public final VideoPublishEditModel LJJJLIIL() {
        if (!C364210EPr.LIZIZ) {
            return null;
        }
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    @Override // X.C0EOK
    public int[] LLJLLIL() {
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout == null) {
            return new int[]{0, 0, 0, 0};
        }
        PointF pointF = new PointF(frameLayout.getWidth() / 2.0f, frameLayout.getHeight() / 2.0f);
        float width = frameLayout.getWidth() * frameLayout.getScaleX();
        float height = frameLayout.getHeight() * frameLayout.getScaleY();
        float f = -frameLayout.getTranslationX();
        float f2 = -frameLayout.getTranslationY();
        if (((int) frameLayout.getPivotY()) == 0) {
            return new int[]{(int) frameLayout.getX(), (int) f2, (int) width, (int) height};
        }
        float f3 = 2;
        return new int[]{(int) ((pointF.x - (width / f3)) + f), (int) ((pointF.y - (height / f3)) - f2), (int) width, (int) height};
    }

    @Override // X.C0EOK
    public List<StickerModel> Lm() {
        List<StickerModel> listLIZLLL;
        C0FT7 c0ft7 = this.LLJJ;
        return (c0ft7 == null || (listLIZLLL = c0ft7.LIZLLL()) == null) ? C13BV.INSTANCE : listLIZLLL;
    }

    public final C0EHC T2() {
        return (C0EHC) this.LLJI.getValue(this, LLJJIJIL[3]);
    }

    @Override // X.C0EOK
    public GestureLayout$OnGestureListener ac() {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            return c0ft7.ac();
        }
        return null;
    }

    @Override // X.C0EOK
    public List<C0FFC> c1() {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 == null || (listLLLLLZ = c0ft7.LLLLLZ(EnumC1466150oFx.TEXT)) == null) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (C0FTJ<StickerModel> c0ftj : listLLLLLZ) {
            if (c0ftj instanceof C0FFC) {
                arrayList.add(c0ftj);
            }
        }
        return arrayList;
    }

    public final C0EJ3 i3() {
        return (C0EJ3) this.LLIZLLLIL.getValue(this, LLJJIJIL[1]);
    }

    public final InterfaceC388760FMc m3() {
        return new InterfaceC388760FMc() { // from class: X.0FEB
            public final C01GW LIZ;

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19628411qs LIZJ() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19639511sf LIZLLL() {
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
            public final InterfaceC390170FRn LJIILIIL() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
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
                return true;
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
            public final void LJJIIJ(int i) {
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJZLJL() {
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC19614111oZ getHashTagService() {
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final C0FF8 LIZ() {
                C0EJ3 c0ej3I3 = this.LIZIZ.i3();
                if (c0ej3I3 != null) {
                    return c0ej3I3.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                return new C386370FCx(this.LIZIZ);
            }

            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                return new C386370FCx(this.LIZIZ).LLL();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FEQ LJFF() {
                InterfaceC363820EOe interfaceC363820EOeH2 = this.LIZIZ.H2();
                if (interfaceC363820EOeH2 != null) {
                    return interfaceC363820EOeH2.LJIIJ();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                return new C386370FCx(this.LIZIZ).getDuration();
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return (C19647711tz) this.LIZ.getValue();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJIIIZ(this.LIZIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                return new ArrayList();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FUI w() {
                C0EHC c0ehcT2 = this.LIZIZ.T2();
                if (c0ehcT2 != null) {
                    return c0ehcT2.w();
                }
                return null;
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return C13BV.INSTANCE;
            }

            {
                this.LIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this.LIZIZ, 677));
            }
        };
    }

    @Override // X.C0EOK
    public boolean onBackPressed() {
        List<C0FEF> listLJ;
        Object objValueOf;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 == null || (listLJ = c0ft7.LJ()) == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
        Iterator<C0FEF> it2 = listLJ.iterator();
        while (true) {
            objValueOf = null;
            if (!it2.hasNext()) {
                break;
            }
            C0FEF next = it2.next();
            if (next != null) {
                objValueOf = Boolean.valueOf(next.onBackPressed());
            }
            arrayList.add(objValueOf);
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (Intrinsics.LJFF(next2, Boolean.TRUE)) {
                objValueOf = next2;
                break;
            }
        }
        Boolean bool = (Boolean) objValueOf;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final C19647711tz q3() {
        String strLIZJ;
        if (!((Boolean) C273530Ann.LIZ.getValue()).booleanValue()) {
            return new C19647711tz(null, null, 0.0f, null, 1023);
        }
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

    @Override // X.C0EOK
    public void qt1() {
        List<StickerModel> listLIZLLL;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 == null || (listLIZLLL = c0ft7.LIZLLL()) == null) {
            return;
        }
        Iterator<StickerModel> it2 = listLIZLLL.iterator();
        while (it2.hasNext()) {
            eb(it2.next());
        }
    }

    public final void B3() {
        C0E48 c0e48W1 = W1();
        if (c0e48W1 != null) {
            NLEModel nLEModelLJI = C350870DpF.LJI(c0e48W1);
            NLEModel nLEModelDynamicCast = NLEModel.dynamicCast(C365950EWj.LIZ() ? nLEModelLJI.getStage() : nLEModelLJI.deepClone());
            if (nLEModelDynamicCast == null) {
                return;
            }
            C1524705y1.LIZ(new AwS406S0200000_5(this, nLEModelDynamicCast, 61));
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onPause() {
        C0E48 c0e48W1;
        super.onPause();
        C0FG9.LIZ.getClass();
        if (!C0FG9.LIZ() || (c0e48W1 = W1()) == null) {
            return;
        }
        c0e48W1.Ej(this.LLJJIII);
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        C0E48 c0e48W1;
        super.onResume();
        C0FG9.LIZ.getClass();
        if (!C0FG9.LIZ() || (c0e48W1 = W1()) == null) {
            return;
        }
        c0e48W1.fj(this.LLJJIII);
    }

    @Override // X.C0EOK
    public MutableLiveData<Boolean> Ea1() {
        return this.LLILZLL;
    }

    @Override // X.C0EOK
    public C0EOM Y00() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.C0EOK
    public MutableLiveData<Boolean> m81() {
        return this.LLILZIL;
    }

    @Override // X.C0EOK
    public View wh() {
        return this.LLJJI;
    }

    private final StickerModel X1(StickerModel stickerModel) {
        Iterator<InterfaceC363790EOb> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            stickerModel = it2.next().LIZ(stickerModel);
        }
        return stickerModel;
    }

    @Override // X.C0EOK
    public void AL0(MutableLiveData<Boolean> mutableLiveData) {
        this.LLILZLL = mutableLiveData;
    }

    @Override // X.C0EOK
    public void IB0(MutableLiveData<Boolean> mutableLiveData) {
        this.LLILZIL = mutableLiveData;
    }

    @Override // X.C0EOK
    public void Jp(C0FUD c0fud) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.Jp(c0fud);
        }
    }

    @Override // X.C0EOK
    public void LJJZZI(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.LJJZZI(c0ftb);
        }
    }

    @Override // X.C0EOK
    public void LJLLLL(C0FTB c0ftb) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.LJLLLL(c0ftb);
        }
    }

    @Override // X.C0EOK
    public StickerModel LLJJIJI(int i) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            return c0ft7.LLJJIJI(i);
        }
        return null;
    }

    @Override // X.C0EOK
    public List<StickerModel> LLLILZLLLI(EnumC1466150oFx enumC1466150oFx) {
        List<StickerModel> listLJIIIZ;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 == null || (listLJIIIZ = c0ft7.LJIIIZ(enumC1466150oFx)) == null) {
            return C13BV.INSTANCE;
        }
        return listLJIIIZ;
    }

    @Override // X.C0EOK
    public void O2(boolean z) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout != null) {
            frameLayout.setClipChildren(z);
        }
        FrameLayout frameLayout2 = this.LLJJI;
        ViewParent parent = null;
        if (frameLayout2 != null) {
            parent = frameLayout2.getParent();
        }
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            viewGroup.setClipChildren(z);
            ViewParent parent2 = viewGroup.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                viewGroup2.setClipChildren(z);
            }
        }
    }

    @Override // X.C0EOK
    public void PF0(boolean z) {
        Drawable drawableO2;
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout != null) {
            if (z) {
                drawableO2 = o2();
            } else {
                drawableO2 = null;
            }
            frameLayout.setBackground(drawableO2);
        }
    }

    @Override // X.C0EOK
    public void Y62(InterfaceC363790EOb interfaceC363790EOb) {
        this.LLJJIJIIJIL.remove(interfaceC363790EOb);
    }

    @Override // X.C0EOK
    public void dp1(InterfaceC363790EOb interfaceC363790EOb) {
        this.LLJJIJIIJIL.add(interfaceC363790EOb);
    }

    @Override // X.C0EOK
    public void eb(StickerModel stickerModel) {
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        CreativeModel creativeModel2;
        StickerNewEngineModel stickerNewEngineModel2;
        if (this.LLJJ == null) {
            return;
        }
        if (stickerModel.isNotEmptyModel()) {
            VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
            if (videoPublishEditModelLJJJLIIL != null && (creativeModel2 = videoPublishEditModelLJJJLIIL.creativeModel) != null && (stickerNewEngineModel2 = creativeModel2.stickerModel) != null) {
                C1466090oFr.LIZIZ(stickerNewEngineModel2, stickerModel);
                return;
            }
            return;
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL2 = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL2 == null || (creativeModel = videoPublishEditModelLJJJLIIL2.creativeModel) == null || (stickerNewEngineModel = creativeModel.stickerModel) == null) {
            return;
        }
        C1466090oFr.LIZJ(stickerNewEngineModel, stickerModel);
    }

    @Override // X.C0EOK
    public void fm(C0FUG c0fug) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.fm(c0fug);
        }
    }

    @Override // X.C0EOK
    public void oW1(EnumC1466150oFx enumC1466150oFx) {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null && (listLLLLLZ = c0ft7.LLLLLZ(EnumC1466150oFx.TEXT)) != null) {
            Iterator<C0FTJ<StickerModel>> it2 = listLLLLLZ.iterator();
            while (it2.hasNext()) {
                it2.next().LIZIZ().LIZIZ();
            }
        }
    }

    @Override // X.C0EOK
    public void setVisibility(int i) {
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout != null) {
            C786410Ut5.LJZ(i, frameLayout);
        }
    }

    @Override // X.C0EOK
    public StickerModel tP0(String str) {
        List<StickerModel> listLIZLLL;
        C0FT7 c0ft7 = this.LLJJ;
        StickerModel stickerModel = null;
        if (c0ft7 == null || (listLIZLLL = c0ft7.LIZLLL()) == null) {
            return null;
        }
        for (StickerModel stickerModel2 : listLIZLLL) {
            StickerModel stickerModel3 = stickerModel2;
            if (((stickerModel3 instanceof TextStickerModel) && Intrinsics.LJFF(((TextStickerModel) stickerModel3).getUuid(), str)) || (((stickerModel3 instanceof InfoStickerModel) && Intrinsics.LJFF(((InfoStickerModel) stickerModel3).getUuid(), str)) || ((stickerModel3 instanceof LyricStickerModel) && Intrinsics.LJFF(((LyricStickerModel) stickerModel3).getUuid(), str)))) {
                stickerModel = stickerModel2;
                break;
            }
        }
        return stickerModel;
    }

    public C0FE8(C19A3 c19a3, C1DRG c1drg) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZIL = new MutableLiveData<>();
        this.LLILZLL = new MutableLiveData<>();
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(getDiContainer(), C0EJ3.class, null);
        this.LLJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC363820EOe.class, null);
        this.LLJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EHC.class, null);
        this.LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC359950E9h.class, null);
        this.LLJILJIL = new C0FEI(c19a3.requireActivity());
        this.LLJILJILJ = new C1466170oFz(LJJJLIIL());
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 676));
        this.LLJJIII = new C1407160mio(new AwS549S0100000_5(this, 678));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 675));
        this.LLJJIJIIJIL = new ArrayList();
    }

    @Override // X.C0EOK
    public void Ca(int i, Function1<? super StickerModel, Unit> function1) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            Collections.singletonList(function1);
            c0ft7.LJIIJJI(i);
        }
    }

    @Override // X.C0EOK
    public void He(int i, C0FUG c0fug) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.He(i, c0fug);
        }
    }

    @Override // X.C0EOK
    public void T(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.T(list, enumC356070Dxd);
        }
        qt1();
    }

    @Override // X.C0EOK
    public void d71(EnumC1466150oFx enumC1466150oFx, boolean z) {
        List<C0FTJ<StickerModel>> listLLLLLZ;
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null && (listLLLLLZ = c0ft7.LLLLLZ(enumC1466150oFx)) != null) {
            for (C0FTJ<StickerModel> c0ftj : listLLLLLZ) {
                c0ftj.LJIJ(c0ftj.LJJIIJZLJL(), z);
            }
        }
    }

    @Override // X.C0EOK
    public StickerModel f3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            return c0ft7.f3(X1(stickerModel), enumC356070Dxd);
        }
        return null;
    }

    @Override // X.C0EOK
    public void k2(EnumC1466150oFx enumC1466150oFx, C0FUG c0fug) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.k2(enumC1466150oFx, c0fug);
        }
    }

    @Override // X.C0EOK
    public void k3(StickerModel stickerModel, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.k3(stickerModel, enumC356070Dxd);
        }
    }

    @Override // X.C0EOK
    public void w3(List<? extends StickerModel> list, EnumC356070Dxd enumC356070Dxd) {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<? extends StickerModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(X1(it2.next()));
        }
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.w3(arrayList, enumC356070Dxd);
        }
    }

    @Override // X.C0EOK
    public void M3(List<Integer> list, String str, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.M3(list, str, enumC356070Dxd);
        }
    }

    @Override // X.C0EOK
    public void fO2(EnumC1466150oFx enumC1466150oFx, String str, Function1<? super StickerModel, Unit> function1) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.LIZIZ(enumC1466150oFx, null, null, str, function1);
        }
    }

    @Override // X.C0EOK
    public void gN1(int i, boolean z, EnumC356070Dxd enumC356070Dxd) {
        C0FT7 c0ft7 = this.LLJJ;
        if (c0ft7 != null) {
            c0ft7.LJIIJ(i, null, z, enumC356070Dxd);
        }
    }

    @Override // X.C0EOK
    public void sq(Integer num, Float f, Float f2) {
        PairIntInt pairIntInt;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        C0E48 c0e48W1 = W1();
        if (c0e48W1 == null || (iNLEMediaSessionF1 = c0e48W1.f1()) == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (pairIntInt = mediaRuntimeApi.getInitSize()) == null) {
            pairIntInt = new PairIntInt(0, 0);
        }
        if (pairIntInt.getFirst() != 0 && pairIntInt.getSecond() != 0) {
            FrameLayout frameLayout = this.LLJJI;
            if (frameLayout != null && (layoutParams2 = frameLayout.getLayoutParams()) != null) {
                layoutParams2.width = pairIntInt.getFirst();
            }
            FrameLayout frameLayout2 = this.LLJJI;
            if (frameLayout2 != null && (layoutParams = frameLayout2.getLayoutParams()) != null) {
                layoutParams.height = pairIntInt.getSecond();
            }
            if (num != null) {
                num.intValue();
                float fIntValue = num.intValue() / pairIntInt.getSecond();
                FrameLayout frameLayout3 = this.LLJJI;
                if (frameLayout3 != null) {
                    C786410Ut5.Pb(frameLayout3, fIntValue);
                    C786410Ut5.qc(frameLayout3, fIntValue);
                }
                C0FEI c0fei = this.LLJILJIL;
                pairIntInt.getFirst();
                c0fei.getClass();
            }
            if (f != null) {
                float fFloatValue = f.floatValue();
                FrameLayout frameLayout4 = this.LLJJI;
                if (frameLayout4 != null) {
                    C786410Ut5.fd(frameLayout4, fFloatValue);
                    C786410Ut5.Kc(frameLayout4, 0.0f);
                }
            }
            if (f2 != null) {
                float fFloatValue2 = f2.floatValue();
                FrameLayout frameLayout5 = this.LLJJI;
                if (frameLayout5 != null) {
                    frameLayout5.setPivotY(fFloatValue2);
                    frameLayout5.setPivotX(frameLayout5.getWidth() / 2);
                }
            }
        }
    }

    private final C0FT7 v3(FrameLayout frameLayout, FrameLayout frameLayout2, CreativeInfo creativeInfo, int i) {
        boolean z;
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.TEXT;
        C01GW c01gw = C273530Ann.LIZ;
        boolean zBooleanValue = ((Boolean) c01gw.getValue()).booleanValue();
        ArrayList arrayList = new ArrayList();
        Float fValueOf = Float.valueOf(0.2f);
        Float fValueOf2 = Float.valueOf(10.0f);
        Pair pair = new Pair(fValueOf, fValueOf2);
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && C1416310mxZ.LJIJ(videoPublishEditModelLJJJLIIL)) {
            z = true;
        } else {
            z = false;
        }
        C390390FSj c390390FSj = new C390390FSj(C1664590tQ1.LJII(this), frameLayout, frameLayout2, new C0FUH(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, EnumC20228214Cy.IMAGE_STICKER, null, false, 12), null, 0, null, null, false, false, false, false, C1697810uHb.LJ(new C0FFO(enumC1466150oFx, 0, false, false, false, zBooleanValue, true, arrayList, pair, false, z, true, false, false, false, new C0FXE(14), 1771138), new C0FFO(EnumC1466150oFx.INFO, 0, false, false, false, ((Boolean) c01gw.getValue()).booleanValue(), false, new ArrayList(), new Pair(fValueOf, fValueOf2), false, true, true, false, false, false, new C0FXE(12), 1771138), new C0FFO(EnumC1466150oFx.LYRIC_STICKER, 0, false, false, false, true, true, new ArrayList(), new Pair(fValueOf, fValueOf2), false, true, true, false, false, false, new C0FXE(13), 1771138)), EnumC391400FWg.EDITOR_PRO, true, false, false, 0, false, 509946), w2(), this);
        c390390FSj.LJJZZI(c3());
        this.LLJILJIL.LIZ = c390390FSj.LJIIIIZZ;
        c390390FSj.initService();
        return c390390FSj;
    }

    @Override // X.C0EOK
    public void setDisplayPos(int i, int i2, int i3, int i4) {
        FrameLayout frameLayout = this.LLJJI;
        if (frameLayout == null) {
            return;
        }
        PointF pointF = new PointF(frameLayout.getWidth() / 2.0f, frameLayout.getHeight() / 2.0f);
        float f = pointF.x;
        float f2 = -((f - (i3 / 2)) - i);
        float f3 = (pointF.y - (i4 / 2)) - i2;
        frameLayout.setPivotX(f);
        frameLayout.setPivotY(pointF.y);
        C786410Ut5.Pb(frameLayout, i3 / frameLayout.getWidth());
        C786410Ut5.qc(frameLayout, i4 / frameLayout.getHeight());
        C786410Ut5.fd(frameLayout, -f3);
        if (((Boolean) C0A60.LIZ.getValue()).booleanValue()) {
            f2 = 0.0f;
        }
        C786410Ut5.Kc(frameLayout, f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, com.bytedance.ies.nle.editor_jni.PairIntInt] */
    /* JADX WARN: Type inference failed for: r0v67 */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, com.bytedance.ies.nle.editor_jni.PairIntInt] */
    @Override // X.C0EOK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ch1(final android.widget.FrameLayout r22, android.widget.FrameLayout r23, com.ss.android.ugc.aweme.creative.model.CreativeInfo r24, final X.C358780E4u r25, final boolean r26) {
        /*
            Method dump skipped, instruction units count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0FE8.ch1(android.widget.FrameLayout, android.widget.FrameLayout, com.ss.android.ugc.aweme.creative.model.CreativeInfo, X.0E4u, boolean):void");
    }
}
