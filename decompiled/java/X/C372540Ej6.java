package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.model.EditorProCancelData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS89S0210000_5;

/* JADX INFO: renamed from: X.0Ej6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C372540Ej6 {
    public final C1DRG LIZ;
    public final C372480Ej0 LIZIZ;
    public final InterfaceC497601wk LIZJ;
    public final Function0<Unit> LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 879));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS549S0100000_5(this, 878));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 888));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS549S0100000_5(this, 877));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 885));
    public AnonymousClass0956 LJIIIZ;

    public final VideoPublishEditModel LIZIZ() {
        C0EHJ c0ehj;
        C0EHI value = ((C0EY2) this.LJ.getValue()).zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    public final C0ELJ LIZJ() {
        C0EHI value = ((C0EY2) this.LJ.getValue()).zu2().getValue();
        if (value != null) {
            return value.LJ;
        }
        return null;
    }

    public final void LIZ(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        boolean zIsRetakeVideo;
        boolean effectMultiTrackMode;
        boolean z2;
        MultiEditVideoRecordData multiEditVideoRecordDataCloneData;
        C1DRG c1drg;
        InterfaceC372770EjT interfaceC372770EjT;
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoStatusRecordData multiEditVideoRecordData2;
        AnonymousClass0956 anonymousClass0956 = this.LJIIIZ;
        if (anonymousClass0956 != null && anonymousClass0956.isActive()) {
            return;
        }
        if (((C0EY2) this.LJ.getValue()).zu2().getValue() == null) {
            function2.invoke(Boolean.FALSE, Boolean.valueOf(z));
        }
        C0E48 c0e48LIZ = C349830DnZ.LIZ(this.LIZ);
        if (c0e48LIZ == null) {
            return;
        }
        VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
        if (videoPublishEditModelLIZIZ != null) {
            zIsRetakeVideo = videoPublishEditModelLIZIZ.isRetakeVideo();
        } else {
            zIsRetakeVideo = false;
        }
        C0ELJ c0eljLIZJ = LIZJ();
        if (c0eljLIZJ != null) {
            effectMultiTrackMode = c0eljLIZJ.getEffectMultiTrackMode();
        } else {
            effectMultiTrackMode = false;
        }
        ((C0EC7) this.LJFF.getValue()).xJ2().LLJJIII = false;
        C372750EjR.LIZ = System.currentTimeMillis();
        C372750EjR.LIZJ = true;
        InterfaceC350420DoW interfaceC350420DoWBs = c0e48LIZ.bs();
        if (interfaceC350420DoWBs != null) {
            C350440DoY.LIZIZ(interfaceC350420DoWBs);
        }
        Iterator it2 = ((ArrayList) C351220Dpo.LJLJJLL(C350870DpF.LJI(c0e48LIZ))).iterator();
        while (it2.hasNext()) {
            C372750EjR.LIZLLL += ((NLETrack) it2.next()).getSlots().size();
        }
        C372750EjR.LIZIZ = true;
        if (C301680Bs6.LIZ()) {
            if (videoPublishEditModelLIZIZ != null) {
                this.LIZIZ.LLLLLL().LJFF(videoPublishEditModelLIZIZ);
            }
        } else if (videoPublishEditModelLIZIZ != null) {
            if (C306640C0g.LIZ()) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZIZ), C0PEM.LIZJ, null, new C372550Ej7(this, videoPublishEditModelLIZIZ, null), 2);
            } else {
                this.LIZIZ.LLLLLL().LJ(videoPublishEditModelLIZIZ);
            }
        }
        C0F1Z.LIZ.getClass();
        MultiEditVideoRecordData multiEditVideoRecordData3 = C0F1Z.LIZIZ;
        if (multiEditVideoRecordData3 != null) {
            z2 = multiEditVideoRecordData3.hasRetake;
        } else {
            z2 = false;
        }
        MultiEditVideoRecordData multiEditVideoRecordDataLIZIZ = C383300F1c.LIZIZ(C0F1Z.LJ, C0F1Z.LIZIZ);
        C0F1Z.LIZIZ = multiEditVideoRecordDataLIZIZ;
        if (multiEditVideoRecordDataLIZIZ != null) {
            multiEditVideoRecordDataLIZIZ.hasRetake = z2;
        }
        VideoPublishEditModel videoPublishEditModel = C0F1Z.LIZLLL;
        if (videoPublishEditModel != null && (multiEditVideoRecordData2 = videoPublishEditModel.getMultiEditVideoRecordData()) != null) {
            multiEditVideoRecordData2.isMultiEditRetake = false;
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = C0F1Z.LIZIZ;
        if (multiEditVideoRecordData4 != null) {
            multiEditVideoRecordDataCloneData = multiEditVideoRecordData4.cloneData();
        } else {
            multiEditVideoRecordDataCloneData = null;
        }
        if (zIsRetakeVideo && C1428520nHG.LJJJJJ(videoPublishEditModelLIZIZ) && multiEditVideoRecordDataCloneData == null) {
            if (videoPublishEditModelLIZIZ != null && (multiEditVideoRecordData = videoPublishEditModelLIZIZ.getMultiEditVideoRecordData()) != null) {
                multiEditVideoRecordDataCloneData = multiEditVideoRecordData.restoreMultiEditVideoRecordData;
            } else {
                multiEditVideoRecordDataCloneData = null;
            }
        }
        EditorProCancelData editorProCancelData = new EditorProCancelData();
        editorProCancelData.curMultiEditData = multiEditVideoRecordDataCloneData;
        editorProCancelData.isRetake = false;
        editorProCancelData.effectMultiTrackMode = effectMultiTrackMode;
        editorProCancelData.exitByBackPressed = this.LIZIZ.LLLLLLIL().LJ;
        if (C357540E0a.LIZIZ(videoPublishEditModelLIZIZ)) {
            C354090DuR.LJIIL(c0e48LIZ);
        }
        C0ELJ c0eljLIZJ2 = LIZJ();
        if (c0eljLIZJ2 != null && c0eljLIZJ2.getFromRetouch()) {
            C19A3 c19a3LIZJ = ((C0EB6) this.LJIIIIZZ.getValue()).LIZJ();
            if ((c19a3LIZJ instanceof C0ESV) && c19a3LIZJ != null && (c1drg = ((FeatureAlsLogicContainer) C1664600tQ2.LJ(c19a3LIZJ)).LLJJI) != null && (interfaceC372770EjT = (InterfaceC372770EjT) c1drg.LJIIL(null, InterfaceC372770EjT.class)) != null) {
                interfaceC372770EjT.cancel();
            }
        }
        this.LJIIIZ = C23250099c.LIZLLL(this.LIZJ, null, null, new C372530Ej5(this, editorProCancelData, videoPublishEditModelLIZIZ, function2, z, c0e48LIZ, null), 3);
    }

    public final void LIZLLL(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        C0ELJ c0eljLIZJ;
        C0E48 c0e48LIZ = C349830DnZ.LIZ(this.LIZ);
        if (c0e48LIZ == null) {
            return;
        }
        C350870DpF.LJI(c0e48LIZ);
        C361680EFy.LJLJI("exit_ep_time", String.valueOf(System.currentTimeMillis()));
        boolean zIsFromText = false;
        if (c0e48LIZ.Bo().LIZ() || ((c0eljLIZJ = LIZJ()) != null && c0eljLIZJ.isRestoreData())) {
            AwS89S0210000_5 awS89S0210000_5 = new AwS89S0210000_5(this, (C372540Ej6) function2, (Function2<? super Boolean, ? super Boolean, Unit>) z, false);
            VideoPublishEditModel videoPublishEditModelLIZIZ = LIZIZ();
            if (videoPublishEditModelLIZIZ != null) {
                C20684815ws.LJIILLIIL("discard_your_edits_popup", C1402550mbN.LIZ(c0e48LIZ.getPlayer().qq(), C350870DpF.LJI(c0e48LIZ), videoPublishEditModelLIZIZ).LIZ);
            }
            C1397580mTM c1397580mTM = new C1397580mTM(this.LIZIZ.requireActivity());
            c1397580mTM.LIZ(2131833384);
            C985403tE.LIZ(c1397580mTM, new AwS214S0300000_5(awS89S0210000_5, this, c0e48LIZ, 25));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        VideoPublishEditModel videoPublishEditModelLIZIZ2 = LIZIZ();
        if (videoPublishEditModelLIZIZ2 != null) {
            C0ELJ c0eljLIZJ2 = LIZJ();
            if (c0eljLIZJ2 != null) {
                zIsFromText = c0eljLIZJ2.isFromText();
            }
            C361680EFy.LJJJLIIL(videoPublishEditModelLIZIZ2, "click_edit_cancel", zIsFromText, C350870DpF.LJI(c0e48LIZ), false, Boolean.FALSE, false);
        }
        LIZ(function2, z);
    }

    public C372540Ej6(C1DRG c1drg, C372480Ej0 c372480Ej0, InterfaceC497601wk interfaceC497601wk, AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = c1drg;
        this.LIZIZ = c372480Ej0;
        this.LIZJ = interfaceC497601wk;
        this.LIZLLL = awS549S0100000_5;
    }
}
