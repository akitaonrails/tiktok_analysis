package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Li, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compressSingleVideo$2", f = "CutOptimizedVideoChosenHandler.kt", l = {3429}, m = "invokeSuspend")
public final class C2356809Li extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>>, Object> {
    public InterfaceC2357009Lk LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC2357009Lk LLILLL;
    public final /* synthetic */ C0L7R LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ VideoSegment LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Pair<Integer, Integer> LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ boolean LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2356809Li(InterfaceC2357009Lk interfaceC2357009Lk, C0L7R c0l7r, CreativeInfo creativeInfo, VideoSegment videoSegment, boolean z, boolean z2, Pair<Integer, Integer> pair, int i, boolean z3, InterfaceC1364105Vn<? super C2356809Li> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC2357009Lk;
        this.LLILZ = c0l7r;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = videoSegment;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = pair;
        this.LLJI = i;
        this.LLJIJIL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2356809Li(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZ = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.compressSingleVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            InterfaceC2357009Lk interfaceC2357009Lk = this.LLILLL;
            C0L7R c0l7r = this.LLILZ;
            CreativeInfo creativeInfo = this.LLILZIL;
            VideoSegment videoSegment = this.LLILZLL;
            boolean z = this.LLIZ;
            boolean z2 = this.LLIZLLLIL;
            Pair<Integer, Integer> pair = this.LLJ;
            int i2 = this.LLJI;
            boolean z3 = this.LLJIJIL;
            this.LL = interfaceC2357009Lk;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            long jCurrentTimeMillis = System.currentTimeMillis();
            interfaceC2357009Lk.LIZ(c0l7r.LJIILL(creativeInfo), videoSegment, z, z2, pair, new C2356909Lj(i2, new C118300cf(), z3, c0l7r), c0l7r.LJFF, new C2356709Lh(c0l7r, videoSegment, jCurrentTimeMillis, c23260099m));
            objLIZ = c23260099m.LIZ();
            if (objLIZ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.compressSingleVideo$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.compressSingleVideo$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
