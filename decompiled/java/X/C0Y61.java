package X;

import com.bytedance.im.core.proto.SetConversationSettingInfoResponseBody;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Y61, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Y61 implements InterfaceC866720XzK {
    public final Function0<C0YED> LIZ;
    public final C868780Y6i LIZIZ;
    public final CopyOnWriteArraySet<InterfaceC867280Y0o> LIZJ = new CopyOnWriteArraySet<>();
    public final CopyOnWriteArraySet<C0Y6L> LIZLLL = new CopyOnWriteArraySet<>();
    public volatile InterfaceC868750Y6f LJ;

    public final C0Y60 LIZIZ() {
        C0YDJ c0ydj;
        C0Y6R c0y6r;
        C0YED c0yedInvoke = this.LIZ.invoke();
        if (c0yedInvoke == null || (c0ydj = c0yedInvoke.LJIIIIZZ) == null || (c0y6r = c0ydj.LJI) == null) {
            return null;
        }
        return c0y6r.LIZ;
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0YAE> LIZLLL() {
        List<C0YAE> listLIZLLL;
        C0Y60 c0y60LIZIZ = LIZIZ();
        return (c0y60LIZIZ == null || (listLIZLLL = c0y60LIZIZ.LIZLLL()) == null) ? C13BV.INSTANCE : listLIZLLL;
    }

    @Override // X.InterfaceC866720XzK
    public final C878750Ydd LJIILJJIL() {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIILJJIL();
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final long LJIILL() {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIILL();
        }
        return 0L;
    }

    @Override // X.InterfaceC866720XzK
    public final Map<String, C0Y8T> LJJIIZI() {
        Map<String, C0Y8T> map;
        C0Y60 c0y60LIZIZ = LIZIZ();
        return (c0y60LIZIZ == null || (map = c0y60LIZIZ.LIZ) == null) ? C2097608Jq.LJ() : map;
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJJJJLL() {
        List<C0Y8T> listLJJJJLL;
        C0Y60 c0y60LIZIZ = LIZIZ();
        return (c0y60LIZIZ == null || (listLJJJJLL = c0y60LIZIZ.LJJJJLL()) == null) ? C13BV.INSTANCE : listLJJJJLL;
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJJLIIIJLJLI() {
        C0Y60 c0y60LIZIZ = LIZIZ();
        return c0y60LIZIZ != null ? c0y60LIZIZ.LJJLIIIJLJLI() : C13BV.INSTANCE;
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LIZ(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LIZ(str);
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final void LIZJ(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LIZJ(str);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJFF(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJFF(str);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIJ(boolean z) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIIJ(z);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C867240Y0k> LJIIJJI(C869710Y9x c869710Y9x) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIIJJI(c869710Y9x);
        }
        return C865670Xxd.LIZ(-1, "No active session");
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIL(C0Y6L c0y6l) {
        this.LIZLLL.remove(c0y6l);
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIIL(c0y6l);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJIILIIL(long j) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIILIIL(j);
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIILLIIL(InterfaceC868750Y6f interfaceC868750Y6f) {
        this.LJ = interfaceC868750Y6f;
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIILLIIL(interfaceC868750Y6f);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final List<C0Y8T> LJIJJ(List<String> list) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIJJ(list);
        }
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJIL(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIL(str);
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIFFI(C0Y6L c0y6l) {
        this.LIZLLL.add(c0y6l);
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIFFI(c0y6l);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJII(InterfaceC867280Y0o interfaceC867280Y0o) {
        this.LIZJ.remove(interfaceC867280Y0o);
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJII(interfaceC867280Y0o);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final boolean LJJIII(Map<String, String> map) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJJIII(map);
        }
        return false;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIZ(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIIZ(str);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C867250Y0l> LJJIZ(C869710Y9x c869710Y9x) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJJIZ(c869710Y9x);
        }
        return C865670Xxd.LIZ(-1, "No active session");
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJ(List<String> list) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJ(list);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJLL(InterfaceC863600XuI interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJLL(interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "refreshConversationInfoByShortId: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y8T LJJLIIIIJ(String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJJLIIIIJ(str);
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIIIJILLIZJL(InterfaceC867280Y0o interfaceC867280Y0o) {
        this.LIZJ.add(interfaceC867280Y0o);
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJLIIIJILLIZJL(interfaceC867280Y0o);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6Q<C866930Xzf> LJJLJ(C869710Y9x c869710Y9x) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJJLJ(c869710Y9x);
        }
        return C865670Xxd.LIZ(-1, "No active session");
    }

    public C0Y61(AwS558S0100000_14 awS558S0100000_14, C868780Y6i c868780Y6i) {
        this.LIZ = awS558S0100000_14;
        this.LIZIZ = c868780Y6i;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJ(long j, String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJ(j, str);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIJI(List list, C914150Ztd c914150Ztd) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIJI(list, c914150Ztd);
        } else {
            C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchMarkRead: no active session", 4);
            c914150Ztd.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJ(String str, InterfaceC863600XuI<String> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJ(str, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "deleteConversation: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIJZLJL(List list, InterfaceC863600XuI interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIIJZLJL(list, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchSetFakeUnreadCount: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIJ(List<String> list, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIJ(list, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchMarkReadById: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJJL(Map<String, Map<String, String>> map, InterfaceC863600XuI<Boolean> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJJJL(map, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchUpdateLocalExt: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJLI(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJJLI(str, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "refreshConversationInfo: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJZI(long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJJZI(j, interfaceC863600XuI);
        } else {
            C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "createSingleConversationWithTemp: no active session", 4);
            interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJLIIL(long j, String str) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJLIIL(j, str);
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIL(String str, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJLIL(str, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "getConversation(async): no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final C0Y6X LJIIZILJ(long j, int i, C869290Y8h c869290Y8h) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJLIIL(j, i, c869290Y8h);
        }
        return null;
    }

    @Override // X.InterfaceC866720XzK
    public final boolean LJIJJLI(long j, int i, C869290Y8h c869290Y8h) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            return c0y60LIZIZ.LJIJJLI(j, i, c869290Y8h);
        }
        return false;
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIJIL(List<C0Y8T> list, Boolean bool, InterfaceC863600XuI<List<String>> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIJIL(list, bool, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchDeleteConversations: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJIZL(int i, long j, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJJIZL(i, j, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "createSingleConversationWithTemp: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJI(String str, long j, int i, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJI(str, j, i, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "getConversationInfo: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJJJ(List<String> list, Boolean bool, Map<String, String> map, InterfaceC863600XuI<List<SetConversationSettingInfoResponseBody>> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJJJ(list, bool, map, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchChangeMute: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIJ(long j, C0Y6U c0y6u, C0Z9N[] c0z9nArr, Boolean bool, C1226400i1G c1226400i1G) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIJ(j, c0y6u, c0z9nArr, bool, c1226400i1G);
        } else {
            C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "getAllGroupConversations: no active session", 4);
            c1226400i1G.LIZIZ(C866590Xz7.LIZ());
        }
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJIIJ(List<C0Y8T> list, List<String> list2, List<String> list3, Boolean bool, InterfaceC863600XuI<List<SetConversationSettingInfoResponseBody>> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJIIJ(list, list2, list3, bool, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "batchChangeConversationTags: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJJLIIIJJI(String str, long j, int i, boolean z, InterfaceC863600XuI<C0Y8T> interfaceC863600XuI) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJJLIIIJJI(str, j, i, z, interfaceC863600XuI);
            return;
        }
        C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "fetchConversationInfo: no active session", 4);
        if (interfaceC863600XuI == null) {
            return;
        }
        interfaceC863600XuI.LIZIZ(C866590Xz7.LIZ());
    }

    @Override // X.InterfaceC866720XzK
    public final void LJIIIZ(int i, List list, String str, Map map, String str2, String str3, String str4, String str5, String str6, Boolean bool, C913700Zsu c913700Zsu) {
        C0Y60 c0y60LIZIZ = LIZIZ();
        if (c0y60LIZIZ != null) {
            c0y60LIZIZ.LJIIIZ(i, list, str, map, str2, str3, str4, str5, str6, bool, c913700Zsu);
        } else {
            C868780Y6i.LJ(this.LIZIZ, "ConvListModelProxy", "createGroupConversation: no active session", 4);
            c913700Zsu.LJI(C866590Xz7.LIZ(), null);
        }
    }
}
