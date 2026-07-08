package X;

import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.platform.base.data.ProfileComponents;
import com.ss.android.ugc.profile.platform.business.header.base.HeaderBaseContainerComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ibY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1248900ibY extends C09AY implements Function1<Assembler, Unit> {
    public final /* synthetic */ HeaderBaseContainerComponent LL;
    public final /* synthetic */ List<ProfileComponents> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1248900ibY(HeaderBaseContainerComponent headerBaseContainerComponent, List<ProfileComponents> list, String str) {
        super(1);
        this.LL = headerBaseContainerComponent;
        this.LLILLJJLI = list;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Assembler assembler) {
        boolean z;
        C1248930ibb c1248930ibbOo;
        boolean z2;
        C13IQ<? extends UIContentAssem> c13iq;
        C1248930ibb c1248930ibbOo2;
        Integer num;
        HeaderBaseContainerComponent headerBaseContainerComponent = this.LL;
        List<ProfileComponents> list = this.LLILLJJLI;
        headerBaseContainerComponent.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(headerBaseContainerComponent.LLJILJIL);
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (true) {
            z = false;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (list != null) {
                z2 = false;
                for (ProfileComponents profileComponents : list) {
                    if (Intrinsics.LJFF(profileComponents.componentName, str)) {
                        if (Intrinsics.LJFF(str2, profileComponents.componentId)) {
                            z2 = true;
                        } else {
                            z = true;
                        }
                    }
                }
            } else {
                z2 = false;
            }
            if ((HeaderBaseContainerComponent.lp(headerBaseContainerComponent, null, list, 3) || C1248890ibX.LIZIZ(str, str2)) && !z2) {
                if (C1248890ibX.LIZIZ(str, str2)) {
                    C1248930ibb c1248930ibb = (C1248930ibb) ((Map) C1248890ibX.LJ.getValue()).get(str);
                    if (c1248930ibb != null) {
                        c13iq = c1248930ibb.LIZIZ;
                    }
                } else {
                    c13iq = (C13IQ) ((Map) C1248890ibX.LIZ.getValue()).get(str2);
                }
                if (c13iq != null) {
                    headerBaseContainerComponent.tp(str, c13iq);
                }
            } else if (z && HeaderBaseContainerComponent.lp(headerBaseContainerComponent, null, list, 3)) {
                c1248930ibbOo2 = headerBaseContainerComponent.Oo(str);
                if (c1248930ibbOo2 != null) {
                    if (z2) {
                    }
                }
            } else {
                c1248930ibbOo2 = headerBaseContainerComponent.Oo(str2);
                if (c1248930ibbOo2 != null) {
                    if (z2 && ((num = c1248930ibbOo2.LIZLLL) == null || num.intValue() < 0)) {
                        headerBaseContainerComponent.tp(str, c1248930ibbOo2.LIZIZ);
                    }
                }
            }
        }
        List<ProfileComponents> list2 = this.LLILLJJLI;
        if (list2 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("assembleComponent componentsData is null container=");
            sbLIZ.append(this.LLILLL);
            C1248210iaR.LIZJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ), EnumC1253850ijX.BUSINESS, "AssembleEmpty");
        } else {
            HeaderBaseContainerComponent headerBaseContainerComponent2 = this.LL;
            int i = 0;
            for (ProfileComponents profileComponents2 : list2) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str3 = profileComponents2.componentName;
                    if (str3 != null) {
                        headerBaseContainerComponent2.LLJILJILJ.put(str3, Integer.valueOf(i));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            List<ProfileComponents> list3 = this.LLILLJJLI;
            HeaderBaseContainerComponent headerBaseContainerComponent3 = this.LL;
            int i3 = 0;
            for (ProfileComponents profileComponents3 : list3) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    ProfileComponents profileComponents4 = profileComponents3;
                    String str4 = profileComponents4.componentId;
                    if (str4 != null && (c1248930ibbOo = headerBaseContainerComponent3.Oo(str4)) != null) {
                        int size = i3 + ((ArrayList) headerBaseContainerComponent3.LLJ).size();
                        String str5 = profileComponents4.componentName;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (C725080ScM.LIZLLL) {
                            try {
                                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                                if (interfaceC723720SaA != null) {
                                    int i5 = C2187451AjH.LIZ;
                                    interfaceC723720SaA.log("BaseContainerComponent", "add assem start");
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                            }
                        }
                        C013C c013c = new C013C();
                        C723850SaN.LIZLLL(headerBaseContainerComponent3, new C1248910ibZ(headerBaseContainerComponent3, str4, str5, c1248930ibbOo, size, profileComponents4, c013c));
                        boolean z3 = c013c.element;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("assembleComponent add componentId=");
                        sbLIZ2.append(str4);
                        sbLIZ2.append(", componentName=");
                        sbLIZ2.append(profileComponents4.componentName);
                        C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ2), EnumC1253850ijX.BUSINESS, "AddComponent");
                        if (z3) {
                            z = true;
                        }
                    }
                    i3 = i4;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            this.LL.ep(z);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("assembleComponent end container=");
            sbLIZ3.append(this.LLILLL);
            sbLIZ3.append(", created=");
            sbLIZ3.append(z);
            C1248210iaR.LJ("BaseContainerComponent", C2188811AlT.LIZIZ(sbLIZ3), EnumC1253850ijX.BUSINESS, "AssembleEnd");
        }
        return Unit.LIZ;
    }
}
