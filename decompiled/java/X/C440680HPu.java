package X;

import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.framework.MixStudioBaseFragment;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HPu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440680HPu extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ MixStudioBaseFragment LL;
    public final /* synthetic */ EnumC440890HQp LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Emoji LLILZ;
    public final /* synthetic */ MixStudioLauncher.ImageWithPromptPrefill LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ MixStudioLauncher.PushInfo LLIZ;
    public final /* synthetic */ Boolean LLIZLLLIL;
    public final /* synthetic */ EnumC441640HTm LLJ;
    public final /* synthetic */ FriendsIDInfo LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ MixStudioLauncher.IdAndElementConfiguration LLJILJIL;
    public final /* synthetic */ MixStudioLauncher.GenerationConfiguration LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C440680HPu(MixStudioBaseFragment mixStudioBaseFragment, EnumC440890HQp enumC440890HQp, String str, Emoji emoji, MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill, String str2, MixStudioLauncher.PushInfo pushInfo, Boolean bool, EnumC441640HTm enumC441640HTm, FriendsIDInfo friendsIDInfo, String str3, MixStudioLauncher.IdAndElementConfiguration idAndElementConfiguration, MixStudioLauncher.GenerationConfiguration generationConfiguration) {
        super(1);
        this.LL = mixStudioBaseFragment;
        this.LLILLJJLI = enumC440890HQp;
        this.LLILLL = str;
        this.LLILZ = emoji;
        this.LLILZIL = imageWithPromptPrefill;
        this.LLILZLL = str2;
        this.LLIZ = pushInfo;
        this.LLIZLLLIL = bool;
        this.LLJ = enumC441640HTm;
        this.LLJI = friendsIDInfo;
        this.LLJIJIL = str3;
        this.LLJILJIL = idAndElementConfiguration;
        this.LLJILJILJ = generationConfiguration;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        assembler.DQ2(this.LL, new C440610HPn(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ));
        return Unit.LIZ;
    }
}
