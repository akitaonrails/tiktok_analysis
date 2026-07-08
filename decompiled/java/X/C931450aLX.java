package X;

import Y.AfS181S0100000_12;
import Y.AfS184S0100000_15;
import Y.AkS468S0100000_3;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS99S1200000_15;

/* JADX INFO: renamed from: X.0aLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C931450aLX {
    public final DataChannel LIZ;
    public C1295960jpS LIZIZ;
    public C11PQ<String> LIZJ = new C11PQ<>();
    public final C11NJ LIZLLL = new C11NJ();
    public final C01GW LJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 13));

    public C931450aLX(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    public final void LIZ(AwS99S1200000_15 awS99S1200000_15) {
        if (C934690aQl.LIZ.LIZJ("quick_connect_animation_avatar_id")) {
            awS99S1200000_15.invoke(C934690aQl.LIZ("quick_connect_animation_avatar_id", false));
        } else {
            C20441214yg.LIZIZ("QuickConnectLottieHelper", "loadSelfAvatarImage from compositeDisposable");
            C19487311Lz.LIZIZ(C1121670fIL.LJ(C930540aK4.LJIIJJI().getAvatarThumb()).LJJJJZI(new AkS468S0100000_3(this, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LIZLLL, new AfS184S0100000_15(awS99S1200000_15, 2), new AfS181S0100000_12(awS99S1200000_15, 18), null, null, 56);
        }
    }
}
