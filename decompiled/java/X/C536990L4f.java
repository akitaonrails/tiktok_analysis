package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$handleAIGCGenerationFromAlbum$1", f = "RecordStickerLogicComponent.kt", l = {729, 735}, m = "invokeSuspend")
public final class C536990L4f extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ l0 LLILLL;
    public final /* synthetic */ List<C1621190sI1> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C536990L4f(l0 l0Var, List<C1621190sI1> list, InterfaceC1364105Vn<? super C536990L4f> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = l0Var;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C536990L4f c536990L4f = new C536990L4f(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c536990L4f.LLILLJJLI = obj;
        return c536990L4f;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean zBooleanValue = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C537000L4g c537000L4g = new C537000L4g(this.LLILLL, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C099A.LIZJ(2000L, c537000L4g, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
                return objLJFF;
            }
        }
        Boolean bool = (Boolean) obj;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlbumAIGCC was timed out? ");
        sbLIZ.append(zBooleanValue);
        C2188811AlT.LIZIZ(sbLIZ);
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C537010L4h c537010L4h = new C537010L4h(this.LLILLL, this.LLILZ, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c537010L4h) == objLJFF) {
            C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.handleAIGCGenerationFromAlbum$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
