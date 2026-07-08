package X;

import Y.ACallableS8S1101000_5;
import Y.AComparatorS362S0200000_5;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.setting.ShareItemOrderBean;
import com.ss.android.ugc.aweme.share.SharePlatform;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0lsi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374860lsi {
    public static volatile C1374860lsi LJFF;
    public List<SharePlatform> LIZ;
    public List<ShareItemOrderBean> LIZIZ;
    public List<ShareItemOrderBean> LIZJ;
    public final ShareDatabase LIZLLL;
    public Integer LJ;

    public static C1374860lsi LIZJ() {
        if (LJFF == null) {
            synchronized (C1374860lsi.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C1374860lsi();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final String[] LIZIZ() {
        String[] strArr;
        List<SharePlatform> list = this.LIZ;
        if (list == null || list.isEmpty()) {
            C01GW c01gw = C1380680m26.LIZ;
            strArr = (String[]) C1380680m26.LJJJ.getValue();
        } else {
            strArr = new String[this.LIZ.size()];
            for (int i = 0; i < this.LIZ.size(); i++) {
                strArr[i] = ((SharePlatform) ListProtector.get(this.LIZ, i)).platformId;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(str);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public C1374860lsi() {
        C844470XAv.LIZ.getClass();
        this.LIZLLL = ShareDatabase.LIZ(C844470XAv.LIZ());
    }

    public final void LIZLLL(final Function1<ArrayList<String>, Unit> function1) throws Throwable {
        final ArrayList arrayList = new ArrayList(Arrays.asList(LIZIZ()));
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ShareDatabase shareDatabase = LIZJ().LIZLLL;
        if (shareDatabase != null) {
            try {
                shareDatabase.LIZIZ().LIZJ(0, 100).LJIJJ(C11S5.LIZ()).LJIILIIL(C1701940uOG.LIZIZ()).LIZ(new C11IH<List<? extends C353310DtB>>() { // from class: X.0Dqz
                    public final /* synthetic */ int LLILLL = 10;

                    @Override // X.C11IH
                    public final void onComplete() {
                    }

                    @Override // X.C11IH
                    public final void onError(Throwable th) {
                    }

                    @Override // X.C11IH
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.C11IH
                    public final void onSuccess(List<? extends C353310DtB> list) {
                        C352000Dr4.LIZIZ.LIZIZ(new C020S(jCurrentTimeMillis, 5));
                        C1374860lsi.LIZJ().getClass();
                        Function1<ArrayList<String>, Unit> function12 = function1;
                        ArrayList<String> arrayList2 = arrayList;
                        C08XD.LJJ(arrayList2, new AComparatorS362S0200000_5(C1371650lnX.LIZIZ(this.LLILLL, list, arrayList2), arrayList2, 1));
                        function12.invoke(arrayList2);
                    }
                });
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZ(int i, String str, String str2) {
        C15O7.LIZJ(new ACallableS8S1101000_5(this, i, str, 1));
        if (str2 != null && str != null) {
            C08YU.LIZIZ(str2, str);
        }
    }
}
