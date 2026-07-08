package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.CommonSetAvatarFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0j3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266210j3T implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;

    public static final void A3$0(C1266210j3T c1266210j3T, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$1(C1266210j3T c1266210j3T, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$2(C1266210j3T c1266210j3T, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Bh$1(C1266210j3T c1266210j3T, Uri uri, View view) {
    }

    public static final void Bh$2(C1266210j3T c1266210j3T, Uri uri, View view) {
    }

    public static final void e1$0(C1266210j3T c1266210j3T, Uri uri) {
    }

    public static final void e1$1(C1266210j3T c1266210j3T, Uri uri) {
    }

    public static final void e1$2(C1266210j3T c1266210j3T, Uri uri) {
    }

    public static final void lg$0(C1266210j3T c1266210j3T, Uri uri, Throwable th) {
    }

    public static final void lg$1(C1266210j3T c1266210j3T, Uri uri, Throwable th) {
    }

    public static final void lg$2(C1266210j3T c1266210j3T, Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                A3$0(this, uri, c428600GrK);
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
            case 2:
                A3$2(this, uri, c428600GrK);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
            case 2:
                Ad$2(this, uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
                Bh$1(this, uri, view);
                break;
            case 2:
                Bh$2(this, uri, view);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
            case 2:
                cm$2(this, uri, view, th);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                e1$0(this, uri);
                break;
            case 1:
                e1$1(this, uri);
                break;
            case 2:
                e1$2(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                lg$0(this, uri, th);
                break;
            case 1:
                lg$1(this, uri, th);
                break;
            case 2:
                lg$2(this, uri, th);
                break;
        }
    }

    public C1266210j3T(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void Bh$0(C1266210j3T c1266210j3T, Uri uri, View view) {
        ((CommonSetAvatarFragment) c1266210j3T.l0).LLLLII = SystemClock.elapsedRealtime();
        ((CommonSetAvatarFragment) c1266210j3T.l0).getClass();
        CommonSetAvatarFragment.RS(null, "start");
    }

    public static final void cm$0(C1266210j3T c1266210j3T, Uri uri, View view, Throwable th) {
        CommonSetAvatarFragment commonSetAvatarFragment = (CommonSetAvatarFragment) c1266210j3T.l0;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - ((CommonSetAvatarFragment) c1266210j3T.l0).LLLLII);
        commonSetAvatarFragment.getClass();
        CommonSetAvatarFragment.RS(lValueOf, "fail");
    }

    public static final void cm$1(C1266210j3T c1266210j3T, Uri uri, View view, Throwable th) {
        Function0 function0 = (Function0) c1266210j3T.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void cm$2(C1266210j3T c1266210j3T, Uri uri, View view, Throwable th) {
        ((C1239170iLr) c1266210j3T.l0).LIZ(false);
    }

    public static final void Ad$0(C1266210j3T c1266210j3T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        CommonSetAvatarFragment commonSetAvatarFragment = (CommonSetAvatarFragment) c1266210j3T.l0;
        Long lValueOf = Long.valueOf(SystemClock.elapsedRealtime() - ((CommonSetAvatarFragment) c1266210j3T.l0).LLLLII);
        commonSetAvatarFragment.getClass();
        CommonSetAvatarFragment.RS(lValueOf, "success");
    }

    public static final void Ad$1(C1266210j3T c1266210j3T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function0 function0 = (Function0) c1266210j3T.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void Ad$2(C1266210j3T c1266210j3T, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        ((C1239170iLr) c1266210j3T.l0).LIZ(true);
    }
}
