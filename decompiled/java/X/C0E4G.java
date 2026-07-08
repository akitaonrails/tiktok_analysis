package X;

import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* JADX INFO: renamed from: X.0E4G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E4G {
    public final C0E48 LIZ;
    public final C0EEW LIZIZ;
    public Effect LIZJ;

    public final void LIZ() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        InterfaceC351350Dq1 interfaceC351350Dq1LLFII;
        Map<NLEHSLColorType, C351400Dq6> mapLJLZ;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null) {
            this.LIZIZ.LLLII(C2097608Jq.LJ());
            return;
        }
        C0E48 c0e482 = this.LIZ;
        if (c0e482 == null || (interfaceC351350Dq1LLFII = c0e482.LLFII()) == null || (mapLJLZ = interfaceC351350Dq1LLFII.LJLZ(nLETrackSlotLLLLLLIL)) == null) {
            return;
        }
        this.LIZIZ.LLLII(mapLJLZ);
    }

    public C0E4G(C0E48 c0e48, C0EEW c0eew) {
        this.LIZ = c0e48;
        this.LIZIZ = c0eew;
    }
}
