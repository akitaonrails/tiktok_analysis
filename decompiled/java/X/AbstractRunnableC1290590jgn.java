package X;

import android.content.Context;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractRunnableC1290590jgn implements Runnable {
    public final WeakReference<InterfaceC1290690jgx> LL;
    public final WeakReference<InterfaceC1290680jgw> LLILLJJLI;
    public final WeakReference<Context> LLILLL;

    public AbstractRunnableC1290590jgn(InterfaceC1290690jgx interfaceC1290690jgx, InterfaceC1290680jgw interfaceC1290680jgw, Context context) {
        this.LL = new WeakReference<>(interfaceC1290690jgx);
        this.LLILLJJLI = new WeakReference<>(interfaceC1290680jgw);
        this.LLILLL = new WeakReference<>(context);
    }
}
