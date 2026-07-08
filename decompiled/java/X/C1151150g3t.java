package X;

import Y.AcS188S0300000_17;
import Y.AcS497S0100000_17;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeContactUsUrlSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0g3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151150g3t {
    public static final C1151150g3t LIZ = new C1151150g3t();

    public static void LIZ(String str, C1802410x0J c1802410x0J) {
        boolean z;
        String message;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        c1803800x2Y.getClass();
        String strLJIIJJI = C1803800x2Y.LJIIJJI(c1802410x0J);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z = true;
        } else {
            z = false;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_ban_popup_click");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_anchor");
        c474500IjALIZ.LJJII(strLJIIJJI, "popup_entrance");
        c474500IjALIZ.LJJII("gpppa", "ban_reason");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
        int i = c1802410x0J.LJFF;
        String str2 = c1802410x0J.LJ;
        int i2 = c1802410x0J.LIZIZ;
        int i3 = c1802410x0J.LIZJ;
        int i4 = c1802410x0J.LJIIIZ;
        Exception exc = c1802410x0J.LIZLLL;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        C1803800x2Y.LJIIZILJ(c1803800x2Y, i, "other", "risk", str2, i2, i3, i4, message, str, null, null, null, null, null, 32256);
    }

    public static void LIZIZ(Context context, boolean z, String str, C1802410x0J c1802410x0J) {
        int i;
        String message;
        Pair<String, String> pairLIZ = C430600GuY.LIZ(str, "<", ">");
        String first = pairLIZ.getFirst();
        SpannableStringBuilder spannableStringBuilderLIZIZ = C430600GuY.LIZIZ(context, pairLIZ.getSecond(), first, C20736316Cj.LIZIZ(R.attr.ewy, context), first, new AwS418S0200000_17(context, c1802410x0J, 43), 16);
        Uri uri = UriProtector.parse(new C495520Jby(LiveRechargeContactUsUrlSetting.INSTANCE.getValue()).LIZLLL());
        C782110Um9 c782110Um9 = new C782110Um9(context);
        if (z) {
            i = 2131844617;
        } else {
            i = 2131841616;
        }
        c782110Um9.LIZJ = context.getString(i);
        c782110Um9.LJIIIZ(spannableStringBuilderLIZIZ);
        c782110Um9.LJIILIIL(2131851997, new AcS188S0300000_17(context, uri, c1802410x0J, 1));
        c782110Um9.LJIIJ(2131841087, new AcS497S0100000_17(c1802410x0J, 2));
        boolean z2 = false;
        c782110Um9.LJIILLIIL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        c1803800x2Y.getClass();
        String strLJIIJJI = C1803800x2Y.LJIIJJI(c1802410x0J);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null && UserService.getInstance().user().getCurrentUserId() == room.getOwnerUserId()) {
            z2 = true;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_recharge_ban_popup_show");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "is_anchor");
        c474500IjALIZ.LJJII(strLJIIJJI, "popup_entrance");
        c474500IjALIZ.LJJII("gpppa", "ban_reason");
        c474500IjALIZ.LIZ();
        Integer numValueOf = Integer.valueOf(c1802410x0J.LJFF);
        String str2 = c1802410x0J.LJ;
        int i2 = c1802410x0J.LIZIZ;
        int i3 = c1802410x0J.LIZJ;
        int i4 = c1802410x0J.LJIIIZ;
        Exception exc = c1802410x0J.LIZLLL;
        if (exc == null || (message = exc.getMessage()) == null) {
            message = "";
        }
        C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, "pay", "google-apple", str2, "popup", i2, i3, i4, message, null, null, null, null, null, 24064);
    }
}
