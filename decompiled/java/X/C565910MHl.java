package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.creative.model.music.UnSelectMusic;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565910MHl implements InterfaceC349110DmP {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public MusicBuzModel LIZIZ;
    public Float LIZJ;
    public boolean LIZLLL;
    public long LJ;
    public UnSelectMusic LJI;
    public boolean LJII;
    public final List<NLETrack> LIZ = new ArrayList();
    public List<C565900MHk> LJFF = new ArrayList();

    @Override // X.InterfaceC349110DmP
    public final void LIZLLL(VideoPublishEditModel videoPublishEditModel) {
    }

    @Override // X.InterfaceC349110DmP
    public final boolean LJIIIIZZ() {
        return false;
    }

    @Override // X.InterfaceC349110DmP
    public final void LJIIIZ(Function1<? super StickerItemModel, Unit> function1) {
    }

    @Override // X.InterfaceC349110DmP
    public final void LJIIJ(Function1<? super List<? extends EffectPointModel>, Unit> function1) {
    }

    @Override // X.InterfaceC349110DmP
    public final void LJIIJJI(Function1<? super TextStickerData, Unit> function1) {
    }

    @Override // X.InterfaceC349110DmP
    public final List<TextStickerData> LLLLLLZZ() {
        return null;
    }

    @Override // X.InterfaceC349110DmP
    public final void LIZ() {
        ((ArrayList) this.LIZ).clear();
        this.LIZIZ = null;
        this.LIZLLL = false;
        this.LJ = 0L;
        this.LJFF.clear();
    }

    @Override // X.InterfaceC349110DmP
    public final boolean LJ() {
        return this.LIZIZ != null;
    }

    @Override // X.InterfaceC349110DmP
    public final boolean LJFF() {
        return this.LIZIZ != null;
    }

    @Override // X.InterfaceC349110DmP
    public final NLETrackType LIZIZ() {
        return NLETrackType.AUDIO;
    }

    @Override // X.InterfaceC349110DmP
    public final void LJII(NLEEditor nLEEditor) {
        Iterator it2 = ((ArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            nLEEditor.getModel().addTrack((NLETrack) it2.next());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        LIZ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d4, code lost:
    
        return;
     */
    @Override // X.InterfaceC349110DmP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r12, int r13) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C565910MHl.LIZJ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, int):void");
    }

    @Override // X.InterfaceC349110DmP
    public final void LJIIL(NLETrack nLETrack, VideoPublishEditModel videoPublishEditModel) {
        NLETrack nLETrack2;
        VecNLETrackSlotSPtr slots;
        NLETrackSlot nLETrackSlot;
        NLEResourceAV aVFile;
        NLETrack nLETrack3;
        VecNLETrackSlotSPtr slots2;
        if (this.LIZIZ != null && Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM")) {
            ((ArrayList) this.LIZ).add(NLETrack.dynamicCast(nLETrack.deepClone()));
            if ((!C1458070o2v.LJFF() || ((nLETrack3 = (NLETrack) C13LP.LJJJLL(this.LIZ)) != null && (slots2 = nLETrack3.getSlots()) != null && slots2.size() == 1)) && (nLETrack2 = (NLETrack) C13LP.LJJJLL(this.LIZ)) != null && (slots = nLETrack2.getSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(slots)) != null && nLETrackSlot.getMainSegment() != null) {
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment());
                if (nLESegmentAudioDynamicCast != null && (aVFile = nLESegmentAudioDynamicCast.getAVFile()) != null) {
                    aVFile.getDuration();
                }
                if (nLETrackSlot.getStartTime() == 0) {
                    if (nLETrackSlot.getEndTime() == this.LJ || nLETrackSlot.getEndTime() == -2) {
                        this.LIZLLL = true;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    @Override // X.InterfaceC349110DmP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r10, com.bytedance.ies.nle.editor_jni.NLEModel r11, java.util.List<com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData> r12, int r13) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C565910MHl.LJI(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel, java.util.List, int):void");
    }
}
