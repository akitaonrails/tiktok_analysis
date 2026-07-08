package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import kotlin.jvm.internal.AwS568S0100000_24;

/* JADX INFO: renamed from: X.0r86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1576600r86 extends LinearLayout {
    public final C426160GnO LL;
    public String LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;

    public final ITakoContextAbility getContextAbility() {
        return (ITakoContextAbility) this.LLILLL.getValue();
    }

    public final IMessageAbility getMessageAbility() {
        return (IMessageAbility) this.LLILZ.getValue();
    }

    public C1576600r86(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1633));
        this.LLILZ = C452501pT.LIZIZ(new AwS568S0100000_24(this, 1634));
        C426160GnO c426160GnO = new C426160GnO(context, null, 6);
        C786410Ut5.a7(c426160GnO, new LinearLayout.LayoutParams(-1, -2));
        c426160GnO.setGravity(-1);
        c426160GnO.setMaxTagLines(2);
        this.LL = c426160GnO;
        addView(c426160GnO);
    }
}
