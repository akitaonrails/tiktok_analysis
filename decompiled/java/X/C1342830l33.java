package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.PhotoToStickerExtra;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l33, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.PhotoToStickerHelper$clickPhotoToSticker$2$3$1", f = "PhotoToStickerHelper.kt", l = {}, m = "invokeSuspend")
public final class C1342830l33 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Throwable LL;
    public final /* synthetic */ PhotoToStickerExtra LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ Comment LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1342830l33(Throwable th, PhotoToStickerExtra photoToStickerExtra, Activity activity, Comment comment, InterfaceC1364105Vn<? super C1342830l33> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = th;
        this.LLILLJJLI = photoToStickerExtra;
        this.LLILLL = activity;
        this.LLILZ = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1342830l33(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C1C7U.LIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Comment comment = this.LLILZ;
        PhotoToStickerExtra photoToStickerExtra = this.LLILLJJLI;
        linkedHashMap.put("message_type", C1350750lFp.LIZ(comment));
        String str = null;
        if (photoToStickerExtra != null) {
            num = photoToStickerExtra.isInternalPhoto;
        } else {
            num = null;
        }
        linkedHashMap.put("is_internal_image_comment", String.valueOf(num));
        C1350920lG6.LIZ.getClass();
        linkedHashMap.put("photo_type", C1350920lG6.LJIILIIL(comment));
        PhotoToStickerExtra photoToStickerExtra2 = this.LLILLJJLI;
        if (photoToStickerExtra2 != null) {
            str = photoToStickerExtra2.enterFrom;
        }
        C1350920lG6.LJJIJ(str, "save_as_sticker", "fail", this.LL.getMessage(), "", linkedHashMap);
        C1389880mGw c1389880mGw = new C1389880mGw(this.LLILLL);
        c1389880mGw.LJIIIIZZ(2131829249);
        c1389880mGw.LJIIJ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoToStickerHelper@6846.clickPhotoToSticker$2$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
