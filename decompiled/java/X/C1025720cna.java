package X;

import java.io.Serializable;

/* JADX INFO: renamed from: X.0cna, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025720cna implements Serializable {
    public Boolean _dismissedOnBackKeyPressed;
    public Boolean _hideable;
    public Boolean _isDraggable;
    public Boolean cancelOnTouchOutside;
    public float defaultHeightRatio;
    public int dynamicHeight;
    public Boolean hasOverlay;
    public Boolean hideHistoryEntry;
    public Boolean hideMoreMenu;
    public int peekHeight;
    public int variant;

    public static /* synthetic */ void getDragable$annotations() {
    }

    public static /* synthetic */ void getHideable$annotations() {
    }

    public final C1025720cna copy(float f, Boolean bool, Boolean bool2, int i, Boolean bool3, int i2, int i3, Boolean bool4) {
        return new C1025720cna(f, bool, bool2, i, bool3, i2, i3, bool4);
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TuxSheetConfig(defaultHeightRatio=");
        sbLIZ.append(this.defaultHeightRatio);
        sbLIZ.append(", cancelOnTouchOutside=");
        sbLIZ.append(this.cancelOnTouchOutside);
        sbLIZ.append(", hasOverlay=");
        sbLIZ.append(this.hasOverlay);
        sbLIZ.append(", variant=");
        sbLIZ.append(this.variant);
        sbLIZ.append(", hideMoreMenu=");
        sbLIZ.append(this.hideMoreMenu);
        sbLIZ.append(", dynamicHeight=");
        sbLIZ.append(this.dynamicHeight);
        sbLIZ.append(", peekHeight=");
        sbLIZ.append(this.peekHeight);
        sbLIZ.append(", hideHistoryEntry=");
        sbLIZ.append(this.hideHistoryEntry);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int hashCode() {
        int iFloatToIntBits = Float.floatToIntBits(this.defaultHeightRatio) * 31;
        Boolean bool = this.cancelOnTouchOutside;
        int iHashCode = (iFloatToIntBits + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.hasOverlay;
        int iHashCode2 = (((iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31) + this.variant) * 31;
        Boolean bool3 = this.hideMoreMenu;
        int iHashCode3 = (((((iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31) + this.dynamicHeight) * 31) + this.peekHeight) * 31;
        Boolean bool4 = this.hideHistoryEntry;
        return iHashCode3 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public final Boolean getDismissedOnBackKeyPressed() {
        return this._dismissedOnBackKeyPressed;
    }

    public final Boolean getDragable() {
        return this._isDraggable;
    }

    public final Boolean getHideable() {
        return this._hideable;
    }

    public final void setCancelOnTouchOutside(Boolean bool) {
        this.cancelOnTouchOutside = bool;
    }

    public final void setDefaultHeightRatio(float f) {
        this.defaultHeightRatio = f;
    }

    public final void setDismissedOnBackKeyPressed(boolean z) {
        this._dismissedOnBackKeyPressed = Boolean.valueOf(z);
    }

    public final void setDraggable(boolean z) {
        this._isDraggable = Boolean.valueOf(z);
    }

    public final void setDynamicHeight(int i) {
        this.dynamicHeight = i;
    }

    public final void setHasOverlay(Boolean bool) {
        this.hasOverlay = bool;
    }

    public final void setHideHistoryEntry(Boolean bool) {
        this.hideHistoryEntry = bool;
    }

    public final void setHideMoreMenu(Boolean bool) {
        this.hideMoreMenu = bool;
    }

    public final void setHideable(boolean z) {
        this._hideable = Boolean.valueOf(z);
    }

    public final void setPeekHeight(int i) {
        this.peekHeight = i;
    }

    public final void setVariant(int i) {
        this.variant = i;
    }

    public C1025720cna(float f, Boolean bool, Boolean bool2, int i, Boolean bool3, int i2, int i3, Boolean bool4) {
        this.defaultHeightRatio = f;
        this.cancelOnTouchOutside = bool;
        this.hasOverlay = bool2;
        this.variant = i;
        this.hideMoreMenu = bool3;
        this.dynamicHeight = i2;
        this.peekHeight = i3;
        this.hideHistoryEntry = bool4;
    }
}
