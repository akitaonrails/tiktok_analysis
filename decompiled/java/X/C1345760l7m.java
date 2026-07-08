package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.comment.api.LimitRootAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.ICommentFakeInputAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IGiftSelectAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardVMAbility;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IRefactorKeyboardFragment;
import com.ss.android.ugc.aweme.commentv2.commentlist.ui.ICommentListAssemAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentDeleteAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentExposureAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentListVMAbility;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.ICommentPublishViewModelAbility;
import com.ss.android.ugc.aweme.commentv2.headeranchor.common.service.ICommentTopBarAbility;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0l7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1345760l7m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentDeleteAbility LIZ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentDeleteAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentDeleteAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentDeleteAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentExposureAbility LIZIZ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentExposureAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentExposureAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentExposureAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentFakeInputAbility LIZJ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentFakeInputAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentFakeInputAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentFakeInputAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentListAssemAbility LIZLLL(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentListAssemAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentListAssemAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentListAssemAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentListVMAbility LJ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentListVMAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentListVMAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentListVMAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentPublishViewModelAbility LJFF(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentPublishViewModelAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentPublishViewModelAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentPublishViewModelAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ICommentTopBarAbility LJI(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, ICommentTopBarAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (ICommentTopBarAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (ICommentTopBarAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final IGiftSelectAbility LJII(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IGiftSelectAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (IGiftSelectAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (IGiftSelectAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final IKeyboardVMAbility LJIIIIZZ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IKeyboardVMAbility.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (IKeyboardVMAbility) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (IKeyboardVMAbility) interfaceC494301wD;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility LJIIIZ(androidx.fragment.app.Fragment r5, X.InterfaceC665370Q7z r6) {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility> r0 = com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility.class
            r3 = 0
            X.01wD r4 = X.C1558520qew.LIZ(r6, r0, r3)
            boolean r0 = r4 instanceof com.ss.android.ugc.aweme.comment.api.LimitRootAbility
            if (r0 == 0) goto L5d
            r0 = r4
            com.ss.android.ugc.aweme.comment.api.LimitRootAbility r0 = (com.ss.android.ugc.aweme.comment.api.LimitRootAbility) r0
            boolean r0 = r0.cD0()
            if (r0 == 0) goto L5d
            X.0l7j r0 = X.C1345730l7j.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.experiment.CommentSingleActOptConfig r0 = X.C1345730l7j.LIZ()
            boolean r0 = r0.shouldLimitRootAbility
            if (r0 == 0) goto L5d
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L5b
            android.app.Activity r2 = com.ss.android.ugc.aweme.SAFExtensionKt.LJFF(r0)
        L2b:
            boolean r0 = X.C294780Bgy.LIZ()
            r1 = 0
            if (r0 == 0) goto L40
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 != 0) goto L4f
        L36:
            r5 = r3
        L37:
            boolean r0 = X.C1345700l7g.LJIIJ(r5, r1, r1)
            if (r0 == 0) goto L5d
        L3d:
            com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility r3 = (com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility) r3
            return r3
        L40:
            boolean r0 = r2 instanceof X.InterfaceC214897198d
            if (r0 == 0) goto L36
            X.198d r2 = (X.InterfaceC214897198d) r2
            boolean r0 = r2.getEnableSAF()
            if (r0 != 0) goto L4f
            goto L36
        L4d:
            if (r5 == 0) goto L36
        L4f:
            boolean r0 = r5 instanceof X.InterfaceC214902198i
            if (r0 == 0) goto L56
            X.198i r5 = (X.InterfaceC214902198i) r5
            goto L37
        L56:
            androidx.fragment.app.Fragment r5 = r5.getParentFragment()
            goto L4d
        L5b:
            r2 = r3
            goto L2b
        L5d:
            r3 = r4
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345760l7m.LJIIIZ(androidx.fragment.app.Fragment, X.0Q7z):com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IPostModeCommentActionBarAbility");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final IRefactorKeyboardFragment LJIIJ(Fragment fragment, InterfaceC665370Q7z interfaceC665370Q7z) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198i;
        Activity activityLIZIZ;
        Activity activityLIZ;
        InterfaceC494301wD interfaceC494301wD = null;
        InterfaceC494301wD interfaceC494301wDLIZ = C1558520qew.LIZ(interfaceC665370Q7z, IRefactorKeyboardFragment.class, null);
        if (fragment == 0) {
            C844470XAv.LIZ.getClass();
            if (Intrinsics.LJFF(C844470XAv.LJIILL, "local_test")) {
                try {
                    throw new NullPointerException("fragment is null");
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1344030l4z.LIZLLL("limitRootAbility", "fragment is null trace = " + Log.getStackTraceString(th));
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    if (abstractC1387200mCcLIZIZ != null && (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) != null && (activityLIZ = C1388190mED.LIZ(activityLIZIZ)) != null) {
                        if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZ) != null) {
                            C632670Orh.LIZIZ(activityLIZ, new C19719212De(-1983500263, new AwS653S0100000_4(th, 21), true));
                        } else {
                            C1397580mTM c1397580mTM = new C1397580mTM(activityLIZ);
                            c1397580mTM.LIZIZ("limitRootAbility (debug) error (contact yangshuai.03): " + Log.getStackTraceString(th));
                            new C1397510mTF(c1397580mTM).LIZLLL();
                        }
                    }
                }
            }
        } else {
            if ((interfaceC494301wDLIZ instanceof LimitRootAbility) && ((LimitRootAbility) interfaceC494301wDLIZ).cD0()) {
                C1345730l7j.LIZ.getClass();
                if (C1345730l7j.LIZ().shouldLimitRootAbility) {
                    Context context = fragment.getContext();
                    if (context != null) {
                        componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
                    } else {
                        componentCallbacks2LJFF = null;
                    }
                    if (!C294780Bgy.LIZ() ? !(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF() : !(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                        interfaceC214902198i = null;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    } else {
                        while (!(fragment instanceof InterfaceC214902198i)) {
                            fragment = fragment.getParentFragment();
                            if (fragment == 0) {
                                interfaceC214902198i = null;
                                break;
                            }
                        }
                        interfaceC214902198i = (InterfaceC214902198i) fragment;
                        if (!C1345700l7g.LJIIJ(interfaceC214902198i, false, false)) {
                        }
                    }
                }
            }
            return (IRefactorKeyboardFragment) interfaceC494301wD;
        }
        interfaceC494301wD = interfaceC494301wDLIZ;
        return (IRefactorKeyboardFragment) interfaceC494301wD;
    }
}
