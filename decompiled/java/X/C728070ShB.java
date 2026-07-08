package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ShB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728070ShB<T> {
    public final Function0<T> LIZ;
    public volatile Pair<String, ? extends T> LIZIZ;

    public final T LIZ() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        Pair<String, ? extends T> pair = this.LIZIZ;
        if (pair != null && Intrinsics.LJFF(pair.getFirst(), curUserId)) {
            return pair.getSecond();
        }
        T tInvoke = this.LIZ.invoke();
        this.LIZIZ = new Pair<>(curUserId, tInvoke);
        return tInvoke;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C728070ShB(Function0<? extends T> function0, Function1<? super InterfaceC304970BxP, Unit> function1) {
        this.LIZ = function0;
        try {
            function1.invoke(new InterfaceC304970BxP(this) { // from class: X.0ShC
                public final /* synthetic */ C728070ShB<T> LL;

                {
                    this.LL = this;
                }

                @Override // X.InterfaceC304970BxP
                public final void LIZ() {
                    String curUserId = C0XQ7.LJFF().getCurUserId();
                    if (curUserId == null) {
                        curUserId = "";
                    }
                    Object objInvoke = this.LL.LIZ.invoke();
                    this.LL.LIZIZ = new Pair<>(curUserId, objInvoke);
                }
            });
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
