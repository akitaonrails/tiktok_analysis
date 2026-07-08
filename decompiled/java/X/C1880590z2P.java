package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z2P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880590z2P extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ GameProfileIntroCard LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ Fragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880590z2P(GameProfileIntroCard gameProfileIntroCard, C013C c013c, Fragment fragment) {
        super(1);
        this.LL = gameProfileIntroCard;
        this.LLILLJJLI = c013c;
        this.LLILLL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        bool.booleanValue();
        C197039127h c197039127h = this.LL.LLJJIJIL;
        if (c197039127h != null) {
            c197039127h.setLoading(false);
        }
        C1880690z2Z c1880690z2Z = new C1880690z2Z(this.LLILLL, this.LL);
        if (this.LLILLJJLI.element) {
            this.LL.LLJJL = c1880690z2Z;
        } else {
            this.LL.LLJJL = null;
            c1880690z2Z.invoke();
        }
        return Unit.LIZ;
    }
}
