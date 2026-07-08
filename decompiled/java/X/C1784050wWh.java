package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleSaveReOrder$1", f = "IMQuickReplyManageFragment.kt", l = {332}, m = "invokeSuspend")
public final class C1784050wWh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public IMQuickReplyManageFragment LL;
    public int LLILLJJLI;
    public final /* synthetic */ IMQuickReplyManageFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784050wWh(IMQuickReplyManageFragment iMQuickReplyManageFragment, InterfaceC1364105Vn<? super C1784050wWh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = iMQuickReplyManageFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784050wWh(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<C1784040wWg> data;
        IMQuickReplyManageFragment iMQuickReplyManageFragment;
        ?? arrayList;
        List<C1784040wWg> data2;
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                iMQuickReplyManageFragment = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            IMQuickReplyManageFragment iMQuickReplyManageFragment2 = this.LLILLL;
            InterfaceC1784070wWj interfaceC1784070wWj = iMQuickReplyManageFragment2.LLIZ;
            if (interfaceC1784070wWj != null && (data = interfaceC1784070wWj.getData()) != null) {
                Iterable iterable = (Iterable) iMQuickReplyManageFragment2.VR().LLILLJJLI.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable) {
                    IMQuickReply iMQuickReply = (IMQuickReply) obj2;
                    Iterator<C1784040wWg> it2 = data.iterator();
                    int i2 = 0;
                    while (true) {
                        if (it2.hasNext()) {
                            if (Intrinsics.LJFF(iMQuickReply.id, it2.next().LIZIZ.id)) {
                                if (i2 != -1) {
                                    arrayList2.add(obj2);
                                }
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                Iterator<C1784040wWg> it3 = data.iterator();
                int i3 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    C1784040wWg next = it3.next();
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        C1784040wWg c1784040wWg = next;
                        if (i3 < arrayList2.size() && !Intrinsics.LJFF(c1784040wWg.LIZIZ.id, ((IMQuickReply) ListProtector.get(arrayList2, i3)).id)) {
                            iMQuickReplyManageFragment = this.LLILLL;
                            IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment.LLJJIJIL;
                            if (iMQuickReplyManagePageConfig != null) {
                                iMQuickReplyManageFragment.LJ();
                                ?? VR = iMQuickReplyManageFragment.VR();
                                String str = iMQuickReplyManagePageConfig.uid;
                                InterfaceC1784070wWj interfaceC1784070wWj2 = iMQuickReplyManageFragment.LLIZ;
                                if (interfaceC1784070wWj2 != null && (data2 = interfaceC1784070wWj2.getData()) != null) {
                                    arrayList = new ArrayList(C15438062q.LJIJJ(data2, 10));
                                    Iterator<C1784040wWg> it4 = data2.iterator();
                                    while (it4.hasNext()) {
                                        arrayList.add(it4.next().LIZIZ);
                                    }
                                } else {
                                    arrayList = C13BV.INSTANCE;
                                }
                                this.LL = iMQuickReplyManageFragment;
                                this.LLILLJJLI = 1;
                                obj = VR.xQ2(str, arrayList, this);
                                if (obj == objLJFF) {
                                    C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1");
                                    return objLJFF;
                                }
                            }
                        } else {
                            i3 = i4;
                        }
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1");
            return unit;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(iMQuickReplyManageFragment);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1784030wWf(iMQuickReplyManageFragment, zBooleanValue, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
