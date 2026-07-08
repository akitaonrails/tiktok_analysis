package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18hu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21356418hu {
    public final C21356518hv LIZ;
    public final Activity LIZIZ;
    public final View LIZJ;
    public final InterfaceC21358118iB LIZLLL;
    public final InterfaceC212356188k LJ;
    public final ViewGroup LJFF;
    public final View LJI;
    public final View LJII;
    public final View LJIIIIZZ;
    public final ViewGroup LJIIIZ;
    public final RecyclerView LJIIJ;
    public final View LJIIJJI;
    public final View LJIIL;
    public final Function0<Boolean> LJIILIIL;
    public final View LJIILJJIL;
    public final C21355718hn LJIILL;
    public final Function1<Effect, Boolean> LJIILLIIL;
    public C1624230sMv LJIIZILJ;
    public Effect LJIJ;
    public final C01GW LJIJI;
    public final C01GW LJIJJ;
    public final C01GW LJIJJLI;

    public C21356418hu() {
        throw null;
    }

    public final AbstractC21356318ht LIZ() {
        Effect effect;
        String sdkExtra;
        AbstractC21356318ht abstractC21356318ht;
        C1624230sMv c1624230sMv;
        if (this.LIZ.LIZ) {
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("UploadPicStickerMatting", "galleryMode ---");
            abstractC21356318ht = (AbstractC21356318ht) this.LJIJI.getValue();
        } else {
            Effect effect2 = this.LJIJ;
            boolean z = (effect2 != null && effect2.getSource() == 102) || ((effect = this.LJIJ) != null && C1624600sNW.LIZ(effect)) || this.LJIILLIIL.invoke(this.LJIJ).booleanValue();
            C21356918hz c21356918hz = new C21356918hz();
            Effect effect3 = this.LJIJ;
            if (effect3 == null || (sdkExtra = effect3.getSdkExtra()) == null) {
                sdkExtra = "";
            }
            c21356918hz.LIZIZ(sdkExtra);
            boolean forceDoneUploadMode = c21356918hz.LJ.getPl().getForceDoneUploadMode();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkUseIndicatorMode effectSource:");
            Effect effect4 = this.LJIJ;
            sbLIZ.append(effect4 != null ? Integer.valueOf(effect4.getSource()) : null);
            sbLIZ.append(" applyEffectUsingDraft:");
            Effect effect5 = this.LJIJ;
            sbLIZ.append(effect5 != null ? Boolean.valueOf(C1624600sNW.LIZ(effect5)) : null);
            sbLIZ.append(' ');
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("UploadPicStickerMatting", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkUseIndicatorMode isFromAME:");
            sbLIZ2.append(z);
            sbLIZ2.append(" enableIndicatorMode:");
            sbLIZ2.append(this.LIZ.LIZLLL);
            sbLIZ2.append(" isUploadPic:");
            C1624230sMv c1624230sMv2 = this.LJIIZILJ;
            sbLIZ2.append(c1624230sMv2 != null ? Boolean.valueOf(c1624230sMv2.LIZ) : null);
            sbLIZ2.append(" forceDoneButtonMode: ");
            sbLIZ2.append(forceDoneUploadMode);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("UploadPicStickerMatting", C2188811AlT.LIZIZ(sbLIZ2));
            if (this.LIZ.LIZLLL && (c1624230sMv = this.LJIIZILJ) != null && true == c1624230sMv.LIZ && z && !forceDoneUploadMode) {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("UploadPicStickerMatting", "indicatorMode ---");
                abstractC21356318ht = (AbstractC21356318ht) this.LJIJJLI.getValue();
            } else {
                ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("UploadPicStickerMatting", "normalMode ---");
                abstractC21356318ht = (AbstractC21356318ht) this.LJIJJ.getValue();
            }
        }
        if (!abstractC21356318ht.LIZ) {
            C21356518hv c21356518hv = this.LIZ;
            Activity activity = this.LIZIZ;
            View view = this.LIZJ;
            InterfaceC21358118iB interfaceC21358118iB = this.LIZLLL;
            InterfaceC212356188k interfaceC212356188k = this.LJ;
            ViewGroup viewGroup = this.LJFF;
            View view2 = this.LJI;
            View view3 = this.LJII;
            View view4 = this.LJIIIIZZ;
            ViewGroup viewGroup2 = this.LJIIIZ;
            RecyclerView recyclerView = this.LJIIJ;
            View view5 = this.LJIIJJI;
            View view6 = this.LJIIL;
            Function0<Boolean> function0 = this.LJIILIIL;
            View view7 = this.LJIILJJIL;
            C21355718hn c21355718hn = this.LJIILL;
            abstractC21356318ht.LJIIIZ = c21356518hv;
            abstractC21356318ht.LIZIZ = view;
            abstractC21356318ht.LIZJ = interfaceC21358118iB;
            abstractC21356318ht.LIZLLL = interfaceC212356188k;
            abstractC21356318ht.LJ = viewGroup;
            abstractC21356318ht.LJFF = view2;
            abstractC21356318ht.LJI = view3;
            abstractC21356318ht.LJII = view4;
            abstractC21356318ht.LJIIIIZZ = viewGroup2;
            abstractC21356318ht.LJIIJ = recyclerView;
            abstractC21356318ht.LJIIJJI = activity;
            abstractC21356318ht.LJIIL = view5;
            abstractC21356318ht.LJIILIIL = view6;
            abstractC21356318ht.LJIILL = function0;
            abstractC21356318ht.LJIILLIIL = view7;
            abstractC21356318ht.LJIILJJIL = c21355718hn;
            abstractC21356318ht.LIZ = true;
            abstractC21356318ht.LIZJ();
        }
        return abstractC21356318ht;
    }

    public C21356418hu(C21356518hv c21356518hv, Activity activity, View view, InterfaceC21358118iB interfaceC21358118iB, InterfaceC212356188k interfaceC212356188k, ViewGroup viewGroup, View view2, View view3, View view4, ViewGroup viewGroup2, RecyclerView recyclerView, View view5, View view6, C21355718hn c21355718hn, Function1 function1) {
        this.LIZ = c21356518hv;
        this.LIZIZ = activity;
        this.LIZJ = view;
        this.LIZLLL = interfaceC21358118iB;
        this.LJ = interfaceC212356188k;
        this.LJFF = viewGroup;
        this.LJI = view2;
        this.LJII = view3;
        this.LJIIIIZZ = view4;
        this.LJIIIZ = viewGroup2;
        this.LJIIJ = recyclerView;
        this.LJIIJJI = view5;
        this.LJIIL = view6;
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIILL = c21355718hn;
        this.LJIILLIIL = function1;
        this.LJIJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(304));
        this.LJIJJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(306));
        this.LJIJJLI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(305));
    }
}
