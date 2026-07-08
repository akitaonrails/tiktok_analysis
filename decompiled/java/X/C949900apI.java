package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.android.livesdkapi.host.editor.IHostMultiCanvas;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0apI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.DraftItemManager$clearAllCache$1", f = "DraftItemManager.kt", l = {}, m = "invokeSuspend")
public final class C949900apI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C953760avW LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C949900apI(C953760avW c953760avW, InterfaceC1364105Vn<? super C949900apI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c953760avW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C949900apI(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftItemManager@a4ec.clearAllCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1106030et7.N7.LJFF(new ArrayList());
        C08I7<String, C953770avX> c08i7LJ = this.LL.LJ();
        C953760avW c953760avW = this.LL;
        synchronized (c08i7LJ) {
            try {
                c953760avW.LJ().LIZJ().clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        InterfaceC1106030et7.O7.LJFF(C2286608xc.LJ(0));
        InterfaceC1106030et7.M7.LJFF(new ArrayList());
        File fileFM2 = ((IHostMultiCanvas) C1161920gLG.LIZJ(IHostMultiCanvas.class)).fM2("/", false);
        MultiCanvasUtils.LIZ.getClass();
        MultiCanvasUtils.LJII(fileFM2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftItemManager@a4ec.clearAllCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
