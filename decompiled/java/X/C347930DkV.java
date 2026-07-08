package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentEmojiSticker;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347930DkV extends AbstractC348060Dki {
    public final C348460DlM LIZIZ;
    public final Boolean LIZJ;

    public /* synthetic */ C347930DkV(C348460DlM c348460DlM) {
        this(c348460DlM, Boolean.FALSE);
    }

    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 1.executeNLE ");
        sbLIZ.append(this.LIZIZ);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        NLETrack nLETrack = new NLETrack();
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrack.setExtraTrackType(NLETrackType.STICKER);
        boolean z = true;
        nLETrack.setEnable(true);
        nLETrack.setExtra("StickerTrackType", this.LIZIZ.LIZ.name());
        if (!Intrinsics.LJFF(this.LIZJ, Boolean.TRUE) || !C1452960nug.LJIIIIZZ) {
            z = false;
        }
        nLETrack.setExtra("follow_max", String.valueOf(z));
        NLESegmentEmojiSticker nLESegmentEmojiSticker = new NLESegmentEmojiSticker();
        nLESegmentEmojiSticker.setutf8Code(this.LIZIZ.LJIJJ);
        nLETrackSlot.setMainSegment(nLESegmentEmojiSticker);
        new C347970DkZ(this.LIZIZ).LJII(nLETrackSlot);
        this.LIZIZ.getClass();
        nLETrack.addSlot(nLETrackSlot);
        this.LIZIZ.getClass();
        nLEEditor.getModel().addTrack(nLETrack);
        this.LIZIZ.LIZIZ = nLETrackSlot.getUUID();
    }

    public C347930DkV(C348460DlM c348460DlM, Boolean bool) {
        this.LIZIZ = c348460DlM;
        this.LIZJ = bool;
    }
}
