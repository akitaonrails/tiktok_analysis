package X;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q94, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1538760q94 extends C09AY implements Function0<SharedPreferences> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1538760q94(Context context) {
        super(0);
        this.LL = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        return C810670Vr7.LIZJ(this.LL, 0, "spark");
    }
}
