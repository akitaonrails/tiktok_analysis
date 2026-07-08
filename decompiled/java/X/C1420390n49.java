package X;

import com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplatePreloadServiceImpl;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.lyricsrule.LyricsRuleTemplatePreloadServiceImpl$startTaskTimeout$1", f = "LyricsRuleTemplatePreloadServiceImpl.kt", l = {502}, m = "invokeSuspend")
public final class C1420390n49 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1420410n4B LLILLJJLI;
    public final /* synthetic */ LyricsRuleTemplatePreloadServiceImpl LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1420390n49(C1420410n4B c1420410n4B, LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl, InterfaceC1364105Vn<? super C1420390n49> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1420410n4B;
        this.LLILLL = lyricsRuleTemplatePreloadServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1420390n49(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startTaskTimeout$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(20000L, this) == objLJFF) {
                C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startTaskTimeout$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.LJIILIIL != EnumC1420440n4E.LL) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startTaskTimeout$1");
            return unit;
        }
        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl = this.LLILLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FIRED key=");
        sbLIZ.append(this.LLILLJJLI.LIZ);
        sbLIZ.append(" 20s mb=");
        sbLIZ.append(this.LLILLJJLI.LJI);
        sbLIZ.append(" lyric=");
        sbLIZ.append(this.LLILLJJLI.LJIIIZ);
        sbLIZ.append(" → force-fail RUNNING dimensions");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        lyricsRuleTemplatePreloadServiceImpl.getClass();
        LyricsRuleTemplatePreloadServiceImpl.LJIIJ("Preload.Timeout", strLIZIZ);
        EnumC1420450n4F enumC1420450n4F = this.LLILLJJLI.LJI;
        EnumC1420450n4F enumC1420450n4F2 = EnumC1420450n4F.LL;
        if (enumC1420450n4F == enumC1420450n4F2) {
            this.LLILLJJLI.LJI = EnumC1420450n4F.LLILLL;
            this.LLILLJJLI.LJIIIIZZ = new TimeoutException("music+Beats timeout (20000ms)");
        }
        if (this.LLILLJJLI.LJIIIZ == enumC1420450n4F2) {
            this.LLILLJJLI.LJIIIZ = EnumC1420450n4F.LLILLL;
        }
        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl2 = this.LLILLL;
        C1420410n4B c1420410n4B = this.LLILLJJLI;
        lyricsRuleTemplatePreloadServiceImpl2.getClass();
        LyricsRuleTemplatePreloadServiceImpl.LJIILIIL(c1420410n4B);
        LyricsRuleTemplatePreloadServiceImpl lyricsRuleTemplatePreloadServiceImpl3 = this.LLILLL;
        C1420410n4B c1420410n4B2 = this.LLILLJJLI;
        lyricsRuleTemplatePreloadServiceImpl3.getClass();
        LyricsRuleTemplatePreloadServiceImpl.LJIIJJI(c1420410n4B2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LyricsRuleTemplatePreloadServiceImpl@7728.startTaskTimeout$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
