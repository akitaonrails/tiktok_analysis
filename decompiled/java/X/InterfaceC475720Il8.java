package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.tux.icon.TuxIconView;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Il8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public interface InterfaceC475720Il8 {
    void LIZ(boolean z);

    void LIZIZ();

    void LIZJ(TuxIconView tuxIconView, View view);

    void LIZLLL(FrameLayout frameLayout);

    void LJ(Room room);

    void LJFF(Context context, Map map, List list, int i);

    boolean isMute();

    boolean isPlaying();

    void release();
}
