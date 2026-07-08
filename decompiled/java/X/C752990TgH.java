package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TgH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752990TgH extends C750600TcQ {
    public final boolean LJIIJ;
    public final Function0<Unit> LJIIJJI;

    public C752990TgH(User user, boolean z, boolean z2, Room room, Context context, AbstractC1136060ffY abstractC1136060ffY, InterfaceC2262081DgM interfaceC2262081DgM, FragmentManager fragmentManager, DataChannel dataChannel, boolean z3, Function0<Unit> function0, String str) {
        super(context, fragmentManager, interfaceC2262081DgM, user, abstractC1136060ffY, room, dataChannel, str, z, z2);
        this.LJIIJ = z3;
        this.LJIIJJI = function0;
    }
}
