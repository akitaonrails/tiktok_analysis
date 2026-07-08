package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AwS617S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.09Lo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.TemplateMediaChosenHandler$compressSingleVideo$2", f = "TemplateMediaChosenHandler.kt", l = {715}, m = "invokeSuspend")
public final class C2357409Lo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>>, Object> {
    public InterfaceC2357009Lk LL;
    public int LLILLJJLI;
    public final /* synthetic */ InterfaceC2357009Lk LLILLL;
    public final /* synthetic */ C536210L1f LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ VideoSegment LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ Pair<Integer, Integer> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2357409Lo(InterfaceC2357009Lk interfaceC2357009Lk, C536210L1f c536210L1f, CreativeInfo creativeInfo, VideoSegment videoSegment, boolean z, boolean z2, Pair<Integer, Integer> pair, InterfaceC1364105Vn<? super C2357409Lo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC2357009Lk;
        this.LLILZ = c536210L1f;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = videoSegment;
        this.LLIZ = z;
        this.LLIZLLLIL = z2;
        this.LLJ = pair;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2357409Lo(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateMediaChosenHandler@d239.compressSingleVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC2357009Lk interfaceC2357009Lk = this.LLILLL;
            C536210L1f c536210L1f = this.LLILZ;
            VideoSegment videoSegment = this.LLILZLL;
            boolean z = this.LLIZ;
            boolean z2 = this.LLIZLLLIL;
            Pair<Integer, Integer> pair = this.LLJ;
            this.LL = interfaceC2357009Lk;
            this.LLILLJJLI = 1;
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            c536210L1f.getClass();
            interfaceC2357009Lk.LIZ(null, videoSegment, z, z2, pair, AFwS231S0000000_3.get$arr$(74), null, new AwS617S0100000_3(c23260099m, 19));
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.compressSingleVideo$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("TemplateMediaChosenHandler@d239.compressSingleVideo$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends Boolean, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
