package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS294S0000000_11;

/* JADX INFO: renamed from: X.0RBB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RBB extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Assembler LL;
    public final /* synthetic */ FeedVideoAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0RBB(Assembler assembler, FeedVideoAssem feedVideoAssem) {
        super(0);
        this.LL = assembler;
        this.LLILLJJLI = feedVideoAssem;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Assembler assembler = this.LL;
        FeedVideoAssem feedVideoAssem = this.LLILLJJLI;
        assembler.MQ2(feedVideoAssem, new C0RB7(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBG(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RB8(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RB9(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBA(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBD(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBC(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBE(feedVideoAssem));
        assembler.MQ2(feedVideoAssem, new C0RBF(feedVideoAssem));
        assembler.LQ2(feedVideoAssem, new C0RB5(feedVideoAssem));
        assembler.LQ2(feedVideoAssem, new C0RB6(feedVideoAssem));
        C736680Sv4.LJIIIIZZ(feedVideoAssem, (AssemViewModel) feedVideoAssem.LLJL.getValue(), new C2217381BqS() { // from class: X.0RC6
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LLIZLLLIL;
            }
        }, null, new C692310RDp(), 6);
        C736680Sv4.LJIIIIZZ(feedVideoAssem, (AssemViewModel) feedVideoAssem.LLJL.getValue(), new C2217381BqS() { // from class: X.0RC7
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C709790Rsn) obj).LL;
            }
        }, null, AFwS294S0000000_11.get$arr$(281), 6);
        return Unit.LIZ;
    }
}
