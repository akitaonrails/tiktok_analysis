package X;

import X.InterfaceC833080WmA;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.base.zaq;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: renamed from: X.0WjQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC831380WjQ<O extends InterfaceC833080WmA> implements InterfaceC829320Wg6<O> {
    public final C831040Wis zaa;
    public final Context zab;
    public final String zac;
    public final C832010WkR<O> zad;
    public final O zae;
    public final C831420WjU<O> zaf;
    public final Looper zag;
    public final int zah;
    public final AbstractC831960WkM zai;
    public final InterfaceC831720Wjy zaj;

    public AbstractC831960WkM asGoogleApiClient() {
        return this.zai;
    }

    @Override // X.InterfaceC829320Wg6
    public final C831420WjU<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public final int zaa() {
        return this.zah;
    }

    public C831460WjY createClientSettingsBuilder() {
        GoogleSignInAccount googleSignInAccountLJFF;
        GoogleSignInAccount googleSignInAccountLJFF2;
        C831460WjY c831460WjY = new C831460WjY();
        O o = this.zae;
        Account accountLJJ = null;
        if (!(o instanceof InterfaceC831580Wjk) || (googleSignInAccountLJFF2 = ((InterfaceC831580Wjk) o).LJFF()) == null) {
            O o2 = this.zae;
            if (o2 instanceof InterfaceC831600Wjm) {
                accountLJJ = ((InterfaceC831600Wjm) o2).LJJ();
            }
        } else {
            String str = googleSignInAccountLJFF2.zaf;
            if (str != null) {
                accountLJJ = new Account(str, "com.google");
            }
        }
        c831460WjY.LIZ = accountLJJ;
        O o3 = this.zae;
        Set<Scope> setEmptySet = (!(o3 instanceof InterfaceC831580Wjk) || (googleSignInAccountLJFF = ((InterfaceC831580Wjk) o3).LJFF()) == null) ? Collections.emptySet() : googleSignInAccountLJFF.LJLZ();
        if (c831460WjY.LIZIZ == null) {
            c831460WjY.LIZIZ = new C835410Wpv<>();
        }
        c831460WjY.LIZIZ.addAll(setEmptySet);
        c831460WjY.LIZLLL = this.zab.getClass().getName();
        c831460WjY.LIZJ = this.zab.getPackageName();
        return c831460WjY;
    }

    public AbstractC835450Wpz<Boolean> disconnectService() {
        C831040Wis c831040Wis = this.zaa;
        c831040Wis.getClass();
        C831090Wix c831090Wix = new C831090Wix(getApiKey());
        zaq zaqVar = c831040Wis.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(14, c831090Wix));
        return c831090Wix.LIZIZ.LIZ;
    }

    public <TResult, A> AbstractC835450Wpz<TResult> doBestEffortWrite(AbstractC831480Wja<A, TResult> abstractC831480Wja) {
        return zae(2, abstractC831480Wja);
    }

    public <TResult, A> AbstractC835450Wpz<TResult> doRead(AbstractC831480Wja<A, TResult> abstractC831480Wja) {
        return zae(0, abstractC831480Wja);
    }

    public <A> AbstractC835450Wpz<Void> doRegisterEventListener(C831330WjL<A, ?> c831330WjL) {
        C0W3J.LJIIIIZZ(c831330WjL);
        C0W3J.LJIIIZ(c831330WjL.LIZ.LIZ.LIZIZ, "Listener has already been released.");
        C0W3J.LJIIIZ(c831330WjL.LIZIZ.LIZ, "Listener has already been released.");
        return this.zaa.LJII(this, c831330WjL.LIZ, c831330WjL.LIZIZ, c831330WjL.LIZJ);
    }

    public AbstractC835450Wpz<Boolean> doUnregisterEventListener(C831450WjX<?> c831450WjX) {
        return doUnregisterEventListener(c831450WjX, 0);
    }

    public <TResult, A> AbstractC835450Wpz<TResult> doWrite(AbstractC831480Wja<A, TResult> abstractC831480Wja) {
        return zae(1, abstractC831480Wja);
    }

    public <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T doBestEffortWrite(T t) {
        zad(2, t);
        return t;
    }

    public <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T doRead(T t) {
        zad(0, t);
        return t;
    }

    public <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T doWrite(T t) {
        zad(1, t);
        return t;
    }

    private final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T zad(final int i, final T t) {
        t.LJIIJJI();
        C831040Wis c831040Wis = this.zaa;
        c831040Wis.getClass();
        AbstractC831170Wj5 abstractC831170Wj5 = new AbstractC831170Wj5(i, t) { // from class: X.0WjR
            public final A LIZIZ;

            @Override // X.AbstractC831170Wj5
            public final void LIZ(Status status) {
                try {
                    this.LIZIZ.LJIILJJIL(status);
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZIZ(Exception exc) {
                String simpleName = exc.getClass().getSimpleName();
                String localizedMessage = exc.getLocalizedMessage();
                int length = simpleName.length();
                StringBuilder sb = new StringBuilder(length + 2 + String.valueOf(localizedMessage).length());
                sb.append(simpleName);
                sb.append(": ");
                sb.append(localizedMessage);
                try {
                    this.LIZIZ.LJIILJJIL(new Status(10, sb.toString()));
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZJ(C831140Wj2<?> c831140Wj2) throws DeadObjectException {
                try {
                    A a = this.LIZIZ;
                    InterfaceC831160Wj4 interfaceC831160Wj4 = c831140Wj2.LLILLJJLI;
                    a.getClass();
                    try {
                        try {
                            a.LJIILIIL(interfaceC831160Wj4);
                        } catch (RemoteException e) {
                            TryCatchGuardChecker.doCheck(e);
                            a.LJIILJJIL(new Status(8, null, e.getLocalizedMessage()));
                        }
                    } catch (DeadObjectException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        a.LJIILJJIL(new Status(8, null, e2.getLocalizedMessage()));
                        throw e2;
                    }
                } catch (RuntimeException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    LIZIZ(e3);
                }
            }

            {
                C0W3J.LJIIIZ(t, "Null methods are not runnable.");
                this.LIZIZ = t;
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZLLL(final C831150Wj3 c831150Wj3, boolean z) {
                final A a = this.LIZIZ;
                c831150Wj3.LIZ.put(a, Boolean.valueOf(z));
                a.LIZJ(new InterfaceC832820Wlk() { // from class: X.0Wje
                    @Override // X.InterfaceC832820Wlk
                    public final void LIZ(Status status) {
                        c831150Wj3.LIZ.remove(a);
                    }
                });
            }
        };
        zaq zaqVar = c831040Wis.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(4, new C831100Wiy(abstractC831170Wj5, c831040Wis.LLJ.get(), this)));
        return t;
    }

    private final <TResult, A> AbstractC835450Wpz<TResult> zae(final int i, final AbstractC831480Wja<A, TResult> abstractC831480Wja) {
        final C835520Wq6 c835520Wq6 = new C835520Wq6();
        C831040Wis c831040Wis = this.zaa;
        final InterfaceC831720Wjy interfaceC831720Wjy = this.zaj;
        c831040Wis.getClass();
        c831040Wis.LJFF(c835520Wq6, abstractC831480Wja.LIZJ, this);
        AbstractC831260WjE abstractC831260WjE = new AbstractC831260WjE(i, abstractC831480Wja, c835520Wq6, interfaceC831720Wjy) { // from class: X.0Wj9
            public final AbstractC831480Wja<Object, ResultT> LIZIZ;
            public final C835520Wq6<ResultT> LIZJ;
            public final InterfaceC831720Wjy LIZLLL;

            @Override // X.AbstractC831170Wj5
            public final void LIZ(Status status) {
                C835520Wq6<ResultT> c835520Wq62 = this.LIZJ;
                this.LIZLLL.getClass();
                c835520Wq62.LIZJ(C0WY0.LIZ(status));
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZIZ(Exception exc) {
                this.LIZJ.LIZJ(exc);
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZJ(C831140Wj2<?> c831140Wj2) throws DeadObjectException {
                try {
                    this.LIZIZ.LIZ(c831140Wj2.LLILLJJLI, this.LIZJ);
                } catch (DeadObjectException e) {
                    TryCatchGuardChecker.doCheck(e);
                    throw e;
                } catch (RemoteException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    LIZ(AbstractC831170Wj5.LJ(e2));
                } catch (RuntimeException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    this.LIZJ.LIZJ(e3);
                }
            }

            @Override // X.AbstractC831260WjE
            public final boolean LJFF(C831140Wj2<?> c831140Wj2) {
                return this.LIZIZ.LIZIZ;
            }

            @Override // X.AbstractC831260WjE
            public final Feature[] LJI(C831140Wj2<?> c831140Wj2) {
                return this.LIZIZ.LIZ;
            }

            @Override // X.AbstractC831170Wj5
            public final void LIZLLL(final C831150Wj3 c831150Wj3, boolean z) {
                final C835520Wq6<ResultT> c835520Wq62 = this.LIZJ;
                c831150Wj3.LIZIZ.put(c835520Wq62, Boolean.valueOf(z));
                c835520Wq62.LIZ.LIZIZ(new InterfaceC834580Woa() { // from class: X.0WjG
                    @Override // X.InterfaceC834580Woa
                    public final void LIZ(AbstractC835450Wpz abstractC835450Wpz) {
                        c831150Wj3.LIZIZ.remove(c835520Wq62);
                    }
                });
            }

            {
                super(i);
                this.LIZJ = c835520Wq6;
                this.LIZIZ = abstractC831480Wja;
                this.LIZLLL = interfaceC831720Wjy;
                if (i == 2 && abstractC831480Wja.LIZIZ) {
                    throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
                }
            }
        };
        zaq zaqVar = c831040Wis.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(4, new C831100Wiy(abstractC831260WjE, c831040Wis.LLJ.get(), this)));
        return c835520Wq6.LIZ;
    }

    public <A, T extends AbstractC831310WjJ<A, ?>, U extends AbstractC831510Wjd<A, ?>> AbstractC835450Wpz<Void> doRegisterEventListener(T t, U u) {
        C0W3J.LJIIIIZZ(t);
        C0W3J.LJIIIIZZ(u);
        C0W3J.LJIIIZ(t.LIZ.LIZIZ, "Listener has already been released.");
        C0W3J.LJIIIZ(u.LIZ, "Listener has already been released.");
        C0W3J.LIZ("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", C0W0T.LIZIZ(t.LIZ.LIZIZ, u.LIZ));
        return this.zaa.LJII(this, t, u, new Runnable() { // from class: X.0Uw6
            @Override // java.lang.Runnable
            public final void run() {
                C1C7U.LIZ("zad@9c72.run");
                C1C7U.LIZIZ("zad@9c72.run");
            }
        });
    }

    public AbstractC835450Wpz<Boolean> doUnregisterEventListener(C831450WjX<?> c831450WjX, int i) {
        C0W3J.LJIIIZ(c831450WjX, "Listener key cannot be null.");
        C831040Wis c831040Wis = this.zaa;
        c831040Wis.getClass();
        C835520Wq6 c835520Wq6 = new C835520Wq6();
        c831040Wis.LJFF(c835520Wq6, i, this);
        C831190Wj7 c831190Wj7 = new C831190Wj7(c831450WjX, c835520Wq6);
        zaq zaqVar = c831040Wis.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(13, new C831100Wiy(c831190Wj7, c831040Wis.LLJ.get(), this)));
        return c835520Wq6.LIZ;
    }

    public <L> C831430WjV<L> registerListener(L l, String str) {
        Looper looper = this.zag;
        C0W3J.LJIIIZ(l, "Listener must not be null");
        C0W3J.LJIIIZ(looper, "Looper must not be null");
        C0W3J.LJIIIZ(str, "Listener type must not be null");
        return new C831430WjV<>(looper, l, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC831160Wj4 zab(Looper looper, C831140Wj2<O> c831140Wj2) {
        C831460WjY c831460WjYCreateClientSettingsBuilder = createClientSettingsBuilder();
        c831460WjYCreateClientSettingsBuilder.getClass();
        C831470WjZ c831470WjZ = new C831470WjZ(c831460WjYCreateClientSettingsBuilder.LIZ, c831460WjYCreateClientSettingsBuilder.LIZIZ, null, c831460WjYCreateClientSettingsBuilder.LIZJ, c831460WjYCreateClientSettingsBuilder.LIZLLL, c831460WjYCreateClientSettingsBuilder.LJ);
        AbstractC831970WkN<?, O> abstractC831970WkN = this.zad.LIZ;
        C0W3J.LJIIIIZZ(abstractC831970WkN);
        InterfaceC831160Wj4 interfaceC831160Wj4BuildClient = abstractC831970WkN.buildClient(this.zab, looper, c831470WjZ, this.zae, (InterfaceC832260Wkq) c831140Wj2, (InterfaceC832270Wkr) c831140Wj2);
        String str = this.zac;
        if (str != null) {
            if (interfaceC831160Wj4BuildClient instanceof AbstractC832390Wl3) {
                ((AbstractC832390Wl3) interfaceC831160Wj4BuildClient).zzA = str;
            }
            if (interfaceC831160Wj4BuildClient instanceof ServiceConnectionC829560WgU) {
                interfaceC831160Wj4BuildClient.getClass();
            }
        }
        return interfaceC831160Wj4BuildClient;
    }

    public final BinderC831400WjS zac(Context context, Handler handler) {
        C831460WjY c831460WjYCreateClientSettingsBuilder = createClientSettingsBuilder();
        c831460WjYCreateClientSettingsBuilder.getClass();
        return new BinderC831400WjS(context, handler, new C831470WjZ(c831460WjYCreateClientSettingsBuilder.LIZ, c831460WjYCreateClientSettingsBuilder.LIZIZ, null, c831460WjYCreateClientSettingsBuilder.LIZJ, c831460WjYCreateClientSettingsBuilder.LIZLLL, c831460WjYCreateClientSettingsBuilder.LJ));
    }

    public AbstractC831380WjQ(Activity activity, C832010WkR<O> c832010WkR, O o, InterfaceC831720Wjy interfaceC831720Wjy) {
        C831500Wjc c831500Wjc = new C831500Wjc();
        C0W3J.LJIIIZ(interfaceC831720Wjy, "StatusExceptionMapper must not be null.");
        c831500Wjc.LIZ = interfaceC831720Wjy;
        Looper mainLooper = activity.getMainLooper();
        C0W3J.LJIIIZ(mainLooper, "Looper must not be null.");
        c831500Wjc.LIZIZ = mainLooper;
        this(activity, (C832010WkR) c832010WkR, (InterfaceC833080WmA) o, c831500Wjc.LIZ());
    }

    public AbstractC831380WjQ(Context context, C832010WkR<O> c832010WkR, O o, InterfaceC831720Wjy interfaceC831720Wjy) {
        C831500Wjc c831500Wjc = new C831500Wjc();
        C0W3J.LJIIIZ(interfaceC831720Wjy, "StatusExceptionMapper must not be null.");
        c831500Wjc.LIZ = interfaceC831720Wjy;
        this(context, c832010WkR, o, c831500Wjc.LIZ());
    }

    public AbstractC831380WjQ(Activity activity, C832010WkR<O> c832010WkR, O o, C831490Wjb c831490Wjb) {
        this(activity, activity, c832010WkR, o, c831490Wjb);
    }

    public AbstractC831380WjQ(Context context, C832010WkR<O> c832010WkR, O o, C831490Wjb c831490Wjb) {
        this(context, (Activity) null, c832010WkR, o, c831490Wjb);
    }

    public AbstractC831380WjQ(Context context, Activity activity, C832010WkR<O> c832010WkR, O o, C831490Wjb c831490Wjb) {
        String str;
        C0W3J.LJIIIZ(context, "Null context is not permitted.");
        C0W3J.LJIIIZ(c832010WkR, "Api must not be null.");
        C0W3J.LJIIIZ(c831490Wjb, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.zab = C786410Ut5.N3(context);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                TryCatchGuardChecker.doCheck(e);
                str = null;
            }
        } else {
            str = null;
        }
        this.zac = str;
        this.zad = c832010WkR;
        this.zae = o;
        this.zag = c831490Wjb.LIZIZ;
        C831420WjU<O> c831420WjU = new C831420WjU<>(c832010WkR, o, str);
        this.zaf = c831420WjU;
        this.zai = new C831540Wjg(this) { // from class: X.0WjT
            public final AbstractC831380WjQ<O> LIZJ;

            @Override // X.AbstractC831960WkM
            public final Context LJIIIZ() {
                return this.LIZJ.zab;
            }

            @Override // X.AbstractC831960WkM
            public final Looper LJIIJ() {
                return this.LIZJ.zag;
            }

            {
                this.LIZJ = this;
            }

            @Override // X.AbstractC831960WkM
            public final <A, T extends AbstractC831980WkO<? extends InterfaceC832870Wlp, A>> T LJI(T t) {
                this.LIZJ.doWrite(t);
                return t;
            }
        };
        C831040Wis c831040WisLJI = C831040Wis.LJI(this.zab);
        this.zaa = c831040WisLJI;
        this.zah = c831040WisLJI.LLIZLLLIL.getAndIncrement();
        this.zaj = c831490Wjb.LIZ;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC831130Wj1 interfaceC831130Wj1LIZJ = LifecycleCallback.LIZJ(new C831570Wjj(activity));
            C831050Wit c831050Wit = (C831050Wit) interfaceC831130Wj1LIZJ.uu(C831050Wit.class, "ConnectionlessLifecycleHelper");
            c831050Wit = c831050Wit == null ? new C831050Wit(interfaceC831130Wj1LIZJ, c831040WisLJI, GoogleApiAvailability.getInstance()) : c831050Wit;
            c831050Wit.LLILZLL.add(c831420WjU);
            c831040WisLJI.LIZIZ(c831050Wit);
        }
        zaq zaqVar = c831040WisLJI.LLJILLL;
        C786410Ut5.LJLJJL(zaqVar, zaqVar.obtainMessage(7, this));
    }

    public AbstractC831380WjQ(Context context, C832010WkR<O> c832010WkR, O o, Looper looper, InterfaceC831720Wjy interfaceC831720Wjy) {
        C831500Wjc c831500Wjc = new C831500Wjc();
        C0W3J.LJIIIZ(looper, "Looper must not be null.");
        c831500Wjc.LIZIZ = looper;
        C0W3J.LJIIIZ(interfaceC831720Wjy, "StatusExceptionMapper must not be null.");
        c831500Wjc.LIZ = interfaceC831720Wjy;
        this(context, c832010WkR, o, c831500Wjc.LIZ());
    }
}
