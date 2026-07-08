package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.avatar.LandscapeAvatarAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedViewPagerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SY0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SY0 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ LandscapeAvatarAssem LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C737030Svd LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ User LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SY0(LandscapeAvatarAssem landscapeAvatarAssem, Aweme aweme, String str, int i, C737030Svd c737030Svd, String str2, User user, int i2) {
        super(0);
        this.LL = landscapeAvatarAssem;
        this.LLILLJJLI = aweme;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = c737030Svd;
        this.LLILZLL = str2;
        this.LLIZ = user;
        this.LLIZLLLIL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.Jp(this.LLILLJJLI, this.LLILLL, true, this.LLILZ, this.LLILZIL);
        C0SY1 c0sy1 = (C0SY1) this.LL.LLLIL.getValue();
        C0OVM c0ovm = new C0OVM();
        c0ovm.LIZJ(this.LLILLL);
        c0ovm.LIZIZ(this.LLILZLL);
        boolean z = this.LLIZ.isSecret() || this.LLIZ.isPrivateAccount();
        C1252380ihA c1252380ihA = c0ovm.LIZ;
        c1252380ihA.LJIILIIL = z;
        c1252380ihA.LIZLLL = 1;
        c0ovm.LIZ.LJI = this.LL.getEventType();
        LandscapeFeedViewPagerAbility landscapeFeedViewPagerAbility = (LandscapeFeedViewPagerAbility) this.LL.LLLIIII.getValue();
        String strLIZJ = C729980SkG.LIZJ(landscapeFeedViewPagerAbility != null ? landscapeFeedViewPagerAbility.LLLLLJLJLL() : null);
        C1252380ihA c1252380ihA2 = c0ovm.LIZ;
        c1252380ihA2.LJII = strLIZJ;
        c1252380ihA2.LJIIIIZZ = this.LLILLJJLI;
        c1252380ihA2.LJIIIZ = this.LLILZIL.LIZLLL;
        c0ovm.LIZ.LJFF = TextUtils.equals(this.LL.getEventType(), "homepage_hot") ? -1 : C735820Stg.LIZ(this.LL.getEventType());
        int iLIZIZ = C735820Stg.LIZIZ(this.LLILLJJLI, this.LL.getEventType());
        C1252380ihA c1252380ihA3 = c0ovm.LIZ;
        c1252380ihA3.LJ = iLIZIZ;
        c1252380ihA3.LJIIJJI = this.LLIZLLLIL;
        c0ovm.LIZ.LJIILLIIL = this.LLIZ.getAccurateRecType();
        c0sy1.LJ(c0ovm.LIZ());
        return Unit.LIZ;
    }
}
