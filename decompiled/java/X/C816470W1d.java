package X;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.global.config.settings.pojo.EmailLoginSettings;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS5S3100000_13;
import kotlin.text.a0;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0W1d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816470W1d {
    public static void LIZ(RecyclerView recyclerView, EditText editText, String str, String str2) {
        List<String> domainRecommendation;
        ArrayList arrayList;
        EmailLoginSettings emailLoginSettings;
        List<String> list = C799310VXd.LIZ;
        try {
            emailLoginSettings = C0CLW.LIZIZ.LIZ.getEmailLoginSettings();
        } catch (C316660CbA e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!emailLoginSettings.getDomainRecommendation().isEmpty()) {
            domainRecommendation = emailLoginSettings.getDomainRecommendation();
        } else {
            domainRecommendation = C799310VXd.LIZ;
        }
        if (domainRecommendation != null) {
            List listLJJJJLI = C13LP.LJJJJLI(domainRecommendation);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJJJJLI, 10));
            for (String strLIZIZ : (ArrayList) listLJJJJLI) {
                if (!a0.LJJIIZI(strLIZIZ, e3.g, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(strLIZIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                arrayList2.add(strLIZIZ);
            }
            arrayList = new ArrayList(arrayList2);
        } else {
            arrayList = null;
        }
        new C424810GlD(recyclerView, arrayList, new AwS5S3100000_13(editText, str, str2, "", 0));
    }
}
