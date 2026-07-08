package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0yPT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1856450yPT extends C1857080yQU {
    public final int LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final String LLILZLL;
    public final Map<String, String> LLIZ;

    public String LIZ() {
        return this.LLILZ;
    }

    public C1856450yPT(C326960Crm c326960Crm, int i) {
        super(c326960Crm);
        this.LLILLL = i;
        this.LLILZ = (String) C1856050yOp.LIZ(i, this.LLILLJJLI.sugList);
        this.LLILZIL = (String) C1856050yOp.LIZ(i, this.LLILLJJLI.emojiList);
        this.LLILZLL = (String) C1856050yOp.LIZ(i, this.LLILLJJLI.sugIdList);
        Map<String, String> map = null;
        try {
            String str = this.LLILLJJLI.passExtra.get("recommend_word_mob_info");
            if (str != null) {
                C1227904rF.LIZ.getClass();
                List list = (List) C1227904rF.LIZJ(str, List.class);
                if (list != null) {
                    map = (Map) ListProtector.get(list, this.LLILLL);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        this.LLIZ = map;
    }
}
