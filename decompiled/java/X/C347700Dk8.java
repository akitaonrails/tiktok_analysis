package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dk8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347700Dk8 extends AbstractC348060Dki {
    public final C347660Dk4 LIZIZ;
    public final Integer LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, com.bytedance.ies.nle.editor_jni.NLETrackSlot] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Object] */
    @Override // X.AbstractC348060Dki
    public final void LIZJ(NLEEditor nLEEditor) {
        String uuid;
        NLETrack next;
        String uuid2;
        String uuid3;
        String uuid4;
        T next2;
        String str;
        ?? r1;
        C259800zU c259800zU = new C259800zU();
        Iterator<NLETrack> it2 = nLEEditor.getModel().getTracks().iterator();
        while (true) {
            uuid = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C348350DlB.LIZ(next), this.LIZIZ.LIZ.name())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLETrack nLETrack = next;
        if (nLETrack != null) {
            VecNLETrackSlotSPtr sortedSlots = nLETrack.getSortedSlots();
            Integer num = this.LIZJ;
            if (num != null && (r1 = (NLETrackSlot) C13LP.LJJJLZIJ(num.intValue(), sortedSlots)) != 0 && NLESegmentAudio.dynamicCast(r1.getMainSegment()) != null) {
                c259800zU.element = r1;
            }
            if (c259800zU.element == 0 && (str = this.LIZIZ.LIZJ) != null && str.length() != 0) {
                Iterator<NLETrackSlot> it3 = sortedSlots.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    ?? next3 = it3.next();
                    NLETrackSlot nLETrackSlot = (NLETrackSlot) next3;
                    if (Intrinsics.LJFF(nLETrackSlot.getUUID(), this.LIZIZ.LIZJ) && NLESegmentAudio.dynamicCast(nLETrackSlot.getMainSegment()) != null) {
                        if (next3 != 0) {
                            c259800zU.element = next3;
                        }
                    }
                }
            }
            if (c259800zU.element == 0) {
                Iterator<NLETrackSlot> it4 = sortedSlots.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (NLESegmentAudio.dynamicCast(((NLETrackSlot) next2).getMainSegment()) != null) {
                            break;
                        }
                    } else {
                        next2 = 0;
                        break;
                    }
                }
                c259800zU.element = next2;
            }
            nLETrack.setExtra("is_music_loop", String.valueOf(this.LIZIZ.LJIL));
        } else {
            nLETrack = null;
        }
        StringBuilder sb = new StringBuilder(" 1.find track ");
        if (nLETrack != null) {
            uuid2 = nLETrack.getUUID();
        } else {
            uuid2 = null;
        }
        sb.append(uuid2);
        sb.append(" slot ");
        NLENode nLENode = (NLENode) c259800zU.element;
        if (nLENode != null) {
            uuid3 = nLENode.getUUID();
        } else {
            uuid3 = null;
        }
        sb.append(uuid3);
        LJFF(sb.toString());
        NLETrackSlot nLETrackSlot2 = (NLETrackSlot) c259800zU.element;
        if (nLETrackSlot2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" 2.update ");
            if (nLETrack != null) {
                uuid4 = nLETrack.getUUID();
            } else {
                uuid4 = null;
            }
            sbLIZ.append(uuid4);
            sbLIZ.append(" slot ");
            NLENode nLENode2 = (NLENode) c259800zU.element;
            if (nLENode2 != null) {
                uuid = nLENode2.getUUID();
            }
            sbLIZ.append(uuid);
            sbLIZ.append(' ');
            LJFF(C2188811AlT.LIZIZ(sbLIZ));
            LJII(nLETrackSlot2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.ies.nle.editor_jni.NLETrackSlot r5) {
        /*
            r4 = this;
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r5.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentAudio r1 = com.bytedance.ies.nle.editor_jni.NLESegmentAudio.dynamicCast(r0)
            if (r1 == 0) goto L39
            X.0Dk4 r0 = r4.LIZIZ
            boolean r0 = r0.LJIJJLI
            if (r0 == 0) goto L91
            int r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentAudio_REPEAT_INFINITE_get()
        L14:
            r1.setRepeatCount(r0)
            com.bytedance.ies.nle.editor_jni.NLEResourceAV r2 = r1.getAVFile()
            if (r2 == 0) goto L39
            X.0Dk4 r0 = r4.LIZIZ
            X.0Dxc r0 = r0.LJJIFFI
            if (r0 == 0) goto L8e
            int[] r1 = X.C347710Dk9.LIZ
            int r0 = r0.ordinal()
            r1 = r1[r0]
            r0 = 1
            if (r1 == r0) goto L8b
            r0 = 2
            if (r1 == r0) goto L88
            r0 = 3
            if (r1 != r0) goto L8e
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.MUSIC_MV_AUDIO
        L36:
            r2.setResourceType(r0)
        L39:
            X.0Dk4 r0 = r4.LIZIZ
            java.lang.String r3 = r0.LJIJI
            if (r3 == 0) goto L70
            java.lang.String r0 = "d_bgmId"
            r5.setExtra(r0, r3)
            java.lang.String r0 = "music_id"
            r5.setExtra(r0, r3)
            boolean r0 = X.C1452960nug.LJIIIZ
            if (r0 == 0) goto L70
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r5.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r0 = r0.getResource()
            java.lang.String r2 = "biz_res_id"
            java.lang.String r0 = r0.getExtra(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto L70
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r5.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLEResourceNode r1 = r0.getResource()
            java.lang.String r0 = X.C0FGD.LIZIZ(r3)
            r1.setExtra(r2, r0)
        L70:
            X.0Dk4 r0 = r4.LIZIZ
            java.lang.String r1 = r0.LJIJJ
            if (r1 == 0) goto L7b
            java.lang.String r0 = "d_bgmName"
            r5.setExtra(r0, r1)
        L7b:
            X.0Dk0 r1 = new X.0Dk0
            X.0Dk4 r0 = r4.LIZIZ
            r1.<init>(r0)
            X.0Dk4 r0 = r4.LIZIZ
            X.C347620Dk0.LJII(r5, r0)
            return
        L88:
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.ALGORITHM_MV_AUDIO
            goto L36
        L8b:
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.NORMAL_MV_AUDIO
            goto L36
        L8e:
            com.bytedance.ies.nle.editor_jni.NLEResType r0 = com.bytedance.ies.nle.editor_jni.NLEResType.AUDIO
            goto L36
        L91:
            int r0 = com.bytedance.ies.nle.editor_jni.NLEEditorJniJNI.NLESegmentAudio_REPEAT_NORMAL_get()
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347700Dk8.LJII(com.bytedance.ies.nle.editor_jni.NLETrackSlot):void");
    }

    public C347700Dk8(C347660Dk4 c347660Dk4, Integer num) {
        this.LIZIZ = c347660Dk4;
        this.LIZJ = num;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(c347660Dk4);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
        if (c347660Dk4.LIZIZ != null) {
            if (c347660Dk4.LJIJI == null) {
                LJI(" 0.init MusicBgmParams expected has musicId");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("MusicBgmOperation.filePath can not be null");
    }
}
