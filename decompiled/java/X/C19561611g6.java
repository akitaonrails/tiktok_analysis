package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11g6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public class C19561611g6 extends C19YA {
    public InterfaceC19561911g9 LL;
    public int LLILLJJLI;
    public int LLILLL;

    @Override // X.C19YA
    public final void addOnTabSelectedListener(InterfaceC19561911g9 interfaceC19561911g9) {
        this.LL = interfaceC19561911g9;
    }

    public C19561611g6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C19561611g6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = context.getResources().getColor(R.color.a0u);
        this.LLILLL = context.getResources().getColor(R.color.a0v);
        setOverScrollMode(2);
        setTabTextColors(this.LLILLL, this.LLILLJJLI);
        setSelectedTabIndicatorColor(this.LLILLJJLI);
        setTabMargin(14);
        super.addOnTabSelectedListener(new InterfaceC19561911g9() { // from class: X.11g8
            @Override // X.InterfaceC19561911g9
            public final void LIZ(C12H3 c12h3) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZ(c12h3);
                }
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZIZ(C12H3 c12h3) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZIZ(c12h3);
                }
            }

            @Override // X.InterfaceC19561911g9
            public final void LIZJ(C12H3 c12h3, boolean z) {
                InterfaceC19561911g9 interfaceC19561911g9 = this.LIZ.LL;
                if (interfaceC19561911g9 != null) {
                    interfaceC19561911g9.LIZJ(c12h3, z);
                }
            }
        });
    }
}
