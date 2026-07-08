package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import java.util.Iterator;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DkA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347720DkA extends AbstractC348060Dki {
    public final C347650Dk3 LIZIZ;
    public final boolean LIZJ;
    public NLEPlayerState LIZLLL;

    @Override // X.AbstractC348060Dki
    public final void LIZ(INLEMediaSession iNLEMediaSession) {
        iNLEMediaSession.getPlayerApi().prepare();
        if (this.LIZLLL == NLEPlayerState.STARTED) {
            iNLEMediaSession.getPlayerApi().play();
        }
    }

    @Override // X.AbstractC348060Dki
    public final void LIZIZ(INLEMediaSession iNLEMediaSession) {
        NLEPlayerState nLEPlayerStateState = iNLEMediaSession.getPlayerApi().state();
        this.LIZLLL = nLEPlayerStateState;
        if (nLEPlayerStateState == NLEPlayerState.STARTED) {
            iNLEMediaSession.getPlayerApi().pause();
        }
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        NLETrack next;
        NLETrack nLETrack;
        LJFF(" 2.add track start ");
        C347650Dk3 c347650Dk3 = this.LIZIZ;
        AwS619S0100000_5 awS619S0100000_5 = new AwS619S0100000_5(this, 55);
        boolean z = true;
        if (this.LIZJ) {
            nLETrack = new NLETrack();
            nLETrack.setExtra("AudioTrackType", c347650Dk3.LIZ.name());
            nLETrack.setStartTime(0L);
            nLETrack.setEndTime(-2L);
        } else {
            Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(C348350DlB.LIZ(next), c347650Dk3.LIZ.name())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            nLETrack = next;
            if (nLETrack == null) {
                nLETrack = new NLETrack();
                nLETrack.setExtra("AudioTrackType", c347650Dk3.LIZ.name());
                nLETrack.setStartTime(0L);
                nLETrack.setEndTime(-2L);
            } else {
                z = false;
            }
        }
        NLETrackSlot nLETrackSlotLJII = LJII(nLETrack, c347650Dk3);
        if (z) {
            nLEEditor.getModel().addTrack(nLETrack);
        }
        awS619S0100000_5.invoke(nLETrack, nLETrackSlotLJII);
    }

    public C347720DkA(C347650Dk3 c347650Dk3, boolean z) {
        this.LIZIZ = c347650Dk3;
        this.LIZJ = z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c347650Dk3);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (c347650Dk3.LIZIZ != null) {
        } else {
            throw new IllegalArgumentException("MusicBgmOperation.filePath can not be null");
        }
    }

    public static NLETrackSlot LJII(NLETrack nLETrack, C347650Dk3 c347650Dk3) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
        NLEResourceAV nLEResourceAV = new NLEResourceAV();
        nLEResourceAV.setResourceType(NLEResType.AUDIO);
        nLEResourceAV.setResourceFile(c347650Dk3.LIZIZ);
        String str = c347650Dk3.LJIIZILJ;
        if (str != null && str.length() != 0) {
            nLEResourceAV.setFileInfo(c347650Dk3.LJIIZILJ);
        }
        nLEResourceAV.setDuration((c347650Dk3.LJ - c347650Dk3.LIZLLL) * 1000);
        nLESegmentAudio.setAVFile(nLEResourceAV);
        nLETrackSlot.setMainSegment(nLESegmentAudio);
        new C347620Dk0(c347650Dk3);
        C347620Dk0.LJII(nLETrackSlot, c347650Dk3);
        nLETrack.addSlot(nLETrackSlot);
        return nLETrackSlot;
    }
}
