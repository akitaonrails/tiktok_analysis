package X;

import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.06c1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnClickListenerC1643106c1 implements View.OnClickListener {
    public static final ViewOnClickListenerC1643106c1 LLIZ = new ViewOnClickListenerC1643106c1();
    public TuxSheet LL;
    public C1841350y17 LLILLJJLI;
    public C1841350y17 LLILLL;
    public C1841350y17 LLILZ;
    public InterfaceC1642506bv LLILZIL;
    public EnumC1643006c0 LLILZLL = EnumC1643006c0.EVERY_ONE;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            if (numValueOf.intValue() == R.id.heu) {
                this.LLILZLL = EnumC1643006c0.EVERY_ONE;
            } else if (numValueOf.intValue() == R.id.imc) {
                this.LLILZLL = EnumC1643006c0.FRIENDS;
            } else if (numValueOf.intValue() == R.id.pa0) {
                this.LLILZLL = EnumC1643006c0.NO_ONE;
            }
        }
        TuxSheet tuxSheet = this.LL;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }
}
