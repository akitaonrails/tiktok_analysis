package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0cx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1031580cx2 extends C214906198m implements View.OnClickListener {
    public TextView LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public InterfaceC1032100cxs LLILZIL;
    public InterfaceC1031540cwy LLILZLL;

    public ViewOnClickListenerC1031580cx2(Context context) {
        super(context);
        setContentView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.em5, null, false));
        setWidth(-1);
        setHeight(-1);
        setClippingEnabled(false);
        setBackgroundDrawable(new ColorDrawable(0));
        TextView textView = (TextView) getContentView().findViewById(R.id.tiw);
        C786410Ut5.T7(textView, this);
        this.LLILLL = textView;
        TextView textView2 = (TextView) getContentView().findViewById(R.id.tiv);
        C786410Ut5.T7(textView2, this);
        this.LLILZ = textView2;
        View viewFindViewById = getContentView().findViewById(R.id.tit);
        if (viewFindViewById != null) {
            C786410Ut5.I7(this, viewFindViewById);
        }
        this.LL = (TextView) getContentView().findViewById(R.id.tiy);
        this.LLILLJJLI = (TextView) getContentView().findViewById(R.id.tix);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        HashMap<String, Object> customAdExtraDataParams;
        Object hostModel;
        Object hostModel2;
        Object hostModel3;
        if (view != null) {
            int id = view.getId();
            if (id == R.id.tiw) {
                dismiss();
                InterfaceC1032100cxs interfaceC1032100cxs = this.LLILZIL;
                if (interfaceC1032100cxs != null) {
                    interfaceC1032100cxs.resume();
                }
                InterfaceC1031540cwy interfaceC1031540cwy = this.LLILZLL;
                if (interfaceC1031540cwy != null && (hostModel3 = interfaceC1031540cwy.getHostModel()) != null) {
                    interfaceC1031540cwy.trackEvent(new C1031310cwb("draw_ad", "close", "keep_watching", interfaceC1031540cwy.getCustomAdExtraDataParams()), hostModel3);
                    return;
                }
                return;
            }
            if (id == R.id.tit) {
                dismiss();
                InterfaceC1032100cxs interfaceC1032100cxs2 = this.LLILZIL;
                if (interfaceC1032100cxs2 != null) {
                    interfaceC1032100cxs2.resume();
                }
                InterfaceC1031540cwy interfaceC1031540cwy2 = this.LLILZLL;
                if (interfaceC1031540cwy2 == null || (hostModel2 = interfaceC1031540cwy2.getHostModel()) == null) {
                    return;
                }
                interfaceC1031540cwy2.trackEvent(new C1031310cwb("draw_ad", "close", "popup_window", interfaceC1031540cwy2.getCustomAdExtraDataParams()), hostModel2);
                return;
            }
            if (id != R.id.tiv) {
                return;
            }
            InterfaceC1031540cwy interfaceC1031540cwy3 = this.LLILZLL;
            if (interfaceC1031540cwy3 != null) {
                customAdExtraDataParams = interfaceC1031540cwy3.getCustomAdExtraDataParams();
            } else {
                customAdExtraDataParams = null;
            }
            InterfaceC1032100cxs interfaceC1032100cxs3 = this.LLILZIL;
            if (interfaceC1032100cxs3 != null) {
                interfaceC1032100cxs3.taskCompleted(false, customAdExtraDataParams, null);
            }
            InterfaceC1032100cxs interfaceC1032100cxs4 = this.LLILZIL;
            if (interfaceC1032100cxs4 != null) {
                interfaceC1032100cxs4.exit(true);
            }
            InterfaceC1031540cwy interfaceC1031540cwy4 = this.LLILZLL;
            if (interfaceC1031540cwy4 == null || (hostModel = interfaceC1031540cwy4.getHostModel()) == null) {
                return;
            }
            interfaceC1031540cwy4.trackEvent(new C1031310cwb("draw_ad", "close", "back_to_games", interfaceC1031540cwy4.getCustomAdExtraDataParams()), hostModel);
        }
    }
}
