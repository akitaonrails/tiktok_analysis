package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.ui.RecordConfig;
import com.ss.android.ugc.aweme.shortvideo.model.ShootExtraData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dsq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067420dsq extends AbstractC1066970ds7 {
    @Override // X.AbstractC1066970ds7
    public final boolean LJJIJIL() {
        return true;
    }

    @Override // X.InterfaceC1393560mMs
    public final InterfaceC1393560mMs clone() {
        return new C1067420dsq();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final int type() {
        return EnumC1430380nKG.CT_FILTER_ANCHOR.getTYPE();
    }

    @Override // X.AbstractC1066890drz, X.InterfaceC1393560mMs
    public final EnumC1050190dR3 LJJJJLL(List<AnchorCommonStruct> list) {
        if (!C1067430dsr.LIZ()) {
            C19719612Di.LJJIIJ(list, new C1067410dsp(this), true);
            return EnumC1050190dR3.NOT_FOUND;
        }
        return super.LJJJJLL(list);
    }

    @Override // X.AbstractC1066970ds7
    public final void LJJIJL(final View view, C2344009Gk c2344009Gk, String str) {
        final String strLJIJJLI;
        if (AbstractC1066970ds7.LJJIJIIJI(this)) {
            return;
        }
        if (Intrinsics.LJFF(str, "anchor")) {
            strLJIJJLI = LJIJJLI();
        } else {
            strLJIJJLI = "anchor_combine_page";
        }
        IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
        if (iExternalService != null) {
            iExternalService.asyncService("FilterAnchor", new IExternalService.ServiceLoadCallback() { // from class: X.0Mex
                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onDismiss() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onFailed() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onOK() {
                    IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
                }

                @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                public final void onLoad(AsyncAVService asyncAVService, long j) {
                    Activity activityLIZ;
                    String dataFromExtra;
                    String dataFromExtra2;
                    Context context = view.getContext();
                    if (context != null && (activityLIZ = C085T.LIZ(context)) != null) {
                        C1067420dsq c1067420dsq = this;
                        String str2 = strLJIJJLI;
                        AnchorCommonStruct anchorCommonStruct = c1067420dsq.LLIZ;
                        InterfaceC1392640mLO interfaceC1392640mLO = null;
                        if (anchorCommonStruct != null) {
                            dataFromExtra = anchorCommonStruct.getDataFromExtra("third_id", "");
                        } else {
                            dataFromExtra = null;
                        }
                        AnchorCommonStruct anchorCommonStruct2 = c1067420dsq.LLIZ;
                        if (anchorCommonStruct2 != null && (dataFromExtra2 = anchorCommonStruct2.getDataFromExtra("resource_id", "")) != null && dataFromExtra2.length() != 0 && dataFromExtra != null && dataFromExtra.length() != 0) {
                            RecordConfig.Builder builder = new RecordConfig.Builder();
                            builder.creationId(C0DMI.LIZ());
                            builder.shootWay("filter_anchor");
                            builder.enterFrom(str2);
                            builder.enterMethod(c1067420dsq.LJIJJ());
                            builder.initialFilterConfig(dataFromExtra, dataFromExtra2);
                            builder.shootExtraData(new ShootExtraData(null, null, null, null, null, null, null, null, null, null, null, Integer.valueOf(c1067420dsq.LJIIZILJ().getAwemeType()), null, null, null, null, null, null, null, null, null, null, null, null, 16775167, null));
                            RecordConfig recordConfigBuild = builder.build();
                            C575870MiH c575870MiH = new C575870MiH();
                            c575870MiH.LIZ(recordConfigBuild);
                            c575870MiH.LIZ.setRecordConfig(recordConfigBuild);
                            c575870MiH.LIZ.setHasRecordEntrance(true);
                            c575870MiH.LIZ.setEnableLivePhoto(true);
                            asyncAVService.uiService().recordService().startAlbum(activityLIZ, c575870MiH.LIZ, true);
                            asyncAVService.uiService().recordService().preloadFilterResource(dataFromExtra, dataFromExtra2, 3L);
                            return;
                        }
                        InterfaceC1392640mLO interfaceC1392640mLO2 = c1067420dsq.LL;
                        if (interfaceC1392640mLO2 != null) {
                            interfaceC1392640mLO = interfaceC1392640mLO2;
                        }
                        C1389890mGx c1389890mGx = new C1389890mGx(interfaceC1392640mLO.LIZIZ());
                        c1389890mGx.LJIIIZ(2131848597);
                        c1389890mGx.LJIIJJI();
                    }
                }
            });
        }
    }
}
