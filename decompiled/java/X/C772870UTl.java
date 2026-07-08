package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.interaction.pollandgiftvote.ToolWrapperDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0UTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772870UTl {
    public final DataChannel LIZ;

    public C772870UTl(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(EnumC773040UUc enumC773040UUc) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131844624);
            C0UUC c0uuc = C0UUC.LIZ;
            EnumC771230UNd enumC771230UNd = EnumC771230UNd.START_FAIL;
            c0uuc.getClass();
            C0UUC.LIZJ(enumC773040UUc, enumC771230UNd);
            return;
        }
        FragmentManager fragmentManager = (FragmentManager) this.LIZ.gg0(C748880TZe.class);
        if (fragmentManager == null) {
            C0UUC c0uuc2 = C0UUC.LIZ;
            EnumC771230UNd enumC771230UNd2 = EnumC771230UNd.START_FAIL;
            c0uuc2.getClass();
            C0UUC.LIZJ(enumC773040UUc, enumC771230UNd2);
            C766270U4b.LIZLLL(2131844624);
            return;
        }
        ToolWrapperDialog toolWrapperDialogJ32 = ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).j32(AFwS199S0000000_12.get$arr$(374), AFwS199S0000000_12.get$arr$(375));
        if (toolWrapperDialogJ32 != null && !toolWrapperDialogJ32.isShowing()) {
            C0UUC c0uuc3 = C0UUC.LIZ;
            EnumC771230UNd enumC771230UNd3 = EnumC771230UNd.START_SUCCESS;
            c0uuc3.getClass();
            C0UUC.LIZJ(enumC773040UUc, enumC771230UNd3);
            this.LIZ.SX0(C753250Tgh.class, "anchor_live_center");
            C492400JSs.LIZ(toolWrapperDialogJ32, fragmentManager, "LopPollGiftVoteEntity");
        }
    }
}
