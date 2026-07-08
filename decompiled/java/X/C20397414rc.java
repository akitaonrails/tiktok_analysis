package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20397414rc extends C09AY implements Function1<Integer, Integer> {
    public final /* synthetic */ PlaybookPolymerizationDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20397414rc(PlaybookPolymerizationDialog playbookPolymerizationDialog) {
        super(1);
        this.LL = playbookPolymerizationDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Integer invoke(Integer num) {
        int iIntValue = num.intValue();
        Iterator<?> it2 = this.LL.ES().LL.iterator();
        int i = 0;
        while (true) {
            if (it2.hasNext()) {
                if (it2.next() instanceof C20390914qZ) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return Integer.valueOf(iIntValue - i);
    }
}
