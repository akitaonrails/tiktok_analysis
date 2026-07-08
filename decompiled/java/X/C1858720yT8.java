package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.offline.tako.debug.ITakoDebugService;
import com.ss.android.ugc.aweme.tako.botpage.cards.ability.TakoCardAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import com.ss.android.ugc.aweme.tako.ui.TakoChatUIAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858720yT8 {
    public static final C746540TQe LIZ = new C746540TQe("tako_feedback", 2131828537, R.raw.icon_x_mark_small, 2131849276, 2131828536, C13BV.INSTANCE);
    public static final C746540TQe LIZIZ = new C746540TQe("tako_feedback", 2131828537, R.raw.icon_x_mark_small, 2131849276, 2131822448, C1697810uHb.LJIIJJI(new C0DL5(2131828531, "This is harmful/unsafe"), new C0DL5(2131828532, "This isn't helpful"), new C0DL5(2131828533, "This isn't true"), new C0DL5(2131828534, "Other")));

    public static List LIZIZ(List list) {
        if (list != null && !list.isEmpty() && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TakoInteractionConfig takoInteractionConfig = (TakoInteractionConfig) it2.next();
                if (C0R2Q.LIZ(takoInteractionConfig.type) > 0 || C0R2Q.LIZ(takoInteractionConfig.status) > 0) {
                    return list;
                }
            }
        }
        return C1697810uHb.LJIIJJI(new TakoInteractionConfig(1, 2), new TakoInteractionConfig(2, 2), new TakoInteractionConfig(3, 0), new TakoInteractionConfig(4, 0));
    }

    public static void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z) {
        Message messageYy1;
        String strBv1;
        String str;
        String str2;
        String str3;
        String str4;
        Integer numValueOf;
        TakoMixFeed takoMixFeedLJIIIZ;
        Activity activityLIZIZ;
        Integer numValueOf2 = null;
        TakoCardAbility takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        if (takoCardAbility != null) {
            messageYy1 = takoCardAbility.Yy1();
        } else {
            messageYy1 = null;
        }
        TakoCardAbility takoCardAbility2 = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null);
        if (takoCardAbility2 == null || (strBv1 = takoCardAbility2.bv1()) == null) {
            strBv1 = "";
        }
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            C1388190mED.LIZ(activityLIZIZ);
        }
        AnonymousClass1425.LIZ.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("uuid: ");
        if (messageYy1 != null) {
            str = messageYy1.uuid;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append("\nmessageId: ");
        if (messageYy1 != null) {
            str2 = messageYy1.msgId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append("\nconversationId: ");
        if (messageYy1 != null) {
            str3 = messageYy1.conversationId;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append("\nsubConversationId: ");
        if (messageYy1 != null) {
            str4 = messageYy1.subConversationId;
        } else {
            str4 = null;
        }
        sbLIZ.append(str4);
        sbLIZ.append("\nclientStatus: ");
        if (messageYy1 != null) {
            numValueOf = Integer.valueOf(messageYy1.LIZIZ);
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append("\ncardType: ");
        if (messageYy1 != null && (takoMixFeedLJIIIZ = messageYy1.LJIIIZ()) != null) {
            numValueOf2 = Integer.valueOf(takoMixFeedLJIIIZ.cardType);
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append("\ncardName: ");
        sbLIZ.append(strBv1);
        C2188811AlT.LIZIZ(sbLIZ);
        GsonProtectorUtils.toJson(C597040NbK.LIZ(), messageYy1);
        ITakoDebugService iTakoDebugServiceLIZ = AnonymousClass1425.LIZ();
        if (iTakoDebugServiceLIZ != null) {
            iTakoDebugServiceLIZ.LIZJ();
        }
    }

    public static boolean LJ(Message message) {
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoMixFeed takoMixFeedLJIIIZ2;
        int i = message.msgType;
        if (i == 4 || i == 5 || (((takoMixFeedLJIIIZ = message.LJIIIZ()) != null && takoMixFeedLJIIIZ.cardType == 1007) || ((takoMixFeedLJIIIZ2 = message.LJIIIZ()) != null && takoMixFeedLJIIIZ2.cardType == 1008))) {
            return false;
        }
        TakoMixFeed takoMixFeedLJIIIZ3 = message.LJIIIZ();
        if ((takoMixFeedLJIIIZ3 != null && takoMixFeedLJIIIZ3.cardType == 1014) || message.sender.senderType != 2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.Message r3) {
        /*
            boolean r0 = X.C1858670yT3.LJI(r3)
            r2 = 1
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r3.LJIIIZ()
            boolean r0 = X.AnonymousClass1418.LJFF(r0)
            if (r0 != 0) goto L4d
            int r1 = r3.msgType
            r0 = 5
            if (r1 == r0) goto L4d
            boolean r0 = LJ(r3)
            if (r0 == 0) goto L4d
            X.0CoI r0 = X.C324800CoI.LIZ
            r0.getClass()
            boolean r0 = X.C324800CoI.LIZ()
            if (r0 == 0) goto L3f
            boolean r0 = r3.isPush
            if (r0 == 0) goto L3f
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r3.LJIIIZ()
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNimbleConfig r0 = r0.nimbleConfig
            if (r0 == 0) goto L4e
            java.lang.String r1 = r0.nimbleKey
        L37:
            java.lang.String r0 = "multi_modal_push"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L4d
        L3f:
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed r0 = r3.LJIIIZ()
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.tako.ccl.model.api.TakoPassExt r0 = r0.ext
            if (r0 == 0) goto L50
            int r0 = r0.interactionType
            if (r0 != r2) goto L50
        L4d:
            return r2
        L4e:
            r1 = 0
            goto L37
        L50:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858720yT8.LJFF(com.ss.android.ugc.aweme.tako.ccl.model.api.Message):boolean");
    }

    public static boolean LJI(InterfaceC665370Q7z interfaceC665370Q7z, Message message) {
        TakoChatUIAbility takoChatUIAbility;
        if ((interfaceC665370Q7z != null && (takoChatUIAbility = (TakoChatUIAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoChatUIAbility.class, null)) != null && takoChatUIAbility.Gx1()) || LJFF(message)) {
            return true;
        }
        return false;
    }

    public static void LIZ(TakoInteractionConfig takoInteractionConfig, boolean z, InterfaceC665370Q7z interfaceC665370Q7z) {
        TakoCardAbility takoCardAbility;
        Message messageYy1;
        TakoMixFeed takoMixFeedLIZ;
        List<TakoInteractionConfig> list;
        Integer num = takoInteractionConfig.type;
        if (num != null) {
            if ((num.intValue() == 3 || num.intValue() == 4) && (takoCardAbility = (TakoCardAbility) C1558520qew.LIZ(interfaceC665370Q7z, TakoCardAbility.class, null)) != null && (messageYy1 = takoCardAbility.Yy1()) != null) {
                Message messageLJ = messageYy1.LJ();
                TakoMixFeed takoMixFeedLJIIIZ = messageYy1.LJIIIZ();
                if (takoMixFeedLJIIIZ != null) {
                    TakoMixFeed takoMixFeedLJIIIZ2 = messageLJ.LJIIIZ();
                    if (takoMixFeedLJIIIZ2 != null) {
                        list = takoMixFeedLJIIIZ2.interactionStatus;
                    } else {
                        list = null;
                    }
                    List<TakoInteractionConfig> listLIZIZ = LIZIZ(list);
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZIZ, 10));
                    for (TakoInteractionConfig takoInteractionConfig2 : listLIZIZ) {
                        if (Intrinsics.LJFF(takoInteractionConfig2.type, takoInteractionConfig.type)) {
                            takoInteractionConfig2 = new TakoInteractionConfig(takoInteractionConfig2.type, Integer.valueOf(z ? 1 : 0));
                        }
                        arrayList.add(takoInteractionConfig2);
                    }
                    takoMixFeedLIZ = TakoMixFeed.LIZ(takoMixFeedLJIIIZ, arrayList, null, -65537);
                } else {
                    takoMixFeedLIZ = null;
                }
                messageLJ.LJIIJ(takoMixFeedLIZ);
                IMessageAbility iMessageAbility = (IMessageAbility) C1558520qew.LIZ(interfaceC665370Q7z, IMessageAbility.class, null);
                if (iMessageAbility != null) {
                    iMessageAbility.ua2(messageLJ, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0201 A[PHI: r23
      0x0201: PHI (r23v3 boolean) = (r23v2 boolean), (r23v2 boolean), (r23v2 boolean), (r23v0 boolean) binds: [B:117:0x0254, B:128:0x0274, B:130:0x027b, B:94:0x01f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig r36, android.view.View r37, java.lang.Integer r38, X.InterfaceC665370Q7z r39, java.lang.String r40) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1858720yT8.LIZLLL(com.ss.android.ugc.aweme.tako.ccl.model.api.TakoInteractionConfig, android.view.View, java.lang.Integer, X.0Q7z, java.lang.String):void");
    }
}
