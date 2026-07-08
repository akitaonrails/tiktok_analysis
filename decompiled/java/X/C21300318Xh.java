package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.ui.DetailMediaGridContentAssem;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21300318Xh implements InterfaceC21300418Xi<C912900Zrc<?>, C1856320yPG, EnumC1779090wOh, C1562980qm8<EnumC1779090wOh>> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJII;
    public final RecyclerView LIZ;
    public final ViewGroup LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C18YT<EnumC1779090wOh> LIZLLL;
    public final C01GW<C18YJ<C912900Zrc<?>, C1856320yPG>> LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(193));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 586));
    public volatile C1807780x8y LJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21300318Xh.class, "factory", "getFactory()Lcom/ss/android/ugc/aweme/im/longpress/MovingLongPressFactory;", 0);
        C13LE.LIZ.getClass();
        LJII = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21300418Xi
    public final IMessageEventProtocol LIZ() {
        return ((InterfaceC21300418Xi) this.LJFF.getValue()).LIZ();
    }

    @Override // X.InterfaceC21300418Xi
    public final boolean isShowing() {
        return ((InterfaceC21300418Xi) this.LJFF.getValue()).isShowing();
    }

    @Override // X.InterfaceC21300418Xi
    public final boolean LIZIZ(Enum r2) {
        return ((InterfaceC21300418Xi) this.LJFF.getValue()).LIZIZ((EnumC1779090wOh) r2);
    }

    @Override // X.InterfaceC21300418Xi
    public final void LIZJ(C18YL c18yl, C912900Zrc<?> c912900Zrc, C1856320yPG c1856320yPG) {
        ((InterfaceC21300418Xi) this.LJFF.getValue()).LIZJ(c18yl, c912900Zrc, c1856320yPG);
    }

    public C21300318Xh(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, ViewGroup viewGroup, DetailMediaGridContentAssem detailMediaGridContentAssem, C1856330yPH c1856330yPH) {
        this.LIZ = viewOnAttachStateChangeListenerC20604515jv;
        this.LIZIZ = viewGroup;
        this.LIZJ = detailMediaGridContentAssem;
        this.LIZLLL = c1856330yPH;
    }
}
