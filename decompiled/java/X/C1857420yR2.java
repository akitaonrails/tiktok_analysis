package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.TakoInputViewUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.components.autoplay.TakoListAutoPlayAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS216S0000000_27;
import kotlin.jvm.internal.AwS0S2410000_27;
import kotlin.jvm.internal.AwS0S2510000_27;
import kotlin.jvm.internal.AwS110S1200000_27;
import kotlin.jvm.internal.AwS1S1410000_27;
import kotlin.jvm.internal.AwS1S1510000_27;
import kotlin.jvm.internal.AwS1S1710000_27;
import kotlin.jvm.internal.AwS271S0300000_27;
import kotlin.jvm.internal.AwS29S1400000_27;
import kotlin.jvm.internal.AwS428S0200000_27;
import kotlin.jvm.internal.AwS44S0310000_27;
import kotlin.jvm.internal.AwS7S1310000_27;
import kotlin.jvm.internal.AwS9S2400000_27;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yR2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1857420yR2 {
    public static final C1857420yR2 LIZ = new C1857420yR2();
    public static final Cert LIZIZ = CertProviderManagerKt.findCert("bpea-219", 1476399118);
    public static boolean LIZJ = true;
    public static long LIZLLL;
    public static final List<Integer> LJ;
    public static final List<EnumC1857430yR3> LJFF;
    public static boolean LJI;

    static {
        List<Integer> listLJIILJJIL = C1697810uHb.LJIILJJIL(1013, 52);
        if (!C298810BnT.LIZ()) {
            listLJIILJJIL.add(1010);
        }
        if (!C298810BnT.LIZ()) {
            listLJIILJJIL.add(301);
            listLJIILJJIL.add(302);
        }
        LJ = listLJIILJJIL;
        LJFF = C1697810uHb.LJIIJJI(EnumC1857430yR3.LIKE, EnumC1857430yR3.DISLIKE);
    }

    public static C19723912Ez LIZ(Function1 function1) {
        C19723912Ez c19723912Ez = new C19723912Ez(null, null, null, null, 4095);
        function1.invoke(c19723912Ez);
        return c19723912Ez;
    }

    public static List LJIIZILJ(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C19723912Ez c19723912Ez = (C19723912Ez) it2.next();
            arrayList.add(new C1857450yR5(C13LP.LJJJJ(c19723912Ez.LIZ, LJFF), c19723912Ez));
        }
        return arrayList;
    }

    public static String LJJI(Message message) {
        if (message.sender.senderType == 1) {
            return "user";
        }
        return "bot";
    }

    public static void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, List list) {
        AnonymousClass1425.LIZ.getClass();
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LJIIJ();
        }
    }

    public static void LJJ(View view, String str) {
        Context context = view.getContext();
        Cert cert = LIZIZ;
        try {
            if (C1857690yRT.LJIIJJI(context)) {
                C20145813s8.LIZ("copy_im_label", str, context, cert);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIIZ(2131831119);
        c1389890mGx.LJIIJJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJIIZ(X.InterfaceC665370Q7z r2, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r3) {
        /*
            r1 = 0
            java.lang.Class<com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility> r0 = com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility.class
            X.01wD r0 = X.C1558520qew.LIZ(r2, r0, r1)
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility r0 = (com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoAIBotUIAbility) r0
            if (r0 == 0) goto L17
            boolean r1 = r0.ve2()
            r0 = 1
            if (r1 != r0) goto L17
        L12:
            boolean r0 = LJJIIJZLJL(r3, r2, r0)
            return r0
        L17:
            r0 = 0
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857420yR2.LJJIIZ(X.0Q7z, com.ss.android.ugc.aweme.tako.ccl.model.api.Message):boolean");
    }

    public static void LJI(List list, Message message, InterfaceC665370Q7z interfaceC665370Q7z) {
        C1919007fQ.LIZ.getClass();
        if (C1919007fQ.LIZLLL() && message.sender.isSelf) {
            int i = message.LIZIZ;
            if (i == 2 || i == 6) {
                ((ArrayList) list).add(LIZ(new AwS110S1200000_27(interfaceC665370Q7z, message, "long_press", 16)));
            }
        }
    }

    public static boolean LJJIIJZLJL(Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        Long l;
        Integer numValueOf;
        TakoNimbleConfig takoNimbleConfig;
        Integer numValueOf2;
        List<BaseVideo> list;
        BaseVideo baseVideo;
        if (message.msgType != 1 && AnonymousClass1418.LJFF(message.LJIIIZ())) {
            return false;
        }
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        String str = null;
        if (takoMixFeedLJIIIZ != null && (list = takoMixFeedLJIIIZ.videos) != null && (baseVideo = (BaseVideo) C13LP.LJJJLL(list)) != null) {
            l = baseVideo.expireTime;
        } else {
            l = null;
        }
        if (C1004300cF2.LIZIZ(l)) {
            return false;
        }
        if (z && C07I3.LIZ()) {
            return true;
        }
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        if (takoCardAbility != null && takoCardAbility.t70() == 1) {
            C20039913b3 c20039913b3 = C20039913b3.LIZ;
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if (takoMixFeedLJIIIZ2 != null) {
                numValueOf2 = Integer.valueOf(takoMixFeedLJIIIZ2.cardType);
            } else {
                numValueOf2 = null;
            }
            c20039913b3.getClass();
            if (!C1857380yQy.LIZJ(C20039913b3.LIZLLL(numValueOf2))) {
                return false;
            }
        }
        List<Integer> list2 = LJ;
        TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ3 != null) {
            numValueOf = Integer.valueOf(takoMixFeedLJIIIZ3.cardType);
        } else {
            numValueOf = null;
        }
        if (C13LP.LJJJJ(numValueOf, list2)) {
            return false;
        }
        TakoMixFeed takoMixFeedLJIIIZ4 = message.LJIIIZ();
        if (takoMixFeedLJIIIZ4 != null && (takoNimbleConfig = takoMixFeedLJIIIZ4.nimbleConfig) != null) {
            str = takoNimbleConfig.nimbleKey;
        }
        if (Intrinsics.LJFF(str, "multi_modal_push") || AnonymousClass1418.LJI(message.LJIIIZ()) || !((Boolean) C18099076z.LIZ.getValue()).booleanValue()) {
            return false;
        }
        if (C0R2Q.LIZIZ(Long.valueOf(message.botId)) > 0 && message.botId != 1) {
            return false;
        }
        return true;
    }

    public static void LJIIJJI(List list, View view, C326880Cre c326880Cre, InterfaceC665370Q7z interfaceC665370Q7z) {
        Message messageLIZ;
        if (!c326880Cre.LLILLL.isMultiAnswer) {
            C1858390ySb.LIZ.getClass();
            if (C1858390ySb.LIZ()) {
                TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
                if ((takoChatUIAbility != null && takoChatUIAbility.Gx1()) || !c326880Cre.LLILLJJLI.LJ || AnonymousClass1418.LJFF(c326880Cre.LLILLL.LJIIIZ()) || (messageLIZ = C321970Cjj.LIZ(c326880Cre)) == null) {
                    return;
                }
                ((ArrayList) list).add(LIZ(new AwS110S1200000_27(interfaceC665370Q7z, messageLIZ, 13)));
            }
        }
    }

    public static Map LJJIFFI(String str, Message message, InterfaceC665370Q7z interfaceC665370Q7z, String str2) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            linkedHashMap.put("enter_from", c1863850ybP.LL);
            linkedHashMap.put("enter_method", c1863850ybP.LLILLJJLI);
            linkedHashMap.put("process_id", c1863850ybP.LLILZIL);
            linkedHashMap.put("tako_session_id", c1863850ybP.LLILZLL);
            linkedHashMap.put("tako_chat_id", c1863850ybP.LLIZ);
            if (c1863850ybP.LLJJ != 1) {
                linkedHashMap.put("sub_process_id", c1863850ybP.LLJILJILJ);
            }
            linkedHashMap.put("bot_id", String.valueOf(c1863850ybP.LLJJ));
            linkedHashMap.put("message_id", message.uuid);
            linkedHashMap.put("situation", "ai_drawing");
            linkedHashMap.put("source", str2);
            linkedHashMap.put("image_uri", str);
        }
        if (!a0.LJJJIL(message.ext.imageTemplateId)) {
            linkedHashMap.put("is_unchanged_tako_template", String.valueOf(message.ext.isUnchangedTakoTemplate));
            linkedHashMap.put("image_template_id", message.ext.imageTemplateId);
        }
        return linkedHashMap;
    }

    public static void LIZLLL(List list, Context context, Message message, List list2, InterfaceC665370Q7z interfaceC665370Q7z) {
        list.add(LIZ(new AwS29S1400000_27(interfaceC665370Q7z, (InterfaceC665370Q7z) message, (Message) context, (Context) list2, (List<Message>) "long_press", (String) 5)));
    }

    public static List LJ(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, String str, List list) {
        boolean z;
        Integer num;
        List<TakoInteractionConfig> list2;
        List listLIZIZ;
        if (C1858720yT8.LJI(interfaceC665370Q7z, message)) {
            return list;
        }
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        TakoInteractionConfig takoInteractionConfig = null;
        Object obj = null;
        takoInteractionConfig = null;
        takoInteractionConfig = null;
        if (takoMixFeedLJIIIZ != null && (list2 = takoMixFeedLJIIIZ.interactionStatus) != null && (listLIZIZ = C1858720yT8.LIZIZ(list2)) != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Integer num2 = ((TakoInteractionConfig) next).type;
                if (num2 != null && num2.intValue() == 2) {
                    obj = next;
                    break;
                }
            }
            takoInteractionConfig = (TakoInteractionConfig) obj;
        }
        if (takoInteractionConfig != null && (num = takoInteractionConfig.status) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        list.add(LIZ(new AwS1S1410000_27(z, takoInteractionConfig, view, interfaceC665370Q7z, str, message, 2)));
        return list;
    }

    public static List LJIIIIZZ(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, String str, List list) {
        boolean z;
        Integer num;
        List<TakoInteractionConfig> list2;
        List listLIZIZ;
        if (C1858720yT8.LJI(interfaceC665370Q7z, message)) {
            return list;
        }
        TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
        TakoInteractionConfig takoInteractionConfig = null;
        Object obj = null;
        takoInteractionConfig = null;
        takoInteractionConfig = null;
        if (takoMixFeedLJIIIZ != null && (list2 = takoMixFeedLJIIIZ.interactionStatus) != null && (listLIZIZ = C1858720yT8.LIZIZ(list2)) != null) {
            Iterator it2 = listLIZIZ.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Integer num2 = ((TakoInteractionConfig) next).type;
                if (num2 != null && num2.intValue() == 1) {
                    obj = next;
                    break;
                }
            }
            takoInteractionConfig = (TakoInteractionConfig) obj;
        }
        if (takoInteractionConfig != null && (num = takoInteractionConfig.status) != null && num.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        ((ArrayList) list).add(LIZ(new AwS1S1410000_27(z, takoInteractionConfig, view, interfaceC665370Q7z, str, message, 3)));
        return list;
    }

    public static void LJIILL(List list, InterfaceC1860040yVG interfaceC1860040yVG, Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z) {
        String str;
        if (!AnonymousClass1418.LJFF(message.LJIIIZ())) {
            TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
            if (takoMixFeedLJIIIZ != null && takoMixFeedLJIIIZ.cardType == 1013) {
                return;
            }
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            Integer numValueOf = null;
            if (takoMixFeedLJIIIZ2 == null || (str = takoMixFeedLJIIIZ2.text) == null || str.length() == 0) {
                return;
            }
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
            if (takoCardAbility != null && takoCardAbility.t70() == 1) {
                C20039913b3 c20039913b3 = C20039913b3.LIZ;
                TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
                if (takoMixFeedLJIIIZ3 != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ3.cardType);
                }
                c20039913b3.getClass();
                if (!C1857380yQy.LIZIZ(C20039913b3.LIZLLL(numValueOf))) {
                    return;
                }
            }
            if (!C07I2.LIZ() || interfaceC1860040yVG == null) {
                return;
            }
            list.add(LIZ(new AwS44S0310000_27(interfaceC1860040yVG, message, interfaceC665370Q7z, z, 5)));
        }
    }

    public static void LJIJJ(List list, List list2, Message message, InterfaceC665370Q7z interfaceC665370Q7z, View view, String str) {
        Long l;
        List<TakoInteractionConfig> list3;
        List listLIZIZ;
        Integer num;
        C07QI.LIZ.getClass();
        if (C07QI.LIZ() && Intrinsics.LJFF(str, "exposed_button")) {
            return;
        }
        boolean z = false;
        if (list2 != null && (!list2.isEmpty())) {
            BaseVideo baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, list2);
            TakoInteractionConfig takoInteractionConfig = null;
            Object obj = null;
            takoInteractionConfig = null;
            takoInteractionConfig = null;
            if (baseVideo != null) {
                l = baseVideo.expireTime;
            } else {
                l = null;
            }
            if (!C1004300cF2.LIZIZ(l)) {
                TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (list3 = takoMixFeedLJIIIZ.interactionStatus) != null && (listLIZIZ = C1858720yT8.LIZIZ(list3)) != null) {
                    Iterator it2 = listLIZIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        Integer num2 = ((TakoInteractionConfig) next).type;
                        if (num2 != null && num2.intValue() == 3) {
                            obj = next;
                            break;
                        }
                    }
                    takoInteractionConfig = (TakoInteractionConfig) obj;
                    if (takoInteractionConfig != null && (num = takoInteractionConfig.status) != null && num.intValue() == 1) {
                        z = true;
                    }
                }
                list.add(LIZ(new AwS1S1510000_27(z, view, takoInteractionConfig, interfaceC665370Q7z, str, message, list2, 1)));
            }
        }
    }

    public static boolean LJJIIJ(C19EG c19eg, View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, float f, float f2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        Map<String, String> mapLJ;
        String str;
        String str2;
        String strNZ0;
        TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
        if (takoChatUIAbility == null || !takoChatUIAbility.Gx1() || !((Boolean) C0AX9.LIZ.getValue()).booleanValue() || LJI || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM()) == null || c19eg == null || message == null) {
            return false;
        }
        LJI = true;
        Integer numValueOf = null;
        ArrayList arrayList = new ArrayList();
        LJIIL(arrayList, view, message, interfaceC665370Q7z, true, null, 16);
        new C1860010yVD(c19eg, null, message, viewOnAttachStateChangeListenerC20604515jvCM, true, arrayList, AFwS216S0000000_27.get$arr$(289), null, false, false, null, 1922).LIZ(f, f2, view);
        ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
        if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.uG1()) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        String str3 = message.uuid;
        String str4 = message.subSessionId;
        Long lValueOf = Long.valueOf(message.actionId);
        Long lValueOf2 = Long.valueOf(message.botId);
        String strLIZIZ = C1855920yOc.LIZIZ(message);
        String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(message.ext.activeAiImageSubBar));
        if (message.sender.senderType == 1) {
            str = "user";
        } else {
            str = "bot";
        }
        boolean z = message.isMultiAnswer;
        if (z) {
            str2 = "multi_answer";
        } else {
            str2 = "default";
        }
        if (z) {
            numValueOf = Integer.valueOf(message.selectedAnswerIndex + 1);
        }
        ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoScreenTypeAbility.class, null);
        if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
            strNZ0 = "full_screen";
        }
        C1862950yZx.LIZ.getClass();
        C1862330yYx.LJJLL(c1862330yYx, mapLJ, str3, str4, lValueOf, lValueOf2, strLIZIZ, strLIZLLL, str, str2, numValueOf, "chat", strNZ0, "long_press", C1862950yZx.LIZJ(interfaceC665370Q7z), 16384);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo r14, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r15, java.lang.String r16, android.view.View r17, X.C1863850ybP r18, X.InterfaceC1364105Vn<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857420yR2.LJJII(com.ss.android.ugc.aweme.tako.ccl.model.api.BaseVideo, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, java.lang.String, android.view.View, X.0ybP, X.05Vn):java.lang.Object");
    }

    public static void LJIIL(List list, View view, Message message, InterfaceC665370Q7z interfaceC665370Q7z, boolean z, String str, int i) {
        String str2 = str;
        boolean z2 = z;
        if ((i & 8) != 0) {
            z2 = false;
        }
        if ((i & 16) != 0) {
            str2 = "long_press";
        }
        list.add(LIZ(new AwS7S1310000_27(view, interfaceC665370Q7z, message, str2, z2, 1)));
    }

    public static void LJIILLIIL(int i, View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, String str, List list, Function0 function0) {
        boolean z;
        Map<String, String> commonParams;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Function0 function02 = function0;
        String str9 = str;
        if ((i & 8) != 0) {
            str9 = "long_press";
        }
        String str10 = null;
        if ((i & 16) != 0) {
            function02 = null;
        }
        ITakoAIBotUIAbility iTakoAIBotUIAbility = (ITakoAIBotUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoAIBotUIAbility.class, null);
        if (iTakoAIBotUIAbility != null && iTakoAIBotUIAbility.ve2()) {
            z = true;
        } else {
            z = false;
        }
        if (LJJIIJZLJL(message, interfaceC665370Q7z, z)) {
            list.add(LIZ(new AwS1S1410000_27(function02, (Function0<Unit>) view, (View) z, (boolean) message, (Message) interfaceC665370Q7z, (InterfaceC665370Q7z) str9, (String) 1)));
            if (z && Intrinsics.LJFF(str9, "exposed_button")) {
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                if (iTakoContextAbility != null) {
                    commonParams = iTakoContextAbility.getCommonParams();
                } else {
                    commonParams = null;
                }
                C1862330yYx c1862330yYx = C1862330yYx.LIZ;
                C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
                c1862330yYx.getClass();
                Pair[] pairArr = new Pair[8];
                if (commonParams != null) {
                    str2 = commonParams.get("enter_from");
                } else {
                    str2 = null;
                }
                pairArr[0] = new Pair("enter_from", str2);
                if (commonParams != null) {
                    str3 = commonParams.get("enter_method");
                } else {
                    str3 = null;
                }
                pairArr[1] = new Pair("enter_method", str3);
                if (commonParams != null) {
                    str4 = commonParams.get("process_id");
                } else {
                    str4 = null;
                }
                pairArr[2] = new Pair("process_id", str4);
                if (commonParams != null) {
                    str5 = commonParams.get("tako_session_id");
                } else {
                    str5 = null;
                }
                pairArr[3] = new Pair("tako_session_id", str5);
                if (commonParams != null) {
                    str6 = commonParams.get("tako_chat_id");
                } else {
                    str6 = null;
                }
                pairArr[4] = new Pair("tako_chat_id", str6);
                if (commonParams != null) {
                    str7 = commonParams.get("sub_process_id");
                } else {
                    str7 = null;
                }
                pairArr[5] = new Pair("sub_process_id", str7);
                if (commonParams != null) {
                    str8 = commonParams.get("bot_id");
                } else {
                    str8 = null;
                }
                pairArr[6] = new Pair("bot_id", str8);
                pairArr[7] = new Pair("message_id", message.uuid);
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                if (commonParams != null) {
                    str10 = commonParams.get("inspiration_session_id");
                }
                c20235014FoLIZ.LIZ("tikbot_post_button_show", C2097608Jq.LJIIL(mapLJIIJ, C1862870yZp.LIZ(str10)));
            }
        }
    }

    public static void LIZIZ(List list, View view, String str, Message message, InterfaceC665370Q7z interfaceC665370Q7z, AwS271S0300000_27 awS271S0300000_27, String str2, int i) {
        TakoMixFeed takoMixFeedLJIIIZ;
        String str3;
        String str4 = str2;
        AwS271S0300000_27 awS271S0300000_272 = awS271S0300000_27;
        String str5 = str;
        if ((i & 2) != 0) {
            str5 = "";
        }
        Integer numValueOf = null;
        if ((i & 16) != 0) {
            awS271S0300000_272 = null;
        }
        if ((i & 32) != 0) {
            str4 = "long_press";
        }
        if (!AnonymousClass1418.LJFF(message.LJIIIZ())) {
            TakoMixFeed takoMixFeedLJIIIZ2 = message.LJIIIZ();
            if ((takoMixFeedLJIIIZ2 != null && takoMixFeedLJIIIZ2.cardType == 1013) || (takoMixFeedLJIIIZ = message.LJIIIZ()) == null || (str3 = takoMixFeedLJIIIZ.text) == null || str3.length() == 0) {
                return;
            }
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
            if (takoCardAbility != null && takoCardAbility.t70() == 1) {
                C20039913b3 c20039913b3 = C20039913b3.LIZ;
                TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
                if (takoMixFeedLJIIIZ3 != null) {
                    numValueOf = Integer.valueOf(takoMixFeedLJIIIZ3.cardType);
                }
                c20039913b3.getClass();
                if (!C1857380yQy.LIZIZ(C20039913b3.LIZLLL(numValueOf))) {
                    return;
                }
            }
            list.add(LIZ(new AwS9S2400000_27(message, (Message) interfaceC665370Q7z, (InterfaceC665370Q7z) awS271S0300000_272, (Function0<Unit>) view, (View) str5, str4, (String) 3)));
        }
    }

    public static void LJIILIIL(List list, String str, Message message, InterfaceC665370Q7z interfaceC665370Q7z, C19EG c19eg, View view, String str2, boolean z) {
        if (str != null && str.length() != 0) {
            list.add(LIZ(new AwS0S2410000_27(interfaceC665370Q7z, message, str, c19eg, view, str2, z, 1)));
        }
    }

    public static void LJIJ(List list, List list2, Message message, InterfaceC665370Q7z interfaceC665370Q7z, View view, LifecycleCoroutineScope lifecycleCoroutineScope, String str, boolean z) {
        Long l;
        Integer num;
        List<TakoInteractionConfig> list3;
        List listLIZIZ;
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        C07QI.LIZ.getClass();
        if (C07QI.LIZ() && Intrinsics.LJFF(str, "exposed_button")) {
            return;
        }
        boolean z2 = false;
        if (list2 != null && (!list2.isEmpty())) {
            BaseVideo baseVideo = (BaseVideo) C13LP.LJJJLZIJ(0, list2);
            TakoInteractionConfig takoInteractionConfig = null;
            Object obj = null;
            takoInteractionConfig = null;
            takoInteractionConfig = null;
            if (baseVideo != null) {
                l = baseVideo.expireTime;
            } else {
                l = null;
            }
            if (!C1004300cF2.LIZIZ(l)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
                if (iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
                    linkedHashMap.put("enter_from", c1863850ybP.LL);
                    linkedHashMap.put("enter_method", c1863850ybP.LLILLJJLI);
                    linkedHashMap.put("process_id", c1863850ybP.LLILZIL);
                    linkedHashMap.put("tako_session_id", c1863850ybP.LLILZLL);
                    linkedHashMap.put("tako_chat_id", c1863850ybP.LLIZ);
                    linkedHashMap.put("sub_process_id", c1863850ybP.LLJILJILJ);
                    linkedHashMap.put("bot_id", String.valueOf(c1863850ybP.LLJJ));
                    linkedHashMap.put("message_id", message.uuid);
                    linkedHashMap.put("source", str);
                    linkedHashMap.put("situation", "video_generation");
                }
                TakoMixFeed takoMixFeedLJIIIZ = message.LJIIIZ();
                if (takoMixFeedLJIIIZ != null && (list3 = takoMixFeedLJIIIZ.interactionStatus) != null && (listLIZIZ = C1858720yT8.LIZIZ(list3)) != null) {
                    Iterator it2 = listLIZIZ.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Object next = it2.next();
                        Integer num2 = ((TakoInteractionConfig) next).type;
                        if (num2 != null && num2.intValue() == 4) {
                            obj = next;
                            break;
                        }
                    }
                    takoInteractionConfig = (TakoInteractionConfig) obj;
                }
                if (takoInteractionConfig != null && (num = takoInteractionConfig.status) != null && num.intValue() == 1) {
                    z2 = true;
                }
                list.add(LIZ(new AwS1S1710000_27(z2, takoInteractionConfig, interfaceC665370Q7z, str, message, lifecycleCoroutineScope, linkedHashMap, list2, view, 1)));
                if (z) {
                    C1862330yYx.LJLJLJ(C1862330yYx.LIZ, linkedHashMap);
                }
            }
        }
    }

    public static void LJIJJLI(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, String str, String str2, List list, List list2, boolean z) {
        Map<String, String> mapLJ;
        String str3;
        Integer numValueOf;
        String strNZ0;
        Map mapLJJIFFI = LJJIFFI(str, message, interfaceC665370Q7z, str2);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1856680yPq(interfaceC665370Q7z, view, list, message, mapLJJIFFI, z, list2, null), 3);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1862330yYx.LJLJL(c1862330yYx, mapLJJIFFI);
        if (Intrinsics.LJFF(str2, "long_press")) {
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            String str4 = message.uuid;
            String str5 = message.subSessionId;
            Long lValueOf = Long.valueOf(message.actionId);
            Long lValueOf2 = Long.valueOf(message.botId);
            String strLIZIZ = C1855920yOc.LIZIZ(message);
            String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(message.ext.activeAiImageSubBar));
            boolean z2 = message.isMultiAnswer;
            if (z2) {
                str3 = "multi_answer";
            } else {
                str3 = "default";
            }
            if (z2) {
                numValueOf = Integer.valueOf(message.selectedAnswerIndex + 1);
            } else {
                numValueOf = null;
            }
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C1862950yZx.LIZ.getClass();
            C1862330yYx.LJJLJ(c1862330yYx, mapLJ, str4, str5, lValueOf, lValueOf2, "publish", strLIZIZ, str2, strLIZLLL, null, null, null, str3, numValueOf, strNZ0, C1862950yZx.LIZJ(interfaceC665370Q7z), 69120);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIL(X.C19EG r19, android.view.View r20, java.lang.String r21, com.ss.android.ugc.aweme.tako.ccl.model.api.Message r22, X.InterfaceC665370Q7z r23, java.lang.String r24, boolean r25, kotlin.jvm.functions.Function1 r26) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1857420yR2.LJIL(X.19EG, android.view.View, java.lang.String, com.ss.android.ugc.aweme.tako.ccl.model.api.Message, X.0Q7z, java.lang.String, boolean, kotlin.jvm.functions.Function1):void");
    }

    public static void LJII(List list, List list2, Message message, InterfaceC665370Q7z interfaceC665370Q7z, C19EG c19eg, View view, boolean z, boolean z2, List list3) {
        String str;
        C325310Cp7.LIZ.getClass();
        if (!C325310Cp7.LIZIZ()) {
            if (C07IE.LIZ()) {
                LJIIIZ(list, null, list2, interfaceC665370Q7z, message, view, z, "exposed_button", z2, list3);
                return;
            }
            if (list2 != null) {
                str = (String) C13LP.LJJJLL(list2);
            } else {
                str = null;
            }
            LJIILIIL(list, str, message, interfaceC665370Q7z, c19eg, view, "exposed_button", z2);
        }
    }

    public static void LJJIII(View view, InterfaceC665370Q7z interfaceC665370Q7z, Message message, List list, float f, float f2, boolean z, boolean z2, int i) {
        InterfaceC1860040yVG interfaceC1860040yVGRA0;
        Map<String, String> mapLJ;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jvCM;
        String str;
        String strNZ0;
        InterfaceC1859950yV7 textSelector;
        float f3 = f2;
        boolean z3 = z2;
        float f4 = f;
        if ((i & 16) != 0) {
            f4 = 0.0f;
        }
        if ((i & 32) != 0) {
            f3 = 0.0f;
        }
        if ((i & 64) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            z3 = false;
        }
        if (message != null && System.currentTimeMillis() - LIZLLL >= 1500 && LIZJ) {
            Integer numValueOf = null;
            TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
            if (takoCardAbility != null) {
                interfaceC1860040yVGRA0 = takoCardAbility.rA0();
                if (interfaceC1860040yVGRA0 != null && (textSelector = interfaceC1860040yVGRA0.getTextSelector()) != null) {
                    textSelector.LIZJ();
                }
            } else {
                interfaceC1860040yVGRA0 = null;
            }
            TakoChatUIAbility takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null);
            if (takoChatUIAbility != null && takoChatUIAbility.Gx1()) {
                return;
            }
            ITakoContextAbility iTakoContextAbility = (ITakoContextAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoContextAbility.class, null);
            if (iTakoContextAbility == null || (mapLJ = iTakoContextAbility.getCommonParams()) == null) {
                mapLJ = C2097608Jq.LJ();
            }
            TakoInputViewUIAbility takoInputViewUIAbility = (TakoInputViewUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoInputViewUIAbility.class, null);
            if (takoInputViewUIAbility != null) {
                takoInputViewUIAbility.Pd2();
            }
            C2174781A9k.LIZ(view);
            if (takoInputViewUIAbility != null) {
                takoInputViewUIAbility.kd();
            }
            LIZLLL = System.currentTimeMillis();
            C1919007fQ.LIZ.getClass();
            if (C1919007fQ.LIZIZ() && interfaceC1860040yVGRA0 != null && !message.sender.isSelf) {
                InterfaceC1859950yV7 textSelector2 = interfaceC1860040yVGRA0.getTextSelector();
                if (textSelector2 != null) {
                    textSelector2.LIZJ();
                }
                C1859930yV5.LJII(interfaceC1860040yVGRA0, message);
                C1859930yV5.LJI(interfaceC1860040yVGRA0, message, interfaceC665370Q7z, z3, null, 16);
            } else {
                if (list.isEmpty() || takoChatUIAbility == null || (viewOnAttachStateChangeListenerC20604515jvCM = takoChatUIAbility.cM()) == null) {
                    return;
                }
                takoChatUIAbility.iS1(false);
                TakoListAutoPlayAbility takoListAutoPlayAbility = (TakoListAutoPlayAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoListAutoPlayAbility.class, null);
                if (takoListAutoPlayAbility != null) {
                    takoListAutoPlayAbility.ZG0();
                }
                new C1860010yVD(view.getContext(), null, message, viewOnAttachStateChangeListenerC20604515jvCM, true, list, new AwS428S0200000_27(interfaceC665370Q7z, takoChatUIAbility, 82), null, false, false, null, 1922).LIZ(f4, f3, view);
            }
            if (z) {
                return;
            }
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str2 = message.uuid;
            String str3 = message.subSessionId;
            long j = message.actionId;
            long j2 = message.botId;
            String strLIZIZ = C1855920yOc.LIZIZ(message);
            String strLIZLLL = C1852810yJb.LIZLLL(Integer.valueOf(message.ext.activeAiImageSubBar));
            String strLJJI = LJJI(message);
            boolean z4 = message.isMultiAnswer;
            if (z4) {
                str = "multi_answer";
            } else {
                str = "default";
            }
            if (z4) {
                numValueOf = Integer.valueOf(message.selectedAnswerIndex + 1);
            }
            ITakoScreenTypeAbility iTakoScreenTypeAbility = (ITakoScreenTypeAbility) C1558520qew.LIZ(interfaceC665370Q7z, ITakoScreenTypeAbility.class, null);
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C1862950yZx.LIZ.getClass();
            C1862330yYx.LJJLL(c1862330yYx, mapLJ, str2, str3, Long.valueOf(j), Long.valueOf(j2), strLIZIZ, strLIZLLL, strLJJI, str, numValueOf, null, strNZ0, "long_press", C1862950yZx.LIZJ(interfaceC665370Q7z), 17408);
        }
    }

    public static void LJIIIZ(List list, String str, List list2, InterfaceC665370Q7z interfaceC665370Q7z, Message message, View view, boolean z, String str2, boolean z2, List list3) {
        if (C07IE.LIZ() && list2 != null && !list2.isEmpty()) {
            list.add(LIZ(new AwS0S2510000_27(view, interfaceC665370Q7z, message, str2, str, list2, list3, z2, 1)));
            if (z) {
                C1862330yYx.LJLJLJ(C1862330yYx.LIZ, LJJIFFI(str, message, interfaceC665370Q7z, str2));
            }
        }
    }
}
