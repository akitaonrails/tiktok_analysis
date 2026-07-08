package X;

import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0U85, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U85 {
    public final TextView LIZ;
    public final InterfaceC923870a9J LIZIZ;
    public final Fragment LIZJ;
    public final C0U86 LIZLLL;
    public final C0UHS LJ;
    public C11JF LJFF;
    public final C0U84 LJI;

    public final void LIZ(boolean z) {
        InterfaceC923870a9J interfaceC923870a9J;
        if (this.LIZ != null) {
            C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
            C307001Gy.LIZ().getClass();
            if (C927600aFK.LJIILL() && (interfaceC923870a9J = this.LIZIZ) != null) {
                Object attachedComposerManager = interfaceC923870a9J.getAttachedComposerManager();
                if (attachedComposerManager instanceof InterfaceC769000UEo) {
                    if (z) {
                        ((InterfaceC769000UEo) attachedComposerManager).Dr(this.LJI);
                    } else {
                        ((InterfaceC769000UEo) attachedComposerManager).tr(this.LJI);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0U84] */
    public C0U85(TextView textView, InterfaceC923870a9J interfaceC923870a9J, Fragment fragment, C0U86 c0u86, C0UHS c0uhs) {
        this.LIZ = textView;
        this.LIZIZ = interfaceC923870a9J;
        this.LIZJ = fragment;
        this.LIZLLL = c0u86;
        this.LJ = c0uhs;
        C1119920fFW.LJI(500, textView);
        if (textView != null) {
            textView.setShadowLayer(2.0f, 0.0f, 0.5f, C497740JfY.LJFF(R.color.a2p));
        }
        this.LJI = new C0U86() { // from class: X.0U84
            /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
            @Override // X.C0U86
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r7, java.lang.String r8, boolean r9) {
                /*
                    Method dump skipped, instruction units count: 232
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0U84.LIZ(com.bytedance.android.livesdkapi.depend.model.LiveEffect, java.lang.String, boolean):void");
            }
        };
    }
}
