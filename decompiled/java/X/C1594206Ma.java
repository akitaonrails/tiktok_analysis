package X;

import com.ss.android.ugc.aweme.im.contacts.impl.data.api.IMContactNetworkApi;
import com.ss.android.ugc.aweme.im.contacts.impl.model.IMUserProfileInfo;
import com.ss.android.ugc.aweme.im.contacts.impl.model.UserProfileResponse;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06Ma, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.contacts.impl.helper.IMContactManager$getIMUserFromDB$1$fetch$1", f = "IMContactManager.kt", l = {238, 240}, m = "invokeSuspend")
public final class C1594206Ma extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public UserProfileResponse LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594206Ma(String str, String str2, boolean z, InterfaceC1364105Vn<? super C1594206Ma> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1594206Ma(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UserProfileResponse userProfileResponse;
        C1C7U.LIZ("IMContactManager@fb8a.getIMUserFromDB$1$fetch$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    userProfileResponse = this.LL;
                    C155000ia.LIZIZ(obj);
                    C1594306Mb.LIZ(userProfileResponse.selfBizInfo);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1$fetch$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1BG1.LIZ.getClass();
            IMContactNetworkApi iMContactNetworkApi = (IMContactNetworkApi) C1BG1.LJIIIZ.getValue();
            String strLJ = C051M.LJ(new String[]{this.LLILZ}, false);
            String str = this.LLILZIL;
            boolean z = this.LLILZLL;
            this.LLILLL = 1;
            obj = iMContactNetworkApi.LIZIZ(strLJ, str, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1$fetch$1");
                return objLJFF;
            }
        }
        userProfileResponse = (UserProfileResponse) obj;
        C1BG1 c1bg1 = C1BG1.LIZ;
        List listSingletonList = Collections.singletonList(this.LLILZ);
        List<IMUserProfileInfo> list = userProfileResponse.users;
        c1bg1.getClass();
        C1BG1.LJJ(listSingletonList, list);
        List<IMUserProfileInfo> list2 = userProfileResponse.users;
        if (list2 != null) {
            String str2 = this.LLILZIL;
            IMUserProfileInfo iMUserProfileInfo = (IMUserProfileInfo) C13LP.LJJJLZIJ(0, list2);
            this.LL = userProfileResponse;
            this.LLILLJJLI = list2;
            this.LLILLL = 2;
            if (c1bg1.LJJIII(iMUserProfileInfo, str2, this) == objLJFF) {
                C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1$fetch$1");
                return objLJFF;
            }
        }
        C1594306Mb.LIZ(userProfileResponse.selfBizInfo);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMContactManager@fb8a.getIMUserFromDB$1$fetch$1");
        return unit2;
    }
}
