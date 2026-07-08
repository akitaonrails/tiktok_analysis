package X;

import android.content.Context;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multilive.model.HostDisplayResponse;
import com.bytedance.android.live.liveinteract.platform.common.datachannel.HostTagDisPlayInfoReadyEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestHostTagUiOptSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0aU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C936700aU0 extends AbstractC939840aZ4 {
    public final DataChannel LLIZLLLIL;
    public final InterfaceC920220a3Q LLJ;
    public C20743416Fc LLJI;
    public C19R8 LLJIJIL;
    public LiveIconView LLJILJIL;
    public C19R7 LLJILJILJ;
    public C19R6 LLJILLL;
    public final AwS594S0100000_15 LLJJ;
    public boolean LLJJI;
    public boolean LLJJIII;

    @InterfaceC948490an1(name = "MULTI_GUEST_DATA_HOLDER")
    public MultiGuestDataHolder dataHolder;

    /* JADX WARN: Removed duplicated region for block: B:51:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ() {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C936700aU0.LJIIJ():void");
    }

    private final int getTagBg() {
        return LiveSdkMultiGuestHostTagUiOptSetting.INSTANCE.isOpt() ? R.drawable.e0j : R.drawable.dut;
    }

    public final MultiGuestDataHolder getDataHolder() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            return multiGuestDataHolder;
        }
        return null;
    }

    public final boolean LJIIIZ() {
        HostDisplayResponse.DisplayInfo displayInfoLIZIZ = C923450a8d.LIZIZ(getDataChannel());
        return displayInfoLIZIZ != null && displayInfoLIZIZ.hostType > 1;
    }

    @Override // X.AbstractC939840aZ4
    public Integer getLayoutId() {
        return Integer.valueOf(R.layout.hth);
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLJI = (C20743416Fc) findViewById(R.id.js6);
        this.LLJIJIL = (C19R8) findViewById(R.id.js5);
        this.LLJILJIL = (LiveIconView) findViewById(R.id.js4);
        this.LLJILJILJ = (C19R7) findViewById(R.id.js3);
        this.LLJILLL = (C19R6) findViewById(R.id.js2);
        getDataChannel().EQ2(this, HostTagDisPlayInfoReadyEvent.class, this.LLJJ);
        LJIIJ();
    }

    @Override // X.AbstractC939840aZ4, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getDataChannel().HQ2(this, HostTagDisPlayInfoReadyEvent.class, this.LLJJ);
    }

    @Override // X.AbstractC939840aZ4
    public DataChannel getDataChannel() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC939840aZ4
    public EnumC939900aZA getElementType() {
        return EnumC939900aZA.HOST_TAG;
    }

    public final void setDataHolder(MultiGuestDataHolder multiGuestDataHolder) {
        this.dataHolder = multiGuestDataHolder;
    }

    public C936700aU0(Context context, DataChannel dataChannel, C957020b0m c957020b0m, InterfaceC920220a3Q interfaceC920220a3Q) {
        super(context, dataChannel, c957020b0m, null);
        this.LLIZLLLIL = dataChannel;
        this.LLJ = interfaceC920220a3Q;
        this.LLJJ = new AwS594S0100000_15(this, 1107);
        C948450amx.LIZIZ.LIZJ(this);
    }
}
