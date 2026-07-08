package X;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09je, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.entrycard.ui.SearchEntryCardImageAssem$configStandardImage$3", f = "SearchEntryCardImageAssem.kt", l = {170}, m = "invokeSuspend")
public final class C2454809je extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC2454909jf LLILLJJLI;
    public final /* synthetic */ SmartImageView LLILLL;
    public final /* synthetic */ C683120Qqs LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2454809je(InterfaceC2454909jf interfaceC2454909jf, SmartImageView smartImageView, C683120Qqs c683120Qqs, InterfaceC1364105Vn<? super C2454809je> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC2454909jf;
        this.LLILLL = smartImageView;
        this.LLILZ = c683120Qqs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2454809je(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchEntryCardImageAssem@8025.configStandardImage$3");
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
            InterfaceC2454909jf interfaceC2454909jf = this.LLILLJJLI;
            this.LL = 1;
            obj = interfaceC2454909jf.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchEntryCardImageAssem@8025.configStandardImage$3");
                return objLJFF;
            }
        }
        SmartImageView smartImageView = this.LLILLL;
        C683120Qqs c683120Qqs = this.LLILZ;
        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI((Uri) obj);
        c1331670kl3LJI.LJJ(smartImageView);
        Drawable drawable = c683120Qqs.LJ;
        if (drawable != null) {
            c1331670kl3LJI.LJIL(drawable);
        }
        C786410Ut5.h3(c1331670kl3LJI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchEntryCardImageAssem@8025.configStandardImage$3");
        return unit;
    }
}
