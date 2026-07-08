package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0PTM, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PTM {
    public static final C0PTM LIZ = new C0PTM();

    public static View LIZ(ViewGroup viewGroup, String str, final String str2, final C0P64 c0p64, final String str3) {
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.evx, viewGroup, false);
        final Context context = viewGroup.getContext();
        TextView textView = (TextView) viewTd.findViewById(R.id.f_q);
        if (str != null && !a0.LJJJIL(str)) {
            textView.setText(str);
        }
        C786410Ut5.I7(new C19IN() { // from class: X.0PTj
            /* JADX WARN: Removed duplicated region for block: B:73:0x0123  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0145 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // X.C19IN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(android.view.View r14) {
                /*
                    Method dump skipped, instruction units count: 377
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C645450PTj.LIZ(android.view.View):void");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(LSPassThroughRecordSizeConfig.DEFAULT, true);
            }
        }, textView);
        return viewTd;
    }
}
