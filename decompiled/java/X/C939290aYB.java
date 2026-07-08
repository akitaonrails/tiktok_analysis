package X;

import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0aYB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C939290aYB implements LifecycleOwner {
    public final DataChannel LL;
    public final ViewGroup LLILLJJLI;
    public final InterfaceC920220a3Q LLILLL;
    public final LifecycleRegistry LLILZ;
    public final C01GW LLILZIL;
    public IThemeAbility LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public final ViewOnLayoutChangeListenerC986920bn0 LLJ;
    public final C11PQ<Integer> LLJI;

    public final InterfaceC937960aW2 LIZIZ() {
        return (InterfaceC937960aW2) this.LLILZIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C939290aYB.LIZ():void");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZ;
    }

    public C939290aYB(DataChannel dataChannel, ViewGroup viewGroup) {
        InterfaceC920220a3Q dataSource = C940770aaZ.LIZ().getDataSource();
        this.LL = dataChannel;
        this.LLILLJJLI = viewGroup;
        this.LLILLL = dataSource;
        this.LLILZ = new LifecycleRegistry(this);
        this.LLILZIL = C452501pT.LIZIZ(new AwS559S0100000_15(this, 645));
        this.LLJ = new ViewOnLayoutChangeListenerC986920bn0(this, 3);
        this.LLJI = new C11PQ<>();
    }
}
