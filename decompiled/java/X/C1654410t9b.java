package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0t9b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654410t9b implements InterfaceC1654640t9y {
    public final ShortVideoContext LL;
    public final Context LLILLJJLI;
    public final Function0<InterfaceC1651080t4E> LLILLL;
    public final Function0<Boolean> LLILZ;
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 275));
    public final EnumC1654620t9w LLILZLL = EnumC1654620t9w.ANCHOR_FILTER;

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
    }

    @Override // X.InterfaceC1654640t9y
    public final void H() {
        ((InterfaceC1651080t4E) this.LLILZIL.getValue()).Nh(new C1662100tM0(EnumC1651790t5N.FILTER, "", this.LLILLJJLI.getString(2131826976), true, Mp4ScreenVideoLoadTimeout.CONTROL, null, EnumC862650Xsl.BELOW_ICON, null, null, EnumC1662090tLz.NEW_FEATURE, null, new AwS569S0100000_25(this, 274), null, 5536));
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return !((Keva) C1654710tA5.LIZ.getValue()).getBoolean("filter_toolbar_guide_show_key", false) && this.LLILZ.invoke().booleanValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return this.LLILZLL;
    }

    public C1654410t9b(Context context, ShortVideoContext shortVideoContext, AwS569S0100000_25 awS569S0100000_25, AwS569S0100000_25 awS569S0100000_252) {
        this.LL = shortVideoContext;
        this.LLILLJJLI = context;
        this.LLILLL = awS569S0100000_25;
        this.LLILZ = awS569S0100000_252;
    }
}
