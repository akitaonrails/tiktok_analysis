package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0seD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634950seD implements InterfaceC1634260sd6 {
    public final Context LIZ;
    public final Function0<InterfaceC1635390sev> LIZIZ;
    public final Function0<String> LIZJ;
    public final Function0<String> LIZLLL;
    public Function0<? extends InterfaceC1632830san> LJ;

    /* JADX WARN: Type inference failed for: r3v2, types: [X.0se5] */
    @Override // X.InterfaceC1634260sd6
    public final C1632890sat create() throws Throwable {
        Object obj;
        InterfaceC1632830san c1633040sb8;
        Function0<? extends InterfaceC1632830san> function0 = this.LJ;
        if (function0 == null || (c1633040sb8 = function0.invoke()) == null) {
            Context context = this.LIZ;
            File file = C786450Ut9.LIZJ;
            if (file == null || !C786450Ut9.LJ) {
                try {
                    C786450Ut9.LIZJ = context.getFilesDir();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    Context applicationContext = null;
                    try {
                        Class<?> cls = Class.forName("android.app.ActivityThread");
                        Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                        Field declaredField = cls.getDeclaredField("mInitialApplication");
                        declaredField.setAccessible(true);
                        obj = declaredField.get(objInvoke);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        PrintStream printStream = System.out;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Error: ");
                        sbLIZ.append(e.getMessage());
                        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!(obj instanceof Application)) {
                        System.out.println("Error: mInitialApplication is not an instance of Application");
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(th.getMessage());
                        sbLIZ2.append(":");
                        sbLIZ2.append(C08RN.LIZJ());
                        sbLIZ2.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ22 = C2188811AlT.LIZ();
                    sbLIZ22.append(th.getMessage());
                    sbLIZ22.append(":");
                    sbLIZ22.append(C08RN.LIZJ());
                    sbLIZ22.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ22));
                }
                file = C786450Ut9.LIZJ;
            }
            c1633040sb8 = new C1633040sb8(new C0VSJ(file, "effect").getAbsolutePath());
        }
        C1632820sam c1632820sam = new C1632820sam(c1633040sb8, new AwS569S0100000_25(this, 1167));
        return new C1632890sat(new InterfaceC1632900sau(this.LIZIZ, this.LIZJ, this.LIZLLL) { // from class: X.0se5
            public final Function0<InterfaceC1635390sev> LIZ;
            public final Function0<String> LIZIZ;
            public final Function0<String> LIZJ;
            public final int LIZLLL = 30;
            public final int LJ = 30;

            @Override // X.InterfaceC1632900sau
            public final C1635210sed LIZ() {
                return new C1635210sed(this.LIZ, "tenor", this.LIZJ.invoke(), this.LIZLLL);
            }

            @Override // X.InterfaceC1632900sau
            public final C1635210sed LIZJ() {
                return new C1635210sed(this.LIZ, this.LIZIZ.invoke(), this.LIZJ.invoke(), this.LIZLLL);
            }

            @Override // X.InterfaceC1632900sau
            public final C1635220see LJJZZIII(String str) {
                return new C1635220see(this.LIZ, this.LIZIZ.invoke(), this.LIZJ.invoke(), str, this.LJ);
            }

            @Override // X.InterfaceC1632900sau
            public final C1635210sed LIZIZ(int i, boolean z) {
                return new C1635210sed(this.LIZ, "tenor", this.LIZJ.invoke(), this.LIZLLL, new C1634860se4(i, z));
            }

            {
                this.LIZ = function0;
                this.LIZIZ = function0;
                this.LIZJ = function0;
            }
        }, new C1632840sao(c1632820sam, c1633040sb8), c1632820sam, c1633040sb8);
    }

    public C1634950seD(Context context, AFwS214S0000000_25 aFwS214S0000000_25, AFwS214S0000000_25 aFwS214S0000000_252, AFwS214S0000000_25 aFwS214S0000000_253) {
        this.LIZ = context;
        this.LIZIZ = aFwS214S0000000_25;
        this.LIZJ = aFwS214S0000000_252;
        this.LIZLLL = aFwS214S0000000_253;
    }
}
