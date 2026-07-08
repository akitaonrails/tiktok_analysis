package X;

import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nd7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1442070nd7 {
    public static void LIZIZ(Effect effect, long j) {
        if (effect != null && !C306620C0e.LIZ()) {
            StringBuilder sb = new StringBuilder();
            if (!C580130Mp9.LIZ(effect.getRequirements())) {
                Iterator<String> it2 = effect.getRequirements().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / ((long) 1024));
            sb2.append("k");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report start download effect alog: ");
            sbLIZ.append((Object) sb2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("extra_info", sb2.toString());
            C2341909Fp.LIZ("start_download_effect", c0lab.LIZ);
        }
    }

    public static void LIZ(Effect effect, long j, long j2, int i, ExceptionResult exceptionResult) {
        if (effect != null && !C306620C0e.LIZ()) {
            StringBuilder sb = new StringBuilder();
            if (!C580130Mp9.LIZ(effect.getRequirements())) {
                Iterator<String> it2 = effect.getRequirements().iterator();
                while (it2.hasNext()) {
                    sb.append(it2.next());
                    sb.append(",");
                }
            }
            StringBuilder sb2 = new StringBuilder("effect id:");
            sb2.append(effect.getEffectId());
            sb2.append("; effect url:");
            sb2.append(effect.getFileUrl());
            sb2.append("; effect req:");
            sb2.append(sb.toString());
            sb2.append("; total size:");
            sb2.append(j / ((long) 1024));
            sb2.append("k; duration:");
            sb2.append(j2);
            sb2.append("ms");
            if (i == 0) {
                sb2.append("; errorcode: 0");
            } else if (exceptionResult != null) {
                sb2.append("; errorcode:");
                sb2.append(exceptionResult.getErrorCode());
                sb2.append("; errormsg:");
                sb2.append(exceptionResult.getMsg());
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("report effect download alog: ");
            sbLIZ.append((Object) sb2);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("extra_info", sb2.toString());
            C2341909Fp.LIZ("end_download_effect", c0lab.LIZ);
        }
    }
}
