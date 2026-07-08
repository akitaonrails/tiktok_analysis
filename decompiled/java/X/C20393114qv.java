package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookFavoritesListDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14qv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20393114qv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ PlaybookFavoritesListDialog LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20393114qv(PlaybookFavoritesListDialog playbookFavoritesListDialog, C20402114sN c20402114sN, long j) {
        super(0);
        this.LL = playbookFavoritesListDialog;
        this.LLILLJJLI = c20402114sN;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        List<?> list;
        List<?> list2 = this.LL.LLLFF.LL;
        if (list2 != null) {
            long j = this.LLILLL;
            Iterator<?> it2 = list2.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (!(next instanceof C20390914qZ) || ((C20390914qZ) next).LIZ.playbookId != j) {
                    i++;
                } else if (i >= 0 && (list = this.LL.LLLFF.LL) != null && i < list.size()) {
                    this.LL.LLLFF.notifyItemChanged(i);
                }
            }
        }
        DataChannel dataChannel = this.LL.LLJZIJLIL;
        if (dataChannel != null) {
            dataChannel.SX0(C168A.class, Boolean.TRUE);
        }
        this.LLILLJJLI.invoke();
        return Unit.LIZ;
    }
}
