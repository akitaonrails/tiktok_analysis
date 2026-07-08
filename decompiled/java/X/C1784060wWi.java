package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.im.b2c.replies.data.IMQuickReplyManagePageConfig;
import com.ss.android.ugc.aweme.im.b2c.replies.model.IMQuickReply;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.BusinessQuickReplyPanelVM;
import com.ss.android.ugc.aweme.im.b2c.replies.vm.IIMBusinessQuickReplyAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0wWi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyManageFragment$handleDelete$1$1$1$1$1$1", f = "IMQuickReplyManageFragment.kt", l = {}, m = "invokeSuspend")
public final class C1784060wWi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMQuickReplyManageFragment LL;
    public final /* synthetic */ List<IMQuickReply> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1784060wWi(IMQuickReplyManageFragment iMQuickReplyManageFragment, List<IMQuickReply> list, InterfaceC1364105Vn<? super C1784060wWi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMQuickReplyManageFragment;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1784060wWi(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("IMQuickReplyManageFragment@b31d.handleDelete$1$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.UR();
        List<IMQuickReply> list = this.LLILLJJLI;
        if (list == null) {
            this.LL.bS();
        } else {
            IMQuickReplyManageFragment iMQuickReplyManageFragment = this.LL;
            InterfaceC1784070wWj interfaceC1784070wWj = iMQuickReplyManageFragment.LLIZ;
            if (interfaceC1784070wWj != null) {
                interfaceC1784070wWj.LIZJ(list);
            }
            IMQuickReplyManagePageConfig iMQuickReplyManagePageConfig = iMQuickReplyManageFragment.LLJJIJIL;
            if (iMQuickReplyManagePageConfig != null && (str = iMQuickReplyManagePageConfig.uid) != null) {
                BusinessQuickReplyPanelVM businessQuickReplyPanelVMVR = iMQuickReplyManageFragment.VR();
                ArrayList arrayList = new ArrayList(C051N.LIZ(str));
                ArrayList arrayList2 = new ArrayList((Collection) businessQuickReplyPanelVMVR.LL.getValue());
                for (IMQuickReply iMQuickReply : list) {
                    Iterator it2 = arrayList.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((IMQuickReply) it2.next()).id, iMQuickReply.id)) {
                            if (i2 >= 0 && i2 < arrayList.size()) {
                                ListProtector.remove(arrayList, i2);
                            }
                        } else {
                            i2++;
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(((IMQuickReply) it3.next()).id, iMQuickReply.id)) {
                            if (i >= 0 && i < arrayList2.size()) {
                                ListProtector.remove(arrayList2, i);
                            }
                        } else {
                            i++;
                        }
                    }
                }
                C051N.LIZIZ(str, arrayList);
                businessQuickReplyPanelVMVR.LL.setValue(arrayList2);
                IIMBusinessQuickReplyAbility iIMBusinessQuickReplyAbility = (IIMBusinessQuickReplyAbility) iMQuickReplyManageFragment.LLJJIJI.getValue();
                if (iIMBusinessQuickReplyAbility != null) {
                    iIMBusinessQuickReplyAbility.FD2();
                }
            }
            C1389890mGx c1389890mGx = new C1389890mGx(iMQuickReplyManageFragment);
            c1389890mGx.LJIIIZ(2131830552);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMQuickReplyManageFragment@b31d.handleDelete$1$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
