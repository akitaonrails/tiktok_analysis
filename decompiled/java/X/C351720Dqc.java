package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLEVideoAnimation;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dqc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351720Dqc {
    public static final /* synthetic */ int LJII = 0;
    public final C19EG LIZ;
    public final NLEModel LIZIZ;
    public final NLEEditor LIZJ;
    public final INLEPlayer LIZLLL;
    public final InterfaceC351730Dqd LJ;
    public final C0E48 LJFF;
    public final boolean LJI;

    public final NLEEditor LIZIZ() {
        NLEEditor nLEEditorLJI;
        C0E48 c0e48 = this.LJFF;
        return (c0e48 == null || (nLEEditorLJI = c0e48.LLFII().LJI()) == null) ? this.LIZJ : nLEEditorLJI;
    }

    public static void LIZJ(NLETrackSlot nLETrackSlot, String str, C351740Dqe c351740Dqe) {
        NLEResourceNode effectSDKVideoAnimation;
        NLEVideoAnimation next;
        Iterator<NLEVideoAnimation> it2 = nLETrackSlot.getVideoAnims().iterator();
        while (true) {
            effectSDKVideoAnimation = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(C351220Dpo.LJIJ(next), str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        NLEVideoAnimation nLEVideoAnimation = next;
        if (nLEVideoAnimation != null && !TextUtils.isEmpty(c351740Dqe.LJFF)) {
            NLESegmentVideoAnimation segment = nLEVideoAnimation.getSegment();
            if (segment != null) {
                effectSDKVideoAnimation = segment.getEffectSDKVideoAnimation();
            }
            String str2 = c351740Dqe.LJFF;
            String str3 = c351740Dqe.LJII;
            if (effectSDKVideoAnimation != null) {
                effectSDKVideoAnimation.setExtra("biz_res_id", C0FGD.LIZ(str2, str3));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x03e7 A[PHI: r0 r10
      0x03e7: PHI (r0v1 com.bytedance.ies.nle.editor_jni.NLETrackSlot) = 
      (r0v0 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
      (r0v13 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
      (r0v15 com.bytedance.ies.nle.editor_jni.NLETrackSlot)
     binds: [B:201:0x03e1, B:22:0x004c, B:203:0x03e5] A[DONT_GENERATE, DONT_INLINE]
      0x03e7: PHI (r10v1 boolean) = (r10v0 boolean), (r10v31 boolean), (r10v32 boolean) binds: [B:201:0x03e1, B:22:0x004c, B:203:0x03e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ef A[PHI: r0
      0x03ef: PHI (r0v5 com.bytedance.ies.nle.editor_jni.NLETrackSlot) = (r0v3 com.bytedance.ies.nle.editor_jni.NLETrackSlot), (r0v6 com.bytedance.ies.nle.editor_jni.NLETrackSlot) binds: [B:56:0x00de, B:206:0x03ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Pair<com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLETrackSlot> LIZ(X.C351740Dqe r33, com.bytedance.ies.nle.editor_jni.NLETrackSlot r34, boolean r35, com.bytedance.ies.nle.editor_jni.NLEModel r36) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351720Dqc.LIZ(X.0Dqe, com.bytedance.ies.nle.editor_jni.NLETrackSlot, boolean, com.bytedance.ies.nle.editor_jni.NLEModel):kotlin.Pair");
    }

    public C351720Dqc(C19EG c19eg, NLEModel nLEModel, NLEEditor nLEEditor, INLEPlayer iNLEPlayer, InterfaceC351730Dqd interfaceC351730Dqd, C0E48 c0e48, boolean z) {
        this.LIZ = c19eg;
        this.LIZIZ = nLEModel;
        this.LIZJ = nLEEditor;
        this.LIZLLL = iNLEPlayer;
        this.LJ = interfaceC351730Dqd;
        this.LJFF = c0e48;
        this.LJI = z;
    }
}
