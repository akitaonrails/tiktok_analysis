package X;

import com.bytedance.ies.nle.editor_jni.NLEEditorListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0LDS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LDS extends NLEEditorListener {
    public final Function0<Unit> LIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLEEditorListener
    public final void onChanged() {
        C354270Duj.LIZJ(0L, new AwS552S0100000_8(this, 688));
    }

    public C0LDS(AwS549S0100000_5 awS549S0100000_5) {
        this.LIZ = awS549S0100000_5;
    }
}
