package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1BYx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206891BYx implements InterfaceC2433109g9 {
    public final C1BZ8 LIZ;

    public C2206891BYx(C1BZ8 c1bz8) {
        this.LIZ = c1bz8;
    }

    @Override // X.InterfaceC2433109g9
    public final Object zza() {
        Context context = this.LIZ.LIZ;
        if (context != null) {
            return context;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
