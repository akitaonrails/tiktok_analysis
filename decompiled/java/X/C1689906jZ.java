package X;

import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.im.message.content.GroupSystemContent;
import com.ss.android.ugc.aweme.im.message.content.adapter.BaseContentParserKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06jZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1689906jZ implements C1DW6 {
    public static final C1689906jZ LL = new C1689906jZ();
    public static boolean LLILLJJLI;
    public static final C01GW LLILLL;
    public static final C01GW LLILZ;

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Ip(int i, C0YC9 c0yc9, C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Jk(C869590Y9l c869590Y9l, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void LLILZ(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Re(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void Us(List<C869590Y9l> list, EnumC872590YKz enumC872590YKz) {
    }

    @Override // X.C1DW6
    public final void VD0(C1DW6 c1dw6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void a(int i, String str, List list, Long l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void gb(C0Y3I c0y3i, List<? extends C869590Y9l> list, Map<String, Map<String, String>> map, int i) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void hk(C0Y3I c0y3i, int i, C0YA6 c0ya6) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mf(C869590Y9l c869590Y9l) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void mp(C0Y3I c0y3i, C869590Y9l c869590Y9l, Map<String, List<C0YA1>> map, Map<String, List<C0YA1>> map2, Long l, Long l2) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void nc(List<? extends C869590Y9l> list) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void ns(String str) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void su(C869590Y9l c869590Y9l, boolean z) {
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void u6(List<C869590Y9l> list, boolean z) {
    }

    @Override // X.C1DW6
    public final void yf1(C1DW6 c1dw6) {
    }

    static {
        EnumC452301pR enumC452301pR = EnumC452301pR.SYNCHRONIZED;
        LLILLL = C452501pT.LIZ(enumC452301pR, new C1678706hl());
        LLILZ = C452501pT.LIZ(enumC452301pR, new C1690206jc());
    }

    public static void LIZ(C869590Y9l c869590Y9l) {
        GroupSystemContent groupSystemContent;
        String conversationId;
        List<BaseContact> objectUsers;
        BaseContact baseContact;
        boolean z;
        if (c869590Y9l.getMsgType() != 1031) {
            return;
        }
        BaseContent orParseJsonContent = BaseContentParserKt.getOrParseJsonContent(c869590Y9l, BaseContent.class);
        Boolean boolValueOf = null;
        if ((orParseJsonContent instanceof GroupSystemContent) && (groupSystemContent = (GroupSystemContent) orParseJsonContent) != null) {
            int i = groupSystemContent.type;
            if ((i == 103105 || i == 103201) && (conversationId = c869590Y9l.getConversationId()) != null && (objectUsers = groupSystemContent.getObjectUsers()) != null && (baseContact = (BaseContact) C13LP.LJJLIIIJL(objectUsers)) != null) {
                List<BaseContact> objectUsers2 = groupSystemContent.getObjectUsers();
                String str = "";
                if (objectUsers2 != null) {
                    if (!objectUsers2.isEmpty()) {
                        Iterator<BaseContact> it2 = objectUsers2.iterator();
                        while (it2.hasNext()) {
                            String uid = it2.next().getUid();
                            String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
                            if (curUserId == null) {
                                curUserId = "";
                            }
                            if (Intrinsics.LJFF(uid, curUserId)) {
                                z = true;
                                break;
                            }
                        }
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    } else {
                        z = false;
                        boolValueOf = Boolean.valueOf(z);
                    }
                }
                if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                    C0YNP.LJIIIIZZ(conversationId, "last_enter_chat_timestamp", "-1");
                    return;
                }
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair("last_added_member_timestamp", String.valueOf(c869590Y9l.getCreatedAt()));
                String nickName = baseContact.getNickName();
                if (nickName != null || (nickName = baseContact.getDisplayName()) != null) {
                    str = nickName;
                }
                pairArr[1] = new Pair("last_added_member_name", str);
                C0YNP.LIZ(conversationId, C2097608Jq.LJIIIIZZ(pairArr));
            }
        }
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void kl(List<? extends C869590Y9l> list, List<? extends C869590Y9l> list2) {
        C23250099c.LIZLLL((InterfaceC497601wk) LLILZ.getValue(), null, null, new C1690106jb(list2, null), 3);
    }

    @Override // X.C1DW6, X.InterfaceC868420Y4y
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
        C23250099c.LIZLLL((InterfaceC497601wk) LLILZ.getValue(), null, null, new C1690006ja(list, null), 3);
    }
}
