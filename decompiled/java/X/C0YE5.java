package X;

import com.bytedance.im.core.proto.MessageKey;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YE5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YE5 extends AbstractC866690XzH<C0YE6> implements C0YE6 {
    @Override // X.C0YE6
    public final void LJIJJLI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("retrySendMessages"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJIJJLI();
        }
    }

    @Override // X.C0YE6
    public final long LLIIIL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMaxIndexRegardlessConversation"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LLIIIL();
    }

    @Override // X.C0YE6
    public final void LLLFF() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("processAllPendingMessageBody"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLLFF();
        }
    }

    public C0YE5(C0YEF c0yef) {
        super(c0yef, "MsgOperatorModelProxy");
    }

    @Override // X.C0YE6
    public final C0Y6Q<C0Y9O> LJIIL(C0Y9U c0y9u) {
        C0Y6Q<C0Y9O> c0y6qLIZ = C865670Xxd.LIZ(-1, "No active session");
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMessages"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJIIL(c0y9u);
        }
        return c0y6qLIZ;
    }

    @Override // X.C0YE6
    public final Long LJJIFFI(C869590Y9l c869590Y9l) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getReEditDeadlineMs"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJJIFFI(c869590Y9l);
    }

    @Override // X.C0YE6
    public final C0Y6Q<C0Y9N> LJJII(C0Y9U c0y9u) {
        C0Y6Q<C0Y9N> c0y6qLIZ = C865670Xxd.LIZ(-1, "No active session");
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("countMessages"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJJII(c0y9u);
        }
        return c0y6qLIZ;
    }

    @Override // X.C0YE6
    public final void LJJIIJ(C869520Y9e c869520Y9e) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addPendingMessageBody"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJIIJ(c869520Y9e);
        }
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJIIZI(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgByUuid"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LJJIIZI(str);
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJJIJIIJIL(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesByIds"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJJIJIIJIL(list);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final List LJJIJLIJ(long j) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLatestMessagesSentByUser"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJJIJLIJ(j);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJLJ(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLastShowMsg"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJJLJ(str);
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJJLJLI(List<Long> list) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesByMessageId"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJJLJLI(list);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final C869590Y9l LJLIIL(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgByMsgId"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJLIIL(j);
    }

    @Override // X.C0YE6
    public final long LJLZ(String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getFirstShowMsgIndex"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJLZ(str);
    }

    @Override // X.C0YE6
    public final long LLF(List<Integer> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLatestCreateTime"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LLF(list);
    }

    @Override // X.C0YE6
    public final List LLFII(String str) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("initMessageListSync"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLFII(str);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final void LLIIIILZ(List<C869590Y9l> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMessagesProperty"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLIIIILZ(list);
        }
    }

    @Override // X.C0YE6
    public final boolean LLIIIZ(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isMsgSaved"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LLIIIZ(j);
    }

    @Override // X.C0YE6
    public final List<Long> LLIIJI(List<Long> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgIdListBy"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LLIIJI(list);
    }

    @Override // X.C0YE6
    public final Map<String, List<C0YC6>> LLJJIII(List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getAttachmentsMapByMD5"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLJJIII(list);
        }
        return linkedHashMap;
    }

    @Override // X.C0YE6
    public final void LLJJIJIIJIL(List<String> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("deleteAttachmentByMD5"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLJJIJIIJIL(list);
        }
    }

    @Override // X.AbstractC866690XzH
    public final C0YE6 LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIIJJI();
    }

    @Override // X.C0YE6
    public final void LIZJ(C914120Zta c914120Zta, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("sendMessagesInOrder"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LIZJ(c914120Zta, list);
        } else {
            c914120Zta.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final void LJIJI(C869590Y9l c869590Y9l, C914150Ztd c914150Ztd) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("undoDeleteMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJIJI(c869590Y9l, c914150Ztd);
        } else {
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final List LJIL(long j, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLimitMessageListByOldestCreateTime"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJIL(j, list);
    }

    @Override // X.C0YE6
    public final void LJJIJL(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJIJL(c869590Y9l, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final C869590Y9l LJJIL(long j, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgByIndex"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJJIL(j, str);
    }

    @Override // X.C0YE6
    public final void LJJJJ(C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("recallMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJJJ(c869590Y9l, c914120Zta);
        } else {
            c914120Zta.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final List LJJJJLI(String str, long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesBeforeTime"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJJJJLI(str, j);
    }

    @Override // X.C0YE6
    public final boolean LJLI(C869590Y9l c869590Y9l, Boolean bool) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isMessageUnread"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJLI(c869590Y9l, bool);
    }

    @Override // X.C0YE6
    public final void LLI(C0Y3I c0y3i, List<C869590Y9l> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("notifyUpdateMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLI(c0y3i, list);
        }
    }

    @Override // X.C0YE6
    public final List LLILII(long j, List list) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgList"));
        if (c0yedLIZIZ != null) {
            return LLLJ(c0yedLIZIZ).LLILII(j, list);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final int LLJJIJIL(long j, long j2) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("computeMsgCountRegardlessConv"));
        if (c0yedLIZIZ == null) {
            return 0;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LLJJIJIL(j, j2);
    }

    @Override // X.C0YE6
    public final void LLJJJJLIIL(C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("sendMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLJJJJLIIL(c869590Y9l, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final void LLJLLIL(C0Y3I c0y3i, List<C869590Y9l> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchUpdateMessageContentPb"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LLJLLIL(c0y3i, list);
        }
    }

    @Override // X.C0YE6
    public final void LIZ(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("deleteMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LIZ(c869590Y9l, z, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final void LJIILL(C0Y3I c0y3i, C0YA6 c0ya6, C914090ZtX c914090ZtX) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("modifyMessageProperty"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJIILL(c0y3i, c0ya6, c914090ZtX);
        } else {
            if (c914090ZtX == null) {
                return;
            }
            C866590Xz7.LIZ();
        }
    }

    @Override // X.C0YE6
    public final void LJJIIJZLJL(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("sendMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJIIJZLJL(c869590Y9l, z, interfaceC863600XuI);
        } else {
            ((C914150Ztd) interfaceC863600XuI).LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final void LJJIIZ(C0Y3I c0y3i, C869590Y9l c869590Y9l, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJIIZ(c0y3i, c869590Y9l, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final void LJJIJ(long j, InterfaceC863600XuI interfaceC863600XuI, C0Y8T c0y8t) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgByServerId"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJJIJ(j, interfaceC863600XuI, c0y8t);
        } else {
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final long LJJLL(String str, int[] iArr, long[] jArr) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("computeMsgCountWithFilter"));
        if (c0yedLIZIZ == null) {
            return 0L;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJJLL(str, iArr, jArr);
    }

    @Override // X.C0YE6
    public final List LJLILLLLZI(String str, long j, String str2) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesAfterTime"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJLILLLLZI(str, j, str2);
    }

    @Override // X.C0YE6
    public final int LJZI(long j, long j2, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("computeMsgCount"));
        if (c0yedLIZIZ == null) {
            return 0;
        }
        return c0yedLIZIZ.LJIJI().LJIIJJI().LJZI(j, j2, str);
    }

    @Override // X.C0YE6
    public final List LLILLIZIL(int i, String str, List list) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getLatestMessageList"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLILLIZIL(i, str, list);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final void LJIILLIIL(List<MessageKey> list, int i, InterfaceC863600XuI<Boolean> interfaceC863600XuI, Long l, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchGetMsgById"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIIJJI().LJIILLIIL(list, i, interfaceC863600XuI, l, str);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LLJILLL(String str, long j, List<Integer> list, List<Integer> list2, List<String> list3, int i) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryTargetMessageList"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLJILLL(str, j, list, list2, list3, i);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final List LLILZLL(long j, long j2, int i, boolean z, int[] iArr, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMessageListInRange"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLILZLL(j, j2, i, z, iArr, z2, z3);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final List LLJJL(long j, int i, boolean z, int[] iArr, boolean z2, boolean z3, long j2) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryMessageListInRangeWithTimeThreshold"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LLJJL(j, i, z, iArr, z2, z3, j2);
        }
        return arrayList;
    }

    @Override // X.C0YE6
    public final List<C869590Y9l> LJZ(String str, long j, List<Integer> list, List<Integer> list2, List<String> list3, int i, long j2, Integer num) {
        ArrayList arrayList = new ArrayList();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("queryTargetMessageList"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIIJJI().LJZ(str, j, list, null, null, i, j2, num);
        }
        return arrayList;
    }
}
