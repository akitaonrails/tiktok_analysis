package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0EwJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380730EwJ extends RecyclerView.ViewHolder {
    public static final Regex LLJ = new Regex("\\d+");
    public final TuxIconView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxIconView LLILZ;
    public final TuxTextView LLILZIL;
    public final LinearLayout LLILZLL;
    public AnonymousClass0956 LLIZ;
    public String LLIZLLLIL;

    public C380730EwJ(View view) {
        super(view);
        this.LL = (TuxIconView) view.findViewById(R.id.oj3);
        this.LLILLJJLI = (TuxTextView) view.findViewById(R.id.oj4);
        this.LLILLL = (TuxTextView) view.findViewById(R.id.oja);
        this.LLILZ = (TuxIconView) view.findViewById(R.id.oj0);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.oj5);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.oj8);
    }

    public static void I5(TuxTextView tuxTextView, String str) {
        String string;
        Object c098200Yq;
        String string2;
        if (str != null) {
            string = a0.LJLIIIL(str).toString();
        } else {
            string = null;
        }
        String str2 = "";
        if (string == null) {
            string = "";
        }
        if (string.length() == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 8);
            tuxTextView.setText("");
            return;
        }
        Context context = tuxTextView.getContext();
        int iN3 = C786410Ut5.n3(context.getResources(), string, "string", context.getPackageName());
        if (iN3 == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(string);
            return;
        }
        try {
            c098200Yq = context.getString(iN3);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 != null && (string2 = a0.LJLIIIL(str3).toString()) != null) {
            str2 = string2;
        }
        if (str2.length() == 0) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(string);
        } else {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(str2);
        }
    }
}
