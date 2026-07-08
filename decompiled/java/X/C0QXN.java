package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0QXN, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QXN implements Serializable {
    public final boolean isNewUser;
    public final String landingPageBgUrl;
    public final C0QLP landingPageSearchBarStyle;
    public boolean landingToNewUserPage;
    public String restoreSingleTabType;
    public final String resultChannel;
    public final String resultSource;
    public final EnumC669620QOi singleTabType;

    public final boolean isNewUser() {
        return this.isNewUser;
    }

    public final void setLandingToNewUserPage(boolean z) {
        this.landingToNewUserPage = z;
    }

    public final void setRestoreSingleTabType(String str) {
        this.restoreSingleTabType = str;
    }

    public C0QXN(boolean z, boolean z2, C0QLP c0qlp, String str, EnumC669620QOi enumC669620QOi, String str2, String str3, String str4) {
        this.isNewUser = z;
        this.landingToNewUserPage = z2;
        this.landingPageSearchBarStyle = c0qlp;
        this.landingPageBgUrl = str;
        this.singleTabType = enumC669620QOi;
        this.restoreSingleTabType = str2;
        this.resultChannel = str3;
        this.resultSource = str4;
    }
}
