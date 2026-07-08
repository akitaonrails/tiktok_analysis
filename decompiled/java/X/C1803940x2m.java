package X;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: X.0x2m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1803940x2m implements InterfaceC1806470x6r {
    public final int LIZ;
    public final Object[] LIZIZ;

    @Override // X.InterfaceC1806470x6r
    public final CharSequence LIZIZ(Context context) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            return resources.getString(this.LIZ, this.LIZIZ);
        }
        return null;
    }

    public C1803940x2m(int i, Object... objArr) {
        this.LIZ = i;
        this.LIZIZ = objArr;
    }
}
