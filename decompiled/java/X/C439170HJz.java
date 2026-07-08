package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import com.ss.android.ugc.aweme.model.IMSATaskDetail;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C439170HJz implements C0HK1 {
    public final List<StickerItem> LL;
    public final IMStickerSetMetaData LLILLJJLI;
    public final IMSATaskDetail LLILLL;

    public final C439170HJz copy(List<StickerItem> list, IMStickerSetMetaData iMStickerSetMetaData, IMSATaskDetail iMSATaskDetail) {
        return new C439170HJz(list, iMStickerSetMetaData, iMSATaskDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C439170HJz)) {
            return false;
        }
        C439170HJz c439170HJz = (C439170HJz) obj;
        return Intrinsics.LJFF(this.LL, c439170HJz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c439170HJz.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c439170HJz.LLILLL);
    }

    public int hashCode() {
        List<StickerItem> list = this.LL;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        IMStickerSetMetaData iMStickerSetMetaData = this.LLILLJJLI;
        return ((iHashCode + (iMStickerSetMetaData != null ? iMStickerSetMetaData.hashCode() : 0)) * 31) + this.LLILLL.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generating(stickers=");
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

    public C439170HJz(List<StickerItem> list, IMStickerSetMetaData iMStickerSetMetaData, IMSATaskDetail iMSATaskDetail) {
        this.LL = list;
        this.LLILLJJLI = iMStickerSetMetaData;
        this.LLILLL = iMSATaskDetail;
    }
}
