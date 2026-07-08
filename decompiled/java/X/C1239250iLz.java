package X;

import Y.AfS149S0200000_13;
import Y.AfS182S0100000_13;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.account.login.v2.base.MaybeBindLifeCycleTransformer;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0iLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1239250iLz {
    public static final C11KZ LIZ(final String str, final Map map) {
        return AbstractC19483511Kn.LJ(new InterfaceC1254030ijp() { // from class: X.0XXQ
            public final /* synthetic */ boolean LIZ = false;

            @Override // X.InterfaceC1254030ijp
            public final void LIZ(final C11KY c11ky) {
                AbstractC846040XGw<C846060XGy> abstractC846040XGw = new AbstractC846040XGw<C846060XGy>() { // from class: X.0XXP
                    @Override // X.AbstractC846040XGw
                    public final void LIZ(C0XGA c0xga) {
                        C846060XGy c846060XGy = (C846060XGy) c0xga;
                        if (c846060XGy.LIZIZ) {
                            ((C11KY) c11ky).onSuccess(c846060XGy);
                            return;
                        }
                        ((C11KY) c11ky).onError(new C0XZJ(c846060XGy.LJ, null, EnumC852660Xce.NONE, EnumC852910Xd3.NONE, c846060XGy.LJIILJJIL, ""));
                    }
                };
                if (this.LIZ) {
                    ((C0XH0) C0XH0.LIZLLL()).LIZ(str, map, abstractC846040XGw);
                } else {
                    ((C0XH0) C0XH0.LIZLLL()).LIZIZ(str, map, abstractC846040XGw);
                }
            }
        });
    }

    public static final C11JS LIZIZ(final Fragment fragment, final C0XYD c0xyd, AbstractC19483511Kn abstractC19483511Kn) {
        final C013C c013c = new C013C();
        C19483611Ko c19483611KoLJIJJ = abstractC19483511Kn.LJIJJ(C1701940uOG.LIZIZ());
        Lifecycle lifecycle = fragment.getLifecycle();
        MaybeBindLifeCycleTransformer maybeBindLifeCycleTransformer = new MaybeBindLifeCycleTransformer();
        lifecycle.addObserver(maybeBindLifeCycleTransformer);
        C11JS c11jsLJI = new C19482811Kg(((AbstractC19483511Kn) maybeBindLifeCycleTransformer.LIZ(c19483611KoLJIJJ)).LJIIIIZZ(new AfS149S0200000_13(c013c, c0xyd, 4)), new InterfaceC19483011Ki() { // from class: X.0XZK
            @Override // X.InterfaceC19483011Ki
            public final boolean test(Object obj) {
                Throwable th = (Throwable) obj;
                c0xyd.dk(0);
                c013c.element = true;
                if (th instanceof C0XZJ) {
                    C0XYO c0xyo = C0XYO.LIZ;
                    Fragment fragment2 = fragment;
                    C0XYD c0xyd2 = c0xyd;
                    int errorCode = ((C0XZJ) th).getErrorCode();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    C0XZJ c0xzj = (C0XZJ) th;
                    EnumC852660Xce scene = c0xzj.getScene();
                    EnumC852910Xd3 step = c0xzj.getStep();
                    JSONObject extra = c0xzj.getExtra();
                    c0xyo.getClass();
                    C0XYO.LIZIZ(errorCode, fragment2, scene, step, c0xyd2, message, extra);
                }
                return true;
            }
        }).LJI(new InterfaceC781210Ukh() { // from class: X.0iM0
            @Override // X.InterfaceC781210Ukh
            public final void run() {
                if (c013c.element) {
                    return;
                }
                c0xyd.dk(0);
            }
        });
        AfS182S0100000_13 afS182S0100000_13 = new AfS182S0100000_13(c0xyd, 25);
        AnonymousClass0988 anonymousClass0988 = C19487811Me.LIZLLL;
        return new C11JS(c11jsLJI, afS182S0100000_13, anonymousClass0988, anonymousClass0988, C19487811Me.LIZJ);
    }
}
