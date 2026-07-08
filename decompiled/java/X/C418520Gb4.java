package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418520Gb4 extends C09AY implements Function0<PorterDuffXfermode> {
    public C418520Gb4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final PorterDuffXfermode invoke() {
        return new PorterDuffXfermode(PorterDuff.Mode.XOR);
    }
}
