package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0FWk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C391440FWk extends AbstractC1335900krs {
    public final int $t;
    public Object l0;

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
            default:
                super.Ad(uri, view, c428600GrK, animatable);
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
            default:
                super.cm(uri, view, th);
                break;
        }
    }

    public C391440FWk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C391440FWk c391440FWk, Uri uri, View view, Throwable th) {
        Function0<Unit> function0 = ((C383610F2h) c391440FWk.l0).LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void cm$1(C391440FWk c391440FWk, Uri uri, View view, Throwable th) {
        Function0<Unit> function0 = ((C383610F2h) c391440FWk.l0).LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void cm$2(C391440FWk c391440FWk, Uri uri, View view, Throwable th) {
        Function0<Unit> function0 = ((AbstractC383630F2j) c391440FWk.l0).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void Ad$0(C391440FWk c391440FWk, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function0<Unit> function0 = ((C383610F2h) c391440FWk.l0).LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void Ad$1(C391440FWk c391440FWk, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function0<Unit> function0 = ((C383610F2h) c391440FWk.l0).LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void Ad$2(C391440FWk c391440FWk, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        Function0<Unit> function0 = ((AbstractC383630F2j) c391440FWk.l0).LJIIIIZZ;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
