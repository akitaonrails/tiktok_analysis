package X;

import android.os.Bundle;
import com.bytedance.android.btm.api.BtmPageLifecycle;
import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import com.bytedance.android.btm.impl.setting.BugfixModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18E4, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C18E4<T> {
    public static void LIZJ(Object obj) {
        String name = obj.getClass().getName();
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            boolean z = C18E3.LIZ;
            C18CK.LJII(C18E3.LJFF, new C18BF(obj.getClass().getName(), pageInfoStackLJIIIZ));
            if (Intrinsics.LJFF(C18CJ.LIZ(), obj)) {
                C18CJ.LIZIZ(null);
            }
            C589920NBu<Object> c589920NBu = C18CJ.LIZLLL;
            if (c589920NBu != null && obj == c589920NBu.get()) {
                C18CJ.LIZLLL = null;
            }
            Iterator<PageInfo> it2 = pageInfoStackLJIIIZ.all().iterator();
            while (it2.hasNext()) {
                it2.next().onDestroy();
            }
            pageInfoStackLJIIIZ.setPageState(BtmPageLifecycle.State.DESTROYED);
            C18HS[] c18hsArrLIZ = C18E3.LIZ();
            if (c18hsArrLIZ != null) {
                for (C18HS c18hs : c18hsArrLIZ) {
                    c18hs.onPageDestroyed(obj);
                }
            }
            C21248618Dk.LIZ.getClass();
            C21248618Dk.LIZIZ(obj);
            C18CK.LJI("BaseFilter_onDestroyed", new C18HX(name));
        }
    }

    public static void LIZLLL(Object obj, EnumC21251218Ek enumC21251218Ek) {
        int iIntValue;
        InterfaceC21252118Et interfaceC21252118EtLIZIZ;
        int iIntValue2;
        String name = obj.getClass().getName();
        C18CK.LJI("BaseFilter_onPaused", new C18GL(name, enumC21251218Ek));
        String name2 = obj.getClass().getName();
        C18CK.LJI("BaseFilter_isPauseFiltered", new C18GY(name2, enumC21251218Ek));
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
        if (pageInfoStackLJIIIZ != null) {
            if (pageInfoStackLJIIIZ.getPageState() != BtmPageLifecycle.State.RESUMED) {
                C18CK.LJI("BaseFilter_isPauseFiltered", new C1127904b7(name2));
                if (pageInfoStackLJIIIZ.current().getIgnoreFirstResumeFlag() == 1) {
                    BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
                    bugfixModelLIZIZ.getClass();
                    Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_second_resume_miss", Integer.valueOf(bugfixModelLIZIZ.fixSecondResumeMiss));
                    Object obj2 = null;
                    if (!(objLIZIZ instanceof Integer)) {
                        objLIZIZ = null;
                    }
                    Integer num = (Integer) objLIZIZ;
                    if (num != null) {
                        iIntValue = num.intValue();
                    } else {
                        iIntValue = bugfixModelLIZIZ.fixSecondResumeMiss;
                    }
                    bugfixModelLIZIZ.fixSecondResumeMiss = iIntValue;
                    if (iIntValue == 1) {
                        PageInfo pageInfoCurrent = pageInfoStackLJIIIZ.current();
                        C18E9 c18e9LIZIZ = C18EN.LIZIZ(obj);
                        if (c18e9LIZIZ != null) {
                            interfaceC21252118EtLIZIZ = c18e9LIZIZ.LIZIZ(obj);
                        } else {
                            interfaceC21252118EtLIZIZ = null;
                        }
                        boolean z = C18E3.LIZ;
                        C18E3.LJI(obj, pageInfoStackLJIIIZ, pageInfoCurrent, interfaceC21252118EtLIZIZ, c18e9LIZIZ, EnumC21250718Ef.System);
                        pageInfoCurrent.fakeResume();
                        C21249518Dt.LIZIZ(obj, pageInfoStackLJIIIZ.getPageProp());
                        BugfixModel bugfixModelLIZIZ2 = C18CS.LIZ.LIZIZ();
                        bugfixModelLIZIZ2.getClass();
                        Object objLIZIZ2 = C1972007ny.LIZIZ(bugfixModelLIZIZ2, "fix_second_resume_miss_page_buffer", Integer.valueOf(bugfixModelLIZIZ2.fixSecondResumeMissPageBuffer));
                        if (objLIZIZ2 instanceof Integer) {
                            obj2 = objLIZIZ2;
                        }
                        Integer num2 = (Integer) obj2;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = bugfixModelLIZIZ2.fixSecondResumeMissPageBuffer;
                        }
                        bugfixModelLIZIZ2.fixSecondResumeMissPageBuffer = iIntValue2;
                        if (iIntValue2 == 1 && enumC21251218Ek != EnumC21251218Ek.EnterBackground) {
                            C18E3.LJFF(C18EN.LIZ(obj), pageInfoCurrent, obj);
                        }
                    }
                }
            } else {
                C18CK.LJI("BaseFilter_isPauseFiltered", new C790270UzJ(name2));
                boolean z2 = C18E3.LIZ;
                c21248618Dk.getClass();
                C18E3.LIZLLL(enumC21251218Ek, C21248618Dk.LJIIIZ(obj), obj);
                return;
            }
        }
        C18CK.LJI("BaseFilter_onPaused", new C18G5(name));
    }

    public static void LJFF(Object obj, EnumC21250718Ef enumC21250718Ef) {
        BtmPageLifecycle.State pageState;
        BtmPageLifecycle.State pageState2;
        C18CK.LJI("BaseFilter_onResumedDirectly", new C18GE(obj.getClass().getName(), enumC21250718Ef));
        C18CK.LJI("BaseFilter_pausePrePage", new C790670Uzx(obj.getClass().getName()));
        Object objLIZ = C18CJ.LIZ();
        if (objLIZ != null) {
            C21248618Dk.LIZ.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(objLIZ);
            if (pageInfoStackLJIIIZ != null) {
                pageState2 = pageInfoStackLJIIIZ.getPageState();
            } else {
                pageState2 = null;
            }
            if (pageState2 == BtmPageLifecycle.State.RESUMED) {
                boolean z = C18E3.LIZ;
                C18E3.LIZLLL(EnumC21251218Ek.PausePre, pageInfoStackLJIIIZ, objLIZ);
            }
        }
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(obj);
        if (c18e9LIZIZ != null) {
            for (InterfaceC21252118Et interfaceC21252118Et : c18e9LIZIZ.LJ()) {
                if (interfaceC21252118Et.LJIIIZ()) {
                    Object objLJIIJ = interfaceC21252118Et.LJIIJ();
                    if (!Intrinsics.LJFF(objLJIIJ, obj)) {
                        C21248618Dk.LIZ.getClass();
                        PageInfoStack pageInfoStackLJIIIZ2 = C21248618Dk.LJIIIZ(objLJIIJ);
                        if (pageInfoStackLJIIIZ2 != null) {
                            pageState = pageInfoStackLJIIIZ2.getPageState();
                        } else {
                            pageState = null;
                        }
                        if (pageState == BtmPageLifecycle.State.RESUMED) {
                            boolean z2 = C18E3.LIZ;
                            C18E3.LIZLLL(EnumC21251218Ek.PausePre, pageInfoStackLJIIIZ2, objLJIIJ);
                        }
                    }
                }
            }
        }
        boolean z3 = C18E3.LIZ;
        C21248618Dk.LIZ.getClass();
        C18E3.LJ(obj, C21248618Dk.LJIIIZ(obj), enumC21250718Ef);
    }

    public static void LJI(Bundle bundle, Object obj) {
        PageInfo pageInfoCurrent;
        C21242018Aw preBtmIdNode;
        C21248618Dk c21248618Dk = C21248618Dk.LIZ;
        c21248618Dk.getClass();
        if (C21248618Dk.LJIIIZ(obj) != null) {
            boolean z = C18E3.LIZ;
            C18CK.LJII(C18E3.LJI, new C790650Uzv(obj.getClass().getName(), bundle));
            c21248618Dk.getClass();
            PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(obj);
            C786410Ut5.LJJIZ(bundle, "page_info_stack", pageInfoStackLJIIIZ);
            if (pageInfoStackLJIIIZ != null && (pageInfoCurrent = pageInfoStackLJIIIZ.current()) != null && (preBtmIdNode = pageInfoCurrent.getPreBtmIdNode()) != null) {
                C21248618Dk.LJIJ.put(pageInfoCurrent.getPageId(), preBtmIdNode);
                pageInfoCurrent.setPreBtmIdNode(null);
            }
            InterfaceC21252118Et interfaceC21252118EtLIZ = C18EN.LIZ(obj);
            if (interfaceC21252118EtLIZ != null) {
                C786410Ut5.LJJJI("node_id", interfaceC21252118EtLIZ.getNodeId(), bundle);
                C786410Ut5.LJJJI("page_node", interfaceC21252118EtLIZ.save(), bundle);
            }
        }
    }

    public EnumC21251518En LIZIZ(T t, EnumC21250718Ef enumC21250718Ef) {
        String str;
        String name = t.getClass().getName();
        C18CK.LJI("BaseFilter_isResumeFiltered", new C21255318Fz(name, enumC21250718Ef));
        C21248618Dk.LIZ.getClass();
        PageInfoStack pageInfoStackLJIIIZ = C21248618Dk.LJIIIZ(t);
        if (pageInfoStackLJIIIZ == null) {
            return EnumC21251518En.InfoStackNull;
        }
        if (pageInfoStackLJIIIZ.getPageState() == BtmPageLifecycle.State.RESUMED) {
            C18CK.LJI("BaseFilter_isResumeFiltered", new C21254118Fn(name));
            return EnumC21251518En.PageStateDuplicate;
        }
        BtmServiceImpl btmServiceImpl = BtmServiceImpl.INSTANCE;
        if (btmServiceImpl.getAppStatusObserver().isAppBackground()) {
            C18CK.LJI("BaseFilter_isResumeFiltered", new C21254218Fo(name));
            return EnumC21251518En.AppBackground;
        }
        if (!C13LP.LJJJJ(C789730UyR.LIZJ(t), btmServiceImpl.getAppStatusObserver().LIZIZ())) {
            C18CK.LJI("BaseFilter_isResumeFiltered", new C21254318Fp(name));
            return EnumC21251518En.NotTopActivity;
        }
        C18E9 c18e9LIZIZ = C18EN.LIZIZ(t);
        if (c18e9LIZIZ != null && c18e9LIZIZ.LLILZLL && (str = c18e9LIZIZ.LLILZIL) != null && str.length() != 0) {
            C18CK.LJI("BaseFilter_isResumeFiltered", new C21253418Fg(name, c18e9LIZIZ));
            if (C18CS.LIZ.LIZIZ().LIZJ() == 1) {
                C589920NBu<Object> c589920NBu = new C589920NBu<>(t);
                EnumC21250718Ef enumC21250718Ef2 = (EnumC21250718Ef) ((LinkedHashMap) c18e9LIZIZ.LLJIJIL).get(c589920NBu);
                if (enumC21250718Ef2 == null || !enumC21250718Ef2.isManual()) {
                    c18e9LIZIZ.LLJIJIL.put(c589920NBu, enumC21250718Ef);
                }
            } else if (enumC21250718Ef.isManual()) {
                ((ArrayList) c18e9LIZIZ.LLJI).add(new C589920NBu(t));
            } else {
                ((ArrayList) c18e9LIZIZ.LLJ).add(new C589920NBu(t));
            }
            return EnumC21251518En.ExecuteActivityResume;
        }
        C18CK.LJI("BaseFilter_isResumeFiltered", new C21254418Fq(name));
        return null;
    }

    public final EnumC21251518En LJ(T t, EnumC21250718Ef enumC21250718Ef) {
        String name = t.getClass().getName();
        C18CK.LJI("BaseFilter_onResumed", new C21257618Gw(name));
        EnumC21251518En enumC21251518EnLIZIZ = LIZIZ(t, enumC21250718Ef);
        if (enumC21251518EnLIZIZ != null) {
            return enumC21251518EnLIZIZ;
        }
        LJFF(t, enumC21250718Ef);
        C18CK.LJI("BaseFilter_onResumed", new C21254518Fr(name));
        return null;
    }

    public static void LIZ(Object obj, C18E9 c18e9, BufferBtm bufferBtm) {
        int iIntValue;
        InterfaceC21252118Et interfaceC21252118EtLIZIZ;
        if (bufferBtm == null) {
            return;
        }
        BugfixModel bugfixModelLIZIZ = C18CS.LIZ.LIZIZ();
        bugfixModelLIZIZ.getClass();
        Object objLIZIZ = C1972007ny.LIZIZ(bugfixModelLIZIZ, "fix_pre_node", Integer.valueOf(bugfixModelLIZIZ.fixPreNode));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = bugfixModelLIZIZ.fixPreNode;
        }
        bugfixModelLIZIZ.fixPreNode = iIntValue;
        if (iIntValue == 1 && c18e9 != null && (interfaceC21252118EtLIZIZ = c18e9.LIZIZ(obj)) != null && bufferBtm.getTreeId().length() > 0 && Intrinsics.LJFF(interfaceC21252118EtLIZIZ.LJIIL(), bufferBtm.getTreeId())) {
            InterfaceC21252118Et interfaceC21252118EtLIZJ = c18e9.LIZJ(bufferBtm.getNodeId());
            if (!Intrinsics.LJFF(interfaceC21252118EtLIZJ, interfaceC21252118EtLIZIZ)) {
                interfaceC21252118EtLIZIZ.LJIIJJI(interfaceC21252118EtLIZJ);
            }
        }
    }
}
