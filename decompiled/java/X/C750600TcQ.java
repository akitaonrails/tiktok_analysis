package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0TcQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C750600TcQ {
    public User LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Room LIZLLL;
    public final Context LJ;
    public final AbstractC1136060ffY LJFF;
    public final InterfaceC2262081DgM LJI;
    public final FragmentManager LJII;
    public final String LJIIIIZZ;
    public final DataChannel LJIIIZ;

    public /* synthetic */ C750600TcQ(User user, boolean z, boolean z2, Room room, Context context, AbstractC1136060ffY abstractC1136060ffY, InterfaceC2262081DgM interfaceC2262081DgM, FragmentManager fragmentManager, String str) {
        this(context, fragmentManager, interfaceC2262081DgM, user, abstractC1136060ffY, room, null, str, z, z2);
    }

    public C750600TcQ(Context context, FragmentManager fragmentManager, InterfaceC2262081DgM interfaceC2262081DgM, User user, AbstractC1136060ffY abstractC1136060ffY, Room room, DataChannel dataChannel, String str, boolean z, boolean z2) {
        this.LIZ = user;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = room;
        this.LJ = context;
        this.LJFF = abstractC1136060ffY;
        this.LJI = interfaceC2262081DgM;
        this.LJII = fragmentManager;
        this.LJIIIIZZ = str;
        this.LJIIIZ = dataChannel;
    }
}
