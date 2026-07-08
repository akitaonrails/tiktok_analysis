package X;

import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Bxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C305220Bxo extends C09AY implements Function0<Boolean> {
    public C305220Bxo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf((C104100aN.LIZ().isNewUser() || C104100aN.LIZ().LJJII() || Build.VERSION.SDK_INT < 30 || C104100aN.LIZ().LJIIJJI()) ? false : true);
    }
}
