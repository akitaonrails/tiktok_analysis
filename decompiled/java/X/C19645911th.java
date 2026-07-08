package X;

import Y.AkS46S1000000_29;
import com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base.ArticleStickerContentCheckResponse;
import com.ss.android.ugc.aweme.ogc.news.sticker.creator.widget.editor.sheet.base.IArticleStickerEditorApi;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11th, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19645911th {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(111));

    public static C11NZ LIZ(EnumC818760W9y enumC818760W9y, String str) {
        C11NZ<ArticleStickerContentCheckResponse> c11nzContentCheck;
        if (str == null) {
            str = "";
        }
        IArticleStickerEditorApi iArticleStickerEditorApi = (IArticleStickerEditorApi) LIZ.getValue();
        if (iArticleStickerEditorApi != null && (c11nzContentCheck = iArticleStickerEditorApi.contentCheck(Integer.valueOf(enumC818760W9y.getServerValue()), str)) != null) {
            return c11nzContentCheck.LJJJJZI(new AkS46S1000000_29(str, 0)).LJJLIIIIJ(new AkS46S1000000_29(str, 1));
        }
        return C11NZ.LJJJJZ(new C19641511sz(str, false, C20467080b.LIZIZ(R.string.m25)));
    }
}
