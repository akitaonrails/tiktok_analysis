package X;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.0H3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C434910H3p extends RecyclerView.ViewHolder {
    public static final int LLILLL;
    public static final int LLILZ;
    public final Context LL;
    public int LLILLJJLI;

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(140));
        LLILLL = iLIZIZ;
        LLILZ = (int) (((double) iLIZIZ) / 0.75d);
    }

    public C434910H3p(Context context) {
        SmartImageView smartImageView = new SmartImageView(context);
        int i = LLILLL;
        int i2 = LLILZ;
        C786410Ut5.G6(smartImageView, new RecyclerView.LayoutParams(i, i2));
        super(smartImageView);
        this.LL = context;
        this.LLILLJJLI = i2;
    }
}
