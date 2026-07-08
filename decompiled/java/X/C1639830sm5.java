package X;

import Y.AfS159S0200000_25;
import Y.AfS181S0100000_12;
import Y.AkS486S0100000_25;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.effectplatform.EffectPlatform;
import com.ss.android.ugc.aweme.filter.repository.internal.filterbox.UpdateFilterBoxBody;
import java.util.Set;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sm5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1639830sm5 extends AbstractC1634090scp<C1639800sm2> implements InterfaceC1639850sm7 {
    public final C01GW<InterfaceC1663020tNU> LIZ;
    public final C1639780sm0 LIZIZ;
    public final InterfaceC1456340o08<InterfaceC1635390sev> LIZJ;
    public final InterfaceC1639390slN LIZLLL;

    @Override // X.AbstractC1634060scm
    public final C11NZ<C1639800sm2> LJ() {
        InterfaceC1663020tNU value = this.LIZ.getValue();
        this.LIZIZ.getClass();
        String str = (String) C1639840sm6.LL.get();
        this.LIZIZ.getClass();
        String str2 = (String) C1628930sUV.LL.get();
        this.LIZIZ.getClass();
        String str3 = (String) C1632510saH.LL.get();
        this.LIZIZ.getClass();
        return value.LIZIZ(str, str2, str3, (String) C2386709Wv.LL.get(), this.LIZIZ.LIZ.get()).LJIL(new AkS486S0100000_25(this, 18)).LJJIJLIJ();
    }

    public final UpdateFilterBoxBody LJFF(Set<String> set, EnumC1641590sov enumC1641590sov) {
        String strLJJLIIIJ = C13LP.LJJLIIIJ(set, ",", null, null, 0, null, null, 62);
        int i = enumC1641590sov.LL;
        this.LIZIZ.getClass();
        String strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId = AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId();
        String str = this.LIZIZ.LIZ.get();
        this.LIZIZ.getClass();
        String str2 = (String) C1628930sUV.LL.get();
        this.LIZIZ.getClass();
        String strLJJJJIZL = EffectPlatform.LJJJJIZL();
        this.LIZIZ.getClass();
        String str3 = (String) C2386709Wv.LL.get();
        this.LIZIZ.getClass();
        String str4 = (String) C1639840sm6.LL.get();
        this.LIZIZ.getClass();
        return new UpdateFilterBoxBody(strLJJLIIIJ, i, strCom_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId, str, str2, strLJJJJIZL, str3, str4, (String) C1632510saH.LL.get());
    }

    @Override // X.InterfaceC1639850sm7
    public final AbstractC19484711Kz LIZIZ(Set set, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        if (set.isEmpty()) {
            return AbstractC19484711Kz.LJIJJ(C11IR.LL);
        }
        C19489311Mt c19489311Mt = new C19489311Mt();
        this.LIZ.getValue().LIZ(LJFF(set, EnumC1641590sov.LLILLJJLI)).LJIILL(new AfS159S0200000_25(this, awS569S0100000_25, 4)).LJIIL(new AfS181S0100000_12(awS569S0100000_252, 170)).LJIL(new InterfaceC1487280oo2() { // from class: X.00Xk
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return obj;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LIZ(c19489311Mt);
        return new C19474511Hb(c19489311Mt);
    }

    @Override // X.InterfaceC1639850sm7
    public final AbstractC19484711Kz LIZLLL(Set set, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        if (set.isEmpty()) {
            return AbstractC19484711Kz.LJIJJ(C11IR.LL);
        }
        C19489311Mt c19489311Mt = new C19489311Mt();
        this.LIZ.getValue().LIZ(LJFF(set, EnumC1641590sov.LLILLL)).LJIILL(new AfS159S0200000_25(this, awS569S0100000_25, 5)).LJIIL(new AfS181S0100000_12(awS569S0100000_252, 171)).LJIL(new InterfaceC1487280oo2() { // from class: X.00Xl
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                return obj;
            }
        }).LJJIJIIJI(C11S5.LIZ()).LIZ(c19489311Mt);
        return new C19474511Hb(c19489311Mt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1639830sm5(C01GW<? extends InterfaceC1663020tNU> c01gw, C1639780sm0 c1639780sm0, InterfaceC1456340o08<InterfaceC1635390sev> interfaceC1456340o08, InterfaceC1639390slN interfaceC1639390slN) {
        this.LIZ = c01gw;
        this.LIZIZ = c1639780sm0;
        this.LIZJ = interfaceC1456340o08;
        this.LIZLLL = interfaceC1639390slN;
    }
}
