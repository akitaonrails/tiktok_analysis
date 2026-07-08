package X;

import android.content.ContentValues;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.im.core.proto.MediaURLStruct;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okio.ByteString;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0YAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869870YAn {
    public final C0YEM LIZ;
    public final InterfaceC864790XwD LIZIZ;
    public final C0Y5R LIZJ;

    public C869870YAn(C0YEM c0yem) {
        this.LIZ = c0yem;
        this.LIZIZ = c0yem.LJIIZILJ();
        this.LIZJ = c0yem.LJIIZILJ().LIZIZ();
    }

    public static C0YC6 LIZIZ(InterfaceC869470Y8z interfaceC869470Y8z) {
        int i = interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_INDEX.key));
        C0YC6 c0yc6 = new C0YC6();
        c0yc6.setMsgUuid(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_UUID.key)));
        c0yc6.setLocalPath(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_LOCAL_URI.key)));
        c0yc6.setRemoteUrl(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_REMOTE_URI.key)));
        c0yc6.setIndex(i);
        c0yc6.setLength(interfaceC869470Y8z.getLong(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_SIZE.key)));
        c0yc6.setType(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_TYPE.key)));
        c0yc6.setExtStr(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_EXT.key)));
        c0yc6.setStatus(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_STATUS.key)));
        c0yc6.setHash(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_HASH.key)));
        c0yc6.setDisplayType(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_DISPLAY_TYPE.key)));
        c0yc6.setMimeType(interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_MIME_TYPE.key)));
        String string = interfaceC869470Y8z.getString(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_UPLOAD_URI.key));
        if (!TextUtils.isEmpty(string)) {
            c0yc6.setUploadUri(UriProtector.parse(string));
        }
        LJFF(c0yc6, interfaceC869470Y8z);
        return c0yc6;
    }

    public static List LIZJ(InterfaceC869470Y8z interfaceC869470Y8z) {
        if (interfaceC869470Y8z == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(interfaceC869470Y8z.getCount());
        int columnIndex = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_UUID.key);
        int columnIndex2 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_LOCAL_URI.key);
        int columnIndex3 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_REMOTE_URI.key);
        int columnIndex4 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_INDEX.key);
        int columnIndex5 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_SIZE.key);
        int columnIndex6 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_TYPE.key);
        int columnIndex7 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_EXT.key);
        int columnIndex8 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_STATUS.key);
        int columnIndex9 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_HASH.key);
        int columnIndex10 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_DISPLAY_TYPE.key);
        int columnIndex11 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_MIME_TYPE.key);
        int columnIndex12 = interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_UPLOAD_URI.key);
        while (interfaceC869470Y8z.moveToNext()) {
            int i = interfaceC869470Y8z.getInt(columnIndex4);
            C0YC6 c0yc6 = new C0YC6();
            c0yc6.setMsgUuid(interfaceC869470Y8z.getString(columnIndex));
            c0yc6.setLocalPath(interfaceC869470Y8z.getString(columnIndex2));
            c0yc6.setRemoteUrl(interfaceC869470Y8z.getString(columnIndex3));
            c0yc6.setIndex(i);
            c0yc6.setLength(interfaceC869470Y8z.getLong(columnIndex5));
            c0yc6.setType(interfaceC869470Y8z.getString(columnIndex6));
            c0yc6.setExtStr(interfaceC869470Y8z.getString(columnIndex7));
            c0yc6.setStatus(interfaceC869470Y8z.getInt(columnIndex8));
            c0yc6.setHash(interfaceC869470Y8z.getString(columnIndex9));
            c0yc6.setDisplayType(interfaceC869470Y8z.getString(columnIndex10));
            c0yc6.setMimeType(interfaceC869470Y8z.getString(columnIndex11));
            String string = interfaceC869470Y8z.getString(columnIndex12);
            if (!TextUtils.isEmpty(string)) {
                c0yc6.setUploadUri(UriProtector.parse(string));
            }
            LJFF(c0yc6, interfaceC869470Y8z);
            arrayList.add(c0yc6);
        }
        return arrayList;
    }

    public final boolean LIZ(List<C0YC6> list) {
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (C0YC6 c0yc6 : list) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(C0YA0.COLUMN_UUID.key, c0yc6.msgUuid);
                contentValues.put(C0YA0.COLUMN_LOCAL_URI.key, c0yc6.localPath);
                contentValues.put(C0YA0.COLUMN_REMOTE_URI.key, c0yc6.remoteUrl);
                contentValues.put(C0YA0.COLUMN_HASH.key, c0yc6.hash);
                contentValues.put(C0YA0.COLUMN_INDEX.key, Integer.valueOf(c0yc6.index));
                contentValues.put(C0YA0.COLUMN_EXT.key, c0yc6.getExtStr());
                contentValues.put(C0YA0.COLUMN_STATUS.key, Integer.valueOf(c0yc6.status));
                contentValues.put(C0YA0.COLUMN_TYPE.key, c0yc6.type);
                contentValues.put(C0YA0.COLUMN_SIZE.key, Long.valueOf(c0yc6.length));
                contentValues.put(C0YA0.COLUMN_DISPLAY_TYPE.key, c0yc6.displayType);
                contentValues.put(C0YA0.COLUMN_MIME_TYPE.key, c0yc6.mimeType);
                Uri uri = c0yc6.uploadUri;
                if (uri != null) {
                    contentValues.put(C0YA0.COLUMN_UPLOAD_URI.key, uri.toString());
                }
                EnumC870720YDu enumC870720YDu = c0yc6.mediaType;
                if (enumC870720YDu != null) {
                    contentValues.put(C0YA0.COLUMN_MEDIA_TYPE.key, Integer.valueOf(enumC870720YDu.getValue()));
                }
                MediaURLStruct mediaURLStruct = c0yc6.mediaUrlStruct;
                if (mediaURLStruct != null) {
                    C1496910p3Z c1496910p3Z = ByteString.Companion;
                    byte[] bArrEncode = MediaURLStruct.ADAPTER.encode(mediaURLStruct);
                    c1496910p3Z.getClass();
                    contentValues.put(C0YA0.COLUMN_MEDIA_URL_STRUCT.key, C1496910p3Z.LIZIZ(bArrEncode).toByteArray());
                }
                if (this.LIZJ.getProxy().LJIIIIZZ("attchment", contentValues, 0) >= 0) {
                    i++;
                }
            }
            if (i != list.size()) {
                return false;
            }
        }
        return true;
    }

    public final void LIZLLL(String str) {
        C870430YCr proxy = this.LIZ.LJIIZILJ().LIZIZ().getProxy();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0YA0.COLUMN_UUID.key);
        sbLIZ.append("=?");
        proxy.LIZIZ("attchment", C2188811AlT.LIZIZ(sbLIZ), new String[]{str});
    }

    public final List<C0YC6> LJ(String str) {
        InterfaceC869470Y8z interfaceC869470Y8zLJIIJJI = null;
        try {
            try {
                C870430YCr proxy = this.LIZJ.getProxy();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("select * from attchment where ");
                sbLIZ.append(C0YA0.COLUMN_UUID.key);
                sbLIZ.append("=?");
                interfaceC869470Y8zLJIIJJI = proxy.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ), "getAttachments", new String[]{str});
                if (interfaceC869470Y8zLJIIJJI != null) {
                    ArrayList arrayList = new ArrayList(interfaceC869470Y8zLJIIJJI.getCount());
                    while (interfaceC869470Y8zLJIIJJI.moveToNext()) {
                        arrayList.add(LIZIZ(interfaceC869470Y8zLJIIJJI));
                    }
                    this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
                    return arrayList;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                this.LIZ.LIZLLL().LJIIIZ("IMAttachmentDao getAttachments ", e);
                this.LIZIZ.LJFF().getEventTracker().LIZLLL("IMAttachmentDao getAttachments", e);
            }
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            return new ArrayList();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ.LIZ().LIZ(interfaceC869470Y8zLJIIJJI);
            throw th;
        }
    }

    public final boolean LJI(List<C0YC6> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (C0YC6 c0yc6 : list) {
                if (c0yc6 != null && !TextUtils.isEmpty(c0yc6.msgUuid)) {
                    sb.append(",\"");
                    sb.append(c0yc6.msgUuid);
                    sb.append('\"');
                }
            }
            String string = sb.toString();
            if (string.length() > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(e3.h);
                sbLIZ.append(string.substring(1));
                sbLIZ.append(")");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("delete from attchment where ");
                sbLIZ2.append(C0YA0.COLUMN_UUID.key);
                sbLIZ2.append(" in ");
                sbLIZ2.append(strLIZIZ);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                Iterator<C0YC6> it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (it2.next().index >= 0) {
                            break;
                        }
                    } else {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(strLIZIZ2);
                        sbLIZ3.append(" AND ");
                        sbLIZ3.append(C0YA0.COLUMN_MEDIA_TYPE.key);
                        sbLIZ3.append(" is not null");
                        strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                        break;
                    }
                }
                if (this.LIZJ.getProxy().LIZLLL(strLIZIZ2, "deleteAttachmentByMD5")) {
                    return LIZ(list);
                }
            }
        }
        return true;
    }

    public static void LJFF(C0YC6 c0yc6, InterfaceC869470Y8z interfaceC869470Y8z) {
        MediaURLStruct mediaURLStructDecode;
        String str;
        EnumC870720YDu enumC870720YDuFromValue = EnumC870720YDu.fromValue(interfaceC869470Y8z.getInt(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_MEDIA_TYPE.key)));
        if (enumC870720YDuFromValue != null) {
            c0yc6.setMediaType(enumC870720YDuFromValue);
        }
        if (c0yc6.index < 0) {
            try {
                mediaURLStructDecode = MediaURLStruct.ADAPTER.decode(C870740YDw.LIZIZ(interfaceC869470Y8z.getBlob(interfaceC869470Y8z.getColumnIndex(C0YA0.COLUMN_MEDIA_URL_STRUCT.key))));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                mediaURLStructDecode = null;
            }
            c0yc6.setMediaUrlStruct(mediaURLStructDecode);
            if (mediaURLStructDecode != null && (str = mediaURLStructDecode.display_type) != null) {
                c0yc6.setDisplayType(str);
            }
        }
    }
}
