package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.16Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public class C20749916Hp implements InterfaceC1331910klR {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onProgress$0(C20749916Hp c20749916Hp, float f) {
    }

    public static final void onProgress$1(C20749916Hp c20749916Hp, float f) {
    }

    @Override // X.InterfaceC1331910klR
    public final void LIZ(Bitmap bitmap) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, bitmap);
                break;
            case 1:
                LIZ$1(this, bitmap);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onFailed(Throwable th) {
        switch (this.$t) {
            case 0:
                onFailed$0(this, th);
                break;
            case 1:
                onFailed$1(this, th);
                break;
        }
    }

    @Override // X.InterfaceC1331910klR
    public final void onProgress(float f) {
        switch (this.$t) {
            case 0:
                onProgress$0(this, f);
                break;
            case 1:
                onProgress$1(this, f);
                break;
        }
    }

    public static final void onCanceled$0(C20749916Hp c20749916Hp) {
        Function1 function1 = (Function1) c20749916Hp.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public static final void onCanceled$1(C20749916Hp c20749916Hp) {
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public static final void LIZ$0(C20749916Hp c20749916Hp, Bitmap bitmap) {
        Aweme aweme;
        String aid;
        Function1 function1 = (Function1) c20749916Hp.l0;
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        if (C1335180kqi.LIZ() && (aweme = ((C20530015Va) c20749916Hp.l1).LIZJ) != null && (aid = aweme.getAid()) != null) {
            C15VC.LIZIZ.add(aid);
        }
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public static final void LIZ$1(C20749916Hp c20749916Hp, Bitmap bitmap) {
        String aid;
        if (C1335180kqi.LIZ() && (aid = ((Aweme) c20749916Hp.l0).getAid()) != null) {
            C15VC.LIZIZ.add(aid);
        }
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public static final void onFailed$0(C20749916Hp c20749916Hp, Throwable th) {
        Function1 function1 = (Function1) c20749916Hp.l0;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public static final void onFailed$1(C20749916Hp c20749916Hp, Throwable th) {
        C15VC.LIZ(C2296808zG.LIZ(C0PEM.LIZJ), (C20530015Va) c20749916Hp.l1);
    }

    public C20749916Hp(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
