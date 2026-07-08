package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserB2CAccountInfo;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05LJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.preload.UserInfoPreloadTaskKt$tryPreLoadUserAndBizInfo$1", f = "UserInfoPreloadTask.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT, 25}, m = "invokeSuspend")
public final class C05LJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05LJ(String str, InterfaceC1364105Vn<? super C05LJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05LJ(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String curUserId;
        IMUserBizInfo imUserBizInfo;
        IMUserB2CAccountInfo userB2CAccountInfo;
        IMUser iMUser;
        IMUserBizInfo imUserBizInfo2;
        IMUserB2CAccountInfo userB2CAccountInfo2;
        C1C7U.LIZ("UserInfoPreloadTaskKt@44c9.tryPreLoadUserAndBizInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        String str2 = null;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    curUserId = (String) this.LL;
                    C155000ia.LIZIZ(obj);
                    iMUser = (IMUser) obj;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("tryPreLoadUserAndBizInfo for uid ");
                    sbLIZ.append(curUserId);
                    sbLIZ.append(", user_tags: ");
                    if (iMUser != null && (imUserBizInfo2 = iMUser.getImUserBizInfo()) != null && (userB2CAccountInfo2 = imUserBizInfo2.getUserB2CAccountInfo()) != null) {
                        str2 = userB2CAccountInfo2.userTags;
                    }
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("UserInfoPreloadTaskKt@44c9.tryPreLoadUserAndBizInfo$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IMContactApi.LIZ.getClass();
            C1BGS c1bgsLJ = C069P.LIZ().LJ();
            String str3 = this.LLILLL;
            this.LLILLJJLI = 1;
            obj = c1bgsLJ.LJIJ(str3, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("UserInfoPreloadTaskKt@44c9.tryPreLoadUserAndBizInfo$1");
                return objLJFF;
            }
        }
        IMUser iMUser2 = (IMUser) obj;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tryPreLoadUserAndBizInfo for uid ");
        sbLIZ2.append(this.LLILLL);
        sbLIZ2.append(", user_tags: ");
        if (iMUser2 != null && (imUserBizInfo = iMUser2.getImUserBizInfo()) != null && (userB2CAccountInfo = imUserBizInfo.getUserB2CAccountInfo()) != null) {
            str = userB2CAccountInfo.userTags;
        } else {
            str = null;
        }
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        C0XQ7.LJ();
        if (C0XQ7.LIZ.LJIIJ().isLogin()) {
            C0XQ7.LJ();
            curUserId = C0XQ7.LIZ.LJIIJ().getCurUserId();
            if (curUserId.length() != 0) {
                IMContactApi.LIZ.getClass();
                C1BGS c1bgsLJ2 = C069P.LIZ().LJ();
                this.LL = curUserId;
                this.LLILLJJLI = 2;
                obj = c1bgsLJ2.LJIJ(curUserId, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("UserInfoPreloadTaskKt@44c9.tryPreLoadUserAndBizInfo$1");
                    return objLJFF;
                }
                iMUser = (IMUser) obj;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("tryPreLoadUserAndBizInfo for uid ");
                sbLIZ3.append(curUserId);
                sbLIZ3.append(", user_tags: ");
                if (iMUser != null) {
                    str2 = userB2CAccountInfo2.userTags;
                }
                sbLIZ3.append(str2);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("UserInfoPreloadTaskKt@44c9.tryPreLoadUserAndBizInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
