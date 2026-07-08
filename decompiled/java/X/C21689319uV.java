package X;

import Y.AsS58S0100000_33;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.19uV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21689319uV extends RecyclerView {
    public JSONObject LL;
    public boolean LLILLJJLI;
    public long LLILLL;
    public long LLILZ;
    public long LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public long LLJ;
    public String LLJI;

    public C21689319uV(Context context) {
        super(context);
        this.LLILLL = -1L;
        this.LLJ = Long.MIN_VALUE;
        this.LLJI = "unKnown";
        if (C2213981Bky.LIZIZ.isDebug()) {
            this.LL = new JSONObject();
            addOnScrollListener(new AsS58S0100000_33(this, 7));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (C2213981Bky.LIZIZ.isDebug() && this.LLILLJJLI) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.LLILLL;
            if (j == -1) {
                this.LLILLL = jCurrentTimeMillis;
                return;
            }
            long j2 = jCurrentTimeMillis - j;
            if (j2 > this.LLJ) {
                this.LLJ = j2;
            }
            if (j2 > 64) {
                this.LLIZLLLIL++;
            } else if (j2 > 32) {
                this.LLIZ++;
            } else if (j2 > 16) {
                this.LLILZLL++;
            }
            this.LLILZ += j2;
            this.LLILZIL++;
            this.LLILLL = jCurrentTimeMillis;
        }
    }

    public void setLabel(String str) {
        this.LLJI = str;
    }

    public C21689319uV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLILLL = -1L;
        this.LLJ = Long.MIN_VALUE;
        this.LLJI = "unKnown";
        if (C2213981Bky.LIZIZ.isDebug()) {
            this.LL = new JSONObject();
            addOnScrollListener(new AsS58S0100000_33(this, 7));
        }
    }
}
