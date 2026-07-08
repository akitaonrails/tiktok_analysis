package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet$updateReactionListAdapter$1$1", f = "IMReactionListSheet.kt", l = {}, m = "invokeSuspend")
public final class C860400Xp8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMReactionListSheet LL;
    public final /* synthetic */ List<C860410Xp9> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C860400Xp8(IMReactionListSheet iMReactionListSheet, List<C860410Xp9> list, InterfaceC1364105Vn<? super C860400Xp8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMReactionListSheet;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860400Xp8(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReactionListSheet@161c.updateReactionListAdapter$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C893290Z2p c893290Z2p = (C893290Z2p) this.LL.LLJ.getValue();
        List<C860410Xp9> list = this.LLILLJJLI;
        if (((ArrayList) c893290Z2p.LLILLL).isEmpty()) {
            ((ArrayList) c893290Z2p.LLILLL).addAll(list);
        } else {
            ArrayList arrayList = new ArrayList();
            for (C860410Xp9 c860410Xp9 : list) {
                if (c860410Xp9.LLILZ.isSelf()) {
                    arrayList.add(c860410Xp9);
                }
            }
            List<C860410Xp9> list2 = c893290Z2p.LLILLL;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : (ArrayList) list2) {
                if (!((C860410Xp9) obj2).LLILZ.isSelf()) {
                    arrayList2.add(obj2);
                }
            }
            List listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
            ((ArrayList) c893290Z2p.LLILLL).clear();
            ((ArrayList) c893290Z2p.LLILLL).addAll(listLJLIL);
            if (((ArrayList) listLJLIL).isEmpty()) {
                c893290Z2p.LL.LLILZ.postValue(Boolean.TRUE);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMReactionListSheet@161c.updateReactionListAdapter$1$1");
            return unit;
        }
        c893290Z2p.notifyDataSetChanged();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMReactionListSheet@161c.updateReactionListAdapter$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
