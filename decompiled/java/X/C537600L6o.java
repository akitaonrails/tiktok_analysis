package X;

import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.operate.SaveDraftByPath$resolveMedia$1$compressVideoTask$1", f = "SaveDraftByPath.kt", l = {116}, m = "invokeSuspend")
public final class C537600L6o extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>>, Object> {
    public int LL;
    public final /* synthetic */ ArrayList<VideoSegment> LLILLJJLI;
    public final /* synthetic */ InterfaceC2357009Lk LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537600L6o(ArrayList<VideoSegment> arrayList, InterfaceC2357009Lk interfaceC2357009Lk, InterfaceC1364105Vn<? super C537600L6o> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = arrayList;
        this.LLILLL = interfaceC2357009Lk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537600L6o(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SaveDraftByPath@46c6.resolveMedia$1$compressVideoTask$1");
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
            C0MBE c0mbe = C0MBE.LIZ;
            ArrayList<VideoSegment> arrayList = this.LLILLJJLI;
            C571560MbK c571560MbK = (C571560MbK) this.LLILLL;
            this.LL = 1;
            obj = c0mbe.LIZ(arrayList, c571560MbK, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SaveDraftByPath@46c6.resolveMedia$1$compressVideoTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SaveDraftByPath@46c6.resolveMedia$1$compressVideoTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C443120HZe<? extends Boolean, ? extends Boolean, ? extends Long>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
