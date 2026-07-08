package X;

import android.os.Bundle;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.NLEInfoModel;
import com.ss.android.ugc.aweme.creative.model.forward.OnThisDayPostData;
import com.ss.android.ugc.aweme.edit.Cut2EditTransferModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0Mf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C573930Mf9 extends AbstractC2255721DQs<InterfaceC376040Eok> implements InterfaceC376040Eok, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJILJ;
    public static final int LLJILLL;
    public final C1DRG LL;
    public volatile boolean LLIZ;
    public volatile boolean LLIZLLLIL;
    public final C560530Lyd<Unit> LLJI;
    public final LiveEvent<Unit> LLJIJIL;
    public final InterfaceC1731706qJ LLJILJIL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC366390EYb.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), C21378018lO.class, null);
    public C560530Lyd<NLEModel> LLJ = new C560530Lyd<>();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C573930Mf9.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C573930Mf9.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C573930Mf9.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C573930Mf9.class, "editControlApi", "getEditControlApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/editcontrol/EditControlApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C573930Mf9.class, "taskScheduler", "getTaskScheduler()Lcom/ss/android/ugc/aweme/creative/taskscheduler/scheduler/TaskScheduler;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(C573930Mf9.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        LLJILJILJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6};
        LLJILLL = 8;
    }

    public InterfaceC376040Eok W1() {
        return this;
    }

    private final C21378018lO G2() {
        return (C21378018lO) this.LLILZLL.getValue(this, LLJILJILJ[4]);
    }

    private final InterfaceC1455850nzL X1() {
        return (InterfaceC1455850nzL) this.LLJILJIL.getValue(this, LLJILJILJ[5]);
    }

    private final AbstractC214814194y w2() {
        return (AbstractC214814194y) this.LLILLJJLI.getValue(this, LLJILJILJ[0]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJILJILJ[2]);
    }

    public final InterfaceC366390EYb Z1() {
        return (InterfaceC366390EYb) this.LLILZIL.getValue(this, LLJILJILJ[3]);
    }

    public final VideoPublishEditModel o2() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLJILJILJ[1]);
    }

    private final boolean m3() {
        Cut2EditTransferModel cut2EditTransferModel;
        if (o2().mIsFromDraft || o2().isFromRestoreRecover() || o2().isEnterFromBulletin()) {
            return false;
        }
        return (q3() && (cut2EditTransferModel = o2().getCut2EditTransferModel()) != null && cut2EditTransferModel.getMusicSyncMode()) || (C1428470nHB.LLIIJI(o2()) || C1428470nHB.LLIIIZ(o2()) || o2().isMvThemeVideoType() || (o2().isCurrentAutoCutMode() && !C1428470nHB.LJJJZ(o2())));
    }

    private final boolean q3() {
        if (C1428470nHB.LJIIZILJ(o2())) {
            return ((C301570Brv.LIZ() || C301790BsH.LIZ()) && o2().isFromRestoreRecover()) ? false : true;
        }
        return false;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        boolean zLJI = MethodIDManager.LJI(202422);
        super.onCreate();
        X1().Di0(this);
        if ((C1428470nHB.LLIIJI(o2()) || C1428470nHB.LLIIIZ(o2()) || q3()) && o2().mIsFromDraft && !o2().isFromRestoreRecover()) {
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (o2().isEnterFromBulletin()) {
            if (zLJI) {
                MethodIDManager.LJ();
            }
        } else {
            if (((Boolean) C0BDX.LIZ.getValue()).booleanValue() && m3()) {
                C571450Mb9.LIZ(C0MAY.LIZIZ, "EditDraftComponent skip first saveCheckPoint for async apply");
                if (zLJI) {
                    MethodIDManager.LJ();
                    return;
                }
                return;
            }
            Tx0(null);
            if (zLJI) {
                MethodIDManager.LJ();
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        X1().Di0(null);
    }

    @Override // X.InterfaceC376040Eok
    public boolean vi0() {
        return C298240BmY.LIZ() ? this.LLIZLLLIL : this.LLIZ;
    }

    @Override // X.InterfaceC376040Eok
    public LiveEvent<NLEModel> Pk2() {
        return this.LLJ;
    }

    @Override // X.InterfaceC376040Eok
    public LiveEvent<Unit> du1() {
        return this.LLJIJIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C573930Mf9(C1DRG c1drg) {
        this.LL = c1drg;
        C560530Lyd<Unit> c560530Lyd = new C560530Lyd<>();
        this.LLJI = c560530Lyd;
        this.LLJIJIL = c560530Lyd;
        this.LLJILJIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    }

    private final void T2(C540340LHc c540340LHc) {
        if (c540340LHc.LIZ.getErrorCode() == 0 && (!c540340LHc.LIZIZ.LJIJJ.isEmpty())) {
            C0CNO.LIZLLL(0L, new AwS406S0200000_5(this, c540340LHc, 23));
        }
    }

    private final void W2(CreativeModel creativeModel) {
        ArrayList<OnThisDayPostData> postDataList;
        HashMap<String, String> map;
        if (creativeModel.onThisDayData.isFromOnThisDay() && C566780MKu.LIZ(creativeModel) && (postDataList = creativeModel.onThisDayData.getPostDataList()) != null) {
            ArrayList arrayList = new ArrayList();
            for (OnThisDayPostData onThisDayPostData : postDataList) {
                if (onThisDayPostData.getRecallType() == 2) {
                    arrayList.add(onThisDayPostData);
                }
            }
            if (arrayList.isEmpty() || (map = creativeModel.nleInfoModel.copyResMap) == null || map.isEmpty()) {
                return;
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ArrayList<String> resList = ((OnThisDayPostData) it2.next()).getResList();
                if (resList != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it3 = resList.iterator();
                    while (it3.hasNext()) {
                        String str = map.get(it3.next());
                        if (str != null) {
                            arrayList2.add(new C0VSJ(str).getName());
                        }
                    }
                    resList.addAll(arrayList2);
                }
            }
        }
    }

    @Override // X.InterfaceC376040Eok
    public void Tx0(Function1<? super C540340LHc, Unit> function1) {
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value = JY0().g().getValue();
        String string = null;
        if (value != null) {
            nLEModelLIZ = C352130DrH.LIZ(value);
        } else {
            nLEModelLIZ = null;
        }
        if (C1440390naP.LIZIZ(o2(), nLEModelLIZ)) {
            this.LLJI.LJIIJ(Unit.LIZ);
            return;
        }
        Bundle argumentsSafely = w2().getArgumentsSafely();
        if (argumentsSafely != null) {
            string = argumentsSafely.getString("file_path");
        }
        if (string != null && string.length() != 0) {
            C0L0K.LIZ(string, new AwS374S0200000_8(this, (C573930Mf9) function1, (Function1<? super C540340LHc, Unit>) 107));
            return;
        }
        if (!o2().creativeModel.commerceModel.getMusicContext().getInPromoteReplaceMusicScene() && !C1416310mxZ.LJJJJZI(o2()) && !C1428470nHB.LLIIIJ(o2())) {
            this.LLIZ = true;
            JY0().oL2();
            i3(new C573940MfA(this, function1));
        } else {
            if (!C1428470nHB.LLIIIJ(o2())) {
                return;
            }
            if (C297610BlX.LIZ() && C1428470nHB.LJLILLLLZI(o2())) {
                C0CHQ.LIZ().LJIIJ().LJI(1, o2(), o2().getCreationId());
            }
            this.LLIZLLLIL = true;
        }
    }

    @Override // X.InterfaceC376040Eok
    public void gh0(Function1<? super C540340LHc, Unit> function1) {
        if (!this.LLIZ) {
            Tx0(function1);
        }
    }

    public final void i3(Function1<? super C540340LHc, Unit> function1) {
        if (G2() != null) {
            C21378018lO c21378018lOG2 = G2();
            if (c21378018lOG2 != null) {
                c21378018lOG2.UM2(new C573970MfD(getDiContainer(), function1));
                return;
            }
            return;
        }
        C0CHQ.LIZ().LJIIJ().LJIILIIL(o2(), o2().getCreationId(), 1, null, function1);
        if (!C297610BlX.LIZ() || !C1428470nHB.LJLILLLLZI(o2())) {
            return;
        }
        C0CHQ.LIZ().LJIIJ().LJI(1, o2(), o2().getCreationId());
    }

    private final void H2(VideoPublishEditModel videoPublishEditModel, C540340LHc c540340LHc) {
        if (c540340LHc.LIZ.getErrorCode() == 0 && (!c540340LHc.LIZIZ.LJIJJ.isEmpty())) {
            C0CNO.LIZLLL(0L, new AwS409S0200000_8(videoPublishEditModel, c540340LHc, 82));
        }
    }

    public static final void c3(C573930Mf9 c573930Mf9, Function1<? super C540340LHc, Unit> function1, C540340LHc c540340LHc) {
        NLEInfoModel nLEInfoModel = c573930Mf9.o2().creativeModel.nleInfoModel;
        if (nLEInfoModel.copyResMap == null) {
            nLEInfoModel.copyResMap = new HashMap<>();
        }
        HashMap<String, String> map = nLEInfoModel.copyResMap;
        if (map != null) {
            map.putAll(c540340LHc.LIZIZ.LJIJJ);
        }
        if (function1 != null) {
            function1.invoke(c540340LHc);
        }
        c573930Mf9.LLIZLLLIL = true;
        c573930Mf9.LLJI.LJIIJ(Unit.LIZ);
    }
}
