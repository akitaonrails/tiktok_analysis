package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14VK, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14VK implements Serializable {
    public final String cameraType;
    public final int compressHeight;
    public final boolean compressImage;
    public int compressOption;
    public final int compressQuality;
    public final int compressWidth;
    public int cropRatioHeight;
    public int cropRatioWidth;
    public boolean isMultiSelect;
    public boolean isNeedCut;
    public final int maxCount;
    public final List<String> mediaTypes;
    public boolean needBase64Data;
    public int permissionDenyAction;
    public final boolean saveToPhotoAlbum;
    public final String sourceType;
    public boolean useNewCompressSolution;

    public C14VK() {
        this(new ArrayList(), "", 1, false, false, "", 216, 384, 0, false, 0, 0, false, 0, 0, false, false);
    }

    public final boolean isMultiSelect() {
        return this.isMultiSelect;
    }

    public final boolean isNeedCut() {
        return this.isNeedCut;
    }

    public final void setCompressOption(int i) {
        this.compressOption = i;
    }

    public final void setCropRatioHeight(int i) {
        this.cropRatioHeight = i;
    }

    public final void setCropRatioWidth(int i) {
        this.cropRatioWidth = i;
    }

    public final void setMultiSelect(boolean z) {
        this.isMultiSelect = z;
    }

    public final void setNeedBase64Data(boolean z) {
        this.needBase64Data = z;
    }

    public final void setNeedCut(boolean z) {
        this.isNeedCut = z;
    }

    public final void setPermissionDenyAction(int i) {
        this.permissionDenyAction = i;
    }

    public final void setUseNewCompressSolution(boolean z) {
        this.useNewCompressSolution = z;
    }

    public C14VK(List<String> list, String str, int i, boolean z, boolean z2, String str2, int i2, int i3, int i4, boolean z3, int i5, int i6, boolean z4, int i7, int i8, boolean z5, boolean z6) {
        this.mediaTypes = list;
        this.sourceType = str;
        this.maxCount = i;
        this.compressImage = z;
        this.saveToPhotoAlbum = z2;
        this.cameraType = str2;
        this.compressWidth = i2;
        this.compressHeight = i3;
        this.compressQuality = i4;
        this.isNeedCut = z3;
        this.cropRatioWidth = i5;
        this.cropRatioHeight = i6;
        this.needBase64Data = z4;
        this.compressOption = i7;
        this.permissionDenyAction = i8;
        this.isMultiSelect = z5;
        this.useNewCompressSolution = z6;
    }
}
