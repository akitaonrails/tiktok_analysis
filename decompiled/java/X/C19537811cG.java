package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.11cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FileHandler$handleData$2$asyncResult$1", f = "FileHandler.kt", l = {46}, m = "invokeSuspend")
public final class C19537811cG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C19538311cL>, Object> {
    public int LL;
    public final /* synthetic */ C19536911c7 LLILLJJLI;
    public final /* synthetic */ VCAudioResult LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19537811cG(C19536911c7 c19536911c7, VCAudioResult vCAudioResult, InterfaceC1364105Vn<? super C19537811cG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19536911c7;
        this.LLILLL = vCAudioResult;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19537811cG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FileHandler@dfa7.handleData$2$asyncResult$1");
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
            C19536911c7 c19536911c7 = this.LLILLJJLI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LLILLL.originalVid);
            sbLIZ.append(this.LLILLL.speaker);
            String strLIZ = c19536911c7.LJ.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            C19545411dU c19545411dU = C19545411dU.LIZ;
            Context context = this.LLILLJJLI.LIZJ;
            VCAudioResult vCAudioResult = this.LLILLL;
            this.LL = 1;
            obj = c19545411dU.LIZ(context, vCAudioResult, strLIZ, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FileHandler@dfa7.handleData$2$asyncResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FileHandler@dfa7.handleData$2$asyncResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C19538311cL> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
