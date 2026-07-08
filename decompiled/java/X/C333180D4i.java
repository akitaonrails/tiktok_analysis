package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.content.cell.LanguageVM;

/* JADX INFO: renamed from: X.0D4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333180D4i implements ViewModelProvider.Factory {
    public final String LIZ;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
    }

    public C333180D4i(String str) {
        this.LIZ = str;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        if (cls.isAssignableFrom(LanguageVM.class)) {
            return new LanguageVM(this.LIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Custom ViewModel must be a subclass of LifeAwareViewModel. ");
        sbLIZ.append(cls);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
