package X;

import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124810fNP {
    public final C1124780fNM LIZ;
    public String LJ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(178));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(180));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(179));
    public C09AY LJFF = AFwS205S0000000_17.get$arr$(181);

    public C1124810fNP(C1124780fNM c1124780fNM) {
        this.LIZ = c1124780fNM;
    }

    public final void LIZ(String str) {
        C16F5 giftDescriptionTv$livegift_impl_release = this.LIZ.getGiftDescriptionTv$livegift_impl_release();
        if (!Intrinsics.LJFF(giftDescriptionTv$livegift_impl_release.getText(), str)) {
            giftDescriptionTv$livegift_impl_release.setText(str);
            C1118060fCW.LIZ(giftDescriptionTv$livegift_impl_release);
        }
    }
}
