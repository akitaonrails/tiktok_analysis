package X;

import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HiddenItem;
import com.ss.android.ugc.tiktok.tns.userrelation.hideaccount.HideAccountViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15eq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20573015eq extends C09AY implements Function1<C1166730gT1, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ EnumC1392960mLu LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ HideAccountViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C127A LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20573015eq(boolean z, String str, EnumC1392960mLu enumC1392960mLu, int i, HideAccountViewModel hideAccountViewModel, String str2, C127A c127a) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = enumC1392960mLu;
        this.LLILZ = i;
        this.LLILZIL = hideAccountViewModel;
        this.LLILZLL = str2;
        this.LLIZ = c127a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1166730gT1 c1166730gT1) {
        C11O8 c11o8LIZJ;
        final C1166730gT1 c1166730gT12 = c1166730gT1;
        if (this.LL) {
            C20573115er c20573115er = InterfaceC20573215es.LIZ;
            String str = this.LLILLJJLI;
            EnumC1392960mLu enumC1392960mLu = this.LLILLL;
            c20573115er.getClass();
            c11o8LIZJ = C20573115er.LIZIZ(str, enumC1392960mLu);
        } else {
            C20573115er c20573115er2 = InterfaceC20573215es.LIZ;
            String str2 = this.LLILLJJLI;
            EnumC1392960mLu enumC1392960mLu2 = this.LLILLL;
            c20573115er2.getClass();
            c11o8LIZJ = C20573115er.LIZJ(str2, enumC1392960mLu2);
        }
        final int i = this.LLILZ;
        final boolean z = this.LL;
        final EnumC1392960mLu enumC1392960mLu3 = this.LLILLL;
        final String str3 = this.LLILLJJLI;
        final HideAccountViewModel hideAccountViewModel = this.LLILZIL;
        final String str4 = this.LLILZLL;
        c11o8LIZJ.LJJLL(new C09JN() { // from class: X.15ep
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("HideAccountViewModel@96be.hideOrUnHideAccountFromSwitch$2$1");
                HiddenItem hiddenItem = (HiddenItem) C13LP.LJJJLZIJ(i, c1166730gT12.LL);
                if (hiddenItem != null) {
                    if (z) {
                        hiddenItem.muteByType(enumC1392960mLu3);
                    } else {
                        hiddenItem.unMuteByType(enumC1392960mLu3);
                    }
                    C1589640rT8.LIZIZ.f2(enumC1392960mLu3, str3, z);
                    HideAccountViewModel hideAccountViewModel2 = hideAccountViewModel;
                    hideAccountViewModel2.setState(new C20572815eo(i, hiddenItem, hideAccountViewModel2, str4, enumC1392960mLu3, z));
                }
                C1C7U.LIZIZ("HideAccountViewModel@96be.hideOrUnHideAccountFromSwitch$2$1");
            }
        }, new C515501zd(this.LLIZ, z, 8));
        return Unit.LIZ;
    }
}
