package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.MAFIMUser;
import com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.manager.MAFListManager;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.manager.MAFListManager$loadMAFCache$2", f = "MAFListManager.kt", l = {}, m = "invokeSuspend")
public final class C1345305Oh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MAFListManager LL;
    public final /* synthetic */ InterfaceC1337505Lh LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345305Oh(MAFListManager mAFListManager, InterfaceC1337505Lh interfaceC1337505Lh, InterfaceC1364105Vn<? super C1345305Oh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mAFListManager;
        this.LLILLJJLI = interfaceC1337505Lh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1345305Oh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MAFListManager@bd1e.loadMAFCache$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MAFListManager mAFListManager = this.LL;
        mAFListManager.getClass();
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.addAll(((InterfaceC1725106pF) mAFListManager.LIZ.getValue()).LJJI());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (arrayList.size() > 100) {
            MAFListManager.LIZJ = true;
            arrayList = new ArrayList(arrayList.subList(0, 100));
        } else {
            MAFListManager.LIZJ = false;
        }
        MAFListManager.LIZIZ = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((IMUser) obj2).getFollowStatus() != 2) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(C2201951BFx.LIZIZ((MAFIMUser) it2.next()));
        }
        this.LLILLJJLI.setData(arrayList3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MAFListManager@bd1e.loadMAFCache$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
