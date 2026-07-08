package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CancelApplyResult;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0bGR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966730bGR extends C09AY implements Function2<String, C965950bFB, CancelApplyResult> {
    public C966730bGR() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final CancelApplyResult invoke(String str, C965950bFB c965950bFB) {
        C1AZW.LJIIJ(12, C494940Jb2.LIZ(), "apply success.", null, null);
        return new CancelApplyResult(null, str);
    }
}
