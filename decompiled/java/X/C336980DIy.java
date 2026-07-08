package X;

import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DIy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336980DIy extends C09AY implements Function1<Integer, Unit> {
    public final /* synthetic */ List<ImageView> LL;
    public final /* synthetic */ TextView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C336980DIy(TextView textView, List list) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        int iIntValue = num.intValue();
        Iterator<ImageView> it2 = this.LL.iterator();
        while (it2.hasNext()) {
            C786410Ut5.LJZI(8, it2.next());
        }
        if (iIntValue == 1) {
            C786410Ut5.LLIL(this.LLILLJJLI, 8);
        } else if (iIntValue > 1) {
            C786410Ut5.LJZI(0, (ImageView) ListProtector.get(this.LL, 0));
            C786410Ut5.LJZI(0, (ImageView) ListProtector.get(this.LL, 1));
            if (iIntValue > 2) {
                C786410Ut5.LJZI(0, (ImageView) ListProtector.get(this.LL, 2));
                if (iIntValue > 3) {
                    C786410Ut5.LJZI(0, (ImageView) ListProtector.get(this.LL, 3));
                    if (iIntValue > 4) {
                        C786410Ut5.LJZI(0, (ImageView) ListProtector.get(this.LL, 4));
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
