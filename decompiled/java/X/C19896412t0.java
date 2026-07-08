package X;

/* JADX INFO: renamed from: X.12t0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19896412t0 extends AbstractC19895312sp {
    public final /* synthetic */ C19896612t2 LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19896412t0(C19896612t2 c19896612t2, final C19896312sz c19896312sz, final CharSequence charSequence) {
        new AbstractC19852612lw<String>(c19896312sz, charSequence) { // from class: X.12sp
            public final CharSequence LLILLL;
            public final AbstractC19895412sq LLILZ;
            public final boolean LLILZIL;
            public int LLILZLL;
            public int LLIZ;

            @Override // X.AbstractC19852612lw
            public final String LIZ() {
                int iLIZIZ;
                int i = this.LLILZLL;
                while (true) {
                    int i2 = this.LLILZLL;
                    if (i2 == -1) {
                        this.LL = EnumC19852712lx.DONE;
                        return null;
                    }
                    C19896412t0 c19896412t0 = (C19896412t0) this;
                    iLIZIZ = c19896412t0.LLIZLLLIL.LIZ.LIZIZ(i2, c19896412t0.LLILLL);
                    if (iLIZIZ == -1) {
                        iLIZIZ = this.LLILLL.length();
                        this.LLILZLL = -1;
                    } else {
                        this.LLILZLL = iLIZIZ + 1;
                    }
                    int i3 = this.LLILZLL;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.LLILZLL = i4;
                        if (i4 > this.LLILLL.length()) {
                            this.LLILZLL = -1;
                        }
                    } else {
                        while (i < iLIZIZ && this.LLILZ.LIZLLL(this.LLILLL.charAt(i))) {
                            i++;
                        }
                        while (iLIZIZ > i) {
                            int i5 = iLIZIZ - 1;
                            if (!this.LLILZ.LIZLLL(this.LLILLL.charAt(i5))) {
                                break;
                            }
                            iLIZIZ = i5;
                        }
                        if (!this.LLILZIL || i != iLIZIZ) {
                            break;
                        }
                        i = this.LLILZLL;
                    }
                }
                int i6 = this.LLIZ;
                if (i6 == 1) {
                    iLIZIZ = this.LLILLL.length();
                    this.LLILZLL = -1;
                    while (iLIZIZ > i) {
                        int i7 = iLIZIZ - 1;
                        if (!this.LLILZ.LIZLLL(this.LLILLL.charAt(i7))) {
                            break;
                        }
                        iLIZIZ = i7;
                    }
                } else {
                    this.LLIZ = i6 - 1;
                }
                return this.LLILLL.subSequence(i, iLIZIZ).toString();
            }

            {
                this.LLILZ = c19896312sz.LIZ;
                this.LLILZIL = c19896312sz.LIZIZ;
                this.LLIZ = c19896312sz.LIZLLL;
                this.LLILLL = charSequence;
            }
        };
        this.LLIZLLLIL = c19896612t2;
    }
}
