package X;

import android.os.Bundle;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mcd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572370Mcd extends C0MMK {
    public final Comment LLILLL;
    public final Aweme LLILZ;
    public final boolean LLILZIL;
    public final String LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;
    public final String LLJ;
    public final String LLJI;
    public final Bundle LLJIJIL;
    public final Bundle LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public final boolean LLJJ;
    public final String LLJJI;
    public final Boolean LLJJIII;
    public final Boolean LLJJIJI;
    public final Bundle LLJJIJIIJIL;
    public final String LLJJIJIL;
    public final String LLJJJ;
    public final boolean LLJJJIL;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public C572370Mcd() {
        boolean z = false;
        this(null, 0 == true ? 1 : 0, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, z, z, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, z, 1048575, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ C572370Mcd copy$default(C572370Mcd c572370Mcd, Comment comment, Aweme aweme, boolean z, String str, String str2, String str3, String str4, String str5, Bundle bundle, Bundle bundle2, boolean z2, boolean z3, boolean z4, String str6, Boolean bool, Boolean bool2, Bundle bundle3, String str7, String str8, boolean z5, int i, Object obj) {
        String str9 = str4;
        String str10 = str3;
        String str11 = str2;
        String str12 = str;
        boolean z6 = z;
        Aweme aweme2 = aweme;
        Comment comment2 = comment;
        String str13 = str6;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        Bundle bundle4 = bundle2;
        Bundle bundle5 = bundle;
        String str14 = str5;
        String str15 = str8;
        String str16 = str7;
        Bundle bundle6 = bundle3;
        Boolean bool3 = bool2;
        boolean z10 = z5;
        Boolean bool4 = bool;
        if ((i & 1) != 0) {
            comment2 = c572370Mcd.LLILLL;
        }
        if ((i & 2) != 0) {
            aweme2 = c572370Mcd.LLILZ;
        }
        if ((i & 4) != 0) {
            z6 = c572370Mcd.LLILZIL;
        }
        if ((i & 8) != 0) {
            str12 = c572370Mcd.LLILZLL;
        }
        if ((i & 16) != 0) {
            str11 = c572370Mcd.LLIZ;
        }
        if ((i & 32) != 0) {
            str10 = c572370Mcd.LLIZLLLIL;
        }
        if ((i & 64) != 0) {
            str9 = c572370Mcd.LLJ;
        }
        if ((i & 128) != 0) {
            str14 = c572370Mcd.LLJI;
        }
        if ((i & 256) != 0) {
            bundle5 = c572370Mcd.LLJIJIL;
        }
        if ((i & 512) != 0) {
            bundle4 = c572370Mcd.LLJILJIL;
        }
        if ((i & 1024) != 0) {
            z9 = c572370Mcd.LLJILJILJ;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z8 = c572370Mcd.LLJILLL;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            z7 = c572370Mcd.LLJJ;
        }
        if ((i & 8192) != 0) {
            str13 = c572370Mcd.LLJJI;
        }
        if ((i & 16384) != 0) {
            bool4 = c572370Mcd.LLJJIII;
        }
        if ((32768 & i) != 0) {
            bool3 = c572370Mcd.LLJJIJI;
        }
        if ((65536 & i) != 0) {
            bundle6 = c572370Mcd.LLJJIJIIJIL;
        }
        if ((131072 & i) != 0) {
            str16 = c572370Mcd.LLJJIJIL;
        }
        if ((262144 & i) != 0) {
            str15 = c572370Mcd.LLJJJ;
        }
        if ((i & 524288) != 0) {
            z10 = c572370Mcd.LLJJJIL;
        }
        return c572370Mcd.copy(comment2, aweme2, z6, str12, str11, str10, str9, str14, bundle5, bundle4, z9, z8, z7, str13, bool4, bool3, bundle6, str16, str15, z10);
    }

    public final C572370Mcd copy(Comment comment, Aweme aweme, boolean z, String str, String str2, String str3, String str4, String str5, Bundle bundle, Bundle bundle2, boolean z2, boolean z3, boolean z4, String str6, Boolean bool, Boolean bool2, Bundle bundle3, String str7, String str8, boolean z5) {
        return new C572370Mcd(comment, aweme, z, str, str2, str3, str4, str5, bundle, bundle2, z2, z3, z4, str6, bool, bool2, bundle3, str7, str8, z5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C572370Mcd)) {
            return false;
        }
        C572370Mcd c572370Mcd = (C572370Mcd) obj;
        return Intrinsics.LJFF(this.LLILLL, c572370Mcd.LLILLL) && Intrinsics.LJFF(this.LLILZ, c572370Mcd.LLILZ) && this.LLILZIL == c572370Mcd.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c572370Mcd.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c572370Mcd.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c572370Mcd.LLIZLLLIL) && Intrinsics.LJFF(this.LLJ, c572370Mcd.LLJ) && Intrinsics.LJFF(this.LLJI, c572370Mcd.LLJI) && Intrinsics.LJFF(this.LLJIJIL, c572370Mcd.LLJIJIL) && Intrinsics.LJFF(this.LLJILJIL, c572370Mcd.LLJILJIL) && this.LLJILJILJ == c572370Mcd.LLJILJILJ && this.LLJILLL == c572370Mcd.LLJILLL && this.LLJJ == c572370Mcd.LLJJ && Intrinsics.LJFF(this.LLJJI, c572370Mcd.LLJJI) && Intrinsics.LJFF(this.LLJJIII, c572370Mcd.LLJJIII) && Intrinsics.LJFF(this.LLJJIJI, c572370Mcd.LLJJIJI) && Intrinsics.LJFF(this.LLJJIJIIJIL, c572370Mcd.LLJJIJIIJIL) && Intrinsics.LJFF(this.LLJJIJIL, c572370Mcd.LLJJIJIL) && Intrinsics.LJFF(this.LLJJJ, c572370Mcd.LLJJJ) && this.LLJJJIL == c572370Mcd.LLJJJIL;
    }

    public int hashCode() {
        Comment comment = this.LLILLL;
        int iHashCode = (comment == null ? 0 : comment.hashCode()) * 31;
        Aweme aweme = this.LLILZ;
        int iHashCode2 = (((((iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31) + this.LLILZLL.hashCode()) * 31;
        String str = this.LLIZ;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LLIZLLLIL;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LLJ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LLJI;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Bundle bundle = this.LLJIJIL;
        int iHashCode7 = (iHashCode6 + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Bundle bundle2 = this.LLJILJIL;
        int iHashCode8 = (((((((((iHashCode7 + (bundle2 == null ? 0 : bundle2.hashCode())) * 31) + C786410Ut5.Z2(this.LLJILJILJ)) * 31) + C786410Ut5.Z2(this.LLJILLL)) * 31) + C786410Ut5.Z2(this.LLJJ)) * 31) + this.LLJJI.hashCode()) * 31;
        Boolean bool = this.LLJJIII;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.LLJJIJI;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Bundle bundle3 = this.LLJJIJIIJIL;
        int iHashCode11 = (iHashCode10 + (bundle3 == null ? 0 : bundle3.hashCode())) * 31;
        String str5 = this.LLJJIJIL;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LLJJJ;
        return ((iHashCode12 + (str6 != null ? str6.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJJJIL);
    }

    public String toString() {
        return "TextImageConfig(commentInfo=" + this.LLILLL + ", awemeInfo=" + this.LLILZ + ", autoSaveDraft=" + this.LLILZIL + ", creationId=" + this.LLILZLL + ", entrance=" + this.LLIZ + ", inputText=" + this.LLIZLLLIL + ", shootWay=" + this.LLJ + ", enterFrom=" + this.LLJI + ", etParams=" + this.LLJIJIL + ", extraParams=" + this.LLJILJIL + ", directToChoose=" + this.LLJILJILJ + ", enableStory=" + this.LLJILLL + ", transTextToDesc=" + this.LLJJ + ", textToImageEditTitle=" + this.LLJJI + ", landingBack=" + this.LLJJIII + ", backByClearTop=" + this.LLJJIJI + ", backBundle=" + this.LLJJIJIIJIL + ", backUrl=" + this.LLJJIJIL + ", searchQuery=" + this.LLJJJ + ", isAi=" + this.LLJJJIL + ')';
    }

    public final boolean getAutoSaveDraft() {
        return this.LLILZIL;
    }

    public final Aweme getAwemeInfo() {
        return this.LLILZ;
    }

    public final Bundle getBackBundle() {
        return this.LLJJIJIIJIL;
    }

    public final Boolean getBackByClearTop() {
        return this.LLJJIJI;
    }

    public final String getBackUrl() {
        return this.LLJJIJIL;
    }

    public final Comment getCommentInfo() {
        return this.LLILLL;
    }

    public final String getCreationId() {
        return this.LLILZLL;
    }

    public final boolean getDirectToChoose() {
        return this.LLJILJILJ;
    }

    public final boolean getEnableStory() {
        return this.LLJILLL;
    }

    public final String getEnterFrom() {
        return this.LLJI;
    }

    public final String getEntrance() {
        return this.LLIZ;
    }

    public final Bundle getEtParams() {
        return this.LLJIJIL;
    }

    public final Bundle getExtraParams() {
        return this.LLJILJIL;
    }

    public final String getInputText() {
        return this.LLIZLLLIL;
    }

    public final Boolean getLandingBack() {
        return this.LLJJIII;
    }

    public final String getSearchQuery() {
        return this.LLJJJ;
    }

    public final String getShootWay() {
        return this.LLJ;
    }

    public final String getTextToImageEditTitle() {
        return this.LLJJI;
    }

    public final boolean getTransTextToDesc() {
        return this.LLJJ;
    }

    public final boolean isAi() {
        return this.LLJJJIL;
    }

    public C572370Mcd(Comment comment, Aweme aweme, boolean z, String str, String str2, String str3, String str4, String str5, Bundle bundle, Bundle bundle2, boolean z2, boolean z3, boolean z4, String str6, Boolean bool, Boolean bool2, Bundle bundle3, String str7, String str8, boolean z5) {
        super(null, null, null);
        this.LLILLL = comment;
        this.LLILZ = aweme;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = bundle;
        this.LLJILJIL = bundle2;
        this.LLJILJILJ = z2;
        this.LLJILLL = z3;
        this.LLJJ = z4;
        this.LLJJI = str6;
        this.LLJJIII = bool;
        this.LLJJIJI = bool2;
        this.LLJJIJIIJIL = bundle3;
        this.LLJJIJIL = str7;
        this.LLJJJ = str8;
        this.LLJJJIL = z5;
    }

    public /* synthetic */ C572370Mcd(Comment comment, Aweme aweme, boolean z, String str, String str2, String str3, String str4, String str5, Bundle bundle, Bundle bundle2, boolean z2, boolean z3, boolean z4, String str6, Boolean bool, Boolean bool2, Bundle bundle3, String str7, String str8, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : comment, (i & 2) != 0 ? null : aweme, (i & 4) != 0 ? true : z, (i & 8) != 0 ? UUID.randomUUID().toString() : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : bundle, (i & 512) != 0 ? null : bundle2, (i & 1024) != 0 ? false : z2, (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) == 0 ? z3 : true, (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z4, (i & 8192) != 0 ? "" : str6, (i & 16384) != 0 ? null : bool, (32768 & i) != 0 ? null : bool2, (65536 & i) != 0 ? null : bundle3, (131072 & i) != 0 ? null : str7, (262144 & i) != 0 ? null : str8, (i & 524288) != 0 ? false : z5);
    }
}
