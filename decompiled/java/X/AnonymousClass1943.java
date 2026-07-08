package X;

import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.jvm.internal.AwS82S1000000_32;

/* JADX INFO: renamed from: X.1943, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class AnonymousClass1943 extends C193N<InterfaceC855280Xgs, C190Z, C19224710Iz> implements InterfaceC855280Xgs {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;
    public final Function0<C190Z> LLJ;
    public final C19224710Iz LLJI;
    public final InterfaceC1738600vLO LLJIJIL;
    public final C10J3 LLJILJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(AnonymousClass1943.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(AnonymousClass1943.class, "fragmentActivity", "getFragmentActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJILLL = 8;
    }

    public final boolean K4() {
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi$default(IAVPublishPageUIRefactorService.class, false, false, false, 14, null);
        if (iAVPublishPageUIRefactorService == null) {
            return false;
        }
        C0CHQ.LIZ().getRegionService().getClass();
        return C2222691Bz1.LJIIIZ() && iAVPublishPageUIRefactorService.disableShareShow();
    }

    public final C19EG P4() {
        return (C19EG) this.LLIZLLLIL.getValue(this, LLJILJILJ[1]);
    }

    public final VideoPublishEditModel T4() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJILJILJ[0]);
    }

    @Override // X.C193N, X.C193O
    public void Q3() {
        if (C859340XnQ.LIZJ(T4()) && !K4() && C1447960nmc.LIZ(T4())) {
            i3(AFwS278S0000000_32.get$arr$(86));
        }
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_save_local_after_moderation", true, false)) {
            i3(AFwS278S0000000_32.get$arr$(87));
        }
    }

    public final void Z4() {
        final boolean z = !T2().LJII;
        final C19EG c19egP4 = P4();
        final VideoPublishEditModel videoPublishEditModelT4 = T4();
        final AwS646S0100000_32 awS646S0100000_32 = new AwS646S0100000_32(this, 13);
        if (Build.VERSION.SDK_INT >= 29 || !z) {
            C861770XrL.LIZ(videoPublishEditModelT4, "CheckDownload", z ? 1 : 0, z, awS646S0100000_32);
            return;
        }
        awS646S0100000_32.invoke(Boolean.FALSE, Boolean.valueOf(!z));
        C540290LGx c540290LGx = C540290LGx.LIZ;
        final int i = z ? 1 : 0;
        C540290LGx.LJI(c540290LGx, c19egP4, new C0LH5(c19egP4, videoPublishEditModelT4, i, z, awS646S0100000_32) { // from class: X.0XrM
            public final /* synthetic */ VideoPublishEditModel LIZ;
            public final /* synthetic */ String LIZIZ = "CheckDownload";
            public final /* synthetic */ int LIZJ;
            public final /* synthetic */ boolean LIZLLL;
            public final /* synthetic */ Function2<Boolean, Boolean, Unit> LJ;

            @Override // X.C0LH5
            public final void LIZ(int[] iArr, String[] strArr) {
                C861770XrL.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
            }

            {
                this.LIZ = videoPublishEditModelT4;
                this.LIZJ = i;
                this.LIZLLL = z;
                this.LJ = awS646S0100000_32;
            }
        }, null, null, null, TokenCert.Companion.with("bpea-tools_request_storage_permission_save_local"), 28);
    }

    @Override // X.InterfaceC855280Xgs
    public boolean isChecked() {
        return T2().LJII;
    }

    @Override // X.C193N, X.C193O
    public /* bridge */ /* synthetic */ Object B3() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O
    public InterfaceC1738600vLO E3() {
        return this.LLJIJIL;
    }

    @Override // X.C193N
    public C10J3 H4() {
        return this.LLJILJIL;
    }

    public C19224710Iz O4() {
        return this.LLJI;
    }

    @Override // X.C193N, X.C193O, X.AbstractC1664470tPp
    public Function0<C190Z> o2() {
        return this.LLJ;
    }

    public AnonymousClass1943(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), C19EG.class, null);
        this.LLJ = new AwS576S0100000_32(this, 311);
        this.LLJI = new C19224710Iz(null, new AwS576S0100000_32(this, 310), null, null, 13);
        this.LLJIJIL = EnumC214771193h.SAVE_TO_LOCAL;
        this.LLJILJIL = new AnonymousClass1936(AFwS223S0000000_32.get$arr$(97));
    }

    @Override // X.InterfaceC855280Xgs
    public void Ro2(boolean z) {
        i3(new AwS44S0010000_32(z, 11));
    }

    @Override // X.InterfaceC855280Xgs
    public void eI(String str) {
        i3(new AwS82S1000000_32(str, 6));
    }
}
