package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.060m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chore.SmartReplyGeckoHelper$preloadGeckoResource$1", f = "SmartReplyGeckoHelper.kt", l = {}, m = "invokeSuspend")
public final class C15382060m extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C15382060m(InterfaceC1364105Vn<? super C15382060m> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15382060m(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SmartReplyGeckoHelper@f0e7.preloadGeckoResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06I1.LIZIZ.getClass();
        if (C06I1.LIZJ()) {
            str = "create_bot_intro_static_dark";
        } else {
            str = "create_bot_intro_static_light";
        }
        C06I1.LIZIZ("mt_dm_bot_resource", str, "", null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyGeckoHelper@f0e7.preloadGeckoResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C15382060m(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
