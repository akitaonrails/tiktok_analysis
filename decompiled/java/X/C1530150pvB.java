package X;

import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0pvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530150pvB implements InterfaceC1530160pvC {
    public final C1537480q70 LIZ;
    public final C1541480qDS LIZIZ;
    public final C1530540pvo LIZJ;
    public final C1530140pvA LIZLLL;

    @Override // X.InterfaceC1530160pvC
    public final <T> T LIZIZ(Class<? extends T> cls) {
        T t;
        if (Intrinsics.LJFF(cls, C1BOI.class)) {
            T t2 = (T) this.LIZLLL;
            if (t2 != null) {
                return t2;
            }
        } else if (Intrinsics.LJFF(cls, InterfaceC2203861BNg.class) && (t = (T) this.LIZJ) != null) {
            return t;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0pvA] */
    public C1530150pvB(C1537480q70 c1537480q70, C1541480qDS c1541480qDS) {
        this.LIZ = c1537480q70;
        this.LIZIZ = c1541480qDS;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(c1537480q70, false);
        C1530540pvo c1530540pvo = null;
        if (iResourceServiceXLIZIZ != null) {
            c1530540pvo = new C1530540pvo(c1537480q70, iResourceServiceXLIZIZ, c1537480q70 != null ? c1537480q70.containerId : null);
        }
        this.LIZJ = c1530540pvo;
        this.LIZLLL = new C1BOI() { // from class: X.0pvA
            @Override // X.C1BOI
            public final void LIZIZ(Object obj) {
                C1537480q70 c1537480q702 = this.LIZIZ.LIZ;
                if (c1537480q702 != null) {
                    c1537480q702.LJIIIZ().LIZJ("opt_pia_prefetch_status", obj);
                }
            }

            @Override // X.C1BOI
            public final void LIZ(Object obj, String str) {
                C1537480q70 c1537480q702 = this.LIZIZ.LIZ;
                if (c1537480q702 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pia_");
                    sbLIZ.append(str);
                    c1537480q702.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ), obj);
                }
            }

            @Override // X.C1BOI
            public final void LIZJ(long j, String str) {
                C1537480q70 c1537480q702 = this.LIZIZ.LIZ;
                if (c1537480q702 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("pia_");
                    sbLIZ.append(str);
                    c1537480q702.LJIIIZ().LIZJ(C2188811AlT.LIZIZ(sbLIZ), Long.valueOf(j));
                }
            }
        };
    }
}
