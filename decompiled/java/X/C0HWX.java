package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWX implements InterfaceC442310HWb {
    public final IMStickerSetMetaData LIZ;
    public final List<StickerItem> LIZIZ;

    public C0HWX() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HWX)) {
            return false;
        }
        C0HWX c0hwx = (C0HWX) obj;
        return Intrinsics.LJFF(this.LIZ, c0hwx.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hwx.LIZIZ);
    }

    public final int hashCode() {
        IMStickerSetMetaData iMStickerSetMetaData = this.LIZ;
        int iHashCode = (iMStickerSetMetaData == null ? 0 : iMStickerSetMetaData.hashCode()) * 31;
        List<StickerItem> list = this.LIZIZ;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationInProgress(meta=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC442310HWb
    public final C0HWY LIZ() {
        if (this instanceof C0HWY) {
            return (C0HWY) this;
        }
        return null;
    }

    @Override // X.InterfaceC442310HWb
    public final IMStickerSetMetaData LJJIFFI() {
        return C0HWZ.LIZ(this);
    }

    @Override // X.InterfaceC442310HWb
    public final List<StickerItem> ht() {
        return C0HWZ.LIZIZ(this);
    }

    public C0HWX(IMStickerSetMetaData iMStickerSetMetaData, List<StickerItem> list) {
        this.LIZ = iMStickerSetMetaData;
        this.LIZIZ = list;
    }
}
