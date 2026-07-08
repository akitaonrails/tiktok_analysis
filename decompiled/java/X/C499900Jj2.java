package X;

import Y.AfS176S0100000_7;
import Y.AfS62S0201000_7;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.UpdateReplaySettingsApi;
import com.bytedance.android.livesdk.broadcast.preview.widget.setting.LiveHighLightRecordGuideSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS2S1401000_7;

/* JADX INFO: renamed from: X.0Jj2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499900Jj2 implements InterfaceC1833480xoQ {
    public static void LIZJ(String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_anchor_turnon_record_popup");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(str2, "action_type");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "click_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(int i, Function0 function0, Function0 function02) {
        C480460Ism.LIZ().getClass();
        ((UpdateReplaySettingsApi) C480460Ism.LIZLLL(UpdateReplaySettingsApi.class)).updateRecord(1, i).LJIILIIL(new C0UO0()).LJJLL(new AfS62S0201000_7(i, function0, function02, 3), new AfS176S0100000_7(function02, 177));
    }

    @Override // X.InterfaceC1833480xoQ
    public final void LIZIZ(FragmentManager fragmentManager, boolean z, String str, Function0<Unit> function0) {
        C19322110iZ.LJFF(fragmentManager, new LiveHighLightRecordGuideSheet(str, function0, z), LiveHighLightRecordGuideSheet.class.getName(), null, 0);
    }

    @Override // X.InterfaceC1833480xoQ
    public final void LIZ(Context context, String str, boolean z, int i, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
        if (z && i == 1) {
            LIZJ(str, "show", null);
            C1397580mTM c1397580mTM = new C1397580mTM(context);
            c1397580mTM.LJI(C497740JfY.LJIJI(2131855665));
            c1397580mTM.LIZIZ(C497740JfY.LJIJI(2131855663));
            C985403tE.LIZ(c1397580mTM, new AwS2S1401000_7(function0, this, 1, function02, function03, str, 1));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        function0.invoke();
        LIZLLL(i, function02, function03);
    }
}
