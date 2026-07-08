package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RUh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem$resetDiggDrawableToDefault$1", f = "VideoDiggAssem.kt", l = {}, m = "invokeSuspend")
public final class C696650RUh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoDiggAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696650RUh(VideoDiggAssem videoDiggAssem, InterfaceC1364105Vn<? super C696650RUh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoDiggAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696650RUh(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VideoDiggAssem@a0f1.resetDiggDrawableToDefault$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ((C1295960jpS) this.LL.getContentView().findViewById(R.id.ftt)).setImageDrawable(this.LL.LLLFZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoDiggAssem@a0f1.resetDiggDrawableToDefault$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
