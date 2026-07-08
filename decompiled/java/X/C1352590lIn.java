package X;

import com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.audio.ui.recorder.CommentAudioRecordViewModel$listener$1$onStart$2", f = "CommentAudioRecordViewModel.kt", l = {69}, m = "invokeSuspend")
public final class C1352590lIn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentAudioRecordViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1352590lIn(CommentAudioRecordViewModel commentAudioRecordViewModel, InterfaceC1364105Vn<? super C1352590lIn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentAudioRecordViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1352590lIn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentAudioRecordViewModel@64b9.listener$1$onStart$2");
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
            CommentAudioRecordViewModel commentAudioRecordViewModel = this.LLILLJJLI;
            this.LL = 1;
            if (commentAudioRecordViewModel.xQ2(this) == objLJFF) {
                C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStart$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentAudioRecordViewModel@64b9.listener$1$onStart$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
