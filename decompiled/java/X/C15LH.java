package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: X.15LH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15LH extends AbstractC714000Rza {
    public final Context LLILZIL;
    public final List<C15LI> LLILZLL;
    public View LLIZ;
    public View LLIZLLLIL;
    public CharSequence LLJ;

    @Override // X.AbstractC714000Rza
    public final String LJJIJL() {
        return "";
    }

    @Override // X.AbstractC714000Rza
    public final Fragment LJJIJLIJ(View view) {
        return null;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15LH(Context context) {
        super(context, 2);
        C786410Ut5.ne(context);
        this.LLILZIL = context;
        ArrayList arrayList = new ArrayList();
        this.LLILZLL = arrayList;
        ListProtector.add(arrayList, 0, new C15LI(0, R.layout.baa));
        ListProtector.add(arrayList, 1, new C15LI(1, R.layout.ba_));
    }

    @Override // X.AbstractC714000Rza
    public final int LJJIL(int i) {
        return ((C15LI) ListProtector.get(this.LLILZLL, i)).LIZ;
    }

    @Override // X.AbstractC714000Rza
    public final int LJJIZ(View view) {
        Object tag;
        if (view != null) {
            tag = view.getTag(R.id.vjq);
        } else {
            tag = null;
        }
        if (tag instanceof Integer) {
            return ((Number) tag).intValue();
        }
        return 0;
    }

    @Override // X.AbstractC714000Rza
    public final void LJJJJ(int i, View view) {
        View view2;
        TextView textView;
        if (i == 1 && (view2 = this.LLIZLLLIL) != null && (textView = (TextView) view2.findViewById(R.id.video_slide_ad_hint_text)) != null) {
            textView.setText(this.LLJ);
        }
    }

    @Override // X.AbstractC714000Rza
    public final View LJJJI(int i, View view, ViewGroup viewGroup) {
        int i2 = ((C15LI) ListProtector.get(this.LLILZLL, i)).LIZ;
        int i3 = ((C15LI) ListProtector.get(this.LLILZLL, i)).LIZIZ;
        View view2 = this.LLIZ;
        if (view2 != null && i == 0) {
            this.LLIZ = null;
            view2.setTag(R.id.vjq, Integer.valueOf(i2));
            return view2;
        }
        if (view == null || !Objects.equals(Integer.valueOf(i2), view.getTag(R.id.vjq))) {
            view = C20673215v0.LJ(i3, this.LLILZIL);
        }
        if (i == 1) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.jba);
            if (relativeLayout != null) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                layoutParams.addRule(15);
                layoutParams.removeRule(12);
                C786410Ut5.e6(relativeLayout, layoutParams);
            }
            this.LLIZLLLIL = view;
        }
        view.setTag(R.id.vjq, Integer.valueOf(i2));
        return view;
    }
}
