package X;

import Y.AgS193S0200000_2;
import Y.AgS283S0100000_2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05is, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.utils.downloader.CCTemplateAssetDownloaderKt$switchIfEmpty$1", f = "CCTemplateAssetDownloader.kt", l = {363, 368}, m = "invokeSuspend")
public final class C1430805is extends C09AX implements Function2<InterfaceC346701Wf<Object>, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZ;
    public final /* synthetic */ InterfaceC346201Wa<Object> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1430805is(InterfaceC346201Wa<Object> interfaceC346201Wa, InterfaceC346201Wa<Object> interfaceC346201Wa2, InterfaceC1364105Vn<? super C1430805is> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = interfaceC346201Wa;
        this.LLILZIL = interfaceC346201Wa2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1430805is c1430805is = new C1430805is(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1430805is.LLILLL = obj;
        return c1430805is;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        C013C c013c;
        C1C7U.LIZ("CCTemplateAssetDownloaderKt@f9f7.switchIfEmpty$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.switchIfEmpty$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c013c = this.LL;
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLL;
            c013c = new C013C();
            c013c.element = true;
            InterfaceC346201Wa<Object> interfaceC346201Wa = this.LLILZ;
            AgS193S0200000_2 agS193S0200000_2 = new AgS193S0200000_2(c013c, interfaceC346701Wf, 25);
            this.LLILLL = interfaceC346701Wf;
            this.LL = c013c;
            this.LLILLJJLI = 1;
            if (interfaceC346201Wa.collect(agS193S0200000_2, this) == objLJFF) {
                C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.switchIfEmpty$1");
                return objLJFF;
            }
        }
        if (c013c.element) {
            InterfaceC346201Wa<Object> interfaceC346201Wa2 = this.LLILZIL;
            AgS283S0100000_2 agS283S0100000_2 = new AgS283S0100000_2(interfaceC346701Wf, 89);
            this.LLILLL = null;
            this.LL = null;
            this.LLILLJJLI = 2;
            if (interfaceC346201Wa2.collect(agS283S0100000_2, this) == objLJFF) {
                C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.switchIfEmpty$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CCTemplateAssetDownloaderKt@f9f7.switchIfEmpty$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
