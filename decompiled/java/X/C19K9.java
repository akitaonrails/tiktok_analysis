package X;

import com.ss.android.ugc.aweme.experiment.ReDexExperimentOpt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19K9, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19K9 extends C09AY implements Function0<C19K7> {
    public C19K9() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C19K7 invoke() {
        int iIntValue = ((Number) AnonymousClass0723.LIZ.getValue()).intValue();
        if (iIntValue == 1) {
            final int iIntValue2 = ((Number) C258260AAe.LIZ.getValue()).intValue();
            return new C19K7(iIntValue2) { // from class: X.19KA
                public final int LLILZ;
                public int LLILZIL;
                public int LLILZLL;
                public boolean LLIZ;
                public int LLIZLLLIL;

                @Override // X.C19K7
                public final void LIZJ() {
                    this.LLILZIL = 0;
                    this.LLILZLL = 0;
                    this.LLIZ = true;
                    this.LLIZLLLIL = 0;
                }

                private final void LIZIZ$redex$base() {
                    if (this.LLILZLL >= this.LLILZIL) {
                        this.LLILZLL = 0;
                    }
                    int i = this.LLILZLL + 1;
                    this.LLILZLL = i;
                    if (this.LLIZLLLIL >= 3600) {
                        this.LLIZLLLIL = 0;
                    }
                    int i2 = this.LLIZLLLIL + 1;
                    this.LLIZLLLIL = i2;
                    if (!this.LLIZ) {
                        if (i2 >= this.LLILZ) {
                            this.LLILZLL = i - 1;
                            this.LLIZLLLIL = 0;
                        }
                        this.LLIZ = true;
                    }
                    for (C19KC c19kc : (ArrayList) this.LLILLJJLI) {
                        if (c19kc.LIZ() <= 0) {
                            c19kc.LIZIZ(0);
                        } else if (this.LLILZLL % c19kc.LIZ() == 0) {
                            c19kc.LIZIZ(0);
                        }
                    }
                }

                private final void LIZIZ$redex$opt() {
                    if (this.LLILZLL >= this.LLILZIL) {
                        this.LLILZLL = 0;
                    }
                    int i = this.LLILZLL + 1;
                    this.LLILZLL = i;
                    if (this.LLIZLLLIL >= 3600) {
                        this.LLIZLLLIL = 0;
                    }
                    int i2 = this.LLIZLLLIL + 1;
                    this.LLIZLLLIL = i2;
                    if (!this.LLIZ) {
                        if (i2 >= this.LLILZ) {
                            this.LLILZLL = i - 1;
                            this.LLIZLLLIL = 0;
                        }
                        this.LLIZ = true;
                    }
                    ArrayList arrayList = (ArrayList) this.LLILLJJLI;
                    int i3 = 0;
                    int size = arrayList.size();
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        C19KC c19kc = (C19KC) obj;
                        if (c19kc.LIZ() <= 0) {
                            c19kc.LIZIZ(0);
                        } else if (this.LLILZLL % c19kc.LIZ() == 0) {
                            c19kc.LIZIZ(0);
                        }
                    }
                }

                @Override // X.C19K7
                public final void LIZLLL() {
                    boolean z = this.LLILZLL % 2 == 0;
                    this.LLIZ = z;
                    if (z) {
                        this.LLIZLLLIL = 0;
                    }
                }

                @Override // X.C19K7
                public final void LIZIZ() {
                    if (ReDexExperimentOpt.getAbTest()) {
                        LIZIZ$redex$opt();
                    } else {
                        LIZIZ$redex$base();
                    }
                }

                {
                    super(true);
                    this.LLILZ = iIntValue2;
                    this.LLIZ = true;
                }

                @Override // X.C19K7
                public final void LIZ(C19KC c19kc) {
                    int iLIZ = c19kc.LIZ();
                    if (iLIZ >= 0 && iLIZ % 2 == 0) {
                        super.LIZ(c19kc);
                        int i = this.LLILZIL;
                        if (i != 0) {
                            int i2 = i;
                            int i3 = iLIZ;
                            while (i3 > 0) {
                                int i4 = i2 % i3;
                                i2 = i3;
                                i3 = i4;
                            }
                            iLIZ = (i * iLIZ) / i2;
                        }
                        this.LLILZIL = iLIZ;
                    }
                }
            };
        }
        if (iIntValue != 2) {
            return null;
        }
        return new C19K7() { // from class: X.19KB
            @Override // X.C19K7
            public final void LIZLLL() {
                Iterator<C19KC> it2 = this.LLILLJJLI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZIZ((r1.LIZ() - 1) * 16);
                }
            }
        };
    }
}
