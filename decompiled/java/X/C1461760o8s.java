package X;

import Y.ACListenerS156S0100000_22;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0o8s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1461760o8s extends FrameLayout {
    public View LL;
    public View LLILLJJLI;
    public C430210Gtv LLILLL;
    public C417010GWt LLILZ;
    public C417010GWt LLILZIL;
    public InterfaceC1461770o8t LLILZLL;
    public C365590EUz LLIZ;

    public final void LIZ() {
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser == null || currentUser.getAvatarThumb() == null) {
            C1324750kZt.LIZIZ(this.LLILLL, 2130971789);
        } else {
            C1324750kZt.LJI(this.LLILLL, currentUser.getAvatarThumb(), (int) C11VU.LIZIZ(49.0f, getContext()), (int) C11VU.LIZIZ(49.0f, getContext()));
        }
        C417010GWt c417010GWt = this.LLILZ;
        if (c417010GWt != null) {
            C1464900oDw c1464900oDw = C1464900oDw.LIZ;
            C19292410dm currentUser2 = C0CHQ.LIZ().getAccountService().getCurrentUser();
            Resources resources = getContext().getResources();
            c1464900oDw.getClass();
            c417010GWt.setText(C1464900oDw.LIZJ(currentUser2, resources));
        }
    }

    public final View getItemView() {
        return this.LL;
    }

    public final void setBackClickListener(InterfaceC1461770o8t interfaceC1461770o8t) {
        this.LLILZLL = interfaceC1461770o8t;
    }

    public final void setItemView(View view) {
        this.LL = view;
    }

    public final void setProgress(float f) {
        C365590EUz c365590EUz = this.LLIZ;
        if (c365590EUz != null) {
            c365590EUz.setProgress(f);
        }
    }

    public C1461760o8s(Context context, AttributeSet attributeSet) {
        View viewFindViewById;
        C430210Gtv c430210Gtv;
        C417010GWt c417010GWt;
        C417010GWt c417010GWt2;
        super(context, attributeSet, 0);
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.d7h, this, false);
        this.LL = viewTd;
        if (viewTd != null) {
            viewFindViewById = viewTd.findViewById(R.id.bn7);
        } else {
            viewFindViewById = null;
        }
        this.LLILLJJLI = viewFindViewById;
        View view = this.LL;
        if (view != null) {
            c430210Gtv = (C430210Gtv) view.findViewById(R.id.user_avatar);
        } else {
            c430210Gtv = null;
        }
        this.LLILLL = c430210Gtv;
        View view2 = this.LL;
        if (view2 != null) {
            c417010GWt = (C417010GWt) view2.findViewById(R.id.tvw_user_nick);
        } else {
            c417010GWt = null;
        }
        this.LLILZ = c417010GWt;
        View view3 = this.LL;
        if (view3 != null) {
            c417010GWt2 = (C417010GWt) view3.findViewById(R.id.tv_title);
        } else {
            c417010GWt2 = null;
        }
        this.LLILZIL = c417010GWt2;
        View view4 = this.LL;
        this.LLIZ = view4 != null ? (C365590EUz) view4.findViewById(R.id.s8q) : null;
        View view5 = this.LLILLJJLI;
        if (view5 != null) {
            C786410Ut5.I7(new ACListenerS156S0100000_22(this, 65), view5);
        }
        addView(this.LL);
    }
}
