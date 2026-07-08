package X;

import android.util.SparseArray;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicRequest;
import com.ss.android.ugc.aweme.im.message.template.service.BatchDynamicResponse;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YcM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.SendMessageTemplateServiceImpl$enqueueSendBatchDynamicTask$1", f = "SendMessageTemplateServiceImpl.kt", l = {254}, m = "invokeSuspend")
public final class C877960YcM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<IMContact> LLILLJJLI;
    public final /* synthetic */ SendMessageTemplateDynamicTask LLILLL;
    public final /* synthetic */ C878060YcW LLILZ;
    public final /* synthetic */ InterfaceC878050YcV LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ TextContent LLIZ;
    public final /* synthetic */ Map<String, String> LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C877960YcM(List<? extends IMContact> list, SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask, C878060YcW c878060YcW, InterfaceC878050YcV interfaceC878050YcV, Map<String, String> map, TextContent textContent, Map<String, String> map2, Map<String, String> map3, InterfaceC1364105Vn<? super C877960YcM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = sendMessageTemplateDynamicTask;
        this.LLILZ = c878060YcW;
        this.LLILZIL = interfaceC878050YcV;
        this.LLILZLL = map;
        this.LLIZ = textContent;
        this.LLIZLLLIL = map2;
        this.LLJ = map3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877960YcM(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BatchDynamicRequest batchDynamicRequest;
        List<IMContact> list;
        String str;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        LinkedHashMap linkedHashMap;
        String str2;
        C0YOY c0yoyLIZIZ;
        String str3;
        Object objInvoke = obj;
        C1C7U.LIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objInvoke);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objInvoke);
            List<IMContact> list2 = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList();
            for (IMContact iMContact : list2) {
                if (iMContact instanceof IMUser) {
                    batchDynamicRequest = new BatchDynamicRequest(iMContact.getUid(), C2286608xc.LJ(1));
                } else if (iMContact instanceof IMConversation) {
                    batchDynamicRequest = new BatchDynamicRequest(((IMConversation) iMContact).getConversationId(), C2286608xc.LJ(2));
                }
                arrayList.add(batchDynamicRequest);
            }
            Function2<List<BatchDynamicRequest>, InterfaceC1364105Vn<? super List<BatchDynamicResponse>>, Object> function2 = this.LLILLL.batchDynamicTemplateConstructor;
            if (function2 != null) {
                this.LL = 1;
                objInvoke = function2.invoke(arrayList, this);
                if (objInvoke == objLJFF) {
                    C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
            return unit;
        }
        List<BatchDynamicResponse> list3 = (List) objInvoke;
        if (list3 != null) {
            C878060YcW c878060YcW = this.LLILZ;
            List<IMContact> list4 = this.LLILLJJLI;
            SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask = this.LLILLL;
            InterfaceC878050YcV interfaceC878050YcV = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            TextContent textContent = this.LLIZ;
            Map<String, String> map2 = this.LLIZLLLIL;
            Map<String, String> map3 = this.LLJ;
            for (BatchDynamicResponse batchDynamicResponse : list3) {
                String str4 = "";
                if (C455040Hss.LIZ()) {
                    BaseTemplate baseTemplate = batchDynamicResponse.template;
                    SendMessageEventParcel sendMessageEventParcel = sendMessageTemplateDynamicTask.sendMessageEventParcel;
                    c878060YcW.getClass();
                    list = list4;
                    C878000YcQ c878000YcQ = new C878000YcQ(interfaceC878050YcV, baseTemplate, list4, c878060YcW, sendMessageEventParcel);
                    C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
                    IIMCoreProxyService.LIZ.getClass();
                    IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
                    if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                        if (map != null) {
                            linkedHashMap = new LinkedHashMap(map);
                        } else {
                            linkedHashMap = new LinkedHashMap();
                        }
                        linkedHashMap.putAll(C878060YcW.LJI(sendMessageTemplateDynamicTask.sendMessageEventParcel));
                        if (textContent != null) {
                            if (baseTemplate != null) {
                                c0yoyLIZIZ = new C0YOY() { // from class: X.0YcN
                                    @Override // X.C0YOY
                                    public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                                    }
                                };
                            } else {
                                c0yoyLIZIZ = C0YTP.LIZIZ(c878000YcQ, null, null, false, 31);
                            }
                            String str5 = batchDynamicResponse.convId;
                            if (str5 == null) {
                                str5 = "";
                            }
                            C1265504xJ c1265504xJ = new C1265504xJ(str5);
                            int iLIZ = C877840YcA.LIZ(textContent);
                            C459930I1v c459930I1v = new C459930I1v(C051M.LJ(textContent, false));
                            String str6 = batchDynamicResponse.scene;
                            if (str6 == null) {
                                str6 = "";
                            }
                            if ((map == null || (str3 = map.get("source")) == null) && (map2 == null || (str3 = map2.get("source")) == null)) {
                                str3 = "";
                            }
                            map3 = map3;
                            c0yozLJFF.LJI(new C0YP2(c1265504xJ, iLIZ, c459930I1v, str6, str3, map3, linkedHashMap, null, null, C901060ZWm.LJ(map2), null, null, 15744), new C0IC5(null, 3), c0yoyLIZIZ);
                        }
                        if (baseTemplate != null) {
                            String str7 = batchDynamicResponse.convId;
                            if (str7 == null) {
                                str7 = "";
                            }
                            C1265504xJ c1265504xJ2 = new C1265504xJ(str7);
                            int messageType = baseTemplate.getMessageType();
                            C460190I2v c460190I2v = new C460190I2v(baseTemplate.encode());
                            String str8 = batchDynamicResponse.scene;
                            if (str8 == null) {
                                str8 = "";
                            }
                            if ((map != null && (str2 = map.get("source")) != null) || (map2 != null && (str2 = map2.get("source")) != null)) {
                                str4 = str2;
                            }
                            c0yozLJFF.LJI(new C0YP2(c1265504xJ2, messageType, c460190I2v, str8, str4, map3, linkedHashMap, null, null, C901060ZWm.LJ(map2), null, null, 15744), new C0IC5(null, 3), C0YTP.LIZIZ(c878000YcQ, null, null, false, 31));
                        }
                    } else {
                        C0YTP.LIZ(c878000YcQ);
                        Unit unit2 = Unit.LIZ;
                        C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
                        return unit2;
                    }
                } else {
                    list = list4;
                    BaseTemplate baseTemplate2 = batchDynamicResponse.template;
                    if (textContent != null || baseTemplate2 != null) {
                        CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
                        C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
                        String str9 = batchDynamicResponse.convId;
                        if (str9 == null) {
                            str9 = "";
                        }
                        C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
                        c0ytz.LJFF = str9;
                        String str10 = batchDynamicResponse.scene;
                        if (str10 == null) {
                            str10 = "";
                        }
                        c0ytz.LJIIL = str10;
                        if ((map == null || (str = map.get("source")) == null) && (map2 == null || (str = map2.get("source")) == null)) {
                            str = "";
                        }
                        C0YTZ c0ytz2 = c874730YTfLIZ.LIZIZ;
                        c0ytz2.LJIJI = str;
                        c0ytz2.LJIILIIL = map;
                        SparseArray<Object> sparseArrayLJ = C901060ZWm.LJ(map2);
                        C0YTZ c0ytz3 = c874730YTfLIZ.LIZIZ;
                        c0ytz3.LJIILL = sparseArrayLJ;
                        c0ytz3.LJIIIZ = map3;
                        if (textContent != null) {
                            c874730YTfLIZ.LIZIZ(textContent);
                        }
                        if (baseTemplate2 != null) {
                            c874730YTfLIZ.LIZJ(baseTemplate2);
                        }
                        SendMessageEventParcel sendMessageEventParcel2 = sendMessageTemplateDynamicTask.sendMessageEventParcel;
                        c878060YcW.getClass();
                        c878060YcW = c878060YcW;
                        c874730YTfLIZ.LJFF(new C878000YcQ(interfaceC878050YcV, baseTemplate2, list, c878060YcW, sendMessageEventParcel2));
                    }
                }
                list4 = list;
            }
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
            return unit3;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("SendMessageTemplateServiceImpl@4b33.enqueueSendBatchDynamicTask$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
