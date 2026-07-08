package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRight;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ExposeUserRightPanel;
import g1c.AjS60S0100000_1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.037r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7925037r extends ConstraintLayout {
    public final ExposeUserRightPanel LL;
    public final String LLILLJJLI;
    public final HashMap<String, Object> LLILLL;
    public final AwS580S0100000_1 LLILZ;

    public final String getRightContent$ecommerce_transaction_release() {
        List<ExposeUserRight> list;
        ExposeUserRightPanel exposeUserRightPanel = this.LL;
        if (exposeUserRightPanel == null || (list = exposeUserRightPanel.exposeUserRights) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<ExposeUserRight> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().nameEn);
        }
        return C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62);
    }

    public final Function1<String, Unit> getClickListener$ecommerce_transaction_release() {
        return this.LLILZ;
    }

    public AbstractC7925037r(ExposeUserRightPanel exposeUserRightPanel, String str, HashMap<String, Object> map, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = exposeUserRightPanel;
        this.LLILLJJLI = str;
        this.LLILLL = map;
        this.LLILZ = new AwS580S0100000_1(this, 799);
        C1748720vbi.LJFF(this, new C10515049h(), AFwS185S0000000_1.get$arr$(461), new AwS580S0100000_1(this, 798));
        C786410Ut5.I7(new AjS60S0100000_1(this, 117), this);
    }
}
