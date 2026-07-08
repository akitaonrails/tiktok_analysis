package X;

import Y.AsS39S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import com.bytedance.android.livesdk.ui.BaseFragment;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS378S0200000_12;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0Tvb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C762490Tvb extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC763330Twx {
    public final BGMPlaylistViewModel LL;
    public final RecyclerView LLILLJJLI;
    public final BaseFragment LLILLL;
    public final DataChannel LLILZ;
    public final List<MusicSong> LLILZIL;
    public boolean LLILZLL;

    public final void LLLFZ() {
        C763480TxC c763480TxC = this.LL.LL;
        Integer numLIZJ = c763480TxC.LIZJ(c763480TxC.LJ);
        if (numLIZJ != null) {
            notifyItemChanged(numLIZJ.intValue() + 1);
        }
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILZIL).size();
    }

    @Override // X.InterfaceC763330Twx
    public final void WE() {
        LLLFZ();
    }

    @Override // X.InterfaceC763330Twx
    public final void onPlayerPause() {
        LLLFZ();
    }

    @Override // X.InterfaceC763330Twx
    public final void zk() {
        LLLFZ();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == getItemCount() - 1) {
            return 3;
        }
        return 1;
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

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        boolean z;
        int i2;
        String strJ4;
        if (viewHolder instanceof C762580Tvk) {
            MusicSong musicSong = (MusicSong) ListProtector.get(this.LLILZIL, i);
            if (musicSong == null) {
                return;
            }
            MusicSong musicSong2 = this.LL.LL.LJ;
            if (musicSong2 != null && musicSong2.id == musicSong.id) {
                z = true;
            } else {
                z = false;
            }
            View view = viewHolder.itemView;
            C1324610kZf url = C1819620xS4.LIZ().setUrl(musicSong.coverUrl);
            url.LJIIIZ = R.drawable.eab;
            url.LJJI(view.findViewById(R.id.bys));
            ((TextView) view.findViewById(R.id.bza)).setText(musicSong.title);
            TextView textView = (TextView) view.findViewById(R.id.bza);
            Context context = view.getContext();
            if (z && !this.LLILZLL) {
                i2 = R.attr.a04;
            } else {
                i2 = R.attr.fy3;
            }
            textView.setTextColor(C20736316Cj.LIZIZ(i2, context));
            ((TextView) view.findViewById(R.id.byp)).setText(musicSong.author);
            TextView textView2 = (TextView) view.findViewById(R.id.byt);
            int i3 = musicSong.duration;
            int i4 = i3 % 60;
            int i5 = i3 / 60;
            if (C497740JfY.LJJ()) {
                strJ4 = C786410Ut5.j4("%02d : %02d · ", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}, 2));
            } else {
                strJ4 = C786410Ut5.j4(" · %02d : %02d", Arrays.copyOf(new Object[]{Integer.valueOf(i5), Integer.valueOf(i4)}, 2));
            }
            textView2.setText(strJ4);
            C500260Jjc.LJIILIIL(view.findViewById(R.id.qu3));
            if (z && C763260Twq.LJIIL) {
                C1143680frq.LJIIL((C1295960jpS) view.findViewById(R.id.qu3), "tiktok_live_broadcast_demand_1", "live_play_song_anim.zip", "images", true, null, Boolean.FALSE, null);
                C500260Jjc.LLFFF(view.findViewById(R.id.qu3));
            } else {
                C500260Jjc.LJIILIIL(view.findViewById(R.id.qu3));
            }
            if (z && this.LLILZLL) {
                C500260Jjc.LLFFF(viewHolder.itemView.findViewById(R.id.byw));
            } else {
                C500260Jjc.LJIILLIIL(viewHolder.itemView.findViewById(R.id.byw));
            }
            C500260Jjc.LJLIIIL(500L, view.findViewById(R.id.fld), new AwS378S0200000_12(this, musicSong, 65));
            C500260Jjc.LJLIIIL(500L, view, new AwS378S0200000_12(this, musicSong, 66));
            return;
        }
        if (viewHolder instanceof C762540Tvg) {
            C762540Tvg c762540Tvg = (C762540Tvg) viewHolder;
            BGMPlaylistViewModel bGMPlaylistViewModel = this.LL;
            boolean z2 = bGMPlaylistViewModel.LLILZ;
            boolean z3 = bGMPlaylistViewModel.LLILZIL;
            if (c762540Tvg.LL) {
                c762540Tvg.I5(!z3);
            } else {
                c762540Tvg.I5(!z2);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c762540Tvg;
        if (i != 2) {
            if (i != 3) {
                final View viewLJIILL = C500260Jjc.LJIILL(R.layout.gpn, viewGroup, false);
                c762540Tvg = new RecyclerView.ViewHolder(viewLJIILL) { // from class: X.0Tvk
                };
            } else {
                c762540Tvg = new C762540Tvg(C500260Jjc.LJIILL(R.layout.gpm, viewGroup, false), true);
            }
        } else {
            c762540Tvg = new C762540Tvg(C500260Jjc.LJIILL(R.layout.gpm, viewGroup, false), false);
        }
        try {
            View view = c762540Tvg.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c762540Tvg.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c762540Tvg.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c762540Tvg.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c762540Tvg.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c762540Tvg.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c762540Tvg.getClass().getName();
        return c762540Tvg;
    }

    public C762490Tvb(BGMPlaylistViewModel bGMPlaylistViewModel, RecyclerView recyclerView, BaseFragment baseFragment, DataChannel dataChannel) {
        this.LL = bGMPlaylistViewModel;
        this.LLILLJJLI = recyclerView;
        this.LLILLL = baseFragment;
        this.LLILZ = dataChannel;
        ArrayList arrayList = new ArrayList(bGMPlaylistViewModel.yQ2());
        ListProtector.add(arrayList, 0, null);
        arrayList.add(null);
        this.LLILZIL = arrayList;
        recyclerView.addOnScrollListener(new AsS39S0100000_12(this, 6));
        C500260Jjc.LJJJJJ(baseFragment, null, new C762330TvL(this, null), 3);
    }
}
