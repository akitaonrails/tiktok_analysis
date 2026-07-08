package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.EditPostModel;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS26S2200000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import njp.a;

/* JADX INFO: renamed from: X.0niT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.vechoosecover.jsb.EcEditVideoCoverMethod$downloadVideo$2", f = "EcEditVideoCoverMethod.kt", l = {496}, m = "invokeSuspend")
public final class C1445390niT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ VideoPublishEditModel LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1445390niT(String str, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C1445390niT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1445390niT(this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        VideoUrlModel videoPlayAddr;
        List<String> urlList;
        String str;
        SimVideoUrlModel videoCacheModel;
        CreativeModel creativeModel;
        EditPostModel editPostModel;
        Object objLJIJ = obj;
        C1C7U.LIZ("EcEditVideoCoverMethod@c5a1.downloadVideo$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIJ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIJ);
            String strLJIIIIZZ = C1443230nez.LJIIIIZZ(this.LLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C08HM.LIZJ(this.LLIZ));
            sbLIZ.append(".mp4");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJIIIIZZ);
            sbLIZ2.append(File.separator);
            sbLIZ2.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            boolean zLIZJ = C2286708xd.LIZJ(strLIZIZ2);
            C1445750nj3 c1445750nj3 = C1445750nj3.LIZ;
            String str2 = this.LLIZ;
            Keva keva = C1445750nj3.LJII;
            boolean z = keva.getBoolean(str2, false);
            C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("fullPath: ");
            sbLIZ3.append(strLIZIZ2);
            sbLIZ3.append(" , fileExist: ");
            sbLIZ3.append(zLIZJ);
            sbLIZ3.append(",  hasDownload: ");
            sbLIZ3.append(z);
            c1437510nVlLJJLIIIJ.LIZ("EditPostPublishScene", C2188811AlT.LIZIZ(sbLIZ3));
            if (zLIZJ) {
                if (z) {
                    C1443230nez.LJ(this.LLIZLLLIL, strLIZIZ2);
                    C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.downloadVideo$2");
                    return true;
                }
                new C0VSJ(strLIZIZ2).delete();
            } else if (z) {
                keva.storeBoolean(this.LLIZ, false);
            }
            EditPostModel editPostModel2 = this.LLIZLLLIL.creativeModel.editPostModel;
            if (editPostModel2 != null && (videoPlayAddr = editPostModel2.getVideoPlayAddr()) != null && (urlList = videoPlayAddr.getUrlList()) != null && (str = (String) C13LP.LJJJLL(urlList)) != null) {
                VideoPublishEditModel videoPublishEditModel = this.LLIZLLLIL;
                String str3 = this.LLIZ;
                this.LL = strLJIIIIZZ;
                this.LLILLJJLI = strLIZIZ;
                this.LLILLL = strLIZIZ2;
                this.LLILZ = str;
                this.LLILZIL = str3;
                this.LLILZLL = 1;
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                C1445750nj3.LIZJ = new AwS26S2200000_22(str3, strLIZIZ2, videoPublishEditModel, c2252611DEt, 0);
                C1445750nj3.LJ = AFwS261S0000000_22.get$arr$(302);
                C1445750nj3.LIZLLL = new AwS566S0100000_22(c2252611DEt, 962);
                if (videoPublishEditModel != null && (creativeModel = videoPublishEditModel.creativeModel) != null && (editPostModel = creativeModel.editPostModel) != null) {
                    videoCacheModel = editPostModel.getVideoCacheModel();
                } else {
                    videoCacheModel = null;
                }
                C1445750nj3.LIZIZ(videoCacheModel, str, strLJIIIIZZ, strLIZIZ);
                objLJIJ = c2252611DEt.LJIJ();
                if (objLJIJ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLJIJ == objLJFF) {
                    C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.downloadVideo$2");
                    return objLJFF;
                }
            } else {
                C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.downloadVideo$2");
                return false;
            }
        }
        C1C7U.LIZIZ("EcEditVideoCoverMethod@c5a1.downloadVideo$2");
        return objLJIJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
