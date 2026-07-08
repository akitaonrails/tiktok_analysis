package X;

import com.bytedance.android.livesdk.livesetting.other.LiveMsgNotifyReceiveTrackSetting;
import java.util.List;

/* JADX INFO: renamed from: X.0f5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113770f5b implements InterfaceC1102150emr {
    public static final C1113770f5b LL = new C1113770f5b();

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final int getComponentType() {
        return 2;
    }

    @Override // X.InterfaceC1102150emr
    public final C0K9J getUiInfo() {
        return null;
    }

    @Override // X.InterfaceC1102150emr
    public final boolean e() {
        return LiveMsgNotifyReceiveTrackSetting.INSTANCE.getValue();
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.RED_DOT;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }
}
