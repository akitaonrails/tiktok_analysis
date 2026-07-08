package X;

import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.08Tx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2124308Tx {
    public static int[] LIZ;
    public static volatile boolean LIZIZ;
    public static final C202098145w LIZJ = C08TN.LIZ();

    public static void LIZ() {
        List listLL;
        String[] strArrSplit;
        String string = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getString("lancet_hook_method_collector", "");
        PrintStream printStream = System.err;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("method id config:");
        sbLIZ.append(string);
        printStream.println(C2188811AlT.LIZIZ(sbLIZ));
        boolean z = false;
        if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null) {
            LIZ = new int[strArrSplit.length];
            for (int i = 0; i < strArrSplit.length; i++) {
                try {
                    LIZ[i] = CastIntegerProtector.valueOf(strArrSplit[i]).intValue();
                } catch (NumberFormatException e) {
                    TryCatchGuardChecker.doCheck(e);
                    System.err.println(e.toString());
                }
            }
        }
        C202098145w c202098145wLIZ = C08TN.LIZ();
        Set<String> stringSet = Keva.getRepo(FollowFeedViewStubExperiment.REPO_NAME).getStringSet("coldboot_satellitemethod", new HashSet());
        c202098145wLIZ.getClass();
        if (!C086I.LIZIZ(stringSet)) {
            try {
                Iterator<String> it2 = stringSet.iterator();
                while (it2.hasNext()) {
                    List<String> listSplit = new Regex(":").split(it2.next(), 0);
                    if (listSplit.isEmpty()) {
                        listLL = C13BV.INSTANCE;
                    } else {
                        ListIterator<String> listIterator = listSplit.listIterator(listSplit.size());
                        while (listIterator.hasPrevious()) {
                            if (listIterator.previous().length() != 0) {
                                listLL = C13LP.LL(listSplit, listIterator.nextIndex() + 1);
                                break;
                            }
                        }
                        listLL = C13BV.INSTANCE;
                    }
                    String[] strArr = (String[]) listLL.toArray(new String[0]);
                    if (strArr.length == 2) {
                        ((HashMap) c202098145wLIZ.LJJIIZI).put(CastIntegerProtector.valueOf(strArr[0]), strArr[1]);
                    }
                }
                z = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZIZ = z;
    }
}
