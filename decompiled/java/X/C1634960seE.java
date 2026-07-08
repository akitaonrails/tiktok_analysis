package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0seE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1634960seE implements InterfaceC1634270sd7 {
    public final Context LIZ;
    public final Function0<InterfaceC1635390sev> LIZIZ;
    public final Function0<String> LIZJ;

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0sd8] */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.0sd9] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0sb7] */
    @Override // X.InterfaceC1634270sd7
    public final C1634280sd8 create() throws Throwable {
        Object obj;
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
        final String absolutePath = new C0VSJ(file, "effect").getAbsolutePath();
        final ?? r4 = new InterfaceC1632930sax(absolutePath) { // from class: X.0sb7
            public final String LIZ;

            {
                this.LIZ = absolutePath;
            }

            @Override // X.InterfaceC1632930sax
            public final String LIZ(InfoStickerEffect infoStickerEffect) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(C1489060oqu.LIZ(this.LIZ));
                sbLIZ4.append(infoStickerEffect.getId());
                sbLIZ4.append(".gif");
                return C2188811AlT.LIZIZ(sbLIZ4);
            }

            @Override // X.InterfaceC1632930sax
            public final boolean LIZIZ(InfoStickerEffect infoStickerEffect) {
                return C2286708xd.LIZJ(LIZ(infoStickerEffect));
            }
        };
        final C1632920saw c1632920saw = new C1632920saw(r4, new AwS569S0100000_25(this, 43));
        final C1632940say c1632940say = new C1632940say(r4, c1632920saw);
        final Function0<InterfaceC1635390sev> function0 = this.LIZIZ;
        final ?? r1 = new Object(function0) { // from class: X.0sd9
            public final Function0<InterfaceC1635390sev> LIZ;

            {
                this.LIZ = function0;
            }
        };
        return new InterfaceC1634300sdA(r1, c1632940say, c1632920saw, r4) { // from class: X.0sd8
        };
    }

    public C1634960seE(Context context, AFwS214S0000000_25 aFwS214S0000000_25, AFwS214S0000000_25 aFwS214S0000000_252) {
        this.LIZ = context;
        this.LIZIZ = aFwS214S0000000_25;
        this.LIZJ = aFwS214S0000000_252;
    }
}
