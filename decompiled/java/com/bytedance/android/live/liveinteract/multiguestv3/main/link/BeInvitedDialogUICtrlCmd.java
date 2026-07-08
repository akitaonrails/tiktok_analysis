package com.bytedance.android.live.liveinteract.multiguestv3.main.link;

import X.C2188811AlT;
import X.InterfaceC923960a9S;
import android.os.Parcel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class BeInvitedDialogUICtrlCmd implements IMultiGuestDialogUiCtrlCmd {
    public static final int $stable = 8;
    public final InterfaceC923960a9S beInvitedOptPresenter;

    public BeInvitedDialogUICtrlCmd() {
        this(null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BeInvitedDialogUICtrlCmd) && Intrinsics.LJFF(this.beInvitedOptPresenter, ((BeInvitedDialogUICtrlCmd) obj).beInvitedOptPresenter);
    }

    public final int hashCode() {
        InterfaceC923960a9S interfaceC923960a9S = this.beInvitedOptPresenter;
        if (interfaceC923960a9S == null) {
            return 0;
        }
        return interfaceC923960a9S.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BeInvitedDialogUICtrlCmd(beInvitedOptPresenter=");
        sbLIZ.append(this.beInvitedOptPresenter);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public BeInvitedDialogUICtrlCmd(InterfaceC923960a9S interfaceC923960a9S) {
        this.beInvitedOptPresenter = interfaceC923960a9S;
    }
}
