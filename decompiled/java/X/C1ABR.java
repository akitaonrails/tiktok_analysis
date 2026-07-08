package X;

import com.bytedance.android.livesdk.comp.api.event.api.data.LiveEventModule;
import com.ss.android.ugc.aweme.feed.adapter.widget.masklayer.PreviewMaskLayerVM;
import com.ss.android.ugc.aweme.feed.model.live.LiveEventInfo;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ABR, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ABR extends C09AY implements Function0<C1ABK> {
    public final /* synthetic */ PreviewMaskLayerVM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1ABR(PreviewMaskLayerVM previewMaskLayerVM) {
        super(0);
        this.LL = previewMaskLayerVM;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.1ABK] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1ABK invoke() {
        final PreviewMaskLayerVM previewMaskLayerVM = this.LL;
        return new InterfaceC1141530foN() { // from class: X.1ABK
            @Override // X.InterfaceC1141530foN
            public final void mh2(C262100zr c262100zr) {
                InterfaceC1107590evd interfaceC1107590evd;
                LiveEventModule liveEventModuleLIZ;
                Long lValueOf;
                LiveRoomStruct liveRoomStruct;
                LiveEventInfo liveEventInfo;
                LiveRoomStruct liveRoomStruct2;
                LiveEventInfo liveEventInfo2;
                LiveRoomStruct liveRoomStruct3;
                LiveEventInfo liveEventInfo3;
                if (!Intrinsics.LJFF(c262100zr.LIZ, "live_event_update_result") || (interfaceC1107590evd = c262100zr.LIZIZ) == null || (liveEventModuleLIZ = C477390Inp.LIZ(interfaceC1107590evd)) == null) {
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPaidSuccessEvent: event:");
                sbLIZ.append(liveEventModuleLIZ.id);
                sbLIZ.append(" + info:");
                C1ACA c1acaVQ2 = previewMaskLayerVM.vQ2();
                Long lValueOf2 = null;
                if (c1acaVQ2 != null && (liveRoomStruct3 = c1acaVQ2.LIZJ) != null && (liveEventInfo3 = liveRoomStruct3.liveEventInfo) != null) {
                    lValueOf = Long.valueOf(liveEventInfo3.id);
                } else {
                    lValueOf = null;
                }
                sbLIZ.append(lValueOf);
                C20441214yg.LIZIZ("PreviewMaskLayerVM", C2188811AlT.LIZIZ(sbLIZ));
                if (C500260Jjc.LJJIIZ(liveEventModuleLIZ.id)) {
                    String str = liveEventModuleLIZ.id;
                    C1ACA c1acaVQ22 = previewMaskLayerVM.vQ2();
                    if (c1acaVQ22 != null && (liveRoomStruct2 = c1acaVQ22.LIZJ) != null && (liveEventInfo2 = liveRoomStruct2.liveEventInfo) != null) {
                        lValueOf2 = Long.valueOf(liveEventInfo2.id);
                    }
                    if (Intrinsics.LJFF(str, String.valueOf(lValueOf2))) {
                        PreviewMaskLayerVM previewMaskLayerVM2 = previewMaskLayerVM;
                        C1ACA c1acaVQ23 = previewMaskLayerVM2.vQ2();
                        if (c1acaVQ23 != null && (liveRoomStruct = c1acaVQ23.LIZJ) != null && (liveEventInfo = liveRoomStruct.liveEventInfo) != null) {
                            liveEventInfo.setSubscribed(true);
                        }
                        previewMaskLayerVM2.LLILLJJLI.setValue(Boolean.FALSE);
                        previewMaskLayerVM2.LLILLL.setValue(new C1ABE(true));
                    }
                }
            }
        };
    }
}
