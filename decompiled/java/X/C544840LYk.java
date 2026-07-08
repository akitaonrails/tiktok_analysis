package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LYk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCGenerationComponent$navToEditPage$1", f = "AIGCGenerationComponent.kt", l = {408}, m = "invokeSuspend")
public final class C544840LYk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ AIGCGenerationComponent LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C544840LYk(String str, AIGCGenerationComponent aIGCGenerationComponent, String str2, InterfaceC1364105Vn<? super C544840LYk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = aIGCGenerationComponent;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C544840LYk(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCGenerationComponent@e333.navToEditPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MediaModel mediaModelLIZ = C574480Mg2.LIZ(this.LLILLJJLI);
            if (mediaModelLIZ != null) {
                AIGCGenerationComponent aIGCGenerationComponent = this.LLILLL;
                String str = this.LLILZ;
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C544830LYj c544830LYj = new C544830LYj(aIGCGenerationComponent, str, mediaModelLIZ, null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c544830LYj) == objLJFF) {
                    C1C7U.LIZIZ("AIGCGenerationComponent@e333.navToEditPage$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCGenerationComponent@e333.navToEditPage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
