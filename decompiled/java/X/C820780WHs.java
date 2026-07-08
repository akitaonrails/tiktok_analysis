package X;

import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysExp;
import com.ss.android.ugc.aweme.experiment.ApplogAllowKeysModel;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820780WHs extends C09AY implements Function0<Map<String, ? extends String>> {
    public C820780WHs() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends String> invoke() {
        return ((ApplogAllowKeysModel) ApplogAllowKeysExp.LJFF.getValue()).auditMeta;
    }
}
