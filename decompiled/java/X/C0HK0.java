package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.model.IMSATaskDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HK0, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HK0 implements C0HK1 {
    public final List<StickerItem> LL;
    public final IMStickerSetMetaData LLILLJJLI;
    public final IMSATaskDetail LLILLL;

    public final C0HK0 copy(List<StickerItem> list, IMStickerSetMetaData iMStickerSetMetaData, IMSATaskDetail iMSATaskDetail) {
        return new C0HK0(list, iMStickerSetMetaData, iMSATaskDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HK0)) {
            return false;
        }
        C0HK0 c0hk0 = (C0HK0) obj;
        return Intrinsics.LJFF(this.LL, c0hk0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hk0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hk0.LLILLL);
    }

    public int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generated(stickers=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", stickerSetMetadata=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", taskDetails=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0HK1
    public IMStickerSetMetaData getStickerSetMetadata() {
        return this.LLILLJJLI;
    }

    @Override // X.C0HK1
    public List<StickerItem> getStickers() {
        return this.LL;
    }

    @Override // X.C0HK1
    public IMSATaskDetail getTaskDetails() {
        return this.LLILLL;
    }

    public C0HK0(List<StickerItem> list, IMStickerSetMetaData iMStickerSetMetaData, IMSATaskDetail iMSATaskDetail) {
        this.LL = list;
        this.LLILLJJLI = iMStickerSetMetaData;
        this.LLILLL = iMSATaskDetail;
    }
}
