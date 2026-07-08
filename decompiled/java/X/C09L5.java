package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09L5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMediaForVideo2Sticker$1$compressVideoTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {1618}, m = "invokeSuspend")
public final class C09L5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ C0L7R LLILLJJLI;
    public final /* synthetic */ CreativeInfo LLILLL;
    public final /* synthetic */ ArrayList<VideoSegment> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09L5(C0L7R c0l7r, CreativeInfo creativeInfo, ArrayList<VideoSegment> arrayList, InterfaceC1364105Vn<? super C09L5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l7r;
        this.LLILLL = creativeInfo;
        this.LLILZ = arrayList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09L5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMediaForVideo2Sticker$1$compressVideoTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIIIIZZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIIIIZZ);
            C0L7R c0l7r = this.LLILLJJLI;
            CreativeInfo creativeInfo = this.LLILLL;
            ArrayList<VideoSegment> arrayList = this.LLILZ;
            this.LL = 1;
            objLJIIIIZZ = c0l7r.LJIIIIZZ(creativeInfo, arrayList, false, false, false, true, false, false, false, false, false, null, null, false, null, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMediaForVideo2Sticker$1$compressVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMediaForVideo2Sticker$1$compressVideoTask$1");
        return objLJIIIIZZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
