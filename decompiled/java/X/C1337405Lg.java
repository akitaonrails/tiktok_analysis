package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.fragment.muflist.MufListPageViewModel$onFriendsStatusChange$1", f = "MufListPageViewModel.kt", l = {548}, m = "invokeSuspend")
public final class C1337405Lg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MufListPageViewModel LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1337405Lg(MufListPageViewModel mufListPageViewModel, Integer num, Integer num2, String str, InterfaceC1364105Vn<? super C1337405Lg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mufListPageViewModel;
        this.LLILLL = num;
        this.LLILZ = num2;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1337405Lg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MufListPageViewModel@1fa1.onFriendsStatusChange$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MufListPageViewModel mufListPageViewModel = this.LLILLJJLI;
            C2232408os c2232408os = mufListPageViewModel.LLILZLL;
            C1337105Ld c1337105Ld = new C1337105Ld(mufListPageViewModel, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c2232408os, c1337105Ld);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MufListPageViewModel@1fa1.onFriendsStatusChange$1");
                return objLJFF;
            }
        }
        IMUser iMUser = (IMUser) obj;
        if (iMUser == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MufListPageViewModel@1fa1.onFriendsStatusChange$1");
            return unit;
        }
        Integer num = this.LLILLL;
        int value = C0SY7.FOLLOW_MUTUAL.getValue();
        int i2 = 0;
        if (num == null || num.intValue() != value) {
            i2 = -1;
        }
        iMUser.setType(i2);
        Integer num2 = this.LLILLL;
        if (num2 != null) {
            iMUser.setFollowStatus(num2.intValue());
        }
        Integer num3 = this.LLILZ;
        if (num3 != null) {
            iMUser.setFollowerStatus(num3.intValue());
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MufListPageViewModel@1fa1.onFriendsStatusChange$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
