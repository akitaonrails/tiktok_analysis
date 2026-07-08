package Y;

import X.C0OUT;
import X.C1360330lVH;
import X.C1389300mG0;
import X.C1599640rjG;
import X.C633060OsK;
import X.C639110P4z;
import X.C786410Ut5;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public class AObjectS352S0100000_9 implements Function1 {
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
            default:
                return null;
        }
    }

    public AObjectS352S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object invoke$0(AObjectS352S0100000_9 aObjectS352S0100000_9, Object obj) {
        C1599640rjG.LIZIZ.Ou(obj, new C1360330lVH(C1389300mG0.LIZIZ(((PlayerController) aObjectS352S0100000_9.l0).fragment), null, null, null));
        return null;
    }

    public static final Object invoke$1(AObjectS352S0100000_9 aObjectS352S0100000_9, Object obj) {
        WeakHandler weakHandler;
        C633060OsK c633060OsK = (C633060OsK) aObjectS352S0100000_9.l0;
        Message message = (Message) obj;
        if (c633060OsK.LL != 0 && (weakHandler = c633060OsK.LLJ) != null) {
            C786410Ut5.LJLJJL(weakHandler, message);
            return null;
        }
        return null;
    }

    public static final Object invoke$2(AObjectS352S0100000_9 aObjectS352S0100000_9, Object obj) {
        ((C633060OsK) aObjectS352S0100000_9.l0).LJIILL();
        return null;
    }

    public static final Object invoke$3(AObjectS352S0100000_9 aObjectS352S0100000_9, Object obj) {
        ((SparkContext) obj).LJJJJZI(new C639110P4z((C0OUT) aObjectS352S0100000_9.l0, 2));
        return Unit.LIZ;
    }
}
