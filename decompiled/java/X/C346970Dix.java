package X;

import com.bytedance.ies.nle.editor_jni.NLETrack;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Dix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C346970Dix extends C09AY implements Function1<NLETrack, Boolean> {
    public static final /* synthetic */ int LL = 0;

    static {
        new C346970Dix();
    }

    public C346970Dix() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(NLETrack nLETrack) {
        boolean z;
        NLETrack nLETrack2 = nLETrack;
        if (!C351220Dpo.LLILLL(nLETrack2) && !C351220Dpo.LLJILLL(nLETrack2)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
