package com.bytedance.android.live.broadcast.banner;

import X.C0IJT;
import X.C0JT6;
import X.C1338270kvh;
import X.C198600pc;
import X.C2188811AlT;
import X.C445101oH;
import X.C474500IjA;
import X.C770660UKy;
import X.C770670UKz;
import X.InterfaceC772190UQv;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.preview.PreviewWidget;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewUniformStyleABSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BannerWidget extends PreviewWidget {
    public C770660UKy LLILZ;
    public String LLILZIL = "null";
    public int LLILZLL = Integer.MAX_VALUE;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public LiveMode LLJ;

    public abstract String H1();

    public void J1() {
    }

    public void M1() {
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void L1() {
        DataChannel dataChannel = this.dataChannel;
        LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_click");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
        c474500IjALIZ.LJJII(H1(), "component_name");
        c474500IjALIZ.LJJII(G1(liveMode), "live_type");
        c474500IjALIZ.LIZ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public void onShow() {
        if (this.LLIZLLLIL) {
            String str = this.LLILZIL;
            C770660UKy c770660UKy = this.LLILZ;
            if (!Intrinsics.LJFF(str, c770660UKy != null ? c770660UKy.LJIIIIZZ : null) || Intrinsics.LJFF(this.LLILZIL, "null") || Intrinsics.LJFF(this.LLILZIL, "else")) {
                return;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            C770660UKy c770660UKy2 = this.LLILZ;
            if (c770660UKy2 != null && c770660UKy2.LJII) {
                Iterator<C770670UKz> it2 = c770660UKy2.LIZJ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        C770670UKz c770670UKzLIZ = c770660UKy2.LIZ(this);
                        if (c770670UKzLIZ != null) {
                            c770660UKy2.LIZJ.add(c770670UKzLIZ);
                            c770660UKy2.LIZLLL(true);
                            if (!c770660UKy2.LIZLLL.contains(c770670UKzLIZ)) {
                                c770670UKzLIZ.LIZIZ.I1(false);
                            }
                        }
                    } else if (Intrinsics.LJFF(it2.next().LIZIZ, this)) {
                        break;
                    }
                }
            }
        }
        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable()) {
            DataChannel dataChannel = this.dataChannel;
            LiveMode liveMode = dataChannel != null ? (LiveMode) dataChannel.gg0(LiveModeChannel.class) : null;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_takepage_component_show");
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "anchor_id");
            c474500IjALIZ.LJJII(H1(), "component_name");
            c474500IjALIZ.LJJII(G1(liveMode), "live_type");
            c474500IjALIZ.LIZ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public void show() throws Exception {
        C770660UKy c770660UKy;
        if (this.LLIZLLLIL) {
            AnchorPreviewUniformStyleABSetting anchorPreviewUniformStyleABSetting = AnchorPreviewUniformStyleABSetting.INSTANCE;
            if (anchorPreviewUniformStyleABSetting.enable() && (c770660UKy = this.LLILZ) != null && anchorPreviewUniformStyleABSetting.enable() && c770660UKy.LJ.contains(this)) {
                return;
            }
            if (this.LLILZLL != Integer.MAX_VALUE) {
                C0JT6<String> c0jt6 = InterfaceC772190UQv.D3;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LLILZIL);
                sbLIZ.append(H1());
                String strLIZIZ = c0jt6.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (strLIZIZ != null && this.LLILZLL <= CastIntegerProtector.parseInt(strLIZIZ)) {
                    return;
                }
            }
            if (this.LLIZ) {
                C0JT6<String> c0jt62 = InterfaceC772190UQv.C3;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LLILZIL);
                sbLIZ2.append(H1());
                String strLIZIZ2 = c0jt62.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                if (strLIZIZ2 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j2 = jCurrentTimeMillis / j;
                    long j3 = CastLongProtector.parseLong(strLIZIZ2) / j;
                    SimpleDateFormat simpleDateFormat = C445101oH.LIZ;
                    if (j2 - ((((long) TimeZone.getDefault().getRawOffset()) + j2) % 86400) < (j3 - ((((long) TimeZone.getDefault().getRawOffset()) + j3) % 86400)) + ((long) 86400)) {
                        return;
                    }
                }
            }
            String str = this.LLILZIL;
            C770660UKy c770660UKy2 = this.LLILZ;
            if (!Intrinsics.LJFF(str, c770660UKy2 != null ? c770660UKy2.LJIIIIZZ : null) || Intrinsics.LJFF(this.LLILZIL, "null") || Intrinsics.LJFF(this.LLILZIL, "else")) {
                return;
            }
            Map<String, Object> map = C1338270kvh.LIZ;
            C770660UKy c770660UKy3 = this.LLILZ;
            if (c770660UKy3 == null || !c770660UKy3.LJII) {
                return;
            }
            Iterator<C770670UKz> it2 = c770660UKy3.LIZJ.iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(it2.next().LIZIZ, this)) {
                    return;
                }
            }
            C770670UKz c770670UKzLIZ = c770660UKy3.LIZ(this);
            if (c770670UKzLIZ == null) {
                return;
            }
            Object objClone = c770660UKy3.LIZJ.clone();
            Object objClone2 = c770660UKy3.LIZLLL.clone();
            c770660UKy3.LIZJ.add(c770670UKzLIZ);
            c770660UKy3.LIZLLL(false);
            boolean zContains = true ^ c770660UKy3.LIZLLL.contains(c770670UKzLIZ);
            c770660UKy3.LIZJ = (LinkedHashSet) objClone;
            c770660UKy3.LIZLLL = (LinkedHashSet) objClone2;
            if (zContains) {
                return;
            }
        }
        super.show();
    }

    @Override // com.bytedance.android.live.broadcast.preview.PreviewWidget
    public final void C1() {
        super.C1();
        LiveMode liveMode = (LiveMode) this.dataChannel.gg0(LiveModeChannel.class);
        this.LLJ = liveMode;
        int i = liveMode == null ? -1 : C198600pc.LIZ[liveMode.ordinal()];
        if (i == 1) {
            this.LLILZIL = LiveMode.SCREEN_RECORD.logStreamingType;
            this.LLIZLLLIL = true;
            this.LLILZ = (C770660UKy) this.dataChannel.gg0(GameBannerWidgetManagerChannel.class);
        } else if (i == 2) {
            this.LLILZIL = LiveMode.THIRD_PARTY.logStreamingType;
            this.LLIZLLLIL = true;
            this.LLILZ = (C770660UKy) this.dataChannel.gg0(ObsBannerWidgetManagerChannel.class);
        } else if (i == 3) {
            this.LLILZIL = LiveMode.LIVE_STUDIO.logStreamingType;
            this.LLIZLLLIL = true;
            this.LLILZ = (C770660UKy) this.dataChannel.gg0(LiveStudioBannerWidgetManagerChannel.class);
        } else if (i != 4) {
            this.LLILZIL = "else";
            this.LLIZLLLIL = false;
            this.LLILZ = null;
        } else {
            this.LLILZIL = LiveMode.VIDEO.logStreamingType;
            this.LLIZLLLIL = false;
            this.LLILZ = null;
        }
        I1(false);
        show();
    }

    public static String G1(LiveMode liveMode) {
        if (liveMode != null) {
            int i = C198600pc.LIZ[liveMode.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 5) {
                            return "voice_live";
                        }
                        return null;
                    }
                    return "video_live";
                }
                return "third_party";
            }
            return "share_screen";
        }
        return null;
    }

    public final void I1(boolean z) {
        String str;
        super.hide();
        if (this.LLIZLLLIL) {
            String str2 = this.LLILZIL;
            C770660UKy c770660UKy = this.LLILZ;
            C770670UKz c770670UKz = null;
            if (c770660UKy != null) {
                str = c770660UKy.LJIIIIZZ;
            } else {
                str = null;
            }
            if (Intrinsics.LJFF(str2, str) && !Intrinsics.LJFF(this.LLILZIL, "null") && !Intrinsics.LJFF(this.LLILZIL, "else")) {
                Map<String, Object> map = C1338270kvh.LIZ;
                C770660UKy c770660UKy2 = this.LLILZ;
                if (c770660UKy2 != null) {
                    for (C770670UKz c770670UKz2 : c770660UKy2.LIZJ) {
                        if (Intrinsics.LJFF(c770670UKz2.LIZIZ, this)) {
                            c770670UKz = c770670UKz2;
                        }
                    }
                    if (c770670UKz != null) {
                        c770660UKy2.LIZJ.remove(c770670UKz);
                        c770660UKy2.LIZLLL.remove(c770670UKz);
                        if (AnchorPreviewUniformStyleABSetting.INSTANCE.enable() && z) {
                            c770660UKy2.LJ.add(c770670UKz.LIZIZ);
                        }
                        if (!z) {
                            c770660UKy2.LIZLLL(true);
                        } else {
                            c770660UKy2.LIZJ(this, true);
                        }
                    }
                }
            }
        }
    }
}
