package X;

import android.content.Context;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.14iO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20340214iO implements InterfaceC20340314iP {
    public final Context LIZ;
    public C1397510mTF LIZIZ;

    public C20340214iO(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC20340314iP
    public final void LIZ(String str, String str2, AwS577S0100000_33 awS577S0100000_33, String str3, AFwS224S0000000_33 aFwS224S0000000_33, AwS577S0100000_33 awS577S0100000_332, AwS577S0100000_33 awS577S0100000_333, AwS577S0100000_33 awS577S0100000_334) {
        C1397580mTM c1397580mTM = new C1397580mTM(this.LIZ);
        c1397580mTM.LJI(str);
        C1238130iKB.LIZ(c1397580mTM, new C20339914iL(str2, str3, awS577S0100000_33, this, aFwS224S0000000_33));
        c1397580mTM.LIZJ(new AwS610S0100000_31(awS577S0100000_332, 313));
        c1397580mTM.LIZLLL(new AwS610S0100000_31(awS577S0100000_333, 314));
        c1397580mTM.LJ(new AwS610S0100000_31(awS577S0100000_334, 315));
        C1397510mTF c1397510mTF = new C1397510mTF(c1397580mTM);
        this.LIZIZ = c1397510mTF;
        c1397510mTF.LIZLLL();
    }
}
