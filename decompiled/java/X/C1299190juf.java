package X;

import Y.ARunnableS89S0200000_20;
import android.text.TextUtils;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.NativeFacade;
import j27.s;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0juf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1299190juf extends AbstractC1299910jvp<String> {
    public final WeakReference<NativeFacade> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ NativeFacade LIZJ;

    @Override // X.AbstractC1299910jvp
    public final void LIZ(C1299210juh<String> c1299210juh) {
        if (!C1289620jfE.LIZIZ()) {
            C1289620jfE.LIZJ(new ARunnableS89S0200000_20(this, c1299210juh, 39));
        } else {
            LIZIZ(c1299210juh);
        }
    }

    public final void LIZIZ(C1299210juh<String> c1299210juh) {
        s sVar;
        NativeFacade nativeFacade = this.LIZ.get();
        if (nativeFacade != null) {
            if (TextUtils.isEmpty(c1299210juh.LIZJ) && (sVar = nativeFacade.LJFF.get()) != null) {
                sVar.LJJIFFI(this.LIZIZ, "I18nResource", new LynxError(30400, "empty i18n resource return"));
                nativeFacade.LIZ.LJI(-1, this.LIZIZ, "");
            } else {
                nativeFacade.LIZ.LJI(c1299210juh.LIZIZ, this.LIZIZ, c1299210juh.LIZJ);
            }
        }
    }

    public C1299190juf(NativeFacade nativeFacade, String str) {
        this.LIZJ = nativeFacade;
        this.LIZIZ = str;
        this.LIZ = new WeakReference<>(this.LIZJ);
    }
}
