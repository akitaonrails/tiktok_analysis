package X;

import android.os.Bundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.share.ISharePackageWrapper;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZUs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.ShareGroup$inviteNotMufToGroup$2", f = "ShareGroup.kt", l = {136}, m = "invokeSuspend")
public final class C900600ZUs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ List<IMUser> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C900600ZUs(String str, List<? extends IMUser> list, InterfaceC1364105Vn<? super C900600ZUs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C900600ZUs(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GroupInviteInfoModel groupInviteInfoModel;
        String nickname;
        C1C7U.LIZ("ShareGroup@8dc3.inviteNotMufToGroup$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        String str = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str2 = this.LLILLJJLI;
                this.LL = 1;
                obj = C1477105qL.LIZIZ(str2, 0, this, 6);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ShareGroup@8dc3.inviteNotMufToGroup$2");
                    return objLJFF;
                }
            }
            groupInviteInfoModel = (GroupInviteInfoModel) obj;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            groupInviteInfoModel = null;
        }
        if (groupInviteInfoModel == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShareGroup@8dc3.inviteNotMufToGroup$2");
            return unit;
        }
        C1370940lmO c1370940lmO = new C1370940lmO();
        String inviteUrl = groupInviteInfoModel.getInviteUrl();
        if (inviteUrl == null) {
            inviteUrl = "";
        }
        c1370940lmO.LJFF = inviteUrl;
        c1370940lmO.LIZ = "group";
        GroupSharePackage groupSharePackage = new GroupSharePackage(c1370940lmO);
        UrlModel urlModel = new UrlModel();
        String[] strArr = new String[1];
        GroupInfo groupInfo = groupInviteInfoModel.getGroupInfo();
        if (groupInfo != null) {
            str = groupInfo.avatarUrl;
        }
        strArr[0] = str;
        urlModel.setUrlList(C1697810uHb.LJIILJJIL(strArr));
        Bundle bundle = groupSharePackage.extras;
        C786410Ut5.LJJJI("invite_id", groupInviteInfoModel.getInviteId(), bundle);
        Long expiredAt = groupInviteInfoModel.getExpiredAt();
        if (expiredAt != null) {
            bundle.putLong("expired_at", expiredAt.longValue());
        }
        C786410Ut5.LJJIZ(bundle, "group", groupInviteInfoModel.getGroupInfo());
        C786410Ut5.LJJIZ(bundle, "video_cover", urlModel);
        C786410Ut5.LJJJI("enter_method", "button", bundle);
        C786410Ut5.LJJJI("cancel_toast", "true", bundle);
        User userLIZLLL = C461720I8s.LIZLLL();
        if (userLIZLLL != null && (nickname = userLIZLLL.getNickname()) != null) {
            C786410Ut5.LJJJI("inviter_name", nickname, bundle);
        }
        ISharePackageWrapper.LIZ.getClass();
        ISharePackageWrapper value = C900540ZUm.LIZIZ.getValue();
        if (value != null) {
            value.LIZIZ(groupSharePackage, this.LLILLL);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShareGroup@8dc3.inviteNotMufToGroup$2");
        return unit2;
    }
}
