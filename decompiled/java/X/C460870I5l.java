package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.ss.android.ugc.aweme.im.messagelist.api.IAwemeStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS546S0100000_2;

/* JADX INFO: renamed from: X.0I5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460870I5l extends C09AY implements Function2<UIContentAssem, ViewOnAttachStateChangeListenerC20604515jv, Unit> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LL;
    public static final C460870I5l LLILLJJLI;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C0ZZ5.class, "awemeStatusVM", "<v#8>", 1);
        C13LE.LIZ.getClass();
        LL = new InterfaceC2217461Bqa[]{c2217401BqU};
        LLILLJJLI = new C460870I5l();
    }

    public C460870I5l() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIContentAssem uIContentAssem, ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        UIContentAssem uIContentAssem2 = uIContentAssem;
        C019F c019f = C019F.LIZ;
        AFwS192S0000000_6 aFwS192S0000000_6 = AFwS192S0000000_6.get$arr$(83);
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(IAwemeStatusViewModel.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIContentAssem2), null, null, new C460860I5k(C724750Sbp.LIZ(uIContentAssem2, C724750Sbp.LJIIJ(uIContentAssem2, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 133), AFwS236S0000000_6.get$arr$(121), aFwS192S0000000_6, true), C1509305vX.LIZ(new AwS546S0100000_2(uIContentAssem2, 447)), null), 3);
        return Unit.LIZ;
    }
}
