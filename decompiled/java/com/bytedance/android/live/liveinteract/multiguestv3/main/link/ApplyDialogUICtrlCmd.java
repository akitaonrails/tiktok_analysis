package com.bytedance.android.live.liveinteract.multiguestv3.main.link;

import X.C2188811AlT;
import X.InterfaceC924000a9W;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class ApplyDialogUICtrlCmd implements IMultiGuestDialogUiCtrlCmd {
    public static final int $stable = 0;
    public final InterfaceC924000a9W applyOptPresenter;
    public final PreviewDialogUICtrlCmd previewDialogUICtrlCmd;

    public ApplyDialogUICtrlCmd() {
        this(null, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplyDialogUICtrlCmd)) {
            return false;
        }
        ApplyDialogUICtrlCmd applyDialogUICtrlCmd = (ApplyDialogUICtrlCmd) obj;
        return Intrinsics.LJFF(this.applyOptPresenter, applyDialogUICtrlCmd.applyOptPresenter) && Intrinsics.LJFF(this.previewDialogUICtrlCmd, applyDialogUICtrlCmd.previewDialogUICtrlCmd);
    }

    public final int hashCode() {
        InterfaceC924000a9W interfaceC924000a9W = this.applyOptPresenter;
        int iHashCode = (interfaceC924000a9W == null ? 0 : interfaceC924000a9W.hashCode()) * 31;
        PreviewDialogUICtrlCmd previewDialogUICtrlCmd = this.previewDialogUICtrlCmd;
        return iHashCode + (previewDialogUICtrlCmd != null ? previewDialogUICtrlCmd.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyDialogUICtrlCmd(applyOptPresenter=");
        sbLIZ.append(this.applyOptPresenter);
        sbLIZ.append(", previewDialogUICtrlCmd=");
        sbLIZ.append(this.previewDialogUICtrlCmd);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public ApplyDialogUICtrlCmd(InterfaceC924000a9W interfaceC924000a9W, PreviewDialogUICtrlCmd previewDialogUICtrlCmd) {
        this.applyOptPresenter = interfaceC924000a9W;
        this.previewDialogUICtrlCmd = previewDialogUICtrlCmd;
    }
}
