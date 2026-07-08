package X;

import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.IIMBusinessQuickReplyAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleSaveReOrder$1$1$1", f = "IMQuickReplyManageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1784030wWf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMQuickReplyManageFragment LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784030wWf(IMQuickReplyManageFragment iMQuickReplyManageFragment, boolean z, InterfaceC1364105Vn<? super C1784030wWf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMQuickReplyManageFragment;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784030wWf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        InterfaceC1784070wWj interfaceC1784070wWj;
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.UR();
        if (this.LLILLJJLI) {
            IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LL;
            IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment.LLJJIJIL;
            if (iMQuickReplyManagePageConfig != null && (str = iMQuickReplyManagePageConfig.uid) != null && (interfaceC1784070wWj = iMQuickReplyManageFragment.LLIZ) != null) {
                BusinessQuickReplyPanelVM businessQuickReplyPanelVMVR = iMQuickReplyManageFragment.VR();
                List<C1784040wWg> data = interfaceC1784070wWj.getData();
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(data, 10));
                Iterator<C1784040wWg> it2 = data.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZIZ);
                }
                C051N.LIZIZ(str, arrayList);
                businessQuickReplyPanelVMVR.LL.setValue(arrayList);
                IIMBusinessQuickReplyAbility iIMBusinessQuickReplyAbility = (IIMBusinessQuickReplyAbility) iMQuickReplyManageFragment.LLJJIJI.getValue();
                if (iIMBusinessQuickReplyAbility != null) {
                    iIMBusinessQuickReplyAbility.FD2();
                }
            }
        } else {
            this.LL.bS();
            IMQuickReplyManageFragment iMQuickReplyManageFragment2 = this.LL;
            InterfaceC1784070wWj interfaceC1784070wWj2 = iMQuickReplyManageFragment2.LLIZ;
            if (interfaceC1784070wWj2 != null) {
                interfaceC1784070wWj2.setData(iMQuickReplyManageFragment2.SR((List) iMQuickReplyManageFragment2.VR().LLILLJJLI.getValue()));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleSaveReOrder$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
