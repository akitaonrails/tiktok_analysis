package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.sticker.data.VideoShareInfoStruct;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.edit.serviceimpl.MediaDownloadHelper$fetchPhotomodeImage$1", f = "MediaDownloadHelper.kt", l = {144}, m = "invokeSuspend")
public final class C567150MMf extends C09AX implements Function2<InterfaceC346701Wf<? super C0MMH>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C567320MMw LLILLL;
    public final /* synthetic */ ForwardMedia LLILZ;
    public final /* synthetic */ C0MML LLILZIL;
    public final /* synthetic */ CreativeInfo LLILZLL;
    public final /* synthetic */ Context LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567150MMf(C567320MMw c567320MMw, ForwardMedia forwardMedia, C0MML c0mml, CreativeInfo creativeInfo, Context context, InterfaceC1364105Vn<? super C567150MMf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c567320MMw;
        this.LLILZ = forwardMedia;
        this.LLILZIL = c0mml;
        this.LLILZLL = creativeInfo;
        this.LLIZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C567150MMf c567150MMf = new C567150MMf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c567150MMf.LLILLJJLI = obj;
        return c567150MMf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageUrlModel photoModeImageUrlModel;
        UrlModel urlModel;
        List<String> urlList;
        String str;
        C1C7U.LIZ("MediaDownloadHelper@6562.fetchPhotomodeImage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            this.LLILLL.getClass();
            C567320MMw.LIZIZ("Starting photomode image fetch");
            C567320MMw c567320MMw = this.LLILLL;
            ForwardMedia forwardMedia = this.LLILZ;
            C0MML c0mml = this.LLILZIL;
            c567320MMw.getClass();
            VideoShareInfoStruct videoShareInfoStruct = c0mml.getVideoShareInfoStruct();
            Integer numValueOf = null;
            if (videoShareInfoStruct != null) {
                numValueOf = Integer.valueOf(videoShareInfoStruct.photomodeIndex);
            }
            if (numValueOf != null && numValueOf.intValue() != -1) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            PhotoModeImageInfo photoModeImageInfo = forwardMedia.photoModeImageInfo;
            if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null && (photoModeImageUrlModel = (PhotoModeImageUrlModel) ListProtector.get(imageList, iIntValue)) != null && (urlModel = photoModeImageUrlModel.displayImageNoWatermark) != null && (urlList = urlModel.getUrlList()) != null && (str = (String) ListProtector.get(urlList, 0)) != null && str.length() != 0) {
                C0MMH c0mmh = new C0MMH(this.LLILLL.LIZJ(str, this.LLILZLL, this.LLILZ), this.LLILLL.LIZ(this.LLIZ, this.LLILZLL, this.LLILZ, this.LLILZIL), 2);
                this.LL = 1;
                if (interfaceC346701Wf.emit(c0mmh, this) == objLJFF) {
                    C1C7U.LIZIZ("MediaDownloadHelper@6562.fetchPhotomodeImage$1");
                    return objLJFF;
                }
            } else {
                throw new IllegalStateException("image path is empty");
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaDownloadHelper@6562.fetchPhotomodeImage$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MMH> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
