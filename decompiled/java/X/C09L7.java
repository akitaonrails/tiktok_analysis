package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09L7, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$resolveMedia$4$compressVideoTask$1", f = "CutOptimizedVideoChosenHandler.kt", l = {1101}, m = "invokeSuspend")
public final class C09L7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C259800zU<List<Pair<Integer, Integer>>> LLILZ;
    public final /* synthetic */ C013C LLILZIL;
    public final /* synthetic */ C013C LLILZLL;
    public final /* synthetic */ Intent LLIZ;
    public final /* synthetic */ C0L7R LLIZLLLIL;
    public final /* synthetic */ CreativeInfo LLJ;
    public final /* synthetic */ ArrayList<VideoSegment> LLJI;
    public final /* synthetic */ boolean LLJIJIL;
    public final /* synthetic */ boolean LLJILJIL;
    public final /* synthetic */ Function1<String, Unit> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C09L7(C013C c013c, C013C c013c2, C259800zU<List<Pair<Integer, Integer>>> c259800zU, C013C c013c3, C013C c013c4, Intent intent, C0L7R c0l7r, CreativeInfo creativeInfo, ArrayList<VideoSegment> arrayList, boolean z, boolean z2, Function1<? super String, Unit> function1, boolean z3, InterfaceC1364105Vn<? super C09L7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c013c;
        this.LLILLL = c013c2;
        this.LLILZ = c259800zU;
        this.LLILZIL = c013c3;
        this.LLILZLL = c013c4;
        this.LLIZ = intent;
        this.LLIZLLLIL = c0l7r;
        this.LLJ = creativeInfo;
        this.LLJI = arrayList;
        this.LLJIJIL = z;
        this.LLJILJIL = z2;
        this.LLJILJILJ = function1;
        this.LLJILLL = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09L7(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJIIIIZZ = obj;
        C1C7U.LIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$compressVideoTask$1");
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
            boolean z = this.LLILLJJLI.element;
            boolean z2 = this.LLILLL.element;
            List<Pair<Integer, Integer>> list = this.LLILZ.element;
            boolean z3 = this.LLILZIL.element;
            boolean z4 = this.LLILZLL.element;
            CreativeModel creativeModelLIZIZ = C0MUK.LIZIZ(this.LLIZ);
            C0L7R c0l7r = this.LLIZLLLIL;
            CreativeInfo creativeInfo = this.LLJ;
            ArrayList<VideoSegment> arrayList = this.LLJI;
            boolean z5 = this.LLJIJIL;
            boolean z6 = this.LLJILJIL;
            Function1<String, Unit> function1 = this.LLJILJILJ;
            boolean z7 = this.LLJILLL;
            this.LL = 1;
            objLJIIIIZZ = c0l7r.LJIIIIZZ(creativeInfo, arrayList, false, false, z5, false, z6, z, z2, z3, z4, list, function1, z7, creativeModelLIZIZ, this);
            if (objLJIIIIZZ == objLJFF) {
                C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$compressVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CutOptimizedVideoChosenHandler@f6e3.resolveMedia$4$compressVideoTask$1");
        return objLJIIIIZZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
