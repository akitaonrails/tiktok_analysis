package X;

import android.app.Application;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0kri, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1335800kri {
    public static WeakReference<Context> LIZ;

    public static Context LIZ() {
        WeakReference<Context> weakReference = LIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void LIZIZ(Context context) throws Throwable {
        Object obj;
        if (LIZ() == null) {
            LIZ = new WeakReference<>(context);
            C1335790krh.LIZIZ.init(context);
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
                    if (obj instanceof Application) {
                        applicationContext = ((Application) obj).getApplicationContext();
                        PrintStream printStream2 = System.out;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Application context obtained through ActivityThread: ");
                        sbLIZ2.append(applicationContext);
                        printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
                        if (applicationContext != null) {
                            C786450Ut9.LIZJ = applicationContext.getFilesDir();
                            C08RN.LIZ(applicationContext);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(th.getMessage());
                        sbLIZ3.append(":");
                        sbLIZ3.append(C08RN.LIZJ());
                        sbLIZ3.append(" applicationContext is null");
                        throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                    StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                    sbLIZ32.append(th.getMessage());
                    sbLIZ32.append(":");
                    sbLIZ32.append(C08RN.LIZJ());
                    sbLIZ32.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ32));
                }
                file = C786450Ut9.LIZJ;
            }
            String strLIZJ = C1335810krj.LIZJ(file.getPath(), "EffectEditorMobile");
            C1335810krj.LJIILIIL = strLIZJ;
            C1335810krj.LIZJ(C1335810krj.LIZJ(strLIZJ, "ResourceWorkspace"), "model");
            C1335810krj.LIZ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, C1335810krj.LIZIZ("cache", "image"));
            C1335810krj.LIZJ(C1335810krj.LJIILIIL, C1335810krj.LIZIZ("cache", "video"));
            C1335810krj.LIZIZ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "drafts");
            C1335810krj.LIZJ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "draft_path");
            C1335810krj.LIZLLL = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "drafts_temp");
            C1335810krj.LJ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "drafts_temp_img_saver");
            C1335810krj.LJFF = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "publish_effect_icon");
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(C1335810krj.LIZJ(C1335810krj.LJIILIIL, "publish_effect_icon_default"));
            sbLIZ4.append("/publish_effect_icon_default.png");
            C1335810krj.LJI = C2188811AlT.LIZIZ(sbLIZ4);
            C1335810krj.LIZJ(C1335810krj.LJIILIIL, "EffectPackageExport");
            C1335810krj.LJII = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "ProjectWorkingPath");
            C1335810krj.LJIIIIZZ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "draft_file");
            C1335810krj.LJIILJJIL = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "effect_img_creator_style_path");
            C1335810krj.LJIIIZ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "adv_effect_icon");
            C1335810krj.LJIIJ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, C1335810krj.LIZIZ("cache", "FaceFusionGanImage"));
            C1335810krj.LJIIJJI = C1335810krj.LIZJ(C1335810krj.LJIILIIL, C1335810krj.LIZIZ("cache", "face_stretch"));
            C1335810krj.LJIIL = C1335810krj.LIZJ(C1335810krj.LJIILIIL, C1335810krj.LIZIZ("cache", "logic_template"));
            C1335810krj.LJIILL = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "face_fusion_official_path");
            C1335810krj.LJIILLIIL = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "effect_img_placeholder");
            C1335810krj.LJIIZILJ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "effect_img_matting");
            C1335810krj.LJIJ = C1335810krj.LIZJ(C1335810krj.LJIILIIL, "effect_ai_makeup");
        }
    }
}
