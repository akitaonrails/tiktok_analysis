package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ngX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1444190ngX {
    public final int LIZ;
    public final int LIZIZ = -1;
    public final int LIZJ = -1;
    public final int LIZLLL = 60;
    public final Bitmap.CompressFormat LJ = Bitmap.CompressFormat.PNG;
    public Function2<? super Bitmap, ? super Boolean, Unit> LJFF;

    public C1444190ngX(VideoPublishEditModel videoPublishEditModel) {
        this.LIZ = (int) (videoPublishEditModel.getVideoCoverStartTm() * LSPassThroughRecordSizeConfig.DEFAULT);
    }
}
