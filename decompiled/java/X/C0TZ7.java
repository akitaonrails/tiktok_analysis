package X;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0TZ7, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TZ7 {
    public static final C0TZ7 LIZ = new C0TZ7();

    public static boolean LIZIZ(DataChannel dataChannel) {
        Room room;
        Boolean bool = null;
        if (dataChannel != null) {
            bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class);
        }
        boolean zLJJJI = C500260Jjc.LJJJI(bool);
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null && !zLJJJI) {
            return room.enableOptimizeSensitiveWord;
        }
        return true;
    }

    public static void LIZ(C474500IjA c474500IjA, boolean z) {
        String str;
        if (z) {
            str = "anchor";
        } else {
            str = "admin";
        }
        c474500IjA.LJJII(str, "admin_type");
    }

    public static void LJFF(Context context, final DataChannel dataChannel, final Function0 function0) {
        final boolean zBooleanValue;
        Boolean bool;
        if (!LIZIZ(dataChannel) || context == null || Intrinsics.LJFF(InterfaceC1106030et7.u8.LIZ(), Boolean.TRUE)) {
            return;
        }
        if (dataChannel != null && dataChannel.gg0(RoomChannel.class) != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = true;
        }
        C0HTI c0hti = new C0HTI();
        c0hti.LIZ = R.drawable.vf;
        Drawable drawableLIZ = c0hti.LIZ(context);
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LIZIZ();
        C753530Th9 c753530Th9 = new C753530Th9(drawableLIZ, 3);
        c782110Um9.LJFF = c753530Th9;
        c782110Um9.LJ(c753530Th9, 1.75f);
        c782110Um9.LIZJ = C497740JfY.LJIJI(2131835601);
        c782110Um9.LJIIIZ(LIZJ(context, 2131835607, 2131835600, 0, 0));
        C494720Jag c494720Jag = new C494720Jag();
        C755620TkW c755620TkW = new C755620TkW();
        c755620TkW.LIZ = C497740JfY.LJIJI(2131835602);
        c755620TkW.LIZJ = new InterfaceC743640TFa() { // from class: X.0TYY
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                function0.invoke();
                C0TZ7 c0tz7 = C0TZ7.LIZ;
                boolean z = zBooleanValue;
                DataChannel dataChannel2 = dataChannel;
                c0tz7.getClass();
                C0TZ7.LIZLLL(dataChannel2, "keyword_education_popup_click", null, z);
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ2(c755620TkW));
        C755630TkX c755630TkX = new C755630TkX();
        c755630TkX.LIZ = C497740JfY.LJIJI(2131835603);
        c755630TkX.LIZJ = new InterfaceC743640TFa() { // from class: X.0TYl
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        };
        c494720Jag.LIZ(new C0TZ3(c755630TkX));
        c494720Jag.LIZIZ = 2;
        c782110Um9.LIZJ(new C494730Jah(c494720Jag));
        c782110Um9.LJIIZILJ = new DialogInterface.OnShowListener() { // from class: X.0TZ8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                InterfaceC1106030et7.u8.LIZJ(Boolean.TRUE);
                C0TZ7 c0tz7 = C0TZ7.LIZ;
                boolean z = zBooleanValue;
                DataChannel dataChannel2 = dataChannel;
                c0tz7.getClass();
                C0TZ7.LIZLLL(dataChannel2, "keyword_education_popup_show", null, z);
            }
        };
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public static void LIZLLL(DataChannel dataChannel, String str, Map map, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        if (dataChannel == null) {
            c474500IjALIZ.LJIL();
        } else {
            c474500IjALIZ.LJIJJLI(dataChannel);
        }
        c474500IjALIZ.LJJIIZI(map);
        LIZ(c474500IjALIZ, z);
        c474500IjALIZ.LIZ();
    }

    public static CharSequence LIZJ(Context context, int i, int i2, int i3, int i4) {
        String strLJIJI;
        String strLJIJJ;
        int iLJJJ;
        String strLJIJI2 = C497740JfY.LJIJI(i);
        String strLJIJI3 = null;
        if (i3 != 0) {
            strLJIJI = C497740JfY.LJIJI(i3);
        } else {
            strLJIJI = null;
        }
        if (i4 != 0) {
            strLJIJI3 = C497740JfY.LJIJI(i4);
        }
        int iLJJJ2 = 0;
        if (strLJIJI != null) {
            if (strLJIJI3 != null) {
                strLJIJJ = C497740JfY.LJIJJ(i2, strLJIJI2, strLJIJI, strLJIJI3);
            } else {
                strLJIJJ = C497740JfY.LJIJJ(i2, strLJIJI2, strLJIJI);
            }
        } else {
            strLJIJJ = C497740JfY.LJIJJ(i2, strLJIJI2);
        }
        SpannableString spannableString = new SpannableString(strLJIJJ);
        int iLJJJ3 = a0.LJJJ(strLJIJJ, strLJIJI2, 0, false, 6);
        if (strLJIJI == null) {
            iLJJJ = 0;
        } else {
            iLJJJ = a0.LJJJ(strLJIJJ, strLJIJI, 0, false, 6);
        }
        if (strLJIJI3 != null) {
            iLJJJ2 = a0.LJJJ(strLJIJJ, strLJIJI3, 0, false, 6);
        }
        if (iLJJJ3 >= 0) {
            C1119920fFW.LJ(context, spannableString, iLJJJ3, iLJJJ3 + strLJIJI2.length(), 33, 8, 500);
        }
        if (strLJIJI != null && iLJJJ >= 0) {
            C1119920fFW.LJ(context, spannableString, iLJJJ, iLJJJ + strLJIJI.length(), 33, 8, 500);
        }
        if (strLJIJI3 != null && iLJJJ2 >= 0) {
            C1119920fFW.LJ(context, spannableString, iLJJJ2, iLJJJ2 + strLJIJI3.length(), 33, 8, 500);
            return spannableString;
        }
        return spannableString;
    }
}
