package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.service.IMInboxBatchActionServiceImpl$batchChangeConvSettingInfo$1$1", f = "IMInboxBatchActionServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C877340YbM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC885270Yo9 LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ List<C0Y8T> LLILZ;
    public final /* synthetic */ InterfaceC879010Ye3 LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C877340YbM(EnumC885270Yo9 enumC885270Yo9, Activity activity, String str, List<C0Y8T> list, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z, boolean z2, Function0<Unit> function0, InterfaceC1364105Vn<? super C877340YbM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC885270Yo9;
        this.LLILLJJLI = activity;
        this.LLILLL = str;
        this.LLILZ = list;
        this.LLILZIL = interfaceC879010Ye3;
        this.LLILZLL = z;
        this.LLIZ = z2;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C877340YbM(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
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
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMInboxBatchActionServiceImpl@e929.batchChangeConvSettingInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = C877410YbT.LIZ[this.LL.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C877320YbK c877320YbK = C877320YbK.LIZ;
                String str = this.LLILLL;
                List<C0Y8T> list = this.LLILZ;
                InterfaceC879010Ye3 interfaceC879010Ye3 = this.LLILZIL;
                EnumC885270Yo9 enumC885270Yo9 = this.LL;
                Function0<Unit> function0 = this.LLIZLLLIL;
                c877320YbK.getClass();
                C877320YbK.LJI(str, null, list, interfaceC879010Ye3, enumC885270Yo9, function0);
            }
        } else {
            C877320YbK c877320YbK2 = C877320YbK.LIZ;
            Activity activity = this.LLILLJJLI;
            String str2 = this.LLILLL;
            List<C0Y8T> list2 = this.LLILZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<C0Y8T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getConversationId());
            }
            InterfaceC879010Ye3 interfaceC879010Ye32 = this.LLILZIL;
            c877320YbK2.LIZLLL(activity, this.LL, interfaceC879010Ye32, str2, arrayList, this.LLIZLLLIL, this.LLILZLL, this.LLIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMInboxBatchActionServiceImpl@e929.batchChangeConvSettingInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
