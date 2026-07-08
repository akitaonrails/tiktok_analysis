package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineProtocol;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.collapse.CollapseInlineVM;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS12S0002000_14;

/* JADX INFO: renamed from: X.0ZTE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZTE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CollapseInlineProtocol LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZTE(CollapseInlineProtocol collapseInlineProtocol, int i, int i2) {
        super(0);
        this.LL = collapseInlineProtocol;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CollapseInlineVM collapseInlineVMLIZ = this.LL.LIZ();
        int i = this.LLILLJJLI;
        boolean z = this.LLILLL == 0;
        Integer num = (Integer) ((LinkedHashMap) collapseInlineVMLIZ.LLILLL).get(Integer.valueOf(i));
        if (num != null) {
            int iIntValue = num.intValue();
            Set<String> set = collapseInlineVMLIZ.LLILZIL.get(Integer.valueOf(i));
            if (set != null) {
                int size = set.size();
                if (collapseInlineVMLIZ.LLILZ.contains(Integer.valueOf(i))) {
                    collapseInlineVMLIZ.LLILZ = C15442062u.LJI(Integer.valueOf(i), collapseInlineVMLIZ.LLILZ);
                    collapseInlineVMLIZ.setState(new AwS12S0002000_14(iIntValue, size, 0));
                } else {
                    collapseInlineVMLIZ.LLILZ = C15442062u.LJIIIIZZ(Integer.valueOf(i), collapseInlineVMLIZ.LLILZ);
                    collapseInlineVMLIZ.setState(new C0ZTF(z, iIntValue, size));
                }
            }
        }
        return Unit.LIZ;
    }
}
