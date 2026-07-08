package X;

import X.AbstractC19924612xY;
import X.AbstractC19924712xZ;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.12xZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19924712xZ<MessageType extends AbstractC19924712xZ<MessageType, BuilderType>, BuilderType extends AbstractC19924612xY<MessageType, BuilderType>> extends AbstractC19924812xa<MessageType, BuilderType> {
    public static Map<Class<?>, AbstractC19924712xZ<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C19927712y3 unknownFields = C19927712y3.LJFF;

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public abstract Object dynamicMethod(EnumC19925112xd enumC19925112xd, Object obj, Object obj2);

    @Override // X.InterfaceC19925612xi
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    @Override // X.InterfaceC19916512wF
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    private void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C19927712y3.LJFF) {
            this.unknownFields = new C19927712y3();
        }
    }

    public Object buildMessageInfo() {
        return dynamicMethod(EnumC19925112xd.BUILD_MESSAGE_INFO, null, null);
    }

    public int computeHashCode() {
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        return c19921412x2.LIZ(getClass()).LIZIZ(this);
    }

    public final <MessageType2 extends AbstractC19924712xZ<MessageType2, BuilderType2>, BuilderType2 extends AbstractC19924612xY<MessageType2, BuilderType2>> BuilderType2 createBuilder() {
        return (BuilderType2) dynamicMethod(EnumC19925112xd.NEW_BUILDER, null, null);
    }

    @Override // X.InterfaceC19916512wF
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(EnumC19925112xd.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // X.AbstractC19924812xa
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC19925612xi
    public final InterfaceC19925712xj<MessageType> getParserForType() {
        return (InterfaceC19925712xj) dynamicMethod(EnumC19925112xd.GET_PARSER, null, null);
    }

    public boolean hashCodeIsNotMemoized() {
        return this.memoizedHashCode == 0;
    }

    public boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public void makeImmutable() {
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        c19921412x2.LIZ(getClass()).LJI(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // X.InterfaceC19925612xi
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(EnumC19925112xd.NEW_BUILDER, null, null);
    }

    public MessageType newMutableInstance() {
        return (MessageType) dynamicMethod(EnumC19925112xd.NEW_MUTABLE_INSTANCE, null, null);
    }

    @Override // X.InterfaceC19925612xi
    public final BuilderType toBuilder() {
        BuilderType buildertype = (BuilderType) dynamicMethod(EnumC19925112xd.NEW_BUILDER, null, null);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            this.memoizedHashCode = computeHashCode();
        }
        return this.memoizedHashCode;
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = C19901312tn.LIZ;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        C19901312tn.LIZJ(this, sb, 0);
        return sb.toString();
    }

    public static InterfaceC19888512rj emptyBooleanList() {
        return C19888412ri.LLILZIL;
    }

    public static InterfaceC19888712rl emptyDoubleList() {
        return C19888612rk.LLILZIL;
    }

    public static InterfaceC19888212rg emptyFloatList() {
        return C19888112rf.LLILZIL;
    }

    public static InterfaceC19922412xC emptyIntList() {
        return C19889012ro.LLILZIL;
    }

    public static InterfaceC19888912rn emptyLongList() {
        return C19888812rm.LLILZIL;
    }

    public static <E> InterfaceC19921012wy<E> emptyProtobufList() {
        return C19888012re.LLILZIL;
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    public static <MessageType extends AbstractC19925012xc<MessageType, BuilderType>, BuilderType, T> C19925512xh<MessageType, T> checkIsLite(AbstractC19925412xg<MessageType, T> abstractC19925412xg) {
        if (abstractC19925412xg.LIZ()) {
            return (C19925512xh) abstractC19925412xg;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T checkMessageInitialized(T t) throws C19926612xs {
        if (t != null && !t.isInitialized()) {
            C19926612xs c19926612xsAsInvalidProtocolBufferException = t.newUninitializedMessageException().asInvalidProtocolBufferException();
            c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(t);
            throw c19926612xsAsInvalidProtocolBufferException;
        }
        return t;
    }

    private int computeSerializedSize(InterfaceC19924912xb<?> interfaceC19924912xb) {
        if (interfaceC19924912xb == null) {
            C19921412x2 c19921412x2 = C19921412x2.LIZJ;
            c19921412x2.getClass();
            return c19921412x2.LIZ(getClass()).LJII(this);
        }
        return interfaceC19924912xb.LJII(this);
    }

    public static <T extends AbstractC19924712xZ<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
                if (t == null) {
                    t = (T) ((AbstractC19924712xZ) C19917512wP.LIZ(cls)).getDefaultInstanceForType();
                    if (t != null) {
                        defaultInstanceMap.put((Class<?>) cls, t);
                    } else {
                        throw new IllegalStateException();
                    }
                }
            } catch (ClassNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        return t;
    }

    public static InterfaceC19888212rg mutableCopy(InterfaceC19888212rg interfaceC19888212rg) {
        C19888112rf c19888112rf = (C19888112rf) interfaceC19888212rg;
        return c19888112rf.LJIILL(c19888112rf.LLILLL * 2);
    }

    public final <MessageType2 extends AbstractC19924712xZ<MessageType2, BuilderType2>, BuilderType2 extends AbstractC19924612xY<MessageType2, BuilderType2>> BuilderType2 createBuilder(MessageType2 messagetype2) {
        BuilderType2 buildertype2 = (BuilderType2) createBuilder();
        buildertype2.mergeFrom(messagetype2);
        return buildertype2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        return c19921412x2.LIZ(getClass()).LIZJ(this, obj);
    }

    @Override // X.AbstractC19924812xa
    public int getSerializedSize(InterfaceC19924912xb interfaceC19924912xb) {
        if (isMutable()) {
            int iComputeSerializedSize = computeSerializedSize(interfaceC19924912xb);
            if (iComputeSerializedSize >= 0) {
                return iComputeSerializedSize;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("serialized size must be non-negative, was ");
            sbLIZ.append(iComputeSerializedSize);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int iComputeSerializedSize2 = computeSerializedSize(interfaceC19924912xb);
        setMemoizedSerializedSize(iComputeSerializedSize2);
        return iComputeSerializedSize2;
    }

    public final void mergeUnknownFields(C19927712y3 c19927712y3) {
        this.unknownFields = C19927712y3.LJ(this.unknownFields, c19927712y3);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // X.AbstractC19924812xa
    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("serialized size must be non-negative, was ");
            sbLIZ.append(i);
            throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // X.InterfaceC19925612xi
    public void writeTo(AbstractC19928912yF abstractC19928912yF) {
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        InterfaceC19924912xb interfaceC19924912xbLIZ = c19921412x2.LIZ(getClass());
        C19929012yG c19929012yG = abstractC19928912yF.LIZ;
        if (c19929012yG == null) {
            c19929012yG = new C19929012yG(abstractC19928912yF);
        }
        interfaceC19924912xbLIZ.LJ(this, c19929012yG);
    }

    public static InterfaceC19888512rj mutableCopy(InterfaceC19888512rj interfaceC19888512rj) {
        C19888412ri c19888412ri = (C19888412ri) interfaceC19888512rj;
        return c19888412ri.LJIILL(c19888412ri.LLILLL * 2);
    }

    public static InterfaceC19888712rl mutableCopy(InterfaceC19888712rl interfaceC19888712rl) {
        C19888612rk c19888612rk = (C19888612rk) interfaceC19888712rl;
        return c19888612rk.LJIILL(c19888612rk.LLILLL * 2);
    }

    public static InterfaceC19888912rn mutableCopy(InterfaceC19888912rn interfaceC19888912rn) {
        C19888812rm c19888812rm = (C19888812rm) interfaceC19888912rn;
        return c19888812rm.LJIILL(c19888812rm.LLILLL * 2);
    }

    public static <E> InterfaceC19921012wy<E> mutableCopy(InterfaceC19921012wy<E> interfaceC19921012wy) {
        return interfaceC19921012wy.LJIILL2(interfaceC19921012wy.size() * 2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.12ro, X.12xC] */
    public static InterfaceC19922412xC mutableCopy(InterfaceC19922412xC interfaceC19922412xC) {
        return interfaceC19922412xC.LJIILL2(interfaceC19922412xC.size() * 2);
    }

    public static final <T extends AbstractC19924712xZ<T, ?>> boolean isInitialized(T t, boolean z) {
        Object obj;
        byte bByteValue = ((Byte) t.dynamicMethod(EnumC19925112xd.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C19921412x2 c19921412x2 = C19921412x2.LIZJ;
        c19921412x2.getClass();
        boolean zLIZLLL = c19921412x2.LIZ(t.getClass()).LIZLLL(t);
        if (z) {
            EnumC19925112xd enumC19925112xd = EnumC19925112xd.SET_MEMOIZED_IS_INITIALIZED;
            if (zLIZLLL) {
                obj = t;
            } else {
                obj = null;
            }
            t.dynamicMethod(enumC19925112xd, obj, null);
        }
        return zLIZLLL;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws C19926612xs {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, C19926312xp.LIZ());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, InputStream inputStream) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, AbstractC19927312xz.LJIIIZ(inputStream), C19926312xp.LIZ());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parsePartialFrom(T t, AbstractC19927312xz abstractC19927312xz) {
        return (T) parsePartialFrom(t, abstractC19927312xz, C19926312xp.LIZ());
    }

    public static <T extends AbstractC19924712xZ<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    public void mergeLengthDelimitedField(int i, AbstractC19922812xG abstractC19922812xG) {
        ensureUnknownFieldsInitialized();
        C19927712y3 c19927712y3 = this.unknownFields;
        c19927712y3.LIZ();
        if (i != 0) {
            c19927712y3.LJFF((i << 3) | 2, abstractC19922812xG);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C19927712y3 c19927712y3 = this.unknownFields;
        c19927712y3.LIZ();
        if (i != 0) {
            c19927712y3.LJFF(i << 3, Long.valueOf(i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i, AbstractC19927312xz abstractC19927312xz) {
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.LIZLLL(i, abstractC19927312xz);
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, byte[] bArr) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, C19926312xp.LIZ());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, AbstractC19922812xG abstractC19922812xG) throws C19926612xs {
        T t2 = (T) parseFrom(t, abstractC19922812xG, C19926312xp.LIZ());
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, AbstractC19927312xz abstractC19927312xz) {
        return (T) parseFrom(t, abstractC19927312xz, C19926312xp.LIZ());
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) {
        return (T) parseFrom(t, byteBuffer, C19926312xp.LIZ());
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Generated message class \"");
            sbLIZ.append(cls.getName());
            sbLIZ.append("\" missing method \"");
            sbLIZ.append(str);
            sbLIZ.append("\".");
            throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) throws Throwable {
        try {
            return C2204961BRm.a0(method, obj, objArr, new C0WZX("dzBzEgU1UM3QUBkxVx2QaW1CwM1G8aMcweyw5vpI4YvFYgRjxwNsOQ==", null));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            Throwable cause = e2.getCause();
            if ((cause instanceof RuntimeException) || (cause instanceof Error)) {
                throw cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static Object newMessageInfo(InterfaceC19925612xi interfaceC19925612xi, String str, Object[] objArr) {
        return new C19918112wV(interfaceC19925612xi, str, objArr);
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parsePartialDelimitedFrom(t, inputStream, c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parseFrom(t, AbstractC19927312xz.LJIIJ(byteBuffer, false), c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C19926312xp c19926312xp) throws C19926612xs {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(new C133M(inputStream, AbstractC19927312xz.LJJIIJ(inputStream, i)));
            T t2 = (T) parsePartialFrom(t, abstractC19927312xzLJIIIZ, c19926312xp);
            try {
                abstractC19927312xzLJIIIZ.LIZ(0);
                return t2;
            } catch (C19926612xs e) {
                TryCatchGuardChecker.doCheck(e);
                e.setUnfinishedMessage(t2);
                throw e;
            }
        } catch (C19926612xs e2) {
            TryCatchGuardChecker.doCheck(e2);
            if (e2.wasThrownFromInputStream) {
                throw new C19926612xs((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new C19926612xs(e3);
        }
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parsePartialFrom(T t, AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws Throwable {
        T t2 = (T) t.newMutableInstance();
        try {
            InterfaceC19924912xb interfaceC19924912xbLIZIZ = C19921412x2.LIZJ.LIZIZ(t2);
            C19927412y0 c19927412y0 = abstractC19927312xz.LJ;
            if (c19927412y0 == null) {
                c19927412y0 = new C19927412y0(abstractC19927312xz);
            }
            interfaceC19924912xbLIZIZ.LJIIIIZZ(t2, c19927412y0, c19926312xp);
            interfaceC19924912xbLIZIZ.LJI(t2);
            return t2;
        } catch (C19918012wU e) {
            TryCatchGuardChecker.doCheck(e);
            C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
            c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(t2);
            throw c19926612xsAsInvalidProtocolBufferException;
        } catch (C19926612xs e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (e.wasThrownFromInputStream) {
                e = new C19926612xs((IOException) e);
            }
            e.setUnfinishedMessage(t2);
            throw e;
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (e3.getCause() instanceof C19926612xs) {
                throw e3.getCause();
            }
            C19926612xs c19926612xs = new C19926612xs(e3);
            c19926612xs.setUnfinishedMessage(t2);
            throw c19926612xs;
        } catch (RuntimeException e4) {
            TryCatchGuardChecker.doCheck(e4);
            if (e4.getCause() instanceof C19926612xs) {
                throw e4.getCause();
            }
            throw e4;
        }
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, InputStream inputStream, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, AbstractC19927312xz.LJIIIZ(inputStream), c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parsePartialFrom(T t, AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) throws C19926612xs {
        AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
        T t2 = (T) parsePartialFrom(t, abstractC19927312xzNewCodedInput, c19926312xp);
        try {
            abstractC19927312xzNewCodedInput.LIZ(0);
            return t2;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            e.setUnfinishedMessage(t2);
            throw e;
        }
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, byte[] bArr, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, bArr, 0, bArr.length, c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, abstractC19922812xG, c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parseFrom(T t, AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
        T t2 = (T) parsePartialFrom(t, abstractC19927312xz, c19926312xp);
        checkMessageInitialized(t2);
        return t2;
    }

    public static <T extends AbstractC19924712xZ<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C19926312xp c19926312xp) throws Throwable {
        if (i2 == 0) {
            return t;
        }
        T t2 = (T) t.newMutableInstance();
        try {
            InterfaceC19924912xb interfaceC19924912xbLIZIZ = C19921412x2.LIZJ.LIZIZ(t2);
            interfaceC19924912xbLIZIZ.LJFF(t2, bArr, i, i + i2, new C19926712xt(c19926312xp));
            interfaceC19924912xbLIZIZ.LJI(t2);
            return t2;
        } catch (C19918012wU e) {
            TryCatchGuardChecker.doCheck(e);
            C19926612xs c19926612xsAsInvalidProtocolBufferException = e.asInvalidProtocolBufferException();
            c19926612xsAsInvalidProtocolBufferException.setUnfinishedMessage(t2);
            throw c19926612xsAsInvalidProtocolBufferException;
        } catch (C19926612xs e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (e.wasThrownFromInputStream) {
                e = new C19926612xs((IOException) e);
            }
            e.setUnfinishedMessage(t2);
            throw e;
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            if (e3.getCause() instanceof C19926612xs) {
                throw e3.getCause();
            }
            C19926612xs c19926612xs = new C19926612xs(e3);
            c19926612xs.setUnfinishedMessage(t2);
            throw c19926612xs;
        } catch (IndexOutOfBoundsException e4) {
            TryCatchGuardChecker.doCheck(e4);
            C19926612xs c19926612xsLJII = C19926612xs.LJII();
            c19926612xsLJII.setUnfinishedMessage(t2);
            throw c19926612xsLJII;
        }
    }

    public static <ContainingType extends InterfaceC19925612xi, Type> C19925512xh<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, InterfaceC19925612xi interfaceC19925612xi, InterfaceC19922212xA<?> interfaceC19922212xA, int i, AnonymousClass1334 anonymousClass1334, boolean z, Class cls) {
        return new C19925512xh<>(containingtype, C19888012re.LLILZIL, interfaceC19925612xi, new C19926412xq(interfaceC19922212xA, i, anonymousClass1334, true, z));
    }

    public static <ContainingType extends InterfaceC19925612xi, Type> C19925512xh<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, InterfaceC19925612xi interfaceC19925612xi, InterfaceC19922212xA<?> interfaceC19922212xA, int i, AnonymousClass1334 anonymousClass1334, Class cls) {
        return new C19925512xh<>(containingtype, type, interfaceC19925612xi, new C19926412xq(interfaceC19922212xA, i, anonymousClass1334, false, false));
    }
}
