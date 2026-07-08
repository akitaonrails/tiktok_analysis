package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.17oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21143217oc implements Function1<C21143617og, Boolean> {
    public final Context LL;
    public final InterfaceC21139217ny LLILLJJLI;
    public final boolean LLILLL;

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(C21143617og c21143617og) {
        boolean z;
        Integer orientation;
        C21143617og c21143617og2 = c21143617og;
        if (this.LLILLL && (orientation = this.LLILLJJLI.getOrientation()) != null) {
            if (orientation.intValue() != c21143617og2.LJFF) {
                return Boolean.FALSE;
            }
        }
        Activity activityLIZ = C21145417oy.LIZ(this.LL);
        if (activityLIZ != null) {
            if (!c21143617og2.LJII) {
                return Boolean.TRUE;
            }
            if (activityLIZ.hashCode() == c21143617og2.LJI) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return Boolean.FALSE;
    }

    public C21143217oc(Context context, C21143417oe c21143417oe, boolean z) {
        this.LL = context;
        this.LLILLJJLI = c21143417oe;
        this.LLILLL = z;
    }
}
