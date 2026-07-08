package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1690490u5n implements InterfaceC1690470u5l, InterfaceC1689940u4u {
    public final C20043513bd LL;
    public final InterfaceC1672350tcX LLILLJJLI;
    public final InterfaceC1690480u5m LLILLL;
    public final C20029713Yp<List<AbstractC1686530tzP>> LLILZ = C1685990tyX.LIZ();

    @Override // X.InterfaceC1681050tqZ
    public final float LJJ() {
        return this.LLILLJJLI.LJJ();
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJJJJLL(float f) {
        return this.LLILLJJLI.LJJJJLL(f);
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJLJJL(int i, int i2, Map<C115T, Integer> map, Function1<? super AbstractC1683310tuD, Unit> function1) {
        return this.LLILLJJLI.LJLJJL(i, i2, map, function1);
    }

    @Override // X.InterfaceC1690500u5o
    public final int LJLLJ(float f) {
        return this.LLILLJJLI.LJLLJ(f);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LJLLL(long j) {
        return this.LLILLJJLI.LJLLL(j);
    }

    @Override // X.InterfaceC1689940u4u
    public final InterfaceC1690350u5Z LJZI(int i, int i2, Map map, Function1 function1) {
        return this.LLILLJJLI.LJZI(i, i2, map, function1);
    }

    @Override // X.InterfaceC1676350tiz
    public final boolean LLIILII() {
        return this.LLILLJJLI.LLIILII();
    }

    @Override // X.InterfaceC1690500u5o
    public final float getDensity() {
        return this.LLILLJJLI.getDensity();
    }

    @Override // X.InterfaceC1676350tiz
    public final EnumC1671200tag getLayoutDirection() {
        return this.LLILLJJLI.getLayoutDirection();
    }

    @Override // X.InterfaceC1690470u5l, X.InterfaceC1690500u5o
    public final float LJJI(int i) {
        return this.LLILLJJLI.LJJI(i);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJJLIIIJLJLI(long j) {
        return this.LLILLJJLI.LJJLIIIJLJLI(j);
    }

    @Override // X.InterfaceC1690500u5o
    public final long LJLI(long j) {
        return this.LLILLJJLI.LJLI(j);
    }

    @Override // X.InterfaceC1681050tqZ
    public final long LJLJLJ(float f) {
        return this.LLILLJJLI.LJLJLJ(f);
    }

    @Override // X.InterfaceC1681050tqZ
    public final float LLI(long j) {
        return this.LLILLJJLI.LLI(j);
    }

    @Override // X.InterfaceC1690500u5o
    public final float LLIIIJ(float f) {
        return this.LLILLJJLI.LLIIIJ(f);
    }

    public C1690490u5n(C20043513bd c20043513bd, InterfaceC1672350tcX interfaceC1672350tcX) {
        this.LL = c20043513bd;
        this.LLILLJJLI = interfaceC1672350tcX;
        this.LLILLL = c20043513bd.LIZIZ.invoke();
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
    @Override // X.InterfaceC1690470u5l
    public final List<AbstractC1686530tzP> LJJIIZI(int i, long j) {
        List<AbstractC1686530tzP> listLIZIZ = this.LLILZ.LIZIZ(i);
        List<AbstractC1686530tzP> list = listLIZIZ;
        if (listLIZIZ == null) {
            Object objLIZLLL = this.LLILLL.LIZLLL(i);
            List<InterfaceC1673370teB> listLJJLIL = this.LLILLJJLI.LJJLIL(objLIZLLL, this.LL.LIZ(i, objLIZLLL, this.LLILLL.LJ(i)));
            int size = listLJJLIL.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(((InterfaceC1673370teB) ListProtector.get(listLJJLIL, i2)).LJJJJZ(j));
            }
            this.LLILZ.LJII(i, arrayList);
            list = arrayList;
        }
        return list;
    }
}
