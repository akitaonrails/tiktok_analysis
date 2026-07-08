package Y;

import X.C2254071DKj;
import X.InterfaceC1477220oXo;
import com.ss.android.ugc.aweme.simkit.impl.bitrateselector.Filter;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes36.dex */
public class AObjectS377S0100000_35 implements Function1 {
    public final int $t;
    public Object l0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            default:
                return null;
        }
    }

    public AObjectS377S0100000_35(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS377S0100000_35 aObjectS377S0100000_35, Object obj) {
        return C2254071DKj.h8((C2254071DKj) aObjectS377S0100000_35.l0, (Boolean) obj);
    }

    public static final Object invoke$1(AObjectS377S0100000_35 aObjectS377S0100000_35, Object obj) {
        return Boolean.valueOf(Filter.filter$lambda$1((Filter) aObjectS377S0100000_35.l0, (InterfaceC1477220oXo) obj));
    }

    public static final Object invoke$2(AObjectS377S0100000_35 aObjectS377S0100000_35, Object obj) {
        return Boolean.valueOf(Filter.filter$lambda$3((Filter) aObjectS377S0100000_35.l0, (InterfaceC1477220oXo) obj));
    }

    public static final Object invoke$3(AObjectS377S0100000_35 aObjectS377S0100000_35, Object obj) {
        return Boolean.valueOf(Filter.filter$lambda$6((Filter) aObjectS377S0100000_35.l0, (InterfaceC1477220oXo) obj));
    }

    public static final Object invoke$4(AObjectS377S0100000_35 aObjectS377S0100000_35, Object obj) {
        return Boolean.valueOf(Filter.filter$lambda$9((Filter) aObjectS377S0100000_35.l0, (InterfaceC1477220oXo) obj));
    }
}
