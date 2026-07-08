package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Ax, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.businessui.memesong.ui.MemeSongShuffleView$loadData$1", f = "MemeSongShuffleView.kt", l = {85}, m = "invokeSuspend")
public final class C2329709Ax extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0HN1 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2329709Ax(C0HN1 c0hn1, InterfaceC1364105Vn<? super C2329709Ax> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0hn1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2329709Ax(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MemeSongShuffleView@dfca.loadData$1");
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
            C2329509Av c2329509Av = C2329509Av.LIZ;
            Context context = this.LLILLJJLI.getContext();
            AwS617S0100000_3 awS617S0100000_3 = new AwS617S0100000_3(this.LLILLJJLI, 1);
            this.LL = 1;
            if (c2329509Av.LIZ(context, "https://sf16-sg.tiktokcdn.com/obj/eden-sg/aulpsJ-ojllwZ-hahK/ljhwZthlaukjlkulzlp/prompts.json", awS617S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("MemeSongShuffleView@dfca.loadData$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemeSongShuffleView@dfca.loadData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
