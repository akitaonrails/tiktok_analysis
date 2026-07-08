package X;

import Y.AComparatorS27S0000000_8;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LEV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.jsbopenrecord.ExteriorMediaProcess$buildUploadReturnArguments$1$1", f = "ExteriorMediaProcess.kt", l = {}, m = "invokeSuspend")
public final class C0LEV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ReturnEcommerceCommentModel LLILLJJLI;
    public final /* synthetic */ C539580LEe LLILLL;
    public final /* synthetic */ TikTokMediaModel LLILZ;
    public final /* synthetic */ List<TikTokMediaModel> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0LEV(ReturnEcommerceCommentModel returnEcommerceCommentModel, C539580LEe c539580LEe, TikTokMediaModel tikTokMediaModel, List<? extends TikTokMediaModel> list, InterfaceC1364105Vn<? super C0LEV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = returnEcommerceCommentModel;
        this.LLILLL = c539580LEe;
        this.LLILZ = tikTokMediaModel;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LEV c0lev = new C0LEV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0lev.LL = obj;
        return c0lev;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C2296808zG.LJI((InterfaceC497601wk) this.LL)) {
            ReturnEcommerceCommentModel returnEcommerceCommentModel = this.LLILLJJLI;
            if (returnEcommerceCommentModel != null) {
                ((ArrayList) this.LLILLL.LIZLLL).add(returnEcommerceCommentModel);
            } else {
                String strLJIJ = C2471909mP.LJIJ(this.LLILZ);
                if (this.LLILZ.LJIILJJIL()) {
                    str = "video";
                } else {
                    str = "photo";
                }
                String str3 = "";
                if (this.LLILZ.LJIILJJIL()) {
                    str2 = "";
                } else {
                    str2 = strLJIJ;
                }
                if (!this.LLILZ.LJIILJJIL()) {
                    str3 = this.LLILZ.mimeType;
                }
                TikTokMediaModel tikTokMediaModel = this.LLILZ;
                int i = tikTokMediaModel.selectIndex;
                long j = tikTokMediaModel.fileSize;
                ((ArrayList) this.LLILLL.LIZLLL).add(new ReturnEcommerceCommentModel(i, strLJIJ, strLJIJ, C2286608xc.LJFF(j), j, str, str2, str3));
            }
            if (((ArrayList) this.LLILLL.LIZLLL).size() == this.LLILZIL.size()) {
                ArrayList arrayList = (ArrayList) this.LLILLL.LIZLLL;
                if (arrayList.size() > 1) {
                    C08XD.LJJ(arrayList, new AComparatorS27S0000000_8(1));
                }
                C539580LEe c539580LEe = this.LLILLL;
                c539580LEe.LIZJ.invoke("upload", new C539570LEd(true, false, false), c539580LEe.LIZLLL);
            }
        } else {
            C539630LEj.LIZJ(this.LLILLL.LIZIZ, this.LLILZ.LJFF(), "mix", EnumC539610LEh.UPLOAD_COROUTINE_SCOPE_INACTIVE, "upload", System.currentTimeMillis() - this.LLILLL.LJIIL, "");
            this.LLILLL.LIZJ.invoke("upload", new C539570LEd(false, false, true), null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExteriorMediaProcess@c447.buildUploadReturnArguments$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
