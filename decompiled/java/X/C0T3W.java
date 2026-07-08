package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T3W, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3W extends C09AY implements Function1<Aweme, Boolean> {
    public C0T3W() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        boolean z;
        if (AwemeBizExtKt.getSubAweme(aweme) != null) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
