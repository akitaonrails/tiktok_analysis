package X;

import androidx.lifecycle.MutableLiveData;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.11tY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19645011tY extends C301301Et {
    public static final /* synthetic */ int LJIILL = 0;
    public final String LIZJ;
    public final InterfaceC19321510iT LIZLLL;
    public final Regex LJ = new Regex("^https://[^/]+/.+$");
    public final C0NJD<String> LJFF = new C0NJD<>(null);
    public final MutableLiveData<String> LJI = new MutableLiveData<>(null);
    public final MutableLiveData<Boolean> LJII = new MutableLiveData<>(Boolean.FALSE);
    public final MutableLiveData<EnumC19646311tl> LJIIIIZZ = new MutableLiveData<>(EnumC19646311tl.NONE);
    public final MutableLiveData<EnumC19645311tb> LJIIIZ = new MutableLiveData<>(EnumC19645311tb.NONE);
    public final MutableLiveData<C19646511tn> LJIIJ = new MutableLiveData<>(null);
    public final MutableLiveData<String> LJIIJJI = new MutableLiveData<>(null);
    public final MutableLiveData<EnumC19645411tc> LJIIL = new MutableLiveData<>();
    public C11JF LJIILIIL;
    public C11JF LJIILJJIL;

    @Override // X.C301301Et
    public final void LIZIZ() {
        C11JF c11jf = this.LJIILIIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        C11JF c11jf2 = this.LJIILJJIL;
        if (c11jf2 != null) {
            c11jf2.dispose();
        }
        super.LIZIZ();
    }

    public C19645011tY(String str, C197054127w c197054127w) {
        this.LIZJ = str;
        this.LIZLLL = c197054127w;
    }

    public final void LIZJ(boolean z, EnumC19646311tl enumC19646311tl, EnumC19645311tb enumC19645311tb, C19646511tn c19646511tn) {
        this.LJIIIIZZ.postValue(enumC19646311tl);
        this.LJIIIZ.postValue(enumC19645311tb);
        this.LJII.postValue(Boolean.valueOf(z));
        this.LJIIJ.postValue(c19646511tn);
    }
}
