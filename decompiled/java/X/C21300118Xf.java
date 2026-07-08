package X;

import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.im.messagelist.api.ability.IMessageEventProtocol;
import com.ss.android.ugc.tools.chat.message.component.AiChatMessageFeatureComponent;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18Xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21300118Xf implements InterfaceC21300418Xi<C912900Zrc<?>, C1856320yPG, C18VB, C1562980qm8<C18VB>> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJI;
    public final RecyclerView LIZ;
    public final ViewGroup LIZIZ;
    public final LifecycleOwner LIZJ;
    public final C01GW<C18YJ<C912900Zrc<?>, C1856320yPG>> LIZLLL = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(141));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 464));
    public volatile C1807780x8y LJFF;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21300118Xf.class, "factory", "getFactory()Lcom/ss/android/ugc/aweme/im/longpress/MovingLongPressFactory;", 0);
        C13LE.LIZ.getClass();
        LJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC21300418Xi
    public final IMessageEventProtocol LIZ() {
        return ((InterfaceC21300418Xi) this.LJ.getValue()).LIZ();
    }

    @Override // X.InterfaceC21300418Xi
    public final boolean isShowing() {
        return ((InterfaceC21300418Xi) this.LJ.getValue()).isShowing();
    }

    @Override // X.InterfaceC21300418Xi
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public final boolean LIZIZ(C18VB c18vb) {
        return ((InterfaceC21300418Xi) this.LJ.getValue()).LIZIZ(c18vb);
    }

    public C21300118Xf(RecyclerView recyclerView, ViewGroup viewGroup, AiChatMessageFeatureComponent aiChatMessageFeatureComponent) {
        this.LIZ = recyclerView;
        this.LIZIZ = viewGroup;
        this.LIZJ = aiChatMessageFeatureComponent;
    }

    @Override // X.InterfaceC21300418Xi
    public final void LIZJ(C18YL c18yl, C912900Zrc<?> c912900Zrc, C1856320yPG c1856320yPG) {
        ((InterfaceC21300418Xi) this.LJ.getValue()).LIZJ(c18yl, c912900Zrc, c1856320yPG);
    }
}
