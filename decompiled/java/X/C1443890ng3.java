package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.creative.model.SocialAvatarUpdateInfoStruct;
import com.ss.android.ugc.aweme.editSticker.model.CoverNewItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ng3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1443890ng3 extends AbstractC2255721DQs<InterfaceC1457660o2G> implements InterfaceC1457660o2G, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC578380MmK.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public final InterfaceC1731706qJ LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1457660o2G LLJ = this;
    public final C01GW LLJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 288));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1443890ng3.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1443890ng3.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1443890ng3.class, "editExitHelper", "getEditExitHelper()Lcom/ss/android/ugc/gamora/editor/exit/IEditExitHelper;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1443890ng3.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1443890ng3.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
        LLJILJIL = 8;
    }

    private final InterfaceC578380MmK X1() {
        return (InterfaceC578380MmK) this.LLILZLL.getValue(this, LLJIJIL[2]);
    }

    private final InterfaceC1461650o8h Z1() {
        return (InterfaceC1461650o8h) this.LLJI.getValue();
    }

    public final Activity getActivity() {
        return (Activity) this.LLIZ.getValue(this, LLJIJIL[3]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    public final InterfaceC1455860nzM o2() {
        return (InterfaceC1455860nzM) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    public final AbstractC214814194y w2() {
        return (AbstractC214814194y) this.LLIZLLLIL.getValue(this, LLJIJIL[4]);
    }

    private final boolean G2() {
        if (!getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar) {
            return false;
        }
        if (!getEditModel().creativeModel.changeAvatarModel.isSingletonRecover && getEditModel().mIsFromDraft) {
            return false;
        }
        Lq1();
        return true;
    }

    @Override // X.InterfaceC1457660o2G
    public boolean KP2() {
        return G2();
    }

    @Override // X.InterfaceC1457660o2G
    public void Lq1() {
        InterfaceC578380MmK interfaceC578380MmKX1 = X1();
        if (interfaceC578380MmKX1 != null) {
            interfaceC578380MmKX1.ou(new ARunnableS122S0100000_22(this, 34));
        } else {
            C580230MpJ.LIZ = null;
            w2().finish();
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [T, kotlin.Pair] */
    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getEditModel().creativeModel.changeAvatarModel.isFromChangeAvatar) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1457600o2A.class, new AwS601S0100000_22(this, 194));
            if (!C2354709Kn.LIZIZ(getEditModel().getVideoCoverPath())) {
                getEditModel().setVideoCoverPath(getEditModel().creativeModel.changeAvatarModel.coverPath);
                if (C2286708xd.LIZJ(getEditModel().creativeModel.changeAvatarModel.coverPath)) {
                    C0MH8.LIZ.LIZ(getEditModel(), new CoverNewItem(LSPassThroughRecordSizeConfig.DEFAULT, getEditModel().creativeModel.changeAvatarModel.coverPath, 1, null, 0L, null, null, 120, null), false);
                }
            }
            if (!getEditModel().mIsFromDraft || getEditModel().creativeModel.changeAvatarModel.isSingletonRecover) {
                final String strLJJJJLL = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJJJLL(getEditModel().getCreativeInfo());
                final C259800zU c259800zU = new C259800zU();
                c259800zU.element = C1428520nHG.LJJIIJZLJL(getEditModel(), true, null, true, 2);
                o2().ww2().observe(this, new Observer() { // from class: X.0ng6
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        Pair<String, Integer> pair = c259800zU.element;
                        if (pair != null) {
                            final C1443890ng3 c1443890ng3 = this;
                            final String str = strLJJJJLL;
                            C1456230nzx c1456230nzx = new C1456230nzx(c1443890ng3.getEditModel());
                            InterfaceC1452170ntP value = c1443890ng3.o2().g().getValue();
                            C1457050o1H c1457050o1H = c1456230nzx.LIZ;
                            c1457050o1H.LJIIIIZZ = value;
                            c1457050o1H.LIZIZ = str;
                            int iIntValue = pair.getSecond().intValue();
                            C1457050o1H c1457050o1H2 = c1456230nzx.LIZ;
                            c1457050o1H2.LJFF = iIntValue;
                            c1457050o1H2.LJIIJ = new InterfaceC1457180o1U() { // from class: X.0ng5
                                @Override // X.InterfaceC1457180o1U
                                public final void onError(int i, String str2) {
                                    InterfaceC1452170ntP value2 = c1443890ng3.o2().g().getValue();
                                    if (value2 != null) {
                                        value2.play();
                                    }
                                    C201955140j.LJ(str2);
                                }
                            };
                            c1457050o1H2.LIZJ = new C0MBV() { // from class: X.0ng4
                                @Override // X.C0MBV
                                public final void LIZLLL() {
                                    InterfaceC1452170ntP value2 = c1443890ng3.o2().g().getValue();
                                    if (value2 != null) {
                                        value2.play();
                                    }
                                    c1443890ng3.getEditModel().setVideoCoverPath(str);
                                }
                            };
                            C1457060o1I.LIZIZ(c1457050o1H2);
                        }
                    }
                });
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        if (getEditModel().isFromCrash()) {
            C580230MpJ.LIZ = null;
        }
    }

    public InterfaceC1457660o2G W1() {
        return this.LLJ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public final C19A3 getParentScene() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1457660o2G
    public void LJJJJJ(int i) {
        Iterator<String> it2 = getEditModel().creativeModel.changeAvatarModel.stickerIds.iterator();
        while (it2.hasNext()) {
            Z1().cF1(it2.next(), i);
        }
    }

    @Override // X.InterfaceC1457660o2G
    public void RE(Function0<Unit> function0, Function1<? super Exception, Unit> function1) {
        String str;
        Function1<Boolean, Unit> function12 = this.LLILLL;
        Boolean bool = Boolean.TRUE;
        function12.invoke(bool);
        if (getEditModel().creativeModel.changeAvatarModel.isFromSocialAvatar) {
            SocialAvatarUpdateInfoStruct socialAvatarUpdateInfoStruct = getEditModel().creativeModel.changeAvatarModel.socialAvatarUpdateInfoStruct;
            if (Intrinsics.LJFF(socialAvatarUpdateInfoStruct.getNeedUpdate(), bool)) {
                C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1443830nfx(this, socialAvatarUpdateInfoStruct, function0, function1, null), 3);
                return;
            } else {
                this.LLILLL.invoke(Boolean.FALSE);
                function0.invoke();
                return;
            }
        }
        if (getEditModel().creativeModel.changeAvatarModel.isFromAiVatar) {
            str = "2";
        } else {
            str = "1";
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C1443870ng1(this, str, function0, function1, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1443890ng3(C1DRG c1drg, C19A3 c19a3, Function1<? super Boolean, Unit> function1) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = function1;
    }
}
