package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.PurePreviewMediaEngine;

/* JADX INFO: renamed from: X.06wP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769506wP implements InterfaceC1680560tpm {
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

    public static final void dispose$0(C1769506wP c1769506wP) {
        AnonymousClass0956 anonymousClass0956 = ((C05VF) c1769506wP.l0).LJIIJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void dispose$1(C1769506wP c1769506wP) {
        C05P0 c05p0 = (C05P0) c1769506wP.l0;
        C1404305eb c1404305eb = PurePreviewMediaEngine.Companion;
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) c05p0.getValue();
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        ((C05P0) c1769506wP.l0).setValue(null);
    }

    public C1769506wP(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
