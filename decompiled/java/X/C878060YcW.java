package X;

import android.util.Base64;
import android.util.SparseArray;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.im.core.api.model.RichTextInfo;
import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.TextContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.card.DynamicCardTemplate;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageEventParcel;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask;
import com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateTask;
import com.ss.android.ugc.aweme.im.service.impl.core.IMContactManager;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* JADX INFO: renamed from: X.0YcW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878060YcW implements InterfaceC878090YcZ {
    public static final C878060YcW LIZ = new C878060YcW();

    public static Map LJI(SendMessageEventParcel sendMessageEventParcel) {
        C13DA c13da = new C13DA();
        c13da.put("enter_from", sendMessageEventParcel.enterFrom);
        String str = sendMessageEventParcel.panelSource;
        if (str != null) {
            c13da.put("panel_source", str);
        }
        String str2 = sendMessageEventParcel.enterMethod;
        if (str2 != null) {
            c13da.put("enter_method", str2);
        }
        String str3 = sendMessageEventParcel.resourceId;
        if (str3 != null) {
            c13da.put("resource_id", str3);
        }
        String str4 = sendMessageEventParcel.authorFollowStatus;
        if (str4 != null) {
            c13da.put("author_follow_status", str4);
        }
        String str5 = sendMessageEventParcel.mobExtraStr;
        if (str5 != null) {
            c13da.put("dynamic_card_mob_map", str5);
        }
        return c13da.build();
    }

    @Override // X.InterfaceC878090YcZ
    public final SharePackage LIZJ(SendMessageTemplateTask sendMessageTemplateTask) {
        return C896380ZEm.LIZIZ(sendMessageTemplateTask);
    }

    public static Map LJ(List list, Map map) {
        LinkedHashMap linkedHashMap;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = ((RichTextInfo) it2.next()).mentionedUid;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return map;
            }
            if (map != null) {
                linkedHashMap = new LinkedHashMap(map);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put("a:mentioned_uids", C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62));
            return linkedHashMap;
        }
        return map;
    }

    public static void LJII(Map map, SendMessageEventParcel sendMessageEventParcel) {
        if (map != null) {
            map.put("enter_from", sendMessageEventParcel.enterFrom);
            String str = sendMessageEventParcel.panelSource;
            if (str != null) {
                map.put("panel_source", str);
            }
            String str2 = sendMessageEventParcel.enterMethod;
            if (str2 != null) {
                map.put("enter_method", str2);
            }
            String str3 = sendMessageEventParcel.resourceId;
            if (str3 != null) {
                map.put("resource_id", str3);
            }
            String str4 = sendMessageEventParcel.authorFollowStatus;
            if (str4 != null) {
                map.put("author_follow_status", str4);
            }
            String str5 = sendMessageEventParcel.mobExtraStr;
            if (str5 != null) {
                map.put("dynamic_card_mob_map", str5);
            }
        }
    }

    public static TextContent LJIIIIZZ(String str, List list) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || str == null) {
            return null;
        }
        return TextContent.Companion.obtain(str, null, list, null, null, null);
    }

    @Override // X.InterfaceC878090YcZ
    public final SendMessageTemplateTask LIZLLL(int i, String str, String str2, SendMessageEventParcel sendMessageEventParcel) {
        if (i == 2) {
            try {
                DynamicCardTemplate dynamicCardTemplate = (DynamicCardTemplate) C2241931Cox.LIZLLL(C1496910p3Z.LIZJ(ByteString.Companion, Base64.decode(str, 0)), DynamicCardTemplate.class);
                if (dynamicCardTemplate != null) {
                    return new SendMessageTemplateTask(str2, dynamicCardTemplate, sendMessageEventParcel, null, false, 24);
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    @Override // X.InterfaceC878090YcZ
    public final void LIZIZ(List<? extends IMContact> list, SendMessageTemplateDynamicTask sendMessageTemplateDynamicTask, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, InterfaceC878050YcV interfaceC878050YcV) throws Throwable {
        TextContent textContentObtain;
        List<String> listLIZIZ = IMContactManager.LIZ.LIZIZ(list);
        LJII(map2, sendMessageTemplateDynamicTask.sendMessageEventParcel);
        if (sendMessageTemplateDynamicTask.batchDynamicTemplateConstructor != null) {
            if (str != null && str.length() != 0 && str != null) {
                textContentObtain = TextContent.Companion.obtain(str, null, null, null, null, null);
            } else {
                textContentObtain = null;
            }
            LJII(map2, sendMessageTemplateDynamicTask.sendMessageEventParcel);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C877960YcM(list, sendMessageTemplateDynamicTask, this, interfaceC878050YcV, map, textContentObtain, map2, map3, null), 3);
            return;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("dm_send_dynamic_template_task_opt", true)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C877980YcO(listLIZIZ, sendMessageTemplateDynamicTask, this, list, interfaceC878050YcV, str, map, map2, map3, null), 3);
            return;
        }
        Iterator it2 = ((ArrayList) listLIZIZ).iterator();
        while (it2.hasNext()) {
            C23250099c.LJ(C23271099x.INSTANCE, new C877990YcP(sendMessageTemplateDynamicTask, interfaceC878050YcV, this, (String) it2.next(), str, list, map, map2, map3, null));
        }
    }

    @Override // X.InterfaceC878090YcZ
    public final void LIZ(List<? extends IMContact> list, SendMessageTemplateTask sendMessageTemplateTask, String str, Map<String, String> map, Map<String, String> map2, Map<String, String> map3, InterfaceC878050YcV interfaceC878050YcV, boolean z, List<RichTextInfo> list2) {
        String str2;
        C0YHX c0yhxLIZ;
        C0YOZ c0yozLJFF;
        LinkedHashMap linkedHashMap;
        String str3;
        String str4;
        String str5;
        Long lLJIILIIL;
        C878000YcQ c878000YcQ = new C878000YcQ(interfaceC878050YcV, sendMessageTemplateTask.template, list, this, sendMessageTemplateTask.sendMessageEventParcel);
        List<String> listLIZIZ = IMContactManager.LIZ.LIZIZ(list);
        LJII(map2, sendMessageTemplateTask.sendMessageEventParcel);
        SparseArray sparseArrayLJ = C901060ZWm.LJ(map2);
        if (sparseArrayLJ == null) {
            sparseArrayLJ = new SparseArray();
        }
        Map<String, String> map4 = sendMessageTemplateTask.template.rj().queryData.extras;
        String str6 = map4.get("prev_msg_sender");
        IAccountUserService iAccountUserServiceLJFF = C0XQ7.LJFF();
        String curUserId = null;
        if (iAccountUserServiceLJFF != null) {
            curUserId = ((AbstractC848400XPy) iAccountUserServiceLJFF).getCurUserId();
        }
        if (!Intrinsics.LJFF(str6, curUserId) && (str5 = map4.get("prev_id")) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str5)) != null) {
            sparseArrayLJ.put(2006, Long.valueOf(lLJIILIIL.longValue()));
        }
        String str7 = "";
        if (C455040Hss.LIZ()) {
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            IIMCoreProxyService.LIZ.getClass();
            IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
            if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(c0ym2)) != null && (c0yozLJFF = c0yhxLIZ.LJFF()) != null) {
                TextContent textContentLJIIIIZZ = LJIIIIZZ(str, list2);
                Map mapLJ = LJ(list2, map3);
                if (map != null) {
                    linkedHashMap = new LinkedHashMap(map);
                } else {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.putAll(LJI(sendMessageTemplateTask.sendMessageEventParcel));
                if (map != null && (str4 = map.get("source")) != null) {
                    str7 = str4;
                } else if (map2 != null && (str3 = map2.get("source")) != null) {
                    str7 = str3;
                }
                Iterator it2 = ((ArrayList) listLIZIZ).iterator();
                while (it2.hasNext()) {
                    LJIIIZ(c0yozLJFF, (String) it2.next(), textContentLJIIIIZZ, sendMessageTemplateTask.template, sendMessageTemplateTask.scene, str7, linkedHashMap, sparseArrayLJ, mapLJ, sendMessageTemplateTask.attachments, c878000YcQ);
                }
                return;
            }
            C0YTP.LIZ(c878000YcQ);
            return;
        }
        TextContent textContentLJIIIIZZ2 = LJIIIIZZ(str, list2);
        Map<String, String> mapLJ2 = LJ(list2, map3);
        for (String str8 : (ArrayList) listLIZIZ) {
            CopyOnWriteArrayList<InterfaceC1743406sC> copyOnWriteArrayList = C874810YTn.LIZ;
            C874730YTf c874730YTfLIZ = C874780YTk.LIZ();
            c874730YTfLIZ.LIZIZ.LJFF = str8;
            c874730YTfLIZ.LIZIZ(textContentLJIIIIZZ2);
            c874730YTfLIZ.LIZJ(sendMessageTemplateTask.template);
            c874730YTfLIZ.LIZIZ.LJIIL = sendMessageTemplateTask.scene;
            if ((map == null || (str2 = map.get("source")) == null) && (map2 == null || (str2 = map2.get("source")) == null)) {
                str2 = "";
            }
            C0YTZ c0ytz = c874730YTfLIZ.LIZIZ;
            c0ytz.LJIJI = str2;
            c0ytz.LJIILIIL = map;
            c0ytz.LJIILL = sparseArrayLJ;
            c0ytz.LJIIIZ = mapLJ2;
            c0ytz.LJIIIIZZ = sendMessageTemplateTask.attachments;
            c0ytz.LJIILJJIL = z;
            c874730YTfLIZ.LJFF(c878000YcQ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJFF(com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask r14, X.InterfaceC878050YcV r15, X.C878060YcW r16, java.lang.String r17, java.lang.String r18, java.util.List r19, java.util.Map r20, java.util.Map r21, java.util.Map r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878060YcW.LJFF(com.ss.android.ugc.aweme.im.message.template.service.SendMessageTemplateDynamicTask, X.0YcV, X.0YcW, java.lang.String, java.lang.String, java.util.List, java.util.Map, java.util.Map, java.util.Map, X.05Vn):java.lang.Object");
    }

    public final void LJIIIZ(C0YOZ c0yoz, String str, TextContent textContent, BaseTemplate baseTemplate, String str2, String str3, Map map, SparseArray sparseArray, Map map2, List list, C878000YcQ c878000YcQ) {
        C1265504xJ c1265504xJ;
        C0YOY c0yoyLIZIZ;
        C1265504xJ c1265504xJ2 = new C1265504xJ(str);
        ArrayList arrayList = new ArrayList();
        if (baseTemplate != null) {
            c1265504xJ = c1265504xJ2;
            arrayList.add(new C0YP2(c1265504xJ, baseTemplate.getMessageType(), new C460190I2v(baseTemplate.encode()), str2, str3, map2, map, null, null, sparseArray, list, null, 14720));
        } else {
            c1265504xJ = c1265504xJ2;
        }
        if (textContent != null) {
            arrayList.add(new C0YP2(c1265504xJ, C877840YcA.LIZ(textContent), new C459930I1v(C051M.LJ(textContent, false)), str2, str3, map2, map, null, null, sparseArray, null, null, 15744));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        if (baseTemplate != null && textContent != null) {
            final int messageType = baseTemplate.getMessageType();
            final C0YTO c0ytoLIZIZ = C0YTP.LIZIZ(c878000YcQ, null, null, false, 31);
            c0yoyLIZIZ = new C0YOY() { // from class: X.0YTT
                @Override // X.C0YOY
                public final void onEvent(InterfaceC873750YPl interfaceC873750YPl) {
                    Integer numValueOf;
                    C878060YcW c878060YcW = this.LIZ;
                    int i = messageType;
                    c878060YcW.getClass();
                    if (interfaceC873750YPl instanceof C0YQY) {
                        C869590Y9l c869590Y9l = ((C0YQY) interfaceC873750YPl).LIZIZ;
                        if (c869590Y9l == null || c869590Y9l.getMsgType() != i) {
                            return;
                        }
                    } else if (interfaceC873750YPl instanceof C0YPL) {
                        C869590Y9l c869590Y9l2 = ((C0YPL) interfaceC873750YPl).LIZIZ;
                        if (c869590Y9l2 == null || c869590Y9l2.getMsgType() != i) {
                            return;
                        }
                    } else {
                        if (!(interfaceC873750YPl instanceof C0YQ0)) {
                            return;
                        }
                        C869590Y9l c869590Y9l3 = ((C0YQ0) interfaceC873750YPl).LIZIZ;
                        if (c869590Y9l3 != null && (numValueOf = Integer.valueOf(c869590Y9l3.getMsgType())) != null && numValueOf.intValue() != i) {
                            return;
                        }
                    }
                    c0ytoLIZIZ.onEvent(interfaceC873750YPl);
                }
            };
        } else {
            c0yoyLIZIZ = C0YTP.LIZIZ(c878000YcQ, null, null, false, 31);
        }
        c0yoz.LIZJ(arrayList, new C0IC5(EnumC873480YOk.IN_ORDER, 1), c0yoyLIZIZ);
    }
}
