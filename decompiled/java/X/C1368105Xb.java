package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.InstantCloneParser$parse$canvasVideoDataAsync$1", f = "InstantCloneParser.kt", l = {172}, m = "invokeSuspend")
public final class C1368105Xb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MOS LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ CreativeInfo LLILZIL;
    public final /* synthetic */ C259800zU<CanvasVideoData> LLILZLL;
    public final /* synthetic */ C259800zU<String> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1368105Xb(C0MOS c0mos, Context context, CreativeInfo creativeInfo, C259800zU<CanvasVideoData> c259800zU, C259800zU<String> c259800zU2, InterfaceC1364105Vn<? super C1368105Xb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mos;
        this.LLILZ = context;
        this.LLILZIL = creativeInfo;
        this.LLILZLL = c259800zU;
        this.LLIZ = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1368105Xb(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InstantCloneParser@3cac.parse$canvasVideoDataAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        Unit unit = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0MOS c0mos = this.LLILLL;
            Context context = this.LLILZ;
            CreativeInfo creativeInfo = this.LLILZIL;
            this.LL = context;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            c0mos.getClass();
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0MO3(context, creativeInfo, c2252611DEt, null), 3);
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("InstantCloneParser@3cac.parse$canvasVideoDataAsync$1");
                return objLJFF;
            }
        }
        C259800zU<CanvasVideoData> c259800zU = this.LLILZLL;
        C259800zU<String> c259800zU2 = this.LLIZ;
        Pair pair = (Pair) obj;
        c259800zU.element = pair.getFirst();
        ?? second = pair.getSecond();
        if (second != 0) {
            c259800zU2.element = second;
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("InstantCloneParser@3cac.parse$canvasVideoDataAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
