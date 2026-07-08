package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.avatar.AvatarComponentView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0rzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1609690rzT implements InterfaceC427850Gq7 {
    public long LL;
    public final /* synthetic */ InterfaceC1609780rzc LLILLJJLI;
    public final /* synthetic */ C1609770rzb LLILLL;
    public final /* synthetic */ Function1<C1609770rzb, Unit> LLILZ;
    public final /* synthetic */ AvatarComponentView LLILZIL;

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        this.LL = System.currentTimeMillis();
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        String message;
        InterfaceC1609780rzc interfaceC1609780rzc = this.LLILLJJLI;
        if (interfaceC1609780rzc != null) {
            interfaceC1609780rzc.Gi();
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        C1609770rzb c1609770rzb = this.LLILLL;
        c1609770rzb.LIZIZ = false;
        c1609770rzb.LJFF = jCurrentTimeMillis;
        Function1<C1609770rzb, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(c1609770rzb);
        }
        AvatarComponentView avatarComponentView = this.LLILZIL;
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        C1256830ioL.LIZ(avatarComponentView, jCurrentTimeMillis, false, null, message, 8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1609690rzT(InterfaceC1609780rzc interfaceC1609780rzc, C1609770rzb c1609770rzb, Function1<? super C1609770rzb, Unit> function1, AvatarComponentView avatarComponentView) {
        this.LLILLJJLI = interfaceC1609780rzc;
        this.LLILLL = c1609770rzb;
        this.LLILZ = function1;
        this.LLILZIL = avatarComponentView;
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        String string;
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            animatedDrawable2.LJI(new C1331010kjz(animatedDrawable2.LLILLL));
        }
        InterfaceC1609780rzc interfaceC1609780rzc = this.LLILLJJLI;
        if (interfaceC1609780rzc != null) {
            interfaceC1609780rzc.y1(false);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LL;
        C1609770rzb c1609770rzb = this.LLILLL;
        c1609770rzb.LIZ = animatable;
        c1609770rzb.LIZIZ = true;
        c1609770rzb.LJFF = jCurrentTimeMillis;
        Function1<C1609770rzb, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(c1609770rzb);
        }
        EnumC1609700rzU enumC1609700rzU = this.LLILLL.LIZJ;
        if (enumC1609700rzU != null) {
            string = enumC1609700rzU.getString();
        } else {
            string = null;
        }
        C1256830ioL.LIZ(this.LLILZIL, jCurrentTimeMillis, true, string, null, 16);
    }
}
