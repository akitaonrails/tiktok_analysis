package X;

import com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobSupport;
import njp.a;

/* JADX INFO: renamed from: X.0Ymz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.core.chatlist.impl.engine.ChatListEngine$triggerDataSourceSingleUpdate$1", f = "ChatListEngine.kt", l = {}, m = "invokeSuspend")
public final class C884550Ymz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ChatListEngine LL;
    public final /* synthetic */ InterfaceC879010Ye3 LLILLJJLI;
    public final /* synthetic */ List<C879540Yeu<?>> LLILLL;
    public final /* synthetic */ List<C879540Yeu<?>> LLILZ;
    public final /* synthetic */ List<InterfaceC1491305sd> LLILZIL;
    public final /* synthetic */ List<InterfaceC1491305sd> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C884550Ymz(ChatListEngine chatListEngine, InterfaceC879010Ye3 interfaceC879010Ye3, List<? extends C879540Yeu<?>> list, List<? extends C879540Yeu<?>> list2, List<? extends InterfaceC1491305sd> list3, List<? extends InterfaceC1491305sd> list4, String str, InterfaceC1364105Vn<? super C884550Ymz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = chatListEngine;
        this.LLILLJJLI = interfaceC879010Ye3;
        this.LLILLL = list;
        this.LLILZ = list2;
        this.LLILZIL = list3;
        this.LLILZLL = list4;
        this.LLIZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C884550Ymz(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer numValueOf;
        Integer numValueOf2;
        C1C7U.LIZ("ChatListEngine@4c4f.triggerDataSourceSingleUpdate$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C884270YmX c884270YmX = this.LL.LJIIZILJ().get(this.LLILLJJLI);
        if (c884270YmX == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ChatListEngine@4c4f.triggerDataSourceSingleUpdate$1");
            return unit;
        }
        ChatListEngine chatListEngine = this.LL;
        List<C879540Yeu<?>> list = this.LLILLL;
        List<C879540Yeu<?>> list2 = this.LLILZ;
        List<InterfaceC1491305sd> list3 = this.LLILZIL;
        List<InterfaceC1491305sd> list4 = this.LLILZLL;
        String str = this.LLIZ;
        chatListEngine.getClass();
        C884690YnD c884690YnD = c884270YmX.LJ;
        if (c884690YnD != null) {
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("source", str);
            if (list != null) {
                numValueOf = Integer.valueOf(list.size());
            } else {
                numValueOf = null;
            }
            pairArr[1] = new Pair("add_or_update_size", numValueOf);
            if (list3 != null) {
                numValueOf2 = Integer.valueOf(list3.size());
            } else {
                numValueOf2 = null;
            }
            pairArr[2] = new Pair("remove_size", numValueOf2);
            c884690YnD.LIZLLL("execute_data_source_single_update", C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (list != null) {
            for (C879540Yeu<?> c879540Yeu : list) {
                c884270YmX.LJII().LIZIZ().put(c879540Yeu.LIZIZ, c879540Yeu);
                c884270YmX.LJII().LJ().remove(c879540Yeu.LIZIZ);
            }
        }
        if (list2 != null) {
            for (C879540Yeu<?> c879540Yeu2 : list2) {
                c884270YmX.LJII().LIZJ().put(c879540Yeu2.LIZIZ, c879540Yeu2);
                c884270YmX.LJII().LIZLLL().remove(c879540Yeu2.LIZIZ);
            }
            for (C879540Yeu<?> c879540Yeu3 : list2) {
                if (list == null || !list.contains(c879540Yeu3)) {
                    if (c884270YmX.LJIILIIL().containsKey(c879540Yeu3.LIZIZ)) {
                        c884270YmX.LJII().LJ().add(c879540Yeu3.LIZIZ);
                    }
                }
            }
        }
        if (list3 != null) {
            c884270YmX.LJII().LJ().addAll(list3);
            Iterator<InterfaceC1491305sd> it2 = list3.iterator();
            while (it2.hasNext()) {
                c884270YmX.LJII().LIZIZ().remove(it2.next());
            }
        }
        if (list4 != null) {
            c884270YmX.LJII().LIZLLL().addAll(list4);
            Iterator<InterfaceC1491305sd> it3 = list4.iterator();
            while (it3.hasNext()) {
                c884270YmX.LJII().LIZJ().remove(it3.next());
            }
        }
        C09AE c09aeLIZ = c884270YmX.LJJI;
        if (c09aeLIZ == null) {
            String str2 = chatListEngine.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fireDataSourceSingleUpdateJob page=");
            sbLIZ.append(c884270YmX.LIZ.getKey());
            sbLIZ.append(", source=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C309160C9y.LIZLLL(str2);
            c09aeLIZ = C1729806q0.LIZ(c884270YmX.LIZ.getKey(), new C884530Ymx(chatListEngine, c884270YmX, str, null));
            ((JobSupport) c09aeLIZ).LJII(new C884660YnA(c884270YmX, chatListEngine, str));
        }
        c884270YmX.LJJI = c09aeLIZ;
        C884690YnD c884690YnD2 = c884270YmX.LJ;
        if (c884690YnD2 != null) {
            c884690YnD2.LIZIZ("execute_data_source_single_update", null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ChatListEngine@4c4f.triggerDataSourceSingleUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
