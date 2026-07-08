package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Drh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.task.delay.NavigateStrippedMusicTask$run$1$1", f = "NavigateStrippedMusicTask.kt", l = {42}, m = "invokeSuspend")
public final class C352390Drh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ELJ LLILLJJLI;
    public final /* synthetic */ C0E1U LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352390Drh(C0ELJ c0elj, C0E1U c0e1u, InterfaceC1364105Vn<? super C352390Drh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0elj;
        this.LLILLL = c0e1u;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352390Drh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        NLETrackSlot nLETrackSlotLJL;
        C1C7U.LIZ("NavigateStrippedMusicTask@5139.run$1$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("NavigateStrippedMusicTask@5139.run$1$1");
                return objLJFF;
            }
        }
        String enterSelectSlotId = this.LLILLJJLI.getEnterSelectSlotId();
        if (enterSelectSlotId == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("NavigateStrippedMusicTask@5139.run$1$1");
            return unit;
        }
        C0E48 c0e48 = this.LLILLL.LLILZ;
        if (c0e48 != null && (nLETrackSlotLJL = C351220Dpo.LJL(C350870DpF.LJI(c0e48), enterSelectSlotId)) != null) {
            C0E48 c0e482 = this.LLILLL.LLILZ;
            if (c0e482 != null) {
                c0e482.S7().LIZIZ(new C358740E4q(nLETrackSlotLJL, 0, null, false, 0, 254), "select_slot_event", false);
            }
            this.LLILLJJLI.setEnterSelectSlotId(null);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("NavigateStrippedMusicTask@5139.run$1$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("NavigateStrippedMusicTask@5139.run$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
