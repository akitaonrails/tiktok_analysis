package X;

import android.view.View;
import android.view.Window;
import com.ss.android.ugc.aweme.poi.quiz.data.RetainBtnInfo;
import kotlin.jvm.internal.AFwS256S0000000_18;
import kotlin.jvm.internal.AwS597S0100000_18;

/* JADX INFO: renamed from: X.0h3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@InterfaceC20647615qs("poi_quiz_retain_dialog")
public final class C1189270h3N extends AbstractC20659715sp<C1397510mTF> {
    public final InterfaceC20660615sy LL;
    public final C19EG LLILLJJLI;
    public final RetainBtnInfo LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C19EG c19eg;
        RetainBtnInfo retainBtnInfo = this.LLILLL;
        if (retainBtnInfo != null && (c19eg = this.LLILLJJLI) != null) {
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LIZIZ(retainBtnInfo.mainTitle);
            c1397580mTM.LJII = false;
            C985403tE.LIZ(c1397580mTM, new AwS597S0100000_18(this, 982));
            c1397580mTM.LJ(AFwS256S0000000_18.get$arr$(992));
            return new C1397510mTF(c1397580mTM);
        }
        C19EG c19eg2 = this.LLILLJJLI;
        if (c19eg2 != null) {
            c19eg2.finish();
            return null;
        }
        return null;
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final View showRootView(Object obj, C688120Qyw c688120Qyw) {
        Window window = ((AbstractDialogInterfaceC1397690mTX) obj).LJ().getWindow();
        if (window != null) {
            return window.getDecorView();
        }
        return null;
    }

    public C1189270h3N(InterfaceC20660615sy interfaceC20660615sy, C19EG c19eg, RetainBtnInfo retainBtnInfo) {
        super(interfaceC20660615sy);
        this.LL = interfaceC20660615sy;
        this.LLILLJJLI = c19eg;
        this.LLILLL = retainBtnInfo;
    }
}
