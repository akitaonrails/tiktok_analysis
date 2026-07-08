package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.sea.ability.ISeaLiveContextAbility;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vBL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.widget.SeaLiveBillboardPreviewWidget$onSlotCreated$1", f = "SeaLiveBillboardPreviewWidget.kt", l = {45}, m = "invokeSuspend")
public final class C1732370vBL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1732410vBP LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732370vBL(C1732410vBP c1732410vBP, String str, InterfaceC1364105Vn<? super C1732370vBL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1732410vBP;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1732370vBL(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI;
        C1C7U.LIZ("SeaLiveBillboardPreviewWidget@d22c.onSlotCreated$1");
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
            C1732390vBN c1732390vBN = C1732390vBN.LIZ;
            C1732410vBP c1732410vBP = this.LLILLJJLI;
            Context context = c1732410vBP.LLILLL;
            String str = this.LLILLL;
            this.LL = 1;
            c1732390vBN.getClass();
            C1732390vBN.LIZLLL.LL.getClass();
            ((HashMap) C1728690v5P.LIZ.getValue()).clear();
            if (str == null) {
                C1732390vBN.LJIILJJIL("auto_display_before_request_fail", "author id null");
                objLJI = Unit.LIZ;
            } else {
                objLJI = C23250099c.LJI(this, C2126308Ur.LIZIZ, new C1732380vBM(context, c1732410vBP, str, null));
                if (objLJI != C099R.LJFF()) {
                    objLJI = Unit.LIZ;
                }
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("SeaLiveBillboardPreviewWidget@d22c.onSlotCreated$1");
                return objLJFF;
            }
        }
        C1732410vBP c1732410vBP2 = this.LLILLJJLI;
        c1732410vBP2.LLJJIJI = new C1732330vBH(c1732410vBP2.LLJILJILJ, new WeakReference(this.LLILLJJLI.LLILLL), this.LLILLL, new WeakReference(this.LLILLJJLI));
        C596970NbD c596970NbD = C596970NbD.LIZIZ;
        EnumC1733330vCt enumC1733330vCt = EnumC1733330vCt.EC_LIVE_BILLBOARD_DISPLAY_NEW;
        final ISeaLiveContextAbility iSeaLiveContextAbility = this.LLILLJJLI.LLJILJILJ;
        final String str2 = this.LLILLL;
        final WeakReference weakReference = new WeakReference(this.LLILLJJLI);
        c596970NbD.LIZ(enumC1733330vCt, new InterfaceC596980NbE(iSeaLiveContextAbility, str2, weakReference) { // from class: X.0vBK
            public final ISeaLiveContextAbility LL;
            public final String LLILLJJLI;
            public final WeakReference<C1732410vBP> LLILLL;

            /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
            
                if (r8 == null) goto L40;
             */
            @Override // X.InterfaceC596980NbE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJ(X.C1525630pnt r21) {
                /*
                    Method dump skipped, instruction units count: 381
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1732360vBK.LJ(X.0pnt):void");
            }

            {
                this.LL = iSeaLiveContextAbility;
                this.LLILLJJLI = str2;
                this.LLILLL = weakReference;
            }
        });
        C1732330vBH c1732330vBH = this.LLILLJJLI.LLJJIJI;
        if (c1732330vBH != null) {
            C596950NbB.LIZ(c1732330vBH);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveBillboardPreviewWidget@d22c.onSlotCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
