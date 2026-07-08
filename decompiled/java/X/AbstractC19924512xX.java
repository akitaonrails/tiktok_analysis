package X;

import X.AbstractC19924512xX;
import X.AbstractC19924812xa;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import defpackage.Config;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: X.12xX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public abstract class AbstractC19924512xX<MessageType extends AbstractC19924812xa<MessageType, BuilderType>, BuilderType extends AbstractC19924512xX<MessageType, BuilderType>> implements InterfaceC19928112y7 {
    @Override // 
    /* JADX INFO: renamed from: clone */
    public abstract BuilderType mo79clone();

    public abstract BuilderType internalMergeFrom(MessageType messagetype);

    @Override // X.InterfaceC19928112y7
    public abstract BuilderType mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp);

    private String getReadingExceptionMessage(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Reading ");
        sbLIZ.append(getClass().getName());
        sbLIZ.append(" from a ");
        sbLIZ.append(str);
        sbLIZ.append(" threw an IOException (should never happen).");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C19918012wU newUninitializedMessageException(InterfaceC19925612xi interfaceC19925612xi) {
        return new C19918012wU(interfaceC19925612xi);
    }

    public boolean mergeDelimitedFrom(InputStream inputStream) {
        return mergeDelimitedFrom(inputStream, C19926312xp.LIZ());
    }

    public BuilderType mergeFrom(AbstractC19922812xG abstractC19922812xG) {
        try {
            AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
            mergeFrom(abstractC19927312xzNewCodedInput);
            abstractC19927312xzNewCodedInput.LIZ(0);
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    @Override // X.InterfaceC19928112y7
    public BuilderType mergeFrom(InterfaceC19925612xi interfaceC19925612xi) {
        if (getDefaultInstanceForType().getClass().isInstance(interfaceC19925612xi)) {
            internalMergeFrom((AbstractC19924812xa) interfaceC19925612xi);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType mergeFrom(InputStream inputStream) {
        AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(inputStream);
        mergeFrom(abstractC19927312xzLJIIIZ);
        abstractC19927312xzLJIIIZ.LIZ(0);
        return this;
    }

    public BuilderType mergeFrom(AbstractC19927312xz abstractC19927312xz) {
        mergeFrom(abstractC19927312xz, C19926312xp.LIZ());
        return this;
    }

    @Override // X.InterfaceC19928112y7
    public BuilderType mergeFrom(byte[] bArr) {
        mergeFrom(bArr, 0, bArr.length);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo80mergeFrom(AbstractC19922812xG abstractC19922812xG) {
        mergeFrom(abstractC19922812xG);
        return this;
    }

    @Override // X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(InterfaceC19925612xi interfaceC19925612xi) {
        mergeFrom(interfaceC19925612xi);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo82mergeFrom(AbstractC19927312xz abstractC19927312xz) {
        mergeFrom(abstractC19927312xz);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo83mergeFrom(InputStream inputStream) {
        mergeFrom(inputStream);
        return this;
    }

    @Override // X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(byte[] bArr) {
        mergeFrom(bArr);
        return this;
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = C19922012x8.LIZ;
        iterable.getClass();
        if (iterable instanceof InterfaceC19921312x1) {
            List<?> listLJJJJJ = ((InterfaceC19921312x1) iterable).LJJJJJ();
            InterfaceC19921312x1 interfaceC19921312x1 = (InterfaceC19921312x1) list;
            int size = list.size();
            for (Object obj : listLJJJJJ) {
                if (obj == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Element at index ");
                    sbLIZ.append(interfaceC19921312x1.size() - size);
                    sbLIZ.append(" is null.");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    for (int size2 = interfaceC19921312x1.size() - 1; size2 >= size; size2--) {
                        interfaceC19921312x1.remove(size2);
                    }
                    throw new NullPointerException(strLIZIZ);
                }
                if (obj instanceof AbstractC19922812xG) {
                    interfaceC19921312x1.LJL((AbstractC19922812xG) obj);
                } else if (obj instanceof byte[]) {
                    interfaceC19921312x1.LJL(AbstractC19922812xG.copyFrom((byte[]) obj));
                } else {
                    interfaceC19921312x1.add(obj);
                }
            }
            return;
        }
        if (iterable instanceof InterfaceC19888312rh) {
            list.addAll((Collection) iterable);
        } else {
            addAllCheckingNulls(iterable, list);
        }
    }

    public static <T> void addAllCheckingNulls(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof C19888012re) {
                ((C19888012re) list).LJ(list.size() + size);
            }
        }
        int size2 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                Config config = (Object) ListProtector.get(list2, i);
                if (config == null) {
                    resetListAndThrow(list, size2);
                }
                list.add(config);
            }
            return;
        }
        for (Object obj : iterable) {
            if (obj == null) {
                resetListAndThrow(list, size2);
            }
            list.add(obj);
        }
    }

    public static void resetListAndThrow(List<?> list, int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Element at index ");
        sbLIZ.append(list.size() - i);
        sbLIZ.append(" is null.");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        for (int size = list.size() - 1; size >= i; size--) {
            ListProtector.remove(list, size);
        }
        throw new NullPointerException(strLIZIZ);
    }

    public boolean mergeDelimitedFrom(InputStream inputStream, C19926312xp c19926312xp) throws IOException {
        int i = inputStream.read();
        if (i == -1) {
            return false;
        }
        mergeFrom((InputStream) new C133M(inputStream, AbstractC19927312xz.LJJIIJ(inputStream, i)), c19926312xp);
        return true;
    }

    public BuilderType mergeFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        try {
            AbstractC19927312xz abstractC19927312xzNewCodedInput = abstractC19922812xG.newCodedInput();
            mergeFrom(abstractC19927312xzNewCodedInput, c19926312xp);
            abstractC19927312xzNewCodedInput.LIZ(0);
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(getReadingExceptionMessage("ByteString"), e2);
        }
    }

    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        addAll((Iterable) iterable, (List) collection);
    }

    public BuilderType mergeFrom(InputStream inputStream, C19926312xp c19926312xp) {
        AbstractC19927312xz abstractC19927312xzLJIIIZ = AbstractC19927312xz.LJIIIZ(inputStream);
        mergeFrom(abstractC19927312xzLJIIIZ, c19926312xp);
        abstractC19927312xzLJIIIZ.LIZ(0);
        return this;
    }

    public BuilderType mergeFrom(byte[] bArr, C19926312xp c19926312xp) {
        mergeFrom(bArr, 0, bArr.length, c19926312xp);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo81mergeFrom(AbstractC19922812xG abstractC19922812xG, C19926312xp c19926312xp) {
        mergeFrom(abstractC19922812xG, c19926312xp);
        return this;
    }

    @Override // X.InterfaceC19928112y7
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mergeFrom(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) {
        mergeFrom(abstractC19927312xz, c19926312xp);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo84mergeFrom(InputStream inputStream, C19926312xp c19926312xp) {
        mergeFrom(inputStream, c19926312xp);
        return this;
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo87mergeFrom(byte[] bArr, C19926312xp c19926312xp) {
        mergeFrom(bArr, c19926312xp);
        return this;
    }

    public BuilderType mergeFrom(byte[] bArr, int i, int i2) {
        try {
            C19927212xy c19927212xyLJIIIIZZ = AbstractC19927312xz.LJIIIIZZ(bArr, i, i2, false);
            mergeFrom((AbstractC19927312xz) c19927212xyLJIIIIZZ);
            c19927212xyLJIIIIZZ.LIZ(0);
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo85mergeFrom(byte[] bArr, int i, int i2) {
        mergeFrom(bArr, i, i2);
        return this;
    }

    public BuilderType mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) {
        try {
            C19927212xy c19927212xyLJIIIIZZ = AbstractC19927312xz.LJIIIIZZ(bArr, i, i2, false);
            mergeFrom((AbstractC19927312xz) c19927212xyLJIIIIZZ, c19926312xp);
            c19927212xyLJIIIIZZ.LIZ(0);
            return this;
        } catch (C19926612xs e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (IOException e2) {
            TryCatchGuardChecker.doCheck(e2);
            throw new RuntimeException(getReadingExceptionMessage("byte array"), e2);
        }
    }

    /* JADX INFO: renamed from: mergeFrom, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ InterfaceC19928112y7 mo86mergeFrom(byte[] bArr, int i, int i2, C19926312xp c19926312xp) {
        mergeFrom(bArr, i, i2, c19926312xp);
        return this;
    }
}
