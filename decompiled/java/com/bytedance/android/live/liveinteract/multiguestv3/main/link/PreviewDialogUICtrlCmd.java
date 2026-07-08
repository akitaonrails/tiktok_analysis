package com.bytedance.android.live.liveinteract.multiguestv3.main.link;

import X.C786410Ut5;
import X.C924480aAI;
import X.InterfaceC923960a9S;
import X.InterfaceC924000a9W;
import android.os.Parcel;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class PreviewDialogUICtrlCmd implements IMultiGuestDialogUiCtrlCmd {
    public static final int $stable = 0;
    public static final C924480aAI Companion = new Object() { // from class: X.0aAI
    };
    public final InterfaceC924000a9W applyOptPresenter;
    public final InterfaceC923960a9S beInvitedOptPresenter;
    public final int countdownSeconds;
    public final boolean isFromAnchorInvite;
    public final boolean isFromAnchorPermit;
    public final boolean isFromModeratorInvite;
    public final boolean isFromModeratorPermit;
    public final boolean isKaraokeApplier;
    public final boolean isSupportPauseLive;
    public final boolean showLeftTopDisconnectBtn;
    public final boolean showSilentMicBtn;
    public final boolean showTitle;
    public final boolean showTitleTip;

    public PreviewDialogUICtrlCmd() {
        this(false, null, null, false, false, false, false, 0, false, 8191);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewDialogUICtrlCmd)) {
            return false;
        }
        PreviewDialogUICtrlCmd previewDialogUICtrlCmd = (PreviewDialogUICtrlCmd) obj;
        return this.showSilentMicBtn == previewDialogUICtrlCmd.showSilentMicBtn && this.showTitle == previewDialogUICtrlCmd.showTitle && this.showTitleTip == previewDialogUICtrlCmd.showTitleTip && this.showLeftTopDisconnectBtn == previewDialogUICtrlCmd.showLeftTopDisconnectBtn && Intrinsics.LJFF(this.applyOptPresenter, previewDialogUICtrlCmd.applyOptPresenter) && Intrinsics.LJFF(this.beInvitedOptPresenter, previewDialogUICtrlCmd.beInvitedOptPresenter) && this.isSupportPauseLive == previewDialogUICtrlCmd.isSupportPauseLive && this.isFromAnchorPermit == previewDialogUICtrlCmd.isFromAnchorPermit && this.isFromAnchorInvite == previewDialogUICtrlCmd.isFromAnchorInvite && this.isFromModeratorPermit == previewDialogUICtrlCmd.isFromModeratorPermit && this.isFromModeratorInvite == previewDialogUICtrlCmd.isFromModeratorInvite && this.countdownSeconds == previewDialogUICtrlCmd.countdownSeconds && this.isKaraokeApplier == previewDialogUICtrlCmd.isKaraokeApplier;
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.showSilentMicBtn) * 31) + C786410Ut5.Z2(this.showTitle)) * 31) + C786410Ut5.Z2(this.showTitleTip)) * 31) + C786410Ut5.Z2(this.showLeftTopDisconnectBtn)) * 31;
        InterfaceC924000a9W interfaceC924000a9W = this.applyOptPresenter;
        int iHashCode = (iZ2 + (interfaceC924000a9W == null ? 0 : interfaceC924000a9W.hashCode())) * 31;
        InterfaceC923960a9S interfaceC923960a9S = this.beInvitedOptPresenter;
        return ((((((((((((((iHashCode + (interfaceC923960a9S != null ? interfaceC923960a9S.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.isSupportPauseLive)) * 31) + C786410Ut5.Z2(this.isFromAnchorPermit)) * 31) + C786410Ut5.Z2(this.isFromAnchorInvite)) * 31) + C786410Ut5.Z2(this.isFromModeratorPermit)) * 31) + C786410Ut5.Z2(this.isFromModeratorInvite)) * 31) + this.countdownSeconds) * 31) + C786410Ut5.Z2(this.isKaraokeApplier);
    }

    public final String toString() {
        return "PreviewDialogUICtrlCmd(showSilentMicBtn=" + this.showSilentMicBtn + ", showTitle=" + this.showTitle + ", showTitleTip=" + this.showTitleTip + ", showLeftTopDisconnectBtn=" + this.showLeftTopDisconnectBtn + ", applyOptPresenter=" + this.applyOptPresenter + ", beInvitedOptPresenter=" + this.beInvitedOptPresenter + ", isSupportPauseLive=" + this.isSupportPauseLive + ", isFromAnchorPermit=" + this.isFromAnchorPermit + ", isFromAnchorInvite=" + this.isFromAnchorInvite + ", isFromModeratorPermit=" + this.isFromModeratorPermit + ", isFromModeratorInvite=" + this.isFromModeratorInvite + ", countdownSeconds=" + this.countdownSeconds + ", isKaraokeApplier=" + this.isKaraokeApplier + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }

    public PreviewDialogUICtrlCmd(boolean z, InterfaceC924000a9W interfaceC924000a9W, InterfaceC923960a9S interfaceC923960a9S, boolean z2, boolean z3, boolean z4, boolean z5, int i, boolean z6, int i2) {
        z = (i2 & 8) != 0 ? false : z;
        interfaceC924000a9W = (i2 & 16) != 0 ? null : interfaceC924000a9W;
        interfaceC923960a9S = (i2 & 32) != 0 ? null : interfaceC923960a9S;
        z2 = (i2 & 128) != 0 ? false : z2;
        z3 = (i2 & 256) != 0 ? false : z3;
        z4 = (i2 & 512) != 0 ? false : z4;
        z5 = (i2 & 1024) != 0 ? false : z5;
        i = (i2 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? -1 : i;
        z6 = (i2 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? false : z6;
        this.showSilentMicBtn = false;
        this.showTitle = false;
        this.showTitleTip = false;
        this.showLeftTopDisconnectBtn = z;
        this.applyOptPresenter = interfaceC924000a9W;
        this.beInvitedOptPresenter = interfaceC923960a9S;
        this.isSupportPauseLive = false;
        this.isFromAnchorPermit = z2;
        this.isFromAnchorInvite = z3;
        this.isFromModeratorPermit = z4;
        this.isFromModeratorInvite = z5;
        this.countdownSeconds = i;
        this.isKaraokeApplier = z6;
    }
}
