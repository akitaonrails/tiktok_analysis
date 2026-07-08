package X;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: X.0Ece, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C368540Ece extends AbstractC368550Ecf<C367270Eab> {
    public final boolean LLILLL;
    public final C367270Eab LLILZ;

    @Override // X.AbstractC368550Ecf, X.InterfaceC368720Ecw
    public final boolean LIZ() {
        return false;
    }

    @Override // X.AbstractC368550Ecf, X.InterfaceC368720Ecw
    public final boolean LJ() {
        return this.LLILLL;
    }

    @Override // X.AbstractC368550Ecf
    public final /* bridge */ /* synthetic */ View LJIIIZ() {
        return this.LLILZ;
    }

    public C368540Ece(Context context) {
        super(context);
        this.LLILLL = true;
        this.LLILZ = new C367270Eab(context);
    }
}
