package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.data.PostConfigModel;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0nh2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.quickpost.viewmodel.LiveQuickPostViewModel$obtainPostImageBitmap$1$bitmap$1", f = "LiveQuickPostViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1444500nh2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public final /* synthetic */ LiveQuickPostViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1444500nh2(LiveQuickPostViewModel liveQuickPostViewModel, InterfaceC1364105Vn<? super C1444500nh2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveQuickPostViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1444500nh2(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PostConfigModel postConfigModel;
        String strLJJLIL;
        Bitmap bitmapDecodeByteArray;
        int width;
        C1C7U.LIZ("LiveQuickPostViewModel@90c1.obtainPostImageBitmap$1$bitmap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1444460ngy c1444460ngy = this.LL.LLILLJJLI;
        Bitmap bitmap = null;
        if (c1444460ngy != null && (postConfigModel = c1444460ngy.LIZ) != null && (strLJJLIL = postConfigModel.publishImageByteArrayContent) != null) {
            int height = 0;
            try {
                if (a0.LJJIIZI(strLJJLIL, ",", false)) {
                    strLJJLIL = a0.LJJLIL(strLJJLIL, ",", strLJJLIL);
                }
                byte[] bArrDecode = Base64.decode(strLJJLIL, 0);
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1119450fEl c1119450fEl = C1119450fEl.LIZ;
                String message = e.getMessage();
                c1119450fEl.getClass();
                C1119450fEl.LIZ(-1, "base64ToBitmap", message, "");
                bitmapDecodeByteArray = null;
            } catch (OutOfMemoryError e2) {
                TryCatchGuardChecker.doCheck(e2);
                C1119450fEl c1119450fEl2 = C1119450fEl.LIZ;
                String message2 = e2.getMessage();
                c1119450fEl2.getClass();
                C1119450fEl.LIZ(-1, "base64ToBitmap", message2, "");
                bitmapDecodeByteArray = null;
            }
            c1444460ngy.LIZLLL = bitmapDecodeByteArray;
            if (bitmapDecodeByteArray != null) {
                width = bitmapDecodeByteArray.getWidth();
            } else {
                width = 0;
            }
            c1444460ngy.LJFF = width;
            Bitmap bitmap2 = c1444460ngy.LIZLLL;
            if (bitmap2 != null) {
                height = bitmap2.getHeight();
            }
            c1444460ngy.LJI = height;
        }
        C1444460ngy c1444460ngy2 = this.LL.LLILLJJLI;
        if (c1444460ngy2 != null) {
            bitmap = c1444460ngy2.LIZLLL;
        }
        C1C7U.LIZIZ("LiveQuickPostViewModel@90c1.obtainPostImageBitmap$1$bitmap$1");
        return bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
