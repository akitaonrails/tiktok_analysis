package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0CWd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.toolbar.TextToImageTitleBarComponent$clickNext$2$genImageJob$1$3", f = "TextToImageTitleBarComponent.kt", l = {168, 175, 207}, m = "invokeSuspend")
public final class C314930CWd extends C09AX implements InterfaceC1631630sYr<List<? extends TextImageTaskInfo>, Boolean, Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ InterfaceC497601wk LLILLL;
    public final /* synthetic */ C571990Mc1 LLILZ;
    public final /* synthetic */ DialogC1390150mHN LLILZIL;
    public final /* synthetic */ C118300cf LLILZLL;
    public final /* synthetic */ C118300cf LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C314930CWd(InterfaceC497601wk interfaceC497601wk, C571990Mc1 c571990Mc1, DialogC1390150mHN dialogC1390150mHN, C118300cf c118300cf, C118300cf c118300cf2, InterfaceC1364105Vn<? super C314930CWd> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILLL = interfaceC497601wk;
        this.LLILZ = c571990Mc1;
        this.LLILZIL = dialogC1390150mHN;
        this.LLILZLL = c118300cf;
        this.LLIZ = c118300cf2;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        C155000ia.LIZIZ(obj);
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
                        return unit;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
                return unit2;
            }
            C155000ia.LIZIZ(obj);
            this.LLILZ.LLJIJIL = false;
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
            return unit3;
        }
        C155000ia.LIZIZ(obj);
        int i2 = this.LLILLJJLI;
        if (!C2296808zG.LJI(this.LLILLL)) {
            this.LLILZ.LLJIJIL = false;
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
            return unit4;
        }
        if (i2 == EnumC314970CWh.FAIL.getProgress()) {
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C314950CWf c314950CWf = new C314950CWf(this.LLILZIL, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c314950CWf) == objLJFF) {
                C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
                return objLJFF;
            }
            this.LLILZ.LLJIJIL = false;
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
            return unit32;
        }
        if (i2 != EnumC314970CWh.NLE_FINISH.getProgress()) {
            C1DFH c1dfh2 = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq2 = C2107308Nj.LIZ;
            C314940CWe c314940CWe = new C314940CWe(i2, this.LLILZLL, this.LLILZIL, this.LLIZ, this.LLILZ, null);
            this.LL = 2;
            if (C23250099c.LJI(this, abstractC2238408pq2, c314940CWe) == objLJFF) {
                C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
                return objLJFF;
            }
            Unit unit22 = Unit.LIZ;
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
            return unit22;
        }
        this.LLILZ.W2();
        Intent intent = new Intent();
        C1428470nHB.LLIIZ(intent, this.LLILZ.H2());
        C1DFH c1dfh3 = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq3 = C2107308Nj.LIZ;
        C571980Mc0 c571980Mc0 = new C571980Mc0(this.LLILZIL, this.LLILZ, intent, null);
        this.LL = 3;
        if (C23250099c.LJI(this, abstractC2238408pq3, c571980Mc0) == objLJFF) {
            C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
            return objLJFF;
        }
        Unit unit5 = Unit.LIZ;
        C1C7U.LIZIZ("TextToImageTitleBarComponent@ec65.clickNext$2$genImageJob$1$3");
        return unit5;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends TextImageTaskInfo> list, Boolean bool, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        bool.booleanValue();
        int iIntValue = num.intValue();
        C314930CWd c314930CWd = new C314930CWd(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c314930CWd.LLILLJJLI = iIntValue;
        return c314930CWd.invokeSuspend(Unit.LIZ);
    }
}
