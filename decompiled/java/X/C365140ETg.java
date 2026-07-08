package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.cover.MvChooseCoverBitmapCreator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ETg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C365140ETg extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MvChooseCoverBitmapCreator LL;
    public final /* synthetic */ InterfaceC20597015ii LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ C365100ETc LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ C810503Ep LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C365140ETg(MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator, InterfaceC20597015ii interfaceC20597015ii, Activity activity, C365100ETc c365100ETc, int i, C810503Ep c810503Ep) {
        super(0);
        this.LL = mvChooseCoverBitmapCreator;
        this.LLILLJJLI = interfaceC20597015ii;
        this.LLILLL = activity;
        this.LLILZ = c365100ETc;
        this.LLILZIL = i;
        this.LLILZLL = c810503Ep;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        MvChooseCoverBitmapCreator mvChooseCoverBitmapCreator = this.LL;
        Context contextLJIIZILJ = C20622515mp.LJIIZILJ(this.LLILLJJLI, this.LLILLL);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZ.LLJJLIIIJLLLLLLLZ;
        int i = this.LLILZIL;
        final C810503Ep c810503Ep = this.LLILZLL;
        mvChooseCoverBitmapCreator.getBitmapList(contextLJIIZILJ, interfaceC1452170ntP, i, new InterfaceC741260T5w() { // from class: X.0ETi
            @Override // X.InterfaceC741260T5w
            public final void LIZ(List<Bitmap> list) {
                c810503Ep.LLLFZ(list);
            }
        });
        return Unit.LIZ;
    }
}
