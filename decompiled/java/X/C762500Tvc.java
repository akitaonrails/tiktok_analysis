package X;

import Y.AsS39S0100000_12;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tvc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762500Tvc extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC763330Twx {
    public final BGMSongListViewModel LL;
    public final BGMPlaylistViewModel LLILLJJLI;
    public final DataChannel LLILLL;
    public final LifecycleOwner LLILZ;
    public final String LLILZIL;
    public final long LLILZLL;
    public int LLIZ = -1;
    public int LLIZLLLIL = -1;
    public final Map<Long, Integer> LLJ = new HashMap();
    public final List<MusicSong> LLJI = new ArrayList();
    public boolean LLJIJIL;

    public final int LLLFZ() {
        MusicSong musicSong;
        int i = 0;
        for (MusicSong musicSong2 : (ArrayList) this.LLJI) {
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LLILLJJLI;
            if (bGMPlaylistViewModel != null && (musicSong = bGMPlaylistViewModel.LL.LJ) != null && musicSong2.id == musicSong.id) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLJI).size() + 1;
    }

    @Override // X.InterfaceC763330Twx
    public final void WE() {
        notifyItemChanged(LLLFZ());
    }

    @Override // X.InterfaceC763330Twx
    public final void onPlayerPause() {
        notifyItemChanged(LLLFZ());
    }

    @Override // X.InterfaceC763330Twx
    public final void zk() {
        notifyItemChanged(LLLFZ());
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i != getItemCount() - 1) {
            return 1;
        }
        return 2;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C763260Twq.LIZ(this);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        C763260Twq.LIZJ().remove(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0115  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, int r15) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C762500Tvc.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c762550Tvh;
        if (i == 2) {
            c762550Tvh = new C762540Tvg(C500260Jjc.LJIILL(R.layout.gpm, viewGroup, false), true);
        } else {
            c762550Tvh = new C762550Tvh(C500260Jjc.LJIILL(R.layout.gpo, viewGroup, false));
        }
        try {
            View view = c762550Tvh.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c762550Tvh.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c762550Tvh.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c762550Tvh.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c762550Tvh.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c762550Tvh.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c762550Tvh.getClass().getName();
        return c762550Tvh;
    }

    public C762500Tvc(BGMSongListViewModel bGMSongListViewModel, BGMPlaylistViewModel bGMPlaylistViewModel, RunnableC781530UlD runnableC781530UlD, DataChannel dataChannel, LifecycleOwner lifecycleOwner, String str, long j) {
        this.LL = bGMSongListViewModel;
        this.LLILLJJLI = bGMPlaylistViewModel;
        this.LLILLL = dataChannel;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = str;
        this.LLILZLL = j;
        runnableC781530UlD.addOnScrollListener(new AsS39S0100000_12(this, 5));
        C500260Jjc.LJJJJJ(lifecycleOwner, null, new C762340TvM(this, null), 3);
        C500260Jjc.LJJJJJ(lifecycleOwner, null, new C762560Tvi(this, null), 3);
        C763260Twq.LIZ(this);
        notifyDataSetChanged();
    }
}
