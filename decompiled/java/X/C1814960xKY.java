package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel;
import com.bytedance.android.livesdk.model.Board;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xKY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel$applyBoardLiveInternal$1", f = "BoardsDisplayViewModel.kt", l = {416, 387}, m = "invokeSuspend")
public final class C1814960xKY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Board LLILLJJLI;
    public BoardsDisplayViewModel LLILLL;
    public long LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ BoardsDisplayViewModel LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ Board LLJ;
    public final /* synthetic */ int LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1814960xKY(BoardsDisplayViewModel boardsDisplayViewModel, long j, Board board, int i, InterfaceC1364105Vn<? super C1814960xKY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = boardsDisplayViewModel;
        this.LLIZLLLIL = j;
        this.LLJ = board;
        this.LLJI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1814960xKY(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:(1:(1:(9:6|104|7|100|67|(1:72)(1:71)|99|83|84)(2:12|13))(1:14))(2:15|(2:17|18))|102|19|(2:22|20)|110|23|(3:98|26|24)|111|27|(3:32|(4:35|(2:37|39)(1:38)|(2:123|121)(3:120|43|44)|33)|118)(1:31)|45|(3:50|(4:53|(2:55|57)(1:56)|(2:117|115)(4:114|61|88|89)|51)|112)|49|108|62|106|63|(2:65|66)|100|67|(3:69|72|99)(0)|83|84) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:0|2|105|(1:(1:(9:6|104|7|100|67|(1:72)(1:71)|99|83|84)(2:12|13))(1:14))(2:15|(2:17|18))|102|19|(2:22|20)|110|23|(3:98|26|24)|111|27|(3:32|(4:35|(2:37|39)(1:38)|(2:123|121)(3:120|43|44)|33)|118)(1:31)|45|(3:50|(4:53|(2:55|57)(1:56)|(2:117|115)(4:114|61|88|89)|51)|112)|49|108|62|106|63|(2:65|66)|100|67|(3:69|72|99)(0)|83|84|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01db, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01df, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01e1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01e3, code lost:
    
        r4 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b5 A[Catch: Exception -> 0x01db, CancellationException -> 0x01dd, all -> 0x022b, TRY_LEAVE, TryCatch #4 {Exception -> 0x01db, blocks: (B:67:0x018d, B:69:0x0193, B:71:0x0197, B:72:0x01b5), top: B:100:0x018d }] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1814960xKY.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
