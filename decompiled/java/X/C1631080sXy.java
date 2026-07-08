package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1631080sXy extends C1636260sgK<Effect> {
    /* JADX WARN: Illegal instructions before constructor call */
    public C1631080sXy(String str, Context context) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.cw5, null, false);
        ((TextView) viewTd.findViewById(R.id.wmy)).setText(str);
        super(viewTd);
    }
}
