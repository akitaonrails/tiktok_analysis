package Y;

import X.C12UA;
import X.C1388580mEq;
import X.C19762412Tu;
import X.C1C7U;

/* JADX INFO: loaded from: classes30.dex */
public class ARunnableS9S0100001_29 implements Runnable {
    public final int $t;
    public float f1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        float f;
        int width;
        ((C19762412Tu) this.l0).LJFF();
        C19762412Tu c19762412Tu = (C19762412Tu) this.l0;
        int i = c19762412Tu.LLILZLL - c19762412Tu.LLILZIL;
        if (C1388580mEq.LIZIZ(c19762412Tu.getContext())) {
            C19762412Tu c19762412Tu2 = (C19762412Tu) this.l0;
            f = c19762412Tu2.LLILLL + (i * (1 - this.f1));
            width = c19762412Tu2.LL.getWidth() / 2;
        } else {
            C19762412Tu c19762412Tu3 = (C19762412Tu) this.l0;
            f = c19762412Tu3.LLILLL + (i * this.f1);
            width = c19762412Tu3.LL.getWidth() / 2;
        }
        ((C19762412Tu) this.l0).LJII((int) (f - width));
    }

    public static final void run$0(ARunnableS9S0100001_29 aRunnableS9S0100001_29) {
        boolean zLIZ;
        C1C7U.LIZ("AudioRecordSeekBar@e876.seekTo$1");
        try {
            aRunnableS9S0100001_29.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AudioRecordSeekBar@e876.seekTo$1");
    }

    public static final void run$1(ARunnableS9S0100001_29 aRunnableS9S0100001_29) {
        boolean zLIZ;
        C1C7U.LIZ("FTCAudioRecordSeekBar@b020.seekTo$1");
        try {
            ((C12UA) aRunnableS9S0100001_29.l0).LIZ();
            C12UA c12ua = (C12UA) aRunnableS9S0100001_29.l0;
            ((C12UA) aRunnableS9S0100001_29.l0).LIZJ((int) ((c12ua.LLILLL + ((c12ua.LLILZLL - c12ua.LLILZIL) * aRunnableS9S0100001_29.f1)) - (c12ua.LL.getWidth() / 2)));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("FTCAudioRecordSeekBar@b020.seekTo$1");
    }

    public ARunnableS9S0100001_29(Object obj, float f, int i) {
        this.$t = i;
        this.l0 = obj;
        this.f1 = f;
    }
}
