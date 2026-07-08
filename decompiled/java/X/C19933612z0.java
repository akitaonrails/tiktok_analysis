package X;

import X.InterfaceC19930912yZ;
import com.google.protobuf.k0;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12z0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C19933612z0<ContainingT extends InterfaceC19930912yZ, T> extends AbstractC19933212yw<ContainingT, T> {
    public InterfaceC19935212zG LIZ;
    public final Class<?> LIZIZ;
    public final InterfaceC19930912yZ LIZJ;
    public final Method LIZLLL;
    public final Method LJ;
    public final EnumC19934512z9 LJFF;

    @Override // X.AbstractC19933212yw
    public final C19939112zt LIZJ() {
        InterfaceC19935212zG interfaceC19935212zG = this.LIZ;
        if (interfaceC19935212zG != null) {
            return interfaceC19935212zG.getDescriptor();
        }
        throw new IllegalStateException("getDescriptor() called before internalInit()");
    }

    @Override // X.AbstractC19933212yw
    public final InterfaceC19930912yZ LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.AbstractC19933212yw
    public final Object LIZIZ(Object obj) {
        C19939112zt c19939112ztLIZJ = LIZJ();
        if (c19939112ztLIZJ.LJJLJ()) {
            if (c19939112ztLIZJ.LJIJJ() != EnumC19937812zg.MESSAGE && c19939112ztLIZJ.LJIJJ() != EnumC19937812zg.ENUM) {
                return obj;
            }
            C19888012re c19888012re = new C19888012re();
            List list = (List) obj;
            c19888012re.LJ(list.size());
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                c19888012re.add(LJ(it2.next()));
            }
            c19888012re.LJJLIIIJL();
            return c19888012re;
        }
        return LJ(obj);
    }

    @Override // X.AbstractC19933212yw
    public final Object LJ(Object obj) {
        int i = C19934312z7.LIZ[LIZJ().LJIJJ().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return obj;
            }
            return k0.invokeOrDie(this.LIZLLL, null, obj);
        }
        if (this.LIZIZ.isInstance(obj)) {
            return obj;
        }
        InterfaceC19931912yj interfaceC19931912yjNewBuilderForType = this.LIZJ.newBuilderForType();
        interfaceC19931912yjNewBuilderForType.LJJIL((InterfaceC19930912yZ) obj);
        return interfaceC19931912yjNewBuilderForType.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC19933212yw
    public final Object LJFF(C130Q c130q) {
        C19939112zt c19939112ztLIZJ = LIZJ();
        if (c19939112ztLIZJ.LJJLJ()) {
            if (c19939112ztLIZJ.LJIJJ() == EnumC19937812zg.ENUM) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = ((List) c130q).iterator();
                while (it2.hasNext()) {
                    arrayList.add(LJI(it2.next()));
                }
                return arrayList;
            }
            return c130q;
        }
        return LJI(c130q);
    }

    public final Object LJI(Object obj) {
        if (C19934312z7.LIZ[LIZJ().LJIJJ().ordinal()] != 2) {
            return obj;
        }
        return k0.invokeOrDie(this.LJ, obj, new Object[0]);
    }

    public C19933612z0(C19934812zC c19934812zC, Class cls, InterfaceC19930912yZ interfaceC19930912yZ, EnumC19934512z9 enumC19934512z9) {
        if (InterfaceC19930912yZ.class.isAssignableFrom(cls) && !cls.isInstance(interfaceC19930912yZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Bad messageDefaultInstance for ");
            sbLIZ.append(cls.getName());
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZ = c19934812zC;
        this.LIZIZ = cls;
        this.LIZJ = interfaceC19930912yZ;
        if (InterfaceC19935612zK.class.isAssignableFrom(cls)) {
            this.LIZLLL = k0.getMethodOrDie(cls, "valueOf", C199423130z.class);
            this.LJ = k0.getMethodOrDie(cls, "getValueDescriptor", new Class[0]);
        } else {
            this.LIZLLL = null;
            this.LJ = null;
        }
        this.LJFF = enumC19934512z9;
    }
}
