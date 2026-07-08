package X;

import Y.ACallableS1S1112000_22;
import Y.AObserverS225S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.createx.editor.gesture.GestureInteractItem;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.effect.EditEffectVideoModel;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.infoSticker.customsticker.model.CustomStickerInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import dmt.av.video.ReplayLiveData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454990nxx extends AbstractC1453750nvx implements InterfaceC1166920gTK, InterfaceC1455160nyE, InterfaceC384890F7f, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLII;
    public final C1DRG LLJJ;
    public InterfaceC1465710oFF LLJJIII;
    public final C1664750tQH LLJJIJI;
    public InterfaceC1455030ny1 LLJJJ;
    public InterfaceC1455040ny2 LLJJJIL;
    public InterfaceC1455050ny3 LLJJJJ;
    public InterfaceC1455100ny8 LLJJJJJIL;
    public final C1664750tQH LLJJJJLIIL;
    public InterfaceC1453430nvR LLJJL;
    public InterfaceC1455150nyD LLJJLIIIJLLLLLLLZ;
    public final C1664750tQH LLJL;
    public final C1664750tQH LLJLIL;
    public InterfaceC1452130ntL LLJLILLLLZIIL;
    public InterfaceC1455140nyC LLJLL;
    public InterfaceC1455130nyB LLJLLIL;
    public InterfaceC1454940nxs LLJLLL;
    public InterfaceC2180241AUk LLJZ;
    public InterfaceC1419190n2D LLJZIJLIL;
    public C19740512Lj LLL;
    public C1439740nZM LLLF;
    public final C1664750tQH LLLFF;
    public C0MPH LLLFFI;
    public boolean LLLFZ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1074));
    public final C01GW LLJJIJIIJIL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 1075));
    public final Map<String, String> LLJJIJIL = new LinkedHashMap();
    public final C860670XpZ LLLI = C860670XpZ.LIZ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1454990nxx.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1454990nxx.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1454990nxx.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1454990nxx.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1454990nxx.class, "sizeProvider", "getSizeProvider()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoSizeProvider;", 0);
        c09r3.getClass();
        LLLII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLLLL(Effect effect, CustomStickerInfo customStickerInfo) {
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // X.InterfaceC1455160nyE
    public final void t3() {
    }

    @Override // X.InterfaceC384890F7f
    public final InterfaceC1444130ngR LLJIJIL() {
        return (InterfaceC1444130ngR) this.LLLFF.getValue(this, LLLII[4]);
    }

    @Override // X.AbstractC1453750nvx
    public final boolean LLLLLLZ() {
        return findSceneByTag("FTCEditStickerScene") != null;
    }

    public final InterfaceC1446740nke LLLLLZL() {
        return (InterfaceC1446740nke) this.LLJL.getValue(this, LLLII[2]);
    }

    public final VideoPublishEditModel LLLLZIL() {
        return (VideoPublishEditModel) this.LLJJJJLIIL.getValue(this, LLLII[1]);
    }

    @Override // X.AbstractC1453750nvx
    /* JADX INFO: renamed from: LLLLZLL, reason: merged with bridge method [inline-methods] */
    public final C1460790o7J LLLLLJIL() {
        return (C1460790o7J) this.LLJJIJIIJIL.getValue();
    }

    public final void LLLLZLLLI() {
        if (this.LLLFFI == null) {
            C0MPH c0mphLIZLLL = C0MPH.LIZLLL(this.mActivity, getResources().getString(R.string.rdr));
            if (c0mphLIZLLL != null) {
                c0mphLIZLLL.setIndeterminate(true);
            } else {
                c0mphLIZLLL = null;
            }
            this.LLLFFI = c0mphLIZLLL;
        }
    }

    @Override // X.InterfaceC1455160nyE
    public final void LLJL() {
        LLLLLJIL().getClass();
        InterfaceC1455030ny1 interfaceC1455030ny1 = this.LLJJJ;
        if (interfaceC1455030ny1 == null) {
            interfaceC1455030ny1 = null;
        }
        interfaceC1455030ny1.bo();
        LLLLLZL().vW1().setValue(C1452730nuJ.LIZJ());
        LLLLLIL().cr();
    }

    @Override // X.AbstractC1453750nvx
    public final C1DRG LLLLLILLIL() {
        C0LEK c0lekLJII = C1664600tQ2.LJII(this);
        if (c0lekLJII != null) {
            return c0lekLJII.LJFF();
        }
        return null;
    }

    public final InterfaceC1452170ntP LLLLZ() {
        return LLLLLZL().g().getValue();
    }

    @Override // com.bytedance.scene.Scene
    public final void onResume() {
        super.onResume();
        C201955140j.LIZ("VEVideoPublishEditActivity onResume EditRootScene");
        this.LLLFZ = false;
    }

    @Override // X.AbstractC1453750nvx
    public final Map<String, String> LLLLL() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJJ;
    }

    public C1454990nxx(C1DRG c1drg) {
        this.LLJJ = c1drg;
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455850nzL.class, null);
        this.LLJJJJLIIL = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJL = C1664770tQJ.LIZ(c1drg, InterfaceC1446740nke.class, null);
        this.LLJLIL = C1664770tQJ.LIZ(c1drg, AbstractC214814194y.class, null);
        this.LLLFF = C1664770tQJ.LIZ(c1drg, InterfaceC1444130ngR.class, null);
        C19565911gn.LIZ();
        C122T.LIZ();
        if (!C1416310mxZ.LJJLIIIJJIZ(LLLLZIL())) {
            C122T.LJ(new C196922122u());
        }
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLLZIL(C1439740nZM c1439740nZM) {
        this.LLLF = c1439740nZM;
    }

    @Override // X.InterfaceC384890F7f
    public final void LLZILL(StickerItemModel stickerItemModel) {
        int i;
        if (C2354709Kn.LIZIZ(stickerItemModel.path)) {
            if (!LLLLZIL().hasInfoStickers()) {
                LLLLZIL().setInfoStickerModel(new InfoStickerModel(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIJ(LLLLZIL())));
            }
            InfoStickerModel infoStickerModel = LLLLZIL().getInfoStickerModel();
            if (infoStickerModel != null) {
                int i2 = 1;
                if (infoStickerModel.stickers.size() > 0) {
                    for (StickerItemModel stickerItemModel2 : infoStickerModel.stickers) {
                        if (C1403820mdQ.LIZ(stickerItemModel2) && (i = stickerItemModel2.layerWeight) > i2) {
                            i2 = i;
                        }
                    }
                }
                stickerItemModel.layerWeight += i2;
                infoStickerModel.stickers.add(stickerItemModel);
            }
        }
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C19740512Lj c19740512Lj = this.LLL;
        InterfaceC1455130nyB interfaceC1455130nyB = null;
        if (c19740512Lj == null) {
            c19740512Lj = null;
        }
        C1455070ny5 c1455070ny5 = new C1455070ny5(c19740512Lj, new AwS566S0100000_22(this, 1076), LLLLZIL(), new AwS566S0100000_22(this, 1077));
        C1654320t9S.LIZIZ(this, AFwS261S0000000_22.get$arr$(295));
        C1664590tQ1.LIZLLL(this, null, false, new AwS388S0200000_22(c1455070ny5, this, 237), 3);
        C1664600tQ2.LIZ(this, null, new AwS388S0200000_22(c1455070ny5, this, 249));
        C1DRG c1drgLJIIIZ = C1664600tQ2.LJIIIZ(this);
        if (c1drgLJIIIZ != null) {
            this.LLJJIII = (InterfaceC1465710oFF) c1drgLJIIIZ.LJII(InterfaceC1465710oFF.class, null);
            this.LLJJJ = (InterfaceC1455030ny1) c1drgLJIIIZ.LJII(InterfaceC1455030ny1.class, null);
            this.LLJJJIL = (InterfaceC1455040ny2) c1drgLJIIIZ.LJIIL(null, InterfaceC1455040ny2.class);
            this.LLJJJJ = (InterfaceC1455050ny3) c1drgLJIIIZ.LJIIL(null, InterfaceC1455050ny3.class);
            this.LLJJJJJIL = (InterfaceC1455100ny8) c1drgLJIIIZ.LJII(InterfaceC1455100ny8.class, null);
            this.LLJJL = (InterfaceC1453430nvR) c1drgLJIIIZ.LJII(InterfaceC1453430nvR.class, null);
            this.LLJJLIIIJLLLLLLLZ = (InterfaceC1455150nyD) c1drgLJIIIZ.LJII(InterfaceC1455150nyD.class, null);
            this.LLJLILLLLZIIL = (InterfaceC1452130ntL) c1drgLJIIIZ.LJII(InterfaceC1452130ntL.class, null);
            this.LLJLL = (InterfaceC1455140nyC) c1drgLJIIIZ.LJII(InterfaceC1455140nyC.class, null);
            this.LLJLLIL = (InterfaceC1455130nyB) c1drgLJIIIZ.LJII(InterfaceC1455130nyB.class, null);
            this.LLJLLL = (InterfaceC1454940nxs) c1drgLJIIIZ.LJII(InterfaceC1454940nxs.class, null);
            this.LLJZIJLIL = (InterfaceC1419190n2D) c1drgLJIIIZ.LJIIL(null, InterfaceC1419190n2D.class);
            this.LLJZ = (InterfaceC2180241AUk) c1drgLJIIIZ.LJII(InterfaceC2180241AUk.class, null);
            this.LLJILLL = new C1454870nxl((C19EG) this.mActivity, this, C1664600tQ2.LJIIIZ(this));
            InterfaceC1455150nyD interfaceC1455150nyD = this.LLJJLIIIJLLLLLLLZ;
            if (interfaceC1455150nyD == null) {
                interfaceC1455150nyD = null;
            }
            interfaceC1455150nyD.show();
            InterfaceC1455130nyB interfaceC1455130nyB2 = this.LLJLLIL;
            if (interfaceC1455130nyB2 != null) {
                interfaceC1455130nyB = interfaceC1455130nyB2;
            }
            interfaceC1455130nyB.u72();
            LLLLLZL().ww2().observe(this, new AObserverS225S0100000_22(this, 190));
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.scene.Scene
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C19740512Lj c19740512Lj = this.LLL;
        if (c19740512Lj == null) {
            c19740512Lj = null;
        }
        c19740512Lj.LIZIZ(new GestureInteractItem(0, new AbstractC21664419qU() { // from class: X.0ny0
            @Override // X.C0FUM, com.bytedance.createx.editor.gesture.GestureLayout$OnGestureListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                InterfaceC1457400o1q interfaceC1457400o1q = this.LL.LLLLLJIL().LLJJLIIIJLLLLLLLZ;
                if (interfaceC1457400o1q != null) {
                    return interfaceC1457400o1q.LJJJLZIJ();
                }
                return false;
            }
        }));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLL(ARunnableS122S0100000_22 aRunnableS122S0100000_22, boolean z, boolean z2) {
        LLLLLLJ(aRunnableS122S0100000_22, null, z, z2, false);
    }

    public final void LLLLZLLIL(Intent intent, boolean z, boolean z2) {
        C1438840nXu c1438840nXu = C1438840nXu.LIZ;
        C1438930nY3 c1438930nY3 = new C1438930nY3(requireActivity(), intent, z, z2, false);
        c1438840nXu.getClass();
        C1438840nXu.LIZ(c1438930nY3);
    }

    @Override // X.AbstractC1453750nvx, X.C19A3, com.bytedance.scene.Scene
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) C786410Ut5.Td(layoutInflater, R.layout.eq0, viewGroup, false);
        this.LLL = C1451800nso.LIZ(viewGroup.getContext(), (ViewGroup) viewGroup2.findViewById(R.id.gpu), 0, 12);
        C365090ETb.LIZIZ();
        if (C0L2Z.LIZ()) {
            new C20576115fL((ViewStub) viewGroup2.findViewById(R.id.gqv)).LIZIZ(new AwS566S0100000_22(this, 1072), new AwS566S0100000_22(this, 1073));
        }
        return viewGroup2;
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLZ(final boolean r17, final boolean r18, final java.lang.Runnable r19, final java.lang.Runnable r20) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1454990nxx.LLLLLZ(boolean, boolean, java.lang.Runnable, java.lang.Runnable):void");
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.AbstractC1453750nvx
    public final void LLLLLLJ(final Runnable runnable, Runnable runnable2, final boolean z, final boolean z2, boolean z3) {
        String str;
        int i;
        MvCreateVideoData mvCreateVideoData;
        if (LLLLZIL().isMvThemeVideoType()) {
            MvCreateVideoData mvCreateVideoData2 = LLLLZIL().getMvCreateVideoData();
            String str2 = null;
            if (mvCreateVideoData2 != null) {
                str = mvCreateVideoData2.videoCoverImgPath;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str) && (mvCreateVideoData = LLLLZIL().getMvCreateVideoData()) != null) {
                mvCreateVideoData.videoCoverImgPath = C1403010mc7.LIZ.LJIIIIZZ().LIZ().LJIIIIZZ(LLLLZIL().getCreativeInfo());
            }
            InterfaceC1452170ntP interfaceC1452170ntPLLLLZ = LLLLZ();
            MvCreateVideoData mvCreateVideoData3 = LLLLZIL().getMvCreateVideoData();
            if (mvCreateVideoData3 != null) {
                str2 = mvCreateVideoData3.videoCoverImgPath;
            }
            MvCreateVideoData mvCreateVideoData4 = LLLLZIL().getMvCreateVideoData();
            if (mvCreateVideoData4 != null) {
                i = mvCreateVideoData4.videoCoverStartTime;
            } else {
                i = 0;
            }
            final ARunnableS122S0100000_22 aRunnableS122S0100000_22 = (ARunnableS122S0100000_22) runnable2;
            new MvChooseCoverBitmapCreator(interfaceC1452170ntPLLLLZ, str2, i, (InterfaceC1457180o1U) new InterfaceC1457180o1U() { // from class: X.0nyA
                @Override // X.InterfaceC1457180o1U
                public final void onError(int i2, String str3) {
                    C201955140j.LJ(str3);
                }
            }, new C0MBV() { // from class: X.0ny4
                @Override // X.C0MBV
                public final void LIZLLL() {
                    this.LIZ.LLLLLZ(z, z2, runnable, aRunnableS122S0100000_22);
                }
            }, false);
        } else {
            LLLLLZ(z, z2, runnable, runnable2);
        }
        C860670XpZ c860670XpZ = this.LLLI;
        VideoPublishEditModel videoPublishEditModelLLLLZIL = LLLLZIL();
        c860670XpZ.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("creation_id", videoPublishEditModelLLLLZIL.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModelLLLLZIL.mShootWay);
        c0lab.LJ("enter_from", "video_edit_page");
        if (videoPublishEditModelLLLLZIL.getDraftId() != 0) {
            c0lab.LIZ(videoPublishEditModelLLLLZIL.getDraftId(), "draft_id");
        }
        C20684815ws.LJIILLIIL("next", c0lab.LIZ);
    }

    @Override // X.InterfaceC1455160nyE
    public final void Q4(final String str, final int i, int i2, final int i3, final boolean z) {
        LLLLZLLLI();
        ACallableS1S1112000_22 aCallableS1S1112000_22 = new ACallableS1S1112000_22(i, i2, this, str, z, 1);
        ExecutorC2206508kh executorC2206508kh = C15O7.LJIIIIZZ;
        C15O7.LIZIZ(aCallableS1S1112000_22, executorC2206508kh, null).LJ(new InterfaceC2385309Wh<Pair<Integer, AVMusicWaveBean>, Unit>() { // from class: X.0nxv
            @Override // X.InterfaceC2385309Wh
            public final Unit then(C15O7<Pair<Integer, AVMusicWaveBean>> c15o7) {
                boolean z2;
                boolean z3;
                AVMusicWaveBean aVMusicWaveBean;
                C1C7U.LIZ("FTCEditRootScene@43ac.onMvMusicChanged$1");
                C1454990nxx c1454990nxx = this;
                C0MPH c0mph = c1454990nxx.LLLFFI;
                if (c0mph != null) {
                    c0mph.dismiss();
                    C785410UrT.LIZ(c0mph);
                }
                c1454990nxx.LLLFFI = null;
                if (c15o7 != null) {
                    Pair<Integer, AVMusicWaveBean> pairLJIIL = c15o7.LJIIL();
                    if (!c15o7.LJIILL() && !c15o7.LJIILIIL()) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (pairLJIIL != null && pairLJIIL.first != null && ((Number) pairLJIIL.first).intValue() >= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (!z2 && !z3) {
                        C1454990nxx c1454990nxx2 = this;
                        if (c1454990nxx2.LLLLZIL().getTimeEffect() != null || !C0IKQ.LIZ(c1454990nxx2.LLLLZIL().getEffectList()) || c1454990nxx2.LLLLZIL().hasInfoStickers() || c1454990nxx2.LLLLLJIL().C1()) {
                            c1454990nxx2.LLLLLJIL().LJJJJIZL(null);
                            c1454990nxx2.LLLLLJIL().LJJIIZ();
                            ArrayList<EffectPointModel> arrayListDt = c1454990nxx2.LLLLLZL().dt();
                            ReplayLiveData<C0EYM> replayLiveDataDS1 = c1454990nxx2.LLLLLZL().dS1();
                            if (!C0IKQ.LIZ(arrayListDt)) {
                                int size = arrayListDt.size();
                                int[] iArr = new int[size];
                                String[] strArr = new String[arrayListDt.size()];
                                for (int i4 = 0; i4 < size; i4++) {
                                    iArr[i4] = ((EffectPointModel) ListProtector.get(arrayListDt, i4)).getIndex();
                                    strArr[i4] = ((EffectPointModel) ListProtector.get(arrayListDt, i4)).getUuid();
                                }
                                C0EYM c0eym = new C0EYM();
                                c0eym.LJI = 3;
                                c0eym.LIZ = iArr;
                                c0eym.LIZIZ = strArr;
                                replayLiveDataDS1.setValue(c0eym);
                            }
                            if (!C0IKQ.LIZ(c1454990nxx2.LLLLZIL().getEffectList())) {
                                c1454990nxx2.LLLLZIL().getEffectList().clear();
                            }
                            C1389890mGx c1389890mGx = new C1389890mGx(this.requireActivity());
                            c1389890mGx.LJIIJ(this.getString(2131837859));
                            c1389890mGx.LJIIJJI();
                        }
                        if (pairLJIIL != null) {
                            aVMusicWaveBean = (AVMusicWaveBean) pairLJIIL.second;
                        } else {
                            aVMusicWaveBean = null;
                        }
                        InterfaceC1452170ntP interfaceC1452170ntPLLLLZ = this.LLLLZ();
                        if (interfaceC1452170ntPLLLLZ != null) {
                            int duration = interfaceC1452170ntPLLLLZ.getDuration();
                            AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LLLLZIL().creativeModel.musicBuzModel);
                            if (aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.getShootDuration() > 0) {
                                int iLIZIZ = C141Q.LIZIZ(this.LLLLZIL().getCurMusicServerLength(), str);
                                if (Math.abs(iLIZIZ - aVMusicExtractAVMusic.getShootDuration()) >= 1000) {
                                    InterfaceC1454940nxs interfaceC1454940nxs = this.LLJLLL;
                                    if (interfaceC1454940nxs == null) {
                                        interfaceC1454940nxs = null;
                                    }
                                    interfaceC1454940nxs.LLLL(Math.min(duration, aVMusicExtractAVMusic.getShootDuration()));
                                } else {
                                    InterfaceC1454940nxs interfaceC1454940nxs2 = this.LLJLLL;
                                    if (interfaceC1454940nxs2 == null) {
                                        interfaceC1454940nxs2 = null;
                                    }
                                    interfaceC1454940nxs2.LLLL(Math.min(duration, iLIZIZ));
                                }
                            } else {
                                InterfaceC1454940nxs interfaceC1454940nxs3 = this.LLJLLL;
                                if (interfaceC1454940nxs3 == null) {
                                    interfaceC1454940nxs3 = null;
                                }
                                interfaceC1454940nxs3.LLLL(duration);
                            }
                            if (z) {
                                InterfaceC1454940nxs interfaceC1454940nxs4 = this.LLJLLL;
                                if (interfaceC1454940nxs4 == null) {
                                    interfaceC1454940nxs4 = null;
                                }
                                interfaceC1454940nxs4.KM2(aVMusicWaveBean, i3, 0);
                            }
                            ((EditEffectVideoModel) C1659630tI1.LJIIIIZZ(this, null, null, 6).get(EditEffectVideoModel.class)).DQ2().setValue(Integer.valueOf(duration));
                            int iMo51if = interfaceC1452170ntPLLLLZ.mo51if();
                            C1454990nxx c1454990nxx3 = this;
                            InterfaceC1461650o8h interfaceC1461650o8hLIZJ = ((InterfaceC1455850nzL) c1454990nxx3.LLJJIJI.getValue(c1454990nxx3, C1454990nxx.LLLII[0])).Iz2().LIZJ();
                            if (interfaceC1461650o8hLIZJ != null) {
                                interfaceC1461650o8hLIZJ.l0(new kotlin.Pair<>(Integer.valueOf(iMo51if), Integer.valueOf(duration)));
                            }
                            if (this.getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
                                MutableLiveData<C1452730nuJ> mutableLiveDataVW1 = this.LLLLLZL().vW1();
                                mutableLiveDataVW1.setValue(C1452730nuJ.LIZLLL(i));
                                mutableLiveDataVW1.setValue(C1452730nuJ.LIZ());
                            }
                            if (!C1430550nKX.LIZIZ(this.LLLLZIL())) {
                                this.LLLLLIL().eg(C570830Ma9.LIZ(this.LLLLZIL().getCurMusicServerLength(), this.LLLLZIL(), str));
                            }
                        }
                    } else {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(this.requireActivity());
                        c1389890mGx2.LJIIJ(this.getString(2131837858));
                        c1389890mGx2.LJIIJJI();
                    }
                }
                C1C7U.LIZIZ("FTCEditRootScene@43ac.onMvMusicChanged$1");
                return null;
            }
        }, executorC2206508kh, null);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
