package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS586S0100000_7;

/* JADX INFO: renamed from: X.0KAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513140KAm extends AbstractC339560DSw<C514530KFv> {
    public final C417410GYh LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public final ConstraintLayout LLILZ;

    public C513140KAm(View view) {
        super(view);
        this.LL = (C417410GYh) view.findViewById(R.id.bh2);
        this.LLILLJJLI = (TextView) view.findViewById(R.id.s75);
        this.LLILLL = (TextView) view.findViewById(R.id.wim);
        this.LLILZ = (ConstraintLayout) view.findViewById(R.id.b1t);
    }

    @Override // X.AbstractC339560DSw
    public final void I5(InterfaceC339570DSx interfaceC339570DSx) {
        ISubPackagePageAbility iSubPackagePageAbility;
        C0KC4 c0kc4Ku;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC514430KFl) interfaceC339570DSx).LIZ;
        EnumC513400KBm enumC513400KBm = null;
        if (interfaceC665370Q7z != null) {
            iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null);
            if (iSubPackagePageAbility != null && (c0kc4Ku = iSubPackagePageAbility.Ku()) != null) {
                enumC513400KBm = c0kc4Ku.LLIZLLLIL;
            }
        } else {
            iSubPackagePageAbility = null;
        }
        if (enumC513400KBm == EnumC513400KBm.PACKAGE_PAGE) {
            ConstraintLayout constraintLayout = this.LLILZ;
            if (constraintLayout != null) {
                C0K0R.LIZ(constraintLayout);
                return;
            }
            return;
        }
        if (iSubPackagePageAbility == null) {
            return;
        }
        iSubPackagePageAbility.xa(new AwS586S0100000_7(this, 478));
    }

    public static void N5(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        if (textView2.getVisibility() == 8) {
            c19mb.LJJIIZ(0.5f, textView.getId());
            c19mb.LJJIIJZLJL(textView.getId(), 3, 0);
        } else {
            c19mb.LJJIIZ(0.0f, textView.getId());
            c19mb.LJJIIJZLJL(textView.getId(), 3, (int) C511520K4g.LIZ(10.0f));
        }
        c19mb.LIZIZ(constraintLayout);
    }
}
