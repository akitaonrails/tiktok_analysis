package X;

import android.app.Activity;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.12U7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12U7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MvChooseCoverBitmapCreator LL;
    public final /* synthetic */ Activity LLILLJJLI;
    public final /* synthetic */ C12U9 LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C810503Ep LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12U7(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, Activity activity, C12U9 c12u9, int i, C810503Ep c810503Ep) {
        super(0);
        this.LL = mvChooseCoverBitmapCreator;
        this.LLILLJJLI = activity;
        this.LLILLL = c12u9;
        this.LLILZ = i;
        this.LLILZIL = c810503Ep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = this.LL;
        Activity activity = this.LLILLJJLI;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILLL.LLJIJIL;
        int i = this.LLILZ;
        final C810503Ep c810503Ep = this.LLILZIL;
        mvChooseCoverBitmapCreator.getBitmapList(activity, interfaceC1452170ntP, i, new InterfaceC741260T5w() { // from class: X.12U6
            @Override // X.InterfaceC741260T5w
            public final void LIZ(List<Bitmap> list) {
                c810503Ep.LLLFZ(list);
            }
        });
        return Unit.LIZ;
    }
}
