package X;

import Y.ARunnableS117S0100000_17;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0fNb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1124930fNb implements InterfaceC1125030fNl {
    @Override // X.InterfaceC1125030fNl
    public final void LIZIZ() {
        C823050WQl.LIZIZ().execute(new ARunnableS117S0100000_17(this, 94));
    }

    @Override // X.InterfaceC1125030fNl
    public final void LIZLLL(Exception exc) {
        C20441214yg.LJ("i18n_translation", exc.toString());
        C823050WQl.LIZIZ().execute(new ARunnableS117S0100000_17(this, 93));
    }

    @Override // X.InterfaceC1125030fNl
    public final void LIZ(String str, C1124970fNf c1124970fNf) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                C20441214yg.LJ("i18n_translation", "on db query result, but locale from db is empty");
                throw null;
            }
            C20441214yg.LIZIZ("i18n_translation", "on db query result, but locale is not matched");
            throw null;
        }
        throw null;
    }

    @Override // X.InterfaceC1125030fNl
    public final void LIZJ(String str, Exception exc) {
        C20441214yg.LJ("i18n_translation", exc.toString());
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                C20441214yg.LJ("i18n_translation", "on db query result, but locale from db is empty");
                throw null;
            }
            C20441214yg.LIZIZ("i18n_translation", "on db query result, but locale is not matched");
            throw null;
        }
        throw null;
    }
}
