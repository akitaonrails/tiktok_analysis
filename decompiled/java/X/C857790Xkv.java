package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.defaultcontent.DefaultPostContentModel;
import com.ss.android.ugc.aweme.creative.model.edit.Text2ImageModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.AVTextExtraStructHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Xkv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C857790Xkv extends AbstractC857880Xl4 {
    public static final /* synthetic */ int LIZLLL = 0;
    public final Context LIZ;
    public final VideoPublishEditModel LIZIZ;
    public final boolean LIZJ;

    static {
        new C857780Xku();
    }

    @Override // X.AbstractC857880Xl4
    public final List<AbstractC858390Xlt> LIZ() {
        CreativeModel creativeModel = this.LIZIZ.creativeModel;
        if (creativeModel.postPageModel.captionModel.markupText != null || creativeModel.text2ImageModel.fromCommentId.length() == 0 || ((Boolean) C260000AGw.LIZ.getValue()).booleanValue()) {
            return C13BV.INSTANCE;
        }
        Pair pairLIZ = C857780Xku.LIZ(this.LIZ, this.LIZIZ, (this.LIZJ && C572160McI.LJI()) ? false : true);
        String str = (String) pairLIZ.getFirst();
        String str2 = (String) pairLIZ.getSecond();
        ArrayList arrayList = new ArrayList();
        int iLJJJ = a0.LJJJ(str2, str, 0, false, 6);
        int length = iLJJJ + str.length();
        AVTextExtraStructHelper aVTextExtraStructHelper = AVTextExtraStructHelper.INSTANCE;
        Text2ImageModel text2ImageModel = this.LIZIZ.creativeModel.text2ImageModel;
        arrayList.add(aVTextExtraStructHelper.createTextImageCommentStruct(iLJJJ, length, text2ImageModel.fromAuthorId, text2ImageModel.fromAwemeId, text2ImageModel.fromCommentId));
        arrayList.addAll(C857780Xku.LIZIZ(str2, arrayList));
        C572160McI.LJFF(this.LIZIZ.creativeModel.postPageModel.descAutoFillTrack, str2, false, true);
        new C857970XlD(str2, arrayList);
        C858450Xlz c858450Xlz = new C858450Xlz(new C857960XlC());
        c858450Xlz.LJI(str2, arrayList);
        return c858450Xlz.LIZ();
    }

    @Override // X.AbstractC857880Xl4
    public final EnumC857860Xl2 LIZIZ() {
        return EnumC857860Xl2.DEFAULT;
    }

    @Override // X.AbstractC857880Xl4
    public final void LIZJ(List<AbstractC858390Xlt> list) {
        DefaultPostContentModel defaultPostContentModel;
        String str;
        CreativeModel creativeModel = this.LIZIZ.creativeModel;
        if (creativeModel.postPageModel.captionModel.markupText != null || creativeModel.text2ImageModel.fromCommentId.length() == 0 || (defaultPostContentModel = this.LIZIZ.creativeModel.initialModel.defaultPostContentModel) == null || (str = defaultPostContentModel.defaultDescription) == null || str.length() == 0) {
            return;
        }
        Iterator<AbstractC858390Xlt> it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC858390Xlt next = it2.next();
            if (next instanceof C858350Xlp) {
                String string = a0.LJLIIIL(next.LJIILJJIL()).toString();
                if (string.length() == 0) {
                    continue;
                } else if (u.LJJIIJZLJL(str, string, false)) {
                    it2.remove();
                } else {
                    return;
                }
            }
        }
    }

    public C857790Xkv(Context context, VideoPublishEditModel videoPublishEditModel, boolean z) {
        this.LIZ = context;
        this.LIZIZ = videoPublishEditModel;
        this.LIZJ = z;
    }
}
