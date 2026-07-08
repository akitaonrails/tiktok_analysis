package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.linkroom.dataholder.LinkControlDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0aMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public class C931900aMG extends AbstractC960460b6K<LinkPlayerInfo, C931880aME> {
    public final DataChannel LIZIZ;
    public final InterfaceC931940aMK LIZJ;
    public final MultiGuestDataHolder LIZLLL;
    public final LinkControlDataHolder LJ;
    public final int LJFF;

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public C931880aME LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C931880aME(C485880J3q.LIZ.LIZJ(R.layout.hep, viewGroup, false), this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, Object obj, List list) {
        C931880aME c931880aME = (C931880aME) viewHolder;
        LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
        c931880aME.LLILLJJLI = this.LIZJ;
        c931880aME.LLILLL = this.LIZLLL;
        c931880aME.LLILZ = this.LJ;
        if (!list.isEmpty()) {
            c931880aME.L5(linkPlayerInfo);
        } else {
            LIZJ(c931880aME, linkPlayerInfo);
        }
    }

    public C931900aMG(DataChannel dataChannel, InterfaceC931940aMK interfaceC931940aMK, MultiGuestDataHolder multiGuestDataHolder, LinkControlDataHolder linkControlDataHolder, int i) {
        linkControlDataHolder = (i & 8) != 0 ? null : linkControlDataHolder;
        this.LIZIZ = dataChannel;
        this.LIZJ = interfaceC931940aMK;
        this.LIZLLL = multiGuestDataHolder;
        this.LJ = linkControlDataHolder;
        this.LJFF = 0;
    }
}
