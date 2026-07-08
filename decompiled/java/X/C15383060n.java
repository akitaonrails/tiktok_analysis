package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS27S0600000_2;
import njp.a;

/* JADX INFO: renamed from: X.060n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.chore.SmartReplyGeckoHelper$getGeckoResource$1", f = "SmartReplyGeckoHelper.kt", l = {}, m = "invokeSuspend")
public final class C15383060n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<C15401061f, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C15383060n(Function1<? super C15401061f, Unit> function1, InterfaceC1364105Vn<? super C15383060n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C15383060n(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SmartReplyGeckoHelper@f0e7.getGeckoResource$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06I1 c06i1 = C06I1.LIZIZ;
        Function1<C15401061f, Unit> function1 = this.LL;
        c06i1.getClass();
        if (C06I1.LIZJ()) {
            str = "create_bot_intro_static_dark";
        } else {
            str = "create_bot_intro_static_light";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("/config.json");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(str);
        sbLIZ2.append("/output.mp4");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        String str2 = (String) C15385060p.LIZ.getValue();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(str2);
        sbLIZ3.append("/mt_dm_bot_resource/");
        sbLIZ3.append(strLIZIZ);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(str2);
        sbLIZ4.append("/mt_dm_bot_resource/");
        sbLIZ4.append(strLIZIZ2);
        String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
        Object obj2 = new Object();
        C259800zU c259800zU = new C259800zU();
        C259800zU c259800zU2 = new C259800zU();
        C259800zU c259800zU3 = new C259800zU();
        C259800zU c259800zU4 = new C259800zU();
        C118300cf c118300cf = new C118300cf();
        C06I1.LIZIZ("mt_dm_bot_resource", strLIZIZ, strLIZIZ3, new AwS27S0600000_2(obj2, c259800zU3, c259800zU, c118300cf, c259800zU2, function1, 1));
        C06I1.LIZIZ("mt_dm_bot_resource", strLIZIZ2, strLIZIZ4, new AwS27S0600000_2(obj2, c259800zU4, c259800zU2, c118300cf, c259800zU, function1, 2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplyGeckoHelper@f0e7.getGeckoResource$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
