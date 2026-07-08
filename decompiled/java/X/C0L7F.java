package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;

/* JADX INFO: renamed from: X.0L7F, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L7F {
    public final String LIZ;
    public final float LIZIZ;
    public final NLETemplateModel LIZJ;
    public final NLEModel LIZLLL;

    public C0L7F() {
        this(null, 0.0f, null, 15);
    }

    public C0L7F(String str, float f, NLETemplateModel nLETemplateModel, int i) {
        str = (i & 1) != 0 ? null : str;
        f = (i & 2) != 0 ? 0.0f : f;
        nLETemplateModel = (i & 4) != 0 ? null : nLETemplateModel;
        this.LIZ = str;
        this.LIZIZ = f;
        this.LIZJ = nLETemplateModel;
        this.LIZLLL = null;
    }
}
