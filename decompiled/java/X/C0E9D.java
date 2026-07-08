package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E9D, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E9D {
    public final C0E9E LIZ;
    public final Function1<NLEEditorListener, Boolean> LIZIZ;

    public final boolean LIZ(NLEEditorListener nLEEditorListener) {
        if (this.LIZIZ.invoke(nLEEditorListener).booleanValue()) {
            return false;
        }
        this.LIZ.LIZ.add(nLEEditorListener);
        return true;
    }

    public final boolean LIZIZ(NLEEditorListener nLEEditorListener) {
        if (this.LIZIZ.invoke(nLEEditorListener).booleanValue()) {
            return false;
        }
        this.LIZ.LIZ.remove(nLEEditorListener);
        return true;
    }

    public C0E9D(C0E9E c0e9e, AwS584S0100000_5 awS584S0100000_5) {
        this.LIZ = c0e9e;
        this.LIZIZ = awS584S0100000_5;
    }
}
