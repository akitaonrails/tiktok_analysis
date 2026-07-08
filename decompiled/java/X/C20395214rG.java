package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14rG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20395214rG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C20398214rk LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ C951190arN LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20395214rG(C20398214rk c20398214rk, C20412114tz c20412114tz, C951190arN c951190arN, long j) {
        super(0);
        this.LL = c20398214rk;
        this.LLILLJJLI = c20412114tz;
        this.LLILLL = c951190arN;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<Playbook> list;
        DataChannel dataChannel = this.LL.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.SX0(C168A.class, Boolean.TRUE);
        }
        this.LLILLJJLI.invoke();
        List<Playbook> list2 = this.LL.LLIZLLLIL;
        if (list2 != null) {
            long j = this.LLILZ;
            Iterator<Playbook> it2 = list2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().playbookId != j) {
                    i++;
                } else if (i >= 0 && (list = this.LL.LLIZLLLIL) != null && i < list.size()) {
                    this.LLILLL.notifyItemChanged(i);
                }
            }
        }
        return Unit.LIZ;
    }
}
