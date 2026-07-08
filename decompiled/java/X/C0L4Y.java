package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.EcTakePhotoActivity;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.PageType;
import kotlin.Unit;
import kotlin.jvm.internal.AwS6S1001000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0L4Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L4Y extends C09AY implements InterfaceC1631630sYr<MediaModel, Integer, Bitmap, Long, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ EcTakePhotoActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L4Y(EcTakePhotoActivity ecTakePhotoActivity, String str) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = ecTakePhotoActivity;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(MediaModel mediaModel, Integer num, Bitmap bitmap, Long l) {
        String str;
        MediaModel mediaModel2 = mediaModel;
        int iIntValue = num.intValue();
        l.longValue();
        if (Intrinsics.LJFF(this.LL, "icon_album")) {
            str = "choose_album";
        } else {
            str = "choose_album_extend_album";
        }
        this.LLILLJJLI.p(mediaModel2.LJFF(), PageType.ALBUM, str, null, null, null);
        this.LLILLJJLI.r("album_photo_click", new AwS6S1001000_8(this.LL, iIntValue, 1));
        return Unit.LIZ;
    }
}
