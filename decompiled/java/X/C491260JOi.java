package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491260JOi extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ EnumC491250JOh LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491260JOi(EnumC491250JOh enumC491250JOh) {
        super(0);
        this.LL = enumC491250JOh;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(this.LL == EnumC491250JOh.CLICK);
    }
}
