package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0tIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.record.viewmodel.toolbar.ToolbarComponent$special$$inlined$flatMapLatest$1", f = "ToolbarComponent.kt", l = {193}, m = "invokeSuspend")
public final class C1660140tIq extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super List<? extends C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>>>, C443120HZe<? extends List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends Effect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1660030tIf LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1660140tIq(InterfaceC1364105Vn interfaceC1364105Vn, C1660030tIf c1660030tIf) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c1660030tIf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super List<? extends C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>>> interfaceC346701Wf, C443120HZe<? extends List<? extends C443120HZe<? extends InterfaceC1659860tIO, ? extends InterfaceC1664980tQe<? extends InterfaceC1659860tIO, ? extends InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>, ? extends InterfaceC1660130tIp<? extends InterfaceC1659860tIO>>>, ? extends Set<? extends InterfaceC1660190tIv>, ? extends Effect> c443120HZe, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1660140tIq c1660140tIq = new C1660140tIq(interfaceC1364105Vn, this.LLILZ);
        c1660140tIq.LLILLJJLI = interfaceC346701Wf;
        c1660140tIq.LLILLL = c443120HZe;
        return c1660140tIq.invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ToolbarComponent@20f4.special$$inlined$flatMapLatest$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            C443120HZe c443120HZe = (C443120HZe) this.LLILLL;
            List<C443120HZe> list = (List) c443120HZe.getFirst();
            final Set set = (Set) c443120HZe.getSecond();
            final Effect effect = (Effect) c443120HZe.getThird();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C443120HZe c443120HZe2 : list) {
                final InterfaceC1659860tIO interfaceC1659860tIO = (InterfaceC1659860tIO) c443120HZe2.getFirst();
                final InterfaceC1664980tQe interfaceC1664980tQe = (InterfaceC1664980tQe) c443120HZe2.getSecond();
                final C05YD state = ((InterfaceC1660130tIp) c443120HZe2.getThird()).getState();
                final C1660030tIf c1660030tIf = this.LLILZ;
                arrayList.add(new InterfaceC346201Wa<C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>>() { // from class: X.0tIr
                    @Override // X.InterfaceC346201Wa
                    public final Object collect(InterfaceC346701Wf<? super C1661930tLj<InterfaceC1659860tIO, InterfaceC1461640o8g<? extends InterfaceC1659860tIO>>> interfaceC346701Wf2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        Object objCollect = state.collect(new C1660170tIt(interfaceC346701Wf2, c1660030tIf, interfaceC1659860tIO, effect, interfaceC1664980tQe, set), interfaceC1364105Vn);
                        if (objCollect == C099R.LJFF()) {
                            return objCollect;
                        }
                        return Unit.LIZ;
                    }
                });
            }
            C1698270uIL c1698270uIL = new C1698270uIL((InterfaceC346201Wa[]) C13LP.LLIIII(arrayList).toArray(new InterfaceC346201Wa[0]), 7);
            this.LL = 1;
            if (C09IC.LJIILLIIL(this, c1698270uIL, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("ToolbarComponent@20f4.special$$inlined$flatMapLatest$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ToolbarComponent@20f4.special$$inlined$flatMapLatest$1");
        return unit;
    }
}
