package X;

import com.bytedance.creativex.recorder.beauty.q;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.tools.beauty.env.BeautyContext;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tNc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1663100tNc extends q {
    public static final int LLJLLL = 8;

    @Override // com.bytedance.creativex.recorder.beauty.q
    public void H3() throws Throwable {
        super.H3();
        BeautyContext beautyContext = BeautyContext.INSTANCE;
        beautyContext.setContext(C0CHQ.LIZ);
        beautyContext.setIsMBeautyMode(C1644990suP.LIZ());
        C0CHQ.LIZ().getRegionService();
        beautyContext.isInTikTokRegion = C20186013yc.LIZIZ().booleanValue();
        beautyContext.setUseMInstantBeauty(C1651050t4B.LIZ());
        C0CHO.LIZ.getClass();
        if (!C0CHO.LIZ() || C0EWC.LIZ()) {
            beautyContext.setBeautificationMode(0);
        } else {
            beautyContext.setBeautificationMode(C0CHQ.LIZ().LJJIIZI().LJJI(C04Q3.LIZ() ? 1 : 0));
        }
        beautyContext.setStoreFullDialog(new InterfaceC1663200tNm() { // from class: X.0tNh
            @Override // X.InterfaceC1663200tNm
            public final void LIZ() {
            }
        });
        beautyContext.setUseComposer(new InterfaceC1663190tNl() { // from class: X.0tNi
            @Override // X.InterfaceC1663190tNl
            public final void LIZ() {
            }
        });
        beautyContext.setBeautyDataMonitor(new C12HG() { // from class: X.0tNf
            @Override // X.C12HG
            public final void LIZ() {
            }

            @Override // X.C12HG
            public final void LIZIZ(HashMap map) {
                C2341909Fp.LIZ("tools_record_beauty_optimize_toast_show", map);
            }
        });
        if (C0BW1.LIZ()) {
            return;
        }
        C1663120tNe.LIZIZ();
    }

    @Override // com.bytedance.creativex.recorder.beauty.q, X.AbstractC2255721DQs
    public void onCreate() {
        boolean zLJI = MethodIDManager.LJI(72036);
        super.onCreate();
        C1637850sit.LIZ(this, new AwS569S0100000_25(this, 243));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public C1663100tNc(C1DRG c1drg, Function0<? extends InterfaceC1635390sev> function0, Function1<? super Boolean, String> function1, Function1<? super C12IL, Unit> function12) {
        super(c1drg, false, C0C64.LJIILLIIL().LJIIIZ(31744, "creative_tools_beauty_api_abgroup_server_filtering", true, false), function0, function1, InterfaceC1663170tNj.LIZ, new InterfaceC1463990oCT() { // from class: X.0tNn
            @Override // X.InterfaceC1463990oCT
            public final void LIZ(String str) {
                C201955140j.LJII(C1663220tNo.LIZIZ, str);
            }

            @Override // X.InterfaceC1463990oCT
            public final void LIZIZ(Throwable th) {
                C201955140j.LJIIJ(C1663220tNo.LIZIZ, "error", th);
            }

            @Override // X.InterfaceC1463990oCT
            public final void d(String str) {
                C201955140j.LIZJ(C1663220tNo.LIZIZ, str);
            }

            @Override // X.InterfaceC1463990oCT
            public final void i(String str) {
                C201955140j.LJIILJJIL(C1663220tNo.LIZIZ, str);
            }

            @Override // X.InterfaceC1463990oCT
            public final void w(String str) {
                C201955140j.LJIJI(C1663220tNo.LIZIZ, str);
            }
        }, function12);
    }
}
