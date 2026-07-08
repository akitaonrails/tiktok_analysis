package X;

import Y.ACListenerS152S0100000_17;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.FeedBanner;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ehv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1099090ehv {
    public final C1324720kZq LIZ;
    public final TextView LIZIZ;
    public final TextView LIZJ;
    public final Context LIZLLL;
    public FeedBanner LJ;
    public final String LJFF;
    public final int LJI;
    public int LJII;
    public final View LJIIIIZZ;

    public C1099090ehv(int i, Context context, View view, String str) {
        C1324720kZq c1324720kZq = (C1324720kZq) view.findViewById(R.id.kb6);
        this.LIZ = c1324720kZq;
        this.LIZIZ = (TextView) view.findViewById(R.id.text);
        this.LIZJ = (TextView) view.findViewById(R.id.m44);
        C786410Ut5.e8(c1324720kZq, new ACListenerS152S0100000_17(this, 121));
        this.LIZLLL = context;
        this.LJFF = str;
        this.LJI = i;
        this.LJIIIIZZ = view;
    }
}
