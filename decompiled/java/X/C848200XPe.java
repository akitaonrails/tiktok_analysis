package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlData;
import com.ss.android.ugc.aweme.account.login.v2.network.LongAvatarUrlResponse;
import com.ss.android.ugc.aweme.account.login.v2.network.UserBasicInfoApi;
import com.ss.android.ugc.aweme.account.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.oneclicklogin.OIDCToken;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.0XPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.base.LongExpireAvatarURLViewModel$Companion$updateAvatarUrlAsync$1", f = "LongExpireAvatarURLViewModel.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C848200XPe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommonUserInfo LLILLJJLI;
    public final /* synthetic */ BaseLoginMethod LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C848200XPe(CommonUserInfo commonUserInfo, BaseLoginMethod baseLoginMethod, Function0<Unit> function0, InterfaceC1364105Vn<? super C848200XPe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commonUserInfo;
        this.LLILLL = baseLoginMethod;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C848200XPe(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object objLIZ = obj;
        C1C7U.LIZ("LongExpireAvatarURLViewModel$Companion@8b80.updateAvatarUrlAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            UserBasicInfoApi userBasicInfoApi = UserBasicInfoApi.LIZ;
            CommonUserInfo commonUserInfo = this.LLILLJJLI;
            String str2 = commonUserInfo.userName;
            Integer num = commonUserInfo.avatarExpires;
            String strLJ = null;
            if (num == null) {
                str = null;
            } else {
                str = commonUserInfo.avatarUrl;
            }
            String str3 = commonUserInfo.avatarUri;
            if (C846430XIj.LIZIZ()) {
                C0XU4 c0xu4 = C0XU4.LIZ;
                String uid = this.LLILLL.getUid();
                c0xu4.getClass();
                OIDCToken oIDCTokenLIZIZ = C0XU4.LIZIZ(uid);
                List<String> list = C0XFW.LIZ;
                if (oIDCTokenLIZIZ != null) {
                    strLJ = oIDCTokenLIZIZ.tokenID;
                }
                strLJ = C0XFW.LJ(strLJ);
            }
            this.LL = 1;
            objLIZ = userBasicInfoApi.LIZ(1, str2, str, str3, num, strLJ, this);
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("LongExpireAvatarURLViewModel$Companion@8b80.updateAvatarUrlAsync$1");
                return objLJFF;
            }
        }
        LongAvatarUrlResponse longAvatarUrlResponse = (LongAvatarUrlResponse) objLIZ;
        LongAvatarUrlData longAvatarUrlData = longAvatarUrlResponse.data;
        if (u.LJIJI("success", longAvatarUrlResponse.message, true) && longAvatarUrlData != null) {
            if (C123100dR.LIZ(longAvatarUrlData.avatarUrl) && !Intrinsics.LJFF(longAvatarUrlData.avatarUrl, this.LLILLJJLI.avatarUrl)) {
                C0XUE c0xue = C0XUE.LIZ;
                String uid2 = this.LLILLL.getUid();
                String str4 = longAvatarUrlData.avatarUrl;
                String str5 = longAvatarUrlData.avatarUri;
                Integer num2 = longAvatarUrlData.expires;
                synchronized (c0xue) {
                    boolean z = false;
                    for (BaseLoginMethod baseLoginMethod : (ArrayList) C0XUE.LIZIZ) {
                        if (Intrinsics.LJFF(baseLoginMethod.getUid(), uid2)) {
                            CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                            if (commonUserInfo2 != null) {
                                baseLoginMethod.setCommonUserInfo(new CommonUserInfo(commonUserInfo2.userName, str4, commonUserInfo2.secUid, commonUserInfo2.screenName, str5, num2));
                            }
                            z = true;
                        }
                    }
                    if (z) {
                        C0XU4 c0xu42 = C0XU4.LIZ;
                        List<BaseLoginMethod> list2 = C0XUE.LIZIZ;
                        c0xu42.getClass();
                        C0XU4.LIZJ(list2, false);
                    }
                }
                Function0<Unit> function0 = this.LLILZ;
                if (function0 != null) {
                    function0.invoke();
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LongExpireAvatarURLViewModel$Companion@8b80.updateAvatarUrlAsync$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LongExpireAvatarURLViewModel$Companion@8b80.updateAvatarUrlAsync$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
