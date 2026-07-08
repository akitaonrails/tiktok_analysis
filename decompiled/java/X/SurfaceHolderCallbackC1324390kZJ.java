package X;

import android.content.Context;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS169S1100000_20;

/* JADX INFO: renamed from: X.0kZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceHolderCallbackC1324390kZJ extends SurfaceView implements SurfaceHolder.Callback {
    public final TextPaint LL;
    public String LLILLJJLI;
    public volatile EnumC1324400kZK LLILLL;
    public boolean LLILZ;

    public final void setText(String str) {
        C0CNO.LIZ(C15O7.LJI, new AwS169S1100000_20(this, str, 1));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str;
        this.LLILLL = EnumC1324400kZK.CREATED;
        if (!this.LLILZ && (str = this.LLILLJJLI) != null) {
            setText(str);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.LLILLL = EnumC1324400kZK.DESTROYED;
    }

    public SurfaceHolderCallbackC1324390kZJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = EnumC1324400kZK.INIT;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        setZOrderOnTop(true);
        holder.addCallback(this);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setTextSize(C679280Qkg.LIZ(12));
        setBackground(context.getDrawable(R.drawable.bki));
        this.LL = textPaint;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LLILLL = EnumC1324400kZK.CHANGED;
    }
}
