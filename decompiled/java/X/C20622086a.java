package X;

import Y.ARunnableS103S0100000_3;
import Y.ARunnableS72S0200000_3;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.assem.arch.threadpool.AssemMainHandler;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.boot.looper.EndlessHandler;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.player.sdk.util.PlayerMainHandler;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;
import java.util.LinkedList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.086a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C20622086a {
    public static volatile C20622086a LJI;
    public C20623086b LIZ;
    public C20624086c LIZIZ;
    public C20627086f LIZJ;
    public C20626086e LIZLLL;
    public C20625086d LJ;
    public final C086W LJFF;

    public static C20622086a LIZ() {
        if (LJI == null) {
            synchronized (C20622086a.class) {
                try {
                    if (LJI == null) {
                        LJI = new C20622086a();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJI;
    }

    public final void LIZIZ() {
        C086W c086w = this.LJFF;
        ARunnableS103S0100000_3 aRunnableS103S0100000_3 = new ARunnableS103S0100000_3(this, 74);
        c086w.getClass();
        if (Looper.myLooper() != null) {
            synchronized (c086w) {
                try {
                    Handler handler = c086w.LIZ.get();
                    if (handler != null) {
                        Message messageObtain = Message.obtain(handler, new ARunnableS72S0200000_3(c086w, aRunnableS103S0100000_3, 24));
                        messageObtain.obj = C086W.LJFF;
                        C786410Ut5.LJLJJLL(handler, messageObtain);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.086Y, X.086d] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.086Y, X.086e] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.086Y, X.086f] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.086Y, X.086c] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.086Y, X.086b] */
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
    public final void LIZJ() {
        this.LJFF.getClass();
        if (((Boolean) AnonymousClass0716.LJJIL.getValue()).booleanValue()) {
            ?? r1 = new C086Y() { // from class: X.086b
                public static final Pattern LIZ = PatternProtector.compile("(\\$\\d+)+$");

                @Override // X.C086Y
                public final boolean LIZ(Message message) {
                    Handler target = message.getTarget();
                    if (target == null) {
                        return false;
                    }
                    String name = target.getClass().getName();
                    if (name.contains("android.graphics.SurfaceTexture")) {
                        return false;
                    }
                    return LIZ.matcher(name).find();
                }
            };
            this.LIZ = r1;
            this.LJFF.LIZ(r1);
        }
        if (((Boolean) AnonymousClass0716.LJJIZ.getValue()).booleanValue()) {
            ?? r12 = new C086Y() { // from class: X.086c
                @Override // X.C086Y
                public final boolean LIZ(Message message) {
                    Runnable callback;
                    if (message.getTarget() == null || (callback = message.getCallback()) == null) {
                        return false;
                    }
                    String name = callback.getClass().getName();
                    boolean zContains = name.contains("LoadedApk$ReceiverDispatcher");
                    boolean zContains2 = name.contains("LoadedApk$ServiceDispatcher");
                    if (!zContains && !zContains2) {
                        return false;
                    }
                    return true;
                }
            };
            this.LIZIZ = r12;
            this.LJFF.LIZ(r12);
        }
        if (((Boolean) AnonymousClass0716.LJJJ.getValue()).booleanValue()) {
            ?? r13 = new C086Y() { // from class: X.086f
                @Override // X.C086Y
                public final boolean LIZ(Message message) {
                    boolean z;
                    boolean z2;
                    Handler target = message.getTarget();
                    if (target == null) {
                        return false;
                    }
                    String name = target.getClass().getName();
                    Runnable callback = message.getCallback();
                    boolean zEquals = name.equals("android.view.ViewRootImpl$ViewRootHandler");
                    boolean z3 = target instanceof PlayerMainHandler;
                    if (callback != null && callback.getClass().getName().contains("androidx.fragment.app")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (target == C799570VYd.LIZJ()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean zEquals2 = name.equals("android.os.Handler");
                    if (zEquals || z3 || z || z2 || !zEquals2) {
                        return false;
                    }
                    return true;
                }
            };
            this.LIZJ = r13;
            this.LJFF.LIZ(r13);
        }
        if (((Boolean) AnonymousClass0716.LJJJI.getValue()).booleanValue()) {
            ?? r14 = new C086Y() { // from class: X.086e
                @Override // X.C086Y
                public final boolean LIZ(Message message) {
                    Handler target = message.getTarget();
                    if (target == null) {
                        return false;
                    }
                    return target.getClass().getName().equals(AssemMainHandler.class.getName());
                }
            };
            this.LIZLLL = r14;
            this.LJFF.LIZ(r14);
        }
        if (((Boolean) AnonymousClass0716.LJJJIL.getValue()).booleanValue()) {
            ?? r15 = new C086Y() { // from class: X.086d
                @Override // X.C086Y
                public final boolean LIZ(Message message) {
                    Runnable callback = message.getCallback();
                    if (callback != null && callback.getClass().getName().contains("kotlinx.coroutines")) {
                        return true;
                    }
                    return false;
                }
            };
            this.LJ = r15;
            this.LJFF.LIZ(r15);
        }
        ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).LJIILL();
        C086W c086w = this.LJFF;
        c086w.getClass();
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        synchronized (c086w) {
            try {
                Handler endlessHandler = c086w.LIZ.get();
                if (endlessHandler == null) {
                    endlessHandler = new EndlessHandler(Looper.myLooper());
                    c086w.LIZ.set(endlessHandler);
                }
                C786410Ut5.LJLJJLL(endlessHandler, Message.obtain(endlessHandler, new ARunnableS103S0100000_3(c086w, 73)));
                if (c086w.LIZLLL.get() == null) {
                    c086w.LIZLLL.set(new LinkedList());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, this.LJFF.LIZ.get(), new ARunnableS103S0100000_3(this, 75));
    }

    public C20622086a() {
        if (C086W.LJI == null) {
            synchronized (C086W.class) {
                try {
                    if (C086W.LJI == null) {
                        C086W.LJI = new C086W();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        this.LJFF = C086W.LJI;
    }
}
