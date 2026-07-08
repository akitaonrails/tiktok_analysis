package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XtabESportshighlightCardVM;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zAO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.video.xtab.XtabESportshighlightCardVM$fetchESportsHighlight$1", f = "XtabESportshighlightCardVM.kt", l = {LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1885540zAO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ XtabESportshighlightCardVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1885540zAO(XtabESportshighlightCardVM xtabESportshighlightCardVM, String str, String str2, InterfaceC1364105Vn<? super C1885540zAO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = xtabESportshighlightCardVM;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1885540zAO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("XtabESportshighlightCardVM@b0b1.fetchESportsHighlight$1");
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
            C1885260z9w c1885260z9w = this.LLILLJJLI.LL;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            c1885260z9w.getClass();
            C095D c095d = new C095D(new C1885520zAM(c1885260z9w, str, str2, null));
            final XtabESportshighlightCardVM xtabESportshighlightCardVM = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0zAP
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Pair pair = (Pair) obj2;
                    C1885490zAJ c1885490zAJ = (C1885490zAJ) pair.getFirst();
                    ((Number) pair.getSecond()).longValue();
                    xtabESportshighlightCardVM.LLILLJJLI.setValue(c1885490zAJ);
                    XtabESportshighlightCardVM xtabESportshighlightCardVM2 = xtabESportshighlightCardVM;
                    xtabESportshighlightCardVM2.getClass();
                    xtabESportshighlightCardVM2.LLILZ = c1885490zAJ.LJ;
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c095d.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("XtabESportshighlightCardVM@b0b1.fetchESportsHighlight$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("XtabESportshighlightCardVM@b0b1.fetchESportsHighlight$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
