package X;

import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0gpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public abstract class AbstractC1180940gpw extends BaseComponentData implements C14NM {
    public int customContentType = C538540LAe.LLJJJIL;
    public final C01GW contentType$delegate = C452501pT.LIZIZ(new AwS562S0100000_18(this, 2567));

    @Override // X.C14NM
    public int getContentType() {
        return ((Number) this.contentType$delegate.getValue()).intValue();
    }

    public int getCustomContentType$slash_release() {
        return this.customContentType;
    }

    public void setCustomContentType$slash_release(int i) {
        this.customContentType = i;
    }
}
