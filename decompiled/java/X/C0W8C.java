package X;

import com.ss.android.ugc.aweme.experiment.ApmBodyHeaderAllowKeysModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W8C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8C extends C09AY implements Function0<Map<String, ? extends String>> {
    public C0W8C() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        return ((ApmBodyHeaderAllowKeysModel) C0W8A.LIZJ.getValue()).specInfo;
    }
}
