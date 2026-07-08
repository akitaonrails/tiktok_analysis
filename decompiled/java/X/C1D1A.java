package X;

import Y.ARunnableS67S0300000_34;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.android.livesdk.impl.revenue.enigma.iap.EnigmaPurchaseService;
import com.ss.android.ugc.aweme.experiment.ConnectNowAssetConfig;
import com.ss.android.ugc.aweme.relation.ffp.nearby.bluetooth.NearbyBleConnectorImpl;
import java.nio.charset.Charset;
import java.util.UUID;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.1D1A, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public class C1D1A implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<C0KPG> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C1D1A c1d1a, InterfaceC2329309At interfaceC2329309At) {
        C19EG c19egLJ = C500260Jjc.LJ(((C290601Aq) c1d1a.l0).LIZ.LIZ);
        C1789970wgF c1789970wgF = new C1789970wgF(((C290601Aq) c1d1a.l0).LIZJ, C2097608Jq.LJI(new Pair("contract_id", ((C290601Aq) c1d1a.l0).LIZIZ), new Pair("product_id", ((C290601Aq) c1d1a.l0).LIZ.LJ.mpSkuId), new Pair("room_id", Long.valueOf(((C290601Aq) c1d1a.l0).LIZ.LIZIZ))));
        IapService iapServiceLIZIZ = ((EnigmaPurchaseService) c1d1a.l1).LIZIZ();
        final InterfaceC2197871B0f interfaceC2197871B0f = (InterfaceC2197871B0f) c1d1a.l2;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        iapServiceLIZIZ.LIZIZ(c19egLJ, c1789970wgF, new InterfaceC518120KTq() { // from class: X.1B0e
            @Override // X.InterfaceC518120KTq
            public final void LIZ(C0KPG c0kpg) {
                if (!c11kt.isDisposed()) {
                    if (c0kpg.LIZLLL == null && c0kpg.LIZ == C0KPI.SUCCESS) {
                        interfaceC2197871B0f.onLoading();
                    }
                    c11kt.onSuccess(c0kpg);
                }
            }
        });
    }

    public static final void subscribe$1(C1D1A c1d1a, InterfaceC2329309At interfaceC2329309At) {
        BluetoothDevice bluetoothDevice = ((C1689710u4X) c1d1a.l0).LIZIZ;
        Context context = (Context) c1d1a.l1;
        final NearbyBleConnectorImpl nearbyBleConnectorImpl = (NearbyBleConnectorImpl) c1d1a.l2;
        final C1689710u4X c1689710u4X = (C1689710u4X) c1d1a.l0;
        final C11KT c11kt = (C11KT) interfaceC2329309At;
        bluetoothDevice.connectGatt(context, false, new BluetoothGattCallback() { // from class: X.1Bq5
            @Override // android.bluetooth.BluetoothGattCallback
            public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
                BluetoothGattService service;
                boolean zAdd;
                if (i == 0) {
                    if (bluetoothGatt != null && (service = bluetoothGatt.getService(UUID.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.service))) != null) {
                        BluetoothGattCharacteristic characteristic = service.getCharacteristic(UUID.fromString(ConnectNowAssetConfig.LIZ().connectNowUuid.characteristic));
                        if (characteristic == null) {
                            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZIZ("NearbyBle_Connector", "ERROR characteristic is null");
                            c11kt.onError(new IllegalStateException("Characteristic is null"));
                            return;
                        }
                        NearbyBleConnectorImpl nearbyBleConnectorImpl2 = nearbyBleConnectorImpl;
                        if (bluetoothGatt == null) {
                            nearbyBleConnectorImpl2.getClass();
                            C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW).LIZ("NearbyBle_Connector", "Error readCharacteristic, gatt is null");
                            zAdd = false;
                        } else {
                            zAdd = nearbyBleConnectorImpl2.LIZIZ.add(new ARunnableS67S0300000_34(bluetoothGatt, characteristic, nearbyBleConnectorImpl2, 20));
                            if (zAdd) {
                                nearbyBleConnectorImpl2.LIZIZ(bluetoothGatt);
                            }
                        }
                        C1910890zpH c1910890zpHLIZ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onServicesDiscovered, service uuid ");
                        sbLIZ.append(ConnectNowAssetConfig.LIZ().connectNowUuid.service);
                        sbLIZ.append(", start read charaster: ");
                        sbLIZ.append(zAdd);
                        c1910890zpHLIZ.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    C1910890zpH c1910890zpHLIZ2 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("ERROR onServicesDiscovered, service is null with ");
                    sbLIZ2.append(ConnectNowAssetConfig.LIZ().connectNowUuid.service);
                    c1910890zpHLIZ2.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ2));
                    c11kt.onError(new IllegalStateException("Service discovered is null"));
                    return;
                }
                InterfaceC2329309At<Pair<C1689710u4X, String>> interfaceC2329309At2 = c11kt;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Service discovered GATT state ");
                sbLIZ3.append(i);
                sbLIZ3.append(" is not success");
                interfaceC2329309At2.onError(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ3)));
                C1910890zpH c1910890zpHLIZ3 = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.CONNECT_NOW);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("ERROR onServicesDiscovered, GATT not success, ");
                sbLIZ4.append(i);
                c1910890zpHLIZ3.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ4));
            }

            /* JADX WARN: Type inference failed for: r4v1, types: [T, Y.ARunnableS67S0300000_34, java.lang.Runnable] */
            @Override // android.bluetooth.BluetoothGattCallback
            public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
                if (bluetoothGatt == null) {
                    c11kt.onError(new IllegalStateException("onConnectionStateChange: gatt is Null"));
                    return;
                }
                C1910880zpG c1910880zpG = C1910890zpH.LIZLLL;
                EnumC1910860zpE enumC1910860zpE = EnumC1910860zpE.CONNECT_NOW;
                C1910890zpH c1910890zpHLIZ = c1910880zpG.LIZ(enumC1910860zpE);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("GATT onConnectionStateChange, ");
                sbLIZ.append(i);
                sbLIZ.append(", ");
                sbLIZ.append(i2);
                sbLIZ.append(" (0 disconnected 1 STATE_CONNECTING 2 STATE_CONNECTED 3 disconnecting)");
                c1910890zpHLIZ.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ));
                if (i == 0) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    C1910890zpH c1910890zpHLIZ2 = c1910880zpG.LIZ(enumC1910860zpE);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("ERROR GATT onConnectionStateChange, ILLEGAL new state, ");
                                    sbLIZ2.append(i2);
                                    sbLIZ2.append(" (0 disconnected 1 STATE_CONNECTING 2 STATE_CONNECTED 3 disconnecting)");
                                    c1910890zpHLIZ2.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ2));
                                    return;
                                }
                                return;
                            }
                            nearbyBleConnectorImpl.LJ = bluetoothGatt;
                            int bondState = bluetoothGatt.getDevice().getBondState();
                            if (bondState != 10 && bondState != 12) {
                                return;
                            }
                            C259800zU c259800zU = new C259800zU();
                            ?? aRunnableS67S0300000_34 = new ARunnableS67S0300000_34(bluetoothGatt, c11kt, c259800zU, 10);
                            c259800zU.element = aRunnableS67S0300000_34;
                            NearbyBleConnectorImpl nearbyBleConnectorImpl2 = nearbyBleConnectorImpl;
                            c1910880zpG.LIZ(enumC1910860zpE).LIZ("NearbyBle_Connector", "GATT onConnectionStateChange, discover service post delayed 0.1s");
                            C786410Ut5.LJLIIL(100L, nearbyBleConnectorImpl2.LIZ, aRunnableS67S0300000_34);
                            return;
                        }
                        return;
                    }
                    c1910880zpG.LIZ(enumC1910860zpE).LIZ("NearbyBle_Connector", "GATT disconnected, close connection");
                    bluetoothGatt.close();
                    return;
                }
                C1910890zpH c1910890zpHLIZ3 = c1910880zpG.LIZ(enumC1910860zpE);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("ERROR GATT onConnectionStateChange status != 0, ");
                sbLIZ3.append(i);
                sbLIZ3.append(", ");
                sbLIZ3.append(i2);
                sbLIZ3.append(" (0 disconnected 1 STATE_CONNECTING 2 STATE_CONNECTED 3 disconnecting)");
                c1910890zpHLIZ3.LIZIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ3));
                InterfaceC2329309At<Pair<C1689710u4X, String>> interfaceC2329309At2 = c11kt;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("bluetooth status is not GATT_SUCCESS. code: ");
                sbLIZ4.append(i);
                interfaceC2329309At2.onError(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ4)));
                if (i2 == 0) {
                    bluetoothGatt.close();
                } else {
                    bluetoothGatt.disconnect();
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
                C1910880zpG c1910880zpG = C1910890zpH.LIZLLL;
                EnumC1910860zpE enumC1910860zpE = EnumC1910860zpE.CONNECT_NOW;
                C1910890zpH c1910890zpHLIZ = c1910880zpG.LIZ(enumC1910860zpE);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onCharacteristicRead ");
                sbLIZ.append(bluetoothGattCharacteristic.getUuid());
                sbLIZ.append(' ');
                sbLIZ.append(i);
                sbLIZ.append(' ');
                Charset charset = Charsets.UTF_8;
                sbLIZ.append(new String(bArr, charset));
                c1910890zpHLIZ.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ));
                if (i != 0) {
                    C1910890zpH c1910890zpHLIZ2 = c1910880zpG.LIZ(enumC1910860zpE);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error onCharacteristicRead status ");
                    sbLIZ2.append(i);
                    c1910890zpHLIZ2.LIZIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ2));
                    nearbyBleConnectorImpl.LIZJ(bluetoothGatt);
                    return;
                }
                String str = new String(bArr, charset);
                c11kt.onSuccess(new Pair<>(c1689710u4X, str));
                C1910890zpH c1910890zpHLIZ3 = c1910880zpG.LIZ(enumC1910860zpE);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("CHAR READ: ");
                sbLIZ3.append(str);
                sbLIZ3.append(", status: ");
                sbLIZ3.append(i);
                c1910890zpHLIZ3.LIZ("NearbyBle_Connector", C2188811AlT.LIZIZ(sbLIZ3));
                NearbyBleConnectorImpl nearbyBleConnectorImpl2 = nearbyBleConnectorImpl;
                nearbyBleConnectorImpl2.LIZJ = false;
                ((LinkedBlockingQueue) nearbyBleConnectorImpl2.LIZIZ).poll();
                nearbyBleConnectorImpl2.LIZLLL = 0;
                nearbyBleConnectorImpl2.LIZIZ(bluetoothGatt);
            }
        }, 2);
    }

    public C1D1A(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
