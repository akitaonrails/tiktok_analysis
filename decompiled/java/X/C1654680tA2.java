package X;

import android.content.Context;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0tA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1654680tA2 implements InterfaceC1654640t9y {
    public final Context LL;
    public final Function0<InterfaceC1651080t4E> LLILLJJLI;
    public final Function0<Boolean> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(393));
    public final C01GW LLILZIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 758));
    public final EnumC1654620t9w LLILZLL = EnumC1654620t9w.LAYOUT;

    @Override // X.InterfaceC1654640t9y
    public final void H() {
        ((InterfaceC1651080t4E) this.LLILZIL.getValue()).LT1(false);
        ((InterfaceC1651080t4E) this.LLILZIL.getValue()).Nh(new C1662100tM0(EnumC1651790t5N.LAYOUT, this.LL.getString(2131828248), this.LL.getString(2131828263), true, Mp4ScreenVideoLoadTimeout.CONTROL, null, null, null, null, null, null, null, null, 8160));
    }

    @Override // X.InterfaceC1654640t9y
    public final boolean LJJLIL() {
        return !((Keva) this.LLILZ.getValue()).getBoolean("layout_toolbar_guide_show_key", false) && this.LLILLL.invoke().booleanValue();
    }

    @Override // X.InterfaceC1654640t9y
    public final void z0() {
        ((Keva) this.LLILZ.getValue()).storeBoolean("layout_toolbar_guide_show_key", true);
    }

    @Override // X.InterfaceC1654640t9y
    public final EnumC1654620t9w LJJI() {
        return this.LLILZLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1654680tA2(Context context, Function0<? extends InterfaceC1651080t4E> function0, Function0<Boolean> function02) {
        this.LL = context;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }
}
