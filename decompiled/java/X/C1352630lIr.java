package X;

import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel$listener$1$onStop$1", f = "CommentAudioRecordViewModel.kt", l = {78, 85}, m = "invokeSuspend")
public final class C1352630lIr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C458520HyU LLILLJJLI;
    public final /* synthetic */ CommentAudioRecordViewModel LLILLL;
    public final /* synthetic */ float[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352630lIr(C458520HyU c458520HyU, CommentAudioRecordViewModel commentAudioRecordViewModel, float[] fArr, InterfaceC1364105Vn<? super C1352630lIr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c458520HyU;
        this.LLILLL = commentAudioRecordViewModel;
        this.LLILZ = fArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352630lIr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1DFH c1dfh = C0PEM.LIZ;
            C1352640lIs c1352640lIs = new C1352640lIs(this.LLILLJJLI, this.LLILLL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c1352640lIs);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1");
                return objLJFF;
            }
        }
        C1DFH c1dfh2 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1352620lIq c1352620lIq = new C1352620lIq((Pair) obj, this.LLILLL, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1352620lIq) == objLJFF) {
            C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
