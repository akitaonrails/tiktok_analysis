package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialog;
import com.ss.android.ugc.aweme.services.uikit.CreativeLoadingDialogBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.tools.view.uikit.factory.CreativeDialogWrapper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.AwS89S1000000_4;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0Dg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C345210Dg7 {
    public static final /* synthetic */ int LIZJ = 0;
    public final InterfaceC497601wk LIZ;
    public final List<InterfaceC345200Dg6> LIZIZ = new ArrayList();

    static {
        new C345220Dg8();
    }

    public C345210Dg7(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    public static void LIZIZ(String str) {
        C530000KqU.LIZIZ("MediaPreProcessManager", new AwS89S1000000_4(str, 0));
    }

    public final void LIZ(InterfaceC345200Dg6 interfaceC345200Dg6) {
        ((ArrayList) this.LIZIZ).add(interfaceC345200Dg6);
    }

    public final void LJ(ArrayList<TikTokMediaModel> arrayList, Function1<? super List<? extends TikTokMediaModel>, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("processBeforeAutoCut: begin to process, mediaList: ");
        sbLIZ.append(arrayList);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        Intent intent = new Intent();
        intent.putExtra("key_choose_media_data", arrayList);
        LIZLLL(this, intent, new AwS405S0200000_4((Function1) function1, (Function1<? super List<? extends TikTokMediaModel>, Unit>) intent, (Intent) 35));
    }

    public static void LIZLLL(C345210Dg7 c345210Dg7, Intent intent, Function0 function0) {
        c345210Dg7.LIZJ(intent, C0C64.LJIILLIIL().LJIJJLI(31744, -1L, "studio_c2pa_loading_dialog", true), null, function0);
    }

    public final void LIZJ(Intent intent, long j, C1DRG c1drg, Function0<Unit> function0) {
        CreativeLoadingDialog creativeLoadingDialogCreateLoadingDialog;
        C013C c013c = new C013C();
        Activity activityLJFF = C2214201BlK.LJFF();
        if (activityLJFF != null && !activityLJFF.isFinishing() && j >= 0) {
            C19576911iZ c19576911iZ = C19576911iZ.LIZ;
            CreativeLoadingDialogBuilder creativeLoadingDialogBuilder = new CreativeLoadingDialogBuilder();
            creativeLoadingDialogBuilder.showProgress(false);
            creativeLoadingDialogBuilder.backCanCancel(false);
            creativeLoadingDialogBuilder.cancelViewVisibleType(CreativeLoadingDialogBuilder.CancelType.VISIBLE_AFTER_5S);
            creativeLoadingDialogBuilder.loadingMessage(activityLJFF.getString(R.string.txr));
            creativeLoadingDialogBuilder.clickCancelListener(new AwS583S0100000_4(c013c, 247));
            creativeLoadingDialogCreateLoadingDialog = c19576911iZ.createLoadingDialog(activityLJFF, 1024, creativeLoadingDialogBuilder);
            ((CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog).delayShow(j);
        } else {
            creativeLoadingDialogCreateLoadingDialog = null;
        }
        C23250099c.LIZLLL(C2296808zG.LJII(this.LIZ, C0PEM.LIZJ.plus(new C345170Dg3(CoroutineExceptionHandler.LJJLIL, this, (CreativeDialogWrapper) creativeLoadingDialogCreateLoadingDialog, c1drg))), null, null, new C345140Dg0(this, c013c, c1drg, intent, creativeLoadingDialogCreateLoadingDialog, function0, null), 3);
    }
}
