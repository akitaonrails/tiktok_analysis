package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLEAIMattingType;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS122S1200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0E6Y, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E6Y {
    public final C0E48 LIZ;
    public TuxTextView LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public C1295960jpS LJ;
    public TuxIconView LJFF;
    public final C01GW LJI = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(376));
    public final C354140DuW LJII = new InterfaceC354120DuU() { // from class: X.0DuW
        @Override // X.InterfaceC354120DuU
        public final void LIZIZ(String str) {
        }

        @Override // X.InterfaceC354120DuU
        public final void LIZJ(String str) {
            C355090Dw3.LIZIZ("-----AIMattingManager", "--AIMattingUiController onCancel--");
            C350870DpF.LJIIIZ(this.LIZ.LIZ, "event_editing_matting_status", new C354150DuX(str, 3, Float.valueOf(-1.0f), 4));
        }

        @Override // X.InterfaceC354120DuU
        public final void LJIIJ(String str) {
            C355090Dw3.LIZIZ("-----AIMattingManager", "--AIMattingUiController onStart--");
            C350870DpF.LJIIJ(this.LIZ.LIZ, "event_editing_matting_status", new C354150DuX(str, 0, Float.valueOf(0.0f), 4));
        }

        @Override // X.InterfaceC354120DuU
        public final void LIZLLL(Float f, String str) {
            INLEMediaSession iNLEMediaSessionF1;
            INLEPlayer playerApi;
            C355090Dw3.LIZIZ("-----AIMattingManager", "--AIMattingUiController onProgress--");
            C350870DpF.LJIIJ(this.LIZ.LIZ, "event_editing_matting_status", new C354150DuX(str, 1, f, 4));
            if (f != null && ((int) (f.floatValue() * 100)) % 5 == 0 && (iNLEMediaSessionF1 = this.LIZ.LIZ.f1()) != null && (playerApi = iNLEMediaSessionF1.getPlayerApi()) != null) {
                playerApi.refreshCurrentFrame();
            }
        }

        @Override // X.InterfaceC354120DuU
        public final void LIZ(String str, String str2, String str3) {
            C355090Dw3.LIZIZ("-----AIMattingManager", "--AIMattingUiController onError--");
            C350870DpF.LJIIIZ(this.LIZ.LIZ, "event_editing_matting_status", new C354150DuX(str, 10, Float.valueOf(-1.0f), 4));
            this.LIZ.LIZIZ(false, str2, str3);
        }

        @Override // X.InterfaceC354120DuU
        public final void onSuccess(String str, String str2, boolean z) {
            String uuid;
            C355090Dw3.LIZIZ("-----AIMattingManager", "--AIMattingUiController onSuccess--");
            C350870DpF.LJIIJ(this.LIZ.LIZ, "event_editing_matting_status", new C354150DuX(str, 2, z, Float.valueOf(-1.0f)));
            Object obj = null;
            this.LIZ.LIZ.getPlayer().LJJIIZ(null);
            C0E6Y c0e6y = this.LIZ;
            c0e6y.getClass();
            if (a0.LJJJIL(str)) {
                NLETrackSlot nLETrackSlotLLLLLLIL = c0e6y.LIZ.LLLLLLIL();
                if (nLETrackSlotLLLLLLIL != null) {
                    uuid = nLETrackSlotLLLLLLIL.getUUID();
                } else {
                    return;
                }
            } else {
                uuid = str;
            }
            if (uuid != null && !a0.LJJJIL(uuid)) {
                c0e6y.LIZIZ(true, CardStruct.IStatusCode.DEFAULT, "");
                VecNLETrackSPtr tracks = C350870DpF.LJI(c0e6y.LIZ).getTracks();
                ArrayList arrayList = new ArrayList();
                for (NLETrack nLETrack : tracks) {
                    if (NLETrackType.VIDEO == nLETrack.getTrackType()) {
                        arrayList.add(nLETrack);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    C19719612Di.LJJI(((NLETrack) it2.next()).getSlots(), arrayList2);
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList2) {
                    if (((NLETrackSlot) obj2).getAIMatting() != null) {
                        arrayList3.add(obj2);
                    }
                }
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (Intrinsics.LJFF(((NLENode) next).getUUID(), uuid)) {
                        obj = next;
                        break;
                    }
                }
                NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
                if (nLETrackSlot != null) {
                    AwS122S1200000_5 awS122S1200000_5 = new AwS122S1200000_5(nLETrackSlot, str, c0e6y, 4);
                    if (((Boolean) C0E5G.LIZIZ(EnumC357850E1f.ENABLE_MULTITHREADED_OPT, Boolean.FALSE)).booleanValue()) {
                        awS122S1200000_5.invoke();
                    } else {
                        C1524705y1.LIZ(new AwS549S0100000_5(awS122S1200000_5, 1376));
                    }
                }
            }
        }
    };
    public Drawable LJIIIIZZ;

    public final void LIZ() {
        C1295960jpS c1295960jpS = this.LJ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LJ;
        if (c1295960jpS2 != null) {
            C786410Ut5.LJLLLLLL(8, c1295960jpS2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0DuW] */
    public C0E6Y(C0E48 c0e48) {
        this.LIZ = c0e48;
    }

    public final void LIZIZ(boolean z, String str, String str2) {
        boolean mainTrack;
        int iSwigValue;
        NLETrackSlot nLETrackSlotLLLLLLIL = this.LIZ.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL == null) {
            return;
        }
        NLETrack nLETrackPt = this.LIZ.Pt();
        if (nLETrackPt != null) {
            mainTrack = nLETrackPt.getMainTrack();
        } else {
            mainTrack = false;
        }
        NLEAIMatting aIMatting = nLETrackSlotLLLLLLIL.getAIMatting();
        if (aIMatting != null) {
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(aIMatting.getSegment());
            if (nLESegmentAIMattingDynamicCast != null) {
                iSwigValue = nLESegmentAIMattingDynamicCast.getMattingType();
            } else {
                iSwigValue = NLEAIMattingType.TYPE_AI.swigValue();
            }
            if (z) {
                C0EI4 c0ei4 = C0EI4.LIZ;
                VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LJI.getValue();
                c0ei4.getClass();
                C0EI4.LJIIJJI(videoPublishEditModel, iSwigValue, z, "-1", "", mainTrack);
                return;
            }
            C0EI4 c0ei42 = C0EI4.LIZ;
            VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) this.LJI.getValue();
            c0ei42.getClass();
            C0EI4.LJIIJJI(videoPublishEditModel2, iSwigValue, false, str, str2, mainTrack);
        }
    }
}
