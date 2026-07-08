package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595340rcK {
    public static final C1595340rcK LIZ = new C1595340rcK();
    public static final ConcurrentHashMap<Integer, List<InterfaceC1891350zJl>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, Boolean> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<Integer, ConcurrentHashMap<String, Integer>> LIZLLL = new ConcurrentHashMap<>();
    public static String LJ = C0XQ7.LJFF().getCurUserId();

    public static C1595260rcC LIZIZ() {
        return new C1595260rcC(EnumC1595320rcI.COMPLETE, C13BV.INSTANCE, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, false, 0, 496);
    }

    public static C1596190rdh LIZJ(C1595260rcC c1595260rcC, C1595260rcC c1595260rcC2) {
        List list;
        List list2;
        C1595260rcC c1595260rcC3 = new C1595260rcC(EnumC1595320rcI.SUCCESS, new ArrayList(), CardStruct.IStatusCode.DEFAULT, null, null, 0, c1595260rcC.LJI, c1595260rcC2.LJII, c1595260rcC.LJIIIIZZ, 48);
        EnumC1595320rcI enumC1595320rcI = c1595260rcC2.LIZ;
        int[] iArr = C1595330rcJ.LIZ;
        int i = iArr[enumC1595320rcI.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                c1595260rcC3.LIZ = EnumC1595320rcI.FAIL;
                c1595260rcC3.LIZLLL = new Exception("get live skylight failed");
                list = C13BV.INSTANCE;
            } else {
                throw new C1954807lC();
            }
        } else {
            c1595260rcC3.LIZ = c1595260rcC2.LIZ;
            list = c1595260rcC2.LIZIZ;
        }
        int i2 = iArr[c1595260rcC.LIZ.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 == 3) {
                if (c1595260rcC3.LIZ == EnumC1595320rcI.FAIL) {
                    c1595260rcC3.LIZLLL = new Exception("get live skylight failed, get story skylight failed");
                }
                list2 = C13BV.INSTANCE;
            } else {
                throw new C1954807lC();
            }
        } else {
            c1595260rcC3.LIZ = c1595260rcC.LIZ;
            c1595260rcC3.LIZJ = c1595260rcC.LIZJ;
            c1595260rcC3.LJ = c1595260rcC.LJ;
            list2 = c1595260rcC.LIZIZ;
        }
        return new C1596190rdh(list2, list, c1595260rcC3);
    }

    public static C1595260rcC LIZLLL(int i, boolean z) {
        if (!z && !Intrinsics.LJFF(LIZJ.get(Integer.valueOf(i)), Boolean.TRUE)) {
            return LIZIZ();
        }
        if (!Intrinsics.LJFF(LJ, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId())) {
            LJ = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            LIZJ.clear();
            return LIZIZ();
        }
        if (!z) {
            LIZJ.remove(Integer.valueOf(i));
        }
        List<InterfaceC1891350zJl> list = LIZIZ.get(Integer.valueOf(i));
        if (list != null) {
            return new C1595260rcC(EnumC1595320rcI.COMPLETE, list, CardStruct.IStatusCode.DEFAULT, null, null, 0, false, true, 0, 368);
        }
        return LIZIZ();
    }

    public static void LIZ(int i, C1595260rcC c1595260rcC, C1595260rcC c1595260rcC2, boolean z) {
        if (C1594980rbk.LIZ().avatarType > 0 && i == 1 && !C278330AvX.LIZIZ()) {
            if (!c1595260rcC.LIZIZ.isEmpty()) {
                Object obj = (InterfaceC1891350zJl) ListProtector.get(c1595260rcC.LIZIZ, 0);
                if (obj instanceof C1596360rdy) {
                    C1596360rdy c1596360rdy = (C1596360rdy) obj;
                    if (c1596360rdy.LL || C729510SjV.LJJII(c1596360rdy.LLILLJJLI)) {
                        c1595260rcC2.LIZIZ.remove(obj);
                    }
                }
            }
            if (C1594980rbk.LIZ().goLiveAvatar && C1594980rbk.LIZJ && z) {
                ListProtector.add(c1595260rcC2.LIZIZ, 0, new C1595990rdN(((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getCurUser()));
                return;
            }
            return;
        }
        if (!(!c1595260rcC.LIZIZ.isEmpty())) {
            return;
        }
        Object obj2 = (InterfaceC1891350zJl) ListProtector.get(c1595260rcC.LIZIZ, 0);
        if (!(obj2 instanceof C1596360rdy)) {
            return;
        }
        C1596360rdy c1596360rdy2 = (C1596360rdy) obj2;
        if (!c1596360rdy2.LL && !C729510SjV.LJJII(c1596360rdy2.LLILLJJLI)) {
            return;
        }
        c1595260rcC2.LIZIZ.remove(obj2);
        ListProtector.add(c1595260rcC2.LIZIZ, 0, ListProtector.get(c1595260rcC.LIZIZ, 0));
    }
}
