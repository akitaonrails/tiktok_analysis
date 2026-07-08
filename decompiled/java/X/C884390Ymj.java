package X;

import com.bytedance.keva.Keva;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ymj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.plugin.VOSnapshotPlugin$afterPageRegistered$1", f = "VOSnapshotPlugin.kt", l = {}, m = "invokeSuspend")
public final class C884390Ymj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884270YmX LL;
    public final /* synthetic */ C884470Ymr LLILLJJLI;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884390Ymj(C884270YmX c884270YmX, C884470Ymr c884470Ymr, InterfaceC879010Ye3 interfaceC879010Ye3, InterfaceC1364105Vn<? super C884390Ymj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884270YmX;
        this.LLILLJJLI = c884470Ymr;
        this.LLILLL = interfaceC879010Ye3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884390Ymj(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VOSnapshotPlugin@bc0c.afterPageRegistered$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.LJIIJ) {
            C309160C9y.LIZ();
            List<? extends InterfaceC884440Ymo> listLJLLLL = C13LP.LJLLLL(new Comparator() { // from class: X.0Ymk
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return C20085613iQ.LIZIZ(Long.valueOf(((InterfaceC884440Ymo) t2).getSortOrder()), Long.valueOf(((InterfaceC884440Ymo) t).getSortOrder()));
                }
            }, this.LLILLJJLI.LIZLLL(this.LL));
            Keva kevaLIZIZ = this.LLILLJJLI.LIZIZ();
            C884470Ymr c884470Ymr = this.LLILLJJLI;
            C884270YmX c884270YmX = this.LL;
            c884470Ymr.getClass();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c884270YmX.LIZ.getKey());
            sbLIZ.append("_hasMore");
            boolean z = kevaLIZIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false);
            if (this.LL.LIZ.LJIIL().LIZIZ) {
                C884270YmX c884270YmX2 = this.LL;
                InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILLL;
                for (InterfaceC884440Ymo interfaceC884440Ymo : listLJLLLL) {
                    Iterator<InterfaceC884950Ynd> it2 = c884270YmX2.LIZLLL.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZ(interfaceC884440Ymo, interfaceC879010Ye3, true);
                    }
                }
            }
            C884270YmX c884270YmX3 = this.LL;
            c884270YmX3.LJIJ = listLJLLLL;
            c884270YmX3.LJIJI = z;
            if (!c884270YmX3.LJIIJ) {
                String str = this.LLILLJJLI.LIZLLL;
                listLJLLLL.size();
                Objects.toString(this.LL.LIZ.getKey());
                C309160C9y.LIZLLL(str);
                List<InterfaceC884050YmB> listLJI = this.LL.LJI();
                C884270YmX c884270YmX4 = this.LL;
                Iterator<InterfaceC884050YmB> it3 = listLJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZJ(c884270YmX4, listLJLLLL, z, "snapshot");
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VOSnapshotPlugin@bc0c.afterPageRegistered$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
