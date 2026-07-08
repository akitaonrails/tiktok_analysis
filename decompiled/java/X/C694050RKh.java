package X;

import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;

/* JADX INFO: renamed from: X.0RKh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694050RKh extends AbstractC694060RKi {
    public final AbstractC634910OvJ<?> LIZJ;

    public C694050RKh(AbstractC634910OvJ<?> abstractC634910OvJ) {
        this.LIZJ = abstractC634910OvJ;
    }

    @Override // X.AbstractC694060RKi
    public final void LIZ(ReusedAssem<?> reusedAssem, AssemSupervisor assemSupervisor, C0RTC<?> c0rtc) {
        C13IQ<? extends ReusedAssem<?>> c13iqLIZLLL = c0rtc.LIZLLL();
        assemSupervisor.LLJJ.put(c13iqLIZLLL, c0rtc);
        AbstractC634910OvJ<?> abstractC634910OvJ = this.LIZJ;
        abstractC634910OvJ.LL = c13iqLIZLLL;
        abstractC634910OvJ.LLILLL = reusedAssem;
    }
}
