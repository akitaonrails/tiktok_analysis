package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.android.livesdk.broadcast.livestudio.LiveStudioLiveChatFragment;
import com.bytedance.android.livesdk.broadcast.livestudio.LiveStudioPerformanceFragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0U4P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U4P extends FragmentStateAdapter {
    public DataChannel LLJI;
    public Bundle LLJIJIL;
    public ArrayList<C764240TyQ> LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLJILJIL.size();
    }

    public C0U4P(C19EG c19eg) {
        super(c19eg);
        this.LLJILJIL = new ArrayList<>();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LLLII(int i) {
        Fragment fragment;
        Room room;
        if (i == 0) {
            DataChannel dataChannel = this.LLJI;
            LiveStudioLiveChatFragment liveStudioLiveChatFragment = new LiveStudioLiveChatFragment();
            liveStudioLiveChatFragment.LLILLJJLI = dataChannel;
            if (dataChannel != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            } else {
                room = null;
            }
            liveStudioLiveChatFragment.LLILLL = room;
            fragment = liveStudioLiveChatFragment;
        } else {
            DataChannel dataChannel2 = this.LLJI;
            LiveStudioPerformanceFragment liveStudioPerformanceFragment = new LiveStudioPerformanceFragment();
            liveStudioPerformanceFragment.LLILLL = dataChannel2;
            fragment = liveStudioPerformanceFragment;
        }
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.LLJIJIL;
        if (bundle2 != null) {
            C786410Ut5.LJJIIJZLJL(bundle, bundle2);
        }
        fragment.setArguments(bundle);
        return fragment;
    }
}
