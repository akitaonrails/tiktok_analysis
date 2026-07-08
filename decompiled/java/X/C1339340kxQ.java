package X;

import Y.ARunnableS89S0200000_20;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import tikcast.api.anchor_data.FinishEncourageDecoupling;
import tikcast.api.anchor_data.FinishEncourageLiveAchievement;
import tikcast.api.anchor_data.FinishEncourageLiveJourney;
import tikcast.api.anchor_data.FinishEncourageRanking;
import tikcast.api.anchor_data.FinishEncourageTask;
import tikcast.api.anchor_data.FinishEncourageUserInfo;

/* JADX INFO: renamed from: X.0kxQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339340kxQ implements InterfaceC1143790fs1 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1143790fs1
    public final void onFinish(boolean z) {
        switch (this.$t) {
            case 0:
                onFinish$0(this, z);
                break;
            case 1:
                onFinish$1(this, z);
                break;
            case 2:
                onFinish$2(this, z);
                break;
            case 3:
                onFinish$3(this, z);
                break;
        }
    }

    public static final void onFinish$0(C1339340kxQ c1339340kxQ, boolean z) {
        C1300730jx9 c1300730jx9;
        if (!z) {
            ((C1337280ku6) c1339340kxQ.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
            return;
        }
        final C1337280ku6 c1337280ku6 = (C1337280ku6) c1339340kxQ.l0;
        final C1295960jpS c1295960jpS = (C1295960jpS) c1339340kxQ.l1;
        c1337280ku6.getClass();
        c1295960jpS.setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.0jwy
            @Override // X.C1295710jp3
            public final String LIZIZ(String str, String str2) {
                double d;
                if (Intrinsics.LJFF(str, "nub")) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    FinishEncourageDecoupling finishEncourageDecoupling = c1337280ku6.LJIJ;
                    if (finishEncourageDecoupling != null) {
                        d = finishEncourageDecoupling.expectedScores;
                    } else {
                        d = 0.0d;
                    }
                    objArr[0] = Double.valueOf(d);
                    return C786410Ut5.k4(locale, "%.2f USD", Arrays.copyOf(objArr, 1));
                }
                return str2;
            }
        });
        try {
            View view = c1337280ku6.LIZ;
            if (view != null && view.getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            } else {
                c1300730jx9 = null;
            }
            c1295960jpS.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C1337280ku6) c1339340kxQ.l0).LJII = true;
    }

    public static final void onFinish$1(C1339340kxQ c1339340kxQ, boolean z) {
        int i;
        final String str;
        FinishEncourageUserInfo finishEncourageUserInfo;
        int i2 = 0;
        if (!z) {
            ((C1337250ku3) c1339340kxQ.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
            return;
        }
        final C1295960jpS c1295960jpS = (C1295960jpS) c1339340kxQ.l1;
        final C1337250ku3 c1337250ku3 = (C1337250ku3) c1339340kxQ.l0;
        c1295960jpS.addLottieOnCompositionLoadedListener(new InterfaceC1296230jpt() { // from class: X.0jwu
            @Override // X.InterfaceC1296230jpt
            public final void LIZ(C1294720jnS c1294720jnS) {
                C1295960jpS c1295960jpS2 = c1295960jpS;
                HandlerHook.viewPost(c1295960jpS2, new ARunnableS89S0200000_20(c1295960jpS2, c1337250ku3, 164));
            }
        });
        C1337250ku3 c1337250ku32 = (C1337250ku3) c1339340kxQ.l0;
        final C1295960jpS c1295960jpS2 = (C1295960jpS) c1339340kxQ.l1;
        FinishEncourageRanking finishEncourageRanking = c1337250ku32.LJIJ;
        if (finishEncourageRanking != null) {
            i = finishEncourageRanking.rank;
        } else {
            i = 0;
        }
        final String strValueOf = String.valueOf(i);
        C1300730jx9 c1300730jx9 = null;
        if (finishEncourageRanking == null || (finishEncourageUserInfo = finishEncourageRanking.userInfo) == null || (str = finishEncourageUserInfo.userNickName) == null) {
            str = "";
        }
        if (a0.LJJJIL(str)) {
            str = "—";
        }
        if (finishEncourageRanking != null) {
            i2 = finishEncourageRanking.score;
        }
        final String strValueOf2 = String.valueOf(i2);
        c1295960jpS2.setTextDelegate(new C1295710jp3(c1295960jpS2) { // from class: X.0jww
            @Override // X.C1295710jp3
            public final String LIZIZ(String str2, String str3) {
                if (str2 != null) {
                    int iHashCode = str2.hashCode();
                    if (iHashCode != -201069322) {
                        if (iHashCode != 78683) {
                            if (iHashCode == 273881932 && str2.equals("Final Ranking")) {
                                return strValueOf;
                            }
                            return str3;
                        }
                        if (!str2.equals("Nub")) {
                            return str3;
                        }
                        return strValueOf2;
                    }
                    if (!str2.equals("Username")) {
                        return str3;
                    }
                    return str;
                }
                return str3;
            }
        });
        try {
            View view = c1337250ku32.LIZ;
            if (view != null && view.getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            }
            c1295960jpS2.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C1337250ku3) c1339340kxQ.l0).LJII = true;
    }

    public static final void onFinish$2(C1339340kxQ c1339340kxQ, boolean z) {
        C1300730jx9 c1300730jx9;
        if (!z) {
            ((C1337270ku5) c1339340kxQ.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
            return;
        }
        final C1337270ku5 c1337270ku5 = (C1337270ku5) c1339340kxQ.l0;
        final C1295960jpS c1295960jpS = (C1295960jpS) c1339340kxQ.l1;
        c1337270ku5.getClass();
        c1295960jpS.setTextDelegate(new C1295710jp3(c1295960jpS) { // from class: X.0jx2
            @Override // X.C1295710jp3
            public final String LIZIZ(String str, String str2) {
                Integer numValueOf;
                FinishEncourageTask finishEncourageTask;
                if (Intrinsics.LJFF(str, "achievement nub")) {
                    FinishEncourageLiveAchievement finishEncourageLiveAchievement = c1337270ku5.LJIJ;
                    if (finishEncourageLiveAchievement != null && (finishEncourageTask = (FinishEncourageTask) ListProtector.get(finishEncourageLiveAchievement.taskList, 0)) != null) {
                        numValueOf = Integer.valueOf((int) finishEncourageTask.progress);
                    } else {
                        numValueOf = null;
                    }
                    return String.valueOf(numValueOf);
                }
                return str2;
            }
        });
        try {
            View view = c1337270ku5.LIZ;
            if (view != null && view.getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            } else {
                c1300730jx9 = null;
            }
            c1295960jpS.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C1337270ku5) c1339340kxQ.l0).LJII = true;
    }

    public static final void onFinish$3(C1339340kxQ c1339340kxQ, boolean z) {
        C1300730jx9 c1300730jx9;
        if (!z) {
            ((C1337290ku7) c1339340kxQ.l0).LJII = false;
            C20441214yg.LJ("WeakContainerComponent", "Failed to load LOP weak container lottie");
            return;
        }
        final C1337290ku7 c1337290ku7 = (C1337290ku7) c1339340kxQ.l0;
        final C1295960jpS c1295960jpS = (C1295960jpS) c1339340kxQ.l1;
        c1337290ku7.getClass();
        c1295960jpS.setTextDelegate(new C1295710jp3(c1337290ku7, c1295960jpS) { // from class: X.0jx1
            public final String LIZJ;

            {
                int i;
                super(c1295960jpS);
                FinishEncourageLiveJourney finishEncourageLiveJourney = c1337290ku7.LJIJ;
                if (finishEncourageLiveJourney != null) {
                    i = finishEncourageLiveJourney.level;
                } else {
                    i = 0;
                }
                this.LIZJ = String.valueOf(i);
            }

            @Override // X.C1295710jp3
            public final String LIZIZ(String str, String str2) {
                if (Intrinsics.LJFF(str2, "99")) {
                    return this.LIZJ;
                }
                if (!Intrinsics.LJFF(str2, "98")) {
                    return str2;
                }
                return String.valueOf(CastIntegerProtector.parseInt(this.LIZJ) - 1);
            }
        });
        try {
            View view = c1337290ku7.LIZ;
            if (view != null && view.getContext() != null) {
                c1300730jx9 = new C1300730jx9();
            } else {
                c1300730jx9 = null;
            }
            c1295960jpS.setFontAssetDelegate(c1300730jx9);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        ((C1337290ku7) c1339340kxQ.l0).LJII = true;
    }

    public C1339340kxQ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
