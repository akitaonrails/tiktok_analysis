package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.model.GoLiveECIconInfo;
import com.bytedance.android.live.slot.FrameSlotController;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0fMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1124100fMG implements InterfaceC21213717zz {
    public final /* synthetic */ FrameSlotController LIZ;

    @Override // X.InterfaceC21213717zz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC21213717zz
    public final /* synthetic */ void LIZIZ(Boolean bool) {
    }

    @Override // X.InterfaceC21213717zz
    public final /* synthetic */ boolean LIZJ() {
        return false;
    }

    @Override // X.InterfaceC21213717zz
    public final /* synthetic */ void LJ() {
    }

    @Override // X.InterfaceC21213717zz
    public final /* synthetic */ void LJFF(String str, String str2, InterfaceC1123790fLl interfaceC1123790fLl) {
    }

    @Override // X.InterfaceC21213717zz
    public final /* synthetic */ GoLiveECIconInfo LJI() {
        return null;
    }

    @Override // X.InterfaceC21213717zz
    public final boolean LJII(InterfaceC1124060fMC<IIconSlot, IIconSlot.SlotViewModel, EnumC756810TmR> interfaceC1124060fMC, IIconSlot.SlotViewModel slotViewModel) {
        return false;
    }

    @Override // X.InterfaceC21213717zz
    public final Context getContext() {
        return (C497280Jeo.LIZ || C464660IKa.LIZ()) ? this.LIZ.LLILZ : this.LIZ.LLILLL;
    }

    @Override // X.InterfaceC21213717zz
    public final LifecycleOwner getLifecycleOwner() {
        FrameSlotController frameSlotController = this.LIZ;
        DataChannel dataChannel = frameSlotController.LLILZLL;
        return dataChannel != null ? dataChannel.LLILZ : C520010KaN.LJJIFFI(frameSlotController.LLILZ, false);
    }

    @Override // X.InterfaceC21213717zz
    public final EnumC1102990eoD LIZLLL() {
        return EnumC1102990eoD.DEFAULT;
    }

    public C1124100fMG(FrameSlotController frameSlotController) {
        this.LIZ = frameSlotController;
    }
}
