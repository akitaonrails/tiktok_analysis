package X;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.List;

/* JADX INFO: renamed from: X.0fA3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1116530fA3 extends RecyclerView.ViewHolder {
    public abstract void I5(C1116450f9v c1116450f9v, List<? extends Object> list);

    public AbstractC1116530fA3(View view) {
        super(view);
    }

    public static final void L5(TextView textView) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getText().length() * textView.getPaint().getTextSize(), 0.0f, ColorProtector.parseColor("#F2EAFD"), ColorProtector.parseColor("#D4FAFF"), Shader.TileMode.CLAMP));
        textView.invalidate();
    }
}
