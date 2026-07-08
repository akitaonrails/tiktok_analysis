package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fxH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147050fxH extends C09AY implements Function1<Gift, Long> {
    public C1147050fxH() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Gift gift) {
        return Long.valueOf(gift.id);
    }
}
