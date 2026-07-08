package com.bytedance.android.live.design.view.sheet;

import X.C16HI;
import X.C20244614Jg;
import X.C20642515q3;
import X.C418440Gaw;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes32.dex */
public final class SheetOptions implements Parcelable {
    public static final Parcelable.Creator<SheetOptions> CREATOR = new C16HI(1);
    public int LL;
    public float LLILLJJLI;
    public boolean cancelable;
    public boolean canceledOnTouchOutside;
    public boolean closePerceptible;
    public int closeTintColor;
    public boolean closeTintColorSet;
    public int cornerRadius;
    public int dimBehindType;
    public boolean draggable;
    public boolean expandable;
    public int extraHeight;
    public boolean fullscreenEnabled;
    public int gravity;
    public int height;
    public float heightRatio;
    public boolean isClipChildren;
    public boolean isHeaderFloating;
    public boolean isHeaderHidden;
    public float marginBottom;
    public float marginEnd;
    public float marginStart;
    public float marginTop;
    public int maxHeight;
    public float maxHeightRatio;
    public boolean navigateUpPerceptible;
    public int navigateUpTintColor;
    public boolean navigateUpTintColorSet;
    public boolean requireDrawBehindStatusBar;
    public int sheetStyle;
    public boolean startExpanded;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public SheetOptions() {
        this.LL = -1;
        this.height = -1;
        this.maxHeight = -1;
        this.cornerRadius = -1;
        this.draggable = true;
        this.canceledOnTouchOutside = true;
        this.cancelable = true;
        this.requireDrawBehindStatusBar = true;
        LIZ(0, null);
    }

    public SheetOptions(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        this.LL = -1;
        this.height = -1;
        this.maxHeight = -1;
        this.cornerRadius = -1;
        this.draggable = true;
        this.canceledOnTouchOutside = true;
        this.cancelable = true;
        this.requireDrawBehindStatusBar = true;
        this.sheetStyle = parcel.readInt();
        this.height = parcel.readInt();
        this.heightRatio = parcel.readFloat();
        this.maxHeight = parcel.readInt();
        this.maxHeightRatio = parcel.readFloat();
        this.LLILLJJLI = parcel.readFloat();
        this.extraHeight = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.draggable = z;
        this.marginStart = parcel.readFloat();
        this.marginTop = parcel.readFloat();
        this.marginEnd = parcel.readFloat();
        this.marginBottom = parcel.readFloat();
        this.gravity = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.fullscreenEnabled = z2;
        if (parcel.readByte() != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.expandable = z3;
        if (parcel.readByte() != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.closePerceptible = z4;
        if (parcel.readByte() != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.navigateUpPerceptible = z5;
        this.navigateUpTintColor = parcel.readInt();
        this.closeTintColor = parcel.readInt();
        if (parcel.readByte() != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.navigateUpTintColorSet = z6;
        if (parcel.readByte() != 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.closeTintColorSet = z7;
        if (parcel.readByte() != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.isHeaderFloating = z8;
        if (parcel.readByte() != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.canceledOnTouchOutside = z9;
        if (parcel.readByte() != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.cancelable = z10;
        this.cornerRadius = parcel.readInt();
        this.dimBehindType = parcel.readInt();
        this.requireDrawBehindStatusBar = parcel.readByte() != 0;
    }

    public final void LIZ(int i, Context context) {
        this.sheetStyle = i;
        float f = 0.0f;
        if (i == 4) {
            if (context != null || (context = C20642515q3.LIZ()) != null) {
                int iLIZLLL = C418440Gaw.LIZLLL(context);
                int iLIZJ = C418440Gaw.LIZJ(context) + C20244614Jg.LIZIZ(context);
                double dMax = Math.max(((double) Math.max(iLIZLLL, iLIZJ)) * 0.5d, C418440Gaw.LIZ(Float.valueOf(660.0f))) / ((double) iLIZJ);
                if (dMax > 0.9d) {
                    dMax = 0.9d;
                }
                f = (float) dMax;
            }
            this.heightRatio = f;
            this.maxHeightRatio = f;
            return;
        }
        if (i == 0) {
            this.heightRatio = 0.0f;
            this.maxHeightRatio = 0.6f;
            return;
        }
        if (i == 1) {
            this.heightRatio = 0.73f;
            this.maxHeightRatio = 0.0f;
            return;
        }
        if (i == 2) {
            this.heightRatio = 0.6f;
            this.maxHeightRatio = 0.0f;
            return;
        }
        if (i == 3) {
            this.heightRatio = 0.0f;
            this.maxHeightRatio = 0.73f;
            return;
        }
        if (i == 5) {
            this.heightRatio = 0.0f;
            this.maxHeightRatio = 1.0f;
            return;
        }
        if (i == 6) {
            this.draggable = false;
            this.heightRatio = 1.0f;
            this.maxHeightRatio = 0.0f;
            this.fullscreenEnabled = true;
            this.startExpanded = true;
            return;
        }
        if (i != 7) {
            return;
        }
        this.heightRatio = 0.73f;
        this.LLILLJJLI = 0.9f;
        this.expandable = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            return;
        }
        parcel.writeInt(this.sheetStyle);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.heightRatio);
        parcel.writeInt(this.maxHeight);
        parcel.writeFloat(this.maxHeightRatio);
        parcel.writeFloat(this.LLILLJJLI);
        parcel.writeInt(this.extraHeight);
        parcel.writeByte(this.draggable ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.marginStart);
        parcel.writeFloat(this.marginTop);
        parcel.writeFloat(this.marginEnd);
        parcel.writeFloat(this.marginBottom);
        parcel.writeInt(this.gravity);
        parcel.writeByte(this.fullscreenEnabled ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.expandable ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closePerceptible ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.navigateUpPerceptible ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.navigateUpTintColor);
        parcel.writeInt(this.closeTintColor);
        parcel.writeByte(this.navigateUpTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.closeTintColorSet ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isHeaderFloating ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.canceledOnTouchOutside ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.cancelable ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.cornerRadius);
        parcel.writeInt(this.dimBehindType);
        parcel.writeByte(this.requireDrawBehindStatusBar ? (byte) 1 : (byte) 0);
    }
}
