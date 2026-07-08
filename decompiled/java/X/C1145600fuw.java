package X;

import android.text.SpannableString;
import com.bytedance.android.live.base.model.ImageModel;

/* JADX INFO: renamed from: X.0fuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145600fuw {
    public final AbstractC1145640fv0 LIZ;
    public final SpannableString LIZIZ;
    public final boolean LIZJ;
    public final ImageModel LIZLLL;
    public final C1144880ftm LJ;
    public final String LJFF;

    public C1145600fuw(AbstractC1145640fv0 abstractC1145640fv0, SpannableString spannableString, boolean z, ImageModel imageModel, C1144880ftm c1144880ftm, String str, int i) {
        abstractC1145640fv0 = (i & 1) != 0 ? C1145670fv3.LIZ : abstractC1145640fv0;
        spannableString = (i & 4) != 0 ? null : spannableString;
        z = (i & 8) != 0 ? false : z;
        imageModel = (i & 16) != 0 ? null : imageModel;
        c1144880ftm = (i & 32) != 0 ? null : c1144880ftm;
        str = (i & 128) != 0 ? "" : str;
        this.LIZ = abstractC1145640fv0;
        this.LIZIZ = spannableString;
        this.LIZJ = z;
        this.LIZLLL = imageModel;
        this.LJ = c1144880ftm;
        this.LJFF = str;
    }
}
