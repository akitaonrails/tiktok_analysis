package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.texttoimage.Text2ImageGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0MdL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572810MdL extends AbstractC468201s0 {
    public final /* synthetic */ CreativeInfo LL;
    public final /* synthetic */ Text2ImageGenerator LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        C0VSJ c0vsjLIZJ;
        VideoPublishEditModel videoPublishEditModel;
        if (bitmap == null) {
            onFailed(null);
            return;
        }
        CreativeInfo creativeInfo = this.LL;
        if (creativeInfo != null || ((videoPublishEditModel = this.LLILLJJLI.LJI) != null && (creativeInfo = videoPublishEditModel.getCreativeInfo()) != null)) {
            String str = this.LLILLL;
            InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
            EnumC20228214Cy enumC20228214Cy = EnumC20228214Cy.PHOTO;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("template");
            sbLIZ.append(str);
            sbLIZ.append(".jpeg");
            c0vsjLIZJ = pathService.LIZJ(creativeInfo, enumC20228214Cy, C2188811AlT.LIZIZ(sbLIZ), true);
        } else {
            c0vsjLIZJ = null;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C05QV(bitmap, c0vsjLIZJ, this.LLILZ, this, null), 3);
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        C201955140j.LIZIZ("hyppp", String.valueOf(th));
        this.LLILLJJLI.LJII.LJ(true, new Exception(th));
        this.LLILZ.invoke(null);
    }

    public C572810MdL(CreativeInfo creativeInfo, Text2ImageGenerator text2ImageGenerator, String str, AwS587S0100000_8 awS587S0100000_8) {
        this.LL = creativeInfo;
        this.LLILLJJLI = text2ImageGenerator;
        this.LLILLL = str;
        this.LLILZ = awS587S0100000_8;
    }
}
