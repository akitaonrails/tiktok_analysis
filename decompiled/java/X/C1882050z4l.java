package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.business.common.impl.GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z4l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882050z4l implements InterfaceC1880780z2i, InterfaceC1882630z5h {
    public final InterfaceC1882450z5P LL;
    public GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 LLILLJJLI;
    public final C01GW LLILLL = C452501pT.LIZIZ(new C309000C9i());
    public Set<String> LLILZ = C08CX.INSTANCE;

    @Override // X.InterfaceC1883360z6s
    public final void LLLZI() {
        C1882650z5j.LIZJ("gamePartnershipMixViewReserve", this);
        C1882650z5j.LIZJ("gamePartnershipMixViewReserveCompletion", this);
    }

    @Override // X.InterfaceC1883360z6s
    public final void LJLJL() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        C1882650z5j.LIZLLL(this);
        GamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 = this.LLILLJJLI;
        if (gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2 != null && (lifecycleOwner = this.LL.getPage().getLifecycleOwner()) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(gamePreregisterService$handlePreregisterForEvent$notifyTask$1$2);
        }
        this.LLILLJJLI = null;
    }

    public C1882050z4l(AbstractC1882430z5N abstractC1882430z5N) {
        this.LL = abstractC1882430z5N;
    }

    @Override // X.InterfaceC1880780z2i
    public final void LIZ(Function1<? super JSONObject, Unit> function1) {
        ((Set) this.LLILLL.getValue()).remove(function1);
    }

    @Override // X.InterfaceC1880780z2i
    public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
        ((Set) this.LLILLL.getValue()).add(function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(final kotlin.jvm.functions.Function0 r19, final kotlin.jvm.functions.Function1 r20) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882050z4l.LJIIJ(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:123:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018a  */
    @Override // X.InterfaceC1882630z5h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(java.lang.String r11, X.InterfaceC1881290z3X r12) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882050z4l.LJIJJLI(java.lang.String, X.0z3X):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ef  */
    @Override // X.InterfaceC1880780z2i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r18, kotlin.jvm.functions.Function0 r19, kotlin.jvm.functions.Function1 r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1882050z4l.LIZJ(java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean):void");
    }
}
