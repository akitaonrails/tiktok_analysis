package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.AwS123S0400000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS429S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zy0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1916300zy0 implements InterfaceC1915180zwC {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public C1397510mTF LJ;
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(12));

    @Override // X.InterfaceC1915180zwC
    public final void LIZ() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void LIZJ(EnumC1876780ywG enumC1876780ywG) {
    }

    @Override // X.InterfaceC1915180zwC
    public final void onDismiss() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void onRejected() {
    }

    @Override // X.InterfaceC1915180zwC
    public final void LJ() {
        ((C1916250zxv) this.LJFF.getValue()).LIZ();
    }

    public final void LJFF(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LIZIZ);
        c2344009Gk.LJIIIIZZ("shoot_way", this.LIZJ);
        c2344009Gk.LJIIIIZZ("creation_id", this.LIZLLL);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC1915180zwC
    public final boolean LIZIZ(EnumC1876780ywG enumC1876780ywG, CollectConsentParam collectConsentParam) {
        return C1914950zvp.LIZ(enumC1876780ywG, collectConsentParam);
    }

    public C1916300zy0(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }

    @Override // X.InterfaceC1915180zwC
    public final void LIZLLL(Context context, CollectConsentParam collectConsentParam, C1914970zvr c1914970zvr, AwS429S0200000_28 awS429S0200000_28, AwS394S0200000_28 awS394S0200000_28, C1914980zvs c1914980zvs) {
        C1397510mTF c1397510mTF = this.LJ;
        if (c1397510mTF != null && c1397510mTF.LJIIIZ()) {
            return;
        }
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        c1397580mTM.LIZIZ(context.getString(2131833816));
        c1397580mTM.LJI(this.LIZ);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS123S0400000_28(this, c1914980zvs, collectConsentParam, context, 0));
        c1397580mTM.LJI = new InterfaceC1196790hFV() { // from class: X.0zy1
            @Override // X.InterfaceC1196790hFV
            public final void onWindowFocusChanged(boolean z) {
                C1397510mTF c1397510mTF2;
                if (!z && (c1397510mTF2 = this.LIZ.LJ) != null) {
                    c1397510mTF2.LIZIZ(null);
                }
            }
        };
        C1397720mTa.LIZ(c1397580mTM, context.getString(2131833821), new AwS394S0200000_28(this, context, 3));
        c1397580mTM.LJ(new AwS394S0200000_28(this, c1914970zvr, 4));
        c1397580mTM.LIZLLL(new AwS607S0100000_28(awS429S0200000_28, 6));
        C1397510mTF c1397510mTF2 = new C1397510mTF(c1397580mTM);
        this.LJ = c1397510mTF2;
        c1397510mTF2.LIZLLL();
    }
}
