package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.base.HomePageViewPagerAbility;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Rjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704220Rjo extends C21311118ab {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public float LL;
    public float LLILLJJLI;
    public final C12P4 LLILLL;
    public final C12P4 LLILZ;
    public final C01GW LLILZIL;
    public volatile HomePageViewPagerAbility LLILZLL;
    public InterfaceC665370Q7z LLIZ;
    public C0QSJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C704220Rjo.class, "homePagerAbilityDi", "getHomePagerAbilityDi()Lcom/ss/android/ugc/aweme/base/HomePageViewPagerAbility;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public C704220Rjo(Context context) {
        this(context, null, 6, 0);
    }

    public C704220Rjo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final HomePageViewPagerAbility getHomePagerAbility() {
        return (HomePageViewPagerAbility) this.LLILZIL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029 A[Catch: all -> 0x0035, PHI: r1
      0x0029: PHI (r1v1 X.0QSJ) = (r1v0 X.0QSJ), (r1v3 X.0QSJ) binds: [B:8:0x000b, B:13:0x0025] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:5:0x0005, B:7:0x0009, B:9:0x000d, B:11:0x0011, B:12:0x0017, B:16:0x0031, B:17:0x0033, B:15:0x0029), top: B:24:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.base.HomePageViewPagerAbility getHomePagerAbilityDi() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLILZLL
            if (r0 != 0) goto L39
            monitor-enter(r4)
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = r4.LLILZLL     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L38
            X.0QSJ r1 = r4.LLIZLLLIL     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            X.0Q7z r3 = r4.LLIZ     // Catch: java.lang.Throwable -> L35
            if (r3 != 0) goto L17
            X.0Q7z r3 = X.C687700QyG.LJIIIZ(r4)     // Catch: java.lang.Throwable -> L35
            r4.LLIZ = r3     // Catch: java.lang.Throwable -> L35
        L17:
            r0 = 1
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<com.ss.android.ugc.aweme.scope.MainActivityScope> r1 = com.ss.android.ugc.aweme.scope.MainActivityScope.class
            r0 = 0
            r2[r0] = r1     // Catch: java.lang.Throwable -> L35
            X.0QSJ r1 = X.C687700QyG.LIZLLL(r3, r2)     // Catch: java.lang.Throwable -> L35
            r4.LLIZLLLIL = r1     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L29
            r0 = 0
            goto L31
        L29:
            java.lang.Class<com.ss.android.ugc.aweme.base.HomePageViewPagerAbility> r0 = com.ss.android.ugc.aweme.base.HomePageViewPagerAbility.class
            java.lang.Object r0 = r1.getAbility(r0)     // Catch: java.lang.Throwable -> L35
            com.ss.android.ugc.aweme.base.HomePageViewPagerAbility r0 = (com.ss.android.ugc.aweme.base.HomePageViewPagerAbility) r0     // Catch: java.lang.Throwable -> L35
        L31:
            r4.LLILZLL = r0     // Catch: java.lang.Throwable -> L35
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L35
            return r0
        L35:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L38:
            monitor-exit(r4)
        L39:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C704220Rjo.getHomePagerAbilityDi():com.ss.android.ugc.aweme.base.HomePageViewPagerAbility");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.getAction();
        if (motionEvent.getAction() == 2) {
            if (Math.abs(this.LL - motionEvent.getRawX()) > Math.abs(this.LLILLJJLI - motionEvent.getRawY())) {
                HomePageViewPagerAbility homePagerAbility = getHomePagerAbility();
                if (homePagerAbility != null) {
                    homePagerAbility.eO1(motionEvent, motionEvent.getRawX(), motionEvent.getRawY());
                }
                C1899620zX6.LIZ();
            }
        }
        this.LL = motionEvent.getRawX();
        this.LLILLJJLI = motionEvent.getRawY();
        return super.dispatchTouchEvent(motionEvent);
    }

    public C704220Rjo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZIL = C452501pT.LIZIZ(new C704230Rjp(this, context));
        C786410Ut5.Sd(R.layout.b60, C786410Ut5.ne(context), this);
        View viewFindViewById = findViewById(R.id.pke);
        this.LLILLL = (C12P4) findViewById(R.id.hzw);
        this.LLILZ = (C12P4) findViewById(R.id.ugq);
        C786410Ut5.LJLLLLLL(8, viewFindViewById);
    }

    public /* synthetic */ C704220Rjo(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
