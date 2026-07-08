package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aicontent.AlbumAiContentServiceImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581090Mqh implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
        }
    }

    public static final void run$0(C581090Mqh c581090Mqh) {
        C11JF c11jf;
        C11JF c11jf2 = ((C0MPB) c581090Mqh.l0).LIZLLL;
        if (c11jf2 != null && !c11jf2.isDisposed() && (c11jf = ((C0MPB) c581090Mqh.l0).LIZLLL) != null) {
            c11jf.dispose();
        }
    }

    public static final void run$1(C581090Mqh c581090Mqh) {
        ((AlbumAiContentServiceImpl) c581090Mqh.l0).LJI = false;
    }

    public static final void run$2(C581090Mqh c581090Mqh) {
        ((Function0) c581090Mqh.l0).invoke();
    }

    public static final void run$3(C581090Mqh c581090Mqh) {
        C201955140j.LIZLLL(C552700Lm0.LIZIZ, "AiAliveCRR", "disposed");
        C09AE c09ae = (C09AE) ((C259800zU) c581090Mqh.l0).element;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((C259800zU) c581090Mqh.l0).element = null;
    }

    public static final void run$4(C581090Mqh c581090Mqh) {
        C201955140j.LIZLLL(C552700Lm0.LIZIZ, "AiEffectCRR", "disposed");
        C09AE c09ae = (C09AE) ((C259800zU) c581090Mqh.l0).element;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        ((C259800zU) c581090Mqh.l0).element = null;
    }

    public static final void run$5(C581090Mqh c581090Mqh) {
        C535770Kzn.LIZIZ((C259800zU) c581090Mqh.l0);
    }

    public static final void run$6(C581090Mqh c581090Mqh) {
        C535780Kzo.LIZIZ((C259800zU) c581090Mqh.l0);
    }

    public static final void run$7(C581090Mqh c581090Mqh) {
        C535790Kzp.LIZIZ((C259800zU) c581090Mqh.l0);
    }

    public C581090Mqh(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
