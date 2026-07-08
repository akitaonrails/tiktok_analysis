package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0xuG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1837100xuG extends AbstractC1837350xuf {
    public final C518080KTm LLILZIL;
    public final EnumC1837330xud LLILZLL;

    public final int getDetailCode() {
        return this.LLILZIL.LIZJ;
    }

    @Override // X.AbstractC1837200xuQ
    public int getErrorCode() {
        return this.LLILZIL.LIZIZ;
    }

    public final C518080KTm getResult() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC1837210xuR
    public EnumC1837330xud getStage() {
        return this.LLILZLL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1837100xuG(C518080KTm c518080KTm, String str) {
        String str2 = c518080KTm.LJFF;
        super((!(a0.LJJJIL(str2) ^ true) || str2 == null) ? "iap pay error" : str2, str, null);
        this.LLILZIL = c518080KTm;
        this.LLILZLL = EnumC1837330xud.GP_PAYMENT;
    }
}
