package X;

import android.content.ComponentName;
import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0W04, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W04 extends C0W50 {
    public static final /* synthetic */ int LLIZ = 0;
    public C0W59 LL;
    public C817470W4z LLILLJJLI;
    public WeakReference<C0W05> LLILLL;
    public String LLILZ;
    public boolean LLILZIL;
    public WeakReference<Context> LLILZLL;

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C0W05 c0w05;
        this.LLILLJJLI = null;
        this.LL = null;
        WeakReference<C0W05> weakReference = this.LLILLL;
        if (weakReference != null && (c0w05 = weakReference.get()) != null) {
            c0w05.LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ(android.content.Context r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W04.LIZ(android.content.Context, java.lang.String):java.lang.String");
    }

    @Override // X.C0W50
    public final void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z) {
        C0W05 c0w05;
        this.LLILLJJLI = c817470W4z;
        if (c817470W4z != null) {
            c817470W4z.LIZLLL();
        }
        WeakReference<C0W05> weakReference = this.LLILLL;
        if (weakReference != null && (c0w05 = weakReference.get()) != null) {
            c0w05.LIZIZ();
        }
    }
}
