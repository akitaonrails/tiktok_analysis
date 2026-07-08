package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS17S2000000_18;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0h3r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1189570h3r extends LinearLayout {
    public TuxIconView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public boolean LLILZ;
    public String LLILZIL;

    public final View getEntranceView() {
        return this.LLILLL;
    }

    public final TuxIconView getIconView() {
        return this.LL;
    }

    public final TuxTextView getTitleView() {
        return this.LLILLJJLI;
    }

    public C1189570h3r(Context context) {
        super(context, null, 0);
        LinearLayout.inflate(context, R.layout.e2q, this);
        this.LLILLL = findViewById(R.id.qyh);
        this.LL = (TuxIconView) findViewById(R.id.qyg);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.qyi);
    }

    private final void setLoadResult(SparkContext sparkContext) {
        sparkContext.LJJJJZI(new C1209100hZM(this, 19));
    }

    private final void setLynxListener(SparkContext sparkContext) {
        sparkContext.LJJJJZ(new C1209090hZL(this, 8));
    }

    public final Drawable LIZ(String str) {
        if (str != null) {
            try {
                if (!u.LJJIIJZLJL(str, "tux://icon", false)) {
                    str = null;
                }
                if (str != null) {
                    C01GW c01gw = C2248361CzK.LIZ;
                    C698190Ra5 c698190Ra5LJFF = C2248361CzK.LJFF(getContext(), str);
                    if (c698190Ra5LJFF != null) {
                        C419910GdJ c419910GdJ = new C419910GdJ();
                        c419910GdJ.LIZ = c698190Ra5LJFF.LIZ;
                        c419910GdJ.LIZLLL = c698190Ra5LJFF.LIZIZ;
                        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(24));
                        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
                        C384050F3z c384050F3z = new C384050F3z();
                        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
                        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
                        c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
                        return C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(getContext()));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1205490hTX c1205490hTX = C1205490hTX.LIZ;
                C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
                c1205490hTX.getClass();
                C1205490hTX.LIZLLL(c1emr, "unknown_icon", null, e);
            }
        }
        return null;
    }

    public final void LIZIZ(String str) {
        if (str == null) {
            C1205490hTX c1205490hTX = C1205490hTX.LIZ;
            C1EMR c1emr = C1EMR.POI_DETAIL_CLAIM;
            Throwable th = new Throwable();
            c1205490hTX.getClass();
            C1205490hTX.LIZLLL(c1emr, "lynxurl_is_null", null, th);
            return;
        }
        try {
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(str);
            setLoadResult(sparkContext);
            setLynxListener(sparkContext);
            C1189070h33 c1189070h33 = C1189070h33.LIZ;
            String str2 = this.LLILZIL;
            c1189070h33.getClass();
            c1189070h33.LIZJ("load_lynx", new AwS17S2000000_18(str2, str, 7));
            Context context = getContext();
            if (context != null) {
                C1541950qED.LIZJ.getClass();
                new C1541950qED(context, sparkContext).LIZIZ();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX c1205490hTX2 = C1205490hTX.LIZ;
            C1EMR c1emr2 = C1EMR.POI_DETAIL_CLAIM;
            c1205490hTX2.getClass();
            C1205490hTX.LIZLLL(c1emr2, "load_lynx", null, e);
        }
    }

    public final void setEntranceView(View view) {
        this.LLILLL = view;
    }

    public final void setIconView(TuxIconView tuxIconView) {
        this.LL = tuxIconView;
    }

    public final void setTitleView(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }
}
