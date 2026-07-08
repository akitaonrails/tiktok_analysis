package X;

import com.ss.android.ugc.aweme.creative.model.InlineCaptionModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FHw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387660FHw {
    public final VideoPublishEditModel LIZ;
    public final String LIZIZ;
    public final Function0<Boolean> LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Removed duplicated region for block: B:14:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0LAB LIZ() {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387660FHw.LIZ():X.0LAB");
    }

    public final String LIZIZ(String str) {
        String str2;
        String str3 = this.LIZIZ;
        if (Intrinsics.LJFF(str3, "text_edit_page")) {
            InlineCaptionModel inlineCaptionModel = this.LIZ.creativeModel.inlineCaptionModel;
            if (inlineCaptionModel == null || (str2 = inlineCaptionModel.selectLanguageCode) == null) {
                return "";
            }
            return u4.LJL(str2);
        }
        if (!Intrinsics.LJFF(str3, "caption_font_edit_page") || str == null) {
            return "";
        }
        return u4.LJL(str);
    }

    public C387660FHw(VideoPublishEditModel videoPublishEditModel, String str, int i, int i2) {
        str = (i2 & 2) != 0 ? "text_edit_page" : str;
        i = (i2 & 8) != 0 ? 0 : i;
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = str;
        this.LIZJ = null;
        this.LIZLLL = i;
    }
}
