package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.tux.icon.TuxIconView;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0z9o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public interface InterfaceC1885180z9o {
    void LIZ(boolean z);

    void LIZIZ();

    void LIZJ(TuxIconView tuxIconView, View view);

    void LIZLLL(FrameLayout frameLayout);

    void LJ(int i, Room room);

    void LJFF(int i);

    void LJI(Context context, Room room, EnterRoomConfig enterRoomConfig, List<Long> list, Map<String, String> map);

    boolean isMute();

    boolean isPlaying();

    void release();

    void setLogExtras(Map<String, String> map);
}
