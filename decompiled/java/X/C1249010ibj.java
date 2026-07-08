package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.navbar.assemble.ProfileNavBarRootComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS103S1200000_19;
import kotlin.jvm.internal.AwS21S1201000_19;

/* JADX INFO: renamed from: X.0ibj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1249010ibj extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ ProfileNavBarRootComponent LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ ProfileComponents LLILZ;
    public final /* synthetic */ C1248930ibb LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1249010ibj(ProfileNavBarRootComponent profileNavBarRootComponent, String str, int i, ProfileComponents profileComponents, C1248930ibb c1248930ibb) {
        super(1);
        this.LL = profileNavBarRootComponent;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = profileComponents;
        this.LLILZIL = c1248930ibb;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        Assembler assembler2 = assembler;
        if (this.LL.LLJILJIL.containsKey(this.LLILLJJLI)) {
            this.LL.Zo(this.LLILLL, this.LLILZ, this.LLILLJJLI);
        } else {
            ProfileNavBarRootComponent profileNavBarRootComponent = this.LL;
            assembler2.EQ2(profileNavBarRootComponent, new AwS21S1201000_19(this.LLILLL, this.LLILZ, profileNavBarRootComponent, this.LLILLJJLI, 1));
            ProfileNavBarRootComponent profileNavBarRootComponent2 = this.LL;
            assembler2.QQ2(profileNavBarRootComponent2, new AwS103S1200000_19(this.LLILZIL, this.LLILLJJLI, profileNavBarRootComponent2, 9));
            this.LL.LLJILJIL.put(this.LLILLJJLI, this.LLILZIL.LIZ);
        }
        return Unit.LIZ;
    }
}
