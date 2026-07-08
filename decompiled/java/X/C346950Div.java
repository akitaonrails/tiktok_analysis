package X;

import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Div, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346950Div {
    public static final C346950Div LIZ = new C346950Div();

    public static int LIZ(String str) {
        Object c098200Yq;
        int size;
        int length;
        VecNLETrackSlotSPtr slots;
        NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
        try {
            try {
                nLEEditorLIZ.restore(str);
                NLEModel model = nLEEditorLIZ.getModel();
                if (model == null) {
                    length = str.length();
                } else {
                    int length2 = str.length();
                    if (C357540E0a.LJIJI(model)) {
                        length2 += 1000000;
                    }
                    int size2 = length2 + (model.getTracks().size() * 10000);
                    NLETrack mainTrack = model.getMainTrack();
                    if (mainTrack != null && (slots = mainTrack.getSlots()) != null) {
                        size = slots.size();
                    } else {
                        size = 0;
                    }
                    length = size + size2;
                }
                c098200Yq = Integer.valueOf(length);
                C189200o6.m2constructorimpl(c098200Yq);
            } finally {
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = Integer.valueOf(str.length());
            }
            int iIntValue = ((Number) c098200Yq).intValue();
            nLEEditorLIZ.delete();
            return iIntValue;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            nLEEditorLIZ.delete();
        }
    }
}
