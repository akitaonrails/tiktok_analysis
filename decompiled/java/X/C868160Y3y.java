package X;

import com.bytedance.im.core.proto.MessageKey;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS6S0201100_14;

/* JADX INFO: renamed from: X.0Y3y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C868160Y3y extends AbstractC866690XzH<InterfaceC868170Y3z> implements InterfaceC868170Y3z {
    @Override // X.InterfaceC868170Y3z
    public final void LIZIZ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("onLogout"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LIZIZ();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIJ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("onLogin"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJIIJ();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("switchToForeground"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJ();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJIJIIJI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("switchToBackground"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJIJIIJI();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLLLLL() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("onInitPullEnd"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJLLLLLL();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLFZ() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("onNetworkRecovered"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLLFZ();
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLI() {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("checkAndRepairConversations"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLLI();
        }
    }

    public C868160Y3y(C0YEF c0yef) {
        super(c0yef, "UseCaseCenterProxy");
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIZILJ(long j) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("receiveWsFailureAck"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJIIZILJ(j);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJJ(int i) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("onPullMessagesEnd"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJJJJ(i);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLI(C869590Y9l c869590Y9l) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("stopMessageSending"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJLLI(c869590Y9l);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLJ(C0YL9 c0yl9) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("resolveMessagesGapsAndCheckMissing"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJLLJ(c0yl9);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final boolean LLJLIL(int i) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("isPullingMessage"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return c0yedLIZIZ.LJIJI().LJIJI().LLJLIL(i);
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJZ(List<? extends C869590Y9l> list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("retrySendMessages"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJZ(list);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLF(C0Y8F c0y8f) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagePreview"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLLF(c0y8f);
        }
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC868170Y3z LLLJ(C0YED c0yed) {
        return c0yed.LJIJI().LJIJI();
    }

    @Override // X.InterfaceC868170Y3z
    public final void LIZJ(C914120Zta c914120Zta, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("sendMessagesInOrder"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LIZJ(c914120Zta, list);
        } else {
            c914120Zta.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJ(long j, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("retryCreateGroupConversationWithId"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJ(j, str);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJJL(int i, boolean z) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("saveLastPullSuccessTime"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJJJJL(i, z);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJLIIIJILLIZJL(C869590Y9l c869590Y9l, C914120Zta c914120Zta) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("recallSentMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJLIIIJILLIZJL(c869590Y9l, c914120Zta);
        } else {
            c914120Zta.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final Object LJJLIIIJJIZ(boolean z, InterfaceC1364105Vn<? super C0Y40> interfaceC1364105Vn) {
        C0YEF c0yef = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(".prefetchConversationShortIds");
        C0YED c0yedLIZIZ = c0yef.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIJI().LJJLIIIJJIZ(z, interfaceC1364105Vn);
        }
        new ConcurrentHashMap();
        return new C0Y40(null, C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLJI(C873240YNm c873240YNm, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("addMembers"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJLJI(c873240YNm, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJLLILLLL(Long l, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("markConversationRead"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJLLILLLL(l, str);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIZ(String str, byte[] bArr) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("receiveWs"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLIIZ(str, bArr);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final List<C0YNC> LLILIL(String str, List<? extends C869590Y9l> list) {
        C13BV c13bv = C13BV.INSTANCE;
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("detectGapsInMessageList"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIJI().LLILIL(str, list);
        }
        return c13bv;
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJIJIL(String str, InterfaceC867020Xzo interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("leaveConversation"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJIJIL(str, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJLIIIJLLLLLLLZ(List<String> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchMarkConversationReadById"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJJLIIIJLLLLLLLZ(list, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLLIIL(List list, C914150Ztd c914150Ztd) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchMarkConversationRead"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLLIIL(list, c914150Ztd);
        } else {
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJIIJZLJL(C869590Y9l c869590Y9l, boolean z, InterfaceC863600XuI<C869590Y9l> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("sendMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJIIJZLJL(c869590Y9l, z, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJLI(String str, boolean z, InterfaceC867020Xzo<String> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("dissolveConversation"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJLI(str, z, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLFFF(int i, long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("createSingleConversation"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLFFF(i, j, interfaceC863600XuI);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIII(C869590Y9l c869590Y9l, String str, AwS6S0201100_14 awS6S0201100_14) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("recallReceivedMessage"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLIIII(c869590Y9l, str, awS6S0201100_14);
        } else {
            if (awS6S0201100_14 == null) {
                return;
            }
            awS6S0201100_14.invoke(new C0Y3A(EnumC868890Y6t.CLIENT_ERROR, "No active session", (Integer) null, 12));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJJ(long j, C914150Ztd c914150Ztd, C0Y8T c0y8t) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMsgInConvAroundIndex"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJJJ(j, c914150Ztd, c0y8t);
        } else {
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJJZ(String str, long j, C862540Xsa c862540Xsa, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMemberInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJJJZ(str, j, c862540Xsa, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final Object LLFF(List list, boolean z, Map map, C0YMP c0ymp) {
        Map mapLJ = C2097608Jq.LJ();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesByUserWithoutBuffer"));
        if (c0yedLIZIZ != null) {
            return c0yedLIZIZ.LJIJI().LJIJI().LLFF(list, z, map, c0ymp);
        }
        return mapLJ;
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJILJIL(String str, List<Long> list, Map<String, String> map, InterfaceC867020Xzo<List<C0YAE>> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("removeMembers"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJILJIL(str, list, map, interfaceC867020Xzo);
        } else {
            if (interfaceC867020Xzo == null) {
                return;
            }
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIILLIIL(List<MessageKey> list, int i, InterfaceC863600XuI<Boolean> interfaceC863600XuI, Long l, String str) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchGetMsgById"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJIILLIIL(list, i, interfaceC863600XuI, l, str);
        } else {
            if (interfaceC863600XuI == null) {
                return;
            }
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJJJZ(String str, long j, int i, Map<String, String> map, InterfaceC867020Xzo<C0YAE> interfaceC867020Xzo) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("updateMemberInfo"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJJJZ(str, j, i, map, interfaceC867020Xzo);
        } else {
            interfaceC867020Xzo.LIZIZ(new C0Y00(C866590Xz7.LIZ(), null));
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLIIJLIL(int i, int i2, C0YK7 c0yk7, Map map, boolean z) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("getMessagesByUser"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLIIJLIL(i, i2, c0yk7, map, z);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LLJJI(int i, int i2, long j, String str, String str2, List list) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("saveNormalMessagesAndNotifyUI"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LLJJI(i, i2, j, str, str2, list);
        }
    }

    @Override // X.InterfaceC868170Y3z
    public final void LJIIIZ(int i, List list, String str, Map map, String str2, String str3, String str4, String str5, String str6, Boolean bool, C913700Zsu c913700Zsu) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("createGroupConversation"));
        if (c0yedLIZIZ != null) {
            c0yedLIZIZ.LJIJI().LJIJI().LJIIIZ(i, list, str, map, str2, str3, str4, str5, str6, bool, c913700Zsu);
        } else {
            c913700Zsu.LJI(C866590Xz7.LIZ(), null);
        }
    }
}
