package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup;
import com.ss.android.ugc.aweme.im.common.model.GroupInviteInfoModel;
import com.ss.android.ugc.aweme.im.message.content.GroupInfo;
import com.ss.android.ugc.aweme.im.saas.host.api.share.IMShareService;
import com.ss.android.ugc.aweme.share.GroupSharePackage;
import com.ss.android.ugc.aweme.share.qrcode.GroupQRShareChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.banner.ShareGroupForAIGroupShotPopup$onViewCreated$1", f = "ShareGroupForAIGroupShotPopup.kt", l = {67, 69, 92}, m = "invokeSuspend")
public final class C1608306Rl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareGroupForAIGroupShotPopup LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1608306Rl(ShareGroupForAIGroupShotPopup shareGroupForAIGroupShotPopup, InterfaceC1364105Vn<? super C1608306Rl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareGroupForAIGroupShotPopup;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1608306Rl(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1532105zD c1532105zD = new C1532105zD(this.LLILLJJLI, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq, c1532105zD) == objLJFF) {
                C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLJJLI.LLJ;
            if (str == null) {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
                return unit3;
            }
            this.LL = 1;
            obj = C1477105qL.LIZIZ(str, 0, this, 6);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
                return objLJFF;
            }
        }
        GroupInviteInfoModel groupInviteInfoModel = (GroupInviteInfoModel) obj;
        C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
        String inviteUrl = groupInviteInfoModel.getInviteUrl();
        String inviteId = groupInviteInfoModel.getInviteId();
        Long expiredAt = groupInviteInfoModel.getExpiredAt();
        GroupInfo groupInfo = groupInviteInfoModel.getGroupInfo();
        c913630Zsn.LIZJ.getClass();
        GroupSharePackage groupSharePackageLIZLLL = C900610ZUt.LIZLLL(inviteUrl, inviteId, expiredAt, groupInfo, "chat_room_button");
        C1371600lnS c1371600lnS = new C1371600lnS();
        c1371600lnS.LJJIIJ = groupSharePackageLIZLLL;
        ShareGroupForAIGroupShotPopup shareGroupForAIGroupShotPopup = this.LLILLJJLI;
        IMShareService.LIZ.getClass();
        IMShareService iMShareServiceLIZ = C1608506Rn.LIZ();
        if (iMShareServiceLIZ != null) {
            iMShareServiceLIZ.LJIJ(shareGroupForAIGroupShotPopup.getActivity(), c1371600lnS);
        }
        if (C1608406Rm.LIZ()) {
            c1371600lnS.LIZIZ(new GroupQRShareChannel(groupSharePackageLIZLLL));
        }
        C1371590lnR c1371590lnR = new C1371590lnR(c1371600lnS);
        Context context = this.LLILLJJLI.getContext();
        if (context == null) {
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
            return unit4;
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
        C15477064d c15477064d = new C15477064d(this.LLILLJJLI, c1371590lnR, groupSharePackageLIZLLL, context, null);
        this.LL = 3;
        if (C23250099c.LJI(this, abstractC2238408pq2, c15477064d) == objLJFF) {
            C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
            return objLJFF;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("ShareGroupForAIGroupShotPopup@b877.onViewCreated$1");
        return unit5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
