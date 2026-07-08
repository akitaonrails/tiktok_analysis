package X;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegateImpl;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19GU, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C19GU extends C19EK implements C19WW {
    public AppCompatDelegateImpl LLILZ;
    public final C19GY LLILZIL;

    public C19GU() {
        throw null;
    }

    @Override // X.C19WW
    public final void onSupportActionModeFinished(AbstractC21549319Vb abstractC21549319Vb) {
    }

    @Override // X.C19WW
    public final void onSupportActionModeStarted(AbstractC21549319Vb abstractC21549319Vb) {
    }

    @Override // X.C19WW
    public final AbstractC21549319Vb onWindowStartingSupportActionMode(InterfaceC21549419Vc interfaceC21549419Vc) {
        return null;
    }

    public final C19GT LJJLJ() {
        if (this.LLILZ == null) {
            C19GV c19gv = C19GT.LL;
            this.LLILZ = new AppCompatDelegateImpl(getContext(), getWindow(), this, this);
        }
        return this.LLILZ;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        LJJLJ().LJIILLIIL();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LJJLJ().LJIIL();
    }

    @Override // X.C19EK, android.app.Dialog
    public void onStop() {
        super.onStop();
        LJJLJ().LJIJJLI();
    }

    public final boolean LJJLL(int i) {
        return LJJLJ().LJJ(1);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C20097513kL.LIZIZ(this.LLILZIL, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) LJJLJ().LJFF(i);
    }

    @Override // X.C19EK, android.app.Dialog
    public void onCreate(Bundle bundle) {
        LJJLJ().LJIIJJI();
        super.onCreate(bundle);
        LJJLJ().LJIILL();
    }

    @Override // X.C19EK, android.app.Dialog
    public void setContentView(int i) {
        LJJLIIIJLLLLLLLZ();
        LJJLJ().LJJI(i);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        LJJLJ().LJJIIZI(getContext().getString(i));
    }

    @Override // X.C19EK, android.app.Dialog
    public void setContentView(View view) {
        LJJLIIIJLLLLLLLZ();
        LJJLJ().LJJIFFI(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        LJJLJ().LJJIIZI(charSequence);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.19GY] */
    public C19GU(Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.bo8, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.LLILZIL = new InterfaceC20097613kM() { // from class: X.19GY
            @Override // X.InterfaceC20097613kM
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return C19GU.LJJLJLI(this.LL, keyEvent);
            }
        };
        C19GT c19gtLJJLJ = LJJLJ();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.bo8, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((AppCompatDelegateImpl) c19gtLJJLJ).LLLIILIL = i;
        c19gtLJJLJ.LJIILL();
    }

    public static boolean LJJLJLI(C19GU c19gu, KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // X.C19EK, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJJLIIIJLLLLLLLZ();
        LJJLJ().LIZJ(view, layoutParams);
    }

    @Override // X.C19EK, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LJJLIIIJLLLLLLLZ();
        LJJLJ().LJJII(view, layoutParams);
    }
}
