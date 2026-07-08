package X;

import com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentCustomListViewModel;
import com.ss.android.ugc.tools.infosticker.repository.internal.recent.InfoStickerRecentListViewModel;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0uIW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1698380uIW extends AbstractC23273099z implements CoroutineExceptionHandler {
    public final int $t;
    public Object l0;

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void LJJ(CoroutineContext coroutineContext, Throwable th) {
        switch (this.$t) {
            case 0:
                LJJ$0(this, coroutineContext, th);
                break;
            case 1:
                LJJ$1(this, coroutineContext, th);
                break;
            case 2:
                LJJ$2(this, coroutineContext, th);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1698380uIW(InterfaceC23272099y interfaceC23272099y, Object obj, int i) {
        super(interfaceC23272099y);
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJ$0(C1698380uIW c1698380uIW, CoroutineContext coroutineContext, Throwable th) {
        C2344809Gs.LJI(th);
        ((C1660390tJF) c1698380uIW.l0).E5();
    }

    public static final void LJJ$1(C1698380uIW c1698380uIW, CoroutineContext coroutineContext, Throwable th) {
        ((InfoStickerRecentCustomListViewModel) c1698380uIW.l0).LLILLJJLI.setValue(EnumC1641470soj.ERROR);
    }

    public static final void LJJ$2(C1698380uIW c1698380uIW, CoroutineContext coroutineContext, Throwable th) {
        ((InfoStickerRecentListViewModel) c1698380uIW.l0).LLILLJJLI.setValue(EnumC1641470soj.ERROR);
    }
}
