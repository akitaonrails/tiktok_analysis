package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694190RKv extends C09AY implements Function0<List<ReusedAssem<? extends C03H5>>> {
    public final /* synthetic */ C0RTC<ReusedAssem<? extends C03H5>> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C694190RKv(C0RTC<ReusedAssem<? extends C03H5>> c0rtc) {
        super(0);
        this.LL = c0rtc;
    }

    @Override // kotlin.jvm.functions.Function0
    public final List<ReusedAssem<? extends C03H5>> invoke() {
        C0RTC<ReusedAssem<? extends C03H5>> c0rtc = this.LL;
        Object objLIZJ = c0rtc.LIZJ();
        if (objLIZJ == null) {
            C13IQ<? extends T> c13iq = c0rtc.LLILLL;
            if (c13iq == 0) {
                "Type of this assemble is null, have you forget to set type? For example: \nassemble {\n    uiContentAssem {\n       type = YourAssemType::class\n    }\n}".toString();
                throw new IllegalArgumentException("Type of this assemble is null, have you forget to set type? For example: \nassemble {\n    uiContentAssem {\n       type = YourAssemType::class\n    }\n}");
            }
            objLIZJ = (AbstractC738140SxQ) C09R7.LIZ(c13iq).newInstance();
        }
        return Collections.singletonList(objLIZJ);
    }
}
