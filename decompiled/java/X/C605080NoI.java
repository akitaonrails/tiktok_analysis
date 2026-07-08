package X;

import android.graphics.drawable.NinePatchDrawable;
import android.view.View;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NoI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.bulletin.utils.BulletinNinePatchUtil$loadNinePatchDrawable$4$1$1$1", f = "BulletinNinePatchUtil.kt", l = {}, m = "invokeSuspend")
public final class C605080NoI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ NinePatchDrawable LLILLJJLI;
    public final /* synthetic */ InterfaceC605070NoH LLILLL;
    public final /* synthetic */ File LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C605080NoI(View view, NinePatchDrawable ninePatchDrawable, InterfaceC605070NoH interfaceC605070NoH, File file, InterfaceC1364105Vn<? super C605080NoI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = view;
        this.LLILLJJLI = ninePatchDrawable;
        this.LLILLL = interfaceC605070NoH;
        this.LLILZ = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C605080NoI(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinNinePatchUtil@e52f.loadNinePatchDrawable$4$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setBackground(this.LLILLJJLI);
        InterfaceC605070NoH interfaceC605070NoH = this.LLILLL;
        if (interfaceC605070NoH != null) {
            interfaceC605070NoH.LIZ(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinNinePatchUtil@e52f.loadNinePatchDrawable$4$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
