package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0cxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1032040cxm extends C214906198m implements View.OnClickListener {
    public TextView LL;
    public TextView LLILLJJLI;
    public TextView LLILLL;
    public TextView LLILZ;
    public InterfaceC1032100cxs LLILZIL;
    public InterfaceC1032120cxu LLILZLL;

    public ViewOnClickListenerC1032040cxm(Context context) {
        super(context);
        setContentView(C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ccq, null, false));
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
        TuxIconView tuxIconView = (TuxIconView) getContentView().findViewById(R.id.tit);
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_x_mark;
            tuxIconView.setImageDrawable(c419910GdJ.LIZ(context));
            C786410Ut5.a9(tuxIconView, this);
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
                InterfaceC1032120cxu interfaceC1032120cxu = this.LLILZLL;
                if (interfaceC1032120cxu != null && (hostModel3 = interfaceC1032120cxu.getHostModel()) != null) {
                    interfaceC1032120cxu.trackEvent(new C1031480cws("draw_ad", "close", "keep_watching", interfaceC1032120cxu.getCustomAdExtraDataParams()), hostModel3);
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
                InterfaceC1032120cxu interfaceC1032120cxu2 = this.LLILZLL;
                if (interfaceC1032120cxu2 == null || (hostModel2 = interfaceC1032120cxu2.getHostModel()) == null) {
                    return;
                }
                interfaceC1032120cxu2.trackEvent(new C1031480cws("draw_ad", "close", "popup_window", interfaceC1032120cxu2.getCustomAdExtraDataParams()), hostModel2);
                return;
            }
            if (id != R.id.tiv) {
                return;
            }
            InterfaceC1032120cxu interfaceC1032120cxu3 = this.LLILZLL;
            if (interfaceC1032120cxu3 != null) {
                customAdExtraDataParams = interfaceC1032120cxu3.getCustomAdExtraDataParams();
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
            InterfaceC1032120cxu interfaceC1032120cxu4 = this.LLILZLL;
            if (interfaceC1032120cxu4 == null || (hostModel = interfaceC1032120cxu4.getHostModel()) == null) {
                return;
            }
            interfaceC1032120cxu4.trackEvent(new C1031480cws("draw_ad", "close", "back_to_games", interfaceC1032120cxu4.getCustomAdExtraDataParams()), hostModel);
        }
    }
}
