package X;

import com.bytedance.ies.nle.editor_jni.NLEBranchListener;
import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0E9E, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9E {
    public final List<NLEEditorListener> LIZ;
    public NLEEditorListener LIZIZ;
    public NLEBranchListener LIZJ;

    public /* synthetic */ C0E9E() {
        this(new ArrayList(), null, null);
    }

    public C0E9E(List<NLEEditorListener> list, NLEEditorListener nLEEditorListener, NLEBranchListener nLEBranchListener) {
        this.LIZ = list;
        this.LIZIZ = nLEEditorListener;
        this.LIZJ = nLEBranchListener;
    }
}
