package X;

import com.bytedance.android.live.effect.model.composer.LiveComposerNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.live.effect.composer.LiveComposerSQLiteHelper$saveComposerNodeListForScene$1", f = "LiveComposerSQLiteHelper.kt", l = {}, m = "invokeSuspend")
public final class C314590CUv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C770850ULr LL;
    public final /* synthetic */ List<LiveComposerNode> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314590CUv(C770850ULr c770850ULr, List<LiveComposerNode> list, InterfaceC1364105Vn<? super C314590CUv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c770850ULr;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C314590CUv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveComposerSQLiteHelper@cd50.saveComposerNodeListForScene$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C770850ULr c770850ULr = this.LL;
            List<LiveComposerNode> list = this.LLILLJJLI;
            synchronized (c770850ULr) {
                try {
                    c770850ULr.LJFF(C13LP.LLIIII(list));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveComposerSQLiteHelper@cd50.saveComposerNodeListForScene$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
