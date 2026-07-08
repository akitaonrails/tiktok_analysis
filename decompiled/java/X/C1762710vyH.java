package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.galleryviewer.ui.ECLocalVideoUrlModel;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichText;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0vyH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1762710vyH extends AbstractC1763110vyv {
    public final EnumC1761790vwn LIZ;
    public final String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public Double LJI;
    public Integer LJII;
    public Integer LJIIIIZZ;
    public C1508390pM5 LJIIIZ;
    public ECRichText LJIIJ;

    public final Aweme LIZJ() {
        Video video = new Video();
        VideoUrlModel eCLocalVideoUrlModel = new ECLocalVideoUrlModel();
        eCLocalVideoUrlModel.setSourceId(this.LIZJ);
        eCLocalVideoUrlModel.setUri(this.LIZLLL);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.LIZLLL);
        arrayList.add(this.LJ);
        eCLocalVideoUrlModel.setUrlList(arrayList);
        eCLocalVideoUrlModel.setUrlKey(this.LIZJ);
        video.setPlayAddr(eCLocalVideoUrlModel);
        UrlModel urlModel = new UrlModel();
        urlModel.setUri(this.LJFF);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(this.LJFF);
        urlModel.setUrlList(arrayList2);
        video.setCover(urlModel);
        Integer num = this.LJII;
        if (num != null) {
            video.setWidth(num.intValue());
        }
        Integer num2 = this.LJIIIIZZ;
        if (num2 != null) {
            video.setHeight(num2.intValue());
        }
        Double d = this.LJI;
        if (d != null) {
            video.setVideoLength((int) d.doubleValue());
        }
        video.setPlayAddrBytevc1(video.getPlayAddr());
        Aweme aweme = new Aweme();
        aweme.setVideo(video);
        aweme.setAid(this.LIZJ);
        return aweme;
    }

    @Override // X.AbstractC1763110vyv
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC1763110vyv
    public final EnumC1761790vwn LIZIZ() {
        return this.LIZ;
    }

    public C1762710vyH(EnumC1761790vwn enumC1761790vwn, String str) {
        this.LIZ = enumC1761790vwn;
        this.LIZIZ = str;
    }
}
