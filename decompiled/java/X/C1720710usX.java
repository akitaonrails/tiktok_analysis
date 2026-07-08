package X;

import androidx.fragment.app.Fragment;
import com.bytedance.pipo.stellar.base.adapter.StellarCardAdapter;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0usX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720710usX implements InterfaceC1720700usW {
    public final InterfaceC1720700usW LL;
    public final ViewOnAttachStateChangeListenerC20604515jv LLILLJJLI;
    public List<? extends InterfaceC1720550usH> LLILLL;

    @Override // X.InterfaceC1720700usW
    public final void Hw0(Long l, String str, Long l2, Long l3) {
        this.LL.Hw0(l, str, l2, l3);
    }

    @Override // X.InterfaceC1720700usW
    public final void KH2(InterfaceC1720550usH interfaceC1720550usH, long j, long j2, long j3, Long l) {
        this.LL.KH2(interfaceC1720550usH, j, j2, j3, l);
    }

    @Override // X.InterfaceC1720700usW
    public final C1720760usc Ka1() {
        return this.LL.Ka1();
    }

    @Override // X.InterfaceC1720700usW
    public final String Qw() {
        return this.LL.Qw();
    }

    @Override // X.InterfaceC1720700usW
    public final void We0(String str, Boolean bool, String str2, Long l, Boolean bool2, String str3) {
        this.LL.We0(str, bool, str2, l, bool2, str3);
    }

    @Override // X.InterfaceC1720700usW
    public final Map<String, String> Ye0() {
        return this.LL.Ye0();
    }

    @Override // X.InterfaceC1720700usW
    public final void ZN1(String str, String str2, Map<String, ? extends Object> map) {
        this.LL.ZN1(str, str2, map);
    }

    @Override // X.InterfaceC1720050urT
    public final void bL(StellarActionDO stellarActionDO, C1720250urn c1720250urn, Fragment fragment) {
        this.LL.bL(stellarActionDO, c1720250urn, fragment);
    }

    @Override // X.InterfaceC1720700usW
    public final StellarCardAdapter<InterfaceC1720550usH> is2(String str) {
        return this.LL.is2(str);
    }

    @Override // X.InterfaceC1720700usW
    public final C1716280ulO xK() {
        return this.LL.xK();
    }

    public C1720710usX(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, InterfaceC1720700usW interfaceC1720700usW) {
        this.LL = interfaceC1720700usW;
        this.LLILLJJLI = viewOnAttachStateChangeListenerC20604515jv;
    }
}
