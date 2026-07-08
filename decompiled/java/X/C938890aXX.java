package X;

import com.bytedance.android.live.liveinteract.platform.statemanager.iablility.UserState;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0aXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C938890aXX extends C09AY implements Function1<UserState, UserState> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C938890aXX(int i, boolean z, boolean z2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final UserState invoke(UserState userState) {
        UserState userState2 = userState;
        int i = userState2.LLILLJJLI;
        int i2 = this.LL;
        int i3 = i & i2;
        if (i3 != 0 ? !(i3 <= 0 || !this.LLILLJJLI) : !this.LLILLJJLI) {
            i ^= i2;
        }
        boolean z = this.LLILLL;
        if (z) {
            i = ((i >> 6) << 6) + userState2.audioMuted;
        }
        boolean z2 = this.LLILLJJLI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeAudioSource, source = ");
        sbLIZ.append(i2);
        sbLIZ.append(", enable = ");
        sbLIZ.append(z2);
        sbLIZ.append(", attach = ");
        sbLIZ.append(z);
        sbLIZ.append(", audioSource = ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        return UserState.LIZ(userState2, 0, 0, 0, 0, 0, i, 0L, 1535);
    }
}
