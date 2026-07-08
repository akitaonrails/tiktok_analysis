package X;

import android.util.SparseArray;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chatroom.sharepost.BotSharePostPickerViewModel$sendVideo$1", f = "BotSharePostPickerViewModel.kt", l = {335}, m = "invokeSuspend")
public final class C874910YTx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BotSharePostPickerViewModel LLILLJJLI;
    public final /* synthetic */ BaseTemplate LLILLL;
    public final /* synthetic */ SendMessageTemplateTask LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ SparseArray<Object> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C874910YTx(BotSharePostPickerViewModel botSharePostPickerViewModel, BaseTemplate baseTemplate, SendMessageTemplateTask sendMessageTemplateTask, Map<String, String> map, SparseArray<Object> sparseArray, InterfaceC1364105Vn<? super C874910YTx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = botSharePostPickerViewModel;
        this.LLILLL = baseTemplate;
        this.LLILZ = sendMessageTemplateTask;
        this.LLILZIL = map;
        this.LLILZLL = sparseArray;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C874910YTx(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        C1C7U.LIZ("BotSharePostPickerViewModel@549b.sendVideo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                C1265504xJ c1265504xJ = new C1265504xJ(this.LLILLJJLI.LL.getValue().LL);
                int messageType = this.LLILLL.getMessageType();
                C460190I2v c460190I2v = new C460190I2v(this.LLILLL.encode());
                SendMessageTemplateTask sendMessageTemplateTask = this.LLILZ;
                String str = sendMessageTemplateTask.scene;
                List<C0YC6> list = sendMessageTemplateTask.attachments;
                Map<String, String> map = this.LLILZIL;
                C0YP2 c0yp2 = new C0YP2(c1265504xJ, messageType, c460190I2v, str, null, map, map, null, null, this.LLILZLL, list, null, 14736);
                this.LL = 1;
                if (c0yozLJFF.LJFF(c0yp2, new C0IC5(null, 3), this) == objLJFF) {
                    C1C7U.LIZIZ("BotSharePostPickerViewModel@549b.sendVideo$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BotSharePostPickerViewModel@549b.sendVideo$1");
                return unit;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BotSharePostPickerViewModel@549b.sendVideo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
