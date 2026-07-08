package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kBA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309420kBA extends C09AY implements Function0<Boolean> {
    public C1309420kBA() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Number number;
        Object obj = C1309360kB4.LIZ().get("key_limit_update_strategy");
        return Boolean.valueOf((obj instanceof Number) && (number = (Number) obj) != null && number.intValue() == 2);
    }
}
