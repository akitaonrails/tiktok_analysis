package X;

import X.InterfaceC594520NTm;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0PHI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public abstract class C0PHI<T extends InterfaceC594520NTm> {
    public final C642240PHa LIZ;

    public boolean LIZ() {
        return false;
    }

    public List<Aweme> LIZIZ(T t, C0PHT c0pht) {
        return null;
    }

    public abstract C0PHM LIZLLL();

    public C0PBX<T> LJ() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0PHI() {
        boolean z = true;
        this.LIZ = new C642240PHa(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 0 == true ? 1 : 0, 15380);
    }

    public C642240PHa LJFF() {
        return this.LIZ;
    }

    public final List<Aweme> LIZJ(InterfaceC594520NTm interfaceC594520NTm, C0PHT c0pht) {
        Object c098200Yq;
        C0PFN c0pfn;
        InterfaceC594520NTm interfaceC594520NTmLIZ;
        Object obj = null;
        try {
            if (interfaceC594520NTm instanceof C0PFN) {
                c0pfn = (C0PFN) interfaceC594520NTm;
            } else {
                c0pfn = null;
            }
            if (c0pfn != null && (interfaceC594520NTmLIZ = c0pfn.LIZ()) != null) {
                interfaceC594520NTm = interfaceC594520NTmLIZ;
            }
            c098200Yq = LIZIZ(interfaceC594520NTm, c0pht);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (List) obj;
    }
}
