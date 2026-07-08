package X;

import Y.ARunnableS91S0000000_12;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0UT9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0UT9 {
    public final Activity LIZ;
    public final Cert LIZIZ;
    public InterfaceC201999142b LIZJ = new InterfaceC201999142b() { // from class: X.0UTA
        @Override // X.InterfaceC201999142b
        public final void LIZ(Activity activity, InterfaceC784910Uqf interfaceC784910Uqf, String[] strArr) {
            interfaceC784910Uqf.execute();
        }
    };
    public InterfaceC201999142b LIZLLL = new C0UT8();
    public Runnable LJ = new ARunnableS91S0000000_12(3);
    public Runnable LJFF = new ARunnableS91S0000000_12(3);

    public C0UT9(Activity activity, TokenCert tokenCert) {
        this.LIZ = activity;
        this.LIZIZ = tokenCert;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.142Y] */
    public final void LIZ(C142V c142v, boolean z, String... strArr) {
        Activity activity = this.LIZ;
        if (activity != null && !activity.isFinishing()) {
            try {
                final Activity activity2 = this.LIZ;
                new Object(activity2) { // from class: X.142Y
                    public final C142T LIZ;

                    {
                        FragmentManager fragmentManager = activity2.getFragmentManager();
                        C142T c142t = (C142T) fragmentManager.findFragmentByTag("PowerPermissionsRequest");
                        if (c142t == null) {
                            c142t = new C142T();
                            fragmentManager.beginTransaction().add(c142t, "PermissionsRequest").commitAllowingStateLoss();
                            fragmentManager.executePendingTransactions();
                        }
                        this.LIZ = c142t;
                    }

                    public final void LIZ(Activity activity3, Cert cert, C142V c142v2, Runnable runnable, InterfaceC201999142b interfaceC201999142b, InterfaceC201999142b interfaceC201999142b2, Runnable runnable2, final boolean z2, String... strArr2) {
                        final C142T c142t = this.LIZ;
                        c142t.getClass();
                        C20441214yg.LIZIZ("PermissionFragment", "requestPermissions: ");
                        final C142Z c142z = new C142Z(activity3, cert, strArr2, runnable, c142v2, interfaceC201999142b, runnable2, interfaceC201999142b2);
                        String[] strArrLIZIZ = C202002142e.LIZIZ(activity3, strArr2);
                        if (strArrLIZIZ.length == 0) {
                            c142z.LIZIZ(false);
                            return;
                        }
                        c142z.LIZLLL = strArrLIZIZ;
                        String[] strArrLIZ = C202002142e.LIZ(activity3, strArr2);
                        if (z2 && strArrLIZ.length > 0) {
                            c142v2.LIZJ(strArrLIZ);
                            C201998142a c201998142a = C202001142d.LIZ;
                            c201998142a.LIZJ(strArrLIZ);
                            runnable2.run();
                            c201998142a.LIZIZ(c142z.LIZLLL);
                            return;
                        }
                        runnable.run();
                        C201998142a c201998142a2 = C202001142d.LIZ;
                        String[] strArr3 = c142z.LIZLLL;
                        c201998142a2.getClass();
                        if (strArr3 != null) {
                            for (String str : strArr3) {
                                Iterator<InterfaceC202000142c> it2 = c201998142a2.LIZ(str).iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZIZ();
                                }
                            }
                        }
                        if (C0W7I.LIZ.LIZIZ()) {
                            C142U c142u = new C142U(c142t, c142z);
                            Activity activity4 = c142z.LIZ;
                            C202001142d.LIZ.getClass();
                            c142z.LJI.LIZ(activity4, c142u, c142z.LIZJ);
                            return;
                        }
                        InterfaceC784910Uqf interfaceC784910Uqf = new InterfaceC784910Uqf() { // from class: X.142W
                            @Override // X.InterfaceC784910Uqf
                            public final void cancel() {
                                c142z.LIZ();
                                C142Z c142z2 = c142z;
                                c142z2.LJ.LJ("DENY_FROM_RATIONAL", c142z2.LIZJ);
                            }

                            @Override // X.InterfaceC784910Uqf
                            public final void execute() {
                                final C142T c142t2 = c142t;
                                final C142Z c142z2 = c142z;
                                final boolean z3 = z2;
                                c142t2.getClass();
                                String[] strArr4 = c142z2.LIZJ;
                                int iHashCode = 0;
                                if (strArr4 != null) {
                                    int length = strArr4.length;
                                    iHashCode = 1;
                                    for (int i = 0; i < length; i++) {
                                        String str2 = strArr4[i];
                                        iHashCode = ((iHashCode << 5) - iHashCode) ^ (str2 == null ? 0 : str2.hashCode());
                                    }
                                }
                                int i2 = 65535 & iHashCode;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("doRequestPermissions: requestCode = ");
                                sbLIZ.append(i2);
                                C20441214yg.LIZIZ("PermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
                                c142t2.LL.LJFF(i2, c142z2);
                                C19514711Wn.LIZLLL(c142z2.LIZ, c142z2.LIZIZ).LIZIZ(c142z2.LIZLLL).LIZJ(new InterfaceC19515111Wr() { // from class: X.142X
                                    @Override // X.InterfaceC19515111Wr
                                    public final void onCanceled() {
                                    }

                                    @Override // X.InterfaceC19515111Wr
                                    public final void LIZ(C0HWO... c0hwoArr) {
                                        String[] strArr5 = new String[c0hwoArr.length];
                                        int length2 = c0hwoArr.length;
                                        int[] iArr = new int[length2];
                                        int i3 = 0;
                                        for (C0HWO c0hwo : c0hwoArr) {
                                            strArr5[i3] = c0hwo.LIZ;
                                            if (c0hwo.LIZIZ == EnumC442280HVy.GRANTED) {
                                                iArr[i3] = 0;
                                            } else {
                                                iArr[i3] = -1;
                                            }
                                            i3++;
                                        }
                                        Activity activity5 = c142z2.LIZ;
                                        if (length2 != 0) {
                                            int i4 = 0;
                                            while (true) {
                                                if (iArr[i4] != 0) {
                                                    break;
                                                }
                                                i4++;
                                                if (i4 >= length2) {
                                                    if (!C0W7I.LIZ.LIZIZ() || C202002142e.LIZJ(activity5, strArr5)) {
                                                        c142z2.LIZIZ(true);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                        C142Z c142z3 = c142z2;
                                        String[] strArrLIZ2 = C202002142e.LIZ(c142z3.LIZ, c142z3.LIZJ);
                                        if (z3 && strArrLIZ2.length > 0) {
                                            C142Z c142z4 = c142z2;
                                            c142z4.LJ.LIZJ(strArrLIZ2);
                                            C201998142a c201998142a3 = C202001142d.LIZ;
                                            c201998142a3.LIZJ(strArrLIZ2);
                                            c142z4.LJIIIIZZ.run();
                                            c201998142a3.LIZIZ(c142z4.LIZLLL);
                                            return;
                                        }
                                        if (C202002142e.LIZLLL(c142z2.LIZ, strArr5)) {
                                            c142z2.LIZ();
                                            C142Z c142z5 = c142z2;
                                            c142z5.LJ.LJ("DENY_FROM_REQUEST_RESULT_SHOW_NEXT_TIME", c142z5.LIZJ);
                                            return;
                                        }
                                        Activity activity6 = c142z2.LIZ;
                                        if (!C142T.LIZLLL(activity6, C0W7I.LIZ.LIZ(activity6))) {
                                            Activity activity7 = c142z2.LIZ;
                                            if (!C142T.LIZLLL(activity7, C142T.LIZIZ(activity7)) && !C142T.LIZLLL(c142z2.LIZ, new Intent("android.settings.APPLICATION_SETTINGS"))) {
                                                C20441214yg.LIZIZ("PermissionFragment", "afterPermissionRequest: AppSettingIntent is not avaliable.");
                                                c142z2.LIZ();
                                                C142Z c142z6 = c142z2;
                                                c142z6.LJ.LJ("DENY_FROM_REQUEST_RESULT_ERROR", c142z6.LIZJ);
                                                return;
                                            }
                                        }
                                        C142Z c142z7 = c142z2;
                                        String[] strArrLIZIZ2 = C202002142e.LIZIZ(c142z7.LIZ, c142z7.LIZJ);
                                        C142Z c142z8 = c142z2;
                                        c142z8.LIZLLL = strArrLIZIZ2;
                                        C142T c142t3 = c142t2;
                                        c142t3.getClass();
                                        C142U c142u2 = new C142U(c142t3, c142z8);
                                        Activity activity8 = c142z8.LIZ;
                                        C202001142d.LIZ.getClass();
                                        c142z8.LJI.LIZ(activity8, c142u2, c142z8.LIZJ);
                                    }
                                });
                                C142Z c142z3 = c142z;
                                c142z3.LJ.LIZIZ(c142z3.LIZJ);
                            }
                        };
                        Activity activity5 = c142z.LIZ;
                        C202001142d.LIZ.getClass();
                        c142z.LJFF.LIZ(activity5, interfaceC784910Uqf, c142z.LIZJ);
                    }
                }.LIZ(this.LIZ, this.LIZIZ, c142v, this.LJ, this.LIZJ, this.LIZLLL, this.LJFF, z, strArr);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
