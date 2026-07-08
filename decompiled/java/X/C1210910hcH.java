package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0hcH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1210910hcH extends C09AY implements Function1<Aweme, Boolean> {
    public C1210910hcH() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Aweme aweme) {
        return Boolean.valueOf(AwemeBizExtKt.isSubAweme(aweme));
    }
}
