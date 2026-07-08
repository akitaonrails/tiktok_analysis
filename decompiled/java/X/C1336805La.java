package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05La, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$addLocalDbFriend$1", f = "MufListPageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1336805La extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MufListPageViewModel LL;
    public final /* synthetic */ IMUser LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1336805La(MufListPageViewModel mufListPageViewModel, IMUser iMUser, InterfaceC1364105Vn<? super C1336805La> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mufListPageViewModel;
        this.LLILLJJLI = iMUser;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1336805La(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MufListPageViewModel@1fa1.addLocalDbFriend$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<IMUser> list = this.LL.LLILZIL;
        IMUser iMUser = this.LLILLJJLI;
        if ((list instanceof Collection) && list.isEmpty()) {
            ((ArrayList) this.LL.LLILZIL).add(this.LLILLJJLI);
        } else {
            Iterator<IMUser> it2 = list.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().getUid(), iMUser.getUid())) {
                    break;
                }
            }
            ((ArrayList) this.LL.LLILZIL).add(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.addLocalDbFriend$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
