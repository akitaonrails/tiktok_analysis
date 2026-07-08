package Y;

import X.C09JN;
import X.C09W6;
import X.C1161920gLG;
import X.C118300cf;
import X.C1388190mED;
import X.C1389890mGx;
import X.C1799190wv7;
import X.C1809970xCV;
import X.C1810070xCf;
import X.C1810210xCt;
import X.C1812020xFo;
import X.C1909107dp;
import X.C1C7U;
import X.C2382909Vj;
import X.C259800zU;
import X.C470590Icr;
import X.C497740JfY;
import X.C501470JlZ;
import X.C782110Um9;
import X.C786410Ut5;
import X.InterfaceC1798940wui;
import X.InterfaceC420801kM;
import X.InterfaceC743640TFa;
import android.app.Activity;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceManager;
import com.bytedance.android.live.rank.impl.list.viewmodel.RankRootViewModel;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import com.bytedance.android.livesdkapi.host.IHostResource;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.minis.jsb.impl.drama.MinisDramaInfoResp;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes28.dex */
public class AfS116S0300000_27 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS116S0300000_27 afS116S0300000_27, Object obj) {
        C1C7U.LIZ("RankEntranceManager@d691.queryRankEntranceData$rankDisposable$1");
        C118300cf c118300cf = (C118300cf) afS116S0300000_27.l1;
        RankEntranceManager rankEntranceManager = (RankEntranceManager) afS116S0300000_27.l0;
        ARunnableS35S0400000_27 aRunnableS35S0400000_27 = new ARunnableS35S0400000_27(c118300cf, rankEntranceManager, (C470590Icr) obj, (C259800zU) afS116S0300000_27.l2, 2);
        if (!rankEntranceManager.LLJJJ) {
            aRunnableS35S0400000_27.run();
        } else {
            rankEntranceManager.LLJJIJIL.add(aRunnableS35S0400000_27);
        }
        C1C7U.LIZIZ("RankEntranceManager@d691.queryRankEntranceData$rankDisposable$1");
    }

    public static final void accept$1(AfS116S0300000_27 afS116S0300000_27, Object obj) {
        C1C7U.LIZ("UserActionMethod@38d4.followFromWeb$4");
        Throwable th = (Throwable) obj;
        C1812020xFo c1812020xFo = (C1812020xFo) afS116S0300000_27.l0;
        Context context = (Context) afS116S0300000_27.l1;
        CompletionBlock completionBlock = (CompletionBlock) afS116S0300000_27.l2;
        c1812020xFo.getClass();
        if (th instanceof C501470JlZ) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            int errorCode = c501470JlZ.getErrorCode();
            if (errorCode != 20065) {
                if (errorCode != 4002173) {
                    C2382909Vj.LIZ(completionBlock, 0, c501470JlZ.getErrorMsg(), null, 4);
                } else {
                    String strOQ1 = ((IHostResource) C1161920gLG.LIZJ(IHostResource.class)).OQ1(context);
                    FollowPair followPair = c1812020xFo.LLILZ;
                    if (followPair != null) {
                        C782110Um9 c782110Um9 = new C782110Um9(context);
                        c782110Um9.LJIIIZ(strOQ1);
                        c782110Um9.LJIILIIL(2131851918, new AcS85S0400000_27(c1812020xFo, context, followPair, completionBlock, 2));
                        c782110Um9.LJIIJ(2131844609, new InterfaceC743640TFa() { // from class: X.0xFn
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        C786410Ut5.E4(c782110Um9.LIZ());
                    }
                }
            } else {
                Activity activityLIZ = C1388190mED.LIZ(context);
                if (activityLIZ != null) {
                    String prompt = c501470JlZ.getPrompt();
                    C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
                    if (prompt == null || prompt.length() == 0) {
                        prompt = C497740JfY.LJIJI(2131853447);
                    }
                    c1389890mGx.LJIIJ(prompt);
                    c1389890mGx.LJIIJJI();
                }
                String errorMsg = c501470JlZ.getErrorMsg();
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C09W6.class, null);
                ((C09W6) xBaseModelLIZJ).setErrorCode(Integer.valueOf(errorCode));
                completionBlock.onFailure(0, errorMsg, (XBaseResultModel) xBaseModelLIZJ);
            }
        } else {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            C2382909Vj.LIZ(completionBlock, 0, message, null, 4);
        }
        C1C7U.LIZIZ("UserActionMethod@38d4.followFromWeb$4");
    }

    public static final void accept$2(AfS116S0300000_27 afS116S0300000_27, Object obj) {
        C1C7U.LIZ("RankRootViewModel@6c76.requestListDataLeague$disposable$2");
        RankRootViewModel rankRootViewModel = (RankRootViewModel) afS116S0300000_27.l0;
        RankTypeV2 rankTypeV2 = (RankTypeV2) afS116S0300000_27.l1;
        int i = rankTypeV2.type;
        int i2 = rankTypeV2.rankPhase;
        C1810070xCf c1810070xCf = (C1810070xCf) afS116S0300000_27.l2;
        rankRootViewModel.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1809970xCV(rankRootViewModel.vQ2(rankRootViewModel.LLJ)));
        rankRootViewModel.LLJILJILJ.postValue(arrayList);
        C1810210xCt.LJI((Throwable) obj, i, i2, c1810070xCf.LIZ, c1810070xCf.LIZIZ, c1810070xCf.LIZJ, c1810070xCf.LIZLLL);
        C1C7U.LIZIZ("RankRootViewModel@6c76.requestListDataLeague$disposable$2");
    }

    public static final void accept$3(AfS116S0300000_27 afS116S0300000_27, Object obj) {
        C1C7U.LIZ("MinisGetDramaInfoMethodIDL@7ace.handle$1");
        MinisDramaInfoResp minisDramaInfoResp = (MinisDramaInfoResp) obj;
        Integer num = minisDramaInfoResp.statusCode;
        if (num != null && num.intValue() != 0) {
            CompletionBlock completionBlock = (CompletionBlock) afS116S0300000_27.l0;
            int iIntValue = minisDramaInfoResp.statusCode.intValue();
            String str = minisDramaInfoResp.statusMsg;
            if (str == null) {
                str = "Unknown error";
            }
            C2382909Vj.LIZ(completionBlock, iIntValue, str, null, 4);
        } else {
            InterfaceC1798940wui interfaceC1798940wui = (InterfaceC1798940wui) C1909107dp.LIZJ(InterfaceC1798940wui.class, null);
            interfaceC1798940wui.setData(minisDramaInfoResp.data);
            ((CompletionBlock) afS116S0300000_27.l0).onSuccess(interfaceC1798940wui, "");
        }
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS116S0300000_27.l1).element;
        if (interfaceC420801kM != null) {
            ((C1799190wv7) afS116S0300000_27.l2).LLILLL.LIZJ(interfaceC420801kM);
        }
        C1C7U.LIZIZ("MinisGetDramaInfoMethodIDL@7ace.handle$1");
    }

    public static final void accept$4(AfS116S0300000_27 afS116S0300000_27, Object obj) {
        C1C7U.LIZ("MinisGetDramaInfoMethodIDL@7ace.handle$2");
        CompletionBlock completionBlock = (CompletionBlock) afS116S0300000_27.l0;
        String message = ((Throwable) obj).getMessage();
        if (message == null) {
            message = "Unknown error";
        }
        C2382909Vj.LIZ(completionBlock, -1, message, null, 4);
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS116S0300000_27.l1).element;
        if (interfaceC420801kM != null) {
            ((C1799190wv7) afS116S0300000_27.l2).LLILLL.LIZJ(interfaceC420801kM);
        }
        C1C7U.LIZIZ("MinisGetDramaInfoMethodIDL@7ace.handle$2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AfS116S0300000_27(Object obj, RankEntranceManager rankEntranceManager, C118300cf c118300cf, C259800zU<Throwable> c259800zU) {
        this.$t = c259800zU;
        this.l0 = obj;
        this.l1 = rankEntranceManager;
        this.l2 = c118300cf;
    }
}
