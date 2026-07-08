package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0nh3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel$postImage$1$1$imagePath$1", f = "LiveQuickPostViewModel.kt", l = {144}, m = "invokeSuspend")
public final class C1444510nh3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ LiveQuickPostViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444510nh3(LiveQuickPostViewModel liveQuickPostViewModel, InterfaceC1364105Vn<? super C1444510nh3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveQuickPostViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1444510nh3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveQuickPostViewModel@90c1.postImage$1$1$imagePath$1");
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
            C1444460ngy c1444460ngy = this.LLILLJJLI.LLILLJJLI;
            if (c1444460ngy != null) {
                this.LL = 1;
                obj = "";
                try {
                    C1444460ngy.LIZ(C1444460ngy.LIZIZ());
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C1444460ngy.LIZIZ().getAbsolutePath());
                    sbLIZ.append(File.separator);
                    sbLIZ.append(System.currentTimeMillis());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    Bitmap bitmap = c1444460ngy.LIZLLL;
                    if (bitmap != null) {
                        if (C1319770kRr.LJ(100, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(strLIZIZ))) {
                            obj = strLIZIZ;
                        }
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1119450fEl c1119450fEl = C1119450fEl.LIZ;
                    String message = e.getMessage();
                    c1119450fEl.getClass();
                    C1119450fEl.LIZ(-1, "saveImageToLocal", message, "");
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postImage$1$1$imagePath$1");
                    return objLJFF;
                }
            } else {
                obj = null;
            }
        }
        C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.postImage$1$1$imagePath$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
