package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.plugin.VOSnapshotPlugin$storeBufferToKeva$1$1", f = "VOSnapshotPlugin.kt", l = {}, m = "invokeSuspend")
public final class C884410Yml extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C884470Ymr LL;
    public final /* synthetic */ C884270YmX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C884410Yml(C884470Ymr c884470Ymr, C884270YmX c884270YmX, InterfaceC1364105Vn<? super C884410Yml> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c884470Ymr;
        this.LLILLJJLI = c884270YmX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884410Yml(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VOSnapshotPlugin@bc0c.storeBufferToKeva$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884470Ymr c884470Ymr = this.LL;
        C884270YmX c884270YmX = this.LLILLJJLI;
        Collection<InterfaceC884440Ymo> collectionValues = c884270YmX.LJIIL().values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator<T> it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((InterfaceC884440Ymo) it2.next()).copyData());
        }
        c884470Ymr.LJIIJ(c884270YmX, new ArrayList(arrayList));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VOSnapshotPlugin@bc0c.storeBufferToKeva$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
