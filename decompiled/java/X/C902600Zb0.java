package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.fake.message.FakeMsgOperatorService;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS130S1200000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS65S1000000_14;

/* JADX INFO: renamed from: X.0Zb0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C902600Zb0 {
    public final Map<String, Function0<Unit>> LIZ = Collections.synchronizedMap(new LinkedHashMap());

    public final void LIZ(final SessionInfo sessionInfo) {
        Function0<Unit> function0Remove = this.LIZ.remove(sessionInfo.getConversationId());
        if (function0Remove != null) {
            function0Remove.invoke();
        }
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            fakeMsgOperatorService.LIZ(sessionInfo.getConversationId(), LIZJ(sessionInfo.getConversationId(), new AwS593S0100000_14(sessionInfo, 156)), sessionInfo.getUuid(), new InterfaceC1757506uT() { // from class: X.0Zb1
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str) {
                    String str2;
                    if (i == 1) {
                        if (c1736606r6 != null && (str2 = c1736606r6.LIZJ) != null) {
                            C902390Zaf c902390Zaf = C902390Zaf.LIZ;
                            String conversationId = sessionInfo.getConversationId();
                            c902390Zaf.getClass();
                            C902390Zaf.LJ.remove(conversationId);
                            C902390Zaf.LJII.erase(C902390Zaf.LIZJ(conversationId));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("deleted: ");
                            sbLIZ.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            return;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("statusCode: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", statusMsg: ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            });
        }
        FakeMsgOperatorService fakeMsgOperatorService2 = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService2 != null) {
            String conversationId = sessionInfo.getConversationId();
            String uuid = sessionInfo.getUuid();
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZJ = "fake-msg-story-friend-anniversary-card";
            c1684506ih.LIZLLL(40);
            fakeMsgOperatorService2.LIZ(conversationId, c1684506ih, uuid, new InterfaceC1757506uT() { // from class: X.0Zaz
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str) {
                    String str2;
                    if (i == 1) {
                        if (c1736606r6 != null && (str2 = c1736606r6.LIZJ) != null) {
                            C902390Zaf c902390Zaf = C902390Zaf.LIZ;
                            String conversationId2 = sessionInfo.getConversationId();
                            c902390Zaf.getClass();
                            C902390Zaf.LJ.remove(conversationId2);
                            C902390Zaf.LJII.erase(C902390Zaf.LIZJ(conversationId2));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("card msg deleted: ");
                            sbLIZ.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            return;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("card msg statusCode: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", statusMsg: ");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
            });
        }
    }

    public static final void LIZIZ(final String str, final AwS130S1200000_14 awS130S1200000_14) {
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            fakeMsgOperatorService.LIZ(str, LIZJ(str, new AwS65S1000000_14(str, 2)), null, new InterfaceC1757506uT() { // from class: X.0Zb2
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str2) {
                    String str3;
                    if (i == 1) {
                        if (c1736606r6 != null && (str3 = c1736606r6.LIZJ) != null) {
                            C902390Zaf c902390Zaf = C902390Zaf.LIZ;
                            String str4 = str;
                            c902390Zaf.getClass();
                            C902390Zaf.LJ.remove(str4);
                            C902390Zaf.LJII.erase(C902390Zaf.LIZJ(str4));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("deleted: ");
                            sbLIZ.append(str3);
                            C2188811AlT.LIZIZ(sbLIZ);
                        } else {
                            return;
                        }
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("statusCode: ");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", statusMsg: ");
                    sbLIZ2.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    awS130S1200000_14.invoke();
                }
            });
        }
    }

    public static C1684506ih LIZJ(String str, Function1 function1) {
        C1684506ih c1684506ih = new C1684506ih();
        C902390Zaf.LIZ.getClass();
        String string = C902390Zaf.LJ.get(str);
        if (string == null) {
            Keva keva = C902390Zaf.LJII;
            String strLIZJ = C902390Zaf.LIZJ(str);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fake-msg-story-friend-anniversary-pop-up");
            sbLIZ.append(str);
            sbLIZ.append(System.currentTimeMillis());
            string = keva.getString(strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getFakeMsgUUid: ");
            sbLIZ2.append(string);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        function1.invoke(string);
        c1684506ih.LIZJ = string;
        c1684506ih.LIZLLL(41);
        return c1684506ih;
    }

    public static final C1736806r8 LJ(long j, String str) {
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            return fakeMsgOperatorService.LIZIZ(str, LIZJ(str, new AwS65S1000000_14(str, 3)), UUID.randomUUID().toString(), new InterfaceC1757506uT() { // from class: X.0Zb4
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("statusCode: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", statusMsg: ");
                    sbLIZ.append(str2);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }, Long.valueOf(j));
        }
        return null;
    }

    public final void LIZLLL(SessionInfo sessionInfo, Function0<Unit> function0) {
        this.LIZ.put(sessionInfo.getConversationId(), function0);
        FakeMsgOperatorService fakeMsgOperatorService = (FakeMsgOperatorService) PluggableExtentionKt.pluggableSpi$default(FakeMsgOperatorService.class, false, false, false, 14, null);
        if (fakeMsgOperatorService != null) {
            String conversationId = sessionInfo.getConversationId();
            String uuid = sessionInfo.getUuid();
            C1684506ih c1684506ih = new C1684506ih();
            c1684506ih.LIZJ = "fake-msg-story-friend-anniversary-card";
            c1684506ih.LIZLLL(40);
            fakeMsgOperatorService.LIZIZ(conversationId, c1684506ih, uuid, new InterfaceC1757506uT() { // from class: X.0Zb3
                @Override // X.InterfaceC1757506uT
                public final void LIZIZ(C1736606r6 c1736606r6, int i, String str) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("statusCode: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", statusMsg: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }, null);
        }
    }
}
