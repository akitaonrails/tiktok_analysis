package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CDC, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CDC extends C09AY implements Function0<Boolean> {
    public C0CDC() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(C0CD2.LJFF().getInt("live_pre_init_strategy_sdk", 0) == 1);
    }
}
