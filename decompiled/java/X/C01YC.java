package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01YC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlugin$updateLinkMicId2PlayerMap$1", f = "MultiGuestMicSeatEmojiPlugin.kt", l = {241}, m = "invokeSuspend")
public final class C01YC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C942040acc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01YC(C942040acc c942040acc, InterfaceC1364105Vn<? super C01YC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c942040acc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01YC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MultiGuestMicSeatEmojiPlugin@103b.updateLinkMicId2PlayerMap$1");
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
            Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(this.LLILLJJLI.LJJI());
            if (mapLJIIZILJ.isEmpty()) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlugin@103b.updateLinkMicId2PlayerMap$1");
                return unit;
            }
            C1DFB c1dfb = C0PEM.LIZJ;
            C01YB c01yb = new C01YB(mapLJIIZILJ, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfb, c01yb);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlugin@103b.updateLinkMicId2PlayerMap$1");
                return objLJFF;
            }
        }
        C942040acc c942040acc = this.LLILLJJLI;
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            C942410adD c942410adDRemove = c942040acc.LJJI().remove(it2.next());
            if (c942410adDRemove != null) {
                c942410adDRemove.LIZLLL(false);
                C2296808zG.LIZJ(c942410adDRemove.LJII, null);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MultiGuestMicSeatEmojiPlugin@103b.updateLinkMicId2PlayerMap$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
