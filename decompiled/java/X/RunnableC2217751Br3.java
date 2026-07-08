package X;

import com.ss.bytertc.audio.device.router.bluetooth.BluetoothManager;

/* JADX INFO: renamed from: X.1Br3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final /* synthetic */ class RunnableC2217751Br3 implements Runnable {
    public final /* synthetic */ BluetoothManager LL;

    public /* synthetic */ RunnableC2217751Br3(BluetoothManager bluetoothManager) {
        this.LL = bluetoothManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BluetoothManager.lambda$semisugar$restartBluetoothScoAsyncTask$0(this.LL);
    }
}
