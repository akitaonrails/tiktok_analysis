package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.grouplive.datachannel.GroupLiveMemberList;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0fUE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129040fUE {
    public final LifecycleOwner LIZ;
    public final C1120070fFl LIZIZ;
    public final DataChannel LIZJ;
    public final Function0<Long> LIZLLL;
    public final Function0<Unit> LJ;
    public final Function0<Unit> LJFF;
    public final Function0<Unit> LJI;
    public C1120080fFm LJII;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1130230fW9 r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1129040fUE.LIZ(X.0fW9):void");
    }

    public C1129040fUE(LifecycleOwner lifecycleOwner, C1120070fFl c1120070fFl, DataChannel dataChannel, AwS561S0100000_17 awS561S0100000_17, AwS561S0100000_17 awS561S0100000_172, AwS561S0100000_17 awS561S0100000_173, AwS561S0100000_17 awS561S0100000_174) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = c1120070fFl;
        this.LIZJ = dataChannel;
        this.LIZLLL = awS561S0100000_17;
        this.LJ = awS561S0100000_172;
        this.LJFF = awS561S0100000_173;
        this.LJI = awS561S0100000_174;
        c1120070fFl.setSwitchTargetClick(new AwS561S0100000_17(this, 352));
        c1120070fFl.setUserProfileClick(new AwS596S0100000_17(this, 362));
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, GroupLiveMemberList.class, new AwS596S0100000_17(this, 361));
        }
    }
}
