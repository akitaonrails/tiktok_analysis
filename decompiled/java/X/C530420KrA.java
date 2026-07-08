package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0KrA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530420KrA extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public boolean LL;
    public final Context LLILLJJLI;
    public List<Integer> LLILZ;
    public List<Integer> LLILZIL;
    public boolean LLILZLL;
    public final int LLIZ;
    public C530480KrG LLIZLLLIL;
    public List<MediaModel> LLJILJIL;
    public final C530700Krc LLJILJILJ;
    public final C530070Kqb LLJILLL;
    public final List<MediaModel> LLILLL = new ArrayList();
    public int LLJI = -1;
    public int LLJIJIL = -1;
    public final double LLJ = 1.0d;

    @Override // X.AbstractC21673619ry
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return ((ArrayList) this.LLILLL).size();
    }

    public final void LLLFZ(int i) {
        List<Integer> list = this.LLILZIL;
        if (list == null) {
            this.LLILZIL = new ArrayList();
        } else {
            list.clear();
        }
        List<Integer> list2 = this.LLILZ;
        if (list2 == null) {
            this.LLILZ = new ArrayList();
        } else {
            list2.clear();
        }
        for (int i2 = 0; i2 < i; i2++) {
            this.LLILZ.add(-1);
        }
    }

    public final void LLLII(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int i = layoutParams.width;
            int i2 = this.LLIZ;
            if (i != i2) {
                int i3 = layoutParams.height;
                double d = this.LLJ;
                if (i3 != ((int) (((double) i2) * d))) {
                    layoutParams.width = i2;
                    layoutParams.height = (int) (((double) i2) * d);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Type inference failed for: r2v6, types: [REQUEST, X.0kbR] */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r14, final int r15) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C530420KrA.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewSd = C786410Ut5.Sd(R.layout.dl0, C786410Ut5.ne(this.LLILLJJLI), null);
        C530470KrF c530470KrF = new C530470KrF(viewSd);
        c530470KrF.LL = (C1322110kVd) viewSd.findViewById(R.id.o5h);
        c530470KrF.LLILLJJLI = (TextView) viewSd.findViewById(R.id.video_duration);
        c530470KrF.LLILLL = (TextView) viewSd.findViewById(R.id.kel);
        View viewFindViewById = viewSd.findViewById(R.id.unvalid_cover);
        c530470KrF.LLILZ = viewFindViewById;
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
        c530470KrF.LLILZLL = viewSd.findViewById(R.id.ukn);
        FrameLayout frameLayout = (FrameLayout) viewSd.findViewById(R.id.i6h);
        c530470KrF.LLILZIL = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        layoutParams.height = (int) C12ES.LIZJ(48.0f, c530470KrF.LLILZIL.getContext());
        layoutParams.width = (int) C12ES.LIZJ(48.0f, c530470KrF.LLILZIL.getContext());
        C786410Ut5.a6(c530470KrF.LLILZIL, layoutParams);
        viewSd.setTag(c530470KrF);
        try {
            View view = c530470KrF.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c530470KrF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c530470KrF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C530470KrF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c530470KrF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c530470KrF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C530470KrF.class.getName();
        return c530470KrF;
    }

    public C530420KrA(Context context, C530700Krc c530700Krc, int i) {
        this.LLIZ = 0;
        this.LLILLJJLI = context;
        this.LLJILJILJ = c530700Krc;
        context.getResources().getDimensionPixelOffset(R.dimen.a76);
        this.LLIZ = (C12ES.LJIIJ(context) - ((i - 1) * ((int) C12ES.LIZJ(1.5f, context)))) / i;
        C530070Kqb c530070Kqb = new C530070Kqb(context);
        this.LLJILLL = c530070Kqb;
        c530070Kqb.LIZJ = false;
        c530070Kqb.LIZLLL = "enter_from_multi";
    }

    public static void LLLI(int i, String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C543670LTx c543670LTx = new C543670LTx();
            c543670LTx.LIZ.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
            c543670LTx.LIZ.put("scene_name", "select");
            c543670LTx.LIZ.put("type", str);
            C1637890six.LIZJ("aweme_video_import_duration", jSONObject, c543670LTx.LJ());
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
