package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptType;

/* JADX INFO: renamed from: X.0Lvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558760Lvm {
    public final NLETrackSlot LIZ;
    public final PromptModel LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public /* synthetic */ C558760Lvm(NLETrackSlot nLETrackSlot, boolean z, int i) {
        PromptModel promptModel;
        boolean z2 = z;
        if ((i & 4) != 0) {
            promptModel = new PromptModel("", "", PromptType.NONE, "", "", "", false);
        } else {
            promptModel = null;
        }
        this(nLETrackSlot, promptModel, (i & 8) != 0 ? false : z2, null, (i & 32) != 0 ? "" : null, null);
    }

    public C558760Lvm(NLETrackSlot nLETrackSlot, PromptModel promptModel, boolean z, String str, String str2, String str3) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = promptModel;
        this.LIZJ = z;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
