package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654690tA3 implements InterfaceC1654640t9y {
    public final Context LL;
    public final ShortVideoContext LLILLJJLI;
    public final Function0<InterfaceC1651080t4E> LLILLL;
    public final Function0<Boolean> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 757));
    public final EnumC1654620t9w LLILZLL = EnumC1654620t9w.ANCHOR_LAYOUT;

    @Override // X.InterfaceC1654640t9y
    public final void H() {
        ((InterfaceC1651080t4E) this.LLILZIL.getValue()).Nh(new C1662100tM0(EnumC1651790t5N.LAYOUT, "", this.LL.getString(2131828263), true, Mp4ScreenVideoLoadTimeout.CONTROL, null, null, null, null, null, null, new AwS569S0100000_25(this, 756), null, 6112));
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return Intrinsics.LJFF(this.LLILLJJLI.shootWay, "reuse_layout") && !((Keva) C1654710tA5.LIZ.getValue()).getBoolean("layout_toolbar_guide_from_anchor_show_key", false) && this.LLILZ.invoke().booleanValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
        ((Keva) C1654710tA5.LIZ.getValue()).storeBoolean("layout_toolbar_guide_from_anchor_show_key", true);
        new C1654680tA2(this.LL, this.LLILLL, this.LLILZ).z0();
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return this.LLILZLL;
    }

    public C1654690tA3(Context context, ShortVideoContext shortVideoContext, AwS552S0100000_8 awS552S0100000_8, AwS552S0100000_8 awS552S0100000_82) {
        this.LL = context;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = awS552S0100000_8;
        this.LLILZ = awS552S0100000_82;
    }
}
