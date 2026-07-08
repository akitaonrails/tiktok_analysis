package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.INLERhythmPointRuntime;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E23, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.audio.stickpoint.EditorProStickPointNLEHandler$startDefaultStickPoint$1$resultPair$1", f = "EditorProStickPointNLEHandler.kt", l = {}, m = "invokeSuspend")
public final class C0E23 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C1441180nbg, ? extends Integer>>, Object> {
    public final /* synthetic */ C357990E1t LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ VEAlgorithmPath LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E23(C357990E1t c357990E1t, String str, VEAlgorithmPath vEAlgorithmPath, int i, int i2, InterfaceC1364105Vn<? super C0E23> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c357990E1t;
        this.LLILLJJLI = str;
        this.LLILLL = vEAlgorithmPath;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E23(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0070: IGET (r8 I:java.lang.String) = (r2 I:X.0E23) (LINE:16777328) X.0E23.LLILLJJLI java.lang.String, block:B:17:0x0068 */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0E23] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        ?? r2;
        int iGenRandomSolve;
        INLERhythmPointRuntime algorithmApi;
        C1C7U.LIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1$resultPair$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C1441180nbg c1441180nbgLIZJ = this.LL.LJFF.LIZJ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
            if (c1441180nbgLIZJ.LIZ >= 0) {
                if (this.LLILZIL == 0) {
                    INLEMediaSession iNLEMediaSessionF1 = this.LL.LIZJ.f1();
                    if (iNLEMediaSessionF1 != null && (algorithmApi = iNLEMediaSessionF1.getAlgorithmApi()) != null) {
                        iGenRandomSolve = algorithmApi.genRandomSolve();
                    } else {
                        iGenRandomSolve = -1;
                    }
                    c1441180nbgLIZJ.LIZ = iGenRandomSolve;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1441180nbgLIZJ.LJIIIIZZ);
                    sbLIZ.append(",genRandomSolve Done");
                    c1441180nbgLIZJ.LJIIIIZZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                pair = new Pair(c1441180nbgLIZJ, C2286608xc.LJ(12));
            } else {
                pair = new Pair(c1441180nbgLIZJ, C2286608xc.LJ(11));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = new Pair(new C1441180nbg(-1, r2.LLILLJJLI, null, r2.LLILLL, C2286608xc.LJ(r2.LLILZ), null, null, null, null, 484), C2286608xc.LJ(14));
        }
        C1C7U.LIZIZ("EditorProStickPointNLEHandler@b1b1.startDefaultStickPoint$1$resultPair$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends C1441180nbg, ? extends Integer>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
