package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.ss.android.account.TTAccountInit;

/* JADX INFO: renamed from: X.0XMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C847490XMl implements InterfaceC847750XNl {
    public static volatile C847490XMl LIZJ;
    public final Context LIZ;
    public SharedPreferences LIZIZ;

    public C847490XMl(Context context) {
        if (TTAccountInit.LIZIZ == null) {
            this.LIZ = C786410Ut5.N3(context);
        } else {
            this.LIZ = C848000XOk.LIZ();
        }
    }
}
