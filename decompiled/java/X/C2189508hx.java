package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08hx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.EditPanelPanelFavoriteComponent$fetchPanelFavorites$2$1", f = "EditPanelPanelFavoriteComponent.kt", l = {103, 104}, m = "invokeSuspend")
public final class C2189508hx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ List<Effect> LLILLL;
    public final /* synthetic */ C2244708qr LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2189508hx(List<? extends Effect> list, C2244708qr c2244708qr, String str, InterfaceC1364105Vn<? super C2189508hx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = c2244708qr;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2189508hx(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

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
        List<String> list;
        Object obj2;
        C1C7U.LIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    Object obj3 = this.LL;
                    C155000ia.LIZIZ(obj);
                    obj2 = obj3;
                    C563650M8t c563650M8t = C563650M8t.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clear local favorite and sync to server. list: ");
                    sbLIZ.append(obj2);
                    C201955140j.LIZLLL(c563650M8t, "Favorite", C2188811AlT.LIZIZ(sbLIZ));
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<String> list2 = (List) this.LL;
            C155000ia.LIZIZ(obj);
            list = list2;
        } else {
            C155000ia.LIZIZ(obj);
            List<Effect> list3 = this.LLILLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list3, 10));
            Iterator<Effect> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getEffectId());
            }
            if (arrayList.isEmpty()) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
                return unit2;
            }
            C2244708qr c2244708qr = this.LLILZ;
            String str = this.LLILZIL;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            Object objC3 = c2244708qr.c3(str, arrayList, false, this);
            list = arrayList;
            if (objC3 == objLJFF) {
                C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
                return objLJFF;
            }
        }
        C2244708qr c2244708qr2 = this.LLILZ;
        String str2 = this.LLILZIL;
        this.LL = list;
        this.LLILLJJLI = 2;
        Object objI3 = c2244708qr2.i3(str2, list, true, this);
        obj2 = list;
        if (objI3 == objLJFF) {
            C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
            return objLJFF;
        }
        C563650M8t c563650M8t2 = C563650M8t.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("clear local favorite and sync to server. list: ");
        sbLIZ2.append(obj2);
        C201955140j.LIZLLL(c563650M8t2, "Favorite", C2188811AlT.LIZIZ(sbLIZ2));
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EditPanelPanelFavoriteComponent@f6f8.fetchPanelFavorites$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
