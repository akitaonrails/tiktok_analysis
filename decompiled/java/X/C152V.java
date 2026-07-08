package X;

import com.bytedance.android.livesdk.livesetting.message.LivePreviewGameMomentSetting;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentData;
import com.bytedance.android.livesdk.model.message.PreviewGameMomentMessage;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.152V, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.moment.preview.PreviewGameMomentPresenter$onIMMessage$1", f = "PreviewGameMomentPresenter.kt", l = {225}, m = "invokeSuspend")
public final class C152V extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C152W LLILLJJLI;
    public final /* synthetic */ PreviewGameMomentMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C152V(C152W c152w, PreviewGameMomentMessage previewGameMomentMessage, InterfaceC1364105Vn<? super C152V> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c152w;
        this.LLILLL = previewGameMomentMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C152V(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C152W c152w = this.LLILLJJLI;
            PreviewGameMomentMessage previewGameMomentMessage = this.LLILLL;
            c152w.getClass();
            List<PreviewGameMomentData> list = previewGameMomentMessage.momentDataList;
            ArrayList arrayList = new ArrayList();
            for (PreviewGameMomentData previewGameMomentData : list) {
                if (LivePreviewGameMomentSetting.INSTANCE.supportGameMomentType().contains(Integer.valueOf(previewGameMomentData.previewGameInfoType))) {
                    arrayList.add(previewGameMomentData);
                }
            }
            PreviewGameMomentData previewGameMomentData2 = (PreviewGameMomentData) C13LP.LJJJLZIJ(0, arrayList);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onIMMessage, message: ");
            sbLIZ.append(this.LLILLL);
            C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ));
            if (previewGameMomentData2 == null) {
                this.LLILLJJLI.LIZJ = null;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                return unit;
            }
            InterfaceC204548152c interfaceC204548152cVI1 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).VI1();
            if (interfaceC204548152cVI1 == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                return unit2;
            }
            if (interfaceC204548152cVI1.LIZJ()) {
                C152W c152w2 = this.LLILLJJLI;
                if (c152w2.LJI == null) {
                    c152w2.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("collectGameMomentFeature, gameMomentData: ");
                    sbLIZ2.append(previewGameMomentData2);
                    C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                    InterfaceC204548152c interfaceC204548152cVI12 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).VI1();
                    if (interfaceC204548152cVI12 != null && interfaceC204548152cVI12.LIZLLL()) {
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(previewGameMomentData2.gameTagId), "g_preview_fusion_tag_id");
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(previewGameMomentData2.gameTagName, "g_preview_fusion_tag_name");
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Integer.valueOf(previewGameMomentData2.gameMomentMessageType), "g_preview_game_moment_type");
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(previewGameMomentData2.eventTime), "g_preview_game_moment_event_time");
                        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Long.valueOf(previewGameMomentData2.maxTime), "g_preview_game_moment_event_max");
                    }
                    if (this.LLILLJJLI.LJII.get()) {
                        Unit unit3 = Unit.LIZ;
                        C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                        return unit3;
                    }
                    this.LLILLJJLI.LJII.set(true);
                    boolean zLIZIZ = interfaceC204548152cVI1.LIZIZ(this.LLILLJJLI.LJIIIIZZ);
                    this.LLILLJJLI.LJI = Boolean.valueOf(zLIZIZ);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("aiInfer finish, aiResult: ");
                    sbLIZ3.append(this.LLILLJJLI.LJI);
                    C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                    this.LLILLJJLI.LJII.set(false);
                    if (!zLIZIZ) {
                        Unit unit4 = Unit.LIZ;
                        C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                        return unit4;
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("aiInfer cache, aiResult: ");
                    sbLIZ4.append(this.LLILLJJLI.LJI);
                    C20441214yg.LIZIZ("PreviewGameMomentAIStrategy", C2188811AlT.LIZIZ(sbLIZ4));
                    Boolean bool = this.LLILLJJLI.LJI;
                    if (bool != null) {
                        if (!bool.booleanValue()) {
                            Unit unit5 = Unit.LIZ;
                            C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                            return unit5;
                        }
                    } else {
                        Unit unit6 = Unit.LIZ;
                        C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                        return unit6;
                    }
                }
            }
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C152X c152x = new C152X(this.LLILLJJLI, previewGameMomentData2, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c152x) == objLJFF) {
                C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
                return objLJFF;
            }
        }
        Unit unit7 = Unit.LIZ;
        C1C7U.LIZIZ("PreviewGameMomentPresenter@53d.onIMMessage$1");
        return unit7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
