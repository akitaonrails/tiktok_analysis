package X;

import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.commonalbum.viewmodel.LocalServiceAlbumVM;
import java.lang.ref.WeakReference;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.14VJ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14VJ implements InterfaceC20274014Uo, InterfaceC342470Dbh {
    public final Function1<C2306531FQd, Unit> LL;
    public final Function2<Integer, String, Unit> LLILLJJLI;
    public C14VI LLILLL;
    public LocalServiceAlbumVM LLILZ;
    public Function0<Unit> LLILZIL;

    @Override // X.InterfaceC20274014Uo
    public final void LIZ(int i, String str) {
        Function2<Integer, String, Unit> function2 = this.LLILLJJLI;
        if (function2 != null) {
            function2.invoke(Integer.valueOf(i), str);
        }
    }

    public C14VJ(WeakReference weakReference, AwS609S0100000_30 awS609S0100000_30, AwS644S0100000_30 awS644S0100000_30) {
        this.LL = awS609S0100000_30;
        this.LLILLJJLI = awS644S0100000_30;
    }

    @Override // X.InterfaceC342470Dbh
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Object c098200Yq;
        if (i == 1) {
            C14VI c14vi = this.LLILLL;
            if (c14vi != null) {
                LocalServiceAlbumVM localServiceAlbumVM = this.LLILZ;
                Function0<Unit> function0 = this.LLILZIL;
                if (i2 == 0) {
                    c14vi.LIZIZ.LIZ(2, "User cancel");
                } else {
                    if (c14vi.LJIIIZ == 0 && c14vi.LJII) {
                        c14vi.LJIIIZ = 1;
                    }
                    if (i2 == -1) {
                        String strValueOf = c14vi.LJ;
                        if (strValueOf == null) {
                            strValueOf = String.valueOf(c14vi.LIZLLL);
                        }
                        if (C123100dR.LIZ(strValueOf) && strValueOf != null) {
                            try {
                                c098200Yq = UriProtector.parse(strValueOf);
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null && localServiceAlbumVM != null) {
                                localServiceAlbumVM.AQ2(c14vi.LIZ.get(), Collections.singletonList(c098200Yq), "camera", function0);
                                return true;
                            }
                        }
                    }
                }
            }
            return true;
        }
        LIZ(1, "Unrecognized request code");
        return true;
    }
}
