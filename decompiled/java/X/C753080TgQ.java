package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;

/* JADX INFO: renamed from: X.0TgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C753080TgQ extends C750600TcQ {
    public final AbstractC1110800f0o<?> LJIIJ;
    public final Map<String, String> LJIIJJI;
    public final boolean LJIIL;

    public C753080TgQ(User user, boolean z, boolean z2, Room room, Context context, AbstractC1136060ffY abstractC1136060ffY, InterfaceC2262081DgM interfaceC2262081DgM, FragmentManager fragmentManager, DataChannel dataChannel, AbstractC1110800f0o<?> abstractC1110800f0o, Map<String, String> map, boolean z3, String str) {
        super(context, fragmentManager, interfaceC2262081DgM, user, abstractC1136060ffY, room, dataChannel, str, z, z2);
        this.LJIIJ = abstractC1110800f0o;
        this.LJIIJJI = map;
        this.LJIIL = z3;
    }
}
