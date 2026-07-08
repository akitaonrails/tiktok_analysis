package X;

import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsComposeRvmpFragment;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.SettingsRvmpComposeViewModel;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.account.AccountGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.banner.SettingsBannerVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.cache.CacheGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.ContentGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.InteractionsGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.privacy.VisibilityGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.support.SupportGroupVM;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.top.TopGroupVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1A3C, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3C extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ SettingsComposeRvmpFragment LL;
    public final /* synthetic */ SettingsRvmpComposeViewModel LLILLJJLI;
    public final /* synthetic */ SettingsBannerVM LLILLL;
    public final /* synthetic */ TopGroupVM LLILZ;
    public final /* synthetic */ AccountGroupVM LLILZIL;
    public final /* synthetic */ VisibilityGroupVM LLILZLL;
    public final /* synthetic */ InteractionsGroupVM LLIZ;
    public final /* synthetic */ CacheGroupVM LLIZLLLIL;
    public final /* synthetic */ ContentGroupVM LLJ;
    public final /* synthetic */ SupportGroupVM LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A3C(SettingsComposeRvmpFragment settingsComposeRvmpFragment, SettingsRvmpComposeViewModel settingsRvmpComposeViewModel, SettingsBannerVM settingsBannerVM, TopGroupVM topGroupVM, AccountGroupVM accountGroupVM, VisibilityGroupVM visibilityGroupVM, InteractionsGroupVM interactionsGroupVM, CacheGroupVM cacheGroupVM, ContentGroupVM contentGroupVM, SupportGroupVM supportGroupVM, int i) {
        super(2);
        this.LL = settingsComposeRvmpFragment;
        this.LLILLJJLI = settingsRvmpComposeViewModel;
        this.LLILLL = settingsBannerVM;
        this.LLILZ = topGroupVM;
        this.LLILZIL = accountGroupVM;
        this.LLILZLL = visibilityGroupVM;
        this.LLIZ = interactionsGroupVM;
        this.LLIZLLLIL = cacheGroupVM;
        this.LLJ = contentGroupVM;
        this.LLJI = supportGroupVM;
        this.LLJIJIL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        num.intValue();
        this.LL.SR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1680500tpg, C341440Da2.LIZ(this.LLJIJIL | 1));
        return Unit.LIZ;
    }
}
