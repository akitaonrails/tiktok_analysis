package X;

import android.content.Context;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.composer.model.MusicShareStoryInputData;
import com.ss.android.ugc.aweme.creative.model.MusicShareStoryData;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MOX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MusicMemeSongParser$parse$musicShareStoryAsync$1", f = "MusicMemeSongParser.kt", l = {246}, m = "invokeSuspend")
public final class C0MOX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0MOV LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ C259800zU<CanvasVideoData> LLILZIL;
    public final /* synthetic */ C259800zU<MusicShareStoryData> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MOX(C0MOV c0mov, Context context, C259800zU<CanvasVideoData> c259800zU, C259800zU<MusicShareStoryData> c259800zU2, InterfaceC1364105Vn<? super C0MOX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mov;
        this.LLILZ = context;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MOX(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T, com.ss.android.ugc.aweme.creative.model.MusicShareStoryData] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJIJ = obj;
        C1C7U.LIZ("MusicMemeSongParser@d5b5.parse$musicShareStoryAsync$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            C0MOV c0mov = this.LLILLL;
            Context context = this.LLILZ;
            this.LL = context;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            MusicShareStoryInputData musicShareStoryData = c0mov.LIZ.getMusicShareStoryData();
            C0MOZ c0moz = new C0MOZ();
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new MusicShareStoryData(null, null, -16777216, -16777216, null, null, null, null, null, null, null, null);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C567650MOd(c2252611DEt, c0moz, c259800zU, musicShareStoryData, context, c0mov, null), 3);
            objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("MusicMemeSongParser@d5b5.parse$musicShareStoryAsync$1");
                return objLJFF;
            }
        }
        C259800zU<CanvasVideoData> c259800zU2 = this.LLILZIL;
        C259800zU<MusicShareStoryData> c259800zU3 = this.LLILZLL;
        Pair pair = (Pair) objLJIJ;
        c259800zU2.element = pair.getFirst();
        c259800zU3.element = pair.getSecond();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicMemeSongParser@d5b5.parse$musicShareStoryAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
