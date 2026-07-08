package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0527, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0527 extends C09AY implements Function0<String> {
    public AnonymousClass0527() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        try {
            return C0CP7.LIZ.LIZLLL("click_comment_button_label");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "-1";
        }
    }
}
