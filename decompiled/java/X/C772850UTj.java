package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0UTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C772850UTj {
    public final DataChannel LIZ;

    public final void LIZ() {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveGameEffectHelper();
        if (C769040UEs.LIZJ()) {
            C766270U4b.LIZLLL(2131854098);
            C0UUC c0uuc = C0UUC.LIZ;
            EnumC773040UUc enumC773040UUc = EnumC773040UUc.DRAW_GUESS;
            EnumC771230UNd enumC771230UNd = EnumC771230UNd.START_FAIL;
            c0uuc.getClass();
            C0UUC.LIZJ(enumC773040UUc, enumC771230UNd);
            return;
        }
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getHostToolsUtil();
        if (C500260Jjc.LJJIJIIJIL(Boolean.valueOf(C768290UBv.LIZ(C497740JfY.LJII(), this.LIZ)))) {
            C766270U4b.LIZLLL(2131844624);
            C0UUC c0uuc2 = C0UUC.LIZ;
            EnumC773040UUc enumC773040UUc2 = EnumC773040UUc.DRAW_GUESS;
            EnumC771230UNd enumC771230UNd2 = EnumC771230UNd.START_FAIL;
            c0uuc2.getClass();
            C0UUC.LIZJ(enumC773040UUc2, enumC771230UNd2);
            return;
        }
        C0UUC c0uuc3 = C0UUC.LIZ;
        EnumC773040UUc enumC773040UUc3 = EnumC773040UUc.DRAW_GUESS;
        EnumC771230UNd enumC771230UNd3 = EnumC771230UNd.START_SUCCESS;
        c0uuc3.getClass();
        C0UUC.LIZJ(enumC773040UUc3, enumC771230UNd3);
        IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
        if (iRoomFunctionService != null) {
            iRoomFunctionService.Nf1();
            C0JFL.LIZIZ(this.LIZ);
        }
    }

    public C772850UTj(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }
}
