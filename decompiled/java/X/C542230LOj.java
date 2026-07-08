package X;

import android.app.Activity;
import android.content.Context;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C542230LOj {
    public final Context LIZ;
    public final String LIZIZ;
    public final Function2<String, String, InterfaceC542330LOt> LIZJ;

    public final Activity LIZ() {
        return C0FNT.LIZ(this.LIZ);
    }

    public final InterfaceC542330LOt LIZIZ(String str) {
        return this.LIZJ.invoke(this.LIZIZ, str);
    }

    public C542230LOj(Context context, String str, C0LOP c0lop) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = c0lop;
    }
}
