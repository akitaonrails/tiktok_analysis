package X;

import Y.ACListenerS162S0100000_28;
import Y.AfS117S0300000_28;
import Y.AfS197S0100000_28;
import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.actionsheet.TuxActionSheet;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.batchmanage.BatchManageClickTarget$buildActionSheet$5$1;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.batchmanage.api.BatchManageApiManager;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS237S0300000_28;
import kotlin.jvm.internal.AwS394S0200000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10bm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19280010bm {
    public static final EnumC19280010bm COMMENT_BATCH;
    public static final EnumC19280010bm CONTENT_REUSE_BATCH;
    public static final C19280310bp Companion;
    public static final /* synthetic */ EnumC19280010bm[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static WeakReference<TuxActionSheet> currentSheet;
    public final int LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final C19280110bn allowPopup;
    public final C19280110bn disallowPopup;
    public final Function0<Boolean> shouldPopup;

    public static InterfaceC2044707zh<EnumC19280010bm> getEntries() {
        return LLILZIL;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.10bp] */
    static {
        C191956107u c191956107u = C191956107u.LIZ;
        EnumC19280010bm enumC19280010bm = new EnumC19280010bm("COMMENT_BATCH", 0, 2131846175, new C19202410Ak(c191956107u), "comment_permission", "comment_existing_post", new C19280110bn(2131846172, 2131846169, 0L, "comment", 2131846179, "allow_comment", "allow"), new C19280110bn(2131846174, 2131846173, 3L, "comment", 2131846180, "disallow_comment", "disallow"));
        COMMENT_BATCH = enumC19280010bm;
        EnumC19280010bm enumC19280010bm2 = new EnumC19280010bm("CONTENT_REUSE_BATCH", 1, 2131846187, new C19202510Al(c191956107u), "reuse_content_permission", "reuse_content_existing_post", new C19280110bn(2131846184, 2131846183, 1L, "content_reuse_permission", 2131846181, "allow_reuse_content", "allow"), new C19280110bn(2131846186, 2131846185, 2L, "content_reuse_permission", 2131846182, "disallow_reuse_content", "disallow"));
        CONTENT_REUSE_BATCH = enumC19280010bm2;
        EnumC19280010bm[] enumC19280010bmArr = {enumC19280010bm, enumC19280010bm2};
        LLILZ = enumC19280010bmArr;
        LLILZIL = new C2254308sP(enumC19280010bmArr);
        Companion = new Object() { // from class: X.10bp
        };
    }

    public static EnumC19280010bm[] values() {
        return (EnumC19280010bm[]) LLILZ.clone();
    }

    public static EnumC19280010bm valueOf(String str) {
        return (EnumC19280010bm) C08FF.LIZ(EnumC19280010bm.class, str);
    }

    public final void onclick(View view) {
        FragmentManager supportFragmentManager;
        TuxActionSheet tuxActionSheet;
        uploadEvent("click_existing_post_permission", new Pair[0]);
        WeakReference<TuxActionSheet> weakReference = currentSheet;
        if (weakReference != null && (tuxActionSheet = weakReference.get()) != null) {
            tuxActionSheet.dismissAllowingStateLoss();
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(view.getContext());
        if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
            C1390850mIV c1390850mIV = new C1390850mIV();
            c1390850mIV.LJII(this.LL);
            C1247510iZJ c1247510iZJ = new C1247510iZJ();
            c1247510iZJ.LIZIZ(2131846176);
            c1247510iZJ.LIZ(new AwS607S0100000_28(this, 395));
            C1247510iZJ c1247510iZJ2 = new C1247510iZJ();
            c1247510iZJ2.LIZIZ(2131846177);
            c1247510iZJ2.LIZ(new AwS607S0100000_28(this, 396));
            c1390850mIV.LIZIZ(c1247510iZJ, c1247510iZJ2);
            DialogInterfaceOnCancelListenerC19332810kI dialogInterfaceOnCancelListenerC19332810kI = new DialogInterfaceOnCancelListenerC19332810kI(this, 12);
            TuxActionSheet tuxActionSheet2 = c1390850mIV.LIZ;
            tuxActionSheet2.LL = dialogInterfaceOnCancelListenerC19332810kI;
            tuxActionSheet2.LLILLJJLI = new DialogInterface.OnDismissListener() { // from class: X.10bo
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    EnumC19280010bm.currentSheet = null;
                }
            };
            TuxActionSheet tuxActionSheetLIZJ = c1390850mIV.LIZJ();
            tuxActionSheetLIZJ.getLifecycle().addObserver(new BatchManageClickTarget$buildActionSheet$5$1(this, tuxActionSheetLIZJ));
            currentSheet = new WeakReference<>(tuxActionSheetLIZJ);
            tuxActionSheetLIZJ.show(supportFragmentManager, "privacy_batch_management");
        }
    }

    public final void overrideAutoDismissAfterViewCreated(TuxActionSheet tuxActionSheet) {
        LinearLayout linearLayout;
        List listLJJII;
        try {
            View view = tuxActionSheet.getView();
            if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.a59)) != null && (listLJJII = C09RB.LJJII(C09RB.LJIIIZ(new C09RD(linearLayout), AFwS271S0000000_28.get$arr$(445)))) != null && listLJJII.size() >= 3) {
                C786410Ut5.I7(new ACListenerS162S0100000_28(this, 204), (View) listLJJII.get(0));
                C786410Ut5.I7(new ACListenerS162S0100000_28(this, 205), (View) listLJJII.get(1));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final void requestAndToast(View view, C19280110bn c19280110bn) {
        C632140Oqq.LIZLLL(((BatchManageApiManager.BatchManageApi) BatchManageApiManager.LIZ.getValue()).setPrivacySettingBatch(c19280110bn.LIZLLL, c19280110bn.LJ), "/tiktok/privacy/user/posts/setting/update/v1", null).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS117S0300000_28(this, c19280110bn, view, 6), new AfS197S0100000_28(view, 89));
    }

    public final void sheetOnclick(View view, C19280110bn c19280110bn) {
        uploadEvent("click_permission_sheet", new Pair<>("action", c19280110bn.LJI));
        if (this.shouldPopup.invoke().booleanValue()) {
            C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
            c1397580mTM.LJFF(c19280110bn.LIZ);
            c1397580mTM.LIZ(c19280110bn.LIZIZ);
            C1238130iKB.LIZ(c1397580mTM, new AwS237S0300000_28(this, c19280110bn, view, 22));
            c1397580mTM.LJII = false;
            c1397580mTM.LJ(new AwS394S0200000_28(this, c19280110bn, 114));
            new C1397510mTF(c1397580mTM).LIZLLL();
            return;
        }
        requestAndToast(view, c19280110bn);
    }

    public final void uploadEvent(String str, Pair<String, String>... pairArr) {
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("enter_from", this.LLILLJJLI), new Pair("page_tag", this.LLILLL));
        C2097608Jq.LJIILL(mapLJIIJ, pairArr);
        C20684815ws.LJIILLIIL(str, mapLJIIJ);
    }

    public EnumC19280010bm(String str, int i, int i2, Function0 function0, String str2, String str3, C19280110bn c19280110bn, C19280110bn c19280110bn2) {
        this.LL = i2;
        this.shouldPopup = function0;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.allowPopup = c19280110bn;
        this.disallowPopup = c19280110bn2;
    }
}
