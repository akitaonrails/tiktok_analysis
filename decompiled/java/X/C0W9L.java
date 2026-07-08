package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W9L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9L extends C09AY implements Function0<Long> {
    public C0W9L() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        return Long.valueOf(CastLongProtector.parseLong(C0W9I.LIZIZ(C1BWL.LIZ()).LIZ("build_timestamp", CardStruct.IStatusCode.DEFAULT)));
    }
}
