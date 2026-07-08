package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon;
import com.ss.android.ugc.aweme.im.common.perfmonitor.impl.firstdraw.FirstFramePerfMonImpl;

/* JADX INFO: renamed from: X.04qm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1225004qm implements FirstFramePerfMon {
    public static final /* synthetic */ C1225004qm LIZJ = new C1225004qm();
    public final /* synthetic */ FirstFramePerfMon LIZIZ;

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon
    public final void LIZ(View view, String str, InterfaceC1224904ql interfaceC1224904ql) {
        this.LIZIZ.LIZ(view, str, interfaceC1224904ql);
    }

    @Override // com.ss.android.ugc.aweme.im.common.perfmonitor.firstdraw.FirstFramePerfMon
    public final void LIZIZ(String str) {
        this.LIZIZ.LIZIZ(str);
    }

    public C1225004qm() {
        FirstFramePerfMon firstFramePerfMon;
        Object objLIZ = C04TD.LIZ(FirstFramePerfMon.class, false);
        if (objLIZ != null) {
            firstFramePerfMon = (FirstFramePerfMon) objLIZ;
        } else {
            if (C04TD.X0 == null) {
                synchronized (FirstFramePerfMon.class) {
                    if (C04TD.X0 == null) {
                        C04TD.X0 = new FirstFramePerfMonImpl();
                    }
                }
            }
            firstFramePerfMon = C04TD.X0;
        }
        this.LIZIZ = firstFramePerfMon;
    }
}
