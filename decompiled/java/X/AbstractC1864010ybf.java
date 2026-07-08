package X;

import com.ss.android.ugc.aweme.tako.model.AIBotInfo;
import com.ss.android.ugc.aweme.tako.router.model.CsiBotData;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import com.ss.android.ugc.aweme.tako.router.model.TakoCarriedUpData;
import com.ss.android.ugc.aweme.tako.router.model.TakoChatContainerData;
import com.ss.android.ugc.aweme.tako.router.model.TakoDuplicateEnterData;
import com.ss.android.ugc.aweme.tako.router.model.TakoInteractGuideData;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubBotData;
import com.ss.android.ugc.aweme.tako.router.model.TakoSubConversationData;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ybf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1864010ybf {
    public TakoDuplicateEnterData LIZJ;
    public TakoSubBotData LJ;
    public CsiBotData LJFF;
    public TakoAutoSendData LJII;
    public TakoCarriedUpData LJIIIIZZ;
    public TakoInteractGuideData LJIIIZ;
    public TakoBehaviorCollectData LJIIJ;
    public TakoSubConversationData LJIIJJI;
    public long LIZ = System.currentTimeMillis();
    public String LIZIZ = UUID.randomUUID().toString();
    public AIBotInfo LIZLLL = new AIBotInfo(0, null, null, 0, 0, 0, null, null, false, false, false, null, null, null, null, null, null, null, false, null, null, null, null, 8388607, null);
    public TakoChatContainerData LJI = new TakoChatContainerData(EnumC1864410ycJ.FULL_SCREEN, null, null, null, null, null);

    public abstract String LIZ();

    public abstract String LIZIZ();

    public final void LIZLLL(Function1<? super TakoBehaviorCollectData, Unit> function1) {
        TakoBehaviorCollectData takoBehaviorCollectData = this.LJIIJ;
        if (takoBehaviorCollectData == null) {
            takoBehaviorCollectData = new TakoBehaviorCollectData(null, null, null, null, null);
        }
        function1.invoke(takoBehaviorCollectData);
        this.LJIIJ = takoBehaviorCollectData;
    }

    public final void LJ(Function1<? super TakoCarriedUpData, Unit> function1) {
        TakoCarriedUpData takoCarriedUpData = this.LJIIIIZZ;
        if (takoCarriedUpData == null) {
            takoCarriedUpData = new TakoCarriedUpData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
            takoCarriedUpData.setLocateConfigType(EnumC219700t1.SEND_MSG_TOP);
        }
        function1.invoke(takoCarriedUpData);
        this.LJIIIIZZ = takoCarriedUpData;
    }

    public final void LJI(Function1<? super TakoInteractGuideData, Unit> function1) {
        TakoInteractGuideData takoInteractGuideData = this.LJIIIZ;
        if (takoInteractGuideData == null) {
            takoInteractGuideData = new TakoInteractGuideData(null, null, null, null, null, null, false, null, null, false, null, null, null);
        }
        function1.invoke(takoInteractGuideData);
        this.LJIIIZ = takoInteractGuideData;
    }

    public final void LJFF(EnumC1864410ycJ enumC1864410ycJ, Function1<? super TakoChatContainerData, Unit> function1) {
        TakoChatContainerData takoChatContainerData = this.LJI;
        takoChatContainerData.setScreenType(enumC1864410ycJ);
        if (function1 != null) {
            function1.invoke(takoChatContainerData);
        }
        this.LJI = takoChatContainerData;
    }

    public final void LIZJ(String str, String str2, Function1<? super TakoAutoSendData, Unit> function1) {
        TakoAutoSendData takoAutoSendData = this.LJII;
        if (takoAutoSendData != null) {
            takoAutoSendData.setMessageText(str);
            takoAutoSendData.setInteractionType(str2);
        } else {
            takoAutoSendData = new TakoAutoSendData(str, str2, null, null, null, null);
        }
        if (function1 != null) {
            function1.invoke(takoAutoSendData);
        }
        this.LJII = takoAutoSendData;
    }
}
