package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NNW, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNW implements InterfaceC442501nr {
    public final /* synthetic */ C0O99 LL;

    public C0NNW(C0O99 c0o99) {
        this.LL = c0o99;
    }

    @Override // X.InterfaceC442501nr
    public final void LLJJJJJIL(Map<String, String> map, InterfaceC1631620sYq<? super String, ? super Integer, ? super Boolean, Unit> interfaceC1631620sYq, Function2<? super String, ? super Exception, Unit> function2) {
        int i;
        HashMap map2 = (HashMap) map;
        String str = (String) map2.get("aweme_id");
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = (String) map2.get("type");
        if (str3 != null) {
            i = CastIntegerProtector.parseInt(str3);
        } else {
            i = 0;
        }
        String str4 = (String) map2.get("enter_from");
        if (str4 != null) {
            str2 = str4;
        }
        try {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0O3F(this.LL, map, str, i, interfaceC1631620sYq, str2, function2, null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            function2.invoke(str, e);
        }
    }
}
