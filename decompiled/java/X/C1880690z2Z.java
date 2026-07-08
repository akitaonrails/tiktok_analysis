package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.card.gameintro.GameProfileIntroCard;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0z2Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1880690z2Z extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ GameProfileIntroCard LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1880690z2Z(Fragment fragment, GameProfileIntroCard gameProfileIntroCard) {
        super(0);
        this.LL = fragment;
        this.LLILLJJLI = gameProfileIntroCard;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJFF(R.raw.icon_x_mark_circle_fill);
        c1389890mGx.LJII(R.attr.c9i);
        c1389890mGx.LJIIIZ(2131855694);
        c1389890mGx.LJIIJJI();
        C1880070z1Z.LJIIIZ(this.LLILLJJLI.LLILLL, "toast");
        return Unit.LIZ;
    }
}
