package X;

import X.AbstractC19924512xX;
import X.AbstractC19924812xa;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: renamed from: X.12xa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19924812xa<MessageType extends AbstractC19924812xa<MessageType, BuilderType>, BuilderType extends AbstractC19924512xX<MessageType, BuilderType>> implements InterfaceC19925612xi {
    public int memoizedHashCode;

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public C19918012wU newUninitializedMessageException() {
        return new C19918012wU(this);
    }

    @Override // X.InterfaceC19925612xi
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC19928912yF.LIZIZ;
            C19929212yI c19929212yI = new C19929212yI(bArr, serializedSize);
            writeTo(c19929212yI);
            if (c19929212yI.LJJIZ() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // X.InterfaceC19925612xi
    public AbstractC19922812xG toByteString() {
        try {
            int serializedSize = getSerializedSize();
            AbstractC19922812xG abstractC19922812xG = AbstractC19922812xG.EMPTY;
            C19925312xf c19925312xf = new C19925312xf(serializedSize);
            writeTo(c19925312xf.LIZ);
            if (c19925312xf.LIZ.LJJIZ() == 0) {
                return new C19922512xD(c19925312xf.LIZIZ);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public static void checkByteStringIsUtf8(AbstractC19922812xG abstractC19922812xG) {
        if (abstractC19922812xG.isValidUtf8()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Serializing ");
        sbLIZ.append(getClass().getName());
        sbLIZ.append(" to a ");
        sbLIZ.append(str);
        sbLIZ.append(" threw an IOException (should never happen).");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public int getSerializedSize(InterfaceC19924912xb interfaceC19924912xb) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize == -1) {
            int iLJII = interfaceC19924912xb.LJII(this);
            setMemoizedSerializedSize(iLJII);
            return iLJII;
        }
        return memoizedSerializedSize;
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int iLJIILIIL = AbstractC19928912yF.LJIILIIL(serializedSize) + serializedSize;
        if (iLJIILIIL > 4096) {
            iLJIILIIL = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        C19929312yJ c19929312yJ = new C19929312yJ(outputStream, iLJIILIIL);
        c19929312yJ.LJJIJL(serializedSize);
        writeTo(c19929312yJ);
        if (c19929312yJ.LJFF > 0) {
            c19929312yJ.LJJJJI();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC19928912yF.LIZIZ;
        if (serializedSize > 4096) {
            serializedSize = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
        }
        C19929312yJ c19929312yJ = new C19929312yJ(outputStream, serializedSize);
        writeTo(c19929312yJ);
        if (c19929312yJ.LJFF > 0) {
            c19929312yJ.LJJJJI();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC19924512xX.addAll((Iterable) iterable, (List) list);
    }
}
