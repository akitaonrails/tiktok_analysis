package X;

import com.ss.android.ugc.aweme.relation.auth.frequency.EmailFrequencyService;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IEmailFrequencyService;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1E7n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276211E7n extends C09AY implements Function0<IEmailFrequencyService> {
    public C2276211E7n() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final IEmailFrequencyService invoke() {
        return EmailFrequencyService.LJ();
    }
}
