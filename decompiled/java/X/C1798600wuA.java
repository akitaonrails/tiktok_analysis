package X;

import Y.AComparatorS28S0000000_9;
import android.content.Context;
import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.TelephonyManager;
import com.bytedance.ropa.encrypt.RopaEncrypt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wuA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798600wuA {
    public final C1798560wu6 LIZ;
    public final TelephonyManager LIZIZ;

    public static InterfaceC1798610wuB LIZ(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoGsm) {
            final CellInfoGsm cellInfoGsm = (CellInfoGsm) cellInfo;
            return new InterfaceC1798610wuB(cellInfoGsm) { // from class: X.0x1Z
                public final CellInfoGsm LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v36 */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v4 */
                @Override // X.InterfaceC1798610wuB
                public final Map<String, Object> LIZ() throws Throwable {
                    CellSignalStrengthGsm cellSignalStrength;
                    int i;
                    Object obj;
                    int i2;
                    int bsic;
                    Object obj2;
                    int lac;
                    Object obj3;
                    int cid;
                    Object obj4;
                    if (Build.VERSION.SDK_INT < 30) {
                        return C2097608Jq.LJ();
                    }
                    CellIdentityGsm cellIdentity = this.LIZ.getCellIdentity();
                    CellInfoGsm cellInfoGsm2 = this.LIZ;
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulMl5e4knk6hrS+zfVctKZKuNw", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrengthGsm;", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoGsm", "getCellSignalStrength", cellInfoGsm2, objArr, "android.telephony.CellSignalStrengthGsm", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoGsm", "getCellSignalStrength", null, objArr, cellInfoGsm2, c0wzw, false);
                        cellSignalStrength = (CellSignalStrengthGsm) c0wsuLIZIZ.LIZIZ;
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null && (obj = objArr2[0]) != null) {
                            cellInfoGsm2 = (CellInfoGsm) obj;
                        }
                        cellSignalStrength = cellInfoGsm2.getCellSignalStrength();
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoGsm", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoGsm2, c0wzw, true);
                    }
                    Pair[] pairArr = new Pair[10];
                    pairArr[i] = new Pair("type", "gsm");
                    C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulMl5e4knk6hrS+zfVctKZKuNw", null);
                    C0WST c0wst2 = new C0WST();
                    Object[] objArr3 = new Object[i];
                    C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                    C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(10269, "android/telephony/CellIdentityGsm", "getBsic", cellIdentity, objArr3, "int", c0wzw2);
                    if (c0wsuLIZIZ2.LIZ) {
                        i2 = 0;
                        c0wst2.LIZ(10269, "android/telephony/CellIdentityGsm", "getBsic", null, objArr3, cellIdentity, c0wzw2, i);
                        bsic = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                    } else {
                        i2 = 0;
                        Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                        CellIdentityGsm cellIdentityGsm = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentity : (CellIdentityGsm) obj2;
                        bsic = cellIdentityGsm.getBsic();
                        c0wst2.LIZ(10269, "android/telephony/CellIdentityGsm", "getBsic", Integer.valueOf(bsic), objArr3, cellIdentityGsm, c0wzw2, true);
                    }
                    pairArr[1] = new Pair("bid", Integer.valueOf(bsic));
                    pairArr[2] = new Pair("mcc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMccString())));
                    pairArr[3] = new Pair("mnc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMncString())));
                    C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulMl5e4knk6hrS+zfVctKZKuNw", null);
                    C0WST c0wst3 = new C0WST();
                    Object[] objArr5 = new Object[i];
                    C0WZW c0wzw3 = new C0WZW(i2, "()I", c0wzx3);
                    CellIdentityGsm cellIdentityGsm2 = cellIdentity;
                    C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10271, "android/telephony/CellIdentityGsm", "getLac", cellIdentityGsm2, objArr5, "int", c0wzw3);
                    if (c0wsuLIZIZ3.LIZ) {
                        cellIdentityGsm2 = cellIdentityGsm2;
                        c0wst3.LIZ(10271, "android/telephony/CellIdentityGsm", "getLac", null, objArr5, cellIdentityGsm2, c0wzw3, i2);
                        lac = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                    } else {
                        Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                        CellIdentityGsm cellIdentityGsm3 = (objArr6 == null || (obj3 = objArr6[i2]) == null) ? cellIdentityGsm2 : (CellIdentityGsm) obj3;
                        lac = cellIdentityGsm3.getLac();
                        c0wst3.LIZ(10271, "android/telephony/CellIdentityGsm", "getLac", Integer.valueOf(lac), objArr5, cellIdentityGsm3, c0wzw3, true);
                    }
                    pairArr[4] = new Pair("lac", Integer.valueOf(lac));
                    C0WZX c0wzx4 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulMl5e4knk6hrS+zfVctKZKuNw", null);
                    C0WST c0wst4 = new C0WST();
                    Object[] objArr7 = new Object[i2];
                    C0WZW c0wzw4 = new C0WZW(i2, "()I", c0wzx4);
                    CellIdentityGsm cellIdentityGsm4 = cellIdentityGsm2;
                    C0WSU c0wsuLIZIZ4 = c0wst4.LIZIZ(10270, "android/telephony/CellIdentityGsm", "getCid", cellIdentityGsm4, objArr7, "int", c0wzw4);
                    if (c0wsuLIZIZ4.LIZ) {
                        cellIdentityGsm4 = cellIdentityGsm4;
                        c0wst4.LIZ(10270, "android/telephony/CellIdentityGsm", "getCid", null, objArr7, cellIdentityGsm4, c0wzw4, i2);
                        cid = ((Integer) c0wsuLIZIZ4.LIZIZ).intValue();
                    } else {
                        Object[] objArr8 = c0wsuLIZIZ4.LIZJ;
                        CellIdentityGsm cellIdentityGsm5 = (objArr8 == null || (obj4 = objArr8[i2]) == null) ? cellIdentityGsm4 : (CellIdentityGsm) obj4;
                        cid = cellIdentityGsm5.getCid();
                        c0wst4.LIZ(10270, "android/telephony/CellIdentityGsm", "getCid", Integer.valueOf(cid), objArr7, cellIdentityGsm5, c0wzw4, true);
                    }
                    pairArr[5] = new Pair("cid", Integer.valueOf(cid));
                    pairArr[6] = new Pair("earfcn", Integer.valueOf(cellIdentityGsm4.getArfcn()));
                    pairArr[7] = new Pair("dbm", Integer.valueOf(cellSignalStrength.getDbm()));
                    pairArr[8] = new Pair("rssi", Integer.valueOf(cellSignalStrength.getRssi()));
                    pairArr[9] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                    Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : setEntrySet) {
                        Map.Entry entry = (Map.Entry) obj5;
                        if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Map.Entry) it2.next()).getKey());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        mapLJIIJ.remove(it3.next());
                    }
                    return mapLJIIJ;
                }

                {
                    this.LIZ = cellInfoGsm;
                }
            };
        }
        if (cellInfo instanceof CellInfoCdma) {
            final CellInfoCdma cellInfoCdma = (CellInfoCdma) cellInfo;
            return new InterfaceC1798610wuB(cellInfoCdma) { // from class: X.0x1Y
                public final CellInfoCdma LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v51 */
                /* JADX WARN: Type inference failed for: r1v23 */
                /* JADX WARN: Type inference failed for: r1v8 */
                @Override // X.InterfaceC1798610wuB
                public final Map<String, Object> LIZ() throws Throwable {
                    CellSignalStrengthCdma cellSignalStrength;
                    int i;
                    Object obj;
                    int i2;
                    int networkId;
                    Object obj2;
                    int systemId;
                    Object obj3;
                    int latitude;
                    Object obj4;
                    int longitude;
                    Object obj5;
                    CellIdentityCdma cellIdentity = this.LIZ.getCellIdentity();
                    CellInfoCdma cellInfoCdma2 = this.LIZ;
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNklewG/t6j/18z7tV8GIWpJ8TA==", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrengthCdma;", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoCdma", "getCellSignalStrength", cellInfoCdma2, objArr, "android.telephony.CellSignalStrengthCdma", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoCdma", "getCellSignalStrength", null, objArr, cellInfoCdma2, c0wzw, false);
                        cellSignalStrength = (CellSignalStrengthCdma) c0wsuLIZIZ.LIZIZ;
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null && (obj = objArr2[0]) != null) {
                            cellInfoCdma2 = (CellInfoCdma) obj;
                        }
                        cellSignalStrength = cellInfoCdma2.getCellSignalStrength();
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoCdma", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoCdma2, c0wzw, true);
                    }
                    Pair[] pairArr = new Pair[9];
                    pairArr[i] = new Pair("type", "cdma");
                    pairArr[1] = new Pair("bid", Integer.valueOf(cellIdentity.getBasestationId()));
                    C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNklewG/t6j/18z7tV8GIWpJ8TA==", null);
                    C0WST c0wst2 = new C0WST();
                    Object[] objArr3 = new Object[i];
                    C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                    C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(10281, "android/telephony/CellIdentityCdma", "getNetworkId", cellIdentity, objArr3, "int", c0wzw2);
                    if (c0wsuLIZIZ2.LIZ) {
                        i2 = 0;
                        c0wst2.LIZ(10281, "android/telephony/CellIdentityCdma", "getNetworkId", null, objArr3, cellIdentity, c0wzw2, i);
                        networkId = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                    } else {
                        i2 = 0;
                        Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                        CellIdentityCdma cellIdentityCdma = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentity : (CellIdentityCdma) obj2;
                        networkId = cellIdentityCdma.getNetworkId();
                        c0wst2.LIZ(10281, "android/telephony/CellIdentityCdma", "getNetworkId", Integer.valueOf(networkId), objArr3, cellIdentityCdma, c0wzw2, true);
                    }
                    pairArr[2] = new Pair("nid", Integer.valueOf(networkId));
                    C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNklewG/t6j/18z7tV8GIWpJ8TA==", null);
                    C0WST c0wst3 = new C0WST();
                    Object[] objArr5 = new Object[i];
                    C0WZW c0wzw3 = new C0WZW(i2, "()I", c0wzx3);
                    C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10282, "android/telephony/CellIdentityCdma", "getSystemId", cellIdentity, objArr5, "int", c0wzw3);
                    if (c0wsuLIZIZ3.LIZ) {
                        c0wst3.LIZ(10282, "android/telephony/CellIdentityCdma", "getSystemId", null, objArr5, cellIdentity, c0wzw3, i2);
                        systemId = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                    } else {
                        Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                        CellIdentityCdma cellIdentityCdma2 = (objArr6 == null || (obj3 = objArr6[i2]) == null) ? cellIdentity : (CellIdentityCdma) obj3;
                        systemId = cellIdentityCdma2.getSystemId();
                        c0wst3.LIZ(10282, "android/telephony/CellIdentityCdma", "getSystemId", Integer.valueOf(systemId), objArr5, cellIdentityCdma2, c0wzw3, true);
                    }
                    pairArr[3] = new Pair("sid", Integer.valueOf(systemId));
                    C0WZX c0wzx4 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNklewG/t6j/18z7tV8GIWpJ8TA==", null);
                    C0WST c0wst4 = new C0WST();
                    Object[] objArr7 = new Object[i2];
                    C0WZW c0wzw4 = new C0WZW(i2, "()I", c0wzx4);
                    C0WSU c0wsuLIZIZ4 = c0wst4.LIZIZ(10279, "android/telephony/CellIdentityCdma", "getLatitude", cellIdentity, objArr7, "int", c0wzw4);
                    if (c0wsuLIZIZ4.LIZ) {
                        c0wst4.LIZ(10279, "android/telephony/CellIdentityCdma", "getLatitude", null, objArr7, cellIdentity, c0wzw4, i2);
                        latitude = ((Integer) c0wsuLIZIZ4.LIZIZ).intValue();
                    } else {
                        Object[] objArr8 = c0wsuLIZIZ4.LIZJ;
                        CellIdentityCdma cellIdentityCdma3 = (objArr8 == null || (obj4 = objArr8[i2]) == null) ? cellIdentity : (CellIdentityCdma) obj4;
                        latitude = cellIdentityCdma3.getLatitude();
                        c0wst4.LIZ(10279, "android/telephony/CellIdentityCdma", "getLatitude", Integer.valueOf(latitude), objArr7, cellIdentityCdma3, c0wzw4, true);
                    }
                    pairArr[4] = new Pair("lat", Integer.valueOf(latitude));
                    C0WZX c0wzx5 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulNklewG/t6j/18z7tV8GIWpJ8TA==", null);
                    C0WST c0wst5 = new C0WST();
                    Object[] objArr9 = new Object[i2];
                    C0WZW c0wzw5 = new C0WZW(i2, "()I", c0wzx5);
                    C0WSU c0wsuLIZIZ5 = c0wst5.LIZIZ(10280, "android/telephony/CellIdentityCdma", "getLongitude", cellIdentity, objArr9, "int", c0wzw5);
                    if (c0wsuLIZIZ5.LIZ) {
                        c0wst5.LIZ(10280, "android/telephony/CellIdentityCdma", "getLongitude", null, objArr9, cellIdentity, c0wzw5, i2);
                        longitude = ((Integer) c0wsuLIZIZ5.LIZIZ).intValue();
                    } else {
                        Object[] objArr10 = c0wsuLIZIZ5.LIZJ;
                        if (objArr10 != null && (obj5 = objArr10[i2]) != null) {
                            cellIdentity = (CellIdentityCdma) obj5;
                        }
                        longitude = cellIdentity.getLongitude();
                        c0wst5.LIZ(10280, "android/telephony/CellIdentityCdma", "getLongitude", Integer.valueOf(longitude), objArr9, cellIdentity, c0wzw5, true);
                    }
                    pairArr[5] = new Pair("lon", Integer.valueOf(longitude));
                    pairArr[6] = new Pair("dbm", Integer.valueOf(cellSignalStrength.getDbm()));
                    pairArr[7] = new Pair("rssi", Integer.valueOf(cellSignalStrength.getCdmaDbm()));
                    pairArr[8] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                    Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : setEntrySet) {
                        Map.Entry entry = (Map.Entry) obj6;
                        if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                            arrayList.add(obj6);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Map.Entry) it2.next()).getKey());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        mapLJIIJ.remove(it3.next());
                    }
                    return mapLJIIJ;
                }

                {
                    this.LIZ = cellInfoCdma;
                }
            };
        }
        if (cellInfo instanceof CellInfoWcdma) {
            final CellInfoWcdma cellInfoWcdma = (CellInfoWcdma) cellInfo;
            return new InterfaceC1798610wuB(cellInfoWcdma) { // from class: X.0x1b
                public final CellInfoWcdma LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v46 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r2v12 */
                /* JADX WARN: Type inference failed for: r2v24 */
                @Override // X.InterfaceC1798610wuB
                public final Map<String, Object> LIZ() throws Throwable {
                    CellSignalStrengthWcdma cellSignalStrength;
                    int i;
                    Object obj;
                    int i2;
                    int lac;
                    Object obj2;
                    int cid;
                    Object obj3;
                    int psc;
                    Object obj4;
                    if (Build.VERSION.SDK_INT < 28) {
                        return C2097608Jq.LJ();
                    }
                    CellIdentityWcdma cellIdentity = this.LIZ.getCellIdentity();
                    CellInfoWcdma cellInfoWcdma2 = this.LIZ;
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIk5XzE3L4z/Q1Dbkb+SbcmGN5W0=", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrengthWcdma;", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoWcdma", "getCellSignalStrength", cellInfoWcdma2, objArr, "android.telephony.CellSignalStrengthWcdma", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoWcdma", "getCellSignalStrength", null, objArr, cellInfoWcdma2, c0wzw, false);
                        cellSignalStrength = (CellSignalStrengthWcdma) c0wsuLIZIZ.LIZIZ;
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null && (obj = objArr2[0]) != null) {
                            cellInfoWcdma2 = (CellInfoWcdma) obj;
                        }
                        cellSignalStrength = cellInfoWcdma2.getCellSignalStrength();
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoWcdma", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoWcdma2, c0wzw, true);
                    }
                    Pair[] pairArr = new Pair[9];
                    pairArr[i] = new Pair("type", "wcdma");
                    pairArr[1] = new Pair("mcc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMccString())));
                    pairArr[2] = new Pair("mnc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMncString())));
                    C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIk5XzE3L4z/Q1Dbkb+SbcmGN5W0=", null);
                    C0WST c0wst2 = new C0WST();
                    Object[] objArr3 = new Object[i];
                    C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                    C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(10295, "android/telephony/CellIdentityWcdma", "getLac", cellIdentity, objArr3, "int", c0wzw2);
                    if (c0wsuLIZIZ2.LIZ) {
                        i2 = 0;
                        c0wst2.LIZ(10295, "android/telephony/CellIdentityWcdma", "getLac", null, objArr3, cellIdentity, c0wzw2, i);
                        lac = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                    } else {
                        i2 = 0;
                        Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                        CellIdentityWcdma cellIdentityWcdma = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentity : (CellIdentityWcdma) obj2;
                        lac = cellIdentityWcdma.getLac();
                        c0wst2.LIZ(10295, "android/telephony/CellIdentityWcdma", "getLac", Integer.valueOf(lac), objArr3, cellIdentityWcdma, c0wzw2, true);
                    }
                    pairArr[3] = new Pair("lac", Integer.valueOf(lac));
                    C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIk5XzE3L4z/Q1Dbkb+SbcmGN5W0=", null);
                    C0WST c0wst3 = new C0WST();
                    Object[] objArr5 = new Object[i];
                    C0WZW c0wzw3 = new C0WZW(i2, "()I", c0wzx3);
                    CellIdentityWcdma cellIdentityWcdma2 = cellIdentity;
                    C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10294, "android/telephony/CellIdentityWcdma", "getCid", cellIdentityWcdma2, objArr5, "int", c0wzw3);
                    if (c0wsuLIZIZ3.LIZ) {
                        cellIdentityWcdma2 = cellIdentityWcdma2;
                        c0wst3.LIZ(10294, "android/telephony/CellIdentityWcdma", "getCid", null, objArr5, cellIdentityWcdma2, c0wzw3, i2);
                        cid = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                    } else {
                        Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                        CellIdentityWcdma cellIdentityWcdma3 = (objArr6 == null || (obj3 = objArr6[i2]) == null) ? cellIdentityWcdma2 : (CellIdentityWcdma) obj3;
                        cid = cellIdentityWcdma3.getCid();
                        c0wst3.LIZ(10294, "android/telephony/CellIdentityWcdma", "getCid", Integer.valueOf(cid), objArr5, cellIdentityWcdma3, c0wzw3, true);
                    }
                    pairArr[4] = new Pair("cid", Integer.valueOf(cid));
                    C0WZX c0wzx4 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIk5XzE3L4z/Q1Dbkb+SbcmGN5W0=", null);
                    C0WST c0wst4 = new C0WST();
                    Object[] objArr7 = new Object[i2];
                    C0WZW c0wzw4 = new C0WZW(i2, "()I", c0wzx4);
                    CellIdentityWcdma cellIdentityWcdma4 = cellIdentityWcdma2;
                    C0WSU c0wsuLIZIZ4 = c0wst4.LIZIZ(10301, "android/telephony/CellIdentityWcdma", "getPsc", cellIdentityWcdma4, objArr7, "int", c0wzw4);
                    if (c0wsuLIZIZ4.LIZ) {
                        cellIdentityWcdma4 = cellIdentityWcdma4;
                        c0wst4.LIZ(10301, "android/telephony/CellIdentityWcdma", "getPsc", null, objArr7, cellIdentityWcdma4, c0wzw4, i2);
                        psc = ((Integer) c0wsuLIZIZ4.LIZIZ).intValue();
                    } else {
                        Object[] objArr8 = c0wsuLIZIZ4.LIZJ;
                        CellIdentityWcdma cellIdentityWcdma5 = (objArr8 == null || (obj4 = objArr8[i2]) == null) ? cellIdentityWcdma4 : (CellIdentityWcdma) obj4;
                        psc = cellIdentityWcdma5.getPsc();
                        c0wst4.LIZ(10301, "android/telephony/CellIdentityWcdma", "getPsc", Integer.valueOf(psc), objArr7, cellIdentityWcdma5, c0wzw4, true);
                    }
                    pairArr[5] = new Pair("psc", Integer.valueOf(psc));
                    pairArr[6] = new Pair("earfcn", Integer.valueOf(cellIdentityWcdma4.getUarfcn()));
                    pairArr[7] = new Pair("dbm", Integer.valueOf(cellSignalStrength.getDbm()));
                    pairArr[8] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                    Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj5 : setEntrySet) {
                        Map.Entry entry = (Map.Entry) obj5;
                        if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                            arrayList.add(obj5);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Map.Entry) it2.next()).getKey());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        mapLJIIJ.remove(it3.next());
                    }
                    return mapLJIIJ;
                }

                {
                    this.LIZ = cellInfoWcdma;
                }
            };
        }
        if (cellInfo instanceof CellInfoLte) {
            final CellInfoLte cellInfoLte = (CellInfoLte) cellInfo;
            return new InterfaceC1798610wuB(cellInfoLte) { // from class: X.0x1d
                public final CellInfoLte LIZ;

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r0v52 */
                /* JADX WARN: Type inference failed for: r1v13 */
                /* JADX WARN: Type inference failed for: r1v27 */
                @Override // X.InterfaceC1798610wuB
                public final Map<String, Object> LIZ() throws Throwable {
                    CellSignalStrengthLte cellSignalStrength;
                    int i;
                    Object obj;
                    int i2;
                    int tac;
                    Object obj2;
                    int ci;
                    Object obj3;
                    int pci;
                    Object obj4;
                    int bandwidth;
                    Object obj5;
                    if (Build.VERSION.SDK_INT < 28) {
                        return C2097608Jq.LJ();
                    }
                    CellIdentityLte cellIdentity = this.LIZ.getCellIdentity();
                    CellInfoLte cellInfoLte2 = this.LIZ;
                    C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulOVlW4knk6hrS+zfVctKZKvdU", null);
                    C0WST c0wst = new C0WST();
                    Object[] objArr = new Object[0];
                    C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrengthLte;", c0wzx);
                    C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoLte", "getCellSignalStrength", cellInfoLte2, objArr, "android.telephony.CellSignalStrengthLte", c0wzw);
                    if (c0wsuLIZIZ.LIZ) {
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoLte", "getCellSignalStrength", null, objArr, cellInfoLte2, c0wzw, false);
                        cellSignalStrength = (CellSignalStrengthLte) c0wsuLIZIZ.LIZIZ;
                    } else {
                        Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                        if (objArr2 != null && (obj = objArr2[0]) != null) {
                            cellInfoLte2 = (CellInfoLte) obj;
                        }
                        cellSignalStrength = cellInfoLte2.getCellSignalStrength();
                        i = 0;
                        c0wst.LIZ(10303, "android/telephony/CellInfoLte", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoLte2, c0wzw, true);
                    }
                    Pair[] pairArr = new Pair[10];
                    pairArr[i] = new Pair("type", "lte");
                    pairArr[1] = new Pair("mcc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMccString())));
                    pairArr[2] = new Pair("mnc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMncString())));
                    C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulOVlW4knk6hrS+zfVctKZKvdU", null);
                    C0WST c0wst2 = new C0WST();
                    Object[] objArr3 = new Object[i];
                    C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                    C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(102016, "android/telephony/CellIdentityLte", "getTac", cellIdentity, objArr3, "int", c0wzw2);
                    if (c0wsuLIZIZ2.LIZ) {
                        i2 = 0;
                        c0wst2.LIZ(102016, "android/telephony/CellIdentityLte", "getTac", null, objArr3, cellIdentity, c0wzw2, i);
                        tac = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                    } else {
                        i2 = 0;
                        Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                        CellIdentityLte cellIdentityLte = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentity : (CellIdentityLte) obj2;
                        tac = cellIdentityLte.getTac();
                        c0wst2.LIZ(102016, "android/telephony/CellIdentityLte", "getTac", Integer.valueOf(tac), objArr3, cellIdentityLte, c0wzw2, true);
                    }
                    pairArr[3] = new Pair("tac", Integer.valueOf(tac));
                    C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulOVlW4knk6hrS+zfVctKZKvdU", null);
                    C0WST c0wst3 = new C0WST();
                    Object[] objArr5 = new Object[i];
                    C0WZW c0wzw3 = new C0WZW(i2, "()I", c0wzx3);
                    C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10262, "android/telephony/CellIdentityLte", "getCi", cellIdentity, objArr5, "int", c0wzw3);
                    if (c0wsuLIZIZ3.LIZ) {
                        c0wst3.LIZ(10262, "android/telephony/CellIdentityLte", "getCi", null, objArr5, cellIdentity, c0wzw3, i2);
                        ci = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                    } else {
                        Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                        CellIdentityLte cellIdentityLte2 = (objArr6 == null || (obj3 = objArr6[i2]) == null) ? cellIdentity : (CellIdentityLte) obj3;
                        ci = cellIdentityLte2.getCi();
                        c0wst3.LIZ(10262, "android/telephony/CellIdentityLte", "getCi", Integer.valueOf(ci), objArr5, cellIdentityLte2, c0wzw3, true);
                    }
                    pairArr[4] = new Pair("ci", Integer.valueOf(ci));
                    C0WZX c0wzx4 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulOVlW4knk6hrS+zfVctKZKvdU", null);
                    C0WST c0wst4 = new C0WST();
                    Object[] objArr7 = new Object[i2];
                    C0WZW c0wzw4 = new C0WZW(i2, "()I", c0wzx4);
                    C0WSU c0wsuLIZIZ4 = c0wst4.LIZIZ(10268, "android/telephony/CellIdentityLte", "getPci", cellIdentity, objArr7, "int", c0wzw4);
                    if (c0wsuLIZIZ4.LIZ) {
                        c0wst4.LIZ(10268, "android/telephony/CellIdentityLte", "getPci", null, objArr7, cellIdentity, c0wzw4, i2);
                        pci = ((Integer) c0wsuLIZIZ4.LIZIZ).intValue();
                    } else {
                        Object[] objArr8 = c0wsuLIZIZ4.LIZJ;
                        CellIdentityLte cellIdentityLte3 = (objArr8 == null || (obj4 = objArr8[i2]) == null) ? cellIdentity : (CellIdentityLte) obj4;
                        pci = cellIdentityLte3.getPci();
                        c0wst4.LIZ(10268, "android/telephony/CellIdentityLte", "getPci", Integer.valueOf(pci), objArr7, cellIdentityLte3, c0wzw4, true);
                    }
                    pairArr[5] = new Pair("pci", Integer.valueOf(pci));
                    pairArr[6] = new Pair("earfcn", Integer.valueOf(cellIdentity.getEarfcn()));
                    C0WZX c0wzx5 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulOVlW4knk6hrS+zfVctKZKvdU", null);
                    C0WST c0wst5 = new C0WST();
                    Object[] objArr9 = new Object[i2];
                    C0WZW c0wzw5 = new C0WZW(i2, "()I", c0wzx5);
                    C0WSU c0wsuLIZIZ5 = c0wst5.LIZIZ(10261, "android/telephony/CellIdentityLte", "getBandwidth", cellIdentity, objArr9, "int", c0wzw5);
                    if (c0wsuLIZIZ5.LIZ) {
                        c0wst5.LIZ(10261, "android/telephony/CellIdentityLte", "getBandwidth", null, objArr9, cellIdentity, c0wzw5, i2);
                        bandwidth = ((Integer) c0wsuLIZIZ5.LIZIZ).intValue();
                    } else {
                        Object[] objArr10 = c0wsuLIZIZ5.LIZJ;
                        if (objArr10 != null && (obj5 = objArr10[i2]) != null) {
                            cellIdentity = (CellIdentityLte) obj5;
                        }
                        bandwidth = cellIdentity.getBandwidth();
                        c0wst5.LIZ(10261, "android/telephony/CellIdentityLte", "getBandwidth", Integer.valueOf(bandwidth), objArr9, cellIdentity, c0wzw5, true);
                    }
                    pairArr[7] = new Pair("bw", Integer.valueOf(bandwidth));
                    pairArr[8] = new Pair("dbm", Integer.valueOf(cellSignalStrength.getDbm()));
                    pairArr[9] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                    Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                    Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj6 : setEntrySet) {
                        Map.Entry entry = (Map.Entry) obj6;
                        if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                            arrayList.add(obj6);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Map.Entry) it2.next()).getKey());
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        mapLJIIJ.remove(it3.next());
                    }
                    return mapLJIIJ;
                }

                {
                    this.LIZ = cellInfoLte;
                }
            };
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (cellInfo instanceof CellInfoTdscdma) {
                final CellInfoTdscdma cellInfoTdscdma = (CellInfoTdscdma) cellInfo;
                return new InterfaceC1798610wuB(cellInfoTdscdma) { // from class: X.0x1a
                    public final CellInfoTdscdma LIZ;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r1v27 */
                    /* JADX WARN: Type inference failed for: r1v4 */
                    /* JADX WARN: Type inference failed for: r2v12 */
                    /* JADX WARN: Type inference failed for: r2v13, types: [boolean] */
                    /* JADX WARN: Type inference failed for: r2v24 */
                    @Override // X.InterfaceC1798610wuB
                    public final Map<String, Object> LIZ() throws Throwable {
                        CellSignalStrengthTdscdma cellSignalStrength;
                        int i;
                        Object obj;
                        boolean z;
                        int lac;
                        Object obj2;
                        int cid;
                        Object obj3;
                        if (Build.VERSION.SDK_INT < 29) {
                            return C2097608Jq.LJ();
                        }
                        CellIdentityTdscdma cellIdentity = this.LIZ.getCellIdentity();
                        CellInfoTdscdma cellInfoTdscdma2 = this.LIZ;
                        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIUlAwkjl5xDZ8TTLbtWGl8OmBlQ/dA==", null);
                        C0WST c0wst = new C0WST();
                        Object[] objArr = new Object[0];
                        C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrengthTdscdma;", c0wzx);
                        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoTdscdma", "getCellSignalStrength", cellInfoTdscdma2, objArr, "android.telephony.CellSignalStrengthTdscdma", c0wzw);
                        if (c0wsuLIZIZ.LIZ) {
                            i = 0;
                            c0wst.LIZ(10303, "android/telephony/CellInfoTdscdma", "getCellSignalStrength", null, objArr, cellInfoTdscdma2, c0wzw, false);
                            cellSignalStrength = (CellSignalStrengthTdscdma) c0wsuLIZIZ.LIZIZ;
                        } else {
                            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                            if (objArr2 != null && (obj = objArr2[0]) != null) {
                                cellInfoTdscdma2 = (CellInfoTdscdma) obj;
                            }
                            cellSignalStrength = cellInfoTdscdma2.getCellSignalStrength();
                            i = 0;
                            c0wst.LIZ(10303, "android/telephony/CellInfoTdscdma", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoTdscdma2, c0wzw, true);
                        }
                        Pair[] pairArr = new Pair[8];
                        pairArr[i] = new Pair("type", "tdscdma");
                        pairArr[1] = new Pair("mcc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMccString())));
                        pairArr[2] = new Pair("mnc", Integer.valueOf(C1803240x1e.LIZ(cellIdentity.getMncString())));
                        C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIUlAwkjl5xDZ8TTLbtWGl8OmBlQ/dA==", null);
                        C0WST c0wst2 = new C0WST();
                        Object[] objArr3 = new Object[i];
                        C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                        C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(10290, "android/telephony/CellIdentityTdscdma", "getLac", cellIdentity, objArr3, "int", c0wzw2);
                        if (c0wsuLIZIZ2.LIZ) {
                            z = 0;
                            c0wst2.LIZ(10290, "android/telephony/CellIdentityTdscdma", "getLac", null, objArr3, cellIdentity, c0wzw2, i);
                            lac = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                        } else {
                            z = 0;
                            Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                            CellIdentityTdscdma cellIdentityTdscdma = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentity : (CellIdentityTdscdma) obj2;
                            lac = cellIdentityTdscdma.getLac();
                            c0wst2.LIZ(10290, "android/telephony/CellIdentityTdscdma", "getLac", Integer.valueOf(lac), objArr3, cellIdentityTdscdma, c0wzw2, true);
                        }
                        pairArr[3] = new Pair("lac", Integer.valueOf(lac));
                        C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulIUlAwkjl5xDZ8TTLbtWGl8OmBlQ/dA==", null);
                        C0WST c0wst3 = new C0WST();
                        Object[] objArr5 = new Object[i];
                        C0WZW c0wzw3 = new C0WZW(z, "()I", c0wzx3);
                        CellIdentityTdscdma cellIdentityTdscdma2 = cellIdentity;
                        C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10288, "android/telephony/CellIdentityTdscdma", "getCid", cellIdentityTdscdma2, objArr5, "int", c0wzw3);
                        if (c0wsuLIZIZ3.LIZ) {
                            cellIdentityTdscdma2 = cellIdentityTdscdma2;
                            c0wst3.LIZ(10288, "android/telephony/CellIdentityTdscdma", "getCid", null, objArr5, cellIdentityTdscdma2, c0wzw3, z);
                            cid = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                        } else {
                            Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                            CellIdentityTdscdma cellIdentityTdscdma3 = (objArr6 == null || (obj3 = objArr6[z]) == null) ? cellIdentityTdscdma2 : (CellIdentityTdscdma) obj3;
                            cid = cellIdentityTdscdma3.getCid();
                            c0wst3.LIZ(10288, "android/telephony/CellIdentityTdscdma", "getCid", Integer.valueOf(cid), objArr5, cellIdentityTdscdma3, c0wzw3, true);
                        }
                        pairArr[4] = new Pair("cid", Integer.valueOf(cid));
                        pairArr[5] = new Pair("earfcn", Integer.valueOf(cellIdentityTdscdma2.getUarfcn()));
                        pairArr[6] = new Pair("dbm", Integer.valueOf(cellSignalStrength.getDbm()));
                        pairArr[7] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj4 : setEntrySet) {
                            Map.Entry entry = (Map.Entry) obj4;
                            if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                                arrayList.add(obj4);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Map.Entry) it2.next()).getKey());
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            mapLJIIJ.remove(it3.next());
                        }
                        return mapLJIIJ;
                    }

                    {
                        this.LIZ = cellInfoTdscdma;
                    }
                };
            }
            if (cellInfo instanceof CellInfoNr) {
                final CellInfoNr cellInfoNr = (CellInfoNr) cellInfo;
                return new InterfaceC1798610wuB(cellInfoNr) { // from class: X.0x1c
                    public final CellInfoNr LIZ;

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v46 */
                    /* JADX WARN: Type inference failed for: r0v5 */
                    /* JADX WARN: Type inference failed for: r2v15 */
                    /* JADX WARN: Type inference failed for: r2v23 */
                    @Override // X.InterfaceC1798610wuB
                    public final Map<String, Object> LIZ() throws Throwable {
                        CellSignalStrength cellSignalStrength;
                        int i;
                        Object obj;
                        int i2;
                        int pci;
                        Object obj2;
                        int tac;
                        Object obj3;
                        long nci;
                        Object obj4;
                        if (Build.VERSION.SDK_INT < 29) {
                            return C2097608Jq.LJ();
                        }
                        CellIdentityNr cellIdentityNr = (CellIdentityNr) this.LIZ.getCellIdentity();
                        CellInfoNr cellInfoNr2 = this.LIZ;
                        C0WZX c0wzx = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulO19wxEDkzz3a8g/wYcOZmjI=", null);
                        C0WST c0wst = new C0WST();
                        Object[] objArr = new Object[0];
                        C0WZW c0wzw = new C0WZW(false, "()Landroid/telephony/CellSignalStrength;", c0wzx);
                        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(10303, "android/telephony/CellInfoNr", "getCellSignalStrength", cellInfoNr2, objArr, "android.telephony.CellSignalStrength", c0wzw);
                        if (c0wsuLIZIZ.LIZ) {
                            i = 0;
                            c0wst.LIZ(10303, "android/telephony/CellInfoNr", "getCellSignalStrength", null, objArr, cellInfoNr2, c0wzw, false);
                            cellSignalStrength = (CellSignalStrength) c0wsuLIZIZ.LIZIZ;
                        } else {
                            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
                            if (objArr2 != null && (obj = objArr2[0]) != null) {
                                cellInfoNr2 = (CellInfoNr) obj;
                            }
                            cellSignalStrength = cellInfoNr2.getCellSignalStrength();
                            i = 0;
                            c0wst.LIZ(10303, "android/telephony/CellInfoNr", "getCellSignalStrength", cellSignalStrength, objArr, cellInfoNr2, c0wzw, true);
                        }
                        CellSignalStrengthNr cellSignalStrengthNr = (CellSignalStrengthNr) cellSignalStrength;
                        Pair[] pairArr = new Pair[9];
                        pairArr[i] = new Pair("type", "nr");
                        pairArr[1] = new Pair("mcc", Integer.valueOf(C1803240x1e.LIZ(cellIdentityNr.getMccString())));
                        pairArr[2] = new Pair("mnc", Integer.valueOf(C1803240x1e.LIZ(cellIdentityNr.getMncString())));
                        C0WZX c0wzx2 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulO19wxEDkzz3a8g/wYcOZmjI=", null);
                        C0WST c0wst2 = new C0WST();
                        Object[] objArr3 = new Object[i];
                        C0WZW c0wzw2 = new C0WZW(i, "()I", c0wzx2);
                        C0WSU c0wsuLIZIZ2 = c0wst2.LIZIZ(10286, "android/telephony/CellIdentityNr", "getPci", cellIdentityNr, objArr3, "int", c0wzw2);
                        if (c0wsuLIZIZ2.LIZ) {
                            i2 = 0;
                            c0wst2.LIZ(10286, "android/telephony/CellIdentityNr", "getPci", null, objArr3, cellIdentityNr, c0wzw2, i);
                            pci = ((Integer) c0wsuLIZIZ2.LIZIZ).intValue();
                        } else {
                            i2 = 0;
                            Object[] objArr4 = c0wsuLIZIZ2.LIZJ;
                            CellIdentityNr cellIdentityNr2 = (objArr4 == null || (obj2 = objArr4[i]) == null) ? cellIdentityNr : (CellIdentityNr) obj2;
                            pci = cellIdentityNr2.getPci();
                            c0wst2.LIZ(10286, "android/telephony/CellIdentityNr", "getPci", Integer.valueOf(pci), objArr3, cellIdentityNr2, c0wzw2, true);
                        }
                        pairArr[3] = new Pair("pci", Integer.valueOf(pci));
                        C0WZX c0wzx3 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulO19wxEDkzz3a8g/wYcOZmjI=", null);
                        C0WST c0wst3 = new C0WST();
                        Object[] objArr5 = new Object[i];
                        C0WZW c0wzw3 = new C0WZW(i2, "()I", c0wzx3);
                        C0WSU c0wsuLIZIZ3 = c0wst3.LIZIZ(10287, "android/telephony/CellIdentityNr", "getTac", cellIdentityNr, objArr5, "int", c0wzw3);
                        if (c0wsuLIZIZ3.LIZ) {
                            c0wst3.LIZ(10287, "android/telephony/CellIdentityNr", "getTac", null, objArr5, cellIdentityNr, c0wzw3, i2);
                            tac = ((Integer) c0wsuLIZIZ3.LIZIZ).intValue();
                        } else {
                            Object[] objArr6 = c0wsuLIZIZ3.LIZJ;
                            CellIdentityNr cellIdentityNr3 = (objArr6 == null || (obj3 = objArr6[i2]) == null) ? cellIdentityNr : (CellIdentityNr) obj3;
                            tac = cellIdentityNr3.getTac();
                            c0wst3.LIZ(10287, "android/telephony/CellIdentityNr", "getTac", Integer.valueOf(tac), objArr5, cellIdentityNr3, c0wzw3, true);
                        }
                        pairArr[4] = new Pair("tac", Integer.valueOf(tac));
                        pairArr[5] = new Pair("earfcn", Integer.valueOf(cellIdentityNr.getNrarfcn()));
                        C0WZX c0wzx4 = new C0WZX("dzBzEgAjS8/YVFkiQFyNN/m6abexR8WXbuK7oK7xlMulO19wxEDkzz3a8g/wYcOZmjI=", null);
                        C0WST c0wst4 = new C0WST();
                        Object[] objArr7 = new Object[i2];
                        C0WZW c0wzw4 = new C0WZW(i2, "()J", c0wzx4);
                        C0WSU c0wsuLIZIZ4 = c0wst4.LIZIZ(10285, "android/telephony/CellIdentityNr", "getNci", cellIdentityNr, objArr7, "long", c0wzw4);
                        if (c0wsuLIZIZ4.LIZ) {
                            c0wst4.LIZ(10285, "android/telephony/CellIdentityNr", "getNci", null, objArr7, cellIdentityNr, c0wzw4, i2);
                            nci = ((Long) c0wsuLIZIZ4.LIZIZ).longValue();
                        } else {
                            Object[] objArr8 = c0wsuLIZIZ4.LIZJ;
                            if (objArr8 != null && (obj4 = objArr8[i2]) != null) {
                                cellIdentityNr = (CellIdentityNr) obj4;
                            }
                            nci = cellIdentityNr.getNci();
                            c0wst4.LIZ(10285, "android/telephony/CellIdentityNr", "getNci", Long.valueOf(nci), objArr7, cellIdentityNr, c0wzw4, true);
                        }
                        pairArr[6] = new Pair("nci", Long.valueOf(nci));
                        pairArr[7] = new Pair("dbm", Integer.valueOf(cellSignalStrengthNr.getDbm()));
                        pairArr[8] = new Pair("is_registered", Boolean.valueOf(this.LIZ.isRegistered()));
                        Map<String, Object> mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
                        Set setEntrySet = ((LinkedHashMap) mapLJIIJ).entrySet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj5 : setEntrySet) {
                            Map.Entry entry = (Map.Entry) obj5;
                            if ((entry.getValue() instanceof Integer) && Intrinsics.LJFF(entry.getValue(), Integer.MAX_VALUE)) {
                                arrayList.add(obj5);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(((Map.Entry) it2.next()).getKey());
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            mapLJIIJ.remove(it3.next());
                        }
                        return mapLJIIJ;
                    }

                    {
                        this.LIZ = cellInfoNr;
                    }
                };
            }
            return null;
        }
        return null;
    }

    public final Pair<List<String>, Map<String, Integer>> LIZIZ(List<? extends CellInfo> list) {
        Map<String, Object> mapLIZ;
        String str;
        String data;
        int iIntValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        for (CellInfo cellInfo : list) {
            Object c098200Yq = null;
            try {
                InterfaceC1798610wuB interfaceC1798610wuBLIZ = LIZ(cellInfo);
                if (interfaceC1798610wuBLIZ != null && (mapLIZ = interfaceC1798610wuBLIZ.LIZ()) != null) {
                    Object obj = mapLIZ.get("type");
                    if ((obj instanceof String) && (str = (String) obj) != null && (data = RopaEncrypt.getEncryptSeq(C786410Ut5.J3(new JSONObject(mapLIZ)), true).getData()) != null) {
                        Integer num = (Integer) linkedHashMap.get(str);
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        linkedHashMap.put(str, Integer.valueOf(iIntValue + 1));
                        c098200Yq = new Pair(data, Boolean.valueOf(cellInfo.isRegistered()));
                    }
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                arrayList.add(c098200Yq);
            }
        }
        List listLL = C13LP.LL(C13LP.LJLLLL(new AComparatorS28S0000000_9(1), arrayList), this.LIZ.LJ);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLL, 10));
        Iterator it2 = listLL.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Pair) it2.next()).getFirst());
        }
        return new Pair<>(arrayList2, linkedHashMap);
    }

    public C1798600wuA(Context context, C1798560wu6 c1798560wu6) {
        this.LIZ = c1798560wu6;
        this.LIZIZ = (TelephonyManager) C786410Ut5.H2(context, "phone");
    }
}
