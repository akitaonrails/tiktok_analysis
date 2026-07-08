package X;

import android.content.Context;
import android.util.Xml;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlSerializer;

/* JADX INFO: renamed from: X.13tZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20154713tZ {
    public static final Object LIZ = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        r6 = r5.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0069: IF  (r4 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:42:0x0073 A[TRY_LEAVE] (LINE:16777321), block:B:38:0x0069 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e A[Catch: all -> 0x007a, TryCatch #7 {all -> 0x007a, blocks: (B:5:0x0005, B:20:0x0042, B:31:0x0058, B:33:0x005e, B:34:0x0063, B:30:0x0055, B:28:0x0050, B:39:0x006b, B:42:0x0073, B:41:0x0070, B:44:0x0075, B:45:0x0078, B:6:0x000b, B:7:0x0018, B:11:0x0022, B:16:0x002d, B:18:0x0039, B:26:0x004b), top: B:51:0x0005, inners: #2, #4, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZIZ(android.content.Context r8) {
        /*
            java.lang.Object r7 = X.C20154713tZ.LIZ
            monitor-enter(r7)
            java.lang.String r6 = ""
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r4 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L74 java.lang.Throwable -> L7a
            org.xmlpull.v1.XmlPullParser r5 = android.util.Xml.newPullParser()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            java.lang.String r0 = "UTF-8"
            r5.setInput(r4, r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            int r3 = r5.getDepth()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
        L18:
            int r2 = r5.next()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            r0 = 1
            if (r2 == r0) goto L40
            r1 = 3
            if (r2 != r1) goto L28
            int r0 = r5.getDepth()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            if (r0 <= r3) goto L40
        L28:
            if (r2 == r1) goto L18
            r0 = 4
            if (r2 == r0) goto L18
            java.lang.String r1 = r5.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            java.lang.String r0 = "locales"
            boolean r0 = r1.equals(r0)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
            if (r0 == 0) goto L18
            java.lang.String r1 = "application_locales"
            r0 = 0
            java.lang.String r6 = r5.getAttributeValue(r0, r1)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4a java.lang.Throwable -> L65
        L40:
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.io.IOException -> L46 java.lang.Throwable -> L7a
            goto L58
        L46:
            r0 = move-exception
            goto L55
        L48:
            r0 = move-exception
            goto L4b
        L4a:
            r0 = move-exception
        L4b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L58
            r4.close()     // Catch: java.io.IOException -> L54 java.lang.Throwable -> L7a
            goto L58
        L54:
            r0 = move-exception
        L55:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
        L58:
            boolean r0 = r6.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L63
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r0)     // Catch: java.lang.Throwable -> L7a
        L63:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7a
            return r6
        L65:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L65
            if (r4 == 0) goto L73
            r4.close()     // Catch: java.io.IOException -> L6f java.lang.Throwable -> L7a
            goto L73
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
        L73:
            throw r1     // Catch: java.lang.Throwable -> L7a
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7a
            return r6
        L7a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L7a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20154713tZ.LIZIZ(android.content.Context):java.lang.String");
    }

    public static void LIZ(Context context, String str) {
        synchronized (LIZ) {
            try {
                if (str.equals("")) {
                    context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    return;
                }
                try {
                    FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                    XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
                    try {
                        try {
                            xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                            xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                            xmlSerializerNewSerializer.startTag(null, "locales");
                            xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                            xmlSerializerNewSerializer.endTag(null, "locales");
                            xmlSerializerNewSerializer.endDocument();
                            if (fileOutputStreamOpenFileOutput != null) {
                                try {
                                    fileOutputStreamOpenFileOutput.close();
                                } catch (IOException e) {
                                    e = e;
                                    TryCatchGuardChecker.doCheck(e);
                                }
                            }
                        } finally {
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        if (fileOutputStreamOpenFileOutput != null) {
                            try {
                                fileOutputStreamOpenFileOutput.close();
                            } catch (IOException e3) {
                                e = e3;
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                } catch (FileNotFoundException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
