package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.TemplateData;
import com.lynx.tasm.base.TraceEvent;
import com.tts.oecverify.BdTuring;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ju6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1298840ju6 {
    public static final C1298840ju6 LIZ = new C1298840ju6();
    public static final boolean LIZIZ;
    public static final Charset LIZJ;

    static {
        LIZIZ = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        LIZJ = Charset.forName("UTF8");
    }

    public static Object LIZ(ByteBuffer byteBuffer) {
        TraceEvent.LIZLLL("LepusBuffer::DecodeMessage");
        if (byteBuffer == null) {
            TraceEvent.LJII("LepusBuffer::DecodeMessage");
            return null;
        }
        try {
            byteBuffer.order(ByteOrder.nativeOrder());
            Object objLJ = LJ(byteBuffer);
            if (!byteBuffer.hasRemaining()) {
                TraceEvent.LJII("LepusBuffer::DecodeMessage");
                return objLJ;
            }
            throw new IllegalArgumentException("Message corrupted");
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxError lynxError = new LynxError(e.toString(), -3);
            if (LynxEnv.inst().getLynxViewClient() != null) {
                LynxEnv.inst().getLynxViewClient().LJFF(lynxError);
            }
            TraceEvent.LJII("LepusBuffer::DecodeMessage");
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.0ju7, java.io.ByteArrayOutputStream] */
    public static ByteBuffer LIZIZ(Object obj) {
        TraceEvent.LIZLLL("LepusBuffer::EncodeMessage");
        if (obj == null) {
            TraceEvent.LJII("LepusBuffer::EncodeMessage");
            return null;
        }
        ?? r4 = new ByteArrayOutputStream() { // from class: X.0ju7
            public final byte[] LIZ() {
                return ((ByteArrayOutputStream) this).buf;
            }
        };
        try {
            LJFF(r4, obj, new LinkedList());
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(r4.size());
            byteBufferAllocateDirect.put(r4.LIZ(), 0, r4.size());
            TraceEvent.LJII("LepusBuffer::EncodeMessage");
            return byteBufferAllocateDirect;
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            LynxError lynxError = new LynxError(e.toString(), -3);
            LynxEnv.inst().getLynxViewClient().LJFF(lynxError);
            LynxLog.e("LepusBuffer", lynxError.toString());
            TraceEvent.LJII("LepusBuffer::EncodeMessage");
            return null;
        }
    }

    public static void LIZJ(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position() % 8;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + 8) - iPosition);
        }
    }

    public static int LIZLLL(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int i = byteBuffer.get() & 255;
            if (i < 254) {
                return i;
            }
            if (i == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static Object LJ(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            byte b = byteBuffer.get();
            if (b != 100) {
                int i = 0;
                switch (b) {
                    case 0:
                        return null;
                    case 1:
                        return Boolean.TRUE;
                    case 2:
                        return Boolean.FALSE;
                    case 3:
                        LIZJ(byteBuffer);
                        return Integer.valueOf(byteBuffer.getInt());
                    case 4:
                        LIZJ(byteBuffer);
                        return Long.valueOf(byteBuffer.getLong());
                    case 5:
                        LIZJ(byteBuffer);
                        return Double.valueOf(byteBuffer.getDouble());
                    case 6:
                        byte[] bArr = new byte[LIZLLL(byteBuffer)];
                        byteBuffer.get(bArr);
                        return new String(bArr, LIZJ);
                    case 7:
                        int iLIZLLL = LIZLLL(byteBuffer);
                        ArrayList arrayList = new ArrayList(iLIZLLL);
                        while (i < iLIZLLL) {
                            arrayList.add(LJ(byteBuffer));
                            i++;
                        }
                        return arrayList;
                    case 8:
                        int iLIZLLL2 = LIZLLL(byteBuffer);
                        HashMap map = new HashMap();
                        while (i < iLIZLLL2) {
                            map.put(LJ(byteBuffer), LJ(byteBuffer));
                            i++;
                        }
                        return map;
                    case BdTuring.TYPE_ECAF /* 9 */:
                        byte[] bArr2 = new byte[LIZLLL(byteBuffer)];
                        byteBuffer.get(bArr2);
                        return bArr2;
                    default:
                        throw new IllegalArgumentException("Message corrupted");
                }
            }
            return null;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public static boolean LJI(Object obj, Collection collection) {
        if (obj == null) {
            return false;
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (obj == it2.next()) {
                return true;
            }
        }
        return false;
    }

    public static void LJII(C1298850ju7 c1298850ju7, int i) {
        if (LIZIZ) {
            c1298850ju7.write(i);
            c1298850ju7.write(i >>> 8);
            c1298850ju7.write(i >>> 16);
            c1298850ju7.write(i >>> 24);
            return;
        }
        c1298850ju7.write(i >>> 24);
        c1298850ju7.write(i >>> 16);
        c1298850ju7.write(i >>> 8);
        c1298850ju7.write(i);
    }

    public static void LJIIIIZZ(C1298850ju7 c1298850ju7, long j) {
        if (LIZIZ) {
            c1298850ju7.write((byte) j);
            c1298850ju7.write((byte) (j >>> 8));
            c1298850ju7.write((byte) (j >>> 16));
            c1298850ju7.write((byte) (j >>> 24));
            c1298850ju7.write((byte) (j >>> 32));
            c1298850ju7.write((byte) (j >>> 40));
            c1298850ju7.write((byte) (j >>> 48));
            c1298850ju7.write((byte) (j >>> 56));
            return;
        }
        c1298850ju7.write((byte) (j >>> 56));
        c1298850ju7.write((byte) (j >>> 48));
        c1298850ju7.write((byte) (j >>> 40));
        c1298850ju7.write((byte) (j >>> 32));
        c1298850ju7.write((byte) (j >>> 24));
        c1298850ju7.write((byte) (j >>> 16));
        c1298850ju7.write((byte) (j >>> 8));
        c1298850ju7.write((byte) j);
    }

    public static void LJIIIZ(C1298850ju7 c1298850ju7, int i) {
        if (i < 254) {
            c1298850ju7.write(i);
            return;
        }
        if (i <= 65535) {
            c1298850ju7.write(254);
            if (LIZIZ) {
                c1298850ju7.write(i);
                c1298850ju7.write(i >>> 8);
                return;
            } else {
                c1298850ju7.write(i >>> 8);
                c1298850ju7.write(i);
                return;
            }
        }
        c1298850ju7.write(255);
        LJII(c1298850ju7, i);
    }

    public static void LJFF(C1298850ju7 c1298850ju7, Object obj, LinkedList linkedList) {
        int i;
        if (obj != null && !obj.equals(null)) {
            if (obj instanceof Boolean) {
                if (((Boolean) obj).booleanValue()) {
                    i = 1;
                } else {
                    i = 2;
                }
                c1298850ju7.write(i);
                return;
            }
            if (obj instanceof Number) {
                if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    if (obj instanceof Long) {
                        c1298850ju7.write(4);
                        LJIIIIZZ(c1298850ju7, ((Long) obj).longValue());
                        return;
                    }
                    if (!(obj instanceof Float) && !(obj instanceof Double)) {
                        c1298850ju7.write(0);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported Number type: ");
                        sbLIZ.append(obj.getClass());
                        sbLIZ.append(" value: ");
                        sbLIZ.append(obj);
                        LynxLog.e("LepusBuffer", C2188811AlT.LIZIZ(sbLIZ));
                        return;
                    }
                    c1298850ju7.write(5);
                    int size = c1298850ju7.size() % 8;
                    if (size != 0) {
                        for (int i2 = 0; i2 < 8 - size; i2++) {
                            c1298850ju7.write(0);
                        }
                    }
                    LJIIIIZZ(c1298850ju7, Double.doubleToLongBits(((Number) obj).doubleValue()));
                    return;
                }
                c1298850ju7.write(3);
                LJII(c1298850ju7, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof String) {
                c1298850ju7.write(6);
                byte[] bytes = ((String) obj).getBytes(LIZJ);
                LJIIIZ(c1298850ju7, bytes.length);
                c1298850ju7.write(bytes, 0, bytes.length);
                return;
            }
            if (obj instanceof List) {
                List list = (List) obj;
                if (!list.isEmpty() && LJI(obj, linkedList)) {
                    c1298850ju7.write(0);
                    LynxLog.DTHROW(new IllegalArgumentException("writeValue has cycle array!"));
                    return;
                }
                linkedList.addLast(obj);
                c1298850ju7.write(7);
                LJIIIZ(c1298850ju7, list.size());
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    LJFF(c1298850ju7, it2.next(), linkedList);
                }
                linkedList.removeLast();
                return;
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (!map.isEmpty() && LJI(obj, linkedList)) {
                    c1298850ju7.write(0);
                    LynxLog.DTHROW(new IllegalArgumentException("writeValue has cycle dict!"));
                    return;
                }
                linkedList.addLast(obj);
                c1298850ju7.write(8);
                LJIIIZ(c1298850ju7, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    LJFF(c1298850ju7, entry.getKey(), linkedList);
                    LJFF(c1298850ju7, entry.getValue(), linkedList);
                }
                linkedList.removeLast();
                return;
            }
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if (jSONObject.length() > 0 && LJI(obj, linkedList)) {
                    c1298850ju7.write(0);
                    LynxLog.DTHROW(new IllegalArgumentException("writeValue has cycle JSONObject!"));
                    return;
                }
                linkedList.addLast(obj);
                c1298850ju7.write(8);
                LJIIIZ(c1298850ju7, jSONObject.length());
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    LJFF(c1298850ju7, next, linkedList);
                    LJFF(c1298850ju7, jSONObject.opt(next), linkedList);
                }
                linkedList.removeLast();
                return;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                if (jSONArray.length() > 0 && LJI(obj, linkedList)) {
                    c1298850ju7.write(0);
                    LynxLog.DTHROW(new IllegalArgumentException("writeValue has cycle JSONArray!"));
                    return;
                }
                linkedList.addLast(obj);
                c1298850ju7.write(7);
                LJIIIZ(c1298850ju7, jSONArray.length());
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    LJFF(c1298850ju7, jSONArray.opt(i3), linkedList);
                }
                linkedList.removeLast();
                return;
            }
            if (obj instanceof byte[]) {
                c1298850ju7.write(9);
                byte[] bArr = (byte[]) obj;
                LJIIIZ(c1298850ju7, bArr.length);
                c1298850ju7.write(bArr, 0, bArr.length);
                return;
            }
            if (obj instanceof TemplateData) {
                TemplateData templateData = (TemplateData) obj;
                templateData.LJI();
                c1298850ju7.write(10);
                LJIIIIZZ(c1298850ju7, templateData.LIZ);
                return;
            }
            c1298850ju7.write(0);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Unsupported type: ");
            sbLIZ2.append(obj.getClass());
            sbLIZ2.append(" value: ");
            sbLIZ2.append(obj);
            LynxLog.e("LepusBuffer", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        c1298850ju7.write(0);
    }
}
