package X;

import Y.ACListenerS111S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo;
import com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsViewerIndustryBadgeSetting;
import com.bytedance.android.livesdk.message.proto.EcommerceEntrance;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import webcast.api.room.GetRoomProfileCardResponse;

/* JADX INFO: renamed from: X.0Jdn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C496650Jdn extends AbstractC495800JcQ<Unit> {
    public final EnumC495780JcO LLILZIL;
    public ViewGroup LLILZLL;
    public C16F5 LLIZ;
    public C16F5 LLIZLLLIL;
    public FrameLayout LLJ;
    public boolean LLJI;
    public SMBKYCInfo LLJIJIL;
    public SMBKYBInfo LLJILJIL;
    public SMBIndustryVerificationInfo LLJILJILJ;
    public final Pair<Boolean, List<EnumC496240Jd8>> LLJILLL;

    @Override // X.AbstractC495790JcP
    public final int LJ() {
        return R.layout.h3i;
    }

    @Override // X.InterfaceC495840JcU
    public final void cC() {
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJFF() {
        C495980Jci c495980Jci = this.LL;
        C495950Jcf c495950Jcf = c495980Jci.LIZJ;
        return c495950Jcf.LJII || c495950Jcf.LJIIIIZZ || c495980Jci.LJIIIIZZ.coHostEnable;
    }

    @Override // X.AbstractC495790JcP
    public final void LJIIJ() {
        View view = this.LLILLL;
        this.LLILZLL = view != null ? (ViewGroup) view.findViewById(R.id.utz) : null;
        View view2 = this.LLILLL;
        this.LLIZ = view2 != null ? (C16F5) view2.findViewById(R.id.title) : null;
        View view3 = this.LLILLL;
        this.LLIZLLLIL = view3 != null ? (C16F5) view3.findViewById(R.id.eu1) : null;
        View view4 = this.LLILLL;
        this.LLJ = view4 != null ? (FrameLayout) view4.findViewById(R.id.b8t) : null;
        LJIJJ();
    }

    public final boolean LJIIZILJ() {
        SMBKYBInfo sMBKYBInfo = this.LLJILJIL;
        return sMBKYBInfo != null && sMBKYBInfo.status == 2;
    }

    public final boolean LJIJ() {
        SMBKYCInfo sMBKYCInfo = this.LLJIJIL;
        return sMBKYCInfo != null && sMBKYCInfo.status == 2;
    }

    public final void LJIJJ() {
        if (this.LLJI) {
            View view = this.LLILLL;
            if (view != null) {
                C500260Jjc.LJIILIIL(view);
                return;
            }
            return;
        }
        if (LJIIZILJ() || LJIJ()) {
            View view2 = this.LLILLL;
            if (view2 != null) {
                C500260Jjc.LLFFF(view2);
                return;
            }
            return;
        }
        View view3 = this.LLILLL;
        if (view3 != null) {
            C500260Jjc.LJIILIIL(view3);
        }
    }

    @Override // X.AbstractC495790JcP
    public final EnumC495780JcO LIZLLL() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC495790JcP
    public final Pair<Boolean, List<EnumC496240Jd8>> LJI() {
        return this.LLJILLL;
    }

    public C496650Jdn(C495920Jcc c495920Jcc) {
        super(c495920Jcc);
        this.LLILZIL = EnumC495780JcO.SERVICE_PLUS;
        this.LLJILLL = new Pair<>(Boolean.TRUE, C13BV.INSTANCE);
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILIIL(GetRoomProfileCardResponse.ResponseData responseData) {
        LJIJI(responseData);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJI(webcast.api.room.GetRoomProfileCardResponse.ResponseData r4) {
        /*
            r3 = this;
            webcast.api.room.SMBVerification r0 = r4.verificationInfo
            r2 = 0
            if (r0 == 0) goto L1f
            com.bytedance.android.livesdk.chatroom.api.SMBVerificationInfo r1 = r0.verificationInfo
            if (r1 == 0) goto L20
            com.bytedance.android.livesdk.chatroom.api.SMBKYBInfo r0 = r1.kybInfo
        Lb:
            r3.LLJILJIL = r0
            if (r1 == 0) goto L1d
            com.bytedance.android.livesdk.chatroom.api.SMBKYCInfo r0 = r1.kycInfo
        L11:
            r3.LLJIJIL = r0
            if (r1 == 0) goto L17
            com.bytedance.android.livesdk.chatroom.api.SMBIndustryVerificationInfo r2 = r1.industryVerificationInfo
        L17:
            r3.LLJILJILJ = r2
            r3.LJIJJ()
            return
        L1d:
            r0 = r2
            goto L11
        L1f:
            r1 = r2
        L20:
            r0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C496650Jdn.LJIJI(webcast.api.room.GetRoomProfileCardResponse$ResponseData):void");
    }

    @Override // X.AbstractC495790JcP
    public final boolean LJIIIZ(User user, Object obj) {
        String str;
        C16F5 c16f5;
        Integer numValueOf;
        C16F5 c16f52 = this.LLIZ;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJI(2131850971));
        }
        SMBIndustryVerificationInfo sMBIndustryVerificationInfo = this.LLJILJILJ;
        boolean z = false;
        if (sMBIndustryVerificationInfo == null || !LivePcsViewerIndustryBadgeSetting.INSTANCE.getValue() || sMBIndustryVerificationInfo.status != 3 || (str = sMBIndustryVerificationInfo.approvedIndustryBadgeName) == null || str.length() <= 0) {
            str = null;
        }
        if (LJIIZILJ()) {
            C16F5 c16f53 = this.LLIZLLLIL;
            if (c16f53 != null) {
                c16f53.setText(C497740JfY.LJIJI(2131850967));
            }
        } else if (str != null) {
            C16F5 c16f54 = this.LLIZLLLIL;
            if (c16f54 != null) {
                c16f54.setText(str);
            }
        } else if (LJIJ() && (c16f5 = this.LLIZLLLIL) != null) {
            c16f5.setText(C497740JfY.LJIJI(2131850972));
        }
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        User userLJIJJLI = UserService.getInstance().user().LJIJJLI();
        View view = this.LLILLL;
        if (view != null) {
            C495870JcX c495870JcX = InterfaceC495890JcZ.LJJLL;
            ACListenerS111S0200000_7 aCListenerS111S0200000_7 = new ACListenerS111S0200000_7(room, userLJIJJLI, 39);
            C495980Jci c495980Jci = this.LL;
            EnumC495860JcW enumC495860JcW = EnumC495860JcW.BUSINESS;
            c495870JcX.getClass();
            C495870JcX.LIZIZ(view, aCListenerS111S0200000_7, true, c495980Jci, enumC495860JcW, "service_plus", null);
        }
        EcommerceEntrance ecommerceEntrance = user.ecommerceEntrance;
        if (ecommerceEntrance != null && (numValueOf = Integer.valueOf(ecommerceEntrance.entranceType)) != null && (numValueOf.intValue() == 1 || numValueOf.intValue() == 2)) {
            z = true;
        }
        this.LLJI = z;
        LJIJJ();
        return C500260Jjc.LJJJJIZL(this.LLILLL);
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILJJIL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        LJIJI(responseData);
        return null;
    }

    @Override // X.AbstractC495790JcP
    public final Object LJIILL(GetRoomProfileCardResponse.ResponseData responseData, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        LJIJI(responseData);
        return null;
    }
}
