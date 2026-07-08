package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: renamed from: X.0Vrh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C811030Vrh {
    public final InterfaceC811540VsW LIZ;
    public boolean LIZIZ;
    public Boolean LIZJ;
    public final /* synthetic */ FirebaseMessaging LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Vrk] */
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
    public final synchronized void LIZ() {
        if (this.LIZIZ) {
            return;
        }
        Boolean boolLIZIZ = LIZIZ();
        this.LIZJ = boolLIZIZ;
        if (boolLIZIZ == null) {
            this.LIZ.LIZIZ(C811100Vro.class, new InterfaceC811570VsZ() { // from class: X.0Vrk
                @Override // X.InterfaceC811570VsZ
                public final void LIZ(C1267204xa c1267204xa) {
                    boolean zLJI;
                    C811030Vrh c811030Vrh = this.LIZ;
                    synchronized (c811030Vrh) {
                        c811030Vrh.LIZ();
                        Boolean bool = c811030Vrh.LIZJ;
                        if (bool != null) {
                            zLJI = bool.booleanValue();
                        } else {
                            zLJI = c811030Vrh.LIZLLL.LIZ.LJI();
                        }
                    }
                    if (zLJI) {
                        c811030Vrh.LIZLLL.LJIIIIZZ();
                    }
                }
            });
        }
        this.LIZIZ = true;
    }

    public final Boolean LIZIZ() {
        ApplicationInfo applicationInfoV3;
        Bundle bundle;
        C818880WAk c818880WAk = this.LIZLLL.LIZ;
        c818880WAk.LIZ();
        Context context = c818880WAk.LIZ;
        SharedPreferences sharedPreferencesLIZJ = C810670Vr7.LIZJ(context, 0, "com.google.firebase.messaging");
        if (sharedPreferencesLIZJ.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferencesLIZJ.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfoV3 = C786410Ut5.V3(packageManager, context.getPackageName(), 128)) == null || (bundle = applicationInfoV3.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfoV3.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public C811030Vrh(FirebaseMessaging firebaseMessaging, InterfaceC811540VsW interfaceC811540VsW) {
        this.LIZLLL = firebaseMessaging;
        this.LIZ = interfaceC811540VsW;
    }
}
