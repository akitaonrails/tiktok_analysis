package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.15zX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20701315zX {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Aweme aweme) {
        String photoTitleLanguageCode;
        if (aweme == null || (photoTitleLanguageCode = aweme.getPhotoTitleLanguageCode()) == null) {
            return "";
        }
        return photoTitleLanguageCode;
    }
}
