package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0KBE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KBE extends C0K07<C515500KJo> {
    public final C16F5 LL;

    public C0KBE(View view) {
        super(view);
        this.LL = (C16F5) view.findViewById(R.id.pfs);
    }

    @Override // X.C0K07
    public final void I5(InterfaceC515600KJy interfaceC515600KJy) {
        ISubPackagePageAbility iSubPackagePageAbility;
        String str;
        C0KCF c0kcf;
        InterfaceC665370Q7z interfaceC665370Q7z = ((AbstractC515480KJm) interfaceC515600KJy).LL;
        if (interfaceC665370Q7z != null && (iSubPackagePageAbility = (ISubPackagePageAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISubPackagePageAbility.class, null)) != null) {
            C513700KCq c513700KCqKu = iSubPackagePageAbility.Ku();
            if (c513700KCqKu == null || (c0kcf = c513700KCqKu.LL) == null || (str = c0kcf.LIZIZ) == null) {
                str = "";
            }
            iSubPackagePageAbility.Io(new C510320Jzq(this, str));
        }
    }
}
