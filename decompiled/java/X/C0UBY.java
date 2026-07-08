package X;

import Y.ACListenerS116S0200000_12;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.music.entity.Album;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UBY, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UBY extends AbstractC21673619ry<C0UBX> {
    public final DataChannel LL;
    public final Function1<Album, Unit> LLILLJJLI;
    public final List<Album> LLILLL = new ArrayList();
    public long LLILZ = C0UBZ.LLJJIII;
    public boolean LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(Album album) {
        Long lValueOf;
        Room room;
        this.LLILZ = album.id;
        notifyDataSetChanged();
        if (C0UBZ.LLJJJJ) {
            C768090UBb.LIZIZ(false);
        }
        DataChannel dataChannel = this.LL;
        long j = this.LLILZ;
        String str = album.name;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_ksong_tab_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(String.valueOf(j), "collection_id");
        c474500IjALIZ.LJJII(str, "tab");
        c474500IjALIZ.LIZ();
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        C768090UBb.LIZIZ = lValueOf;
    }

    public C0UBY(DataChannel dataChannel, AwS591S0100000_12 awS591S0100000_12) {
        this.LL = dataChannel;
        this.LLILLJJLI = awS591S0100000_12;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C0UBX c0ubx = (C0UBX) viewHolder;
        Album album = (Album) ListProtector.get(this.LLILLL, i);
        C1324610kZf c1324610kZfLIZJ = C1819620xS4.LIZ().LIZJ(C1697810uHb.LJIILJJIL(album.cover));
        c1324610kZfLIZJ.LJIIIZ = R.drawable.el4;
        c1324610kZfLIZJ.LJJI(c0ubx.LL);
        c0ubx.LLILLJJLI.setText(album.name);
        if (this.LLILZ == album.id) {
            C786410Ut5.LJLLLLLL(0, c0ubx.LLILLL);
            C439101nJ.LJFF(c0ubx.LLILLJJLI, R.color.a2_);
        } else {
            C786410Ut5.LJLLLLLL(8, c0ubx.LLILLL);
            C439101nJ.LJFF(c0ubx.LLILLJJLI, R.color.a5m);
        }
        if (this.LLILZ == album.id && this.LLILZIL) {
            C786410Ut5.h5(c0ubx.LL, 0.7f);
            C786410Ut5.LJZI(0, c0ubx.LLILZ);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(2000L);
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            c0ubx.LLILZ.setAnimation(rotateAnimation);
            c0ubx.LLILZ.startAnimation(rotateAnimation);
        } else {
            C786410Ut5.h5(c0ubx.LL, 1.0f);
            c0ubx.LLILZ.clearAnimation();
            C786410Ut5.LJZI(8, c0ubx.LLILZ);
        }
        C786410Ut5.I7(new ACListenerS116S0200000_12(this, album, 66), c0ubx.itemView);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0UBX c0ubx = new C0UBX(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.hey, viewGroup, false));
        try {
            View view = c0ubx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ubx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ubx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0UBX.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ubx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ubx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0UBX.class.getName();
        return c0ubx;
    }
}
