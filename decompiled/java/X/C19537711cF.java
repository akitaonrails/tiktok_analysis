package X;

import com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc.VCAudioResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.11cF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicechange.vc.handlers.FetchHandler$handleData$2$1$asyncTask$1", f = "FetchHandler.kt", l = {60}, m = "invokeSuspend")
public final class C19537711cF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C19538511cN>, Object> {
    public int LL;
    public final /* synthetic */ Pair<JSONArray, JSONArray> LLILLJJLI;
    public final /* synthetic */ C19536911c7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19537711cF(Pair<? extends JSONArray, ? extends JSONArray> pair, C19536911c7 c19536911c7, InterfaceC1364105Vn<? super C19537711cF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pair;
        this.LLILLL = c19536911c7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19537711cF(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FetchHandler@f4df.handleData$2$1$asyncTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C19545411dU c19545411dU = C19545411dU.LIZ;
            JSONArray first = this.LLILLJJLI.getFirst();
            JSONArray second = this.LLILLJJLI.getSecond();
            C0XPV c0xpvLIZIZ = this.LLILLL.LJ.LIZIZ();
            this.LL = 1;
            c19545411dU.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            if (first.length() == 0) {
                C19538511cN c19538511cN = new C19538511cN();
                C189200o6.m2constructorimpl(c19538511cN);
                c23260099m.resumeWith(c19538511cN);
            } else if (second.length() == 0) {
                C19538511cN c19538511cN2 = new C19538511cN();
                C189200o6.m2constructorimpl(c19538511cN2);
                c23260099m.resumeWith(c19538511cN2);
            } else {
                VCAudioResponse vCAudioResponseLIZ = C0XPU.LIZ(first, second, c0xpvLIZIZ);
                C19538511cN c19538511cN3 = new C19538511cN();
                if (vCAudioResponseLIZ.status_code != 0) {
                    z = false;
                }
                c19538511cN3.LIZ = z;
                c19538511cN3.LIZIZ = vCAudioResponseLIZ;
                C189200o6.m2constructorimpl(c19538511cN3);
                c23260099m.resumeWith(c19538511cN3);
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FetchHandler@f4df.handleData$2$1$asyncTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FetchHandler@f4df.handleData$2$1$asyncTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C19538511cN> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
