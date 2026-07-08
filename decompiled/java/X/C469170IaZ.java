package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveDedupOptExp;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0IaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469170IaZ extends C09AY implements Function0<Integer> {
    public C469170IaZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(LiveDedupOptExp.INSTANCE.consumeRecordSize());
    }
}
