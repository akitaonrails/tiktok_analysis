package X;

import androidx.fragment.app.Fragment;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControlComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SXW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SXW extends C09AY implements Function0<String> {
    public final /* synthetic */ EarphonePlayerControlComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SXW(EarphonePlayerControlComponent earphonePlayerControlComponent) {
        super(0);
        this.LL = earphonePlayerControlComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        Hox hox;
        String strPz;
        Fragment fragmentLJI = C724240Sb0.LJI(this.LL);
        if (fragmentLJI != null) {
            EarphonePlayerControlComponent earphonePlayerControlComponent = this.LL;
            if (C724240Sb0.LIZ(earphonePlayerControlComponent) != null && (hox = (Hox) earphonePlayerControlComponent.LLILLL.getValue()) != null && (strPz = hox.pz(fragmentLJI)) != null && strPz.length() != 0) {
                return strPz;
            }
        }
        return null;
    }
}
