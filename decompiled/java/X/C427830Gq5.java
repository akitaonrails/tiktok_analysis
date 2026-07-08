package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0Gq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C427830Gq5 extends LinearLayout {
    public final C01GW LL;

    private final C427760Gpy getAvatars() {
        return (C427760Gpy) this.LL.getValue();
    }

    public final void setProgress(List<String> list) {
        getAvatars().setTotalCount(list.size());
        int i = 0;
        for (String str : list) {
            int i2 = i + 1;
            if (i >= 0) {
                C427760Gpy.LIZ(getAvatars(), i, str, "", null, null, false, null, 2040);
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public C427830Gq5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1351));
        setOrientation(0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.csl, this, true);
        getAvatars().setSize(EnumC428930Grr.X_SMALL);
    }
}
