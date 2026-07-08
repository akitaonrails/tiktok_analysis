package X;

import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.18BE, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ PageInfoStack LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18BE(PageInfoStack pageInfoStack, String str, String str2, boolean z) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = str2;
        this.LLILZ = pageInfoStack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final String str = this.LL;
        final boolean z = this.LLILLJJLI;
        final String str2 = this.LLILLL;
        final PageInfoStack pageInfoStack = this.LLILZ;
        C18GU.LIZ.LIZ(new Runnable() { // from class: X.18BC
            @Override // java.lang.Runnable
            public final void run() {
                String str3 = str;
                PageInfoStack pageInfoStack2 = pageInfoStack;
                String str4 = str2;
                boolean z2 = z;
                C1C7U.LIZ("BtmMonitor@2176.submitMonitorCPUTask$1L");
                boolean z3 = str3.length() == 0;
                C18CE c18ce = C18CE.LIZ;
                if (z3) {
                    c18ce.LIZIZ(2000, String.valueOf(pageInfoStack2), null, null, false, new C119G(str4, z2));
                } else if (str3.length() != 0) {
                    try {
                        Iterator it2 = ((List) C18CE.LIZIZ.getValue()).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                c18ce.LIZIZ(2001, String.valueOf(pageInfoStack2), null, null, false, new C18BD(str3, str4, z2));
                                break;
                            } else if (((Regex) it2.next()).matches(str3)) {
                                break;
                            }
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                C1C7U.LIZIZ("BtmMonitor@2176.submitMonitorCPUTask$1L");
            }
        }, false);
        return Unit.LIZ;
    }
}
