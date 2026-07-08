package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFollowBackGuideSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aMC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C931860aMC extends AbstractC960460b6K<LinkPlayerInfo, C931830aM9> {
    public final DataChannel LIZIZ;
    public final InterfaceC931760aM2 LIZJ;
    public final MultiGuestDataHolder LIZLLL;
    public final LinkControlDataHolder LJ;
    public final int LJFF;
    public final Function1<Long, Long> LJI;
    public final Function1<Long, Integer> LJII;
    public final String LJIIIIZZ;
    public final C928710aH7 LJIIIZ;

    @Override // X.C0J8P
    public final long LIZIZ(Object obj) {
        return ((LinkPlayerInfo) obj).hashCode();
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public C931830aM9 LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        if (C932490aND.LIZIZ()) {
            i = R.layout.hek;
        } else {
            i = R.layout.hel;
        }
        return new C931830aM9(C485880J3q.LIZ.LIZJ(i, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        C929160aHq c929160aHq;
        C0V05 c0v05;
        C931830aM9 c931830aM9 = (C931830aM9) viewHolder;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
        c931830aM9.LLILLJJLI = this.LIZJ;
        c931830aM9.LLILLL = this.LIZLLL;
        c931830aM9.LLILZ = this.LJ;
        if (!list.isEmpty()) {
            Object objLJJJLL = C13LP.LJJJLL(list);
            if ((objLJJJLL instanceof C0V05) && (c0v05 = (C0V05) objLJJJLL) != null) {
                boolean z = c0v05.LIZ;
                if (c931830aM9.LLLFFI.getVisibility() == 0) {
                    if (z) {
                        c931830aM9.LLLFFI.setEnabled(false);
                        c931830aM9.LLLFFI.setText(C497740JfY.LJIJI(2131840633));
                        return;
                    } else {
                        c931830aM9.LLLFFI.setEnabled(true);
                        c931830aM9.LLLFFI.setText(C497740JfY.LJIJI(2131842208));
                        return;
                    }
                }
                return;
            }
            Object objLJJJLL2 = C13LP.LJJJLL(list);
            if ((objLJJJLL2 instanceof C929160aHq) && (c929160aHq = (C929160aHq) objLJJJLL2) != null && MultiGuestFollowBackGuideSetting.INSTANCE.enableAnchorListPanelFollow()) {
                c931830aM9.q6(linkPlayerInfo, c929160aHq.LIZ);
                return;
            } else {
                c931830aM9.L5(linkPlayerInfo);
                return;
            }
        }
        LIZJ(c931830aM9, linkPlayerInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C931860aMC(DataChannel dataChannel, InterfaceC931760aM2 interfaceC931760aM2, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i, Function1<? super Long, Long> function1, Function1<? super Long, Integer> function12, String str, C928710aH7 c928710aH7) {
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC931760aM2;
        this.LIZLLL = multiGuestDataHolder;
        this.LJ = linkControlDataHolder;
        this.LJFF = i;
        this.LJI = function1;
        this.LJII = function12;
        this.LJIIIIZZ = str;
        this.LJIIIZ = c928710aH7;
    }
}
