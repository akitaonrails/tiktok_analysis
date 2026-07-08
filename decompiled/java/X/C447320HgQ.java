package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.rich.reward.DisplayImage;
import com.ss.android.ugc.aweme.rich.reward.ImageItem;
import com.ss.android.ugc.aweme.rich.reward.ImagePostInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0HgQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447320HgQ {
    public static final C447320HgQ LIZ = new C447320HgQ();

    public static List LIZ(ImagePostInfo imagePostInfo) {
        String str;
        if (imagePostInfo == null) {
            return C13BV.INSTANCE;
        }
        List list = imagePostInfo.images;
        if (list == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            DisplayImage displayImage = ((ImageItem) it2.next()).displayImage;
            if (displayImage != null && (str = displayImage.uri) != null) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!a0.LJJJIL((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static void LIZIZ(Context context, String str, final String str2, EnumC1331380kka enumC1331380kka) {
        if (str != null && !a0.LJJJIL(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadSingleUrl start: ");
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(UriProtector.parse(str));
                c1325700kbQLIZLLL.LJIIL = enumC1331380kka;
                final InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSYLJI = C1328130kfL.LJIILIIL().LJIIL().LJI(c1325700kbQLIZLLL.LIZ(), C786410Ut5.N3(context));
                ((AbstractC1321260kUG) interfaceC1320200kSYLJI).LIZJ(new AbstractC447090Hg3() { // from class: X.0HgP
                    @Override // X.C0HWE
                    public final void LJ(InterfaceC1320200kSY<C1323050kX9<AbstractC1327750kej>> interfaceC1320200kSY) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("preloadSingleUrl failed: ");
                            sbLIZ2.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (interfaceC1320200kSY != null) {
                                interfaceC1320200kSY.close();
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }

                    @Override // X.AbstractC447090Hg3
                    public final void LJI(Bitmap bitmap) {
                        try {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("preloadSingleUrl success: ");
                            sbLIZ2.append(str2);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            interfaceC1320200kSYLJI.LIZ();
                            interfaceC1320200kSYLJI.close();
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            interfaceC1320200kSYLJI.close();
                            throw th;
                        }
                    }
                }, C822700WPc.LL);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
