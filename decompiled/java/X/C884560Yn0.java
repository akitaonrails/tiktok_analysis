package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;
import njp.a;

/* JADX INFO: renamed from: X.0Yn0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$triggerAccessoryUpdate$1", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884560Yn0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ List<InterfaceC1491305sd> LLILLL;
    public final /* synthetic */ C884710YnF LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C884560Yn0(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends InterfaceC1491305sd> list, C884710YnF c884710YnF, String str, InterfaceC1364105Vn<? super C884560Yn0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = list;
        this.LLILZ = c884710YnF;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884560Yn0(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        C1C7U.LIZ("ChatListEngine@4c4f.triggerAccessoryUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884270YmX c884270YmX = this.LL.LJIIZILJ().get(this.LLILLJJLI);
        if (c884270YmX == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListEngine@4c4f.triggerAccessoryUpdate$1");
            return unit;
        }
        ChatListEngine chatListEngine = this.LL;
        List<InterfaceC1491305sd> list = this.LLILLL;
        C884710YnF c884710YnF = this.LLILZ;
        String str = this.LLILZIL;
        chatListEngine.getClass();
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            Pair[] pairArr = new Pair[2];
            pairArr[0] = new Pair("source", str);
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            pairArr[1] = new Pair("update_size", numValueOf);
            c884690YnD.LIZLLL("execute_accessory_update", C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (c884710YnF.LIZJ) {
            Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIJ = c884270YmX.LJIIJ();
            Set<InterfaceC1491305sd> linkedHashSet = mapLJIIJ.get(c884710YnF);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>();
                mapLJIIJ.put(c884710YnF, linkedHashSet);
            }
            Set<InterfaceC1491305sd> set = linkedHashSet;
            if (list != null) {
                set.addAll(list);
            }
        }
        if (c884710YnF.LIZLLL) {
            Map<C884710YnF, Set<InterfaceC1491305sd>> mapLJIIIZ = c884270YmX.LJIIIZ();
            Set<InterfaceC1491305sd> linkedHashSet2 = mapLJIIIZ.get(c884710YnF);
            if (linkedHashSet2 == null) {
                linkedHashSet2 = new LinkedHashSet<>();
                mapLJIIIZ.put(c884710YnF, linkedHashSet2);
            }
            Set<InterfaceC1491305sd> set2 = linkedHashSet2;
            if (list != null) {
                set2.addAll(list);
            }
        }
        C09AE c09aeLIZ = c884270YmX.LJJIFFI;
        if (c09aeLIZ == null) {
            String str2 = chatListEngine.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fireAccessoryUpdateJob page=");
            sbLIZ.append(c884270YmX.LIZ.getKey());
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZLLL(str2);
            c09aeLIZ = C1729806q0.LIZ(c884270YmX.LIZ.getKey(), new C884540Ymy(chatListEngine, c884270YmX, str, null));
            ((JobSupport) c09aeLIZ).LJII(new C884650Yn9(c884270YmX, chatListEngine, str));
        }
        c884270YmX.LJJIFFI = c09aeLIZ;
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("execute_accessory_update", null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.triggerAccessoryUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
