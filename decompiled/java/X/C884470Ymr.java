package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ymr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C884470Ymr implements InterfaceC884940Ync {
    public AnonymousClass0956 LIZIZ;
    public final C11NJ LIZ = new C11NJ();
    public final CopyOnWriteArrayList<InterfaceC879010Ye3> LIZJ = new CopyOnWriteArrayList<>();
    public final String LIZLLL = "VOSnapshotPlugin";
    public final String LJ = "vo_snapshot_plugin";

    @Override // X.InterfaceC884940Ync
    public final void LJIIIIZZ() {
    }

    @Override // X.InterfaceC884940Ync
    public final void LIZJ() {
        AnonymousClass0956 anonymousClass0956 = this.LIZIZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LIZIZ = null;
        this.LIZ.LJ();
    }

    public final void LJIIIZ() {
        for (InterfaceC879010Ye3 interfaceC879010Ye3 : this.LIZJ) {
            C884270YmX c884270YmX = C884500Ymu.LIZ().LJIIZILJ().get(interfaceC879010Ye3);
            if (c884270YmX != null) {
                if (C880900Yh6.LIZ()) {
                    C1729806q0.LIZ(interfaceC879010Ye3, new C884410Yml(this, c884270YmX, null));
                } else {
                    Collection<InterfaceC884440Ymo> collectionValues = c884270YmX.LJIIL().values();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
                    Iterator<T> it2 = collectionValues.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((InterfaceC884440Ymo) it2.next()).copyData());
                    }
                    LJIIJ(c884270YmX, new ArrayList(arrayList));
                }
            }
        }
    }

    public final Keva LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('_');
        sbLIZ.append(C461720I8s.LIZIZ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJFF() {
        AnonymousClass0956 anonymousClass0956LIZLLL;
        C309160C9y.LIZ();
        C884460Ymq c884460Ymq = new C884460Ymq(this, null);
        if (C880900Yh6.LIZJ()) {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C01M5(c884460Ymq, null), 3);
        } else {
            anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) C1729806q0.LIZLLL.getValue(), null, null, new C01M6(c884460Ymq, null), 3);
        }
        this.LIZIZ = anonymousClass0956LIZLLL;
        if (C884500Ymu.LIZ().LJIIL.LIZ().LIZJ) {
            C309160C9y.LIZ();
            this.LIZ.LIZ(C1906580ziK.LIZJ().LIZ().LJJLJLI(new C09JN() { // from class: X.0Yms
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("VOSnapshotPlugin@bc0c.initSwitchBackgroundStoreTask$1");
                    if (((C606810Nr5) obj).LIZIZ) {
                        C309160C9y.LIZ();
                        C1729806q0.LIZIZ(new AwS558S0100000_14(this.LL, 1469), true);
                    }
                    C1C7U.LIZIZ("VOSnapshotPlugin@bc0c.initSwitchBackgroundStoreTask$1");
                }
            }));
        }
    }

    @Override // X.InterfaceC884940Ync
    public final String LIZ() {
        return this.LJ;
    }

    public final List<InterfaceC884440Ymo> LIZLLL(C884270YmX c884270YmX) {
        List<InterfaceC884440Ymo> list;
        if (!C461720I8s.LJ()) {
            return C13BV.INSTANCE;
        }
        Keva kevaLIZIZ = LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append("_bytes");
        boolean z = false;
        byte[] bytes = kevaLIZIZ.getBytes(C2188811AlT.LIZIZ(sbLIZ), new byte[0]);
        if (bytes.length == 0) {
            z = true;
        }
        if (z) {
            return C13BV.INSTANCE;
        }
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        final List<Class<?>> list2 = c884270YmX.LIZ.LJIIL().LIZJ;
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream, list2) { // from class: X.09eY
            public final Set<String> LL = new HashSet();
            public final String LLILLJJLI = "VOSnapshotSafeObjectInputStream";

            @Override // java.io.ObjectInputStream
            public final Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException {
                if (objectStreamClass.getName() == null) {
                    return super.resolveClass(objectStreamClass);
                }
                if (((HashSet) this.LL).contains(objectStreamClass.getName())) {
                    return super.resolveClass(objectStreamClass);
                }
                C309160C9y.LIZIZ(this.LLILLJJLI);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Unauthorized deserialization attempt: ");
                sbLIZ2.append(objectStreamClass.getName());
                throw new ClassNotFoundException(C2188811AlT.LIZIZ(sbLIZ2));
            }

            {
                for (Class<?> cls : list2) {
                    ((HashSet) this.LL).add(cls.getName());
                }
            }
        };
        try {
            try {
                Object object = objectInputStream.readObject();
                if (object instanceof List) {
                    list = (List) object;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("get VO list, size=");
                sbLIZ2.append(list.size());
                C2188811AlT.LIZIZ(sbLIZ2);
                C309160C9y.LIZ();
                c884270YmX.LJIIZILJ = list;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C309160C9y.LIZJ(this.LIZLLL, e);
                LIZIZ().clear();
                list = C13BV.INSTANCE;
            }
            objectInputStream.close();
            byteArrayInputStream.close();
            return list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            objectInputStream.close();
            byteArrayInputStream.close();
            throw th;
        }
    }

    @Override // X.InterfaceC884940Ync
    public final void LJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LIZJ.add(interfaceC879010Ye3);
    }

    @Override // X.InterfaceC884940Ync
    public final void LJI(InterfaceC879010Ye3 interfaceC879010Ye3) {
        this.LIZJ.remove(interfaceC879010Ye3);
        C309160C9y.LIZ();
        C884270YmX c884270YmX = C884500Ymu.LIZ().LJIIZILJ().get(interfaceC879010Ye3);
        if (c884270YmX != null) {
            Collection<InterfaceC884440Ymo> collectionValues = c884270YmX.LJIIL().values();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
            Iterator<T> it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                arrayList.add(((InterfaceC884440Ymo) it2.next()).copyData());
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            if (C880900Yh6.LIZ()) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C884420Ymm(this, c884270YmX, arrayList2, null), 3);
            } else {
                C1729806q0.LIZ(interfaceC879010Ye3, new C884430Ymn(this, c884270YmX, arrayList2, null));
            }
        }
    }

    @Override // X.InterfaceC884940Ync
    public final void LJII(InterfaceC879010Ye3 interfaceC879010Ye3) {
        C884270YmX c884270YmX = C884500Ymu.LIZ().LJIIZILJ().get(interfaceC879010Ye3);
        if (c884270YmX == null) {
            return;
        }
        C1729806q0.LIZ(interfaceC879010Ye3, new C884390Ymj(c884270YmX, this, interfaceC879010Ye3, null));
    }

    public final void LJIIJ(C884270YmX c884270YmX, List<InterfaceC884440Ymo> list) {
        Function1<List<InterfaceC884440Ymo>, List<InterfaceC884440Ymo>> function1;
        List<InterfaceC884440Ymo> listInvoke;
        if (!C461720I8s.LJ() || (function1 = c884270YmX.LIZ.LJIIL().LIZLLL) == null || (listInvoke = function1.invoke(list)) == null || listInvoke.isEmpty() || Intrinsics.LJFF(listInvoke, c884270YmX.LJIIZILJ)) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("store vo list, page=");
        sbLIZ.append(c884270YmX.LIZ.getKey());
        sbLIZ.append(", size=");
        sbLIZ.append(listInvoke.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C309160C9y.LIZ();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        try {
            try {
                objectOutputStream.writeObject(listInvoke);
                c884270YmX.LJIIZILJ = listInvoke;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C309160C9y.LIZJ(this.LIZLLL, e);
                LIZIZ().clear();
            }
            objectOutputStream.close();
            byteArrayOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("store vo byte size : ");
            sbLIZ2.append(byteArray.length);
            C2188811AlT.LIZIZ(sbLIZ2);
            C309160C9y.LIZ();
            Keva kevaLIZIZ = LIZIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c884270YmX.LIZ.getKey());
            sbLIZ3.append("_bytes");
            kevaLIZIZ.storeBytes(C2188811AlT.LIZIZ(sbLIZ3), byteArray);
            Keva kevaLIZIZ2 = LIZIZ();
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(c884270YmX.LIZ.getKey());
            sbLIZ4.append("_hasMore");
            kevaLIZIZ2.storeBoolean(C2188811AlT.LIZIZ(sbLIZ4), c884270YmX.LJJIIZ.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            objectOutputStream.close();
            byteArrayOutputStream.close();
            throw th;
        }
    }
}
