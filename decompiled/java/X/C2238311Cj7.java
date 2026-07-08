package X;

import X.C2197301AzA;
import X.C2238311Cj7;
import X.EnumC2238321Cj8;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS225S0000000_34;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS562S0100000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Cj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2238311Cj7 implements InterfaceC1186670gzB, InterfaceC2197321AzC {
    public final Fragment LIZ;
    public final AtomicReference<EnumC2238321Cj8> LIZIZ = new AtomicReference<>(EnumC2238321Cj8.LL);
    public final AtomicReference<Function0<Unit>> LIZJ = new AtomicReference<>(null);
    public boolean LIZLLL;

    @Override // X.InterfaceC1186670gzB
    public final void LIZIZ() {
        AFwS225S0000000_34.get$arr$(95).getClass();
        this.LIZIZ.set(EnumC2238321Cj8.LLILLL);
    }

    @Override // X.InterfaceC1186670gzB
    public final void LIZJ() {
        AFwS225S0000000_34.get$arr$(94).getClass();
        this.LIZIZ.set(EnumC2238321Cj8.LLILZ);
    }

    @Override // X.InterfaceC1186670gzB
    public final void LIZLLL() {
        AFwS225S0000000_34.get$arr$(96).getClass();
        this.LIZIZ.set(EnumC2238321Cj8.LLILLJJLI);
    }

    @Override // X.InterfaceC1186670gzB
    public final void LJ() {
        AFwS225S0000000_34.get$arr$(93).getClass();
        this.LIZIZ.set(EnumC2238321Cj8.LL);
        Function0<Unit> andSet = this.LIZJ.getAndSet(null);
        if (andSet != null) {
            andSet.invoke();
        }
    }

    @Override // X.InterfaceC2197341AzE
    public final EnumC2008307tp LJFF() {
        return EnumC2008307tp.BLOCKED_BY_SHEET;
    }

    public C2238311Cj7(Fragment fragment) {
        this.LIZ = fragment;
        fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.poi.detail.container.action.sheet.PoiOpenSheetActionManager$registerFragmentLifecycle$observer$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    C2238311Cj7 c2238311Cj7 = this.LL;
                    c2238311Cj7.getClass();
                    new AwS562S0100000_18(c2238311Cj7, 1066).invoke();
                    try {
                        if (c2238311Cj7.LIZLLL) {
                            C2197301AzA.LIZ.getClass();
                            C2197301AzA.LIZIZ.remove(c2238311Cj7);
                            c2238311Cj7.LIZLLL = false;
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        new AwS546S0100000_2(e, 744).invoke();
                    }
                    c2238311Cj7.LIZIZ.set(EnumC2238321Cj8.LL);
                }
            }
        });
    }

    @Override // X.InterfaceC2197321AzC
    public final boolean LIZ(Fragment fragment) {
        if (!Intrinsics.LJFF(fragment, this.LIZ)) {
            return false;
        }
        EnumC2238321Cj8 enumC2238321Cj8 = this.LIZIZ.get();
        if (enumC2238321Cj8 != null) {
            int i = C2238331Cj9.LIZ[enumC2238321Cj8.ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4) {
                    return false;
                }
            } else {
                return true;
            }
        }
        throw new C1954807lC();
    }

    @Override // X.InterfaceC2197321AzC
    public final void LJI(Function0<Unit> function0) {
        this.LIZJ.set(function0);
    }
}
