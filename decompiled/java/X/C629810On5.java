package X;

import android.view.View;
import com.ss.android.ugc.aweme.music.v2.assem.button.MDPButtonAnimationController;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0On5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629810On5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MDPButtonAnimationController LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C629810On5(MDPButtonAnimationController mDPButtonAnimationController, int i) {
        super(0);
        this.LL = mDPButtonAnimationController;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Set<Map.Entry> setEntrySet = ((LinkedHashMap) this.LL.LL).entrySet();
        int i = this.LLILLJJLI;
        for (Map.Entry entry : setEntrySet) {
            for (InterfaceC629820On6 interfaceC629820On6 : (Iterable) entry.getValue()) {
                entry.getKey();
                if (interfaceC629820On6.LIZIZ(i)) {
                    interfaceC629820On6.LIZ(i, (View) entry.getKey());
                }
            }
        }
        return Unit.LIZ;
    }
}
