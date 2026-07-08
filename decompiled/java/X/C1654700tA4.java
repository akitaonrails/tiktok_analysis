package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tA4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654700tA4 implements InterfaceC1654640t9y {
    public final VideoPublishEditModel LL;
    public final Function0<InterfaceC1460000o62> LLILLJJLI;
    public final String LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS569S0100000_25(this, 271));
    public final EnumC1654620t9w LLILZIL = EnumC1654620t9w.ANCHOR_FILTER;

    @Override // X.InterfaceC1654640t9y
    public final void H() {
        ((InterfaceC1460000o62) this.LLILZ.getValue()).Ga0(5, new C1662100tM0(EnumC1651790t5N.FILTER, "", this.LLILLL, true, Mp4ScreenVideoLoadTimeout.CONTROL, null, EnumC862650Xsl.BELOW_ICON, null, null, EnumC1662090tLz.NEW_FEATURE, null, new AwS569S0100000_25(this, 270), null, 5536));
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return !((Keva) C1654710tA5.LIZ.getValue()).getBoolean("filter_toolbar_guide_show_key", false);
    }

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
        ((Keva) C1654710tA5.LIZ.getValue()).storeBoolean("filter_toolbar_guide_show_key", true);
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return this.LLILZIL;
    }

    public C1654700tA4(VideoPublishEditModel videoPublishEditModel, String str, Function0 function0) {
        this.LL = videoPublishEditModel;
        this.LLILLJJLI = function0;
        this.LLILLL = str;
    }
}
