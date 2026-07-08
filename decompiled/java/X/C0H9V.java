package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.model.AnoleProductModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H9V, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.component.adcardcomponent.vsacard.AnoleVSACardComponent$preloadImageList$1", f = "AnoleVSACardComponent.kt", l = {}, m = "invokeSuspend")
public final class C0H9V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<AnoleProductModel> LL;
    public final /* synthetic */ ViewOnClickListenerC1007560cKI LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H9V(List<AnoleProductModel> list, ViewOnClickListenerC1007560cKI viewOnClickListenerC1007560cKI, InterfaceC1364105Vn<? super C0H9V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = viewOnClickListenerC1007560cKI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H9V(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AnoleVSACardComponent@3398.preloadImageList$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (final AnoleProductModel anoleProductModel : this.LL) {
            String imageUrl = anoleProductModel.getImageUrl();
            if (imageUrl != null) {
                int i = C0H9X.LLILZIL;
                int iLIZ = C0H9Z.LIZ();
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(imageUrl);
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(iLIZ)));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(iLIZ)));
                c1331670kl3LJIIIZ.LJIIIIZZ = iLIZIZ;
                c1331670kl3LJIIIZ.LJIIIZ = iLIZIZ2;
                c1331670kl3LJIIIZ.LJJIII = EnumC1334360kpO.HIGH;
                c1331670kl3LJIIIZ.LIZLLL("vsa_full_screen_card");
                c1331670kl3LJIIIZ.LJJIJL(this.LLILLJJLI.LLILZ);
                final List<AnoleProductModel> list = this.LL;
                final ViewOnClickListenerC1007560cKI viewOnClickListenerC1007560cKI = this.LLILLJJLI;
                c1331670kl3LJIIIZ.LJJII(new AbstractC468201s0() { // from class: X.0H9W
                    @Override // X.InterfaceC1331910klR
                    public final void LIZ(Bitmap bitmap) {
                        int iIndexOf = list.indexOf(anoleProductModel);
                        if (bitmap != null) {
                            ViewOnClickListenerC1007560cKI viewOnClickListenerC1007560cKI2 = viewOnClickListenerC1007560cKI;
                            viewOnClickListenerC1007560cKI2.LLJLIL.put(Integer.valueOf(iIndexOf), bitmap);
                            if (iIndexOf == 0) {
                                viewOnClickListenerC1007560cKI2.LLJLL = C436320H9a.LIZ(bitmap);
                            }
                        }
                    }

                    @Override // X.InterfaceC1331910klR
                    public final void onFailed(Throwable th) {
                        String message;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onFailed");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C2188811AlT.LIZIZ(sbLIZ);
                    }
                });
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AnoleVSACardComponent@3398.preloadImageList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
