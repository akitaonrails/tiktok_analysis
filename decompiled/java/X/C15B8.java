package X;

import Y.ARunnableS42S0300000_9;
import Y.AfS189S0100000_20;
import Y.AfS200S0100000_31;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownCloseCountDownSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS8S1310000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.GuestShowdownConfig;
import webcast.data.multi_guest_play.GuestShowdownContent;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: renamed from: X.15B8, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public class C15B8 implements C15BT {
    public static final int LJIJI;
    public static final int LJIJJ;
    public static final int LJIJJLI;
    public static final String LJIL;
    public static final String LJJ;
    public static final String LJJI;
    public EnumC937920aVy LIZ;
    public final DataChannel LIZIZ;
    public final C20475815Ae LIZJ;
    public final C20476915Ap LIZLLL;
    public final boolean LJ;
    public C11JF LJI;
    public ViewGroup LJII;
    public ViewGroup LJIIIIZZ;
    public GuestShowdownContent LJIIIZ;
    public int LJIIJJI;
    public int LJIILLIIL;
    public C15B5 LJIIZILJ;
    public final String LJFF = "GuestShowdownAnimationCalculator";
    public final List<GuestShowdownUser> LJIIJ = new ArrayList();
    public final List<GuestShowdownContent> LJIIL = new ArrayList();
    public final List<C15BU> LJIILIIL = new ArrayList();
    public final List<C15BM> LJIILJJIL = new ArrayList();
    public final List<Integer> LJIILL = C1697810uHb.LJIIJJI(0, 5);
    public final boolean LJIJ = MultiGuestGuestShowdownCloseCountDownSetting.INSTANCE.isEnable();

    static {
        String strLIZIZ;
        new C15BB();
        LJIJI = C439101nJ.LIZ(32);
        LJIJJ = C439101nJ.LIZ(14);
        LJIJJLI = C439101nJ.LIZ(64);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.LOTTIE;
        sbLIZ.append(enumC20476415Ak);
        sbLIZ.append("_ready");
        LJIL = C2188811AlT.LIZIZ(sbLIZ);
        if (C01ZC.LIZIZ()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(enumC20476415Ak);
            sbLIZ2.append("_fg");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(EnumC20476415Ak.IMAGE);
            sbLIZ3.append("_fg");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        LJJ = strLIZIZ;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append(EnumC20476415Ak.TEXT);
        sbLIZ4.append("_no_champion");
        LJJI = C2188811AlT.LIZIZ(sbLIZ4);
    }

    public final void LIZLLL() {
        GuestShowdownContent guestShowdownContentLJI;
        if (((ArrayList) this.LJIIL).isEmpty()) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ == null || (guestShowdownContentLJI = interfaceC938530aWxLIZ.LJI()) == null) {
                return;
            }
            LIZJ(guestShowdownContentLJI, "from service", false);
            return;
        }
        List listLLIIII = C13LP.LLIIII(this.LJIIL);
        ((ArrayList) this.LJIIL).clear();
        Iterator it2 = listLLIIII.iterator();
        while (it2.hasNext()) {
            LIZJ((GuestShowdownContent) it2.next(), "layoutContainer set value", false);
        }
    }

    public final void LJFF() {
        C11JF c11jf;
        C11JF c11jf2 = this.LJI;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = this.LJI) != null) {
            c11jf.dispose();
        }
        this.LJI = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIZ() {
        /*
            r10 = this;
            webcast.data.multi_guest_play.GuestShowdownContent r4 = r10.LJIIIZ
            r8 = 0
            if (r4 != 0) goto L7
            return r8
        L7:
            int r1 = r4.playStatus
            r0 = 2
            if (r1 != r0) goto L32
            long r4 = r4.partyStartTime
            X.01FV r1 = X.C01HE.LJ()
            X.01FV r0 = X.C01FV.AUDIENCE
            if (r1 != r0) goto L2f
            long r6 = X.C01HA.LJIIIIZZ()
        L1a:
            long r1 = X.C158B.LIZ()
            long r1 = r1 + r6
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 <= 0) goto L3d
            long r2 = -r6
            long r0 = X.C158B.LIZ()
            long r2 = r2 + r0
            long r2 = r2 - r4
        L2a:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L3f
            return r8
        L2f:
            r6 = 0
            goto L1a
        L32:
            r0 = 4
            if (r1 != r0) goto L3d
            long r2 = X.C158B.LIZ()
            long r0 = r4.punishmentStartTime
            long r2 = r2 - r0
            goto L2a
        L3d:
            r2 = 0
        L3f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B8.LJIIIZ():long");
    }

    public boolean LJIIJJI() {
        return (this.LJII == null || this.LJIIIIZZ == null) ? false : true;
    }

    public final void LJIILIIL() {
        this.LJI = (C11JF) C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS200S0100000_31(this, 32), new AfS189S0100000_20(this, 6));
    }

    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[stopCountDown] root=");
        sbLIZ.append(this.LJII);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        LJIILLIIL(false, false);
    }

    @Override // X.InterfaceC20478415Be
    public final void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDestroy] root=");
        sbLIZ.append(this.LJII);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ));
        LJIILL();
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        ((ArrayList) this.LJIILIIL).clear();
    }

    public String LJIIJ() {
        return this.LJFF;
    }

    public static String LJII(EnumC204738159k enumC204738159k) {
        int i = C204739159l.LIZ[enumC204738159k.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                return "";
            }
            return C497740JfY.LJIJI(2131852900);
        }
        return C497740JfY.LJIJI(2131852898);
    }

    @Override // X.C15BT
    public void LIZ(ViewGroup viewGroup) {
        if (Intrinsics.LJFF(this.LJIIIIZZ, viewGroup)) {
            return;
        }
        this.LJIIIIZZ = viewGroup;
        LIZLLL();
    }

    @Override // X.C15BT
    public final void LIZIZ(EnumC937920aVy enumC937920aVy) {
        this.LIZ = enumC937920aVy;
    }

    public final EnumC204738159k LJIIIIZZ(Integer num) {
        C15B5 c15b5 = this.LJIIZILJ;
        if (c15b5 != null) {
            return c15b5.LIZ(num);
        }
        if (num == null) {
            return null;
        }
        if (num.intValue() != 21 && num.intValue() != 22) {
            if (num.intValue() == 30) {
                return EnumC204738159k.RUNNING_STATE_WITHOUT_COUNT_DOWN;
            }
            if (num.intValue() == 40) {
                return EnumC204738159k.RUNNING_STATE_SHOW_TIME;
            }
            return EnumC204738159k.NOT_RUNNING_STATE;
        }
        return EnumC204738159k.RUNNING_STATE_WITH_COUNT_DOWN_ANIAMTION;
    }

    public static void LJIIL(C15B8 c15b8, String str) {
        c15b8.getClass();
        if (!C958370b2x.LIZJ()) {
            C20441214yg.LIZIZ(c15b8.LJIIJ(), str);
        }
    }

    public final void LJI(View view, Function1<? super View, Unit> function1) {
        if (view.getWidth() > 0 && Intrinsics.LJFF(Looper.getMainLooper().getThread(), C786410Ut5.u3())) {
            function1.invoke(view);
        } else {
            HandlerHook.viewPost(view, new ARunnableS42S0300000_9(this, view, function1, 10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILJJIL(android.view.View r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            if (r4 != 0) goto L5
            if (r5 == 0) goto L50
            goto L2f
        L5:
            if (r4 == 0) goto L2d
            int r0 = r4.getWidth()
            if (r0 == 0) goto L50
            int r0 = r4.getHeight()
            if (r0 == 0) goto L50
            int r2 = r4.getMeasuredWidth()     // Catch: java.lang.Throwable -> L39
            int r1 = r4.getMeasuredHeight()     // Catch: java.lang.Throwable -> L39
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L39
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch: java.lang.Throwable -> L39
            android.graphics.Canvas r0 = new android.graphics.Canvas     // Catch: java.lang.Throwable -> L39
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L39
            X.C842150X1x.LIZIZ(r0, r4)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L2d
            r5 = r1
            goto L2f
        L2d:
            if (r5 == 0) goto L50
        L2f:
            X.0aWx r0 = X.C01IB.LIZ()     // Catch: java.lang.Throwable -> L39
            if (r0 == 0) goto L50
            r0.LJII(r5)     // Catch: java.lang.Throwable -> L39
            return
        L39:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[realPushAuxStream] "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            LJIIL(r3, r0)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15B8.LJIILJJIL(android.view.View, android.graphics.Bitmap):void");
    }

    public final void LJIILLIIL(boolean z, boolean z2) {
        if (z) {
            C11JF c11jf = this.LJI;
            if (c11jf != null && !c11jf.isDisposed()) {
                if (z2) {
                    LJFF();
                    LJIILIIL();
                    return;
                }
                return;
            }
            LJIILIIL();
            return;
        }
        LJFF();
    }

    @Override // X.C15BT
    public final void LIZJ(GuestShowdownContent guestShowdownContent, String str, boolean z) {
        ViewGroup viewGroup = this.LJII;
        if (viewGroup == null) {
            LJIIL(this, "onReceiveGuestShowdownContent return as root is null");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveGuestShowdownContent source:");
        sbLIZ.append(str);
        sbLIZ.append(" guestShowdownContent:");
        sbLIZ.append(guestShowdownContent.playStatus);
        sbLIZ.append(" playerList:");
        sbLIZ.append(guestShowdownContent.runningPlayUsers.size());
        sbLIZ.append(" forceNew:");
        sbLIZ.append(z);
        LJIIL(this, C2188811AlT.LIZIZ(sbLIZ));
        LJI(viewGroup, new AwS8S1310000_31(this, guestShowdownContent, viewGroup, str, z, 1));
    }

    public static C20477515Av LJ(C15B8 c15b8, EnumC204738159k enumC204738159k, long j, int i) {
        boolean z;
        GuestShowdownContent guestShowdownContent;
        int measuredHeight;
        int measuredWidth;
        int measuredHeight2;
        Context context;
        int i2;
        GuestShowdownConfig guestShowdownConfig;
        C204733159f c204733159f;
        int i3;
        GuestShowdownConfig guestShowdownConfig2;
        long j2 = j;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        if ((i & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            guestShowdownContent = c15b8.LJIIIZ;
        } else {
            guestShowdownContent = null;
        }
        if (c15b8.LJIJ) {
            return null;
        }
        C20475815Ae c20475815Ae = c15b8.LIZJ;
        String str = C15BC.LIZJ;
        InterfaceC20476615Am interfaceC20476615AmLIZIZ = c20475815Ae.LIZIZ(str);
        if (interfaceC20476615AmLIZIZ != null) {
            InterfaceC20477315At interfaceC20477315AtLIZ = interfaceC20476615AmLIZIZ.LIZ();
            if ((interfaceC20477315AtLIZ instanceof C204733159f) && (c204733159f = (C204733159f) interfaceC20477315AtLIZ) != null) {
                if (c204733159f.LIZ != enumC204738159k) {
                    c204733159f.LJ = LJII(enumC204738159k);
                }
                c204733159f.LIZ = enumC204738159k;
                if (guestShowdownContent != null && (guestShowdownConfig2 = guestShowdownContent.playConfig) != null) {
                    i3 = (int) guestShowdownConfig2.duration;
                } else {
                    i3 = 0;
                }
                c204733159f.LIZIZ = i3;
                c204733159f.LJIIIZ = j2;
                c204733159f.LJIILIIL = new AwS575S0100000_31(c15b8, 1464);
            }
        } else {
            ViewGroup viewGroup = c15b8.LJII;
            if (viewGroup != null) {
                measuredHeight = viewGroup.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            float fLJJI = C497740JfY.LJJI(measuredHeight) / 117;
            float f = 15 * fLJJI;
            if (f < 13.0f) {
                f = 13.0f;
            }
            float f2 = fLJJI * 11;
            if (f2 < 10.0f) {
                f2 = 10.0f;
            }
            C20475815Ae c20475815Ae2 = c15b8.LIZJ;
            EnumC20476415Ak enumC20476415Ak = EnumC20476415Ak.LABEL;
            ViewGroup viewGroup2 = c15b8.LJII;
            if (viewGroup2 != null) {
                measuredWidth = viewGroup2.getMeasuredWidth();
            } else {
                measuredWidth = 0;
            }
            ViewGroup viewGroup3 = c15b8.LJII;
            if (viewGroup3 != null) {
                measuredHeight2 = viewGroup3.getMeasuredHeight();
            } else {
                measuredHeight2 = 0;
            }
            C20476115Ah c20476115Ah = new C20476115Ah(0, 0, measuredWidth, measuredHeight2, 0.0f, 0.0f, 0.0f, C15BN.LIZJ + 1.0f, 112);
            String strLJII = LJII(enumC204738159k);
            ViewGroup viewGroup4 = c15b8.LJII;
            if (viewGroup4 != null) {
                context = viewGroup4.getContext();
            } else {
                context = null;
            }
            int iLIZLLL = C497740JfY.LIZLLL(R.attr.exr, context);
            int i4 = (int) f;
            if (guestShowdownContent != null && (guestShowdownConfig = guestShowdownContent.playConfig) != null) {
                i2 = (int) guestShowdownConfig.duration;
            } else {
                i2 = 0;
            }
            interfaceC20476615AmLIZIZ = c20475815Ae2.LIZ(str, enumC20476415Ak, c20476115Ah, new C204733159f(enumC204738159k, i2, -1, strLJII, Integer.valueOf(iLIZLLL), Float.valueOf(f2), i4, null, j2, false, !Intrinsics.LJFF(null, Boolean.FALSE), Intrinsics.LJFF(null, Boolean.TRUE), new AwS575S0100000_31(c15b8, 1465), 264), EnumC20476715An.NORMAL);
        }
        C15BE c15be = C15BE.NONE;
        ArrayList arrayList = new ArrayList();
        arrayList.add(interfaceC20476615AmLIZIZ);
        return new C20477515Av(c15be, false, z, arrayList, null, null, 224);
    }

    public C15B8(EnumC937920aVy enumC937920aVy, DataChannel dataChannel, C20475815Ae c20475815Ae, C20476915Ap c20476915Ap, boolean z) {
        this.LIZ = enumC937920aVy;
        this.LIZIZ = dataChannel;
        this.LIZJ = c20475815Ae;
        this.LIZLLL = c20476915Ap;
        this.LJ = z;
    }
}
