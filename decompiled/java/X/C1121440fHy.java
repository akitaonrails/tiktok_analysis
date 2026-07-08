package X;

import android.view.View;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0fHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1121440fHy extends AbstractC519380KYm {
    public final GiftGuideMessage LIZJ;
    public final C1123440fLC LIZLLL;
    public final long LJ;
    public long LJFF;
    public final /* synthetic */ C1123440fLC LJI;

    @Override // X.InterfaceC1102120emo
    public final boolean LIZJ() {
        return false;
    }

    @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
    public final boolean LJFF() {
        return true;
    }

    @Override // X.InterfaceC1102120emo
    public final String getBusinessName() {
        return "gift_guide";
    }

    @Override // X.AbstractC519380KYm
    public final long LIZ() {
        return this.LJI.LLJLL;
    }

    @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
    public final String LIZIZ() {
        return this.LIZJ.guideType;
    }

    @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
    public final C1099880ejC LJIIIZ() {
        Function0<Boolean> function0 = this.LJI.LLILZIL;
        return new C1099880ejC(function0 != null ? function0.invoke().booleanValue() : false);
    }

    @Override // X.AbstractC519380KYm, X.InterfaceC1102120emo
    public final View LJIILJJIL() {
        Function0<? extends View> function0 = this.LJI.LLILZ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    @Override // X.AbstractC519380KYm
    public final long LJIILLIIL() {
        return this.LJI.LLJLLIL;
    }

    @Override // X.InterfaceC1102120emo
    public final String LJJJ() {
        return String.valueOf(this.LIZJ.getMessageId());
    }

    @Override // X.InterfaceC1102120emo
    public final String getId() {
        return String.valueOf(this.LIZJ.getMessageId());
    }

    @Override // X.InterfaceC1102120emo
    public final InterfaceC1102150emr LJII() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1102120emo
    public final long LJIIJ() {
        return this.LJ;
    }

    @Override // X.AbstractC519380KYm
    public final long LJIJ() {
        return this.LJFF;
    }

    public C1121440fHy(C1123440fLC c1123440fLC, GiftGuideMessage giftGuideMessage, C1123440fLC c1123440fLC2) {
        long jLIZIZ;
        this.LJI = c1123440fLC;
        this.LIZJ = giftGuideMessage;
        this.LIZLLL = c1123440fLC2;
        CommonMessageData commonMessageData = giftGuideMessage.baseMessage;
        if (commonMessageData != null) {
            jLIZIZ = commonMessageData.createTime;
        } else {
            jLIZIZ = C963140bAe.LIZIZ();
        }
        this.LJ = jLIZIZ;
    }
}
