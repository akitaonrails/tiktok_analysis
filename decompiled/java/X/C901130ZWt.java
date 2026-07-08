package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.IIMTranslationService;
import com.ss.android.ugc.aweme.IMTranslationData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0ZWt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901130ZWt implements IIMTranslationService {
    public static final C901130ZWt LIZIZ = new C901130ZWt();
    public final /* synthetic */ IIMTranslationService LIZ;

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LIZJ() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LIZLLL() {
        this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJ(View view) {
        this.LIZ.LJ(view);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJFF(C19EG c19eg) {
        this.LIZ.LJFF(c19eg);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final C903380ZcG LJI(String str) {
        return this.LIZ.LJI(str);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJII(View view) {
        this.LIZ.LJII(view);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final IMTranslationData LJIIIIZZ(C869590Y9l c869590Y9l) {
        return this.LIZ.LJIIIIZZ(c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final boolean LJIIIZ() {
        return this.LIZ.LJIIIZ();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIIJ(View view) {
        this.LIZ.LJIIJ(view);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIIJJI(Context context, FragmentManager fragmentManager, C869590Y9l c869590Y9l) {
        this.LIZ.LJIIJJI(context, fragmentManager, c869590Y9l);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final InterfaceC901070ZWn LJIIL() {
        return this.LIZ.LJIIL();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final InterfaceC901080ZWo LJIILIIL(String str) {
        return this.LIZ.LJIILIIL(str);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIILJJIL(String str, InterfaceC901080ZWo interfaceC901080ZWo) {
        this.LIZ.LJIILJJIL(str, interfaceC901080ZWo);
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIILL() {
        this.LIZ.LJIILL();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final boolean LJIILLIIL() {
        return this.LIZ.LJIILLIIL();
    }

    @Override // com.ss.android.ugc.aweme.IIMTranslationService
    public final void LJIIZILJ(String str, C903380ZcG c903380ZcG) {
        this.LIZ.LJIIZILJ(str, c903380ZcG);
    }

    public C901130ZWt() {
        IIMTranslationService iIMTranslationService = (IIMTranslationService) PluggableExtentionKt.pluggableSpiForReal(IIMTranslationService.class);
        this.LIZ = iIMTranslationService == null ? new IIMTranslationService() { // from class: X.0ZWq
            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LIZJ() {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LIZLLL() {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJ(View view) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJFF(C19EG c19eg) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final C903380ZcG LJI(String str) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJII(View view) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final IMTranslationData LJIIIIZZ(C869590Y9l c869590Y9l) {
                return null;
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final boolean LJIIIZ() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJIIJ(View view) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJIIJJI(Context context, FragmentManager fragmentManager, C869590Y9l c869590Y9l) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJIILJJIL(String str, InterfaceC901080ZWo interfaceC901080ZWo) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJIILL() {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final boolean LJIILLIIL() {
                return false;
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final void LJIIZILJ(String str, C903380ZcG c903380ZcG) {
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final InterfaceC901070ZWn LJIIL() {
                return new InterfaceC901070ZWn() { // from class: X.0ZWp
                    @Override // X.InterfaceC901070ZWn
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC901070ZWn
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC901070ZWn
                    public final void LIZJ(EnumC901120ZWs enumC901120ZWs) {
                    }

                    @Override // X.InterfaceC901070ZWn
                    public final void LIZLLL() {
                    }

                    @Override // X.InterfaceC901070ZWn
                    public final void LJ() {
                    }
                };
            }

            @Override // com.ss.android.ugc.aweme.IIMTranslationService
            public final InterfaceC901080ZWo LJIILIIL(String str) {
                return C1760706uz.LIZ;
            }
        } : iIMTranslationService;
    }
}
