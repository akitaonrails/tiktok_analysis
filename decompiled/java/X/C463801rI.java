package X;

import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01rI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.suggestedstickers.ui.RecommendedStickerBanner$preparePoorNetworkUIFeedback$1", f = "RecommendedStickerBanner.kt", l = {457}, m = "invokeSuspend")
public final class C463801rI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ C453470HqL LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ TuxSheet LLILZLL;
    public final /* synthetic */ C19EG LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C463801rI(long j, C453470HqL c453470HqL, String str, TuxSheet tuxSheet, C19EG c19eg, InterfaceC1364105Vn<? super C463801rI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = j;
        this.LLILZ = c453470HqL;
        this.LLILZIL = str;
        this.LLILZLL = tuxSheet;
        this.LLIZ = c19eg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C463801rI c463801rI = new C463801rI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c463801rI.LLILLJJLI = obj;
        return c463801rI;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("RecommendedStickerBanner@1906.preparePoorNetworkUIFeedback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            long j = this.LLILLL;
            if (j > 0) {
                this.LLILLJJLI = interfaceC497601wk;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                    C1C7U.LIZIZ("RecommendedStickerBanner@1906.preparePoorNetworkUIFeedback$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RecommendedStickerBanner@1906.preparePoorNetworkUIFeedback$1");
                return unit;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            C453470HqL c453470HqL = this.LLILZ;
            if (!c453470HqL.LLILZ && Intrinsics.LJFF(this.LLILZIL, c453470HqL.LLILZIL)) {
                if (this.LLILZLL != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZLL);
                    c1389890mGx.LJIIIZ(2131829445);
                    c1389890mGx.LJIIJJI();
                } else {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(this.LLIZ);
                    c1389890mGx2.LJIIIZ(2131829445);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("RecommendedStickerBanner@1906.preparePoorNetworkUIFeedback$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
