package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListV2Dialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14qw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20393214qw extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1117360fBO LL;
    public final /* synthetic */ PlaybookFavoritesListV2Dialog LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20393214qw(C1117360fBO c1117360fBO, PlaybookFavoritesListV2Dialog playbookFavoritesListV2Dialog, C20402114sN c20402114sN, long j) {
        super(0);
        this.LL = c1117360fBO;
        this.LLILLJJLI = playbookFavoritesListV2Dialog;
        this.LLILLL = c20402114sN;
        this.LLILZ = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<?> list;
        List<?> list2 = this.LL.LL;
        if (list2 != null) {
            long j = this.LLILZ;
            Iterator<?> it2 = list2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!(next instanceof C20390914qZ) || ((C20390914qZ) next).LIZ.playbookId != j) {
                    i++;
                } else if (i >= 0 && (list = this.LL.LL) != null && i < list.size()) {
                    this.LL.notifyItemChanged(i);
                }
            }
        }
        DataChannel dataChannel = this.LLILLJJLI.LLJZIJLIL;
        if (dataChannel != null) {
            dataChannel.SX0(C168A.class, Boolean.TRUE);
        }
        this.LLILLL.invoke();
        return Unit.LIZ;
    }
}
