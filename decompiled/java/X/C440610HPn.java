package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440610HPn extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ EnumC440890HQp LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Emoji LLILLL;
    public final /* synthetic */ MixStudioLauncher.ImageWithPromptPrefill LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ MixStudioLauncher.PushInfo LLILZLL;
    public final /* synthetic */ Boolean LLIZ;
    public final /* synthetic */ EnumC441640HTm LLIZLLLIL;
    public final /* synthetic */ FriendsIDInfo LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ MixStudioLauncher.IdAndElementConfiguration LLJIJIL;
    public final /* synthetic */ MixStudioLauncher.GenerationConfiguration LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440610HPn(EnumC440890HQp enumC440890HQp, String str, Emoji emoji, MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill, String str2, MixStudioLauncher.PushInfo pushInfo, Boolean bool, EnumC441640HTm enumC441640HTm, FriendsIDInfo friendsIDInfo, String str3, MixStudioLauncher.IdAndElementConfiguration idAndElementConfiguration, MixStudioLauncher.GenerationConfiguration generationConfiguration) {
        super(1);
        this.LL = enumC440890HQp;
        this.LLILLJJLI = str;
        this.LLILLL = emoji;
        this.LLILZ = imageWithPromptPrefill;
        this.LLILZIL = str2;
        this.LLILZLL = pushInfo;
        this.LLIZ = bool;
        this.LLIZLLLIL = enumC441640HTm;
        this.LLJ = friendsIDInfo;
        this.LLJI = str3;
        this.LLJIJIL = idAndElementConfiguration;
        this.LLJILJIL = generationConfiguration;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        C062P<InterfaceC111300bX> c062p2 = c062p;
        c062p2.LIZ = new C440500HPc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL);
        c062p2.LIZJ = C13LE.LIZ(C440500HPc.class);
        return Unit.LIZ;
    }
}
