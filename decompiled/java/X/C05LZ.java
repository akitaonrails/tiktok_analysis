package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.05LZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.util.MessageRequestKvUpdater$updateFollowerNum$2", f = "MessageRequestKvUpdater.kt", l = {}, m = "invokeSuspend")
public final class C05LZ extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends Pair<? extends String, ? extends Long>>>, Object> {
    public C05LZ(InterfaceC1364105Vn<? super C05LZ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LZ(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends Pair<? extends String, ? extends Long>>> interfaceC1364105Vn) {
        return new C05LZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageRequestKvUpdater@d42f.updateFollowerNum$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> listLJII = C876470YZx.LIZ().LJII();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJII, 10));
        for (String str : listLJII) {
            arrayList.add(new Pair(str, C2286608xc.LJFF(C0YNP.LJII(str))));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((Number) ((Pair) obj2).getSecond()).longValue() > 0) {
                arrayList2.add(obj2);
            }
        }
        C1C7U.LIZIZ("MessageRequestKvUpdater@d42f.updateFollowerNum$2");
        return arrayList2;
    }
}
