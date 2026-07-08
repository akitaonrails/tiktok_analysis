package X;

import Y.AObserverS209S0100000_5;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0E9w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C360100E9w {
    public final Activity LIZ;
    public final C19A3 LIZIZ;
    public final C372830EjZ LIZJ;
    public final C360040E9q LIZLLL;
    public final InterfaceC359950E9h LJ;
    public final C0EAY LJFF;
    public final InterfaceC497601wk LJI;
    public final Function0<C0E48> LJII;
    public final InterfaceC360130E9z LJIIIIZZ;
    public long LJIIIZ = -1;

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(final boolean r21) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360100E9w.LIZ(boolean):void");
    }

    public final void LIZJ(LifecycleOwner lifecycleOwner) {
        C360040E9q c360040E9q = this.LIZLLL;
        if (c360040E9q != null && c360040E9q.LLJ) {
            this.LJFF.LIZ();
            if (C2273411Dyd.LIZ()) {
                return;
            }
            LIZ(true);
            return;
        }
        this.LJ.QO0().observe(lifecycleOwner, new AObserverS209S0100000_5(this, 185));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0117  */
    /* JADX WARN: Type inference failed for: r0v33, types: [X.0E9x] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final boolean r12, com.bytedance.ies.nle.editor_jni.NLETrackSlot r13, android.graphics.Bitmap r14) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C360100E9w.LIZIZ(boolean, com.bytedance.ies.nle.editor_jni.NLETrackSlot, android.graphics.Bitmap):void");
    }

    public C360100E9w(Activity activity, C19A3 c19a3, C372830EjZ c372830EjZ, C360040E9q c360040E9q, InterfaceC359950E9h interfaceC359950E9h, C0EAY c0eay, C0EAX c0eax, AwS549S0100000_5 awS549S0100000_5, C0EAD c0ead) {
        this.LIZ = activity;
        this.LIZIZ = c19a3;
        this.LIZJ = c372830EjZ;
        this.LIZLLL = c360040E9q;
        this.LJ = interfaceC359950E9h;
        this.LJFF = c0eay;
        this.LJI = c0eax;
        this.LJII = awS549S0100000_5;
        this.LJIIIIZZ = c0ead;
    }
}
