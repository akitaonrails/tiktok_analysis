package X;

import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.search.HighlightInfo;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0Pom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C656340Pom implements InterfaceC662700Pz2 {
    public final /* synthetic */ C656320Pok LIZ;

    @Override // X.InterfaceC662700Pz2
    public final List<HighlightInfo> LIZ() {
        Challenge challenge = this.LIZ.LLJ;
        if (challenge != null) {
            return challenge.getHighlightInfoList();
        }
        return null;
    }

    public C656340Pom(C656320Pok c656320Pok) {
        this.LIZ = c656320Pok;
    }

    @Override // X.InterfaceC662700Pz2
    public final List LIZIZ(String str) {
        if ("search_cha_name".equals(str)) {
            return new ArrayList<Object>(this) { // from class: X.0Pon
                {
                    add(new C444920HcY(42, true));
                    add(new ForegroundColorSpan(C1308910kAL.LIZJ(R.attr.a1h, this.LIZ.itemView.getContext()).intValue()));
                }
            };
        }
        return null;
    }
}
