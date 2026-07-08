package X;

import java.util.Locale;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0W9u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818720W9u extends C09AY implements Function0<Locale> {
    public C818720W9u() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Locale invoke() {
        C0I0B.LJFF.LIZJ();
        return C894660Z7w.LIZ().getResources().getConfiguration().locale;
    }
}
