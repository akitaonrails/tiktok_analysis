package X;

import com.bytedance.mt.protector.impl.UriProtector;

/* JADX INFO: renamed from: X.0jfI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289660jfI {
    public static long LIZ;
    public static final /* synthetic */ int LIZIZ = 0;

    public static void LIZ(final String str) {
        C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
        c1325700kbQLIZLLL.LJIIJ = true;
        ((AbstractC1321260kUG) C1322200kVm.LIZ().LJI(c1325700kbQLIZLLL.LIZ(), null)).LIZJ(new C0HWE<C1323050kX9<AbstractC1327750kej>>() { // from class: X.0jfJ
            @Override // X.C0HWE
            public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed to cached image: ");
                sbLIZ.append(str);
                C20441214yg.LJFF("ImagePreloadUtil", C2188811AlT.LIZIZ(sbLIZ), interfaceC1320200kSY.LIZLLL());
            }

            @Override // X.C0HWE
            public final void LJFF(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Image preloaded success: ");
                sbLIZ.append(str);
                C20441214yg.LIZIZ("ImagePreloadUtil", C2188811AlT.LIZIZ(sbLIZ));
            }
        }, C822700WPc.LL);
    }
}
