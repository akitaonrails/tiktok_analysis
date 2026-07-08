package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RKg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694040RKg {
    public static final void LIZ(ReusedAssem<?> reusedAssem, boolean z, Function2<? super AbstractC634910OvJ<?>, ? super Boolean, Unit> function2) {
        C694050RKh c694050RKh;
        AssemSupervisor assemSupervisorLJ = C724240Sb0.LJ(reusedAssem);
        if (assemSupervisorLJ == null) {
            return;
        }
        for (Map.Entry<Object, C0RTL> entry : assemSupervisorLJ.LLJJ.entrySet()) {
            entry.getKey();
            C694070RKj c694070RKj = ((C0RTC) entry.getValue()).LLILZIL;
            if (c694070RKj instanceof C694050RKh) {
                AbstractC634910OvJ<?> abstractC634910OvJ = ((C694050RKh) c694070RKj).LIZJ;
                if ((abstractC634910OvJ instanceof AbstractC634910OvJ) && abstractC634910OvJ != null) {
                    function2.invoke(abstractC634910OvJ, Boolean.FALSE);
                }
            }
        }
        if (z) {
            for (AbstractC738140SxQ abstractC738140SxQ : (ArrayList) assemSupervisorLJ.LIZLLL()) {
                if (abstractC738140SxQ instanceof ReusedAssem) {
                    C694070RKj c694070RKj2 = ((ReusedAssem) abstractC738140SxQ).LLJ;
                    if ((c694070RKj2 instanceof C694050RKh) && (c694050RKh = (C694050RKh) c694070RKj2) != null) {
                        function2.invoke(c694050RKh.LIZJ, Boolean.TRUE);
                    }
                }
            }
        }
    }
}
