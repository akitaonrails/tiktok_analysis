package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0WWJ, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WWJ {
    public final WeakReference<Context> LIZ;
    public final AtomicReference<C817470W4z> LIZIZ = new AtomicReference<>();
    public final CountDownLatch LIZJ = new CountDownLatch(1);
    public C0WWK LIZLLL;

    public C0WWJ(Context context) {
        this.LIZ = new WeakReference<>(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0W53] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
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
    public final C0WWG LIZ(Uri... uriArr) {
        ?? arrayList;
        C0W59 c0w59 = null;
        try {
            this.LIZJ.await(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            TryCatchGuardChecker.doCheck(e);
            C0WWL.LIZIZ().LIZJ(4, "Interrupted while waiting for browser connection", null, new Object[0]);
            this.LIZJ.countDown();
        }
        C817470W4z c817470W4z = this.LIZIZ.get();
        if (c817470W4z != null) {
            C0W59 c0w59LIZJ = c817470W4z.LIZJ(null);
            if (c0w59LIZJ == null) {
                C0WWL.LIZLLL("Failed to create custom tabs session through custom tabs client", new Object[0]);
            } else {
                if (uriArr.length > 0) {
                    if (uriArr.length <= 1) {
                        arrayList = Collections.emptyList();
                    } else {
                        arrayList = new ArrayList(uriArr.length - 1);
                        for (int i = 1; i < uriArr.length; i++) {
                            if (uriArr[i] == null) {
                                C0WWL.LIZLLL("Null URI in possibleUris list - ignoring", new Object[0]);
                            } else {
                                Bundle bundle = new Bundle();
                                C786410Ut5.LJJIJL(bundle, "android.support.customtabs.otherurls.URL", uriArr[i]);
                                arrayList.add(bundle);
                            }
                        }
                    }
                    try {
                        c0w59LIZJ.LIZIZ.c(c0w59LIZJ.LIZJ, uriArr[0], c0w59LIZJ.LIZ(null), arrayList);
                    } catch (RemoteException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                c0w59 = c0w59LIZJ;
            }
        }
        return new C0WWG(c0w59);
    }
}
