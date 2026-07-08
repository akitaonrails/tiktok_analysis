package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.IMultiGuestMicSeatEmojiApi;
import com.bytedance.android.live.liveinteract.multilive.social.model.SendStageReactionReq;
import com.bytedance.android.live.liveinteract.multilive.social.model.StageReactionResource;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.EmojiProhibitClickIntervalTimeSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01Rl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.guestpanel.emojis.MicSeatEmojiListViewModel$sendEmojiMessage$1", f = "MicSeatEmojiListViewModel.kt", l = {126}, m = "invokeSuspend")
public final class C334301Rl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;
    public final /* synthetic */ C336201Se LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C334301Rl(LiveEffect liveEffect, C336201Se c336201Se, InterfaceC1364105Vn<? super C334301Rl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveEffect;
        this.LLILLL = c336201Se;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C334301Rl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        StageReactionResource stageReactionResource;
        C1C7U.LIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1");
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
            String resourceId = this.LLILLJJLI.getResourceId();
            Iterable iterable = (Iterable) this.LLILLL.LIZIZ.getValue();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList.add(((LiveEffect) it2.next()).getResourceId());
            }
            C01ZF.LIZIZ(resourceId, "click", arrayList);
            C336201Se c336201Se = this.LLILLL;
            LiveEffect liveEffect = this.LLILLJJLI;
            c336201Se.getClass();
            n nVarLJIILIIL = GsonProtectorUtils.parse(new p(), liveEffect.getExtra()).LJIILIIL();
            if (Intrinsics.LJFF(nVarLJIILIIL.LJJIIZ("resource_type").LJIL(), "multi")) {
                try {
                    String strLJIL = nVarLJIILIIL.LJJIIZ("resource_ids").LJIL();
                    new p();
                    h hVarLJIIL = p.LIZJ(strLJIL).LJIIL();
                    ArrayList<List> arrayList2 = new ArrayList(C15438062q.LJIJJ(hVarLJIIL, 10));
                    Iterator<k> it3 = hVarLJIIL.iterator();
                    while (it3.hasNext()) {
                        h hVarLJIIL2 = it3.next().LJIIL();
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(hVarLJIIL2, 10));
                        Iterator<k> it4 = hVarLJIIL2.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(it4.next().LJIL());
                        }
                        arrayList2.add(arrayList3);
                    }
                    ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    for (List list : arrayList2) {
                        StageReactionResource.SingleResource singleResource = new StageReactionResource.SingleResource();
                        singleResource.reactionIds = new ArrayList(list);
                        arrayList4.add(singleResource);
                    }
                    stageReactionResource = new StageReactionResource();
                    stageReactionResource.type = 2;
                    stageReactionResource.resourceGroups = new ArrayList(arrayList4);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("getEmojiResource fail, e: ");
                    sbLIZ.append(e.getMessage());
                    C20441214yg.LJ("MicSeatEmojiListViewModel", C2188811AlT.LIZIZ(sbLIZ));
                    stageReactionResource = null;
                }
            } else {
                stageReactionResource = new StageReactionResource();
                stageReactionResource.type = 1;
                StageReactionResource.SingleResource singleResource2 = new StageReactionResource.SingleResource();
                singleResource2.reactionIds = C1697810uHb.LJIILJJIL(liveEffect.getResourceId());
                stageReactionResource.resourceGroups = C1697810uHb.LJIILJJIL(singleResource2);
            }
            if (stageReactionResource == null) {
                C20441214yg.LJ("MicSeatEmojiListViewModel", "sendEmojiMessage fail, emojiResource is empty");
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1");
                return unit;
            }
            SendStageReactionReq sendStageReactionReq = new SendStageReactionReq();
            sendStageReactionReq.roomId = C01JX.LJII();
            sendStageReactionReq.channelId = C01JX.LJI();
            sendStageReactionReq.toReactionUserIds = C1697810uHb.LJIILJJIL(C2286608xc.LJFF(C930540aK4.LJIIL()));
            sendStageReactionReq.reactionResource = stageReactionResource;
            C480460Ism.LIZ().getClass();
            ((C11NJ) this.LLILLL.LJFF.getValue()).LIZ(((IMultiGuestMicSeatEmojiApi) C480460Ism.LIZLLL(IMultiGuestMicSeatEmojiApi.class)).sendMicSeatEmojiMessage(sendStageReactionReq).LJFF(new C0UO0()).LJJIIZ(new C09JN() { // from class: X.00ny
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1$2");
                    C470590Icr c470590Icr = (C470590Icr) obj2;
                    C930480aJy.LIZ.getClass();
                    if (!C930480aJy.LJJIFFI(c470590Icr)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("sendEmojiMessage error, error msg: ");
                        sbLIZ2.append(c470590Icr.LJ.message);
                        C20441214yg.LJ("MicSeatEmojiListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                        C766270U4b.LJIIJJI(c470590Icr.LJ.message);
                    }
                    C1C7U.LIZIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1$2");
                }
            }, new C09JN() { // from class: X.00nz
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1$3");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("sendEmojiMessage fail, throwable msg: ");
                    sbLIZ2.append(((Throwable) obj2).getMessage());
                    C20441214yg.LJ("MicSeatEmojiListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                    C1C7U.LIZIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1$3");
                }
            }));
            long value = EmojiProhibitClickIntervalTimeSetting.INSTANCE.getValue();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(value, this) == objLJFF) {
                C1C7U.LIZIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MicSeatEmojiListViewModel@2e5b.sendEmojiMessage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
