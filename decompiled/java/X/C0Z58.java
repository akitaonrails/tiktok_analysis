package X;

import com.bytedance.im.core.common.statusmsg.BusinessCommandMessage;
import com.bytedance.im.core.proto.status_message.StatusMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.publicgroup.data.GroupAccessCriteria;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z58, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z58 implements InterfaceC1222510huz {
    public static final C0Z58 LIZ = new C0Z58();

    public static final void LJIIL(BusinessCommandMessage businessCommandMessage) {
        if (businessCommandMessage.getContentPb() == null) {
            Function1<C0Y7K, Unit> onResult = businessCommandMessage.getOnResult();
            if (onResult != null) {
                onResult.invoke(new C0Y3A(EnumC868890Y6t.INVALID_PARAMETER, "onReceiveCmdMessage contentPb is null", (Integer) null, 12));
                return;
            }
            return;
        }
        StatusMessage statusMessage = businessCommandMessage.getStatusMessage();
        if (statusMessage != null) {
            Integer num = statusMessage.type;
            int value = EnumC893850Z4t.GroupAuditAppend.getValue();
            if (num != null && num.intValue() == value) {
                C0Z5O c0z5o = C0Z5O.LIZ;
                try {
                    Long l = C2230701CSm.ADAPTER.decode(statusMessage.entity).conv_short_id;
                    List listSingletonList = Collections.singletonList(l);
                    AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(l, 376);
                    if (!listSingletonList.isEmpty()) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2187208ha(listSingletonList, null, awS593S0100000_14), 3);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
            int value2 = EnumC893850Z4t.GroupAuditAck.getValue();
            if (num != null && num.intValue() == value2) {
                C0Z5O c0z5o2 = C0Z5O.LIZ;
                try {
                    String string = C2230731CSp.ADAPTER.decode(statusMessage.entity).conv_short_id.toString();
                    Long l2 = C1CHD.ADAPTER.decode(statusMessage.value).apply_id;
                    Iterator<InterfaceC892370Yzb> it2 = C0Z5O.LJ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LIZIZ(l2.longValue(), string);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
        }
    }

    @Override // X.InterfaceC1222510huz
    public final boolean LIZ(String str) {
        String str2;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            str2 = ext.get("a:hide_member_switch");
        } else {
            str2 = null;
        }
        return Intrinsics.LJFF(str2, "1");
    }

    @Override // X.InterfaceC1222510huz
    public final boolean LIZIZ(String str) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null && ext.get("a:hide_member_switch") != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1222510huz
    public final List<GroupAccessCriteria> LIZJ(String str) {
        String str2;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        try {
            Gson gson = C7740030o.LIZ().getGson();
            if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
                str2 = ext.get("a:access_criteria");
            } else {
                str2 = null;
            }
            List<GroupAccessCriteria> list = (List) gson.LJIIIIZZ(str2, new TypeToken<List<? extends GroupAccessCriteria>>() { // from class: X.0Z59
            }.getType());
            if (list == null) {
                return C13BV.INSTANCE;
            }
            return list;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C13BV.INSTANCE;
        }
    }

    @Override // X.InterfaceC1222510huz
    public final boolean LJ(String str) {
        return Intrinsics.LJFF(C1509605va.LIZ(str, "a:invite_link_switch"), "1");
    }

    @Override // X.InterfaceC1222510huz
    public final String LJFF(String str) {
        return C1509605va.LIZ(str, "a:audit_question");
    }

    @Override // X.InterfaceC1222510huz
    public final String LJI(String str) {
        Map<String, String> ext;
        C0Y8Y coreInfo;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null) {
            ext = coreInfo.getExt();
        } else {
            ext = null;
        }
        if (ext != null && ext.containsKey("a:seller_live_reminder_switch")) {
            return "a:seller_live_reminder_switch";
        }
        if (ext != null && ext.containsKey("a:live_reminder_switch")) {
            return "a:live_reminder_switch";
        }
        return "";
    }

    @Override // X.InterfaceC1222510huz
    public final boolean LJIIIIZZ(String str) {
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        if (c0y8tLIZ != null && (coreInfo = c0y8tLIZ.getCoreInfo()) != null && (ext = coreInfo.getExt()) != null) {
            if (ext.containsKey("a:live_reminder_switch") || ext.containsKey("a:seller_live_reminder_switch")) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1222510huz
    public final boolean LJIIIZ(String str) {
        return Intrinsics.LJFF(C1509605va.LIZ(str, "a:audit_switch"), "1");
    }

    public final boolean LJIIJJI(C0Y8T c0y8t) {
        if (c0y8t == null || !LJIIIZ(c0y8t.getConversationId()) || !C1727806pg.LIZ.LIZ("group_chat_operation_audit_request", c0y8t.getConversationId(), C461720I8s.LIZIZ(), false) || !C0ZFW.LIZ.LJIIIZ(c0y8t)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1222510huz
    public final C0Z5B LIZLLL(String str, String str2) {
        String str3;
        C0Y8Y coreInfo;
        Map<String, String> ext;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str);
        C0Z5A c0z5a = C0Z5B.Companion;
        if (c0y8tLIZ == null || (coreInfo = c0y8tLIZ.getCoreInfo()) == null || (ext = coreInfo.getExt()) == null || (str3 = ext.get(str2)) == null) {
            str3 = "";
        }
        c0z5a.getClass();
        C0Z5B c0z5b = C0Z5B.map$delegate.getValue().get(str3);
        if (c0z5b == null) {
            return C0Z5B.NOT_QUALIFIED;
        }
        return c0z5b;
    }

    @Override // X.InterfaceC1222510huz
    public final void LJII(String str, boolean z, C1222480huw c1222480huw) {
        String str2;
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c866530Xz1LIZIZ.LJIL(C2097908Jt.LIZJ(new Pair("a:invite_link_switch", str2)), c1222480huw);
    }

    @Override // X.InterfaceC1222510huz
    public final void LJIIJ(String str, boolean z, C1650106d9 c1650106d9) {
        String str2;
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        c866530Xz1LIZIZ.LJIL(C2097908Jt.LIZJ(new Pair("a:hide_member_switch", str2)), c1650106d9);
    }

    public static final void LJIILIIL(String str, String str2, boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Z5B c0z5b;
        if (str == null) {
            return;
        }
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        if (z) {
            c0z5b = C0Z5B.ENABLED;
        } else {
            c0z5b = C0Z5B.DISABLED;
        }
        c866530Xz1LIZIZ.LJIL(C2097908Jt.LIZJ(new Pair(str2, c0z5b.getValue())), interfaceC863600XuI);
    }
}
