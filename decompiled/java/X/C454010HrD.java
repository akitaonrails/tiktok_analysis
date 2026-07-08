package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0HrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C454010HrD {
    public final InterfaceC449850HkV LIZ;
    public final EnumC454490Hrz LIZIZ;
    public final Rect LIZJ;
    public final Boolean LIZLLL;
    public final String LJ;

    public C454010HrD(InterfaceC449850HkV interfaceC449850HkV, EnumC454490Hrz enumC454490Hrz, Rect rect, String str, int i) {
        Boolean bool;
        rect = (i & 4) != 0 ? null : rect;
        if ((i & 8) != 0) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        str = (i & 16) != 0 ? null : str;
        this.LIZ = interfaceC449850HkV;
        this.LIZIZ = enumC454490Hrz;
        this.LIZJ = rect;
        this.LIZLLL = bool;
        this.LJ = str;
    }
}
