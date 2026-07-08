package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import com.bytedance.android.livesdk.broadcast.BannerNotifyEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0UPa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C771720UPa {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(' ');
        sbLIZ.append(C497740JfY.LJIJI(2131842033));
        sbLIZ.append(" >");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C771770UPf LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            int i = -1;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '{') {
                    if (cCharAt != '}') {
                        sb.append(cCharAt);
                        i2++;
                    } else {
                        if (i > 0) {
                            arrayList.add(C1697810uHb.LJ(Integer.valueOf(i), Integer.valueOf(i2)));
                        }
                        i = -1;
                    }
                } else {
                    i = i2;
                }
            }
        }
        return new C771770UPf(arrayList, sb.toString());
    }

    public static C0UPZ LIZJ(Context context, DataChannel dataChannel, C771740UPc c771740UPc, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBlockMessage msg:");
        sbLIZ.append(c771740UPc);
        sbLIZ.append(" isPostChannel:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ));
        List<ArrayList> arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String str = c771740UPc.LIZIZ;
        if (str != null) {
            C771770UPf c771770UPfLIZIZ = LIZIZ(str);
            arrayList = c771770UPfLIZIZ.LIZ;
            sb.append(c771770UPfLIZIZ.LIZIZ);
        }
        C785790Us5 c785790Us5 = new C785790Us5(context, c771740UPc, dataChannel, 0);
        SpannableString spannableString = new SpannableString(c771740UPc.LIZ);
        C1119920fFW.LJ(context, spannableString, 0, spannableString.length(), 33, 6, 500);
        C786410Ut5.p2(spannableString, new AbsoluteSizeSpan((int) C497740JfY.LIZIZ(15.0f)), 0, spannableString.length(), 17);
        C786410Ut5.p2(spannableString, c785790Us5, 0, spannableString.length(), 17);
        SpannableString spannableString2 = new SpannableString(sb.toString());
        C1119920fFW.LJ(context, spannableString2, 0, spannableString2.length(), 33, 9, 400);
        C786410Ut5.p2(spannableString2, new AbsoluteSizeSpan((int) C497740JfY.LIZIZ(12.0f)), 0, spannableString2.length(), 17);
        C786410Ut5.p2(spannableString2, c785790Us5, 0, spannableString2.length(), 17);
        for (ArrayList arrayList2 : arrayList) {
            C1119920fFW.LJIIIIZZ(spannableString2, ((Number) ListProtector.get(arrayList2, 0)).intValue(), ((Number) ListProtector.get(arrayList2, 1)).intValue(), 33, 500);
        }
        C0UPZ c0upz = new C0UPZ(EnumC771760UPe.NORMAL_BLOCK, spannableString, spannableString2, c771740UPc);
        if (z && dataChannel != null) {
            dataChannel.LC0(BannerNotifyEvent.class, c0upz);
        }
        return c0upz;
    }
}
