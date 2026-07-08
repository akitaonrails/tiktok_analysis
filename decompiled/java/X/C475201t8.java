package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01t8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.util.NinePatchUtil$loadNinePatchImage$1$bitmap$1", f = "NinePatchUtil.kt", l = {52}, m = "invokeSuspend")
public final class C475201t8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC475301t9 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C475201t8(String str, InterfaceC475301t9 interfaceC475301t9, InterfaceC1364105Vn<? super C475201t8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC475301t9;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C475201t8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapDecodeStream;
        C1C7U.LIZ("NinePatchUtil@f193.loadNinePatchImage$1$bitmap$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLJJLI;
                this.LL = 1;
                final C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C1331660kl2.LJIIIZ(str).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.01sE
                    @Override // X.InterfaceC605070NoH
                    public final void onCanceled() {
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void LIZ(File file) {
                        if (file != null) {
                            InterfaceC1364105Vn<File> interfaceC1364105Vn = c23260099m;
                            C189200o6.m2constructorimpl(file);
                            interfaceC1364105Vn.resumeWith(file);
                        } else {
                            InterfaceC1364105Vn<File> interfaceC1364105Vn2 = c23260099m;
                            C098200Yq c098200Yq = new C098200Yq(new Throwable("download image failed: file is null"));
                            C189200o6.m2constructorimpl(c098200Yq);
                            interfaceC1364105Vn2.resumeWith(c098200Yq);
                        }
                    }

                    @Override // X.InterfaceC605070NoH
                    public final void onFailed(Throwable th) {
                        String message;
                        InterfaceC1364105Vn<File> interfaceC1364105Vn = c23260099m;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("download image failed: ");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        C098200Yq c098200Yq = new C098200Yq(new Throwable(C2188811AlT.LIZIZ(sbLIZ)));
                        C189200o6.m2constructorimpl(c098200Yq);
                        interfaceC1364105Vn.resumeWith(c098200Yq);
                    }
                });
                obj = c23260099m.LIZ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("NinePatchUtil@f193.loadNinePatchImage$1$bitmap$1");
                    return objLJFF;
                }
            }
            bitmapDecodeStream = BitmapFactory.decodeStream(new C0VSP((File) obj));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            InterfaceC475301t9 interfaceC475301t9 = this.LLILLL;
            if (interfaceC475301t9 != null) {
                interfaceC475301t9.onFailed(th);
            }
            bitmapDecodeStream = null;
        }
        C1C7U.LIZIZ("NinePatchUtil@f193.loadNinePatchImage$1$bitmap$1");
        return bitmapDecodeStream;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
