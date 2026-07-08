package X;

import android.view.View;
import com.bytedance.android.livesdk.setting.LiveInteractViewGoneSettingV2;
import com.bytedance.android.livesdk.setting.LiveInteractViewRemoveSettingV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.scatter.LiveGoneViewIdList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0eGD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1081910eGD {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(int i, View view) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById == null) {
            return true;
        }
        if (LiveInteractViewRemoveSettingV2.INSTANCE.isViewRemoved(i)) {
            C500260Jjc.LJJJLL(viewFindViewById);
            return true;
        }
        return false;
    }

    public static void LIZ(View view, int i, DataChannel dataChannel) {
        View viewFindViewById = view.findViewById(i);
        if (viewFindViewById != null && (viewFindViewById instanceof C1100290ejr) && LiveInteractViewGoneSettingV2.INSTANCE.isViewGone(i)) {
            C500260Jjc.LJIILIIL(viewFindViewById);
            List arrayList = (List) dataChannel.gg0(LiveGoneViewIdList.class);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(Integer.valueOf(i));
            dataChannel.SX0(LiveGoneViewIdList.class, arrayList);
        }
    }
}
