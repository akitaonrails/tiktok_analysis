package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.botpage.components.action.botshare.BotShareScreenShowDialogFragment;
import com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.12FA, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.action.multiple.TakoMultipleSelectVM$showScreenShotHandleDialog$1", f = "TakoMultipleSelectVM.kt", l = {}, m = "invokeSuspend")
public final class C12FA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoMultipleSelectVM LL;
    public final /* synthetic */ C12F8 LLILLJJLI;
    public final /* synthetic */ InterfaceC665370Q7z LLILLL;
    public final /* synthetic */ FragmentManager LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12FA(TakoMultipleSelectVM takoMultipleSelectVM, C12F8 c12f8, InterfaceC665370Q7z interfaceC665370Q7z, FragmentManager fragmentManager, InterfaceC1364105Vn<? super C12FA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoMultipleSelectVM;
        this.LLILLJJLI = c12f8;
        this.LLILLL = interfaceC665370Q7z;
        this.LLILZ = fragmentManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C12FA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmapLIZ;
        boolean z;
        C1C7U.LIZ("TakoMultipleSelectVM@4cd6.showScreenShotHandleDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        final ArrayList arrayList = new ArrayList();
        Map<C326880Cre, WeakReference<View>> map = this.LL.LLILZ;
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                try {
                    C444880HcU c444880HcU = C0H9N.LIZ;
                    bitmapLIZ = C0H9N.LIZ((View) ((WeakReference) entry.getValue()).get());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    try {
                        C444880HcU c444880HcU2 = C0H9N.LIZ;
                        bitmapLIZ = C0H9N.LIZ((View) ((WeakReference) entry.getValue()).get());
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                }
                if (bitmapLIZ != null) {
                    if (((C326880Cre) entry.getKey()).LLILLL.sender.senderType == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(new Pair(Boolean.valueOf(z), bitmapLIZ));
                }
            }
        }
        if (arrayList.isEmpty()) {
            this.LLILLJJLI.LIZLLL();
        } else {
            InterfaceC665370Q7z interfaceC665370Q7z = this.LLILLL;
            final C12F8 c12f8 = this.LLILLJJLI;
            final TakoMultipleSelectVM takoMultipleSelectVM = this.LL;
            C12F8 c12f82 = new C12F8() { // from class: X.12F9
                @Override // X.C12F8
                public final void LIZLLL() {
                }

                @Override // X.C12F8
                public final void onDismiss() {
                    c12f8.onDismiss();
                    Iterator<Pair<Boolean, Bitmap>> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C786410Ut5.LJJJJ(it2.next().getSecond());
                    }
                    arrayList.clear();
                    Map<C326880Cre, WeakReference<View>> map2 = takoMultipleSelectVM.LLILZ;
                    if (map2 != null) {
                        ((LinkedHashMap) map2).clear();
                    }
                }

                @Override // X.C12F8
                public final void onShow() {
                    c12f8.onShow();
                    c12f8.LIZLLL();
                }
            };
            BotShareScreenShowDialogFragment botShareScreenShowDialogFragment = new BotShareScreenShowDialogFragment();
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIZ(bundle, "data", new C12F7(arrayList, interfaceC665370Q7z, c12f82));
            botShareScreenShowDialogFragment.setArguments(bundle);
            botShareScreenShowDialogFragment.show(this.LLILZ, "FullScreenShotHandleDialogFragment");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMultipleSelectVM@4cd6.showScreenShotHandleDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
