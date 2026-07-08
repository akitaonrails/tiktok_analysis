package X;

import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BlockStatus;
import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ZB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.ability.UserCardListAbility$block$1", f = "UserCardListAbility.kt", l = {409}, m = "invokeSuspend")
public final class C09ZB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ UserCardListAbility LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZB(UserCardListAbility userCardListAbility, String str, String str2, int i, String str3, InterfaceC1364105Vn<? super C09ZB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = userCardListAbility;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = i;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        C1C7U.LIZ("UserCardListAbility@7b48.block$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            UserCardListAbility userCardListAbility = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            int i3 = this.LLILZIL;
            this.LL = 1;
            obj = userCardListAbility.LIZ(i3, str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserCardListAbility@7b48.block$1");
                return objLJFF;
            }
        }
        BlockStruct blockStruct = (BlockStruct) obj;
        NextLiveData<BlockStatus> nextLiveDataLJI = ((IUserService) ServiceManager.get().getService(IUserService.class)).LJI();
        String str3 = this.LLILLL;
        if (blockStruct != null) {
            i = blockStruct.blockStatus;
        } else {
            i = 0;
        }
        nextLiveDataLJI.postValue(new BlockStatus(str3, i));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserCardListAbility@7b48.block$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
