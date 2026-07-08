package X;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.18L3, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18L3 {
    public final C0J47 LIZ;
    public final Handler LIZIZ;
    public final C18L2 LIZJ;

    public C18L3(Context context) {
        Handler.Callback callback = new Handler.Callback() { // from class: X.18L4
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                C18L5 c18l5 = (C18L5) message.obj;
                if (c18l5.LIZLLL == null) {
                    c18l5.LIZLLL = C786410Ut5.Td(this.LL.LIZ, c18l5.LIZJ, c18l5.LIZIZ, false);
                }
                c18l5.LJ.onInflateFinished(c18l5.LIZLLL, c18l5.LIZJ, c18l5.LIZIZ);
                C18L2 c18l2 = this.LL.LIZJ;
                c18l2.getClass();
                c18l5.LJ = null;
                c18l5.LIZ = null;
                c18l5.LIZIZ = null;
                c18l5.LIZJ = 0;
                c18l5.LIZLLL = null;
                c18l2.LLILLJJLI.LIZ(c18l5);
                return true;
            }
        };
        this.LIZ = new C0J47(context);
        this.LIZIZ = new Handler(callback);
        this.LIZJ = C18L2.LLILLL;
    }

    public final void LIZ(int i, ViewGroup viewGroup, InterfaceC487670JAn interfaceC487670JAn) {
        C18L5 c18l5LIZIZ = this.LIZJ.LLILLJJLI.LIZIZ();
        if (c18l5LIZIZ == null) {
            c18l5LIZIZ = new C18L5();
        }
        c18l5LIZIZ.LIZ = this;
        c18l5LIZIZ.LIZJ = i;
        c18l5LIZIZ.LIZIZ = viewGroup;
        c18l5LIZIZ.LJ = interfaceC487670JAn;
        C18L2 c18l2 = this.LIZJ;
        c18l2.getClass();
        try {
            c18l2.LL.put(c18l5LIZIZ);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Failed to enqueue async inflate request", e);
        }
    }
}
