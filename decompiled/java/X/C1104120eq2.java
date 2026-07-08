package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eq2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1104120eq2 extends FrameLayout implements InterfaceC1104130eq3 {
    public final DataChannel LL;
    public LiveIconView LLILLJJLI;
    public C1123090fKd LLILLL;
    public final boolean LLILZ;
    public C20743416Fc LLILZIL;
    public EnumC1102980eoC LLILZLL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1123090fKd c1123090fKd = this.LLILLL;
        if (c1123090fKd != null) {
            c1123090fKd.LIZJ.LJ();
        }
        super.onDetachedFromWindow();
    }

    public final DataChannel getDataChannel() {
        return this.LL;
    }

    public void setBottomColorStyle(EnumC1102980eoC enumC1102980eoC) {
        this.LLILZLL = enumC1102980eoC;
        C1123090fKd c1123090fKd = this.LLILLL;
        if (c1123090fKd != null) {
            c1123090fKd.LIZ();
        }
    }

    public C1104120eq2(Context context, DataChannel dataChannel) {
        boolean zBooleanValue;
        super(context);
        this.LL = dataChannel;
        Boolean bool = (Boolean) dataChannel.gg0(C780690Ujr.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LLILZ = zBooleanValue;
        this.LLILZLL = EnumC1102980eoC.DEFAULT;
        if (zBooleanValue) {
            View viewLJFF = C0J3Y.LJFF(C0J3Y.LIZ, R.layout.hyf, null, false, getContext(), false, 52);
            this.LLILLJJLI = (LiveIconView) viewLJFF.findViewById(R.id.y74);
            this.LLILZIL = (C20743416Fc) viewLJFF.findViewById(R.id.y7s);
            LiveIconView liveIconView = this.LLILLJJLI;
            if (liveIconView != null) {
                C786410Ut5.i5(liveIconView, 0.5f);
            }
            C20743416Fc c20743416Fc = this.LLILZIL;
            if (c20743416Fc != null) {
                C786410Ut5.m5(c20743416Fc, 0.3f);
            }
            addView(viewLJFF);
        } else {
            this.LLILLJJLI = new LiveIconView(getContext(), null);
            int iLIZIZ = (int) C497740JfY.LIZIZ(5.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(24.0f), (int) C497740JfY.LIZIZ(24.0f));
            layoutParams.topMargin = iLIZIZ;
            layoutParams.leftMargin = iLIZIZ;
            layoutParams.setMarginStart(iLIZIZ);
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                C786410Ut5.w6(liveIconView2, layoutParams);
            }
            LiveIconView liveIconView3 = this.LLILLJJLI;
            if (liveIconView3 != null) {
                C786410Ut5.i5(liveIconView3, 0.5f);
            }
            addView(this.LLILLJJLI);
        }
        this.LLILLL = new C1123090fKd(dataChannel);
        this.LLILZLL = C1102950eo9.LIZIZ(dataChannel);
        C1123090fKd c1123090fKd = this.LLILLL;
        if (c1123090fKd != null) {
            c1123090fKd.LIZLLL = this;
            c1123090fKd.LIZ();
        }
        setClipChildren(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    @Override // X.InterfaceC1104130eq3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.model.Gift r7, com.bytedance.android.live.base.model.ImageModel r8, com.bytedance.android.live.base.model.ImageModel r9) {
        /*
            r6 = this;
            if (r7 != 0) goto L3
            return
        L3:
            r3 = 0
            r2 = 1
            if (r8 == 0) goto L66
            X.0eoC r1 = r6.LLILZLL
            X.0eoC r0 = X.EnumC1102980eoC.GRAY
            if (r1 != r0) goto L66
        Ld:
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L19
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LL
            r0 = 0
            X.C1123080fKc.LIZJ(r1, r0, r2, r3)
        L19:
            boolean r0 = r6.LLILZ
            r5 = 1103101952(0x41c00000, float:24.0)
            if (r0 == 0) goto L56
            X.16Fc r1 = r6.LLILZIL
            if (r1 == 0) goto L31
            java.lang.String r0 = r7.name
            if (r0 != 0) goto L2e
            r0 = 2131842929(0x7f115771, float:1.9319208E38)
            java.lang.String r0 = X.C497740JfY.LJIJI(r0)
        L2e:
            r1.setText(r0)
        L31:
            com.bytedance.android.live.design.view.icon.LiveIconView r4 = r6.LLILLJJLI
            float r0 = X.C497740JfY.LIZIZ(r5)
            int r1 = (int) r0
            float r0 = X.C497740JfY.LIZIZ(r5)
            int r0 = (int) r0
            X.C1121670fIL.LJIILIIL(r4, r8, r1, r0, r3)
        L40:
            boolean r0 = r6.isShown()
            if (r0 == 0) goto L55
            long r3 = r7.id
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LL
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.RoomChannel> r0 = com.bytedance.android.livesdk.dataChannel.RoomChannel.class
            java.lang.Object r0 = r1.gg0(r0)
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r0
            X.C1123080fKc.LIZLLL(r2, r3, r0)
        L55:
            return
        L56:
            com.bytedance.android.live.design.view.icon.LiveIconView r4 = r6.LLILLJJLI
            float r0 = X.C497740JfY.LIZIZ(r5)
            int r1 = (int) r0
            float r0 = X.C497740JfY.LIZIZ(r5)
            int r0 = (int) r0
            X.C1121670fIL.LJIILIIL(r4, r8, r1, r0, r3)
            goto L40
        L66:
            if (r9 == 0) goto L70
            X.0eoC r1 = r6.LLILZLL
            X.0eoC r0 = X.EnumC1102980eoC.COLORFUL
            if (r1 != r0) goto L70
        L6e:
            r8 = r9
            goto Ld
        L70:
            X.0eoC r1 = r6.LLILZLL
            X.0eoC r0 = X.EnumC1102980eoC.HIGHLIGHT
            if (r1 != r0) goto L8b
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r6.LL
            java.lang.Class<X.0enS> r0 = X.C1102520enS.class
            java.lang.Object r1 = r1.gg0(r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Ld
            X.0eno r0 = X.EnumC1102740eno.DUMMY_FAST_GIFT
            boolean r0 = r1.contains(r0)
            if (r0 != r2) goto Ld
            goto L6e
        L8b:
            com.bytedance.android.live.base.model.ImageModel r8 = r7.image
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1104120eq2.LIZ(com.bytedance.android.livesdk.model.Gift, com.bytedance.android.live.base.model.ImageModel, com.bytedance.android.live.base.model.ImageModel):void");
    }
}
