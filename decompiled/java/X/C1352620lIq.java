package X;

import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS230S0300000_21;
import njp.a;

/* JADX INFO: renamed from: X.0lIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel$listener$1$onStop$1$1", f = "CommentAudioRecordViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1352620lIq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Pair<String, Long> LL;
    public final /* synthetic */ CommentAudioRecordViewModel LLILLJJLI;
    public final /* synthetic */ float[] LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352620lIq(Pair<String, Long> pair, CommentAudioRecordViewModel commentAudioRecordViewModel, float[] fArr, InterfaceC1364105Vn<? super C1352620lIq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pair;
        this.LLILLJJLI = commentAudioRecordViewModel;
        this.LLILLL = fArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352620lIq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IRecorderListener COMPLETION duration = ");
        sbLIZ.append(this.LL.getSecond().longValue());
        C2188811AlT.LIZIZ(sbLIZ);
        CommentAudioRecordViewModel commentAudioRecordViewModel = this.LLILLJJLI;
        commentAudioRecordViewModel.setState(new AwS230S0300000_21((Pair) this.LL, (Pair<String, Long>) commentAudioRecordViewModel, (CommentAudioRecordViewModel) this.LLILLL, (float[]) 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStop$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
