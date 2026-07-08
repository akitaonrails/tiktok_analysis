package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CeK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.eventtrack.VideoPublishPageMobHelper$mobPublish$10", f = "VideoPublishPageMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C318620CeK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AtomicBoolean LL;
    public final /* synthetic */ C1402440mbC LLILLJJLI;
    public final /* synthetic */ C1403560md0 LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;
    public final /* synthetic */ AbstractC855580XhM LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function1<C0LAB, Unit> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C318620CeK(AtomicBoolean atomicBoolean, C1402440mbC c1402440mbC, C1403560md0 c1403560md0, VideoPublishEditModel videoPublishEditModel, AbstractC855580XhM abstractC855580XhM, boolean z, boolean z2, Function1<? super C0LAB, Unit> function1, String str, InterfaceC1364105Vn<? super C318620CeK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = atomicBoolean;
        this.LLILLJJLI = c1402440mbC;
        this.LLILLL = c1403560md0;
        this.LLILZ = videoPublishEditModel;
        this.LLILZIL = abstractC855580XhM;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = function1;
        this.LLJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318620CeK(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Exception exc;
        C1C7U.LIZ("VideoPublishPageMobHelper@c9.mobPublish$10");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.set(true);
        try {
            C1402440mbC c1402440mbC = this.LLILLJJLI;
            C1403560md0 c1403560md0 = this.LLILLL;
            VideoPublishEditModel videoPublishEditModel = this.LLILZ;
            AbstractC855580XhM abstractC855580XhM = this.LLILZIL;
            boolean z = this.LLILZLL;
            boolean z2 = this.LLIZ;
            Function1<C0LAB, Unit> function1 = this.LLIZLLLIL;
            String str = this.LLJ;
            c1402440mbC.getClass();
            C1402440mbC.LJIIZILJ(c1403560md0, videoPublishEditModel, abstractC855580XhM, z, z2, function1, str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("mobPublishInternal background exception, fallback to main: ");
            sbLIZ.append(th.getMessage());
            C201955140j.LJIIJ(c830690WiJ, C2188811AlT.LIZIZ(sbLIZ), th);
            if (th instanceof Exception) {
                exc = th;
            } else {
                exc = null;
            }
            C308510C7l.LIZ(2, exc);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoPublishPageMobHelper@c9.mobPublish$10");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
