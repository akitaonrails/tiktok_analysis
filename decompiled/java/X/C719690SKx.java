package X;

import android.graphics.Rect;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImage;
import com.ss.android.ugc.aweme.ui.layout.FeedContentLayoutInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C719690SKx extends C2217421BqW implements Function1<FeedContentLayoutInfo, FeedContentLayoutInfo> {
    public C719690SKx(InterfaceC710220RtU interfaceC710220RtU) {
        super(1, interfaceC710220RtU, C719660SKu.class, "checkContent", "checkContent(Lcom/ss/android/ugc/aweme/ui/layout/FeedContentLayoutInfo;)Lcom/ss/android/ugc/aweme/ui/layout/FeedContentLayoutInfo;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FeedContentLayoutInfo invoke(FeedContentLayoutInfo feedContentLayoutInfo) {
        int i;
        int i2;
        FeedContentLayoutInfo feedContentLayoutInfo2 = feedContentLayoutInfo;
        C719660SKu c719660SKu = (C719660SKu) this.receiver;
        if (!c719660SKu.LJJJJZI) {
            c719660SKu.LJJLIIIJL = 0;
            c719660SKu.LJJLIIIJLJLI = 0;
            c719660SKu.LJJJZ(0);
            return null;
        }
        if (c719660SKu.LJLIL) {
            return null;
        }
        PhotoModeImage photoModeImage = c719660SKu.LJIJI;
        if (photoModeImage != null) {
            i = photoModeImage.pos;
        } else {
            i = 0;
        }
        C0SL3 c0sl3LJJJI = c719660SKu.LJJJI(i);
        if (c0sl3LJJJI == null) {
            return null;
        }
        int iLJJJJI = c719660SKu.LJJI;
        if (iLJJJJI <= 0) {
            iLJJJJI = (c719660SKu.LJJLIIIIJ - C719660SKu.LLD) + c719660SKu.LJJJJI();
        }
        if (c719660SKu.LJJ <= 0 || iLJJJJI <= 0 || Intrinsics.LJFF(feedContentLayoutInfo2, c719660SKu.LJIL)) {
            return null;
        }
        c719660SKu.LJLIL = true;
        C0SL3 c0sl3 = c0sl3LJJJI.LJIIL;
        if (c0sl3 != null) {
            c0sl3LJJJI = c0sl3;
        }
        int i3 = c0sl3LJJJI.LJIIIZ;
        Rect rect = c0sl3LJJJI.LJI;
        if (rect == null) {
            rect = c0sl3LJJJI.LJ;
        }
        int i4 = feedContentLayoutInfo2.totalHeight;
        if (i3 != 1) {
            int i5 = iLJJJJI - i4;
            if (rect != null) {
                i2 = rect.bottom;
            } else {
                i2 = 0;
            }
            int i6 = (i5 - i2) - C719660SKu.LJLLL;
            c719660SKu.LJJLIIIJLJLI = i6;
            if (i6 < 0) {
                i6 = 0;
            }
            c719660SKu.LJJLIIIJLJLI = i6;
        }
        int i7 = c719660SKu.LJJLIIIJLJLI;
        c719660SKu.LJJLIIIJL = i7;
        c719660SKu.LJJJZ(i7);
        int i8 = c719660SKu.LJJLIIIJLJLI;
        if (i8 != feedContentLayoutInfo2.bottom) {
            FeedContentLayoutInfo feedContentLayoutInfo3 = feedContentLayoutInfo2.initLayoutInfo;
            if (feedContentLayoutInfo3 == null) {
                feedContentLayoutInfo3 = feedContentLayoutInfo2;
            }
            FeedContentLayoutInfo feedContentLayoutInfoLIZ = FeedContentLayoutInfo.LIZ(feedContentLayoutInfo2, 0, i8, feedContentLayoutInfo3, 2559);
            c719660SKu.LJIL = feedContentLayoutInfoLIZ;
            return feedContentLayoutInfoLIZ;
        }
        c719660SKu.LJIL = feedContentLayoutInfo2;
        return null;
    }
}
