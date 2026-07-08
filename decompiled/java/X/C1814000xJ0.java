package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xJ0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.LiveIntelligentBoardUpsertViewModel$upsertReally$3", f = "IntelligentBoardUpsertViewModel.kt", l = {115, 117, 160}, m = "invokeSuspend")
public final class C1814000xJ0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveIntelligentBoardUpsertViewModel LLILLL;
    public final /* synthetic */ C1814370xJb LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ Board LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814000xJ0(LiveIntelligentBoardUpsertViewModel liveIntelligentBoardUpsertViewModel, C1814370xJb c1814370xJb, boolean z, int i, Board board, InterfaceC1364105Vn<? super C1814000xJ0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveIntelligentBoardUpsertViewModel;
        this.LLILZ = c1814370xJb;
        this.LLILZIL = z;
        this.LLILZLL = i;
        this.LLIZ = board;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1814000xJ0 c1814000xJ0 = new C1814000xJ0(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1814000xJ0.LLILLJJLI = obj;
        return c1814000xJ0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1814000xJ0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
