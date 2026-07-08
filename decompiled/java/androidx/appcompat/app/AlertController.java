package androidx.appcompat.app;

import X.C19GU;
import X.C19MK;
import X.C21578619ce;
import X.C786410Ut5;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.ACListenerS167S0100000_33;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes34.dex */
public final class AlertController {
    public final Context LIZ;
    public final C19GU LIZIZ;
    public final Window LIZJ;
    public final int LIZLLL;
    public CharSequence LJ;
    public CharSequence LJFF;
    public C19MK LJI;
    public View LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public Button LJIIJ;
    public CharSequence LJIIJJI;
    public Message LJIIL;
    public Drawable LJIILIIL;
    public Button LJIILJJIL;
    public CharSequence LJIILL;
    public Message LJIILLIIL;
    public Drawable LJIIZILJ;
    public Button LJIJ;
    public CharSequence LJIJI;
    public Message LJIJJ;
    public Drawable LJIJJLI;
    public C21578619ce LJIL;
    public int LJJ;
    public Drawable LJJI;
    public ImageView LJJIFFI;
    public TextView LJJII;
    public TextView LJJIII;
    public View LJJIIJ;
    public ListAdapter LJJIIJZLJL;
    public final int LJJIIZI;
    public final int LJJIJ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final boolean LJJIJL;
    public final Handler LJJIJLIJ;
    public int LJJIIZ = -1;
    public final ACListenerS167S0100000_33 LJJIL = new ACListenerS167S0100000_33(this, 0);

    public static final class ButtonHandler extends Handler {
        public final WeakReference<DialogInterface> LIZ;

        public ButtonHandler(DialogInterface dialogInterface) {
            this.LIZ = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != -3 && i != -2 && i != -1) {
                if (i == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.LIZ.get(), message.what);
        }
    }

    public static boolean LIZ(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (LIZ(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void LIZIZ(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(button);
        button.setLayoutParams(layoutParams);
    }

    public static ViewGroup LIZJ(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = C786410Ut5.LJLLLL((ViewStub) view2);
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                C786410Ut5.LJJJLZIJ(view2, (ViewGroup) parent);
            }
        }
        if (view instanceof ViewStub) {
            view = C786410Ut5.LJLLLL((ViewStub) view);
        }
        return (ViewGroup) view;
    }

    public AlertController(Context context, C19GU c19gu, Window window) {
        this.LIZ = context;
        this.LIZIZ = c19gu;
        this.LIZJ = window;
        this.LJJIJLIJ = new ButtonHandler(c19gu);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.AlertDialog, R.attr.b9f, 0);
        this.LJJIIZI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        this.LJJIJ = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.LJJIJIIJI = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.LJJIJIIJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.LJJIJIL = typedArrayObtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.LJJIJL = typedArrayObtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        this.LIZLLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        typedArrayObtainStyledAttributes.recycle();
        c19gu.LJJLL(1);
    }

    public final void LIZLLL(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage;
        if (onClickListener != null) {
            messageObtainMessage = this.LJJIJLIJ.obtainMessage(i, onClickListener);
        } else {
            messageObtainMessage = null;
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.LJIIJJI = charSequence;
                    this.LJIIL = messageObtainMessage;
                    this.LJIILIIL = null;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.LJIILL = charSequence;
            this.LJIILLIIL = messageObtainMessage;
            this.LJIIZILJ = null;
            return;
        }
        this.LJIJI = charSequence;
        this.LJIJJ = messageObtainMessage;
        this.LJIJJLI = null;
    }
}
