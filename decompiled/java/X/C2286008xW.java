package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Unit;

/* JADX INFO: renamed from: X.08xW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2286008xW {
    public static final C603820NmG<String, C08E0> LIZ = new C603820NmG<>(10);
    public static final Map<String, C11SU<C08E0>> LIZIZ = Collections.synchronizedMap(new C830490Whz());

    public static C11NZ LIZ(final C2286308xZ c2286308xZ) {
        Integer num;
        if (TextUtils.isEmpty(c2286308xZ.LIZ)) {
            return C11NZ.LJJJJZ(new C08E0(null));
        }
        C08E0 c08e0LIZJ = LIZ.LIZJ(c2286308xZ.LIZ);
        if (c08e0LIZJ != null) {
            return C11NZ.LJJJJZ(c08e0LIZJ);
        }
        try {
            final String str = c2286308xZ.LIZ;
            Map<String, C11SU<C08E0>> map = LIZIZ;
            C11SU<C08E0> c11su = map.get(str);
            if (c11su == null) {
                if (TextUtils.isEmpty(c2286308xZ.LIZIZ) || ((num = c2286308xZ.LIZJ) != null && num.intValue() == -2147483647)) {
                    return C11NZ.LJJJJZ(new C08E0(null));
                }
                C11SU<C08E0> c11suLJLLLLLL = C11SU.LJLLLLLL();
                map.put(str, c11suLJLLLLLL);
                C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.08xX
                    @Override // X.InterfaceC1478005qU
                    public final void subscribe(C09AJ<C08E0> c09aj) {
                        String str2;
                        C08E0 c08e0LIZ;
                        C1C7U.LIZ("LyricInfoManagerV2@960c.doRealFormatLyric$1");
                        try {
                            Integer num2 = c2286308xZ.LIZJ;
                            if (num2 != null && num2.intValue() == 2 && (str2 = c2286308xZ.LIZIZ) != null && (c08e0LIZ = new C08E0(str).LIZ(str2)) != null) {
                                C603820NmG<String, C08E0> c603820NmG = C2286008xW.LIZ;
                                String str3 = str;
                                C2286308xZ c2286308xZ2 = c2286308xZ;
                                long j = c2286308xZ2.LIZLLL;
                                C2286008xW.LIZIZ(c08e0LIZ, j, c2286308xZ2.LJ + j);
                                c603820NmG.LIZLLL(str3, c08e0LIZ);
                                c09aj.onNext(c08e0LIZ);
                                c09aj.onComplete();
                            } else {
                                c09aj.onError(new NoSuchElementException());
                            }
                        } catch (FileNotFoundException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c09aj.onError(new FileNotFoundException());
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            c09aj.onError(new IOException());
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c09aj.onError(th);
                        }
                        C1C7U.LIZIZ("LyricInfoManagerV2@960c.doRealFormatLyric$1");
                    }
                }).LJL(C11S5.LIZ()).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.08xY
                    @Override // X.InterfaceC781210Ukh
                    public final void run() {
                        C2286008xW.LIZIZ.remove(str);
                    }
                }).LIZIZ(c11suLJLLLLLL);
                return c11suLJLLLLLL;
            }
            return c11su;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C201962140q c201962140q = C201962140q.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("load lyrics info from server error : ");
            sbLIZ.append(th.getMessage());
            C201955140j.LJIIIIZZ(c201962140q, "LyricInfoManager", C2188811AlT.LIZIZ(sbLIZ));
            return C11NZ.LJJJJZ(new C08E0(null));
        }
    }

    public static void LIZIZ(C08E0 c08e0, long j, long j2) {
        ArrayList<C08E1> arrayList = c08e0.LIZJ;
        ArrayList<C08E1> arrayList2 = new ArrayList<>();
        for (C08E1 c08e1 : arrayList) {
            C08E1 c08e12 = c08e1;
            if (!TextUtils.isEmpty(c08e12.LIZ) && c08e12.LIZIZ >= 0) {
                arrayList2.add(c08e1);
            }
        }
        c08e0.LIZJ = arrayList2;
        int size = arrayList2.size();
        int i = 0;
        for (C08E1 c08e13 : arrayList2) {
            int i2 = i + 1;
            if (i >= 0) {
                C08E1 c08e14 = c08e13;
                if (i >= size - 1) {
                    c08e14.LIZJ = Long.MAX_VALUE;
                } else {
                    c08e14.LIZJ = ((C08E1) ListProtector.get(arrayList2, i2)).LIZIZ;
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        ArrayList<C08E1> arrayList3 = new ArrayList<>();
        for (C08E1 c08e15 : arrayList2) {
            if (c08e15.LIZJ > 0) {
                arrayList3.add(c08e15);
            }
        }
        c08e0.LIZJ = arrayList3;
        ArrayList<C08E1> arrayList4 = new ArrayList<>();
        for (C08E1 c08e16 : arrayList3) {
            C08E1 c08e17 = c08e16;
            if (c08e17.LIZIZ <= j2 && c08e17.LIZJ >= j) {
                arrayList4.add(c08e16);
            }
        }
        if (!arrayList4.isEmpty()) {
            C08E1 c08e18 = (C08E1) C13LP.LJJJJZI(arrayList4);
            C08E1 c08e19 = (C08E1) C13LP.LJJLIIIJJI(arrayList4);
            if (c08e18.LIZIZ < j) {
                c08e18.LIZIZ = j;
            }
            if (c08e19.LIZJ > j2) {
                c08e19.LIZJ = j2;
            }
        }
        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, 10));
        for (C08E1 c08e110 : arrayList4) {
            c08e110.LIZIZ -= j;
            c08e110.LIZJ -= j;
            arrayList5.add(Unit.LIZ);
        }
        c08e0.LIZJ = arrayList4;
    }
}
