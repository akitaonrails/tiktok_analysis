package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: X.0WhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830070WhJ implements InterfaceC824480WVy {
    public final InterfaceC830210WhX LIZ;
    public final OutputStream LIZIZ;
    public final BufferedInputStream LIZJ;
    public int LIZLLL;
    public int LJ;
    public String LJFF;
    public EnumC830230WhZ LJI;
    public Map<String, List<String>> LJII;
    public Map<String, String> LJIIIIZZ;
    public C08JR LJIIIZ;
    public String LJIIJ;
    public final String LJIIJJI;
    public String LJIIL;
    public final /* synthetic */ AbstractC830080WhK LJIILIIL;

    /* JADX WARN: Type inference failed for: r2v9, types: [X.08JR] */
    public final void LIZLLL() {
        byte[] bArr;
        boolean z;
        C830090WhL c830090WhLLIZLLL = null;
        try {
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                z = false;
                                this.LIZLLL = 0;
                                this.LJ = 0;
                                this.LIZJ.mark(8192);
                            } catch (SSLException e) {
                                TryCatchGuardChecker.doCheck(e);
                                EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.INTERNAL_ERROR;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("SSL PROTOCOL FAILURE: ");
                                sbLIZ.append(e.getMessage());
                                AbstractC830080WhK.LIZIZ(enumC2273771DzD, "text/plain", C2188811AlT.LIZIZ(sbLIZ)).LJI(this.LIZIZ);
                                AbstractC830080WhK.LIZJ(this.LIZIZ);
                            }
                        } catch (SocketException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            throw e2;
                        }
                    } catch (C830160WhS e3) {
                        TryCatchGuardChecker.doCheck(e3);
                        AbstractC830080WhK.LIZIZ(e3.getStatus(), "text/plain", e3.getMessage()).LJI(this.LIZIZ);
                        AbstractC830080WhK.LIZJ(this.LIZIZ);
                    }
                } catch (SocketTimeoutException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    throw e4;
                }
            } catch (IOException e5) {
                TryCatchGuardChecker.doCheck(e5);
                EnumC2273771DzD enumC2273771DzD2 = EnumC2273771DzD.INTERNAL_ERROR;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("SERVER INTERNAL ERROR: IOException: ");
                sbLIZ2.append(e5.getMessage());
                AbstractC830080WhK.LIZIZ(enumC2273771DzD2, "text/plain", C2188811AlT.LIZIZ(sbLIZ2)).LJI(this.LIZIZ);
                AbstractC830080WhK.LIZJ(this.LIZIZ);
            }
            try {
                int i = this.LIZJ.read(bArr, 0, 8192);
                if (i == -1) {
                    AbstractC830080WhK.LIZJ(this.LIZJ);
                    AbstractC830080WhK.LIZJ(this.LIZIZ);
                    throw new SocketException("NanoHttpd Shutdown");
                }
                while (i > 0) {
                    int i2 = this.LJ + i;
                    this.LJ = i2;
                    int iLJ = LJ(i2, bArr);
                    this.LIZLLL = iLJ;
                    if (iLJ > 0) {
                        break;
                    }
                    BufferedInputStream bufferedInputStream = this.LIZJ;
                    int i3 = this.LJ;
                    i = bufferedInputStream.read(bArr, i3, 8192 - i3);
                }
                if (this.LIZLLL < this.LJ) {
                    this.LIZJ.reset();
                    this.LIZJ.skip(this.LIZLLL);
                }
                this.LJII = new HashMap();
                Map<String, String> map = this.LJIIIIZZ;
                if (map == null) {
                    this.LJIIIIZZ = new HashMap();
                } else {
                    ((HashMap) map).clear();
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.LJ)));
                HashMap map2 = new HashMap();
                LIZ(bufferedReader, map2, this.LJII, this.LJIIIIZZ);
                String str = this.LJIIJJI;
                if (str != null) {
                    ((HashMap) this.LJIIIIZZ).put("remote-addr", str);
                    ((HashMap) this.LJIIIIZZ).put("http-client-ip", this.LJIIJJI);
                }
                EnumC830230WhZ enumC830230WhZLIZJ = EnumC830230WhZ.LIZJ((String) map2.get("method"));
                this.LJI = enumC830230WhZLIZJ;
                if (enumC830230WhZLIZJ == null) {
                    EnumC2273771DzD enumC2273771DzD3 = EnumC2273771DzD.BAD_REQUEST;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("BAD REQUEST: Syntax error. HTTP verb ");
                    sbLIZ3.append((String) map2.get("method"));
                    sbLIZ3.append(" unhandled.");
                    throw new C830160WhS(enumC2273771DzD3, C2188811AlT.LIZIZ(sbLIZ3));
                }
                this.LJFF = (String) map2.get("uri");
                final Map<String, String> map3 = this.LJIIIIZZ;
                this.LJIIIZ = new Iterable<String>(map3) { // from class: X.08JR
                    public final HashMap<String, String> LL = new HashMap<>();
                    public final ArrayList<C830200WhW> LLILLJJLI = new ArrayList<>();

                    @Override // java.lang.Iterable
                    public final Iterator<String> iterator() {
                        return this.LL.keySet().iterator();
                    }

                    {
                        String str2 = (String) map3.get("cookie");
                        if (str2 != null) {
                            for (String str3 : str2.split(";")) {
                                String[] strArrSplit = str3.trim().split("=");
                                if (strArrSplit.length == 2) {
                                    this.LL.put(strArrSplit[0], strArrSplit[1]);
                                }
                            }
                        }
                    }

                    public final void LIZJ(C830090WhL c830090WhL) {
                        Iterator<C830200WhW> it2 = this.LLILLJJLI.iterator();
                        while (it2.hasNext()) {
                            it2.next().getClass();
                            c830090WhL.LIZ("Set-Cookie", C786410Ut5.j4("%s=%s; expires=%s", new Object[]{null, null, null}));
                        }
                    }
                };
                String str2 = (String) ((HashMap) this.LJIIIIZZ).get("connection");
                boolean z2 = "HTTP/1.1".equals(this.LJIIL) && (str2 == null || !str2.matches("(?i).*close.*"));
                c830090WhLLIZLLL = this.LJIILIIL.LIZLLL(this);
                if (c830090WhLLIZLLL == null) {
                    throw new C830160WhS(EnumC2273771DzD.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                }
                String str3 = (String) ((HashMap) this.LJIIIIZZ).get("accept-encoding");
                LIZJ(c830090WhLLIZLLL);
                c830090WhLLIZLLL.LLIZ = this.LJI;
                this.LJIILIIL.getClass();
                if (AbstractC830080WhK.LJI(c830090WhLLIZLLL) && str3 != null && str3.contains("gzip")) {
                    z = true;
                }
                c830090WhLLIZLLL.LLJ = z;
                c830090WhLLIZLLL.LLJI = z2;
                c830090WhLLIZLLL.LJI(this.LIZIZ);
                if (!z2 || c830090WhLLIZLLL.LIZLLL()) {
                    throw new SocketException("NanoHttpd Shutdown");
                }
                AbstractC830080WhK.LIZJ(c830090WhLLIZLLL);
                ((C830110WhN) this.LIZ).LIZ();
            } catch (SSLException e6) {
                TryCatchGuardChecker.doCheck(e6);
                throw e6;
            } catch (IOException e7) {
                TryCatchGuardChecker.doCheck(e7);
                AbstractC830080WhK.LIZJ(this.LIZJ);
                AbstractC830080WhK.LIZJ(this.LIZIZ);
                throw new SocketException("NanoHttpd Shutdown");
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            AbstractC830080WhK.LIZJ(null);
            ((C830110WhN) this.LIZ).LIZ();
            throw th;
        }
    }

    public final Map<String, String> LJI() {
        HashMap map = new HashMap();
        for (String str : this.LJII.keySet()) {
            map.put(str, ListProtector.get(this.LJII.get(str), 0));
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0093 A[Catch: all -> 0x013d, TryCatch #1 {all -> 0x013d, blocks: (B:19:0x006f, B:20:0x0071, B:24:0x007a, B:26:0x008d, B:28:0x0093, B:30:0x00b3, B:32:0x00bd, B:34:0x00d8, B:36:0x00dc, B:37:0x00e2, B:38:0x00eb, B:39:0x00ec, B:41:0x010c, B:42:0x0112, B:44:0x0118, B:45:0x0120, B:47:0x012a, B:29:0x00a0), top: B:57:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0 A[Catch: all -> 0x013d, TryCatch #1 {all -> 0x013d, blocks: (B:19:0x006f, B:20:0x0071, B:24:0x007a, B:26:0x008d, B:28:0x0093, B:30:0x00b3, B:32:0x00bd, B:34:0x00d8, B:36:0x00dc, B:37:0x00e2, B:38:0x00eb, B:39:0x00ec, B:41:0x010c, B:42:0x0112, B:44:0x0118, B:45:0x0120, B:47:0x012a, B:29:0x00a0), top: B:57:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bd A[Catch: all -> 0x013d, TryCatch #1 {all -> 0x013d, blocks: (B:19:0x006f, B:20:0x0071, B:24:0x007a, B:26:0x008d, B:28:0x0093, B:30:0x00b3, B:32:0x00bd, B:34:0x00d8, B:36:0x00dc, B:37:0x00e2, B:38:0x00eb, B:39:0x00ec, B:41:0x010c, B:42:0x0112, B:44:0x0118, B:45:0x0120, B:47:0x012a, B:29:0x00a0), top: B:57:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120 A[Catch: all -> 0x013d, TryCatch #1 {all -> 0x013d, blocks: (B:19:0x006f, B:20:0x0071, B:24:0x007a, B:26:0x008d, B:28:0x0093, B:30:0x00b3, B:32:0x00bd, B:34:0x00d8, B:36:0x00dc, B:37:0x00e2, B:38:0x00eb, B:39:0x00ec, B:41:0x010c, B:42:0x0112, B:44:0x0118, B:45:0x0120, B:47:0x012a, B:29:0x00a0), top: B:57:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x008d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830070WhJ.LJII(java.util.Map):void");
    }

    public static int LJ(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i) {
                return 0;
            }
            byte b = bArr[i3];
            if (b == 13) {
                if (bArr[i4] == 10 && (i2 = i3 + 3) < i && bArr[i3 + 2] == 13 && bArr[i2] == 10) {
                    return i3 + 4;
                }
            } else if (b == 10 && bArr[i4] == 10) {
                return i3 + 2;
            }
            i3 = i4;
        }
    }

    public static int[] LJFF(ByteBuffer byteBuffer, byte[] bArr) {
        int iRemaining;
        int[] iArr = new int[0];
        if (byteBuffer.remaining() < bArr.length) {
            return iArr;
        }
        int length = bArr.length + SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        byte[] bArr2 = new byte[length];
        if (byteBuffer.remaining() < length) {
            iRemaining = byteBuffer.remaining();
        } else {
            iRemaining = length;
        }
        byteBuffer.get(bArr2, 0, iRemaining);
        int length2 = iRemaining - bArr.length;
        int i = 0;
        do {
            for (int i2 = 0; i2 < length2; i2++) {
                for (int i3 = 0; i3 < bArr.length && bArr2[i2 + i3] == bArr[i3]; i3++) {
                    if (i3 == bArr.length - 1) {
                        int[] iArr2 = new int[iArr.length + 1];
                        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                        iArr2[iArr.length] = i + i2;
                        iArr = iArr2;
                    }
                }
            }
            i += length2;
            System.arraycopy(bArr2, length - bArr.length, bArr2, 0, bArr.length);
            length2 = length - bArr.length;
            if (byteBuffer.remaining() < length2) {
                length2 = byteBuffer.remaining();
            }
            byteBuffer.get(bArr2, bArr.length, length2);
        } while (length2 > 0);
        return iArr;
    }

    public final void LIZJ(String str, Map<String, List<String>> map) {
        String strTrim;
        String strLIZ;
        if (str == null) {
            this.LJIIJ = "";
            return;
        }
        this.LJIIJ = str;
        StringTokenizer stringTokenizer = new StringTokenizer(str, "&");
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            int iIndexOf = strNextToken.indexOf(61);
            if (iIndexOf >= 0) {
                strTrim = AbstractC830080WhK.LIZ(strNextToken.substring(0, iIndexOf)).trim();
                strLIZ = AbstractC830080WhK.LIZ(strNextToken.substring(iIndexOf + 1));
            } else {
                strTrim = AbstractC830080WhK.LIZ(strNextToken).trim();
                strLIZ = "";
            }
            List<String> arrayList = map.get(strTrim);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                map.put(strTrim, arrayList);
            }
            arrayList.add(strLIZ);
        }
    }

    public final void LIZ(BufferedReader bufferedReader, Map<String, String> map, Map<String, List<String>> map2, Map<String, String> map3) throws C830160WhS {
        String strLIZ;
        try {
            String line = bufferedReader.readLine();
            if (line == null) {
                return;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(line);
            if (stringTokenizer.hasMoreTokens()) {
                HashMap map4 = (HashMap) map;
                map4.put("method", stringTokenizer.nextToken());
                if (stringTokenizer.hasMoreTokens()) {
                    String strNextToken = stringTokenizer.nextToken();
                    int iIndexOf = strNextToken.indexOf(63);
                    if (iIndexOf >= 0) {
                        LIZJ(strNextToken.substring(iIndexOf + 1), map2);
                        strLIZ = AbstractC830080WhK.LIZ(strNextToken.substring(0, iIndexOf));
                    } else {
                        strLIZ = AbstractC830080WhK.LIZ(strNextToken);
                    }
                    if (stringTokenizer.hasMoreTokens()) {
                        this.LJIIL = stringTokenizer.nextToken();
                    } else {
                        this.LJIIL = "HTTP/1.1";
                        AbstractC830080WhK.LJIIJ.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                    }
                    String line2 = bufferedReader.readLine();
                    while (line2 != null && !line2.trim().isEmpty()) {
                        int iIndexOf2 = line2.indexOf(58);
                        if (iIndexOf2 >= 0) {
                            map3.put(line2.substring(0, iIndexOf2).trim().toLowerCase(Locale.US), line2.substring(iIndexOf2 + 1).trim());
                        }
                        line2 = bufferedReader.readLine();
                    }
                    map4.put("uri", strLIZ);
                    return;
                }
                throw new C830160WhS(EnumC2273771DzD.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
            }
            throw new C830160WhS(EnumC2273771DzD.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            EnumC2273771DzD enumC2273771DzD = EnumC2273771DzD.INTERNAL_ERROR;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SERVER INTERNAL ERROR: IOException: ");
            sbLIZ.append(e.getMessage());
            throw new C830160WhS(enumC2273771DzD, C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0189, code lost:
    
        throw new X.C830160WhS(X.EnumC2273771DzD.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C830140WhQ r19, java.nio.ByteBuffer r20, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C830070WhJ.LIZIZ(X.0WhQ, java.nio.ByteBuffer, java.util.Map, java.util.Map):void");
    }

    public final String LJIIIIZZ(int i, int i2, String str, ByteBuffer byteBuffer) throws Throwable {
        C830130WhP c830130WhP;
        ByteBuffer byteBufferDuplicate;
        C0VSV c0vsv;
        if (i2 > 0) {
            C0VSV c0vsv2 = null;
            try {
                try {
                    C830110WhN c830110WhN = (C830110WhN) this.LIZ;
                    c830110WhN.getClass();
                    c830130WhP = new C830130WhP(c830110WhN.LIZ);
                    ((ArrayList) c830110WhN.LIZIZ).add(c830130WhP);
                    byteBufferDuplicate = byteBuffer.duplicate();
                    c0vsv = new C0VSV(c830130WhP.LIZ.getAbsolutePath());
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Exception e) {
                e = e;
            }
            try {
                FileChannel channel = c0vsv.getChannel();
                byteBufferDuplicate.position(i).limit(i + i2);
                channel.write(byteBufferDuplicate.slice());
                String absolutePath = c830130WhP.LIZ.getAbsolutePath();
                AbstractC830080WhK.LIZJ(c0vsv);
                return absolutePath;
            } catch (Exception e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                throw new Error(e);
            } catch (Throwable th2) {
                th = th2;
                c0vsv2 = c0vsv;
                TryCatchGuardChecker.doCheck(th);
                AbstractC830080WhK.LIZJ(c0vsv2);
                throw th;
            }
        }
        return "";
    }

    public C830070WhJ(AbstractC830080WhK abstractC830080WhK, C830110WhN c830110WhN, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) throws Throwable {
        String strD0;
        this.LJIILIIL = abstractC830080WhK;
        this.LIZ = c830110WhN;
        this.LIZJ = new BufferedInputStream(inputStream, 8192);
        this.LIZIZ = outputStream;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            strD0 = C2204961BRm.d0(inetAddress, new C0WZX("cjYwVQkzEc/QWlkkS1yqZ6s3saxKUuc=", null));
            strD0.toString();
        } else {
            strD0 = "127.0.0.1";
        }
        this.LJIIJJI = strD0;
        if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
            inetAddress.getHostName().getClass();
        }
        this.LJIIIIZZ = new HashMap();
    }
}
