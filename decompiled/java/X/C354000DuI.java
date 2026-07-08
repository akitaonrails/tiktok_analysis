package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0DuI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C354000DuI extends NLEEditorListener {
    public void LIZ() {
        throw null;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
    public final void onChanged() {
        try {
            LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
