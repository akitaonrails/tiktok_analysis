package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.SocialMediaPickerViewModel;

/* JADX INFO: renamed from: X.0Mqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581200Mqs implements InterfaceC1680560tpm {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1680560tpm
    public final void dispose() {
        switch (this.$t) {
            case 0:
                dispose$0(this);
                break;
            case 1:
                dispose$1(this);
                break;
        }
    }

    public static final void dispose$0(C581200Mqs c581200Mqs) {
        ((SocialMediaPickerViewModel) c581200Mqs.l0).onEvent$social_creation_mediapicker_release(C0M91.LIZIZ);
    }

    public static final void dispose$1(C581200Mqs c581200Mqs) {
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C05P0) c581200Mqs.l0).getValue();
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        ((C05P0) c581200Mqs.l0).setValue(null);
    }

    public C581200Mqs(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
