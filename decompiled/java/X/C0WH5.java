package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzal;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzmu;
import com.google.android.gms.measurement.internal.zzn;
import com.google.android.gms.measurement.internal.zzno;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0WH5, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WH5 extends C820540WGu implements InterfaceC19802012dm {
    public C0WH5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // X.InterfaceC19802012dm
    public final void B(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(20, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void E(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(26, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void F(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(6, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void I(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(4, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void L(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(18, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void R(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(25, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final zzal h(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        Parcel parcelLLILLIZIL = LLILLIZIL(21, parcelLJJJZ);
        zzal zzalVar = (zzal) C0W8X.LIZ(parcelLLILLIZIL, zzal.CREATOR);
        parcelLLILLIZIL.recycle();
        return zzalVar;
    }

    @Override // X.InterfaceC19802012dm
    public final String n(zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        Parcel parcelLLILLIZIL = LLILLIZIL(11, parcelLJJJZ);
        String string = parcelLLILLIZIL.readString();
        parcelLLILLIZIL.recycle();
        return string;
    }

    @Override // X.InterfaceC19802012dm
    public final List LJJJIL(Bundle bundle, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        Parcel parcelLLILLIZIL = LLILLIZIL(24, parcelLJJJZ);
        ArrayList arrayListCreateTypedArrayList = parcelLLILLIZIL.createTypedArrayList(zzmu.CREATOR);
        parcelLLILLIZIL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X.InterfaceC19802012dm
    public final void LLIZ(zzno zznoVar, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zznoVar);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(2, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void LLJJJJLIIL(zzac zzacVar, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zzacVar);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(12, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final void LLZZJLIL(zzbf zzbfVar, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zzbfVar);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(1, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final byte[] f1(zzbf zzbfVar, String str) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, zzbfVar);
        parcelLJJJZ.writeString(str);
        Parcel parcelLLILLIZIL = LLILLIZIL(9, parcelLJJJZ);
        byte[] bArrCreateByteArray = parcelLLILLIZIL.createByteArray();
        parcelLLILLIZIL.recycle();
        return bArrCreateByteArray;
    }

    @Override // X.InterfaceC19802012dm
    /* JADX INFO: renamed from: LJJJIL, reason: collision with other method in class */
    public final void mo35LJJJIL(Bundle bundle, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        C0W8X.LIZJ(parcelLJJJZ, bundle);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        LLLIIL(19, parcelLJJJZ);
    }

    @Override // X.InterfaceC19802012dm
    public final List<zzac> LLJLILLLLZIIL(String str, String str2, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        Parcel parcelLLILLIZIL = LLILLIZIL(16, parcelLJJJZ);
        ArrayList arrayListCreateTypedArrayList = parcelLLILLIZIL.createTypedArrayList(zzac.CREATOR);
        parcelLLILLIZIL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X.InterfaceC19802012dm
    public final List<zzac> g0(String str, String str2, String str3) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        Parcel parcelLLILLIZIL = LLILLIZIL(17, parcelLJJJZ);
        ArrayList arrayListCreateTypedArrayList = parcelLLILLIZIL.createTypedArrayList(zzac.CREATOR);
        parcelLLILLIZIL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X.InterfaceC19802012dm
    public final List<zzno> LLLLLLLLLL(String str, String str2, boolean z, zzn zznVar) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeInt(z ? 1 : 0);
        C0W8X.LIZJ(parcelLJJJZ, zznVar);
        Parcel parcelLLILLIZIL = LLILLIZIL(14, parcelLJJJZ);
        ArrayList arrayListCreateTypedArrayList = parcelLLILLIZIL.createTypedArrayList(zzno.CREATOR);
        parcelLLILLIZIL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X.InterfaceC19802012dm
    public final List<zzno> LLLZ(String str, String str2, String str3, boolean z) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        parcelLJJJZ.writeInt(z ? 1 : 0);
        Parcel parcelLLILLIZIL = LLILLIZIL(15, parcelLJJJZ);
        ArrayList arrayListCreateTypedArrayList = parcelLLILLIZIL.createTypedArrayList(zzno.CREATOR);
        parcelLLILLIZIL.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // X.InterfaceC19802012dm
    public final void LLLZLZ(long j, String str, String str2, String str3) {
        Parcel parcelLJJJZ = LJJJZ();
        parcelLJJJZ.writeLong(j);
        parcelLJJJZ.writeString(str);
        parcelLJJJZ.writeString(str2);
        parcelLJJJZ.writeString(str3);
        LLLIIL(10, parcelLJJJZ);
    }
}
