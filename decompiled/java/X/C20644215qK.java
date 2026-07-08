package X;

import Y.ACallableS411S0100000_3;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.15qK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20644215qK {
    public static void LIZ(InnerPushMessage innerPushMessage) {
        int i = C20642815q6.LIZ;
        C20642815q6.LJFF(innerPushMessage.getType(), innerPushMessage);
        C20666215ts tracker = innerPushMessage.getTracker();
        C19329910jp.LIZ.getClass();
        tracker.LIZJ = System.currentTimeMillis();
        innerPushMessage.getTracker().LJIJJLI = System.currentTimeMillis() - innerPushMessage.getCreateTime();
        innerPushMessage.getTracker().LJIL = System.currentTimeMillis() - innerPushMessage.getTracker().LJIJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show getCurrentTime :");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(" clientInterval:");
        sbLIZ.append(innerPushMessage.getTracker().LJIL);
        sbLIZ.append(" receiveTime:");
        sbLIZ.append(innerPushMessage.getTracker().LJIJI);
        sbLIZ.append(" message:");
        sbLIZ.append(innerPushMessage);
        C19290510dT.LIZ("IInnerPushPopupWindow", C2188811AlT.LIZIZ(sbLIZ));
        C15O7.LIZIZ(new ACallableS411S0100000_3((Function0) new AwS572S0100000_28(innerPushMessage, 269), 11), C15O7.LJI, null);
    }
}
