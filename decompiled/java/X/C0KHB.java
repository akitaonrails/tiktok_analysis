package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KHB, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KHB extends C0K07<C515490KJn> {
    public final C16F5 LL;

    public C0KHB(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.f803t27);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        ISubPackagePageAbility iSubPackagePageAbility;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            iSubPackagePageAbility.Ku();
            iSubPackagePageAbility.Io(new C0KHQ(this));
        }
    }
}
