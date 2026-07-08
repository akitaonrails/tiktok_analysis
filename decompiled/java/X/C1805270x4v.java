package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0x4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1805270x4v {
    public static final /* synthetic */ int LJIIJ = 0;
    public final ViewGroup LIZ;
    public final View LIZIZ;
    public final TextView LIZJ;
    public final TextView LIZLLL;
    public final TextView LJ;
    public final View LJFF;
    public final ImageView LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;

    public C1805270x4v(View view) {
        this.LIZ = (ViewGroup) view.findViewById(R.id.pf2);
        this.LIZIZ = view.findViewById(R.id.pe8);
        this.LIZJ = (TextView) view.findViewById(R.id.pfe);
        this.LIZLLL = (TextView) view.findViewById(R.id.pdu);
        this.LJ = (TextView) view.findViewById(R.id.pf3);
        this.LJFF = view.findViewById(R.id.pdt);
        this.LJI = (ImageView) view.findViewById(R.id.pe0);
    }

    public final boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
        intent.addFlags(268435456);
        intent.addCategory("android.intent.category.BROWSABLE");
        try {
            Context context = this.LIZ.getContext();
            RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
            C1701330uNH.LIZ(intent, context);
            C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYC5pn5y+bK7cEWIK59HslVw9YtZhPuG6UXqEv3yuGe/WwO9Qz59Gvhwpd2HpY4q8=", null));
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static void LIZIZ(TextView textView, String str) {
        if (!TextUtils.isEmpty(str)) {
            textView.setText(str);
            C786410Ut5.LLIL(textView, 0);
        } else {
            C786410Ut5.LLIL(textView, 8);
        }
    }
}
