package X;

import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import iyl.i3;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import oyl.d0;

/* JADX INFO: renamed from: X.0t5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.toolbar.legacy.LegacyRecordToolbarScene$mobIconShowInRetake$1", f = "LegacyRecordToolbarScene.kt", l = {}, m = "invokeSuspend")
public final class C1652130t5v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1657710tEv LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1652130t5v(C1657710tEv c1657710tEv, InterfaceC1364105Vn<? super C1652130t5v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1657710tEv;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1652130t5v(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LegacyRecordToolbarScene@7a.mobIconShowInRetake$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        d0 d0Var = this.LL.LLJLL;
        if (d0Var == null) {
            d0Var = null;
        }
        List<i3> currentDisplayListData = d0Var.getCurrentDisplayListData();
        C1657710tEv c1657710tEv = this.LL;
        Iterator<i3> it2 = currentDisplayListData.iterator();
        while (it2.hasNext()) {
            C1650980t44 c1650980t44LIZJ = c1657710tEv.LLJI.LIZJ(it2.next().LLILLL.getType());
            if (c1650980t44LIZJ != null) {
                C1651440t4o c1651440t4o = C1651440t4o.LIZ;
                ShortVideoContext shortVideoContext = c1657710tEv.LLJILJIL;
                c1651440t4o.getClass();
                C1651440t4o.LIZIZ(shortVideoContext, c1650980t44LIZJ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LegacyRecordToolbarScene@7a.mobIconShowInRetake$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
