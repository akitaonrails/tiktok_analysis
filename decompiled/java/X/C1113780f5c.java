package X;

import Y.ARunnableS117S0100000_17;
import android.os.Handler;
import com.bytedance.android.livesdk.livesetting.model.LiveMessagePlatformBubbleConfig;
import com.bytedance.android.livesdk.livesetting.other.LiveMsgNotifyReceiveTrackSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveMustBubbleOptimizeAndroidSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveTooltipDebugSetting;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0f5c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113780f5c implements InterfaceC1102150emr, InterfaceC1102160ems {
    public final LiveMessagePlatformBubbleConfig LL;
    public final C1113840f5i LLILLJJLI;

    @Override // X.InterfaceC1102150emr
    public final List<String> Q0() {
        return null;
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
    public final int getComponentType() {
        return ((this.LL.priority > 0 || LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() != 2) && !(this.LL.scene == 2 && LiveMustBubbleOptimizeAndroidSetting.INSTANCE.getValue() == 1)) ? 1 : 17;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1107830ew1 LJIIL() {
        return EnumC1107830ew1.BUBBLE;
    }

    @Override // X.InterfaceC1102150emr
    public final EnumC1100250ejn m() {
        return EnumC1100250ejn.MESSAGE;
    }

    @Override // X.InterfaceC1102160ems
    public final void LLFFF(int i) {
        String str;
        if (getComponentType() != 17 && !LiveTooltipDebugSetting.INSTANCE.getValue().getAllClose()) {
            if (getComponentType() == 1) {
                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                C1113800f5e.LJIIZILJ();
                return;
            }
            return;
        }
        C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
        C1113840f5i c1113840f5i = this.LLILLJJLI;
        C0UX8 c0ux8 = C1113800f5e.LJ;
        if (c0ux8 == null || (str = c0ux8.page) == null) {
            str = "";
        }
        C1113800f5e.LJJ(c1113840f5i, str);
    }

    public C1113780f5c(LiveMessagePlatformBubbleConfig liveMessagePlatformBubbleConfig, C1113840f5i c1113840f5i) {
        this.LL = liveMessagePlatformBubbleConfig;
        this.LLILLJJLI = c1113840f5i;
    }

    @Override // X.InterfaceC1102160ems
    public final void w0(int i, List<String> list) {
        String str;
        if (getComponentType() == 1) {
            if (list.contains(C1107810evz.LJJIZ.LIZ)) {
                Handler handler = C1113800f5e.LIZJ;
                if (handler != null) {
                    C786410Ut5.LJLIIL(500L, handler, new Runnable() { // from class: X.0f5d
                        @Override // java.lang.Runnable
                        public final void run() {
                            boolean zLIZ;
                            C1C7U.LIZ("TooltipStandardManager$BubbleNotifyComponent@e4d7.onActive$1");
                            try {
                                C1113800f5e c1113800f5e = C1113800f5e.LIZ;
                                C1113800f5e.LJIIZILJ();
                            } finally {
                                if (!zLIZ) {
                                }
                            }
                            C1C7U.LIZIZ("TooltipStandardManager$BubbleNotifyComponent@e4d7.onActive$1");
                        }
                    });
                    return;
                }
                return;
            }
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            C1113800f5e.LJIIZILJ();
            return;
        }
        if (getComponentType() != 17) {
            return;
        }
        if (list.contains(C1107810evz.LJJIZ.LIZ)) {
            Handler handler2 = C1113800f5e.LIZJ;
            if (handler2 == null) {
                return;
            }
            C786410Ut5.LJLIIL(500L, handler2, new ARunnableS117S0100000_17(this, 193));
            return;
        }
        C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
        C1113840f5i c1113840f5i = this.LLILLJJLI;
        C0UX8 c0ux8 = C1113800f5e.LJ;
        if (c0ux8 == null || (str = c0ux8.page) == null) {
            str = "";
        }
        C1113800f5e.LJJ(c1113840f5i, str);
    }

    @Override // X.InterfaceC1102160ems
    public final void t(int i, int i2, InterfaceC1102120emo interfaceC1102120emo, C1102130emp c1102130emp, boolean z) {
        C0UX8 c0ux8;
        C1113780f5c c1113780f5c;
        C1113840f5i c1113840f5i;
        C0UX8 c0ux82;
        String str;
        Queue<C1113840f5i> queue;
        String str2;
        String str3 = null;
        if (getComponentType() == 1) {
            C1113800f5e c1113800f5e = C1113800f5e.LIZ;
            if (z && (interfaceC1102120emo instanceof C1102230emz)) {
                ArrayList<C1113840f5i> arrayList = new ArrayList();
                C0UX8 c0ux83 = C1113800f5e.LJ;
                if (c0ux83 != null && (str = c0ux83.page) != null && (queue = C1113800f5e.LJI.get(str)) != null) {
                    for (C1113840f5i c1113840f5i2 : queue) {
                        C1102230emz c1102230emz = (C1102230emz) ((LinkedHashMap) C1113800f5e.LJIILL).get(c1113840f5i2.LJFF);
                        if (c1102230emz != null) {
                            str2 = c1102230emz.LIZ;
                        } else {
                            str2 = null;
                        }
                        if (Intrinsics.LJFF(str2, ((C1102230emz) interfaceC1102120emo).LIZ)) {
                            arrayList.add(c1113840f5i2);
                        }
                    }
                    for (C1113840f5i c1113840f5i3 : arrayList) {
                        queue.remove(c1113840f5i3);
                        c1113840f5i3.LIZ.LJ();
                        C1113800f5e.LJIJI(c1113840f5i3, str, "unable");
                    }
                }
            }
            if (C1113800f5e.LJIILIIL() && (c0ux82 = C1113800f5e.LJ) != null) {
                C1113800f5e.LIZIZ(c0ux82, 4);
                return;
            }
            return;
        }
        if (getComponentType() == 17) {
            C1113800f5e c1113800f5e2 = C1113800f5e.LIZ;
            InterfaceC1102150emr interfaceC1102150emrLJII = interfaceC1102120emo.LJII();
            if ((interfaceC1102150emrLJII instanceof C1113780f5c) && (c1113780f5c = (C1113780f5c) interfaceC1102150emrLJII) != null && (c1113840f5i = c1113780f5c.LLILLJJLI) != null && z) {
                C0UX8 c0ux84 = C1113800f5e.LJ;
                if (c0ux84 != null) {
                    str3 = c0ux84.page;
                }
                C1113800f5e.LJIJI(c1113840f5i, str3, "unable");
            }
            if (C1113800f5e.LJIILIIL() && (c0ux8 = C1113800f5e.LJ) != null) {
                C1113800f5e.LIZIZ(c0ux8, 4);
            }
        }
    }
}
