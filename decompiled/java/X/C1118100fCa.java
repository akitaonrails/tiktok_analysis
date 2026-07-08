package X;

import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.content.Context;
import com.bytedance.android.livesdk.userservice.UserApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS418S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0fCa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118100fCa {
    public static final C1118100fCa LIZ = new C1118100fCa();

    public static EnumC1117590fBl LIZIZ() {
        Long l = (Long) DataChannelGlobal.LLILZ.gg0(C1148060fyu.class);
        C1117580fBk c1117580fBk = EnumC1117590fBl.Companion;
        Long lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
        c1117580fBk.getClass();
        return C1117580fBk.LIZ(lValueOf);
    }

    public static void LIZ(C1117630fBp c1117630fBp, InterfaceC1118110fCb interfaceC1118110fCb) {
        C480460Ism.LIZ().getClass();
        ((UserApi) C480460Ism.LIZLLL(UserApi.class)).updateSwitch(15L, c1117630fBp.LIZ.getValue()).LJIILIIL(new C0UO0()).LJJLL(new AfS153S0200000_17(interfaceC1118110fCb, c1117630fBp, 7), new AfS186S0100000_17(interfaceC1118110fCb, 37));
    }

    public static void LIZJ(Context context, C1117630fBp c1117630fBp, InterfaceC1118110fCb interfaceC1118110fCb) {
        EnumC1117590fBl enumC1117590fBl;
        String str;
        if (context != null && (enumC1117590fBl = c1117630fBp.LIZ) != EnumC1117590fBl.UNKNOWN) {
            if (enumC1117590fBl == EnumC1117590fBl.OFF) {
                AwS418S0200000_17 awS418S0200000_17 = new AwS418S0200000_17(c1117630fBp, interfaceC1118110fCb, 16);
                AwS561S0100000_17 awS561S0100000_17 = new AwS561S0100000_17(interfaceC1118110fCb, 133);
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                C985403tE.LIZ(c1397580mTM, new AwS383S0200000_17(awS418S0200000_17, awS561S0100000_17, 56));
                c1397580mTM.LJFF(2131852559);
                c1397580mTM.LIZ(2131852558);
                c1397580mTM.LIZLLL(AFwS254S0000000_17.get$arr$(109));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_gallery_opt_out_popup");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII("user", "user_type");
                c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                c474500IjALIZ.LIZ();
            } else {
                LIZ(c1117630fBp, interfaceC1118110fCb);
            }
            EnumC1117590fBl enumC1117590fBl2 = c1117630fBp.LIZ;
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_gallery_setting_toggle");
            c474500IjALIZ2.LJIL();
            c474500IjALIZ2.LJJII("user", "user_type");
            if (enumC1117590fBl2 == EnumC1117590fBl.ON) {
                str = "toggle_on";
            } else {
                str = "toggle_off";
            }
            c474500IjALIZ2.LJJII(str, "toggle_status");
            c474500IjALIZ2.LIZ();
        }
    }
}
