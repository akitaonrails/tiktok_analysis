package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.external.composer.MusicShareStoryParser$prepareMusicShareStoryResource$1$downloadStickerTask$1", f = "MusicShareStoryParser.kt", l = {180}, m = "invokeSuspend")
public final class C2280108wZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<Effect> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2280108wZ(C259800zU<Effect> c259800zU, InterfaceC1364105Vn<? super C2280108wZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2280108wZ(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<Effect> c259800zU;
        C1C7U.LIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1$downloadStickerTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c259800zU = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c259800zU = this.LLILLL;
            this.LL = c259800zU;
            this.LLILLJJLI = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            C1634250sd5.LIZ().LJJJJI("sharemusictostoryeffect", false, false, new C2500309qz(c2252611DEt, 4));
            obj = c2252611DEt.LJIJ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1$downloadStickerTask$1");
                return objLJFF;
            }
        }
        c259800zU.element = obj;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusicShareStoryParser@d55e.prepareMusicShareStoryResource$1$downloadStickerTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
