package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0B8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C283330B8p extends C09AY implements Function0<Boolean> {
    public C283330B8p() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        C01GW c01gw = C283320B8o.LIZ;
        boolean z = true;
        if (((Number) c01gw.getValue()).intValue() != 1 && ((Number) c01gw.getValue()).intValue() != 2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
