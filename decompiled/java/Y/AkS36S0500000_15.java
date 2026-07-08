package Y;

import X.C11NZ;
import X.C13LP;
import X.C20361214lm;
import X.C916750Zxp;
import X.C954060aw0;
import X.InterfaceC1487280oo2;
import X.InterfaceC971000bNK;
import X.InterfaceC979390bar;
import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity.NoticeboardEntity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes16.dex */
public class AkS36S0500000_15 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS36S0500000_15 akS36S0500000_15, Object obj) {
        ((NoticeboardEntity) akS36S0500000_15.l0).LJJLJLI((Context) akS36S0500000_15.l1, (C916750Zxp) akS36S0500000_15.l2, (InterfaceC979390bar) akS36S0500000_15.l3, (C20361214lm) akS36S0500000_15.l4);
        return Unit.LIZ;
    }

    public static final Object apply$1(AkS36S0500000_15 akS36S0500000_15, Object obj) {
        List list = (List) obj;
        return C11NZ.LJJJJIZL(C13LP.LLIIL(list)).LJIJJ(new AkS10S0600000_15((C954060aw0) akS36S0500000_15.l0, (Context) akS36S0500000_15.l1, list, (InterfaceC971000bNK) akS36S0500000_15.l2, (Function0) akS36S0500000_15.l3, (Function2) akS36S0500000_15.l4, 1)).LJLJLLL();
    }

    public AkS36S0500000_15(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
