package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0soH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.tools.infosticker.repository.internal.GifEntranceBannerController$startBanner$3", f = "GifEntranceBannerController.kt", l = {}, m = "invokeSuspend")
public final class C1641190soH extends C09AX implements Function2<Unit, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ GifEntranceBannerController LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1641190soH(GifEntranceBannerController gifEntranceBannerController, InterfaceC1364105Vn<? super C1641190soH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = gifEntranceBannerController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1641190soH(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GifEntranceBannerController@29b7.startBanner$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        GifEntranceBannerController gifEntranceBannerController = this.LL;
        int i = gifEntranceBannerController.LJ;
        gifEntranceBannerController.LJ = (i + 1) % 3;
        if (((ArrayList) gifEntranceBannerController.LIZLLL).size() > this.LL.LJ) {
            GifEntranceBannerController gifEntranceBannerController2 = this.LL;
            gifEntranceBannerController2.LIZ((C1324800kZy) ListProtector.get(gifEntranceBannerController2.LIZLLL, gifEntranceBannerController2.LJ));
            if (C300250Bpn.LIZ()) {
                GifEntranceBannerController gifEntranceBannerController3 = this.LL;
                GifEntranceBannerController.LIZJ((C1324800kZy) ListProtector.get(gifEntranceBannerController3.LIZLLL, gifEntranceBannerController3.LJ), EnumC1641520soo.SHOW);
            } else {
                GifEntranceBannerController gifEntranceBannerController4 = this.LL;
                C786410Ut5.t1((C1324800kZy) ListProtector.get(gifEntranceBannerController4.LIZLLL, gifEntranceBannerController4.LJ), 0);
            }
        }
        if (i != -1 && ((ArrayList) this.LL.LIZLLL).size() > i) {
            if (C300250Bpn.LIZ()) {
                GifEntranceBannerController.LIZJ((C1324800kZy) ListProtector.get(this.LL.LIZLLL, i), EnumC1641520soo.HIDE);
            } else {
                C786410Ut5.t1((C1324800kZy) ListProtector.get(this.LL.LIZLLL, i), 4);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GifEntranceBannerController@29b7.startBanner$3");
        return unit;
    }
}
