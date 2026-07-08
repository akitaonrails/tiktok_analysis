package X;

import com.ss.android.ugc.aweme.common.EventLiveData;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iSY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.alias.AliasEditDialogUtil$buildActionGroup$1$1$2$1", f = "AliasEditDialogUtil.kt", l = {}, m = "invokeSuspend")
public final class C1243320iSY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1243310iSX LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ User LLILZ;
    public final /* synthetic */ C1243410iSh LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1243320iSY(InterfaceC1243310iSX interfaceC1243310iSX, String str, String str2, User user, C1243410iSh c1243410iSh, String str3, InterfaceC1364105Vn<? super C1243320iSY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1243310iSX;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = user;
        this.LLILZIL = c1243410iSh;
        this.LLILZLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1243320iSY(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1243310iSX interfaceC1243310iSX = this.LL;
        if (interfaceC1243310iSX != null) {
            String str = this.LLILLJJLI;
            if (this.LLILLL.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            interfaceC1243310iSX.LIZJ(str, z);
        }
        C2201941BFw c2201941BFw = IMUser.Companion;
        User user = this.LLILZ;
        c2201941BFw.getClass();
        IMUser iMUserLIZJ = C2201941BFw.LIZJ(user);
        if (iMUserLIZJ != null) {
            User user2 = this.LLILZ;
            C1440005kM.LIZ(new C1434905jX(iMUserLIZJ, user2.getUid(), user2.getSecUid()));
        }
        EventLiveData<C1243340iSa> eventLiveDataLIZ = C1076010e6h.LIZJ.LIZIZ().LIZ();
        String uid = this.LLILZ.getUid();
        String str2 = "";
        if (uid == null) {
            uid = "";
        }
        String str3 = this.LLILLJJLI;
        if (str3 != null) {
            str2 = str3;
        }
        eventLiveDataLIZ.postValue(new C1243340iSa(uid, str2));
        C1243400iSg c1243400iSg = C1243400iSg.LIZ;
        C1243410iSh c1243410iSh = this.LLILZIL;
        String str4 = this.LLILZLL;
        c1243400iSg.getClass();
        C1243400iSg.LIZ(c1243410iSh, str4, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AliasEditDialogUtil@41f8.buildActionGroup$1$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
