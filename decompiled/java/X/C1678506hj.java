package X;

import android.app.Activity;
import android.content.Context;
import android.text.Spannable;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.AISelfStickerInlineViewModel;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.06hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1678506hj {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIJJI;
    public final C869590Y9l LIZ;
    public final SessionInfo LIZIZ;
    public final C0ZQZ<TuxTextView> LIZJ;
    public final LifecycleCoroutineScope LIZLLL;
    public final C01GW<Photo2StickerViewModel> LJ;
    public final C01GW<AISelfStickerInlineViewModel> LJFF;
    public final Function0<Activity> LJI;
    public final InterfaceC665370Q7z LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1047));
    public CheckMessage LJIIIZ;
    public volatile InterfaceC1839980xyu LJIIJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1678506hj.class, "photo2StickerEventTracker", "getPhoto2StickerEventTracker()Lcom/ss/android/ugc/aweme/im/sticker/api/service/photo2sticker/IPhoto2StickerEventTracker;", 0);
        C13LE.LIZ.getClass();
        LJIIJJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final InterfaceC1839980xyu LIZIZ() {
        InterfaceC1839980xyu interfaceC1839980xyu = this.LJIIJ;
        if (interfaceC1839980xyu == null) {
            synchronized (this) {
                interfaceC1839980xyu = this.LJIIJ;
                if (interfaceC1839980xyu == null) {
                    InterfaceC1839980xyu interfaceC1839980xyu2 = (InterfaceC1839980xyu) C1807670x8n.LLLLLZIL();
                    this.LJIIJ = interfaceC1839980xyu2;
                    return interfaceC1839980xyu2;
                }
            }
        }
        return interfaceC1839980xyu;
    }

    public final C1674906h9 LIZ() {
        return (C1674906h9) this.LJIIIIZZ.getValue();
    }

    public final void LIZJ(Spannable spannable, C1678406hi c1678406hi) {
        this.LIZJ.LIZIZ();
        AwS246S0300000_2 awS246S0300000_2 = new AwS246S0300000_2(this, spannable, c1678406hi, 26);
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL) {
            if (LIZ().LIZ(c1678406hi.LIZ, c1678406hi.LIZJ, c1678406hi.LJ)) {
                awS246S0300000_2.invoke();
                return;
            } else {
                C23250099c.LIZLLL(this.LIZLLL, null, null, new C1678306hh(c1678406hi, this, awS246S0300000_2, null), 3);
                return;
            }
        }
        awS246S0300000_2.invoke();
    }

    public C1678506hj(Context context, C869590Y9l c869590Y9l, SessionInfo sessionInfo, C0ZQZ c0zqz, LifecycleCoroutineScope lifecycleCoroutineScope, AssemVMLazy assemVMLazy, AssemVMLazy assemVMLazy2, AwS558S0100000_14 awS558S0100000_14, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = sessionInfo;
        this.LIZJ = c0zqz;
        this.LIZLLL = lifecycleCoroutineScope;
        this.LJ = assemVMLazy;
        this.LJFF = assemVMLazy2;
        this.LJI = awS558S0100000_14;
        this.LJII = interfaceC665370Q7z;
    }
}
