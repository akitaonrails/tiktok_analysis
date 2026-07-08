package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel;
import com.ss.android.ugc.aweme.portrait.customize.model.PortraitRecommendedItem;
import com.ss.android.ugc.aweme.portrait.model.PortraitStyleItem;
import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import com.ss.android.ugc.aweme.portrait.network.PortraitStylesResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0tzy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel$ensureLoaded$1", f = "AIPortraitCustomizeViewModel.kt", l = {152}, m = "invokeSuspend")
public final class C1686880tzy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AIPortraitCustomizeViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686880tzy(AIPortraitCustomizeViewModel aIPortraitCustomizeViewModel, InterfaceC1364105Vn<? super C1686880tzy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = aIPortraitCustomizeViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1686880tzy c1686880tzy = new C1686880tzy(this.LLILLL, interfaceC1364105Vn);
        c1686880tzy.LLILLJJLI = obj;
        return c1686880tzy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.portrait.customize.AIPortraitCustomizeViewModel] */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
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
        String str;
        ?? r7;
        Throwable th;
        Object c098200Yq;
        ?? r72;
        ?? arrayList;
        List<PortraitStyleItem> list;
        EnumC570120MXq enumC570120MXq;
        boolean z;
        String string;
        String strLIZ;
        Object objAQ2 = obj;
        C1C7U.LIZ("AIPortraitCustomizeViewModel@66a9.ensureLoaded$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                r7 = this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(objAQ2);
                    r7 = r7;
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    r72 = r7;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objAQ2);
            ?? r1 = this.LLILLL;
            PortraitStyleItem portraitStyleItem = r1.LLJI;
            if (portraitStyleItem != null) {
                str = portraitStyleItem.styleId;
            } else {
                str = null;
            }
            r7 = str;
            if (r1.LLJIJIL) {
                r7 = 0;
            }
            try {
                this.LLILLJJLI = r7;
                this.LL = 1;
                objAQ2 = r1.AQ2(r7, this);
                r7 = r7;
                if (objAQ2 == objLJFF) {
                    C1C7U.LIZIZ("AIPortraitCustomizeViewModel@66a9.ensureLoaded$1");
                    return objLJFF;
                }
            } catch (Throwable th3) {
                th = th3;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                r72 = r7;
            }
        }
        c098200Yq = (PortraitStylesResponse) objAQ2;
        C189200o6.m2constructorimpl(c098200Yq);
        r72 = r7;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        PortraitStylesResponse portraitStylesResponse = (PortraitStylesResponse) c098200Yq;
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModel = this.LLILLL;
        if (portraitStylesResponse != null && (list = portraitStylesResponse.styles) != null) {
            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            int i2 = 0;
            for (PortraitStyleItem portraitStyleItem2 : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    PortraitStyleItem portraitStyleItem3 = portraitStyleItem2;
                    if (Intrinsics.LJFF(portraitStyleItem3.styleId, r72)) {
                        enumC570120MXq = portraitStyleItem3.resPos;
                    } else {
                        enumC570120MXq = EnumC570120MXq.CUSTOM_STYLE_REC;
                    }
                    if (i2 == 0 && r72 != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aIPortraitCustomizeViewModel.getClass();
                    String str2 = portraitStyleItem3.prompt;
                    if (str2 != null) {
                        string = a0.LJLIIIL(str2).toString();
                    } else {
                        string = null;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    PortraitUrlModel portraitUrlModel = portraitStyleItem3.coverUrl;
                    if (portraitUrlModel != null) {
                        strLIZ = C0MXA.LIZ(portraitUrlModel);
                    } else {
                        strLIZ = null;
                    }
                    arrayList.add(new PortraitRecommendedItem(boolValueOf, string, string, strLIZ, null, portraitStyleItem3.styleId, portraitStyleItem3.styleType, enumC570120MXq, null));
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = C13BV.INSTANCE;
        }
        String str3 = aIPortraitCustomizeViewModel.LLJILJIL;
        List<PortraitRecommendedItem> listLJLIL = C13LP.LJLIL(arrayList, Collections.singletonList(new PortraitRecommendedItem(Boolean.FALSE, null, null, str3, str3, null, null, EnumC570120MXq.CUSTOM_STYLE, Boolean.TRUE)));
        String strYQ2 = this.LLILLL.yQ2(listLJLIL);
        int length = strYQ2.length();
        C1686970u07 c1686970u07 = new C1686970u07(strYQ2, C1680680tpy.LIZ(length, length), 4);
        C2252321DDq c2252321DDq = this.LLILLL.LLJILLL;
        InterfaceC1665500tRU interfaceC1665500tRULIZ = C1687430u0r.LIZ(listLJLIL);
        this.LLILLL.getClass();
        c2252321DDq.setValue(new C1673080tdi(new C1686860tzw(interfaceC1665500tRULIZ, c1686970u07, AIPortraitCustomizeViewModel.xQ2(listLJLIL, c1686970u07))));
        AIPortraitCustomizeViewModel aIPortraitCustomizeViewModel2 = this.LLILLL;
        aIPortraitCustomizeViewModel2.getClass();
        aIPortraitCustomizeViewModel2.LLJJIJIL = System.currentTimeMillis();
        C1687150u0P c1687150u0P = C1687150u0P.LIZ;
        C1687160u0Q c1687160u0QVQ2 = AIPortraitCustomizeViewModel.vQ2(aIPortraitCustomizeViewModel2, "explicit", null, null, 6);
        c1687150u0P.getClass();
        C548880Lfq c548880Lfq = C548880Lfq.LIZ;
        C2275141E3k c2275141E3k = C2275141E3k.LJII;
        AIGCEntranceInfo aIGCEntranceInfo = c1687160u0QVQ2.LIZ;
        AwS604S0100000_25 awS604S0100000_25 = new AwS604S0100000_25(c1687160u0QVQ2, 539);
        c548880Lfq.getClass();
        C548880Lfq.LIZLLL(c2275141E3k, aIGCEntranceInfo, awS604S0100000_25);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPortraitCustomizeViewModel@66a9.ensureLoaded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
