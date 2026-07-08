package X;

import com.bytedance.keva.Keva;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS368S0200000_2;
import njp.a;

/* JADX INFO: renamed from: X.05Lz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.offline.store.OfflineCommentKevaStore$warmUpMirror$2", f = "OfflineCommentKevaStore.kt", l = {}, m = "invokeSuspend")
public final class C1339305Lz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1338705Lt LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1339305Lz(C1338705Lt c1338705Lt, InterfaceC1364105Vn<? super C1339305Lz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1338705Lt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1339305Lz(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("OfflineCommentKevaStore@1c73.warmUpMirror$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Keva kevaLJIILIIL = this.LL.LJIILIIL();
        ConcurrentHashMap<String, C05M1> concurrentHashMapLJIIJ = this.LL.LJIIJ();
        C08QT c08qt = new C08QT(C09RB.LJIJI(C09RB.LJIIIZ(new C1939607ik(kevaLJIILIIL.getAll().keySet()), AFwS229S0000000_2.get$arr$(684)), new AwS368S0200000_2(this.LL, kevaLJIILIIL, 99)));
        while (c08qt.hasNext()) {
            C05M1 c05m1 = (C05M1) c08qt.next();
            concurrentHashMapLJIIJ.putIfAbsent(c05m1.LIZ, c05m1);
        }
        this.LL.LIZJ.set(C1338705Lt.LJIIIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OfflineCommentKevaStore@1c73.warmUpMirror$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
