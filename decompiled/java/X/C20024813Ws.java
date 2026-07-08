package X;

import Y.AComparatorS49S0000000_30;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.13Ws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20024813Ws {
    public static final AComparatorS49S0000000_30 LIZ = new AComparatorS49S0000000_30(17);

    public static C20025013Wu LIZ(final Context context, C19968913Bf c19968913Bf) {
        InterfaceC20024913Wt interfaceC20024913Wt;
        int i;
        int i2;
        Uri uriWithAppendedId;
        int i3;
        boolean z;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = c19968913Bf.LIZ;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider != null) {
            if (providerInfoResolveContentProvider.packageName.equals(c19968913Bf.LIZIZ)) {
                Signature[] signatureArr = C786410Ut5.Y3(packageManager, providerInfoResolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                AComparatorS49S0000000_30 aComparatorS49S0000000_30 = LIZ;
                Collections.sort(arrayList, aComparatorS49S0000000_30);
                List<List<byte[]>> listLIZIZ = c19968913Bf.LIZLLL;
                if (listLIZIZ == null) {
                    listLIZIZ = C20142813re.LIZIZ(resources, c19968913Bf.LJ);
                }
                int i4 = 0;
                while (true) {
                    Cursor cursorLIZ = null;
                    if (i4 < listLIZIZ.size()) {
                        ArrayList arrayList2 = new ArrayList((Collection) ListProtector.get(listLIZIZ, i4));
                        Collections.sort(arrayList2, aComparatorS49S0000000_30);
                        if (arrayList.size() == arrayList2.size()) {
                            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                if (Arrays.equals((byte[]) ListProtector.get(arrayList, i5), (byte[]) ListProtector.get(arrayList2, i5))) {
                                }
                            }
                            String str2 = providerInfoResolveContentProvider.authority;
                            ArrayList arrayList3 = new ArrayList();
                            final Uri uriBuild = new Uri.Builder().scheme("content").authority(str2).build();
                            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
                            if (Build.VERSION.SDK_INT < 24) {
                                interfaceC20024913Wt = new InterfaceC20024913Wt(context, uriBuild) { // from class: X.13Wv
                                    public final ContentProviderClient LIZ;

                                    @Override // X.InterfaceC20024913Wt
                                    public final void close() {
                                        ContentProviderClient contentProviderClient = this.LIZ;
                                        if (contentProviderClient != null) {
                                            contentProviderClient.release();
                                        }
                                    }

                                    {
                                        this.LIZ = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                                    }

                                    @Override // X.InterfaceC20024913Wt
                                    public final Cursor LIZ(Uri uri, String[] strArr, String[] strArr2) {
                                        ContentProviderClient contentProviderClient = this.LIZ;
                                        if (contentProviderClient == null) {
                                            return null;
                                        }
                                        try {
                                            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
                                        } catch (RemoteException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return null;
                                        }
                                    }
                                };
                            } else {
                                interfaceC20024913Wt = new InterfaceC20024913Wt(context, uriBuild) { // from class: X.13Ww
                                    public final ContentProviderClient LIZ;

                                    @Override // X.InterfaceC20024913Wt
                                    public final void close() {
                                        ContentProviderClient contentProviderClient = this.LIZ;
                                        if (contentProviderClient != null) {
                                            contentProviderClient.close();
                                        }
                                    }

                                    {
                                        this.LIZ = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
                                    }

                                    @Override // X.InterfaceC20024913Wt
                                    public final Cursor LIZ(Uri uri, String[] strArr, String[] strArr2) {
                                        ContentProviderClient contentProviderClient = this.LIZ;
                                        if (contentProviderClient == null) {
                                            return null;
                                        }
                                        try {
                                            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
                                        } catch (RemoteException e) {
                                            TryCatchGuardChecker.doCheck(e);
                                            return null;
                                        }
                                    }
                                };
                            }
                            try {
                                cursorLIZ = interfaceC20024913Wt.LIZ(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, new String[]{c19968913Bf.LIZJ});
                                if (cursorLIZ != null) {
                                    if (cursorLIZ.getCount() > 0) {
                                        int columnIndex = cursorLIZ.getColumnIndex("result_code");
                                        arrayList3 = new ArrayList();
                                        int columnIndex2 = cursorLIZ.getColumnIndex("_id");
                                        int columnIndex3 = cursorLIZ.getColumnIndex("file_id");
                                        int columnIndex4 = cursorLIZ.getColumnIndex("font_ttc_index");
                                        int columnIndex5 = cursorLIZ.getColumnIndex("font_weight");
                                        int columnIndex6 = cursorLIZ.getColumnIndex("font_italic");
                                        while (cursorLIZ.moveToNext()) {
                                            if (columnIndex != -1) {
                                                i = cursorLIZ.getInt(columnIndex);
                                            } else {
                                                i = 0;
                                            }
                                            if (columnIndex4 != -1) {
                                                i2 = cursorLIZ.getInt(columnIndex4);
                                            } else {
                                                i2 = 0;
                                            }
                                            if (columnIndex3 == -1) {
                                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild, cursorLIZ.getLong(columnIndex2));
                                            } else {
                                                uriWithAppendedId = ContentUris.withAppendedId(uriBuild2, cursorLIZ.getLong(columnIndex3));
                                            }
                                            if (columnIndex5 != -1) {
                                                i3 = cursorLIZ.getInt(columnIndex5);
                                            } else {
                                                i3 = 400;
                                            }
                                            if (columnIndex6 != -1 && cursorLIZ.getInt(columnIndex6) == 1) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            arrayList3.add(new C20139813rA(uriWithAppendedId, i2, i3, z, i));
                                        }
                                    }
                                    cursorLIZ.close();
                                }
                                interfaceC20024913Wt.close();
                                return new C20025013Wu(0, (C20139813rA[]) arrayList3.toArray(new C20139813rA[0]));
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (cursorLIZ != null) {
                                    cursorLIZ.close();
                                }
                                interfaceC20024913Wt.close();
                                throw th;
                            }
                        }
                        i4++;
                    } else {
                        return new C20025013Wu(1, null);
                    }
                }
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Found content provider ");
                sbLIZ.append(str);
                sbLIZ.append(", but package was not ");
                sbLIZ.append(c19968913Bf.LIZIZ);
                throw new PackageManager.NameNotFoundException(C2188811AlT.LIZIZ(sbLIZ));
            }
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("No package found for authority: ");
            sbLIZ2.append(str);
            throw new PackageManager.NameNotFoundException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
