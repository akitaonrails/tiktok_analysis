package X;

import com.ss.android.ugc.aweme.shortvideo.AVChallenge;

/* JADX INFO: renamed from: X.0Mqi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C581100Mqi implements C092O {
    public final int $t;
    public Object l0;

    @Override // X.C092O
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public C581100Mqi(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void accept$0(C581100Mqi c581100Mqi, Object obj) {
        C536820L3o c536820L3o = (C536820L3o) c581100Mqi.l0;
        c536820L3o.LLJ = (AVChallenge) obj;
        c536820L3o.LJIIJ();
    }

    public static final void accept$1(C581100Mqi c581100Mqi, Object obj) {
        ((C536820L3o) c581100Mqi.l0).LJIIJ();
    }

    public static final void accept$2(C581100Mqi c581100Mqi, Object obj) {
        ((C536820L3o) c581100Mqi.l0).LLJ = (AVChallenge) obj;
    }

    public static final void accept$3(C581100Mqi c581100Mqi, Object obj) {
        C0MP6.LIZ(obj, (InterfaceC20236714Gf) c581100Mqi.l0);
    }

    public static final void accept$4(C581100Mqi c581100Mqi, Object obj) {
        C0MP6.LIZ(null, (InterfaceC20236714Gf) c581100Mqi.l0);
    }
}
