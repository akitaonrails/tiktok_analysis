package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.common.TextPiece;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01sA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.utils.InteractTextParseUtils$fetchImages$2$jobs$1$1", f = "InteractTextParseUtils.kt", l = {134}, m = "invokeSuspend")
public final class C469201sA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TextPiece LLILLJJLI;
    public final /* synthetic */ IHostFrescoHelper LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C469201sA(TextPiece textPiece, IHostFrescoHelper iHostFrescoHelper, InterfaceC1364105Vn<? super C469201sA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = textPiece;
        this.LLILLL = iHostFrescoHelper;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C469201sA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InteractTextParseUtils@d546.fetchImages$2$jobs$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            ImageModel imageModel = this.LLILLJJLI.imageValue.imageModel;
            if (this.LLILLL.HQ1(imageModel)) {
                C20441214yg.LJIIIZ("InteractTextParseUtils", "fetchImages skip, already downloaded");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2$jobs$1$1");
                return unit;
            }
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            final C5182020e c5182020e = new C5182020e(c2252611DEt, 272);
            c2252611DEt.LJJII(new C5183020f(C1331660kl2.LJIIJ(new C03IT(imageModel.getUrls())).LJIJ(new InterfaceC605070NoH() { // from class: X.01sB
                @Override // X.InterfaceC605070NoH
                public final void onCanceled() {
                    C20441214yg.LJIIIZ("InteractTextParseUtils", "fetchImages cancelled");
                    c5182020e.invoke();
                }

                @Override // X.InterfaceC605070NoH
                public final void LIZ(File file) {
                    String path;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchImages success, path = ");
                    if (file != null) {
                        path = file.getPath();
                    } else {
                        path = null;
                    }
                    sbLIZ.append(path);
                    C20441214yg.LJIIIZ("InteractTextParseUtils", C2188811AlT.LIZIZ(sbLIZ));
                    c5182020e.invoke();
                }

                @Override // X.InterfaceC605070NoH
                public final void onFailed(Throwable th) {
                    String message;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchImages failed, throwable = ");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C20441214yg.LJIIIZ("InteractTextParseUtils", C2188811AlT.LIZIZ(sbLIZ));
                    c5182020e.invoke();
                }
            }), 183));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2$jobs$1$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("InteractTextParseUtils@d546.fetchImages$2$jobs$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
