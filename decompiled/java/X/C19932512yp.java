package X;

import X.C19928812yE;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: X.12yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19932512yp extends AbstractC19932312yn {
    public final AnonymousClass1301 LLILLJJLI;
    public final C19928612yC<C19939112zt> LLILLL;
    public final C19939112zt[] LLILZ;
    public final C19927612y2 LLILZIL;
    public int LLILZLL = -1;

    @Override // X.InterfaceC19933112yv
    public final Map<C19939112zt, Object> getAllFields() {
        return this.LLILLL.LJII();
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final InterfaceC19925612xi getDefaultInstanceForType() {
        return LJ(this.LLILLJJLI);
    }

    @Override // X.InterfaceC19925612xi
    public final InterfaceC19925712xj<C19932512yp> getParserForType() {
        return new AbstractC19925812xk<C19932512yp>() { // from class: X.12ys
            @Override // X.InterfaceC19925712xj
            public final Object LIZIZ(AbstractC19927312xz abstractC19927312xz, C19926312xp c19926312xp) throws C19926612xs {
                C19932412yo c19932412yo = new C19932412yo(this.LIZIZ.LLILLJJLI);
                try {
                    c19932412yo.LIZLLL(abstractC19927312xz, c19926312xp);
                    return c19932412yo.buildPartial();
                } catch (C19926612xs e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.setUnfinishedMessage(c19932412yo.buildPartial());
                    throw e;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C19926612xs c19926612xs = new C19926612xs(e2);
                    c19926612xs.setUnfinishedMessage(c19932412yo.buildPartial());
                    throw c19926612xs;
                }
            }
        };
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final int getSerializedSize() {
        int iLJIILIIL;
        int serializedSize;
        int i = this.LLILZLL;
        if (i != -1) {
            return i;
        }
        if (this.LLILLJJLI.LJIJJLI().getMessageSetWireFormat()) {
            iLJIILIIL = this.LLILLL.LJIIIZ();
            serializedSize = this.LLILZIL.LIZ();
        } else {
            iLJIILIIL = this.LLILLL.LJIILIIL();
            serializedSize = this.LLILZIL.getSerializedSize();
        }
        int i2 = iLJIILIIL + serializedSize;
        this.LLILZLL = i2;
        return i2;
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final boolean isInitialized() {
        AnonymousClass1301 anonymousClass1301 = this.LLILLJJLI;
        C19928612yC<C19939112zt> c19928612yC = this.LLILLL;
        for (C19939112zt c19939112zt : anonymousClass1301.LJIJJ()) {
            if (c19939112zt.LJJIJ() && !c19928612yC.LJIILJJIL(c19939112zt)) {
                return false;
            }
        }
        return c19928612yC.LJIILLIIL();
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final InterfaceC19928112y7 newBuilderForType() {
        return new C19932412yo(this.LLILLJJLI);
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final InterfaceC19928112y7 toBuilder() {
        C19932412yo c19932412yo = new C19932412yo(this.LLILLJJLI);
        c19932412yo.LJIIJJI(this);
        return c19932412yo;
    }

    @Override // X.InterfaceC19933112yv
    public final AnonymousClass1301 getDescriptorForType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC19933112yv
    public final C19927612y2 getUnknownFields() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19916512wF
    public final InterfaceC19930912yZ getDefaultInstanceForType() {
        return LJ(this.LLILLJJLI);
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final InterfaceC19931912yj newBuilderForType() {
        return new C19932412yo(this.LLILLJJLI);
    }

    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final InterfaceC19931912yj toBuilder() {
        C19932412yo c19932412yo = new C19932412yo(this.LLILLJJLI);
        c19932412yo.LJIIJJI(this);
        return c19932412yo;
    }

    public static C19932512yp LJ(AnonymousClass1301 anonymousClass1301) {
        return new C19932512yp(anonymousClass1301, C19928612yC.LIZLLL, new C19939112zt[anonymousClass1301.LLILLJJLI.getOneofDeclCount()], C19927612y2.LLILLJJLI);
    }

    @Override // X.InterfaceC19933112yv
    public final Object getField(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == this.LLILLJJLI) {
            Object objLJIIIIZZ = this.LLILLL.LJIIIIZZ(c19939112zt);
            if (objLJIIIIZZ == null) {
                if (c19939112zt.LJJLJ()) {
                    return Collections.emptyList();
                }
                if (c19939112zt.LJIJJ() == EnumC19937812zg.MESSAGE) {
                    return LJ(c19939112zt.LJIJJLI());
                }
                return c19939112zt.LJIIZILJ();
            }
            return objLJIIIIZZ;
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // X.AbstractC19932312yn
    public final C19939112zt getOneofFieldDescriptor(C19939212zu c19939212zu) {
        if (c19939212zu.LLILZIL == this.LLILLJJLI) {
            return this.LLILZ[c19939212zu.LLILLJJLI];
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    @Override // X.InterfaceC19933112yv
    public final boolean hasField(C19939112zt c19939112zt) {
        if (c19939112zt.LLJIJIL == this.LLILLJJLI) {
            return this.LLILLL.LJIILJJIL(c19939112zt);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // X.AbstractC19932312yn
    public final boolean hasOneof(C19939212zu c19939212zu) {
        if (c19939212zu.LLILZIL == this.LLILLJJLI) {
            if (this.LLILZ[c19939212zu.LLILLJJLI] == null) {
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("OneofDescriptor does not match message type.");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.AbstractC19932312yn, X.InterfaceC19925612xi
    public final void writeTo(AbstractC19928912yF abstractC19928912yF) {
        int i = 0;
        if (this.LLILLJJLI.LJIJJLI().getMessageSetWireFormat()) {
            C19928612yC<C19939112zt> c19928612yC = this.LLILLL;
            int i2 = c19928612yC.LIZ.LLILLJJLI;
            while (i < i2) {
                C19928612yC.LJJIII(c19928612yC.LIZ.LIZJ(i), abstractC19928912yF);
                i++;
            }
            Iterator it2 = c19928612yC.LIZ.LIZLLL().iterator();
            while (it2.hasNext()) {
                C19928612yC.LJJIII((Map.Entry) it2.next(), abstractC19928912yF);
            }
            this.LLILZIL.LIZIZ(abstractC19928912yF);
            return;
        }
        C19928612yC<C19939112zt> c19928612yC2 = this.LLILLL;
        int i3 = c19928612yC2.LIZ.LLILLJJLI;
        while (i < i3) {
            C19928812yE.c cVarLIZJ = c19928612yC2.LIZ.LIZJ(i);
            C19928612yC.LJJII((InterfaceC19930212yS) cVarLIZJ.LL, cVarLIZJ.LLILLJJLI, abstractC19928912yF);
            i++;
        }
        for (Map.Entry entry : c19928612yC2.LIZ.LIZLLL()) {
            C19928612yC.LJJII((InterfaceC19930212yS) entry.getKey(), entry.getValue(), abstractC19928912yF);
        }
        this.LLILZIL.writeTo(abstractC19928912yF);
    }

    public C19932512yp(AnonymousClass1301 anonymousClass1301, C19928612yC<C19939112zt> c19928612yC, C19939112zt[] c19939112ztArr, C19927612y2 c19927612y2) {
        this.LLILLJJLI = anonymousClass1301;
        this.LLILLL = c19928612yC;
        this.LLILZ = c19939112ztArr;
        this.LLILZIL = c19927612y2;
    }
}
