package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.homepage.MixStudioHomePageAssem;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0HOI, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HOI extends C09AY implements InterfaceC1631620sYq<UIAssem, InterfaceC440230HOb<? extends List<? extends C440440HOw>>, C0HOC, Unit> {
    public final /* synthetic */ MixStudioHomePageAssem LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C013C LLILZ;
    public final /* synthetic */ C013C LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HOI(MixStudioHomePageAssem mixStudioHomePageAssem, C013C c013c, C013C c013c2, C013C c013c3, C013C c013c4) {
        super(3);
        this.LL = mixStudioHomePageAssem;
        this.LLILLJJLI = c013c;
        this.LLILLL = c013c2;
        this.LLILZ = c013c3;
        this.LLILZIL = c013c4;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(UIAssem uIAssem, InterfaceC440230HOb<? extends List<? extends C440440HOw>> interfaceC440230HOb, C0HOC c0hoc) {
        InterfaceC440090HNn interfaceC440090HNn;
        UIAssem uIAssem2 = uIAssem;
        InterfaceC440230HOb<? extends List<? extends C440440HOw>> interfaceC440230HOb2 = interfaceC440230HOb;
        C0HOC c0hoc2 = c0hoc;
        if ((!(interfaceC440230HOb2 instanceof C05Z8)) && interfaceC440230HOb2 != null) {
            if (c0hoc2 != null) {
                interfaceC440090HNn = c0hoc2.LIZ;
            } else {
                interfaceC440090HNn = null;
            }
            AnonymousClass0956 anonymousClass0956 = this.LL.LLLLZ;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            this.LL.LLLLZ = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(uIAssem2), null, null, new C0HOH(interfaceC440230HOb2, this.LLILLJJLI, this.LL, c0hoc2, interfaceC440090HNn, this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
        }
        return Unit.LIZ;
    }
}
