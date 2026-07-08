package X;

import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.creative.model.recordeffect.SharedARModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nmx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1448170nmx extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ C1396210mR9 LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1448170nmx(int i, C1396210mR9 c1396210mR9, String str, String str2) {
        super(0);
        this.LL = i;
        this.LLILLJJLI = c1396210mR9;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (this.LL == 1) {
            C1396210mR9 c1396210mR9 = this.LLILLJJLI;
            C1664750tQH c1664750tQH = c1396210mR9.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1396210mR9.LLILZLL;
            SharedARModel sharedARModel = ((ShortVideoContextViewModel) ((ViewModelProvider) c1664750tQH.getValue(c1396210mR9, interfaceC2217461BqaArr[2])).get(ShortVideoContextViewModel.class)).LL.sharedARModel;
            if (sharedARModel != null) {
                sharedARModel.setSharedARMultiPlayerUserName(this.LLILLL);
            }
            C1396210mR9 c1396210mR92 = this.LLILLJJLI;
            SharedARModel sharedARModel2 = ((ShortVideoContextViewModel) ((ViewModelProvider) c1396210mR92.LLILZIL.getValue(c1396210mR92, interfaceC2217461BqaArr[2])).get(ShortVideoContextViewModel.class)).LL.sharedARModel;
            if (sharedARModel2 != null) {
                sharedARModel2.setSharedARMultiPlayerUserId(this.LLILZ);
            }
        }
        return Unit.LIZ;
    }
}
