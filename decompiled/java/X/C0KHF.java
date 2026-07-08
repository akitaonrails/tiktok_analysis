package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KHF, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHF extends C0K07<C515520KJq> {
    public final C16F5 LL;

    public C0KHF(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.pi8);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        ISubPackagePageAbility iSubPackagePageAbility = null;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            iSubPackagePageAbility.Ku();
        }
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            C500260Jjc.LJIILIIL(c16f5);
        }
        if (iSubPackagePageAbility != null) {
            iSubPackagePageAbility.Io(new C0KHJ(this));
        }
    }
}
