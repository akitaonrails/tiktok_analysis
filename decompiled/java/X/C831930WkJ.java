package X;

import X.C830490Whz;
import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: X.0WkJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C831930WkJ {
    public final String LIZJ;
    public final String LIZLLL;
    public final Context LJFF;
    public C831570Wjj LJII;
    public InterfaceC832270Wkr LJIIIZ;
    public final Looper LJIIJ;
    public final Set<Scope> LIZ = new HashSet();
    public final Set<Scope> LIZIZ = new HashSet();
    public final C830490Whz LJ = new C830490Whz();
    public final C830490Whz LJI = new C830490Whz();
    public int LJIIIIZZ = -1;
    public final GoogleApiAvailability LJIIJJI = GoogleApiAvailability.getInstance();
    public final C832180Wki LJIIL = C832170Wkh.LIZ;
    public final ArrayList<InterfaceC832260Wkq> LJIILIIL = new ArrayList<>();
    public final ArrayList<InterfaceC832270Wkr> LJIILJJIL = new ArrayList<>();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final C831920WkI LIZ() {
        C0W3J.LIZ("must call addApi() to add at least one API", !this.LJI.isEmpty());
        C831610Wjn c831610Wjn = C831610Wjn.LL;
        C830490Whz c830490Whz = this.LJI;
        C832010WkR<C831610Wjn> c832010WkR = C832170Wkh.LIZIZ;
        if (c830490Whz.containsKey(c832010WkR)) {
            c831610Wjn = (C831610Wjn) this.LJI.get(c832010WkR);
        }
        C831470WjZ c831470WjZ = new C831470WjZ(null, this.LIZ, this.LJ, this.LIZJ, this.LIZLLL, c831610Wjn);
        Map<C832010WkR<?>, C2288641Ei6> map = c831470WjZ.LIZLLL;
        C830490Whz c830490Whz2 = new C830490Whz();
        C830490Whz c830490Whz3 = new C830490Whz();
        ArrayList arrayList = new ArrayList();
        C832010WkR c832010WkR2 = null;
        boolean z = false;
        for (C832010WkR c832010WkR3 : (C830490Whz.c) this.LJI.keySet()) {
            V v = this.LJI.get(c832010WkR3);
            boolean z2 = map.get(c832010WkR3) != null;
            c830490Whz2.put(c832010WkR3, Boolean.valueOf(z2));
            C831910WkH c831910WkH = new C831910WkH(c832010WkR3, z2);
            arrayList.add(c831910WkH);
            AbstractC831970WkN<?, O> abstractC831970WkN = c832010WkR3.LIZ;
            C0W3J.LJIIIIZZ(abstractC831970WkN);
            InterfaceC831160Wj4 interfaceC831160Wj4BuildClient = abstractC831970WkN.buildClient(this.LJFF, this.LJIIJ, c831470WjZ, v, (InterfaceC832260Wkq) c831910WkH, (InterfaceC832270Wkr) c831910WkH);
            c830490Whz3.put(c832010WkR3.LIZIZ, interfaceC831160Wj4BuildClient);
            if (abstractC831970WkN.getPriority() == 1) {
                z = v != 0;
            }
            if (interfaceC831160Wj4BuildClient.providesSignIn()) {
                if (c832010WkR2 != null) {
                    String str = c832010WkR3.LIZJ;
                    String str2 = c832010WkR2.LIZJ;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                    sb.append(str);
                    sb.append(" cannot be used with ");
                    sb.append(str2);
                    throw new IllegalStateException(sb.toString());
                }
                c832010WkR2 = c832010WkR3;
            }
        }
        if (c832010WkR2 != null) {
            if (z) {
                String str3 = c832010WkR2.LIZJ;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 82);
                sb2.append("With using ");
                sb2.append(str3);
                sb2.append(", GamesOptions can only be specified within GoogleSignInOptions.Builder");
                throw new IllegalStateException(sb2.toString());
            }
            boolean zEquals = this.LIZ.equals(this.LIZIZ);
            Object[] objArr = {c832010WkR2.LIZJ};
            if (!zEquals) {
                throw new IllegalStateException(C786410Ut5.j4("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr));
            }
        }
        C831920WkI c831920WkI = new C831920WkI(this.LJFF, new ReentrantLock(), this.LJIIJ, c831470WjZ, this.LJIIJJI, this.LJIIL, c830490Whz2, this.LJIILIIL, this.LJIILJJIL, c830490Whz3, this.LJIIIIZZ, C831920WkI.LJIILLIIL(c830490Whz3.values(), true), arrayList);
        Set<AbstractC831960WkM> set = AbstractC831960WkM.LIZ;
        synchronized (set) {
            try {
                set.add(c831920WkI);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (this.LJIIIIZZ >= 0) {
            InterfaceC831130Wj1 interfaceC831130Wj1LIZJ = LifecycleCallback.LIZJ(this.LJII);
            C831950WkL c831950WkL = (C831950WkL) interfaceC831130Wj1LIZJ.uu(C831950WkL.class, "AutoManageHelper");
            if (c831950WkL == null) {
                c831950WkL = new C831950WkL(interfaceC831130Wj1LIZJ);
            }
            int i = this.LJIIIIZZ;
            InterfaceC832270Wkr interfaceC832270Wkr = this.LJIIIZ;
            boolean z3 = c831950WkL.LLILZLL.indexOfKey(i) < 0;
            StringBuilder sb3 = new StringBuilder(54);
            sb3.append("Already managing a GoogleApiClient with id ");
            sb3.append(i);
            C0W3J.LJIIJ(sb3.toString(), z3);
            C829280Wg2 c829280Wg2 = c831950WkL.LLILLL.get();
            new StringBuilder(String.valueOf(c829280Wg2).length() + 49);
            C832070WkX c832070WkX = new C832070WkX(c831950WkL, i, c831920WkI, interfaceC832270Wkr);
            c831920WkI.LJIILL(c832070WkX);
            c831950WkL.LLILZLL.put(i, c832070WkX);
            if (c831950WkL.LLILLJJLI && c829280Wg2 == null) {
                c831920WkI.LIZLLL();
            }
        }
        return c831920WkI;
    }

    public C831930WkJ(Context context) {
        this.LJFF = context;
        this.LJIIJ = context.getMainLooper();
        this.LIZJ = context.getPackageName();
        this.LIZLLL = context.getClass().getName();
    }
}
