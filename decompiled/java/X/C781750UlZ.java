package X;

import Y.ARunnableS40S0300000_7;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet;
import com.bytedance.android.livesdk.broadcast.settingpage.SettingsViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS138S0201000_12;
import kotlin.jvm.internal.AwS98S0201000_12;
import njp.a;

/* JADX INFO: renamed from: X.0UlZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.settingpage.LiveHostSettingFragmentSheet$onViewCreated$1$1$2", f = "LiveHostSettingFragmentSheet.kt", l = {162}, m = "invokeSuspend")
public final class C781750UlZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveHostSettingFragmentSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C781750UlZ(LiveHostSettingFragmentSheet liveHostSettingFragmentSheet, InterfaceC1364105Vn<? super C781750UlZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveHostSettingFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C781750UlZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$1$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = ((SettingsViewModel) this.LLILLJJLI.LLLIL.getValue()).LLILZLL;
            final LiveHostSettingFragmentSheet liveHostSettingFragmentSheet = this.LLILLJJLI;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0UlY
                /* JADX WARN: Type inference failed for: r1v24, types: [T, X.0Ule] */
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
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Integer num;
                    C21578619ce c21578619ce;
                    LinearLayout linearLayout;
                    Object c098200Yq;
                    String strName;
                    ViewGroup viewGroup;
                    String strName2;
                    View view;
                    View view2;
                    LiveIconView liveIconView;
                    C499640Jic c499640JicLJJIIZ;
                    C499640Jic c499640JicLJJIIZ2;
                    List list = (List) obj2;
                    LiveHostSettingFragmentSheet liveHostSettingFragmentSheet2 = liveHostSettingFragmentSheet;
                    Context context = liveHostSettingFragmentSheet2.getContext();
                    boolean z = false;
                    z = false;
                    z = false;
                    boolean z2 = true;
                    z2 = true;
                    z2 = true;
                    if (context != null && (linearLayout = liveHostSettingFragmentSheet2.LLLFF) != null) {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        C786410Ut5.LJJJJJL(linearLayout);
                        int i2 = 0;
                        for (Object obj3 : list) {
                            int i3 = i2 + 1;
                            if (i2 >= 0) {
                                C385701eh c385701eh = (C385701eh) obj3;
                                Iterator<C385801ei> it2 = c385701eh.LIZIZ.iterator();
                                while (it2.hasNext()) {
                                    linkedHashSet.add(Integer.valueOf(it2.next().LIZ));
                                }
                                LinearLayout linearLayout2 = (LinearLayout) ((LinkedHashMap) liveHostSettingFragmentSheet2.LLLIIL).get(Integer.valueOf(c385701eh.LIZ));
                                if (linearLayout2 == null) {
                                    int i4 = c385701eh.LIZ;
                                    linearLayout2 = new LinearLayout(context);
                                    linearLayout2.setOrientation(z2 ? 1 : 0);
                                    linearLayout2.setId(i4);
                                    linearLayout2.setBackgroundResource(R.drawable.dyc);
                                    C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                                    linearLayout2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC785910UsH(liveHostSettingFragmentSheet2, linearLayout2, 1));
                                    liveHostSettingFragmentSheet2.LLLIIL.put(Integer.valueOf(c385701eh.LIZ), linearLayout2);
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout2.getLayoutParams();
                                marginLayoutParams.topMargin = ((Number) liveHostSettingFragmentSheet2.LLLJIL.getValue()).intValue();
                                C786410Ut5.d6(linearLayout2, marginLayoutParams);
                                linearLayout.addView(linearLayout2);
                                List<C385801ei> list2 = c385701eh.LIZIZ;
                                linearLayout2.getContext();
                                C21578619ce c21578619ce2 = liveHostSettingFragmentSheet2.LLLF;
                                C786410Ut5.LJJJJJL(linearLayout2);
                                for (C385801ei c385801ei : list2) {
                                    int i5 = c385801ei.LIZ;
                                    C259800zU c259800zU = new C259800zU();
                                    View viewLJJIIJ = (View) ((LinkedHashMap) liveHostSettingFragmentSheet2.LLLIILIL).get(Integer.valueOf(i5));
                                    if (viewLJJIIJ == null) {
                                        ?? r1 = (T) liveHostSettingFragmentSheet2.uS(c385801ei, linearLayout2);
                                        c259800zU.element = r1;
                                        View[] viewArr = new View[2];
                                        if (r1 != 0 && (c499640JicLJJIIZ2 = r1.LJJIIZ()) != null) {
                                            view = c499640JicLJJIIZ2.LIZ;
                                        } else {
                                            view = null;
                                        }
                                        viewArr[z ? 1 : 0] = view;
                                        InterfaceC781800Ule interfaceC781800Ule = (InterfaceC781800Ule) c259800zU.element;
                                        if (interfaceC781800Ule != null && (c499640JicLJJIIZ = interfaceC781800Ule.LJJIIZ()) != null) {
                                            view2 = c499640JicLJJIIZ.LJI;
                                        } else {
                                            view2 = null;
                                        }
                                        viewArr[1] = view2;
                                        List<? extends View> listLJIIJJI = C1697810uHb.LJIIJJI(viewArr);
                                        InterfaceC781800Ule interfaceC781800Ule2 = (InterfaceC781800Ule) c259800zU.element;
                                        if (interfaceC781800Ule2 != null) {
                                            interfaceC781800Ule2.LJJIIJZLJL(listLJIIJJI, new AwS98S0201000_12(i5, (int) liveHostSettingFragmentSheet2, (LiveHostSettingFragmentSheet) c259800zU, (C259800zU<InterfaceC781800Ule>) 0));
                                        }
                                        InterfaceC781800Ule interfaceC781800Ule3 = (InterfaceC781800Ule) c259800zU.element;
                                        if (interfaceC781800Ule3 != null) {
                                            C499640Jic c499640JicLJJIIZ3 = interfaceC781800Ule3.LJJIIZ();
                                            if (c499640JicLJJIIZ3 != null) {
                                                liveIconView = c499640JicLJJIIZ3.LJII;
                                            } else {
                                                liveIconView = null;
                                            }
                                            interfaceC781800Ule3.LJJIIJZLJL(Collections.singletonList(liveIconView), new AwS98S0201000_12(i5, (int) liveHostSettingFragmentSheet2, (LiveHostSettingFragmentSheet) c259800zU, (C259800zU<InterfaceC781800Ule>) 1));
                                        }
                                        InterfaceC781800Ule interfaceC781800Ule4 = (InterfaceC781800Ule) c259800zU.element;
                                        if (interfaceC781800Ule4 != null) {
                                            viewLJJIIJ = interfaceC781800Ule4.LJJIIJ();
                                        } else {
                                            viewLJJIIJ = null;
                                        }
                                    }
                                    if (viewLJJIIJ == null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("updateGroupItems itemView failed. tag: ");
                                        sbLIZ.append(i5);
                                        sbLIZ.append(", name: ");
                                        EnumC776090UcR.Companion.getClass();
                                        EnumC776090UcR enumC776090UcRLIZ = C0UH7.LIZ(i5);
                                        if (enumC776090UcRLIZ != null) {
                                            strName2 = enumC776090UcRLIZ.name();
                                        } else {
                                            strName2 = null;
                                        }
                                        sbLIZ.append(strName2);
                                        C20441214yg.LJ("LiveHostSettingFragmentSheet", C2188811AlT.LIZIZ(sbLIZ));
                                    } else {
                                        liveHostSettingFragmentSheet2.LLLIILIL.put(Integer.valueOf(i5), viewLJJIIJ);
                                        C21657819pQ c21657819pQRemove = liveHostSettingFragmentSheet2.LLLIIII.remove(Integer.valueOf(i5));
                                        if (c21657819pQRemove != null) {
                                            c21657819pQRemove.LIZJ();
                                        }
                                        ViewParent parent = viewLJJIIJ.getParent();
                                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                            C786410Ut5.LJJJLZIJ(viewLJJIIJ, viewGroup);
                                        }
                                        try {
                                            linearLayout2.addView(viewLJJIIJ);
                                            c098200Yq = Unit.LIZ;
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c098200Yq = new C098200Yq(th);
                                            C189200o6.m2constructorimpl(c098200Yq);
                                        }
                                        if (C189200o6.m8isSuccessimpl(c098200Yq) && !liveHostSettingFragmentSheet2.LLLII.contains(Integer.valueOf(i5)) && c21578619ce2 != null) {
                                            C21657819pQ c21657819pQ = new C21657819pQ(c21578619ce2, viewLJJIIJ, new AwS138S0201000_12(i5, liveHostSettingFragmentSheet2, c259800zU, 1));
                                            liveHostSettingFragmentSheet2.LLLIIII.put(Integer.valueOf(i5), c21657819pQ);
                                            c21657819pQ.LIZIZ();
                                            c21657819pQ.LIZ();
                                        }
                                        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("updateGroupItems generate itemView failed. tag: ");
                                            sbLIZ2.append(i5);
                                            sbLIZ2.append(", name: ");
                                            EnumC776090UcR.Companion.getClass();
                                            EnumC776090UcR enumC776090UcRLIZ2 = C0UH7.LIZ(i5);
                                            if (enumC776090UcRLIZ2 != null) {
                                                strName = enumC776090UcRLIZ2.name();
                                            } else {
                                                strName = null;
                                            }
                                            sbLIZ2.append(strName);
                                            C20441214yg.LJ("LiveHostSettingFragmentSheet", C2188811AlT.LIZIZ(sbLIZ2));
                                            Map<String, Object> map = C1338270kvh.LIZ;
                                        }
                                    }
                                    z = false;
                                }
                                liveHostSettingFragmentSheet2.zS(linearLayout2);
                                i2 = i3;
                                z2 = true;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        Iterator it3 = ((LinkedHashMap) liveHostSettingFragmentSheet2.LLLIIII).entrySet().iterator();
                        while (it3.hasNext()) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            int iIntValue = ((Number) entry.getKey()).intValue();
                            C21657819pQ c21657819pQ2 = (C21657819pQ) entry.getValue();
                            if (!linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                                c21657819pQ2.LIZJ();
                                it3.remove();
                            }
                        }
                        linearLayout.requestLayout();
                    }
                    LiveHostSettingFragmentSheet liveHostSettingFragmentSheet3 = liveHostSettingFragmentSheet;
                    if (liveHostSettingFragmentSheet3.LLLILZLLLI) {
                        InterfaceC781810Ulf interfaceC781810Ulf = liveHostSettingFragmentSheet3.LLLFFI;
                        if (interfaceC781810Ulf != null) {
                            interfaceC781810Ulf.b42();
                        }
                        liveHostSettingFragmentSheet.LLLILZLLLI = z;
                    }
                    LiveHostSettingFragmentSheet liveHostSettingFragmentSheet4 = liveHostSettingFragmentSheet;
                    if (!liveHostSettingFragmentSheet4.LLLFZ && (num = liveHostSettingFragmentSheet4.LLJZIJLIL) != null) {
                        View view3 = (View) ((LinkedHashMap) liveHostSettingFragmentSheet4.LLLIILIL).get(Integer.valueOf(num.intValue()));
                        if (view3 != null && C500260Jjc.LJJJJIZL(view3) && (c21578619ce = liveHostSettingFragmentSheet4.LLLF) != null) {
                            liveHostSettingFragmentSheet4.LLLFZ = z2;
                            HandlerHook.viewPost(c21578619ce, new ARunnableS40S0300000_7(liveHostSettingFragmentSheet4, c21578619ce, view3, 16));
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (c2252321DDq.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("LiveHostSettingFragmentSheet@6777.onViewCreated$1$1$2");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
