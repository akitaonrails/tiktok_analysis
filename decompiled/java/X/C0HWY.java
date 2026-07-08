package X;

import com.ss.android.ugc.aweme.im.common.model.IMStickerSetMetaData;
import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HWY, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HWY implements InterfaceC442310HWb {
    public final IMStickerSetMetaData LIZ;
    public final List<StickerItem> LIZIZ;

    @Override // X.InterfaceC442310HWb
    public final C0HWY LIZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HWY)) {
            return false;
        }
        C0HWY c0hwy = (C0HWY) obj;
        return Intrinsics.LJFF(this.LIZ, c0hwy.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hwy.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Created(meta=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stickers=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC442310HWb
    public final IMStickerSetMetaData LJJIFFI() {
        return C0HWZ.LIZ(this);
    }

    @Override // X.InterfaceC442310HWb
    public final List<StickerItem> ht() {
        return C0HWZ.LIZIZ(this);
    }

    public C0HWY(IMStickerSetMetaData iMStickerSetMetaData, List<StickerItem> list) {
        this.LIZ = iMStickerSetMetaData;
        this.LIZIZ = list;
    }

    public static C0HWY LIZIZ(C0HWY c0hwy, List list) {
        IMStickerSetMetaData iMStickerSetMetaData = c0hwy.LIZ;
        c0hwy.getClass();
        return new C0HWY(iMStickerSetMetaData, list);
    }
}
