package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0T3Z, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T3Z extends C09AY implements Function1<Aweme, Boolean> {
    public C0T3Z() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        return Boolean.valueOf(AwemeBizExtKt.isSubAweme(aweme));
    }
}
