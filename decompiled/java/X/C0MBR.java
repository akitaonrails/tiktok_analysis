package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0MBR, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MBR extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Bitmap.CompressFormat LLILZ;
    public final /* synthetic */ VideoPublishEditModel LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MBR(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat, VideoPublishEditModel videoPublishEditModel, int i2, int i3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = bitmap;
        this.LLILLL = i;
        this.LLILZ = compressFormat;
        this.LLILZIL = videoPublishEditModel;
        this.LLILZLL = i2;
        this.LLIZ = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws Throwable {
        long jCurrentTimeMillis = System.currentTimeMillis();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append("-uncompleted");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0MH8 c0mh8 = C0MH8.LIZ;
        Bitmap bitmap = this.LLILLJJLI;
        int i = this.LLILLL;
        Bitmap.CompressFormat compressFormat = this.LLILZ;
        c0mh8.getClass();
        boolean zLJ = C1319770kRr.LJ(i, compressFormat, bitmap, new C0VSJ(strLIZIZ));
        if (C2286708xd.LIZJ(strLIZIZ)) {
            new C0VSJ(strLIZIZ).renameTo(new C0VSJ(this.LL));
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C540390LHh c540390LHh = C540390LHh.LIZ;
        String creationId = this.LLILZIL.getCreationId();
        int i2 = this.LLILLL;
        int iOrdinal = this.LLILZ.ordinal();
        int width = this.LLILLJJLI.getWidth() * this.LLILLJJLI.getHeight();
        c540390LHh.getClass();
        C0LAB c0lab = new C0LAB();
        c0lab.LIZIZ(jCurrentTimeMillis2, "duration");
        c0lab.LJ("creation_id", creationId);
        c0lab.LIZ(i2, "quality");
        c0lab.LIZ(iOrdinal, "type");
        c0lab.LIZ(width, "resolution");
        C20684815ws.LJIILLIIL("save_cover_performance", c0lab.LIZ);
        c0mh8.LIZ(this.LLILZIL, new CoverNewItem(this.LLILZLL, this.LL, this.LLIZ, null, jCurrentTimeMillis, null, Float.valueOf(this.LLILZIL.getVideoCoverStartTm()), 40, null), false);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("new cover added: ");
        CoverPublishModel coverPublishModel = this.LLILZIL.creativeModel.coverPublishModel;
        sbLIZ2.append(coverPublishModel != null ? coverPublishModel.getNewCoverList() : null);
        C0MH8.LJIIL(C2188811AlT.LIZIZ(sbLIZ2));
        return Boolean.valueOf(zLJ);
    }
}
