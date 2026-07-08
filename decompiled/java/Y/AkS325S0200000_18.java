package Y;

import X.C1180620gpQ;
import X.EnumC1181510gqr;
import X.InterfaceC1181010gq3;
import X.InterfaceC1487280oo2;
import com.ss.android.ugc.aweme.slash.data.SlashVm;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: loaded from: classes19.dex */
public class AkS325S0200000_18 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS325S0200000_18 akS325S0200000_18, Object obj) {
        return ((SlashVm) akS325S0200000_18.l0).wQ2(EnumC1181510gqr.PRE_LOAD, (InterfaceC1181010gq3) akS325S0200000_18.l1, (C1180620gpQ) obj, null, null, AFwS206S0000000_18.get$arr$(799));
    }

    public static final Object apply$1(AkS325S0200000_18 akS325S0200000_18, Object obj) {
        return ((SlashVm) akS325S0200000_18.l0).wQ2(EnumC1181510gqr.PRE_LOAD, (InterfaceC1181010gq3) akS325S0200000_18.l1, null, (Throwable) obj, null, AFwS206S0000000_18.get$arr$(800));
    }

    public static final Object apply$2(AkS325S0200000_18 akS325S0200000_18, Object obj) {
        SlashVm slashVm = (SlashVm) akS325S0200000_18.l0;
        return ((Function1) akS325S0200000_18.l1).invoke(slashVm.yQ2(slashVm.LLILLJJLI, (C1180620gpQ) obj));
    }

    public static final Object apply$3(AkS325S0200000_18 akS325S0200000_18, Object obj) {
        SlashVm slashVm = (SlashVm) akS325S0200000_18.l0;
        return ((Function1) akS325S0200000_18.l1).invoke(slashVm.yQ2(slashVm.LLILLJJLI, (C1180620gpQ) obj));
    }

    public AkS325S0200000_18(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
