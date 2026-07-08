package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import java.util.List;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0SPO, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPO extends C0SPN {
    public static final C0SPO LIZIZ = new C0SPO();

    public static final void LJFF(Context context, Aweme aweme, String str, int i, boolean z) {
        int size;
        boolean z2;
        boolean z3;
        int i2;
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo = aweme.getPhotoModeImageInfo();
        if (photoModeImageInfo != null && (imageList = photoModeImageInfo.getImageList()) != null) {
            size = imageList.size();
        } else {
            size = 0;
        }
        if (i < size - 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C0SPR.LIZ().enable || (z && C2239941Clk.LIZ().enable)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && z3) {
            int i3 = size - 1;
            int i4 = i + 2;
            if (i3 <= i4) {
                i4 = i3;
            }
            if (C0SPR.LIZ().enable) {
                i2 = C0SPR.LIZ().defaultHorizontalCount;
            } else {
                i2 = C2239941Clk.LIZ().horizontalLoadCount;
            }
            int i5 = (i2 + i4) - 1;
            if (i5 <= i3) {
                i3 = i5;
            }
            C0SPO c0spo = LIZIZ;
            IntRange intRange = new IntRange(i4, i3);
            EnumC1334360kpO enumC1334360kpO = EnumC1334360kpO.HIGH;
            c0spo.getClass();
            C823050WQl.LIZLLL().execute(new RunnableC720040SMg(context, enumC1334360kpO, aweme, str, null, intRange));
        }
    }
}
