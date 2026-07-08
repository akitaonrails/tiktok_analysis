package X;

import com.bytedance.android.livesdk.api.revenue.strategy.guide.TriggerApi;
import com.bytedance.android.livesdk.impl.revenue.strategy.guide.GuideTriggerWidget;
import com.bytedance.android.livesdk.model.message.AnchorGuideTriggerBizInfo;
import com.bytedance.android.livesdk.model.message.AnchorGuideTriggerMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01JO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.guide.GuideTriggerWidget$onMessage$1", f = "GuideTriggerWidget.kt", l = {100}, m = "invokeSuspend")
public final class C01JO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ IMessage LLILLL;
    public final /* synthetic */ GuideTriggerWidget LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01JO(long j, IMessage iMessage, GuideTriggerWidget guideTriggerWidget, InterfaceC1364105Vn<? super C01JO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = iMessage;
        this.LLILZ = guideTriggerWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01JO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        String json;
        C1C7U.LIZ("GuideTriggerWidget@a4df.onMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        long jLongValue = 0;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI;
            if (j > 0) {
                long j2 = j * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j2, this) == objLJFF) {
                    C1C7U.LIZIZ("GuideTriggerWidget@a4df.onMessage$1");
                    return objLJFF;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("request trigger, triggerName: ");
        sbLIZ.append(((AnchorGuideTriggerMessage) this.LLILLL).triggerName);
        C20441214yg.LJIIIZ("GuideTriggerWidget", C2188811AlT.LIZIZ(sbLIZ));
        C206400qs c206400qs = TriggerApi.LIZ;
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room roomLJJLI = C500260Jjc.LJJLI();
        if (roomLJJLI != null) {
            id = roomLJJLI.getId();
        } else {
            id = 0;
        }
        List listSingletonList = Collections.singletonList("live_gift_guide");
        String str = ((AnchorGuideTriggerMessage) this.LLILLL).triggerName;
        Function0<Long> function0 = this.LLILZ.LL;
        if (function0 != null) {
            jLongValue = function0.invoke().longValue();
        }
        AnchorGuideTriggerMessage anchorGuideTriggerMessage = (AnchorGuideTriggerMessage) this.LLILLL;
        String str2 = anchorGuideTriggerMessage.baseMessage.logId;
        AnchorGuideTriggerBizInfo anchorGuideTriggerBizInfo = anchorGuideTriggerMessage.bizInfo;
        if (anchorGuideTriggerBizInfo != null) {
            json = GsonProtectorUtils.toJson(C293501Bt.LIZ(), anchorGuideTriggerBizInfo);
        } else {
            json = null;
        }
        c206400qs.getClass();
        C206400qs.LIZIZ(id, listSingletonList, str, jLongValue, str2, "", "", null, json);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GuideTriggerWidget@a4df.onMessage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
