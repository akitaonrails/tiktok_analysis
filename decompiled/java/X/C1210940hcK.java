package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210940hcK extends C09AY implements Function1<Aweme, Boolean> {
    public C1210940hcK() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        if (aweme.getAwemeType() == 51) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
