package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.06KU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06KU extends C09AY implements Function1<String, Boolean> {
    public C06KU() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(String str) {
        boolean z = true;
        if (!C0I0B.LJFF.LIZ().LIZJ(str)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
