package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vDu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.WindowLivePlayerCompat$playPrepared$2", f = "WindowLivePlayerCompat.kt", l = {}, m = "invokeSuspend")
public final class C1733960vDu extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C16E0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733960vDu(C16E0 c16e0, InterfaceC1364105Vn<? super C1733960vDu> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c16e0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WindowLivePlayerCompat@3896.playPrepared$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ("manual");
        if (this.LL.LLIZLLLIL.findViewById(R.id.p_g).getVisibility() != 0 && (!a0.LJJJIL(this.LL.LLILZ))) {
            C1257480ipO.LIZ.storeLong(this.LL.LLILZ, System.currentTimeMillis());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WindowLivePlayerCompat@3896.playPrepared$2");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1733960vDu(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
