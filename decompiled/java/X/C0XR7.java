package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0XR7, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XR7 extends DialogC19728412Gs implements View.OnClickListener {
    public TextView LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public String LLIZ;
    public String LLIZLLLIL;
    public View.OnClickListener LLJ;
    public View.OnClickListener LLJI;

    @Override // android.app.Dialog
    public final void onStart() throws Throwable {
        super.onStart();
        Window window = getWindow();
        if (window == null) {
            dismiss();
            C785410UrT.LIZ(this);
            return;
        }
        window.setBackgroundDrawableResource(R.color.a1d);
        window.getDecorView().setBackgroundResource(R.color.a1d);
        WindowManager windowManager = window.getWindowManager();
        window.clearFlags(2);
        Display displayLLILZIL = C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEgAjS8/YVFkiQFyNY/5YtmpO5Tb/ePGxJ+UXBPJeRFBcsF75zoL/Y2DiA6P3psX4RCGql0c90Fp/bjrySgsuaw==", null));
        WindowManager.LayoutParams attributes = window.getAttributes();
        Point point = new Point();
        displayLLILZIL.getSize(point);
        attributes.width = (int) (((double) point.x) * 0.7d);
        window.setAttributes(attributes);
        this.LL = (TextView) findViewById(R.id.zxa);
        this.LLILLL = (TextView) findViewById(R.id.zbp);
        this.LLILLJJLI = (TextView) findViewById(R.id.zex);
        this.LLILZ = (TextView) findViewById(R.id.tv_title);
        if (!TextUtils.isEmpty(this.LLILZIL)) {
            this.LL.setText(this.LLILZIL);
        }
        if (!TextUtils.isEmpty(this.LLIZ)) {
            this.LLILLL.setText(this.LLIZ);
        }
        if (!TextUtils.isEmpty(this.LLILZLL)) {
            this.LLILLJJLI.setText(this.LLILZLL);
        }
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            this.LLILZ.setText(this.LLIZLLLIL);
        }
        C786410Ut5.T7(this.LLILLJJLI, this);
        C786410Ut5.T7(this.LLILLL, this);
    }

    public C0XR7(Context context) {
        super(context, R.style.ale);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View.OnClickListener onClickListener;
        int id = view.getId();
        if (id == R.id.zex) {
            View.OnClickListener onClickListener2 = this.LLJI;
            if (onClickListener2 != null) {
                onClickListener2.onClick(view);
                return;
            }
            return;
        }
        if (id != R.id.zbp || (onClickListener = this.LLJ) == null) {
            return;
        }
        onClickListener.onClick(view);
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.d2u);
    }
}
