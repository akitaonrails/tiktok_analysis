package X;

import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AFwS254S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import u4.q0;

/* JADX INFO: renamed from: X.0fPJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125990fPJ extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final String LLLILZJ;
    public final String LLLILZLLLI;
    public C09AY LLLIZZ;
    public final C1149290g0t LLLJ;

    @Override // X.AbstractC1126560fQE
    public final void U5(int i) {
    }

    @Override // X.AbstractC1126560fQE
    public final void u6() {
    }

    @Override // X.AbstractC1126560fQE
    public final void h6() {
        q0.LJIJ(this.LLLILZ, new C1151960g5C(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z6() {
        /*
            r10 = this;
            X.0fQI<? extends X.0054> r1 = r10.LLJJLIIIJLLLLLLLZ
            if (r1 == 0) goto Lb
            X.0fQG r0 = r10.LLJL
            if (r0 == 0) goto Lb
            r0.LJJIII(r1)
        Lb:
            X.0fQI<? extends X.0054> r0 = r10.LLJJLIIIJLLLLLLLZ
            r1 = 0
            if (r0 == 0) goto L63
            com.bytedance.android.live.base.model.ImageModel r0 = r0.LJIIIIZZ()
        L14:
            r3 = 0
            if (r0 == 0) goto L61
            X.0fQI<? extends X.0054> r0 = r10.LLJJLIIIJLLLLLLLZ
            if (r0 == 0) goto L25
            com.bytedance.android.live.base.model.ImageModel r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L25
            java.lang.String r1 = r0.getUri()
        L25:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L61
            r2 = 1
        L2c:
            X.0fQI<? extends X.0054> r0 = r10.LLJJLIIIJLLLLLLLZ
            java.lang.String r5 = ""
            if (r0 == 0) goto L38
            java.lang.String r1 = r0.LJIIJ()
            if (r1 != 0) goto L39
        L38:
            r1 = r5
        L39:
            java.lang.String r0 = "webcast_super_fan_box_send_panel"
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r0, r3)
            if (r0 == 0) goto L5e
            java.lang.String r7 = "superfan_box"
        L43:
            X.09AY r0 = r10.LLLIZZ
            X.0eqh r3 = new X.0eqh
            java.lang.String r4 = "gift"
            if (r2 == 0) goto L4d
            java.lang.String r5 = "portal"
        L4d:
            if (r2 == 0) goto L5b
            java.lang.String r6 = "label"
        L51:
            r8 = 0
            r9 = 32
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.invoke(r3)
            return
        L5b:
            java.lang.String r6 = "normal"
            goto L51
        L5e:
            java.lang.String r7 = "treasure_box"
            goto L43
        L61:
            r2 = 0
            goto L2c
        L63:
            r0 = r1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125990fPJ.z6():void");
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZJ;
    }

    public C1125990fPJ(View view) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = "LiveGiftRedEnvelopeViewHolderV2";
        this.LLLILZLLLI = C497740JfY.LJIJI(2131840820);
        this.LLLIZZ = AFwS254S0000000_17.get$arr$(105);
        this.LLLJ = new C1149290g0t(new AwS561S0100000_17(this, 323), new AwS561S0100000_17(this, 324), AFwS205S0000000_17.get$arr$(141), new AwS561S0100000_17(this, 325));
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.p6q);
        this.LLJIJIL = c16f5;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), 500, view.getContext()));
        }
        this.LLJJIJIL = (ImageView) view.findViewById(R.id.noy);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4 A[PHI: r3
      0x00d4: PHI (r3v5 java.lang.String) = (r3v2 java.lang.String), (r3v6 java.lang.String) binds: [B:35:0x00d2, B:33:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0111 A[PHI: r3
      0x0111: PHI (r3v3 java.lang.String) = (r3v2 java.lang.String), (r3v5 java.lang.String) binds: [B:35:0x00d2, B:37:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N5(final X.AbstractC1126600fQI<? extends X.AnonymousClass0054> r9, com.bytedance.ies.sdk.datachannel.DataChannel r10, int r11) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1125990fPJ.N5(X.0fQI, com.bytedance.ies.sdk.datachannel.DataChannel, int):void");
    }
}
