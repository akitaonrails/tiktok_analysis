package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513170KAp extends C0K07<C515470KJl> {
    public final C1324720kZq LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final ConstraintLayout LLILZ;

    public C513170KAp(View view) {
        super(view);
        this.LL = (C1324720kZq) view.findViewById(R.id.bh2);
        this.LLILLJJLI = (C16F5) view.findViewById(R.id.s75);
        this.LLILLL = (C16F5) view.findViewById(R.id.wim);
        this.LLILZ = (ConstraintLayout) view.findViewById(R.id.eqx);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        ISubPackagePageAbility iSubPackagePageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            iSubPackagePageAbility.xa(new C513160KAo(this));
        }
    }

    public static void P5(ConstraintLayout constraintLayout, C16F5 c16f5, C16F5 c16f52) {
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        if (c16f52.getVisibility() == 8) {
            c19mb.LJJIIZ(0.5f, c16f5.getId());
            c19mb.LJJIIJZLJL(c16f5.getId(), 3, 0);
        } else {
            c19mb.LJJIIZ(0.0f, c16f5.getId());
            c19mb.LJJIIJZLJL(c16f5.getId(), 3, (int) C497740JfY.LIZIZ(10.0f));
        }
        c19mb.LIZIZ(constraintLayout);
    }
}
