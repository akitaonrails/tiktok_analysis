package X;

import androidx.compose.ui.focus.FocusTargetNode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS42S0001000_30;

/* JADX INFO: renamed from: X.13eK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20060213eK {
    public static final C20060213eK LIZIZ = new C20060213eK();
    public static final C20060213eK LIZJ = new C20060213eK();
    public static final C20060213eK LIZLLL = new C20060213eK();
    public final C19968013Aw<InterfaceC1682300tsa> LIZ = new C19968013Aw<>(new InterfaceC1682300tsa[16]);

    public static boolean LIZIZ(C20060213eK c20060213eK) {
        c20060213eK.getClass();
        return c20060213eK.LIZ(new AwS42S0001000_30(7, 7));
    }

    public final boolean LIZ(Function1<? super FocusTargetNode, Boolean> function1) {
        boolean z;
        boolean zLJ;
        if (this != LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this != LIZJ) {
                C19968013Aw<InterfaceC1682300tsa> c19968013Aw = this.LIZ;
                int i = c19968013Aw.LLILLL;
                if (i != 0) {
                    InterfaceC1682300tsa[] interfaceC1682300tsaArr = c19968013Aw.LL;
                    boolean z2 = false;
                    for (int i2 = 0; i2 < i; i2++) {
                        InterfaceC1682300tsa interfaceC1682300tsa = interfaceC1682300tsaArr[i2];
                        if (!interfaceC1682300tsa.LJIJJ().LLJILLL) {
                            C1696250uF5.LIZIZ("visitChildren called on an unattached node");
                        }
                        C19968013Aw c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                        AbstractC20055413dY abstractC20055413dY = interfaceC1682300tsa.LJIJJ().LLILZLL;
                        if (abstractC20055413dY == null) {
                            C20052513d5.LIZ(c19968013Aw2, interfaceC1682300tsa.LJIJJ());
                        } else {
                            c19968013Aw2.LIZLLL(abstractC20055413dY);
                        }
                        while (true) {
                            int i3 = c19968013Aw2.LLILLL;
                            if (i3 != 0) {
                                AbstractC20055413dY abstractC20055413dYLIZIZ = (AbstractC20055413dY) c19968013Aw2.LJIILIIL(i3 - 1);
                                if ((abstractC20055413dYLIZIZ.LLILZ & 1024) == 0) {
                                    C20052513d5.LIZ(c19968013Aw2, abstractC20055413dYLIZIZ);
                                } else {
                                    while (true) {
                                        if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0) {
                                            C19968013Aw c19968013Aw3 = null;
                                            do {
                                                if (abstractC20055413dYLIZIZ instanceof FocusTargetNode) {
                                                    FocusTargetNode focusTargetNode = (FocusTargetNode) abstractC20055413dYLIZIZ;
                                                    if (focusTargetNode.LLJJI().LIZ) {
                                                        zLJ = function1.invoke(focusTargetNode).booleanValue();
                                                    } else {
                                                        zLJ = C20059913eH.LJ(focusTargetNode, 7, function1);
                                                    }
                                                    if (zLJ) {
                                                        z2 = true;
                                                        break;
                                                    }
                                                } else if ((abstractC20055413dYLIZIZ.LLILLL & 1024) != 0 && (abstractC20055413dYLIZIZ instanceof AbstractC20055313dX)) {
                                                    int i4 = 0;
                                                    for (AbstractC20055413dY abstractC20055413dY2 = ((AbstractC20055313dX) abstractC20055413dYLIZIZ).LLJJI; abstractC20055413dY2 != null; abstractC20055413dY2 = abstractC20055413dY2.LLILZLL) {
                                                        if ((abstractC20055413dY2.LLILLL & 1024) != 0) {
                                                            i4++;
                                                            if (i4 == 1) {
                                                                abstractC20055413dYLIZIZ = abstractC20055413dY2;
                                                            } else {
                                                                if (c19968013Aw3 == null) {
                                                                    c19968013Aw3 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                                }
                                                                if (abstractC20055413dYLIZIZ != null) {
                                                                    c19968013Aw3.LIZLLL(abstractC20055413dYLIZIZ);
                                                                    abstractC20055413dYLIZIZ = null;
                                                                }
                                                                c19968013Aw3.LIZLLL(abstractC20055413dY2);
                                                            }
                                                        }
                                                    }
                                                    if (i4 == 1) {
                                                    }
                                                }
                                                abstractC20055413dYLIZIZ = C20052513d5.LIZIZ(c19968013Aw3);
                                            } while (abstractC20055413dYLIZIZ != null);
                                        } else {
                                            abstractC20055413dYLIZIZ = abstractC20055413dYLIZIZ.LLILZLL;
                                            if (abstractC20055413dYLIZIZ != null) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return z2;
                }
                "\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n".toString();
                throw new IllegalStateException("\n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            }
            "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString();
            throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
        }
        "\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n".toString();
        throw new IllegalStateException("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
    }
}
