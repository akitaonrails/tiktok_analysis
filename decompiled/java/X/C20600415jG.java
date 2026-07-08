package X;

import com.bytedance.ext_power_list.AssemSingleListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [S] */
/* JADX INFO: renamed from: X.15jG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20600415jG<S> extends C09AY implements Function1<S, Unit> {
    public final /* synthetic */ AbstractC1264080j02<ITEM> LL;
    public final /* synthetic */ AssemSingleListViewModel<ITEM, S, Cursor> LLILLJJLI;
    public final /* synthetic */ EnumC323450Cm7 LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<C627660Ojc<ITEM>, Cursor, Cursor, C627660Ojc<ITEM>> LLILZ;
    public final /* synthetic */ Function2<C627660Ojc<ITEM>, Throwable, C627660Ojc<ITEM>> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20600415jG(AbstractC1264080j02<ITEM> abstractC1264080j02, AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel, EnumC323450Cm7 enumC323450Cm7, InterfaceC1631620sYq<? super C627660Ojc<ITEM>, ? super Cursor, ? super Cursor, C627660Ojc<ITEM>> interfaceC1631620sYq, Function2<? super C627660Ojc<ITEM>, ? super Throwable, C627660Ojc<ITEM>> function2, Function0<Unit> function0) {
        super(1);
        this.LL = abstractC1264080j02;
        this.LLILLJJLI = assemSingleListViewModel;
        this.LLILLL = enumC323450Cm7;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = function2;
        this.LLILZLL = function0;
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
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Object obj) {
        List list;
        C627660Ojc c627660Ojc;
        InterfaceC627270Oiz interfaceC627270Oiz = (InterfaceC627270Oiz) obj;
        Object obj2 = this.LL;
        if (obj2 instanceof C1264120j06) {
            list = ((C1264120j06) obj2).LIZIZ;
        } else if (obj2 instanceof C1265700j2e) {
            list = ((C1265700j2e) obj2).LIZLLL;
        } else {
            list = C13BV.INSTANCE;
        }
        Collection collection = interfaceC627270Oiz.getListState().LLILZ;
        C627660Ojc listState = interfaceC627270Oiz.getListState();
        AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel = this.LLILLJJLI;
        EnumC323450Cm7 enumC323450Cm7 = this.LLILLL;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        List listOnLoadPageAddData = assemSingleListViewModel.onLoadPageAddData(enumC323450Cm7, collection, list);
        if (listOnLoadPageAddData != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(listOnLoadPageAddData);
            listState = C627660Ojc.LIZ(interfaceC627270Oiz.getListState(), null, null, null, arrayList, 7);
        }
        AssemSingleListViewModel<ITEM, S, Cursor> assemSingleListViewModel2 = this.LLILLJJLI;
        Object obj3 = this.LL;
        Object obj4 = null;
        if (obj3 instanceof C1264120j06) {
            c627660Ojc = (C627660Ojc) this.LLILZ.invoke(listState, null, null);
        } else if (obj3 instanceof C1265700j2e) {
            InterfaceC1631620sYq<C627660Ojc<ITEM>, Cursor, Cursor, C627660Ojc<ITEM>> interfaceC1631620sYq = this.LLILZ;
            C1265700j2e c1265700j2e = (C1265700j2e) obj3;
            Object obj5 = c1265700j2e.LIZIZ;
            if (obj5 == null) {
                obj5 = null;
            }
            Object obj6 = c1265700j2e.LIZJ;
            if (obj6 != null) {
                obj4 = obj6;
            }
            c627660Ojc = (C627660Ojc) interfaceC1631620sYq.invoke(listState, obj5, obj4);
        } else if (obj3 instanceof C1264100j04) {
            c627660Ojc = (C627660Ojc) this.LLILZIL.invoke(listState, ((C1264100j04) obj3).LIZIZ);
        } else {
            if (obj3 instanceof C1264110j05) {
                throw new IllegalStateException("A cancelled Page request should not reach here");
            }
            throw new C1954807lC();
        }
        assemSingleListViewModel2.newState(c627660Ojc);
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
