package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0Mfb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574210Mfb implements InterfaceC574250Mff {
    public final List<InterfaceC574240Mfe> LIZ = new ArrayList();

    @Override // X.InterfaceC574250Mff
    public final C348390DlF LIZ(NLEEditor nLEEditor, InterfaceC574340Mfo interfaceC574340Mfo) {
        InterfaceC574240Mfe next;
        C348390DlF c348390DlFLIZ;
        Iterator<InterfaceC574240Mfe> it2 = this.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZIZ(interfaceC574340Mfo) != null) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        InterfaceC574240Mfe interfaceC574240Mfe = next;
        if (interfaceC574240Mfe != null && (c348390DlFLIZ = interfaceC574240Mfe.LIZ(nLEEditor, interfaceC574340Mfo)) != null) {
            return c348390DlFLIZ;
        }
        return new InterfaceC574240Mfe() { // from class: X.0Mfa
            @Override // X.InterfaceC574240Mfe
            public final AbstractC574600MgE LIZIZ(InterfaceC574340Mfo interfaceC574340Mfo2) {
                String[] videoPaths = interfaceC574340Mfo2.getVideoPaths();
                if (videoPaths == null) {
                    videoPaths = new String[0];
                }
                C1DOU c1dou = new C1DOU(videoPaths);
                c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                c1dou.LJ = interfaceC574340Mfo2.getAudioPaths();
                return c1dou;
            }

            @Override // X.InterfaceC574240Mfe
            public final C348390DlF LIZ(NLEEditor nLEEditor2, InterfaceC574340Mfo interfaceC574340Mfo2) {
                C1DOU c1dou = new C1DOU(interfaceC574340Mfo2.getVideoPaths());
                c1dou.LJIIJ = EnumC1464490oDH.VIDEO_OUT_RATIO_ORIGINAL;
                c1dou.LJ = interfaceC574340Mfo2.getAudioPaths();
                c1dou.LJFF = interfaceC574340Mfo2.getUseAudioInVideo();
                return C574130MfT.LIZ(c1dou, nLEEditor2);
            }
        }.LIZ(nLEEditor, interfaceC574340Mfo);
    }
}
