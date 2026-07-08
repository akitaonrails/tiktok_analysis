package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* JADX INFO: renamed from: X.09BK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09BK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(String str) {
        try {
            new C0VSJ(str).mkdirs();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static boolean LIZJ(String str) {
        if (str.length() == 0) {
            return false;
        }
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (new C0VSJ(str).exists()) {
            return true;
        }
        return false;
    }

    public static long LIZLLL(File file) {
        long jLIZLLL = 0;
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jLIZLLL += LIZLLL(file2);
                }
            }
            return jLIZLLL;
        }
        return 0 + file.length();
    }

    public static String LJ(String str) throws Throwable {
        StringBuilder sb;
        C0VSP c0vsp;
        try {
            try {
                sb = new StringBuilder();
            } catch (Throwable th) {
                th = th;
            }
            try {
                c0vsp = new C0VSP(new C0VSJ(str));
                try {
                    FileChannel channel = c0vsp.getChannel();
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(1024);
                    CharBuffer charBufferAllocate = CharBuffer.allocate(1024);
                    CharsetDecoder charsetDecoderNewDecoder = Charset.forName("UTF-8").newDecoder();
                    while (channel.read(byteBufferAllocate) != -1) {
                        byteBufferAllocate.flip();
                        charBufferAllocate.clear();
                        if (channel.position() < channel.size()) {
                            charsetDecoderNewDecoder.decode(byteBufferAllocate, charBufferAllocate, false);
                        } else {
                            charsetDecoderNewDecoder.decode(byteBufferAllocate, charBufferAllocate, true);
                            charsetDecoderNewDecoder.flush(charBufferAllocate);
                        }
                        byteBufferAllocate.compact();
                        charBufferAllocate.flip();
                        char[] cArr = new char[charBufferAllocate.remaining()];
                        charBufferAllocate.get(cArr, 0, charBufferAllocate.remaining());
                        sb.append(cArr);
                    }
                } catch (IOException e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } catch (IOException e2) {
                e = e2;
                c0vsp = null;
            } catch (Throwable th2) {
                th = th2;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        LIZ(null);
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
            LIZ(c0vsp);
            return sb.toString();
        } catch (Exception e3) {
            TryCatchGuardChecker.doCheck(e3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("readFile error ");
            sbLIZ.append(e3.getMessage());
            C1706630uVp.LIZJ("FileUtils::", C2188811AlT.LIZIZ(sbLIZ));
            return null;
        }
    }

    public static void LJFF(String str, String str2) throws Throwable {
        try {
            File absoluteFile = new C0VSJ(str).getAbsoluteFile();
            if (!absoluteFile.exists()) {
                absoluteFile.createNewFile();
            }
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new C0VSV(absoluteFile, false));
                try {
                    outputStreamWriter.write(str2);
                    outputStreamWriter.flush();
                    C2107108Nh.LIZ(outputStreamWriter, null);
                    str2.length();
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            th = null;
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(outputStreamWriter, th);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }
}
