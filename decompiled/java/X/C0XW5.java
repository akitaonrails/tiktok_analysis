package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS449S0200000_13;

/* JADX INFO: renamed from: X.0XW5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XW5 extends C09AY implements Function1<C846060XGy, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC852200Xbu LLILLJJLI;
    public final /* synthetic */ Map<String, Object> LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ boolean LLILZIL = true;
    public final /* synthetic */ Function2<String, String, Unit> LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XW5(String str, InterfaceC852200Xbu interfaceC852200Xbu, Map map, C19EG c19eg, AwS449S0200000_13 awS449S0200000_13, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = interfaceC852200Xbu;
        this.LLILLL = map;
        this.LLILZ = c19eg;
        this.LLILZLL = awS449S0200000_13;
        this.LLIZ = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C846060XGy c846060XGy) {
        C846060XGy c846060XGy2 = c846060XGy;
        C852170Xbr c852170Xbr = C852170Xbr.LIZ;
        String str = this.LL;
        InterfaceC852200Xbu interfaceC852200Xbu = this.LLILLJJLI;
        C0XO3 c0xo3 = c846060XGy2.LJIIIZ;
        Map<String, Object> map = this.LLILLL;
        c852170Xbr.getClass();
        C852170Xbr.LJIIL(false, str, interfaceC852200Xbu, c0xo3, map);
        C0XYO.LIZLLL(C0XYO.LIZ, this.LLILZ, null, c846060XGy2.LJIIIZ, this.LLILZIL, null, true, 48);
        String string = JSONObjectProtectorUtils.getString(c846060XGy2.LJIILJJIL, "cloud_token");
        if (C123100dR.LIZ(string)) {
            this.LLILZLL.invoke(this.LLIZ, string);
        }
        return Unit.LIZ;
    }
}
