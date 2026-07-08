package X;

import Y.AAListenerS142S0300000_29;
import Y.AUListenerS277S0100000_29;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextWatcher;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TTSVoiceModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextFontModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11qV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19626111qV extends AbstractC2255721DQs<InterfaceC1450620nqu> implements InterfaceC1450620nqu, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJI;
    public static final int LLJJIII;
    public final C1DRG LL;
    public final AbstractC214814194y LLILLJJLI;
    public final FrameLayout LLILLL;
    public final FrameLayout LLILZ;
    public GestureInteractItem LLJ;
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451590nsT.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C1450600nqs.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1461390o8H.class, null);
    public final InterfaceC1731706qJ LLJI = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451640nsY.class, null);
    public final InterfaceC1731706qJ LLJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451690nsd.class, null);
    public final InterfaceC1731706qJ LLJILJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC388530FLf.class, null);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 75));
    public final C01GW LLJILLL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 74));
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS573S0100000_29(this, 76));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19626111qV.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/comment/image/preview/CommentImageEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19626111qV.class, "model", "getModel()Lcom/ss/android/ugc/aweme/comment/image/model/ImageEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C19626111qV.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C19626111qV.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C19626111qV.class, "topBarApi", "getTopBarApi()Lcom/ss/android/ugc/aweme/comment/image/topbar/CommentImageEditTopBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C19626111qV.class, "bottomBarApi", "getBottomBarApi()Lcom/ss/android/ugc/aweme/comment/image/bottombar/CommentImageEditBottomBarApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(C19626111qV.class, "textEditPanelApi", "getTextEditPanelApi()Lcom/ss/android/ugc/aweme/sticker/text/editpanel/TextEditPanelApi;", 0);
        c09r3.getClass();
        LLJJI = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7};
        LLJJIII = 8;
    }

    public InterfaceC1450620nqu Z1() {
        return this;
    }

    @Override // X.InterfaceC1450620nqu
    public void hide() {
    }

    private final InterfaceC388760FMc G2() {
        return (InterfaceC388760FMc) this.LLJILLL.getValue();
    }

    private final InterfaceC1461390o8H H2() {
        return (InterfaceC1461390o8H) this.LLIZLLLIL.getValue(this, LLJJI[3]);
    }

    private final C0FTB W2() {
        final Class<TextStickerModel> cls = TextStickerModel.class;
        return new AbstractC19622511pv<TextStickerModel>(cls) { // from class: X.0nsp
            public AnonymousClass0956 LLILLJJLI;
            public final EnumC1466150oFx LLILLL = EnumC1466150oFx.TEXT;

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void LJIIIZ(StickerModel stickerModel) {
            }

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void LJIIL(StickerModel stickerModel, int i) {
            }

            @Override // X.AbstractC19622511pv
            public final EnumC1466150oFx LJJIJLIJ() {
                return this.LLILLL;
            }

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void LIZJ(StickerModel stickerModel) {
                AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LLILLJJLI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LLILZ), null, null, new C1409120mly(this.LLILZ, null), 3);
            }

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void LIZLLL(StickerModel stickerModel) {
                AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                InterfaceC1451690nsd interfaceC1451690nsdO2 = this.LLILZ.o2();
                if (interfaceC1451690nsdO2 != null) {
                    interfaceC1451690nsdO2.show();
                }
            }

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void f4(StickerModel stickerModel) {
                super.f4(stickerModel);
            }

            @Override // X.AbstractC19622511pv
            public final /* bridge */ /* synthetic */ void LJJIZ(StickerModel stickerModel) {
            }

            @Override // X.AbstractC19622511pv
            public final /* bridge */ /* synthetic */ void LJJJJ(StickerModel stickerModel) {
            }

            @Override // X.AbstractC19622511pv, X.C0FTB
            public final void LJIIJ(StickerModel stickerModel, String str) {
                InterfaceC1451690nsd interfaceC1451690nsdO2;
                if (this.LLILZ.c3().LJIIIZ(EnumC1466150oFx.TEXT).size() >= 34 && (interfaceC1451690nsdO2 = this.LLILZ.o2()) != null) {
                    interfaceC1451690nsdO2.Ps2(true);
                }
            }
        };
    }

    private final Activity getActivity() {
        return (Activity) this.LLIZ.getValue(this, LLJJI[2]);
    }

    public final C0FT7 B3() {
        C390390FSj c390390FSj = new C390390FSj(getActivity(), this.LLILLL, this.LLILZ, new C0FUH(C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), LJJJLIIL().getCreativeInfo(), EnumC20228214Cy.TEXT_STICKER, null, false, 12), null, 0, null, null, false, false, false, false, C1697810uHb.LJ(new C0FFO(EnumC1466150oFx.TEXT, 35, true, true, true, false, true, C1697810uHb.LJ(2, 1), new Pair(Float.valueOf(0.5f), Float.valueOf(2.0f)), false, false, false, false, true, true, new C0FXE(0), 1603200)), EnumC391400FWg.IMAGE_GLOBAL_EDIT, false, false, false, C1441980ncy.LIZIZ(LJJJLIIL()) ? C1428150nGf.LIZLLL() : 0, false, 452603), G2(), this.LLILLJJLI);
        c390390FSj.LJJZZI(W2());
        GestureInteractItem gestureInteractItem = new GestureInteractItem(250, c390390FSj.LJIIIIZZ);
        this.LLJ = gestureInteractItem;
        H2().LIZIZ(gestureInteractItem);
        c390390FSj.initService();
        return c390390FSj;
    }

    public final C0FF8 LJIIJ() {
        return new C0FF8() { // from class: X.0FLe
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(32));
            public final C01GW LIZIZ;

            @Override // X.C0FF8
            public final C0FGA Co() {
                return null;
            }

            @Override // X.C0FF8
            public final boolean LIZ(int i, boolean z) {
                return false;
            }

            @Override // X.C0FF8
            public final boolean LIZIZ(int i) {
                return false;
            }

            @Override // X.C0FF8
            public final boolean LIZLLL() {
                return false;
            }

            @Override // X.C0FF8
            public final void LJ(TextStickerModel textStickerModel, AwS549S0100000_5 awS549S0100000_5) {
            }

            @Override // X.C0FF8
            public final void LJFF(TextFontModel textFontModel, int i, int i2) {
            }

            @Override // X.C0FF8
            public final int LJIIIIZZ() {
                return -1;
            }

            @Override // X.C0FF8
            public final TextWatcher LJIIIZ() {
                return null;
            }

            @Override // X.C0FF8
            public final InterfaceC388160FJu LJIIJ() {
                return null;
            }

            @Override // X.C0FF8
            public final int LJIIJJI() {
                return 1;
            }

            @Override // X.C0FF8
            public final void LJIIL() {
            }

            @Override // X.C0FF8
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.C0FF8
            public final int LJIILJJIL(TextStickerModel textStickerModel, String str) {
                return 0;
            }

            @Override // X.C0FF8
            public final TTSVoiceModel LJIILL() {
                return null;
            }

            @Override // X.C0FF8
            public final int LJIIZILJ() {
                return 0;
            }

            @Override // X.C0FF8
            public final boolean LJIJ() {
                return false;
            }

            @Override // X.C0FF8
            public final void LJIJJ(String str) {
            }

            @Override // X.C0FF8
            public final C0FGR LIZJ() {
                return (C0FPR) this.LIZIZ.getValue();
            }

            @Override // X.C0FF8
            public final C0FF7 LJII() {
                return this.LIZJ.i3();
            }

            @Override // X.C0FF8
            public final C0FK0 LJIILLIIL() {
                return (C0FK0) this.LIZ.getValue();
            }

            @Override // X.C0FF8
            public final TextFontModel LJIJI() {
                return C0EPO.LIZ();
            }

            {
                this.LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(this.LIZJ, 51));
            }

            @Override // X.C0FF8
            public final boolean LJI(String str) {
                return EffectPlatform.LJJJJLI(str, false);
            }
        };
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJILJILJ.getValue();
    }

    public final C1450600nqs T2() {
        return (C1450600nqs) this.LLILZLL.getValue(this, LLJJI[1]);
    }

    public final C0FT7 c3() {
        return (C0FT7) this.LLJJ.getValue();
    }

    public final InterfaceC388530FLf i3() {
        return (InterfaceC388530FLf) this.LLJILJIL.getValue(this, LLJJI[6]);
    }

    public final InterfaceC1451640nsY m3() {
        return (InterfaceC1451640nsY) this.LLJI.getValue(this, LLJJI[4]);
    }

    public final InterfaceC1451690nsd o2() {
        return (InterfaceC1451690nsd) this.LLJIJIL.getValue(this, LLJJI[5]);
    }

    public final InterfaceC388760FMc q3() {
        return new InterfaceC388760FMc() { // from class: X.11qc
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
            public final InterfaceC390170FRn LJIILIIL() {
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
            public final C0FF8 LIZ() {
                return this.LIZ.LJIIJ();
            }

            @Override // X.InterfaceC388760FMc
            public final InterfaceC386690FEd LIZIZ() {
                LiveData<InterfaceC1452170ntP> liveDataG;
                InterfaceC1451590nsT interfaceC1451590nsTW2 = this.LIZ.w2();
                return new C386390FCz((interfaceC1451590nsTW2 == null || (liveDataG = interfaceC1451590nsTW2.g()) == null) ? null : liveDataG.getValue());
            }

            @Override // X.InterfaceC388760FMc
            public final C19647711tz LJIIIZ() {
                return this.LIZ.v3();
            }

            @Override // X.InterfaceC388760FMc
            public final boolean LJIJJ() {
                return this.LIZ.LJJJLIIL().isMultiVideoEdit();
            }

            @Override // X.InterfaceC388760FMc
            public final C0FKI LJJ() {
                C1664590tQ1.LJIIIZ(this.LIZ);
                return new C0FIG();
            }

            @Override // X.InterfaceC388760FMc
            public final int LJJIII() {
                return (int) this.LIZ.LJJJLIIL().getMultiEditVideoStartTime();
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> getVideoList() {
                return this.LIZ.LJJJLIIL().getMediaModelList();
            }

            @Override // X.InterfaceC388760FMc
            public final float LJ() {
                return ((AbstractC386380FCy) LIZIZ()).LLL();
            }

            @Override // X.InterfaceC388760FMc
            public final float LJI() {
                return ((AbstractC386380FCy) LIZIZ()).getDuration();
            }

            @Override // X.InterfaceC388760FMc
            public final List<MediaModel> LJIIZILJ() {
                return C13BV.INSTANCE;
            }

            @Override // X.InterfaceC388760FMc
            public final void LJIILJJIL(int i) {
                String aid;
                if (i == 2) {
                    if (this.LIZ.c3().LJIIIZ(EnumC1466150oFx.TEXT).size() >= 34) {
                        InterfaceC1451690nsd interfaceC1451690nsdO2 = this.LIZ.o2();
                        if (interfaceC1451690nsdO2 != null) {
                            interfaceC1451690nsdO2.Ps2(false);
                        }
                    } else {
                        InterfaceC1451690nsd interfaceC1451690nsdO22 = this.LIZ.o2();
                        if (interfaceC1451690nsdO22 != null) {
                            interfaceC1451690nsdO22.Ps2(true);
                        }
                    }
                    this.LIZ.m3().show();
                    C1451970nt5 c1451970nt5 = C1451970nt5.LIZ;
                    Aweme aweme = this.LIZ.T2().aweme;
                    if (aweme == null || (aid = aweme.getAid()) == null) {
                        aid = "";
                    }
                    C1451970nt5.LIZ(c1451970nt5, "text", null, "confirm", aid, false, 18);
                    InterfaceC1451590nsT interfaceC1451590nsTW2 = this.LIZ.w2();
                    if (interfaceC1451590nsTW2 != null) {
                        interfaceC1451590nsTW2.x7(true, false, false, true);
                    }
                }
            }

            @Override // X.InterfaceC388760FMc
            public final void LJJIIJ(int i) {
                if (i == 2) {
                    this.LIZ.m3().hide();
                    InterfaceC1451590nsT interfaceC1451590nsTW2 = this.LIZ.w2();
                    if (interfaceC1451590nsTW2 != null) {
                        interfaceC1451590nsTW2.x7(false, false, false, false);
                    }
                }
            }
        };
    }

    @Override // X.InterfaceC1450620nqu
    public void show() {
        C786410Ut5.LJZ(0, this.LLILLL);
        C786410Ut5.LJZ(0, this.LLILZ);
    }

    public final InterfaceC1451590nsT w2() {
        return (InterfaceC1451590nsT) this.LLILZIL.getValue(this, LLJJI[0]);
    }

    @Override // X.InterfaceC1450620nqu
    public boolean Qf() {
        C0FT7 c0ft7C3 = c3();
        EnumC1466150oFx enumC1466150oFx = EnumC1466150oFx.TEXT;
        if (c0ft7C3.LJIIIZ(enumC1466150oFx).size() < 35) {
            c3().LIZIZ(enumC1466150oFx, null, null, "", new AwS608S0100000_29(this, 74));
            return true;
        }
        Activity activity = getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.message(getActivity().getResources().getString(2131833300));
        C1390380mHk.LIZ(activity, 1035, creativeToastBuilder);
        return false;
    }

    @Override // X.InterfaceC1450620nqu
    public List<TextStickerModel> c1() {
        List<StickerModel> listLJIIIZ = c3().LJIIIZ(EnumC1466150oFx.TEXT);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIIZ, 10));
        Iterator<StickerModel> it2 = listLJIIIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next());
        }
        return arrayList;
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        GestureInteractItem gestureInteractItem = this.LLJ;
        if (gestureInteractItem != null) {
            H2().LIZ(gestureInteractItem);
        }
        this.LLJ = null;
    }

    public final C19647711tz v3() {
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

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        Z1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    @Override // X.InterfaceC1450620nqu
    public void H50(boolean z) {
        if (z) {
            GestureInteractItem gestureInteractItem = this.LLJ;
            if (gestureInteractItem != null) {
                H2().LIZIZ(gestureInteractItem);
                return;
            }
            return;
        }
        GestureInteractItem gestureInteractItem2 = this.LLJ;
        if (gestureInteractItem2 == null) {
            return;
        }
        H2().LIZ(gestureInteractItem2);
    }

    @Override // X.InterfaceC1450620nqu
    public void L2(int i) {
        c3().LJIIJ(i, null, true, EnumC356070Dxd.COMMIT);
    }

    @Override // X.InterfaceC1450620nqu
    public void mu(Function1<? super Map<Integer, String>, Unit> function1) {
        c3().LJI(new AwS601S0100000_22(function1, (Function1<? super Map<Integer, String>, Unit>) 52));
    }

    @Override // X.InterfaceC1450620nqu
    public void t7(List<TextStickerModel> list) {
        if (!list.isEmpty()) {
            Iterator<TextStickerModel> it2 = list.iterator();
            while (it2.hasNext()) {
                c3().f3(it2.next(), EnumC356070Dxd.COMMIT);
            }
        }
    }

    public C19626111qV(C1DRG c1drg, AbstractC214814194y abstractC214814194y, FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.LL = c1drg;
        this.LLILLJJLI = abstractC214814194y;
        this.LLILLL = frameLayout;
        this.LLILZ = frameLayout2;
    }

    public final ValueAnimator W1(View view, long j, Function0<Unit> function0, Function0<Unit> function02) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(view.getAlpha(), 0.0f);
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS277S0100000_29(view, 1));
        valueAnimatorOfFloat.addListener(new AAListenerS142S0300000_29(view, (View) function0, function02, (Function0<Unit>) 0));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }
}
