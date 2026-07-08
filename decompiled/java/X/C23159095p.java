package X;

import java.io.File;
import kotlin.Unit;

/* JADX INFO: renamed from: X.095p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.sdk.smartmovie.domain.SmartMovieTemplateListPipeline$execute$2", f = "SmartMovieTemplateListPipeline.kt", l = {}, m = "invokeSuspend")
public final class C23159095p extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C096D>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C23187096r LL;
    public final /* synthetic */ C23164095u LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23159095p(C23187096r c23187096r, C23164095u c23164095u, InterfaceC1364105Vn<? super C23159095p> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c23187096r;
        this.LLILLJJLI = c23164095u;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJIILIIL;
        C1C7U.LIZ("SmartMovieTemplateListPipeline@97ee.execute$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("execute complete execId=");
        sbLIZ.append(this.LL.LJIIJJI);
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieTemplateListPipeline", C2188811AlT.LIZIZ(sbLIZ));
        C23164095u c23164095u = this.LLILLJJLI;
        String str = this.LL.LJIIJJI;
        AnonymousClass0961 anonymousClass0961 = c23164095u.LIZ.LIZIZ;
        if (anonymousClass0961.LJIILL) {
            C0VSJ c0vsj = new C0VSJ(anonymousClass0961.LJIIIZ, "tos");
            if (c0vsj.exists() && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
                long jLongValue = lLJIILIIL.longValue();
                File[] fileArrListFiles = c0vsj.listFiles();
                if (fileArrListFiles != null) {
                    for (File file : fileArrListFiles) {
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(file.getName());
                        if (lLJIILIIL2 != null && lLJIILIIL2.longValue() <= jLongValue) {
                            C08QA.LJIIZILJ(file);
                        }
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartMovieTemplateListPipeline@97ee.execute$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C096D> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C23159095p(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
