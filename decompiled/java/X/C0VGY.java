package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0VGY, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VGY implements InterfaceC794920VGg {
    public final C0VGX LIZ;
    public final C0VGW<?>[] LIZIZ;
    public final Object LIZJ;

    static {
        C0VI8.LIZIZ("WorkConstraintsTracker");
    }

    public final void LIZLLL() {
        synchronized (this.LIZJ) {
            try {
                for (C0VGW<?> c0vgw : this.LIZIZ) {
                    if (!((ArrayList) c0vgw.LIZ).isEmpty()) {
                        ((ArrayList) c0vgw.LIZ).clear();
                        c0vgw.LIZJ.LIZIZ(c0vgw);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LIZ(String str) {
        synchronized (this.LIZJ) {
            try {
                for (C0VGW<?> c0vgw : this.LIZIZ) {
                    Object obj = c0vgw.LIZIZ;
                    if (obj != null && c0vgw.LIZJ(obj) && ((ArrayList) c0vgw.LIZ).contains(str)) {
                        C0VI8 c0vi8LIZ = C0VI8.LIZ();
                        C786410Ut5.j4("Work %s constrained by %s", new Object[]{str, c0vgw.getClass().getSimpleName()});
                        c0vi8LIZ.getClass();
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(List<String> list) {
        synchronized (this.LIZJ) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String str : (ArrayList) list) {
                    if (LIZ(str)) {
                        C0VI8 c0vi8LIZ = C0VI8.LIZ();
                        C786410Ut5.j4("Constraints met for %s", new Object[]{str});
                        c0vi8LIZ.getClass();
                        arrayList.add(str);
                    }
                }
                C0VGX c0vgx = this.LIZ;
                if (c0vgx != null) {
                    c0vgx.LJ(arrayList);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZJ(Iterable<C0VIG> iterable) {
        synchronized (this.LIZJ) {
            try {
                for (C0VGW<?> c0vgw : this.LIZIZ) {
                    if (c0vgw.LIZLLL != null) {
                        c0vgw.LIZLLL = null;
                        c0vgw.LJ(null, c0vgw.LIZIZ);
                    }
                }
                for (C0VGW<?> c0vgw2 : this.LIZIZ) {
                    c0vgw2.LIZLLL(iterable);
                }
                for (C0VGW<?> c0vgw3 : this.LIZIZ) {
                    if (c0vgw3.LIZLLL != this) {
                        c0vgw3.LIZLLL = this;
                        c0vgw3.LJ(this, c0vgw3.LIZIZ);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C0VGY(Context context, final InterfaceC787600Uv0 interfaceC787600Uv0, C0VGX c0vgx) {
        final Context contextN3 = C786410Ut5.N3(context);
        this.LIZ = c0vgx;
        this.LIZIZ = new C0VGW[]{new C0VGW<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0VGZ
            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                return c0vig.LJIIIZ.LIZIZ;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZ);
            }
        }, new C0VGW<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0VGe
            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                return c0vig.LJIIIZ.LIZLLL;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZIZ);
            }
        }, new C0VGW<Boolean>(contextN3, interfaceC787600Uv0) { // from class: X.0VGf
            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                return c0vig.LJIIIZ.LJ;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(Boolean bool) {
                return !bool.booleanValue();
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZLLL);
            }
        }, new C0VGW<C789870Uyf>(contextN3, interfaceC787600Uv0) { // from class: X.0VGc
            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                if (c0vig.LJIIIZ.LIZ == EnumC794930VGh.CONNECTED) {
                    return true;
                }
                return false;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(C789870Uyf c789870Uyf) {
                C789870Uyf c789870Uyf2 = c789870Uyf;
                if (Build.VERSION.SDK_INT >= 26) {
                    if (!c789870Uyf2.LIZ || !c789870Uyf2.LIZIZ) {
                        return true;
                    }
                    return false;
                }
                return true ^ c789870Uyf2.LIZ;
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZJ);
            }
        }, new C0VGW<C789870Uyf>(contextN3, interfaceC787600Uv0) { // from class: X.0VGd
            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                EnumC794930VGh enumC794930VGh = c0vig.LJIIIZ.LIZ;
                if (enumC794930VGh != EnumC794930VGh.UNMETERED) {
                    if (Build.VERSION.SDK_INT >= 30 && enumC794930VGh == EnumC794930VGh.TEMPORARILY_UNMETERED) {
                        return true;
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(C789870Uyf c789870Uyf) {
                C789870Uyf c789870Uyf2 = c789870Uyf;
                if (c789870Uyf2.LIZ && !c789870Uyf2.LIZJ) {
                    return false;
                }
                return true;
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZJ);
            }
        }, new C0VGW<C789870Uyf>(contextN3, interfaceC787600Uv0) { // from class: X.0VGb
            static {
                C0VI8.LIZIZ("NetworkNotRoamingCtrlr");
            }

            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                if (c0vig.LJIIIZ.LIZ == EnumC794930VGh.NOT_ROAMING) {
                    return true;
                }
                return false;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(C789870Uyf c789870Uyf) {
                C789870Uyf c789870Uyf2 = c789870Uyf;
                if (Build.VERSION.SDK_INT < 24) {
                    C0VI8.LIZ().getClass();
                    return !c789870Uyf2.LIZ;
                }
                if (!c789870Uyf2.LIZ || !c789870Uyf2.LIZLLL) {
                    return true;
                }
                return false;
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZJ);
            }
        }, new C0VGW<C789870Uyf>(contextN3, interfaceC787600Uv0) { // from class: X.0VGa
            static {
                C0VI8.LIZIZ("NetworkMeteredCtrlr");
            }

            @Override // X.C0VGW
            public final boolean LIZIZ(C0VIG c0vig) {
                if (c0vig.LJIIIZ.LIZ == EnumC794930VGh.METERED) {
                    return true;
                }
                return false;
            }

            @Override // X.C0VGW
            public final boolean LIZJ(C789870Uyf c789870Uyf) {
                C789870Uyf c789870Uyf2 = c789870Uyf;
                if (Build.VERSION.SDK_INT < 26) {
                    C0VI8.LIZ().getClass();
                    return !c789870Uyf2.LIZ;
                }
                if (!c789870Uyf2.LIZ || !c789870Uyf2.LIZJ) {
                    return true;
                }
                return false;
            }

            {
                super(C789810UyZ.LIZ(contextN3, interfaceC787600Uv0).LIZJ);
            }
        }};
        this.LIZJ = new Object();
    }
}
