package X;

import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.inputbox.BulletinFullScreenGamePlayAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P4G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4G implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0P4G(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }

    public static final void onLayoutChange$0(C0P4G c0p4g, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Throwable {
        int paddingLeft;
        CharSequence charSequence;
        if (!((BulletinEditAssem) c0p4g.l0).LLJJLIIIJLLLLLLLZ && (paddingLeft = ((i3 - i) - ((EditText) c0p4g.l1).getPaddingLeft()) - ((EditText) c0p4g.l1).getPaddingRight()) > 0) {
            BulletinEditAssem bulletinEditAssem = (BulletinEditAssem) c0p4g.l0;
            if (paddingLeft != bulletinEditAssem.LLJJL) {
                bulletinEditAssem.LLJJL = paddingLeft;
                TextPaint paint = ((EditText) c0p4g.l1).getPaint();
                if (paint == null || (charSequence = ((BulletinEditAssem) c0p4g.l0).LLJJJJJIL) == null) {
                    return;
                }
                Editable editableLLJILLL = C2204961BRm.LLJILLL((EditText) c0p4g.l1, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOmYZDWkjC89rEkgiUU1lvKYawI06Q5BzgbIIEL5v5x2gsxGrDc", null));
                if (editableLLJILLL == null || editableLLJILLL.length() == 0) {
                    ((EditText) c0p4g.l1).setHint(TextUtils.ellipsize(charSequence, paint, paddingLeft, TextUtils.TruncateAt.END));
                }
            }
        }
    }

    public static final void onLayoutChange$1(C0P4G c0p4g, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        FrameLayout.LayoutParams layoutParams;
        View viewFindViewById = ((View) c0p4g.l0).findViewById(R.id.xs_res_0x7f0a0051);
        if (viewFindViewById != null) {
            height = viewFindViewById.getHeight();
        } else {
            height = 0;
        }
        int i9 = (i4 - i2) - height;
        ViewGroup.LayoutParams layoutParams2 = ((BulletinFullScreenGamePlayAssem) c0p4g.l1).LJJIJL().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null && layoutParams.bottomMargin != i9) {
            layoutParams.bottomMargin = i9;
            C786410Ut5.W5(((BulletinFullScreenGamePlayAssem) c0p4g.l1).LJJIJL(), layoutParams);
        }
    }

    public static final void onLayoutChange$2(C0P4G c0p4g, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c0p4g.l0).removeOnLayoutChangeListener(c0p4g);
        ((Function0) c0p4g.l1).invoke();
    }

    public static final void onLayoutChange$3(C0P4G c0p4g, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c0p4g.l0).removeOnLayoutChangeListener(c0p4g);
        ((Function0) c0p4g.l1).invoke();
        ((View) c0p4g.l0).setTag(R.id.f699eha, null);
    }

    public static final void onLayoutChange$4(C0P4G c0p4g, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((View) c0p4g.l0).removeOnLayoutChangeListener(c0p4g);
        ((Function0) c0p4g.l1).invoke();
        ((View) c0p4g.l0).setTag(R.id.f699eha, null);
    }
}
