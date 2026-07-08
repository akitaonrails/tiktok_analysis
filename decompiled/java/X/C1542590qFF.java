package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0qFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1542590qFF extends C1542540qFA {
    @Override // X.C1542540qFA
    public final InterfaceC1541840qE2 LIZLLL(Context context) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "newContainer");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC1542580qFE) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            InterfaceC1541840qE2 interfaceC1541840qE2LIZIZ = ((AbstractC1542580qFE) abstractC1541670qDlLIZIZ).LIZIZ(context);
            c1542630qFJ.get().LIZ();
            return interfaceC1541840qE2LIZIZ;
        }
        return super.LIZLLL(context);
    }

    public final C1ET2 LJFF(Context context) {
        return (C1ET2) super.LIZLLL(context);
    }

    @Override // X.C1542540qFA
    public final C1ET2 LIZ(Context context, C1541530qDX c1541530qDX) {
        AbstractC1541670qDl abstractC1541670qDlLIZIZ = C1541660qDk.LIZIZ(getExtendableContext(), "createContainer");
        if (abstractC1541670qDlLIZIZ instanceof AbstractC1542580qFE) {
            C1542630qFJ c1542630qFJ = C1542620qFI.LIZIZ;
            c1542630qFJ.get().LIZIZ();
            C1ET2 c1et2LIZ = ((AbstractC1542580qFE) abstractC1541670qDlLIZIZ).LIZ(context, c1541530qDX);
            c1542630qFJ.get().LIZ();
            return c1et2LIZ;
        }
        return super.LIZ(context, c1541530qDX);
    }

    public final C1ET2 LJ(Context context, C1541530qDX c1541530qDX) {
        return super.LIZ(context, c1541530qDX);
    }
}
