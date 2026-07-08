package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEPlayerState;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0DkD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C347750DkD extends AbstractC348060Dki {
    public final List<C347660Dk4> LIZIZ;
    public NLEPlayerState LIZJ;

    public C347750DkD(List<C347660Dk4> list) {
        this.LIZIZ = list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" 0.init ");
        sbLIZ.append(list);
        LJFF(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.AbstractC348060Dki
    public final void LIZ(INLEMediaSession iNLEMediaSession) {
        iNLEMediaSession.getPlayerApi().prepare();
        if (this.LIZJ == NLEPlayerState.STARTED) {
            iNLEMediaSession.getPlayerApi().play();
        }
    }

    @Override // X.AbstractC348060Dki
    public final void LIZIZ(INLEMediaSession iNLEMediaSession) {
        NLEPlayerState nLEPlayerStateState = iNLEMediaSession.getPlayerApi().state();
        this.LIZJ = nLEPlayerStateState;
        if (nLEPlayerStateState == NLEPlayerState.STARTED) {
            iNLEMediaSession.getPlayerApi().pause();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    @Override // X.AbstractC348060Dki
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor r9) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347750DkD.LIZJ(com.bytedance.ies.nle.editor_jni.NLEEditor):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C347750DkD(C347660Dk4 c347660Dk4) {
        List listSingletonList;
        if (c347660Dk4 != null) {
            listSingletonList = Collections.singletonList(c347660Dk4);
        } else {
            listSingletonList = null;
        }
        this((List<C347660Dk4>) listSingletonList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (r3 == null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r4 = r8.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        if (r4.hasNext() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
    
        r3 = r4.next();
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r2.getLayer() != (r8.size() - 1)) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r2.getSlots().isEmpty() == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        r5 = r5;
        r0 = r10.getModel();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        r0.removeTrack(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLEEditor r10, com.bytedance.ies.nle.editor_jni.NLETrack r11) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347750DkD.LJIIIIZZ(com.bytedance.ies.nle.editor_jni.NLEEditor, com.bytedance.ies.nle.editor_jni.NLETrack):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.bytedance.ies.nle.editor_jni.NLEEditor r16, java.util.List<X.C347660Dk4> r17) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C347750DkD.LJII(com.bytedance.ies.nle.editor_jni.NLEEditor, java.util.List):void");
    }
}
