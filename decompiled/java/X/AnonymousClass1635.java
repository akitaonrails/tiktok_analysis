package X;

import X.C163Z;
import X.C164G;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1635, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AnonymousClass1635<USECASE extends C163Z<? extends C163A<Aweme, ? extends C164B, ? extends AbstractC1361510lXB<Aweme, ? extends C164B>>>, DATA extends C164G> extends AnonymousClass1637<Aweme, USECASE, DATA, C0S5P> {
    public Aweme LJII;
    public String LJIIIIZZ;
    public C162M LJIIIZ;

    public InterfaceC585880MyQ LJI() {
        return null;
    }

    public final C162M LJII(String str) {
        if (str == null) {
            return null;
        }
        if (!Intrinsics.LJFF(this.LJIIIIZZ, str) || this.LJIIIZ == null) {
            this.LJIIIIZZ = str;
            this.LJIIIZ = C161N.LIZIZ.LJLJJI(EnumC634640Ous.FEED, str);
        }
        return this.LJIIIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void LJIIIIZZ(String str) {
        C162M c162mLJII;
        if (LIZLLL() && C0SKF.LIZLLL(str)) {
            Aweme aweme = (Aweme) this.LIZLLL;
            InterfaceC585880MyQ interfaceC585880MyQLJI = LJI();
            if (aweme != null && interfaceC585880MyQLJI != null && (c162mLJII = LJII(str)) != null) {
                c162mLJII.LJ(aweme, interfaceC585880MyQLJI);
            }
        }
    }

    public AnonymousClass1635(USECASE usecase, C161Q<?> c161q) {
        super(usecase, c161q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIZ(Aweme aweme, String str) {
        InterfaceC585880MyQ interfaceC585880MyQLJI;
        C162M c162mLJII;
        this.LIZLLL = aweme;
        this.LJ = str;
        String aid = null;
        this.LJFF = null;
        Aweme aweme2 = this.LJII;
        if (LIZLLL()) {
            String aid2 = aweme.getAid();
            if (aweme2 != null) {
                aid = aweme2.getAid();
            }
            if (!Intrinsics.LJFF(aid2, aid) && LIZLLL() && C0SKF.LIZLLL(str) && (interfaceC585880MyQLJI = LJI()) != null) {
                if (aweme2 != null && (c162mLJII = LJII(str)) != null) {
                    c162mLJII.LJ(aweme2, interfaceC585880MyQLJI);
                }
                C162M c162mLJII2 = LJII(str);
                if (c162mLJII2 != null) {
                    c162mLJII2.LIZ(aweme, interfaceC585880MyQLJI);
                }
            }
        }
        this.LJII = aweme;
    }
}
