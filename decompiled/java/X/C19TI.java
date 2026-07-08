package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19TI, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19TI implements C19TE {
    public final /* synthetic */ C19TJ LIZ;

    public C19TI(C19TJ c19tj) {
        this.LIZ = c19tj;
    }

    @Override // X.C19TE
    public final void LIZ(C21543419Su c21543419Su) {
        EditText editText = c21543419Su.getEditText();
        if (editText instanceof AutoCompleteTextView) {
            final AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            C19TJ c19tj = this.LIZ;
            int boxBackgroundMode = c19tj.LIZ.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c19tj.LJIIL);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(c19tj.LJIIJJI);
            }
            C19TJ c19tj2 = this.LIZ;
            c19tj2.getClass();
            if (autoCompleteTextView.getKeyListener() == null) {
                int boxBackgroundMode2 = c19tj2.LIZ.getBoxBackgroundMode();
                C21538919Rb boxBackground = c19tj2.LIZ.getBoxBackground();
                int iLIZIZ = C19PM.LIZIZ(R.attr.big, autoCompleteTextView);
                int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[0]};
                if (boxBackgroundMode2 == 2) {
                    int iLIZIZ2 = C19PM.LIZIZ(R.attr.bix, autoCompleteTextView);
                    C21538919Rb c21538919Rb = new C21538919Rb(boxBackground.LL.LIZ);
                    int iLIZJ = C19PM.LIZJ(0.1f, iLIZIZ, iLIZIZ2);
                    c21538919Rb.LJIIJJI(new ColorStateList(iArr, new int[]{iLIZJ, 0}));
                    c21538919Rb.setTint(iLIZIZ2);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iLIZJ, iLIZIZ2});
                    C21538919Rb c21538919Rb2 = new C21538919Rb(boxBackground.LL.LIZ);
                    c21538919Rb2.setTint(-1);
                    autoCompleteTextView.setBackground(new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c21538919Rb, c21538919Rb2), boxBackground}));
                } else if (boxBackgroundMode2 == 1) {
                    int boxBackgroundColor = c19tj2.LIZ.getBoxBackgroundColor();
                    autoCompleteTextView.setBackground(new RippleDrawable(new ColorStateList(iArr, new int[]{C19PM.LIZJ(0.1f, iLIZIZ, boxBackgroundColor), boxBackgroundColor}), boxBackground, boxBackground));
                }
            }
            final C19TJ c19tj3 = this.LIZ;
            c19tj3.getClass();
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: X.19Tc
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C19TJ c19tj4 = c19tj3;
                        c19tj4.getClass();
                        long jCurrentTimeMillis = System.currentTimeMillis() - c19tj4.LJIIJ;
                        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                            c19tj3.LJIIIIZZ = false;
                        }
                        c19tj3.LJFF(autoCompleteTextView);
                    }
                    return false;
                }
            });
            autoCompleteTextView.setOnFocusChangeListener(c19tj3.LJ);
            autoCompleteTextView.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: X.19Ti
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C19TJ c19tj4 = c19tj3;
                    c19tj4.LJIIIIZZ = true;
                    c19tj4.LJIIJ = System.currentTimeMillis();
                    c19tj3.LJ(false);
                }
            });
            autoCompleteTextView.setThreshold(0);
            autoCompleteTextView.removeTextChangedListener(this.LIZ.LIZLLL);
            autoCompleteTextView.addTextChangedListener(this.LIZ.LIZLLL);
            c21543419Su.setEndIconCheckable(true);
            c21543419Su.setErrorIconDrawable((Drawable) null);
            if (autoCompleteTextView.getKeyListener() == null) {
                this.LIZ.LIZJ.setImportantForAccessibility(2);
            }
            c21543419Su.setTextInputAccessibilityDelegate(this.LIZ.LJFF);
            c21543419Su.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }
}
