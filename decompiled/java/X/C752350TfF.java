package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C752350TfF extends C750600TcQ {
    public final long LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final String LJIILIIL;
    public final String LJIILJJIL;
    public final Function0<Unit> LJIILL;

    public C752350TfF(User user, boolean z, boolean z2, Room room, Context context, AbstractC1136060ffY abstractC1136060ffY, InterfaceC2262081DgM interfaceC2262081DgM, FragmentManager fragmentManager, DataChannel dataChannel, long j, String str, String str2, String str3, String str4, String str5, Function0 function0) {
        super(context, fragmentManager, interfaceC2262081DgM, user, abstractC1136060ffY, room, dataChannel, str5, z, z2);
        this.LJIIJ = j;
        this.LJIIJJI = str;
        this.LJIIL = str2;
        this.LJIILIIL = str3;
        this.LJIILJJIL = str4;
        this.LJIILL = function0;
    }
}
