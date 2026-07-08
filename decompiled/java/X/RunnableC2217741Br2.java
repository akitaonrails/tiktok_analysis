package X;

import com.ss.bytertc.audio.device.router.bluetooth.BluetoothManager;

/* JADX INFO: renamed from: X.1Br2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class RunnableC2217741Br2 implements Runnable {
    public final /* synthetic */ BluetoothManager LL;

    public /* synthetic */ RunnableC2217741Br2(BluetoothManager bluetoothManager) {
        this.LL = bluetoothManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BluetoothManager.lambda$semisugar$bluetoothScoConnectionCheck$0(this.LL);
    }
}
