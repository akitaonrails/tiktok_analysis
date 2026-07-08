package X;

import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.Emoji;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.FriendsIDInfo;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioLauncher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HPc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C440500HPc implements InterfaceC111300bX {
    public final EnumC440890HQp LL;
    public String LLILLJJLI;
    public Emoji LLILLL;
    public MixStudioLauncher.ImageWithPromptPrefill LLILZ;
    public final String LLILZIL;
    public final MixStudioLauncher.PushInfo LLILZLL;
    public final Boolean LLIZ;
    public final EnumC441640HTm LLIZLLLIL;
    public final FriendsIDInfo LLJ;
    public final String LLJI;
    public final MixStudioLauncher.IdAndElementConfiguration LLJIJIL;
    public final MixStudioLauncher.GenerationConfiguration LLJILJIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C440500HPc)) {
            return false;
        }
        C440500HPc c440500HPc = (C440500HPc) obj;
        return this.LL == c440500HPc.LL && Intrinsics.LJFF(this.LLILLJJLI, c440500HPc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c440500HPc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c440500HPc.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c440500HPc.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c440500HPc.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c440500HPc.LLIZ) && this.LLIZLLLIL == c440500HPc.LLIZLLLIL && Intrinsics.LJFF(this.LLJ, c440500HPc.LLJ) && Intrinsics.LJFF(this.LLJI, c440500HPc.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c440500HPc.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c440500HPc.LLJILJIL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Emoji emoji = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (emoji == null ? 0 : emoji.hashCode())) * 31;
        MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill = this.LLILZ;
        int iHashCode4 = (((iHashCode3 + (imageWithPromptPrefill == null ? 0 : imageWithPromptPrefill.hashCode())) * 31) + this.LLILZIL.hashCode()) * 31;
        MixStudioLauncher.PushInfo pushInfo = this.LLILZLL;
        int iHashCode5 = (iHashCode4 + (pushInfo == null ? 0 : pushInfo.hashCode())) * 31;
        Boolean bool = this.LLIZ;
        int iHashCode6 = (((iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + this.LLIZLLLIL.hashCode()) * 31;
        FriendsIDInfo friendsIDInfo = this.LLJ;
        return ((((((iHashCode6 + (friendsIDInfo != null ? friendsIDInfo.hashCode() : 0)) * 31) + this.LLJI.hashCode()) * 31) + this.LLJIJIL.hashCode()) * 31) + this.LLJILJIL.hashCode();
    }

    public final String toString() {
        return "MixStudioBaseData(initialPage=" + this.LL + ", textPrompt=" + this.LLILLJJLI + ", emojiPrompt=" + this.LLILLL + ", imagePrompt=" + this.LLILZ + ", stickerVMKey=" + this.LLILZIL + ", pushInfo=" + this.LLILZLL + ", isAnimated=" + this.LLIZ + ", enterFrom=" + this.LLIZLLLIL + ", friendsIDInfo=" + this.LLJ + ", mobEnterFrom=" + this.LLJI + ", idAndElementConfiguration=" + this.LLJIJIL + ", generationConfiguration=" + this.LLJILJIL + ')';
    }

    public C440500HPc(EnumC440890HQp enumC440890HQp, String str, Emoji emoji, MixStudioLauncher.ImageWithPromptPrefill imageWithPromptPrefill, String str2, MixStudioLauncher.PushInfo pushInfo, Boolean bool, EnumC441640HTm enumC441640HTm, FriendsIDInfo friendsIDInfo, String str3, MixStudioLauncher.IdAndElementConfiguration idAndElementConfiguration, MixStudioLauncher.GenerationConfiguration generationConfiguration) {
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
}
