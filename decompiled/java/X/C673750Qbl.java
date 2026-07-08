package X;

import Y.ACListenerS145S0100000_10;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C673750Qbl extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public SearchHistory LL;
    public String LLILLJJLI;
    public HashMap<String, Object> LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public boolean LLILZLL;
    public final TuxTextView LLIZ;
    public final FrameLayout LLIZLLLIL;
    public final TuxIconView LLJ;
    public final TuxIconView LLJI;
    public final LinearLayout LLJIJIL;
    public final FrameLayout LLJILJIL;

    public final void I5() throws JSONException {
        String str;
        String str2;
        C1440005kM.LIZ(new C673860Qbw());
        JSONObject jSONObject = new JSONObject();
        String str3 = this.LLILZIL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        jSONObject.put("searchFrom", str3);
        jSONObject.put("enter_from", "search_transfer");
        jSONObject.put("search_entrance", this.LLILLJJLI);
        jSONObject.put("enterFrom", "");
        jSONObject.put("enterMethod", "search_history");
        SearchHistory searchHistory = this.LL;
        if (searchHistory == null || (str = searchHistory.keyword) == null) {
            str = "";
        }
        jSONObject.put("keyword", str);
        String str5 = this.LLILZIL;
        if (str5 == null) {
            str5 = "";
        }
        View view = this.itemView;
        jSONObject.put("enter_from", str5);
        C0QP3.LIZJ(view, new C614940OAa(jSONObject));
        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
        JSONObject jSONObject2 = new JSONObject();
        HashMap<String, Object> map = this.LLILLL;
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject2.put(entry.getKey(), entry.getValue());
            }
        }
        SearchHistory searchHistory2 = this.LL;
        if (searchHistory2 != null && (str2 = searchHistory2.keyword) != null) {
            str4 = str2;
        }
        jSONObject2.put("search_keyword", str4);
        jSONObject2.put("action_type", "click");
        jSONObject2.put("order", this.LLILZ);
        c1507790pL7.getClass();
        C1507790pL7.LIZLLL("search_history", jSONObject2);
    }

    public C673750Qbl(View view) {
        float f;
        Resources resources;
        DisplayMetrics displayMetrics;
        super(view);
        this.LLILLJJLI = "";
        this.LLILZ = -1;
        this.LLILZIL = "";
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.eqx);
        this.LLJILJIL = frameLayout;
        this.LLJIJIL = (LinearLayout) view.findViewById(R.id.ubx);
        this.LLJI = (TuxIconView) view.findViewById(R.id.uai);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.zpl);
        this.LLIZLLLIL = (FrameLayout) view.findViewById(R.id.fld);
        this.LLJ = (TuxIconView) view.findViewById(R.id.lea);
        C427690Gpr.LJ(view, 0.0f);
        if (frameLayout != null && (resources = frameLayout.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            f = (displayMetrics.widthPixels / displayMetrics.density) / 375.0f;
        } else {
            f = 1.0f;
        }
        FrameLayout frameLayout2 = this.LLJILJIL;
        if (frameLayout2 != null) {
            ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
            if (layoutParams != null && layoutParams.width > 0) {
                layoutParams.width = (int) (layoutParams.width * f);
            }
            int i = layoutParams.height;
            if (i > 0) {
                layoutParams.height = (int) (i * f);
            }
            C786410Ut5.a6(frameLayout2, layoutParams);
        }
        LinearLayout linearLayout = this.LLJIJIL;
        if (linearLayout != null) {
            ViewGroup.LayoutParams layoutParams2 = linearLayout.getLayoutParams();
            if (layoutParams2 != null && layoutParams2.width > 0) {
                layoutParams2.width = (int) (layoutParams2.width * f);
            }
            int i2 = layoutParams2.height;
            if (i2 > 0) {
                layoutParams2.height = (int) (i2 * f);
            }
            linearLayout.setPaddingRelative((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), 0, (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), 0);
            C786410Ut5.d6(linearLayout, layoutParams2);
        }
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            ViewGroup.LayoutParams layoutParams3 = tuxIconView.getLayoutParams();
            if (layoutParams3 != null && layoutParams3.width > 0) {
                layoutParams3.width = (int) (layoutParams3.width * f);
            }
            int i3 = layoutParams3.height;
            if (i3 > 0) {
                layoutParams3.height = (int) (i3 * f);
            }
            tuxIconView.setIconWidth((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * f));
            tuxIconView.setIconHeight((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * f));
            C275120AqM.LIZ.getClass();
            if (C275120AqM.LIZ()) {
                C0QAW.LIZIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), tuxIconView);
                C0QAW.LIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), tuxIconView);
            }
            C786410Ut5.M6(tuxIconView, layoutParams3);
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
            if (layoutParams4 != null && layoutParams4.width > 0) {
                layoutParams4.width = (int) (layoutParams4.width * f);
            }
            int i4 = layoutParams4.height;
            if (i4 > 0) {
                layoutParams4.height = (int) (i4 * f);
            }
            C275120AqM.LIZ.getClass();
            if (!C275120AqM.LIZ()) {
                tuxTextView.setPaddingRelative(0, 0, (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), 0);
            }
            tuxTextView.setTextSize(0, tuxTextView.getTextSize() * f);
            C786410Ut5.R6(tuxTextView, layoutParams4);
        }
        FrameLayout frameLayout3 = this.LLIZLLLIL;
        if (frameLayout3 != null) {
            ViewGroup.LayoutParams layoutParams5 = frameLayout3.getLayoutParams();
            if (layoutParams5 != null && layoutParams5.width > 0) {
                layoutParams5.width = (int) (layoutParams5.width * f);
            }
            int i5 = layoutParams5.height;
            if (i5 > 0) {
                layoutParams5.height = (int) (i5 * f);
            }
            C275120AqM.LIZ.getClass();
            if (C275120AqM.LIZ()) {
                C0QAW.LIZIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * f), frameLayout3);
                C0QAW.LIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) * f), frameLayout3);
            } else {
                C0QAW.LIZ((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)) * f), frameLayout3);
            }
            C786410Ut5.a6(frameLayout3, layoutParams5);
        }
        TuxIconView tuxIconView2 = this.LLJ;
        if (tuxIconView2 != null) {
            ViewGroup.LayoutParams layoutParams6 = tuxIconView2.getLayoutParams();
            if (layoutParams6 != null && layoutParams6.width > 0) {
                layoutParams6.width = (int) (layoutParams6.width * f);
            }
            int i6 = layoutParams6.height;
            if (i6 > 0) {
                layoutParams6.height = (int) (i6 * f);
            }
            C275120AqM.LIZ.getClass();
            if (!C275120AqM.LIZ()) {
                tuxIconView2.setPaddingRelative((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * f), (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * f), (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * f), (int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)) * f));
            }
            tuxIconView2.setIconWidth((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * f));
            tuxIconView2.setIconHeight((int) (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) * f));
            C786410Ut5.M6(tuxIconView2, layoutParams6);
        }
        C786410Ut5.a9((TuxIconView) view.findViewById(R.id.lea), new ACListenerS145S0100000_10(this, 105));
    }
}
