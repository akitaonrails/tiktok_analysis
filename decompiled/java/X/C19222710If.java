package X;

import android.text.SpannableString;
import com.ss.android.ugc.aweme.compliance.IContentClassificationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10If, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19222710If {
    public static final /* synthetic */ C19222710If LIZ = new C19222710If();

    public static IContentClassificationService LIZ() {
        IContentClassificationService iContentClassificationService = (IContentClassificationService) PluggableExtentionKt.pluggableSpi$default(IContentClassificationService.class, false, false, false, 14, null);
        return iContentClassificationService == null ? new IContentClassificationService() { // from class: X.10Ig
            @Override // com.ss.android.ugc.aweme.compliance.IContentClassificationService
            public final Pair LIZIZ(C19EG c19eg, boolean z) {
                return new Pair("", new SpannableString(""));
            }

            @Override // com.ss.android.ugc.aweme.compliance.IContentClassificationService
            public final void LIZ(C19EG c19eg, Map map, Function0 function0) {
                function0.invoke();
            }
        } : iContentClassificationService;
    }
}
