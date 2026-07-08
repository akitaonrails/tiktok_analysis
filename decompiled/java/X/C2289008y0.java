package X;

import com.ss.android.ugc.aweme.publish.model.UploadImageConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08y0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.BaseAIMusicUploadFrameTask$start$2$authConfig$1", f = "BaseAIMusicUploadFrameTask.kt", l = {374}, m = "invokeSuspend")
public final class C2289008y0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends UploadImageConfig, ? extends String>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ AbstractC2289508y5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2289008y0(AbstractC2289508y5 abstractC2289508y5, InterfaceC1364105Vn<? super C2289008y0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2289508y5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2289008y0(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.08y3] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("BaseAIMusicUploadFrameTask@c042.start$2$authConfig$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.LLILLL.LJIIJJI.LJIIJJI = C2286608xc.LJ(0);
            final AbstractC2289508y5 abstractC2289508y5 = this.LLILLL;
            C2288908xz.LIZLLL(new InterfaceC2273608vW() { // from class: X.08y3
                @Override // X.InterfaceC2273608vW
                public final void LIZ() {
                    if (Intrinsics.LJFF("have_auth_key", "have_auth_key")) {
                        abstractC2289508y5.LJIIJJI.LJIIJJI = 1;
                    }
                }

                @Override // X.InterfaceC2273608vW
                public final void LIZIZ(String str) {
                    abstractC2289508y5.LJIILL(-3, str, "");
                }
            });
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            if (C2291808yS.LIZ()) {
                obj = C2288608xw.LIZ.LJ(this);
            } else {
                obj = C2288808xy.LIZ.LIZLLL(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.start$2$authConfig$1");
                return objLJFF;
            }
        }
        C2288908xz.LIZLLL(null);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("provideAuthConfig time:");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        C201955140j.LIZIZ("AIMusicConfigHelper", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLL.LJIIJJI.LJIJI = System.currentTimeMillis() - jCurrentTimeMillis;
        C1C7U.LIZIZ("BaseAIMusicUploadFrameTask@c042.start$2$authConfig$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends UploadImageConfig, ? extends String>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
