package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0poL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1525910poL {
    public final Context LIZ;
    public final C1526350pp3 LIZIZ;
    public final AtomicBoolean LIZJ = new AtomicBoolean(true);
    public final C1525930poN LIZLLL = new C1525930poN();

    public C1525910poL(Context context, C1526350pp3 c1526350pp3) {
        this.LIZ = context;
        this.LIZIZ = c1526350pp3;
    }

    public final void LIZ(EnumC1527250pqV enumC1527250pqV, C1526010poV c1526010poV, C801490VcJ c801490VcJ) {
        List<? extends C801520VcM> listLJJJJLL;
        Object[] array;
        if (c801490VcJ == null) {
            return;
        }
        InterfaceC1525900poK interfaceC1525900poK = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
        InterfaceC1525900poK interfaceC1525900poK2 = (InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class);
        boolean z = false;
        try {
            if (enumC1527250pqV == EnumC1527250pqV.Device) {
                listLJJJJLL = interfaceC1525900poK2.LJJIJ(enumC1527250pqV, c1526010poV.LIZ);
            } else {
                listLJJJJLL = interfaceC1525900poK2.LJJJJLL(enumC1527250pqV, c1526010poV.LIZ, c1526010poV.LIZIZ);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1526710ppd.LIZJ().ensureNotReachHere(e, "execute sql failed when queryUploadMsgByDeviceInfo");
        }
        if (listLJJJJLL != null && !listLJJJJLL.isEmpty()) {
            ArrayList<C801520VcM> arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (C801520VcM c801520VcM : listLJJJJLL) {
                C1525690pnz c1525690pnz = (C1525690pnz) ((ConcurrentHashMap) this.LIZIZ.LLILLJJLI).get(Long.valueOf(c801520VcM.LIZJ));
                synchronized (c1525690pnz.LIZLLL) {
                    try {
                        if (((ArrayList) c1525690pnz.LIZLLL).size() > 0) {
                            array = ((ArrayList) c1525690pnz.LIZLLL).toArray();
                        } else {
                            array = null;
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (array != null) {
                    for (Object obj : array) {
                        if (obj != null) {
                            if (!((InterfaceC1525710po1) obj).LIZ() && !z2) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.sync.interfaze.ISendInterceptor");
                        }
                    }
                }
                if (z2) {
                    arrayList2.add(c801520VcM);
                } else {
                    arrayList.add(c801520VcM);
                }
            }
            for (C801520VcM c801520VcM2 : arrayList) {
                c801520VcM2.LIZIZ = c801490VcJ.LIZ;
                long j = c801490VcJ.LJI + 1;
                c801490VcJ.LJI = j;
                c801520VcM2.LJI = j;
                c801520VcM2.LJFF = c801490VcJ.LJ;
            }
            if (interfaceC1525900poK2.LJJJJZI(listLJJJJLL, c801490VcJ, arrayList2)) {
                C1527890prX.LIZJ(Intrinsics.LJIIJJI("save distributed payload to db success", "[BusinessMsgSenderV4] "));
            }
            C1527890prX.LIZIZ(Intrinsics.LJIIJJI("save distributed payload to db failed", "[BusinessMsgSenderV4] "));
            return;
        }
        try {
            List listLJJJ = interfaceC1525900poK.LJJJ(c801490VcJ.LIZ);
            if (listLJJJ != null && !listLJJJ.isEmpty()) {
                String str = c801490VcJ.LIZ;
                ArrayList arrayList3 = new ArrayList();
                InterfaceC1525970poR interfaceC1525970poRLIZIZ = C1526890ppv.LIZJ(this.LIZ).LIZIZ();
                int length = 0;
                while (true) {
                    if (!(!listLJJJ.isEmpty())) {
                        break;
                    }
                    if (((C801520VcM) ListProtector.get(listLJJJ, 0)).LJII.length + length <= interfaceC1525970poRLIZIZ.LJI()) {
                        C801520VcM c801520VcM3 = (C801520VcM) ListProtector.remove(listLJJJ, 0);
                        arrayList3.add(c801520VcM3);
                        length += c801520VcM3.LJII.length;
                    } else if (arrayList3.isEmpty()) {
                        arrayList3.add(ListProtector.remove(listLJJJ, 0));
                        z = true;
                    }
                }
                if (!arrayList3.isEmpty()) {
                    ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJJIJIIJI(str, z, arrayList3);
                    return;
                } else {
                    C1527890prX.LIZIZ(Intrinsics.LJIIJJI("dataList is empty when send payload,maybe the first size too large or original data is empty", "[BusinessMsgSenderV4] "));
                    return;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[BusinessMsgSenderV4] ");
            sbLIZ.append("local db is empty, not upload ");
            sbLIZ.append(enumC1527250pqV);
            C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C1526710ppd.LIZJ().ensureNotReachHere(e2, "execute sql failed when queryDistributeMsgs");
        }
    }
}
