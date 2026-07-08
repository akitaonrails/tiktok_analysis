package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Zig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.data.searchcontent.GroupMemberSearchContentSyncEngine$fullUpdate$1$overallCost$1$1", f = "GroupMemberSearchContentSyncEngine.kt", l = {94}, m = "invokeSuspend")
public final class C907360Zig extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends C907840ZjS>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ C907410Zil LLILLL;
    public final /* synthetic */ C907790ZjN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C907360Zig(C907410Zil c907410Zil, C907790ZjN c907790ZjN, InterfaceC1364105Vn<? super C907360Zig> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLL = c907410Zil;
        this.LLILZ = c907790ZjN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C907360Zig(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends C907840ZjS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
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
        List list;
        C1C7U.LIZ("GroupMemberSearchContentSyncEngine@4955.fullUpdate$1$overallCost$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                List list2 = (List) this.LL;
                C155000ia.LIZIZ(obj);
                list = list2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C907390Zij c907390Zij = InterfaceC907380Zii.LIZ;
            C0YM2 c0ym2 = C0YM2.TIKTOK_SOCIAL_IM;
            c907390Zij.getClass();
            List<C0YAE> listLIZ = ((C0YNW) C0YUC.LIZ(c0ym2)).LJII.LIZ();
            ArrayList arrayList = new ArrayList();
            for (C0YAE c0yae : listLIZ) {
                if (C0YNP.LJII(c0yae.getConversationId()) == -1) {
                    arrayList.add(c0yae);
                }
            }
            C907410Zil c907410Zil = this.LLILLL;
            this.LL = arrayList;
            this.LLILLJJLI = 1;
            obj = c907410Zil.LIZIZ(arrayList, this);
            list = arrayList;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.fullUpdate$1$overallCost$1$1");
                return objLJFF;
            }
        }
        List list3 = (List) obj;
        C907790ZjN c907790ZjN = this.LLILZ;
        c907790ZjN.LIZIZ = list.size();
        c907790ZjN.LIZJ = list3.size();
        C1231704rr c1231704rr = this.LLILLL.LJI;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fullUpdate allMemberList size ");
        sbLIZ.append(list.size());
        sbLIZ.append(" search content size ");
        sbLIZ.append(list3.size());
        C2188811AlT.LIZIZ(sbLIZ);
        c1231704rr.LIZIZ();
        C1C7U.LIZIZ("GroupMemberSearchContentSyncEngine@4955.fullUpdate$1$overallCost$1$1");
        return list3;
    }
}
