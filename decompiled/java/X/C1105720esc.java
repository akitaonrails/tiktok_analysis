package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;
import com.lynx.tasm.LynxViewClient;
import java.util.Map;
import kotlin.jvm.internal.AwS101S1200000_17;

/* JADX INFO: renamed from: X.0esc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105720esc {
    public static final /* synthetic */ int LIZ = 0;

    public static SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LIZ(int i, Context context, Map map, LynxViewClient lynxViewClient, AbstractC1542200qEc abstractC1542200qEc, String str, LifecycleOwner lifecycleOwner) {
        String str2;
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            str2 = GameLivePartnershipDropsSchema.INSTANCE.getConfig().pageDropsCard;
        } else {
            str2 = C1152420g5w.LIZ.pageIntroCard;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str2);
        c760370TsBLIZ.LJJII(map);
        c760370TsBLIZ.LJJIFFI("click_time", String.valueOf(System.currentTimeMillis()));
        if (str2.length() == 0) {
            return null;
        }
        return ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, c760370TsBLIZ.LIZ().toString(), lifecycleOwner, false, new AwS101S1200000_17(abstractC1542200qEc, lynxViewClient, str, 1));
    }
}
