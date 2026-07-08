package Y;

import X.AbstractC1452680nuE;
import X.AbstractC1652550t6b;
import X.AbstractC579260Mnk;
import X.AbstractC579280Mnm;
import X.C013C;
import X.C054G;
import X.C0CNO;
import X.C0MH8;
import X.C0MHA;
import X.C0PEM;
import X.C1441890ncp;
import X.C1463670oBx;
import X.C1655250tAx;
import X.C1661180tKW;
import X.C1DFH;
import X.C201955140j;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C259800zU;
import X.C298330Bmh;
import X.C348100Dkm;
import X.C524780Ki4;
import X.C537540L6i;
import X.C546820LcW;
import X.C547140Ld2;
import X.C549280LgU;
import X.C549340Lga;
import X.C549990Lhd;
import X.C551270Ljh;
import X.C559200LwU;
import X.C561340Lzw;
import X.C574320Mfm;
import X.C576730Mjf;
import X.C578510MmX;
import X.C579290Mnn;
import X.C579300Mno;
import X.C786410Ut5;
import X.InterfaceC1452170ntP;
import X.InterfaceC1452850nuV;
import X.InterfaceC20236714Gf;
import X.InterfaceC549270LgT;
import X.InterfaceC577340Mke;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.als.h0;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentMVResolution;
import com.bytedance.ies.nle.editor_jni.NLETrackMV;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.create.QuotaCache;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.util.j;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.theater.creation.scene.AITheaterCreationRootScene;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import com.ss.android.ugc.gamora.recorder.choosemusic.c;
import com.tts.oecverify.BdTuring;
import dmt.av.video.VEPreviewParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS409S0200000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public class AObserverS173S0200000_8 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        if (Intrinsics.LJFF(((C0MHA) aObserverS173S0200000_8.l0).LIZJ, ((C0MHA) obj).LIZJ)) {
            C0MH8.LJ.removeObserver(aObserverS173S0200000_8);
            C0CNO.LIZLLL(0L, new AwS409S0200000_8((C0MHA) aObserverS173S0200000_8.l0, (C0MHA) aObserverS173S0200000_8.l1, (Function1<? super Boolean, Unit>) 6));
        }
    }

    public static final void onChanged$1(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        if (Intrinsics.LJFF(((C0MHA) aObserverS173S0200000_8.l0).LIZJ, ((C0MHA) obj).LIZJ)) {
            C0MH8.LJ.removeObserver(aObserverS173S0200000_8);
            C0CNO.LIZLLL(0L, new AwS409S0200000_8((C0MHA) aObserverS173S0200000_8.l0, (C0MHA) aObserverS173S0200000_8.l1, (Function1<? super Boolean, Unit>) 8));
        }
    }

    public static final void onChanged$10(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            ((DraftBoxFragment) aObserverS173S0200000_8.l0).dS().LLJILJIL.removeObservers(((DraftBoxFragment) aObserverS173S0200000_8.l0).getViewLifecycleOwner());
            DraftBoxFragment draftBoxFragment = (DraftBoxFragment) aObserverS173S0200000_8.l0;
            C054G c054g = draftBoxFragment.LLLLIIIILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(c054g, C2107308Nj.LIZ, null, new C561340Lzw(draftBoxFragment, (Boolean) aObserverS173S0200000_8.l1, null), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, X.0LgT, java.lang.Object] */
    public static final void onChanged$2(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        ?? r5 = (InterfaceC549270LgT) obj;
        boolean z = r5 instanceof C549280LgU;
        if (z && (((C259800zU) aObserverS173S0200000_8.l0).element instanceof C549280LgU)) {
            return;
        }
        ((C259800zU) aObserverS173S0200000_8.l0).element = r5;
        if (z) {
            View viewZ1 = ((C551270Ljh) aObserverS173S0200000_8.l1).Z1();
            if (viewZ1 != null) {
                viewZ1.setClickable(true);
            }
            View viewZ12 = ((C551270Ljh) aObserverS173S0200000_8.l1).Z1();
            if (viewZ12 != null) {
                C786410Ut5.T4(viewZ12, 1.0f);
            }
        } else {
            View viewZ13 = ((C551270Ljh) aObserverS173S0200000_8.l1).Z1();
            if (viewZ13 != null) {
                C786410Ut5.T4(viewZ13, 0.4f);
            }
            View viewZ14 = ((C551270Ljh) aObserverS173S0200000_8.l1).Z1();
            if (viewZ14 != null) {
                viewZ14.setClickable(false);
            }
        }
        if (!(r5 instanceof C549340Lga)) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope((C551270Ljh) aObserverS173S0200000_8.l1), null, null, new C549990Lhd((C551270Ljh) aObserverS173S0200000_8.l1, r5, null), 3);
        }
        C547140Ld2 c547140Ld2 = C546820LcW.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cameo status update: ");
        sbLIZ.append((Object) r5);
        c547140Ld2.LIZ("MentionDataTest", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void onChanged$3(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        ((Observer) aObserverS173S0200000_8.l0).onChanged(obj);
        ((LiveData) aObserverS173S0200000_8.l1).removeObserver(aObserverS173S0200000_8);
    }

    public static final void onChanged$4(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        InterfaceC577340Mke singleSongMusicLoadApi;
        AbstractC579260Mnk abstractC579260Mnk = (AbstractC579260Mnk) obj;
        boolean z = false;
        if (((c) aObserverS173S0200000_8.l0).M5() && (abstractC579260Mnk instanceof C579290Mnn)) {
            C1661180tKW.LIZ.getClass();
            h0<AbstractC1652550t6b> h0Var = C1661180tKW.LIZJ;
            if (h0Var.LIZJ() != null && (h0Var.LIZJ() instanceof C1655250tAx) && (singleSongMusicLoadApi = ((c) aObserverS173S0200000_8.l0).getSingleSongMusicLoadApi()) != null) {
                singleSongMusicLoadApi.VD2();
            }
        }
        c cVar = (c) aObserverS173S0200000_8.l0;
        if ((abstractC579260Mnk instanceof C579300Mno) || ((abstractC579260Mnk instanceof AbstractC579280Mnm) && ((AbstractC579280Mnm) abstractC579260Mnk).LIZ() > 0)) {
            z = true;
        }
        cVar.LLLFZ = z;
        C013C c013c = (C013C) aObserverS173S0200000_8.l1;
        boolean z2 = c013c.element;
        c cVar2 = (c) aObserverS173S0200000_8.l0;
        boolean z3 = cVar2.LLLFZ;
        if (z2 != z3) {
            c013c.element = z3;
            cVar2.setEnable(!z3);
            c cVar3 = (c) aObserverS173S0200000_8.l0;
            if (cVar3.LLLFZ) {
                if (MusicBeanUtilKt.extractAVMusic(cVar3.getShortVideoContext().creativeModel.musicBuzModel) == null) {
                    ((c) aObserverS173S0200000_8.l0).Y7(Boolean.FALSE, null, null);
                }
            } else {
                if (!cVar3.d6()) {
                    return;
                }
                c cVar4 = (c) aObserverS173S0200000_8.l0;
                Boolean bool = Boolean.TRUE;
                cVar4.Y7(bool, bool, bool);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [T, X.0MkB] */
    public static final void onChanged$5(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        AbstractC579260Mnk abstractC579260Mnk = (AbstractC579260Mnk) obj;
        if (abstractC579260Mnk instanceof C579300Mno) {
            C579300Mno c579300Mno = (C579300Mno) abstractC579260Mnk;
            if (!Intrinsics.LJFF(c579300Mno.LIZJ, ((C259800zU) aObserverS173S0200000_8.l0).element)) {
                C576730Mjf.LJIIIZ("CameraLayoutCaptureFlowComponent", "changing layout type");
                ((C578510MmX) aObserverS173S0200000_8.l1).W1(false);
                ((C578510MmX) aObserverS173S0200000_8.l1).e4(c579300Mno.LIZJ.LIZJ);
            }
        }
        ((C259800zU) aObserverS173S0200000_8.l0).element = ((C578510MmX) aObserverS173S0200000_8.l1).T2().G8();
    }

    public static final void onChanged$6(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        AObserverS51S0210000_8.LIZ$0((C559200LwU) aObserverS173S0200000_8.l0, (InterfaceC20236714Gf) aObserverS173S0200000_8.l1);
    }

    public static final void onChanged$7(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        String str;
        C1463670oBx c1463670oBx;
        C1463670oBx c1463670oBx2;
        C348100Dkm c348100DkmLIZLLL;
        NLEEditor nLEEditor;
        NLETrackMV nLETrackMVDynamicCast;
        VEPreviewParams vEPreviewParams = (VEPreviewParams) obj;
        if (C298330Bmh.LIZ()) {
            str = "av_video_editor_init";
        } else {
            str = "av_video_edit";
        }
        j jVar = C524780Ki4.LIZ;
        jVar.step(str, "VEEditor init start");
        final C1441890ncp c1441890ncp = (C1441890ncp) aObserverS173S0200000_8.l0;
        AbstractC1452680nuE abstractC1452680nuE = c1441890ncp.LJIIIZ;
        abstractC1452680nuE.LJJ = new InterfaceC1452850nuV() { // from class: X.0Mfu
            @Override // X.InterfaceC1452850nuV
            public final void LIZ() {
                C1441890ncp c1441890ncp2 = c1441890ncp;
                if (c1441890ncp2.LJII) {
                    return;
                }
                c1441890ncp2.LJII = true;
                C201955140j.LIZ("receive prepare done event");
                c1441890ncp.LJIIIIZZ.postValue(null);
            }
        };
        int iLJJII = abstractC1452680nuE.LJJII(c1441890ncp.LIZ, vEPreviewParams, c1441890ncp.LIZJ, (LifecycleOwner) aObserverS173S0200000_8.l1);
        ((C1441890ncp) aObserverS173S0200000_8.l0).getClass();
        ((C1441890ncp) aObserverS173S0200000_8.l0).getClass();
        if (!TextUtils.isEmpty(null)) {
            ((C1441890ncp) aObserverS173S0200000_8.l0).LJIIIZ.LJJIFFI(null, true);
        } else {
            InterfaceC1452170ntP interfaceC1452170ntPLJJ = ((C1441890ncp) aObserverS173S0200000_8.l0).LJIIIZ.LJJ();
            if ((interfaceC1452170ntPLJJ instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) interfaceC1452170ntPLJJ) != null) {
                C1441890ncp c1441890ncp2 = (C1441890ncp) aObserverS173S0200000_8.l0;
                if (c1441890ncp2.LJIIL != null) {
                    c1463670oBx.LIZLLL().LIZ.getModel().addTrack(c1441890ncp2.LJIIL);
                    c1441890ncp2.LJIIIZ.LJJI(c1463670oBx.LIZLLL().LIZ.getModel(), true);
                }
            } else {
                throw new RuntimeException("init NLE failed");
            }
        }
        C1441890ncp c1441890ncp3 = (C1441890ncp) aObserverS173S0200000_8.l0;
        c1441890ncp3.LJFF = c1441890ncp3.LJIIIZ.LJJ();
        C1441890ncp c1441890ncp4 = (C1441890ncp) aObserverS173S0200000_8.l0;
        if (c1441890ncp4.LJIIIZ instanceof C574320Mfm) {
            InterfaceC1452170ntP interfaceC1452170ntP = c1441890ncp4.LJFF;
            if ((interfaceC1452170ntP instanceof C1463670oBx) && (c1463670oBx2 = (C1463670oBx) interfaceC1452170ntP) != null && (c348100DkmLIZLLL = c1463670oBx2.LIZLLL()) != null && (nLEEditor = c348100DkmLIZLLL.LIZ) != null && (nLETrackMVDynamicCast = NLETrackMV.dynamicCast((NLENode) nLEEditor.getModel().getMainTrack())) != null) {
                nLETrackMVDynamicCast.setMVResolution(NLESegmentMVResolution.RES_CUSTOM.swigValue());
                nLETrackMVDynamicCast.setCustomWidth(vEPreviewParams.mCanvasWidth);
                nLETrackMVDynamicCast.setCustomHeight(vEPreviewParams.mCanvasHeight);
                nLEEditor.commit();
            }
        }
        C1441890ncp c1441890ncp5 = (C1441890ncp) aObserverS173S0200000_8.l0;
        AbstractC1452680nuE abstractC1452680nuE2 = c1441890ncp5.LJIIIZ;
        c1441890ncp5.getClass();
        abstractC1452680nuE2.LJJIIJ(true);
        ((C1441890ncp) aObserverS173S0200000_8.l0).LJI.setValue(Integer.valueOf(iLJJII));
        ((C1441890ncp) aObserverS173S0200000_8.l0).getClass();
        jVar.step(str, "VEEditor init end");
        C201955140j.LIZ("VEEditor init end");
    }

    public static final void onChanged$8(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        QuotaCache quotaCache = (QuotaCache) obj;
        Source source = (Source) aObserverS173S0200000_8.l0;
        if (source == null || Intrinsics.LJFF(source.getSource(), quotaCache.quotaTaskTypeTag)) {
            ((Function1) aObserverS173S0200000_8.l1).invoke(quotaCache);
        }
    }

    public static final void onChanged$9(AObserverS173S0200000_8 aObserverS173S0200000_8, Object obj) {
        String str;
        Integer num;
        InterfaceC549270LgT interfaceC549270LgT = (InterfaceC549270LgT) obj;
        C547140Ld2 c547140Ld2 = C537540L6i.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasCameo changed: ");
        sbLIZ.append(interfaceC549270LgT.LIZ());
        c547140Ld2.LIZ("AITheaterCreationRootScene", C2188811AlT.LIZIZ(sbLIZ));
        AIGCEntranceInfo aIGCEntranceInfo = ((AITheaterCreationRootScene) aObserverS173S0200000_8.l0).LLLLLLL().getContextModel().aigcEntranceInfo;
        Boolean bool = (Boolean) aObserverS173S0200000_8.l1;
        aIGCEntranceInfo.hasCameo = interfaceC549270LgT.LIZ();
        boolean z = interfaceC549270LgT instanceof C549280LgU;
        if (z) {
            str = ((C549280LgU) interfaceC549270LgT).LIZJ;
        } else {
            str = "";
        }
        aIGCEntranceInfo.faceIdCreatedWay = str;
        if (Intrinsics.LJFF(bool, Boolean.TRUE) && z) {
            num = ((C549280LgU) interfaceC549270LgT).LIZLLL;
        } else {
            num = null;
        }
        aIGCEntranceInfo.selfCameoFilter = num;
    }

    public AObserverS173S0200000_8(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
