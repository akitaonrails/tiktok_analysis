package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.scene.Scene;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.creative.model.PrivacySettingModel;
import com.ss.android.ugc.aweme.feed.model.InteractionTagUserInfo;
import com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure;
import com.ss.android.ugc.aweme.publish.privacy.PostBtnConfigure;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.shortvideo.privacy.ui.EditPageDefaultPrivacySettingFragment;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS423S0200000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import uxk.a;

/* JADX INFO: renamed from: X.0ngu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1444420ngu extends AbstractC2255721DQs<InterfaceC1444410ngt> implements InterfaceC1444410ngt, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public final InterfaceC1444410ngt LLILLL = this;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final Boolean LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public int LLIZLLLIL;
    public final MutableLiveData<Boolean> LLJ;
    public TuxSheet LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1444420ngu.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1444420ngu.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1444420ngu.class, "editSecondPageState", "getEditSecondPageState()Lcom/ss/android/ugc/gamora/editor/EditSecondPageState;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJILJIL = 8;
    }

    public String getEnterFrom() {
        return "video_edit_page";
    }

    private final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    private final C1451630nsX o2() {
        return (C1451630nsX) this.LLIZ.getValue(this, LLJIJIL[2]);
    }

    public final void c3() {
        this.LLJ.setValue(Boolean.TRUE);
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS261S0000000_22.get$arr$(129));
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LJI(w2().isPrivate(), w2(), getEnterFrom(), new AwS601S0100000_22(this, 212));
    }

    @Override // X.InterfaceC1444410ngt
    public void kM0() {
        TuxSheet tuxSheet = this.LLJI;
        if (tuxSheet != null) {
            tuxSheet.dismiss();
        }
    }

    public final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    private final void m3() {
        if (w2().isPrivate != -1 && w2().creativeModel.commerceModel.getTcmModel().getTcmPreventSelfSee() == 2 && w2().isPrivate == 1) {
            w2().isPrivate = 0;
            Activity activityLJII = C1664590tQ1.LJII(this);
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            C859330XnP.LIZ.getClass();
            creativeToastBuilder.isCenterToast(C859330XnP.LIZ());
            creativeToastBuilder.message(C1664590tQ1.LJII(this).getString(2131858116));
            creativeToastBuilder.acrossActivities(true);
            C1390380mHk.LIZ(activityLJII, 2031, creativeToastBuilder);
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onResume() {
        super.onResume();
        m3();
    }

    @Override // X.InterfaceC1444410ngt
    public void s80() {
        C19EG c19eg;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        Activity activityLJII = C1664590tQ1.LJII(this);
        Integer numLIZJ = null;
        if ((activityLJII instanceof C19EG) && (c19eg = (C19EG) activityLJII) != null && (!C545820Lau.LIZLLL(c19eg, this.LLILLJJLI))) {
            if (C1444450ngx.LIZJ()) {
                a.LIZ.getClass();
                if (a.LJIIJJI()) {
                    a.LJI();
                }
            }
            C214728191q c214728191qLJJLIIIJLJLI = C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI();
            this.LLIZLLLIL = w2().isPrivate;
            AwS601S0100000_22 awS601S0100000_22 = new AwS601S0100000_22(this, 213);
            InterfaceC1455860nzM interfaceC1455860nzMZ1 = Z1();
            if (interfaceC1455860nzMZ1 != null && (liveDataG = interfaceC1455860nzMZ1.g()) != null && (value = liveDataG.getValue()) != null) {
                C1436990nUv.LJIIIZ(value, w2());
                VideoPublishEditModel videoPublishEditModelW2 = w2();
                NLEModel nLEModelLIZ = C352130DrH.LIZ(value);
                C1436990nUv.LJIIIIZZ(videoPublishEditModelW2, nLEModelLIZ != null ? C1429320nIY.LJIIIIZZ(nLEModelLIZ) : false);
            }
            if (!(C1444380ngq.LIZ() && C214728191q.LJ(this.LL, new DialogInterfaceOnDismissListenerC1466680oGo(this, 1), awS601S0100000_22))) {
                EditPageDefaultPrivacySettingFragment editPageDefaultPrivacySettingFragmentLIZJ = C214728191q.LIZJ(H2(this, false, false, 2, null), awS601S0100000_22);
                C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                c1390920mIc.LIZ.LLJJIJI = editPageDefaultPrivacySettingFragmentLIZJ;
                Context sceneContext = this.LLILLJJLI.getSceneContext();
                if (sceneContext != null) {
                    numLIZJ = C1308910kAL.LIZJ(C10BZ.LIZ() ? R.attr.a1b : R.attr.a1e, sceneContext);
                }
                TuxSheet tuxSheet = c1390920mIc.LIZ;
                tuxSheet.LLJI = numLIZJ;
                tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC1466690oGp(c214728191qLJJLIIIJLJLI, editPageDefaultPrivacySettingFragmentLIZJ, this, 0);
                c1390920mIc.LIZLLL(this.LLILLJJLI.mThemeResource, false);
                c1390920mIc.LJIIIIZZ(1);
                c1390920mIc.LIZ.LLJJL = (int) (((double) C0FUC.LIZIZ()) * 0.65d);
                if (C10BZ.LIZ()) {
                    c1390920mIc.LIZJ(true);
                }
                TuxSheet tuxSheet2 = c1390920mIc.LIZ;
                this.LLJI = tuxSheet2;
                if (tuxSheet2 != null) {
                    tuxSheet2.show(C20622515mp.LJIILL(c19eg, this.LLILLJJLI), "PrivacySettingSheet");
                }
            }
            c3();
            PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIIZ = ComplianceServiceProvider.LJIJJ().LJIIIZ(1, "content_reuse_permission");
            if (u4.LJIIJ(w2()) || u4.LJJZZIII(w2())) {
                if ((privacySettingsRestrictionItemLJIIIZ == null || privacySettingsRestrictionItemLJIIIZ.showType != 2) && w2().getCreationMode() != 2) {
                    ComplianceServiceProvider.LJIJJ().LIZ(C545820Lau.LIZ(c19eg, this.LLILLJJLI), C20622515mp.LJIILL(c19eg, this.LLILLJJLI), "edit_sheet");
                }
            }
        }
    }

    @Override // X.InterfaceC1444410ngt
    public LiveData<Boolean> QW() {
        return this.LLJ;
    }

    public InterfaceC1444410ngt X1() {
        return this.LLILLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    private final void T2(int i) {
        ArrayList<InteractionTagUserInfo> tagUserList;
        if (i != 0) {
            w2().playlist_id = null;
            w2().playlist_name = null;
        }
        if (C298680BnG.LIZ() && i == 4) {
            W1(w2());
        }
        ArrayList<InteractionTagUserInfo> tagUserList2 = w2().getTagUserList();
        if (tagUserList2 != null && !tagUserList2.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            if (i != 1) {
                if (i == 2 && (tagUserList = w2().getTagUserList()) != null) {
                    Iterator<InteractionTagUserInfo> it2 = tagUserList.iterator();
                    while (it2.hasNext()) {
                        InteractionTagUserInfo next = it2.next();
                        String str = next.uniqueId;
                        String str2 = next.nickname;
                        if (next.followStatus != 2) {
                            if (this.LLILZLL.booleanValue()) {
                                str = str2;
                            }
                            arrayList.add(str);
                            it2.remove();
                        }
                    }
                }
            } else {
                List<InteractionTagUserInfo> tagUserList3 = w2().getTagUserList();
                if (tagUserList3 == null) {
                    tagUserList3 = C13BV.INSTANCE;
                }
                for (InteractionTagUserInfo interactionTagUserInfo : tagUserList3) {
                    String str3 = interactionTagUserInfo.uniqueId;
                    String str4 = interactionTagUserInfo.nickname;
                    if (this.LLILZLL.booleanValue()) {
                        str3 = str4;
                    }
                    arrayList.add(str3);
                }
                ArrayList<InteractionTagUserInfo> tagUserList4 = w2().getTagUserList();
                if (tagUserList4 != null) {
                    tagUserList4.clear();
                }
            }
            if (!C086I.LIZIZ(arrayList) && arrayList.toString().length() >= 2) {
                String string = arrayList.toString();
                String strJ4 = C786410Ut5.j4(C1664590tQ1.LJII(this).getString(2131849607), Arrays.copyOf(new Object[]{string.substring(1, string.length() - 1)}, 1));
                Activity activityLJII = C1664590tQ1.LJII(this);
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.message(strJ4);
                C1390380mHk.LIZ(activityLJII, 2031, creativeToastBuilder);
            }
        }
    }

    private final void W1(VideoPublishEditModel videoPublishEditModel) {
        InterfaceC1454960nxu interfaceC1454960nxu = (InterfaceC1454960nxu) this.LL.LJIIL(null, InterfaceC1454960nxu.class);
        C1452640nuA.LJII(null, false, videoPublishEditModel.creativeModel.musicBuzModel);
        if (interfaceC1454960nxu != null) {
            interfaceC1454960nxu.lr(false);
        }
    }

    public final void W2(DialogInterface dialogInterface) {
        AbstractC343940De4 abstractC343940De4LJIIJJI;
        if (dialogInterface instanceof DialogInterfaceC1444430ngv) {
            abstractC343940De4LJIIJJI = ((DialogInterfaceC1444430ngv) dialogInterface).LL;
        } else {
            String str = TuxSheet._pnsPageId;
            abstractC343940De4LJIIJJI = C1391190mJ3.LJIIJJI(dialogInterface);
        }
        this.LLJ.setValue(Boolean.FALSE);
        C1451630nsX c1451630nsXO2 = o2();
        if (c1451630nsXO2 != null) {
            c1451630nsXO2.LIZIZ(AFwS261S0000000_22.get$arr$(128));
        }
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        int iIsPrivate = w2().isPrivate();
        String str2 = w2().creativeModel.transientPostPageModel.LJJIIJZLJL;
        if (str2 == null) {
            str2 = "";
        }
        C1403840mdS.LIZLLL(iIsPrivate, "video_edit_page", str2, abstractC343940De4LJIIJJI);
    }

    public final void i3(int i) {
        C214728191q c214728191qLJJLIIIJLJLI = C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI();
        w2().isPrivate = i;
        boolean z = false;
        if (C298680BnG.LIZ()) {
            PrivacySettingModel privacySettingModel = w2().creativeModel.privacySettingModel;
            if (i == 4) {
                z = true;
            }
            privacySettingModel.isSubscribeOnly = z;
        } else {
            w2().creativeModel.privacySettingModel.isSubscribeOnly = false;
        }
        T2(i);
        c214728191qLJJLIIIJLJLI.getClass();
        C1664590tQ1.LJII(this);
        C1444610nhD.LIZ(i);
        C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().getClass();
        C1403840mdS.LJFF(w2(), getEnterFrom(), i, this.LLIZLLLIL, null);
    }

    public C1444420ngu(C1DRG c1drg, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
        C0CHQ.LIZ().getRegionService();
        this.LLILZLL = C20186013yc.LIZIZ();
        this.LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C1451630nsX.class, null);
        this.LLIZLLLIL = -1;
        this.LLJ = new MutableLiveData<>(Boolean.FALSE);
    }

    private final PermissionConfigure G2(boolean z, boolean z2) {
        String string;
        int i = w2().isPrivate;
        VideoPublishEditModel videoPublishEditModelW2 = w2();
        if (z2) {
            string = C0CHQ.LIZ.getResources().getString(2131849125);
        } else {
            string = "";
        }
        return new PermissionConfigure(i, videoPublishEditModelW2, new PostBtnConfigure(z, string), "");
    }

    @Override // X.InterfaceC1444410ngt
    public AbstractC857240Xk2<?> ZJ(Function0<Unit> function0, boolean z, boolean z2) {
        if (!(C1664590tQ1.LJII(this) instanceof C19EG)) {
            return null;
        }
        return C0CHQ.LIZ().getPublishService().LJJLIIIJLJLI().LIZ((C19EG) C1664590tQ1.LJII(this), w2(), G2(true, z), new DialogInterfaceOnDismissListenerC1466680oGo(this, 0), new AwS423S0200000_22((Function0) function0, (Function0<Unit>) this, (C1444420ngu) 33), new AwS601S0100000_22(this, 211), z2, null);
    }

    public static /* synthetic */ PermissionConfigure H2(C1444420ngu c1444420ngu, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z2 = false;
            }
            return c1444420ngu.G2(z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPermissionConfig");
    }
}
