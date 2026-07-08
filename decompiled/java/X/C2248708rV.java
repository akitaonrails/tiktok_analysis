package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08rV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.image.ImagePostKt$imagePostSuspend$path$1", f = "ImagePost.kt", l = {41}, m = "invokeSuspend")
public final class C2248708rV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248708rV(View view, List<String> list, InterfaceC1364105Vn<? super C2248708rV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2248708rV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("ImagePostKt@2b52.imagePostSuspend$path$1");
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
            Context context = this.LLILLJJLI.getContext();
            List<String> list = this.LLILLL;
            this.LL = 1;
            if (list != null && (str = (String) C13LP.LJJJLL(list)) != null) {
                String path = C786410Ut5.w2(context).getPath();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tako_");
                sbLIZ.append(str.hashCode());
                sbLIZ.append(System.currentTimeMillis());
                sbLIZ.append(".jpg");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
                c2252611DEt.LJIJJ();
                AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str);
                abstractC2199801B7qWith.LIZJ = strLIZIZ;
                abstractC2199801B7qWith.LJ = path;
                abstractC2199801B7qWith.LJIIJJI = new C2499809qu(c2252611DEt, 5);
                abstractC2199801B7qWith.LIZJ();
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
            } else {
                obj = null;
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ImagePostKt@2b52.imagePostSuspend$path$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ImagePostKt@2b52.imagePostSuspend$path$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
