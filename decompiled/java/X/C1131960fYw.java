package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1131960fYw implements InterfaceC1137580fi0 {
    public final C1131940fYu LIZ;
    public final Function0<Unit> LIZIZ;
    public volatile boolean LIZJ;
    public boolean LIZLLL;

    @Override // X.InterfaceC1137580fi0
    public final void LIZ() {
        if (this.LIZLLL) {
            return;
        }
        this.LIZLLL = true;
        C1131940fYu c1131940fYu = this.LIZ;
        if (c1131940fYu.LIZIZ == EnumC1131980fYy.LLILLJJLI) {
            c1131940fYu.LIZIZ = EnumC1131980fYy.LLILLL;
            Object obj = c1131940fYu.LJFF;
            if (obj != null) {
                C0IK5.LIZLLL(obj);
            }
            C1131950fYv.LIZ.remove(Long.valueOf(c1131940fYu.LIZ));
        }
    }

    @Override // X.InterfaceC1137580fi0
    public final boolean LIZIZ() {
        return this.LIZJ;
    }

    public C1131960fYw(C1131940fYu c1131940fYu, Function0<Unit> function0) {
        this.LIZ = c1131940fYu;
        this.LIZIZ = function0;
    }
}
