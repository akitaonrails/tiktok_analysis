package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0qFE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1542580qFE extends AbstractC1541670qDl<C1542590qFF> implements InterfaceC1541860qE4 {
    public final InterfaceC1541840qE2 LIZIZ(Context context) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "newContainer");
        if (abstractC1541670qDlLIZ instanceof AbstractC1542580qFE) {
            return ((AbstractC1542580qFE) abstractC1541670qDlLIZ).LIZIZ(context);
        }
        return getExtendable().LJFF(context);
    }

    public final C1ET2 LIZ(Context context, C1541530qDX c1541530qDX) {
        AbstractC1541670qDl abstractC1541670qDlLIZ = C1541660qDk.LIZ(getExtendableContext(), this, "createContainer");
        if (abstractC1541670qDlLIZ instanceof AbstractC1542580qFE) {
            return ((AbstractC1542580qFE) abstractC1541670qDlLIZ).LIZ(context, c1541530qDX);
        }
        return getExtendable().LJ(context, c1541530qDX);
    }
}
