package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.comment.easteregg.model.PhotoToStickerResponse;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0l34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.PhotoToStickerHelper$clickPhotoToSticker$2$2$1", f = "PhotoToStickerHelper.kt", l = {}, m = "invokeSuspend")
public final class C1342840l34 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PhotoToStickerResponse LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ PhotoToStickerExtra LLILLL;
    public final /* synthetic */ Comment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342840l34(PhotoToStickerResponse photoToStickerResponse, Activity activity, PhotoToStickerExtra photoToStickerExtra, Comment comment, InterfaceC1364105Vn<? super C1342840l34> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = photoToStickerResponse;
        this.LLILLJJLI = activity;
        this.LLILLL = photoToStickerExtra;
        this.LLILZ = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342840l34(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        PhotoToStickerExtra photoToStickerExtra;
        PhotoToStickerExtra photoToStickerExtra2;
        Integer num3;
        String str;
        PhotoToStickerExtra photoToStickerExtra3;
        PhotoToStickerExtra photoToStickerExtra4;
        C1C7U.LIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer num4 = this.LL.result;
        String str2 = null;
        if ((num4 != null && num4.intValue() == 0) || ((num = this.LL.result) != null && num.intValue() == 1)) {
            if (this.LL.stickerItem != null) {
                IMStickerApi.LIZ.LIZIZ().getImStickerStoreService().LIZIZ(this.LL.stickerItem);
            }
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LLFFF(this.LLILLJJLI) && (((photoToStickerExtra3 = this.LLILLL) == null || !Intrinsics.LJFF(photoToStickerExtra3.fromPhotoInner, true)) && ((photoToStickerExtra4 = this.LLILLL) == null || !Intrinsics.LJFF(photoToStickerExtra4.fromGraphicDetail, true)))) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$2$1");
                return unit;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Comment comment = this.LLILZ;
            PhotoToStickerExtra photoToStickerExtra5 = this.LLILLL;
            PhotoToStickerResponse photoToStickerResponse = this.LL;
            linkedHashMap.put("message_type", C1350750lFp.LIZ(comment));
            C1350920lG6.LIZ.getClass();
            linkedHashMap.put("photo_type", C1350920lG6.LJIILIIL(comment));
            if (photoToStickerExtra5 != null) {
                num3 = photoToStickerExtra5.isInternalPhoto;
            } else {
                num3 = null;
            }
            linkedHashMap.put("is_internal_image_comment", String.valueOf(num3));
            linkedHashMap.put("success_status", photoToStickerResponse.result.toString());
            PhotoToStickerExtra photoToStickerExtra6 = this.LLILLL;
            if (photoToStickerExtra6 != null) {
                str = photoToStickerExtra6.enterFrom;
            } else {
                str = null;
            }
            C1350920lG6.LJJIJ(str, "save_as_sticker", "success", "", "", linkedHashMap);
            C1341790l1N c1341790l1N = C1341790l1N.LIZ;
            Activity activity = this.LLILLJJLI;
            PhotoToStickerExtra photoToStickerExtra7 = this.LLILLL;
            Boolean bool = Boolean.FALSE;
            c1341790l1N.getClass();
            C1341790l1N.LJ(activity, photoToStickerExtra7, bool);
        }
        Integer num5 = this.LL.result;
        if (num5 != null && num5.intValue() == 2) {
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LLFFF(this.LLILLJJLI) && (((photoToStickerExtra = this.LLILLL) == null || !Intrinsics.LJFF(photoToStickerExtra.fromPhotoInner, true)) && ((photoToStickerExtra2 = this.LLILLL) == null || !Intrinsics.LJFF(photoToStickerExtra2.fromGraphicDetail, true)))) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$2$1");
                return unit2;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Comment comment2 = this.LLILZ;
            PhotoToStickerExtra photoToStickerExtra8 = this.LLILLL;
            linkedHashMap2.put("message_type", C1350750lFp.LIZ(comment2));
            if (photoToStickerExtra8 != null) {
                num2 = photoToStickerExtra8.isInternalPhoto;
            } else {
                num2 = null;
            }
            linkedHashMap2.put("is_internal_image_comment", String.valueOf(num2));
            C1350920lG6.LIZ.getClass();
            linkedHashMap2.put("photo_type", C1350920lG6.LJIILIIL(comment2));
            PhotoToStickerExtra photoToStickerExtra9 = this.LLILLL;
            if (photoToStickerExtra9 != null) {
                str2 = photoToStickerExtra9.enterFrom;
            }
            C1350920lG6.LJJIJ(str2, "save_as_sticker", "already_saved", "", "", linkedHashMap2);
            C1341790l1N c1341790l1N2 = C1341790l1N.LIZ;
            Activity activity2 = this.LLILLJJLI;
            PhotoToStickerExtra photoToStickerExtra10 = this.LLILLL;
            c1341790l1N2.getClass();
            C1341790l1N.LJ(activity2, photoToStickerExtra10, true);
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
