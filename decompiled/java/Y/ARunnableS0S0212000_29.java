package Y;

import X.C0IPD;
import X.C0IPE;
import X.C0IPF;
import X.C0IQ1;
import X.C1152720g6Q;
import X.C12O8;
import X.C12OA;
import X.C12OE;
import X.C12OX;
import X.C12OY;
import X.C19747412Oa;
import X.C1C7U;
import X.C20441214yg;
import X.C2188811AlT;
import X.C389001fE;
import X.C475760IlC;
import X.C512401z8;
import android.content.Context;
import android.widget.ImageView;
import com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkV3StatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastPerformanceStatusChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.drawable.TuxIconDrawable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS0S0212000_29 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() throws JSONException {
        C12OA c12oaInvoke;
        C12O8 next;
        C19747412Oa c19747412Oa;
        Context context;
        C12OA c12oaInvoke2 = ((C12OX) this.l0).LIZJ.invoke();
        if (c12oaInvoke2 != null) {
            int i = this.i3;
            int i2 = this.i4;
            Iterator<C12O8> it2 = c12oaInvoke2.LIZ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (next.LIZ != C12OE.DEFAULT);
            if ((next instanceof C19747412Oa) && (c19747412Oa = (C19747412Oa) next) != null) {
                Integer numValueOf = Integer.valueOf(i2);
                if (C1152720g6Q.LIZ() && (c19747412Oa.LJIILIIL != i || !Intrinsics.LJFF(c19747412Oa.LJIILJJIL, numValueOf))) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Network State V3: ");
                    sbLIZ.append(i);
                    sbLIZ.append(", reason=");
                    sbLIZ.append(numValueOf);
                    C20441214yg.LIZIZ("LiveCenterDefaultState", C2188811AlT.LIZIZ(sbLIZ));
                    c19747412Oa.LJIILIIL = i;
                    c19747412Oa.LJIILJJIL = numValueOf;
                    boolean zLJIJJ = c19747412Oa.LJIJJ();
                    ImageView imageView = c19747412Oa.LJ;
                    if (imageView != null && (context = imageView.getContext()) != null) {
                        TuxIconDrawable tuxIconDrawableLIZJ = C475760IlC.LIZJ(c19747412Oa.LJIILIIL, context);
                        DataChannel dataChannelLJ = c19747412Oa.LJ();
                        if (dataChannelLJ != null) {
                            dataChannelLJ.zW(BroadcastNetworkV3StatusChannel.class, new C0IPE(i, tuxIconDrawableLIZJ, numValueOf));
                        }
                        if (zLJIJJ) {
                            C12OY.LJIJI(c19747412Oa.LJ(), C12OE.DEFAULT, 0, 60);
                        }
                    }
                }
            }
        }
        if (this.z2 && (c12oaInvoke = ((C12OX) this.l0).LIZJ.invoke()) != null) {
            c12oaInvoke.LJJI((C0IQ1) this.l1);
        }
        JSONObject jSONObject = new JSONObject();
        int i3 = this.i3;
        w.LIZ.getClass();
        jSONObject.put("room_id", String.valueOf(w.LJIJJ()));
        jSONObject.put("quality", i3);
        C389001fE.LIZ("anchor_center_net_quality_changed", jSONObject, System.currentTimeMillis(), false);
    }

    public final void LIZ$1() {
        C12OA c12oaInvoke;
        C12O8 next;
        C19747412Oa c19747412Oa;
        Context context;
        C12OA c12oaInvoke2 = ((C12OX) this.l0).LIZJ.invoke();
        if (c12oaInvoke2 != null) {
            int i = this.i3;
            int i2 = this.i4;
            Iterator<C12O8> it2 = c12oaInvoke2.LIZ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (next.LIZ != C12OE.DEFAULT);
            if ((next instanceof C19747412Oa) && (c19747412Oa = (C19747412Oa) next) != null) {
                Integer numValueOf = Integer.valueOf(i2);
                if (C1152720g6Q.LIZ()) {
                    if (c19747412Oa.LJIIZILJ == i) {
                        Integer num = c19747412Oa.LJIJ;
                        if (new C512401z8(57).compare(num, numValueOf) >= 0) {
                            numValueOf = num;
                        }
                    }
                    if (c19747412Oa.LJIIZILJ != i || !Intrinsics.LJFF(c19747412Oa.LJIJ, numValueOf)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Performance State: ");
                        sbLIZ.append(i);
                        sbLIZ.append(", reason=");
                        sbLIZ.append(numValueOf);
                        C20441214yg.LIZIZ("LiveCenterDefaultState", C2188811AlT.LIZIZ(sbLIZ));
                        c19747412Oa.LJIIZILJ = i;
                        c19747412Oa.LJIJ = numValueOf;
                        boolean zLJIJJ = c19747412Oa.LJIJJ();
                        ImageView imageView = c19747412Oa.LJ;
                        if (imageView != null && (context = imageView.getContext()) != null) {
                            TuxIconDrawable tuxIconDrawableLIZLLL = C475760IlC.LIZLLL(i, context);
                            DataChannel dataChannelLJ = c19747412Oa.LJ();
                            if (dataChannelLJ != null) {
                                dataChannelLJ.zW(BroadcastPerformanceStatusChannel.class, new C0IPF(i, tuxIconDrawableLIZLLL, numValueOf));
                            }
                            if (zLJIJJ) {
                                C12OY.LJIJI(c19747412Oa.LJ(), C12OE.DEFAULT, 0, 60);
                            }
                        }
                    }
                }
            }
        }
        if (!this.z2 || (c12oaInvoke = ((C12OX) this.l0).LIZJ.invoke()) == null) {
            return;
        }
        c12oaInvoke.LJJI((C0IQ1) this.l1);
    }

    public final void LIZ$2() {
        C12OA c12oaInvoke;
        C12O8 next;
        C19747412Oa c19747412Oa;
        Context context;
        C12OA c12oaInvoke2 = ((C12OX) this.l0).LIZJ.invoke();
        if (c12oaInvoke2 != null) {
            int i = this.i3;
            Integer numValueOf = Integer.valueOf(this.i4);
            Iterator<C12O8> it2 = c12oaInvoke2.LIZ.iterator();
            do {
                next = null;
                if (!it2.hasNext()) {
                    break;
                } else {
                    next = it2.next();
                }
            } while (next.LIZ != C12OE.DEFAULT);
            if ((next instanceof C19747412Oa) && (c19747412Oa = (C19747412Oa) next) != null && C1152720g6Q.LIZ() && (c19747412Oa.LJIILL != i || !Intrinsics.LJFF(c19747412Oa.LJIILLIIL, numValueOf))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Audio State: ");
                sbLIZ.append(i);
                sbLIZ.append(", reason=");
                sbLIZ.append(numValueOf);
                C20441214yg.LIZIZ("LiveCenterDefaultState", C2188811AlT.LIZIZ(sbLIZ));
                c19747412Oa.LJIILL = i;
                c19747412Oa.LJIILLIIL = numValueOf;
                boolean zLJIJJ = c19747412Oa.LJIJJ();
                ImageView imageView = c19747412Oa.LJ;
                if (imageView != null && (context = imageView.getContext()) != null) {
                    TuxIconDrawable tuxIconDrawableLIZ = C475760IlC.LIZ(i, context);
                    DataChannel dataChannelLJ = c19747412Oa.LJ();
                    if (dataChannelLJ != null) {
                        dataChannelLJ.zW(BroadcastAudioStatusChannel.class, new C0IPD(i, tuxIconDrawableLIZ, numValueOf));
                    }
                    if (zLJIJJ) {
                        C12OY.LJIJI(c19747412Oa.LJ(), C12OE.DEFAULT, 0, 60);
                    }
                }
            }
        }
        if (!this.z2 || (c12oaInvoke = ((C12OX) this.l0).LIZJ.invoke()) == null) {
            return;
        }
        c12oaInvoke.LJJI((C0IQ1) this.l1);
    }

    public static final void run$0(ARunnableS0S0212000_29 aRunnableS0S0212000_29) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterStatusCoordinator@827e.onNetworkV3Status$5");
        try {
            aRunnableS0S0212000_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterStatusCoordinator@827e.onNetworkV3Status$5");
    }

    public static final void run$1(ARunnableS0S0212000_29 aRunnableS0S0212000_29) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterStatusCoordinator@827e.onPerformanceStatus$4");
        try {
            aRunnableS0S0212000_29.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterStatusCoordinator@827e.onPerformanceStatus$4");
    }

    public static final void run$2(ARunnableS0S0212000_29 aRunnableS0S0212000_29) {
        boolean zLIZ;
        C1C7U.LIZ("LiveCenterStatusCoordinator@827e.onAudioStatus$4");
        try {
            aRunnableS0S0212000_29.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveCenterStatusCoordinator@827e.onAudioStatus$4");
    }

    public ARunnableS0S0212000_29(C12OX c12ox, int i, int i2, boolean z, C0IQ1 c0iq1, int i3) {
        this.$t = i3;
        this.l0 = c12ox;
        this.i3 = i;
        this.i4 = i2;
        this.z2 = z;
        this.l1 = c0iq1;
    }
}
