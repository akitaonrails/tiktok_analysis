package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS410S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0Nbo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupSearchContentUpdateEngine$_conversationObserverFlow$1", f = "GroupSearchContentUpdateEngine.kt", l = {201}, m = "invokeSuspend")
public final class C597340Nbo extends C09AX implements Function2<C094D<? super C597130NbT>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C907490Zit LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C597340Nbo(C907490Zit c907490Zit, InterfaceC1364105Vn<? super C597340Nbo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c907490Zit;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C597340Nbo c597340Nbo = new C597340Nbo(this.LLILLL, interfaceC1364105Vn);
        c597340Nbo.LLILLJJLI = obj;
        return c597340Nbo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Nbn, X.0XzV] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupSearchContentUpdateEngine@13e9._conversationObserverFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            final C094D c094d = (C094D) this.LLILLJJLI;
            final C907490Zit c907490Zit = this.LLILLL;
            ?? r3 = new InterfaceC866830XzV() { // from class: X.0Nbn
                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJJLJLI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJJLL(List<C0YAE> list) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJJZZI(List<C0YAE> list) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJLI(String str, List<C0YAE> list) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LLIIII(int i2, String str) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LLIILZL(int i2, String str, List list) {
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final int LLLIIII() {
                    return 0;
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJJJJJL(C0Y8T c0y8t) {
                    if (c0y8t != null && c0y8t.isGroupChat()) {
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILZ, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDissolveConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(' ');
                        sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    }
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJJLIIIJ(C0Y8T c0y8t) {
                    if (c0y8t != null && c0y8t.isGroupChat()) {
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILZ, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onDeleteConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(' ');
                        sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    }
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJLILLLLZI(C0Y8T c0y8t) {
                    if (c0y8t != null && c0y8t.isGroupChat()) {
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILLJJLI, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCreateConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(' ');
                        sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    }
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJLL(C1711306n1 c1711306n1) {
                    C0Y8T c0y8t;
                    if (c1711306n1 != null && (c0y8t = c1711306n1.LIZIZ) != null && c0y8t.isGroupChat() && !c0y8t.isTemp()) {
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILLJJLI, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onSyncConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(' ');
                        sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    }
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJZI(C0Y8T c0y8t) {
                    if (c0y8t != null && c0y8t.isGroupChat()) {
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILZ, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onLeaveConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(' ');
                        sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [X.04rr] */
                /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
                /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC866830XzV, X.InterfaceC867280Y0o
                public final void LLLIZZ(Map<String, C0Y8T> map) {
                    ?? arrayList;
                    int size;
                    Collection collectionValues;
                    if (map != null && (collectionValues = ((ConcurrentHashMap) map).values()) != null) {
                        arrayList = new ArrayList();
                        for (Object obj2 : collectionValues) {
                            if (((C0Y8T) obj2).isGroupChat()) {
                                arrayList.add(obj2);
                            }
                        }
                    } else {
                        arrayList = C13BV.INSTANCE;
                    }
                    C907490Zit c907490Zit2 = c907490Zit;
                    c907490Zit2.LIZJ.LIZJ(arrayList, c907490Zit2.LJIIJ);
                    Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILLJJLI, arrayList));
                    C1231704rr c1231704rr = c907490Zit.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onQueryConversation ");
                    if (map != null) {
                        size = ((ConcurrentHashMap) map).size();
                    } else {
                        size = 0;
                    }
                    sbLIZ.append(size);
                    sbLIZ.append(' ');
                    sbLIZ.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                    C2188811AlT.LIZIZ(sbLIZ);
                    c1231704rr.LIZIZ();
                }

                @Override // X.InterfaceC866830XzV, X.InterfaceC868050Y3n
                public final void LJLJI(int i2, C0Y8T c0y8t) {
                    if (c0y8t != null && c0y8t.isGroupChat()) {
                        C1231704rr c1231704rr = c907490Zit.LIZJ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onUpdateConversation ");
                        sbLIZ.append(c907490Zit.LJIIJ.invoke(c0y8t));
                        sbLIZ.append(" reason ");
                        sbLIZ.append(i2);
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1231704rr.LIZIZ();
                        if (!C907490Zit.LJIILJJIL.contains(Integer.valueOf(i2))) {
                            return;
                        }
                        Object objLJIIIIZZ = c094d.LJIIIIZZ(new C597130NbT(EnumC597140NbU.LLILLJJLI, Collections.singletonList(c0y8t)));
                        C1231704rr c1231704rr2 = c907490Zit.LIZJ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onUpdateConversation ");
                        sbLIZ2.append((Object) C094N.LIZLLL(objLJIIIIZZ));
                        C2188811AlT.LIZIZ(sbLIZ2);
                        c1231704rr2.LIZIZ();
                    }
                }
            };
            c907490Zit.LJI.LJI(r3);
            AwS410S0200000_9 awS410S0200000_9 = new AwS410S0200000_9(this.LLILLL, (C597330Nbn) r3, 96);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, awS410S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9._conversationObserverFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupSearchContentUpdateEngine@13e9._conversationObserverFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C597130NbT> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
