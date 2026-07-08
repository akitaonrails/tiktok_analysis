package X;

import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14Vy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC20277614Vy implements InterfaceC342470Dbh, InterfaceC20276114Vj {
    public final WeakReference<Context> LL;
    public InterfaceC20277514Vx LLILLL;
    public short[] LLILZ;
    public boolean LLILZIL = true;
    public final C20277714Vz LLILLJJLI = new C20277714Vz();

    public AbstractC20277614Vy(WeakReference<Context> weakReference) {
        this.LL = weakReference;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(final org.json.JSONObject r23) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC20277614Vy.LIZLLL(org.json.JSONObject):void");
    }

    @Override // X.InterfaceC342470Dbh
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        InterfaceC20277514Vx interfaceC20277514Vx;
        if ((i != 1 && i != 600 && i != 700 && i != 800 && i != 900 && i != 10003) || (interfaceC20277514Vx = this.LLILLL) == null) {
            LIZ(0, "uploadFailed");
            return true;
        }
        return interfaceC20277514Vx.onActivityResult(i, i2, intent);
    }
}
