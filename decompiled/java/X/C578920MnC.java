package X;

import Y.AObjectS303S0200000_8;
import androidx.lifecycle.Lifecycle;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.creative.model.AIGCOfflineModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCEffectMessage;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.TaskStage;
import com.ss.android.ugc.gamora.recorder.sticker.aigc.TaskTrigger;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import pyl.s;

/* JADX INFO: renamed from: X.0MnC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.aigc.AIGCOfflineEffectHandler$onMessageReceived$1", f = "AIGCOfflineEffectHandler.kt", l = {}, m = "invokeSuspend")
public final class C578920MnC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C578910MnB LL;
    public final /* synthetic */ AIGCEffectMessage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C578920MnC(C578910MnB c578910MnB, AIGCEffectMessage aIGCEffectMessage, InterfaceC1364105Vn<? super C578920MnC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c578910MnB;
        this.LLILLJJLI = aIGCEffectMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C578920MnC(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AIGCEffectMessage aIGCEffectMessage;
        TaskStage taskStage;
        String str;
        InterfaceC579060MnQ interfaceC579060MnQ;
        InterfaceC1648570t0B interfaceC1648570t0B;
        CreativeModel creativeModel;
        AIGCOfflineModel aIGCOfflineModel;
        CreativeModel creativeModel2;
        AIGCOfflineModel aIGCOfflineModel2;
        CreativeModel creativeModel3;
        AIGCOfflineModel aIGCOfflineModel3;
        CreativeModel creativeModel4;
        AIGCOfflineModel aIGCOfflineModel4;
        CreativeModel creativeModel5;
        AIGCOfflineModel aIGCOfflineModel5;
        CreativeInfo creativeInfo;
        InterfaceC1648570t0B interfaceC1648570t0B2;
        C385670FAf<Boolean> c385670FAfIsRecording;
        Class<?> cls;
        Object obj2;
        C1C7U.LIZ("AIGCOfflineEffectHandler@7df1.onMessageReceived$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("aigc_ignore_message_when_not_resumed", true)) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null && (obj2 = abstractC1387200mCcLJ.LIZ) != null) {
                cls = obj2.getClass();
            } else {
                cls = null;
            }
            if (!Intrinsics.LJFF(cls, this.LL.LLJIJIL)) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.onMessageReceived$1");
                return unit;
            }
        }
        C578910MnB c578910MnB = this.LL;
        if (c578910MnB.LLJILJILJ != null && (aIGCEffectMessage = this.LLILLJJLI) != null && (taskStage = aIGCEffectMessage.stage) != null) {
            int i = C579020MnM.LIZ[taskStage.ordinal()];
            if (i != 1) {
                if (i == 2 && Intrinsics.LJFF(aIGCEffectMessage.status, "success")) {
                    C0LC0.LIZ("aigc_offline_effect_handler", "onMessageReceived TASK_SUCCESS");
                    if (C1624200sMs.LIZIZ(c578910MnB.LLJILJILJ) && (interfaceC1648570t0B2 = c578910MnB.LLILZIL) != null && (c385670FAfIsRecording = interfaceC1648570t0B2.isRecording()) != null && Intrinsics.LJFF(c385670FAfIsRecording.LIZJ(), true)) {
                        c578910MnB.LLILZIL.Vt0().LJII(c578910MnB.LLILLL, Lifecycle.State.STARTED, new AObjectS303S0200000_8(c578910MnB, aIGCEffectMessage, 6));
                        c578910MnB.LJJJI();
                    } else {
                        c578910MnB.LJJJI();
                        InterfaceC560310LyH interfaceC560310LyH = c578910MnB.LLIZLLLIL;
                        AIGCOfflineModel aIGCOfflineModelLJJIJIIJIL = c578910MnB.LJJIJIIJIL(aIGCEffectMessage);
                        ShortVideoContext shortVideoContext = c578910MnB.LLILLJJLI;
                        if (shortVideoContext == null || (creativeInfo = shortVideoContext.creativeInfo) == null) {
                            creativeInfo = new CreativeInfo(null, 0, null == true ? 1 : 0, 7, null == true ? 1 : 0);
                        }
                        interfaceC560310LyH.XM2(aIGCOfflineModelLJJIJIIJIL, creativeInfo, C1624200sMs.LIZJ(c578910MnB.LLJILJILJ));
                    }
                }
            } else {
                TaskTrigger taskTrigger = aIGCEffectMessage.trigger;
                if (taskTrigger != null) {
                    int i2 = C579000MnK.LIZ[taskTrigger.ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                if (c578910MnB.LLJILJIL) {
                                    ShortVideoContext shortVideoContext2 = c578910MnB.LLILLJJLI;
                                    if (shortVideoContext2 != null && (creativeModel5 = shortVideoContext2.creativeModel) != null && (aIGCOfflineModel5 = creativeModel5.aigcOfflineModel) != null) {
                                        aIGCOfflineModel5.aigcInteractionType = EnumC578980MnI.CLICK_RECORD_BUTTON.getType();
                                    }
                                    c578910MnB.LLJILJIL = false;
                                } else {
                                    ShortVideoContext shortVideoContext3 = c578910MnB.LLILLJJLI;
                                    if (shortVideoContext3 != null && (creativeModel4 = shortVideoContext3.creativeModel) != null && (aIGCOfflineModel4 = creativeModel4.aigcOfflineModel) != null) {
                                        aIGCOfflineModel4.aigcInteractionType = EnumC578980MnI.UPLOAD_IMAGE.getType();
                                    }
                                }
                            }
                        } else {
                            ShortVideoContext shortVideoContext4 = c578910MnB.LLILLJJLI;
                            if (shortVideoContext4 != null && (creativeModel3 = shortVideoContext4.creativeModel) != null && (aIGCOfflineModel3 = creativeModel3.aigcOfflineModel) != null) {
                                aIGCOfflineModel3.aigcInteractionType = EnumC578980MnI.TAP_TO_START.getType();
                            }
                        }
                    } else {
                        ShortVideoContext shortVideoContext5 = c578910MnB.LLILLJJLI;
                        if (shortVideoContext5 != null && (creativeModel2 = shortVideoContext5.creativeModel) != null && (aIGCOfflineModel2 = creativeModel2.aigcOfflineModel) != null) {
                            aIGCOfflineModel2.aigcInteractionType = EnumC578980MnI.CLICK_RECORD_BUTTON.getType();
                        }
                    }
                }
                ShortVideoContext shortVideoContext6 = c578910MnB.LLILLJJLI;
                if (shortVideoContext6 != null && (creativeModel = shortVideoContext6.creativeModel) != null && (aIGCOfflineModel = creativeModel.aigcOfflineModel) != null) {
                    str = aIGCOfflineModel.aigcInteractionType;
                } else {
                    str = null;
                }
                if ((Intrinsics.LJFF(str, EnumC578980MnI.UPLOAD_IMAGE.getType()) || (Intrinsics.LJFF(str, EnumC578980MnI.TAP_TO_START.getType()) && !C1624200sMs.LIZIZ(c578910MnB.LLJILJILJ))) && (interfaceC579060MnQ = c578910MnB.LLJ) != null) {
                    interfaceC579060MnQ.zN2(new C1448290nn9(EnumC1448830no1.NONE, 0, 0L, 14));
                }
                AIGCOfflineModel aIGCOfflineModelLJJIJIIJIL2 = c578910MnB.LJJIJIIJIL(aIGCEffectMessage);
                C544640LXq.LIZ.LIZJ(aIGCOfflineModelLJJIJIIJIL2, null);
                c578910MnB.LJJIIZI();
                TaskTrigger taskTrigger2 = aIGCEffectMessage.trigger;
                if (taskTrigger2 == TaskTrigger.RECORD || taskTrigger2 == TaskTrigger.TAP) {
                    c578910MnB.LLIZLLLIL.hK1(aIGCOfflineModelLJJIJIIJIL2);
                }
                if (aIGCEffectMessage.trigger == TaskTrigger.TAP && C1624200sMs.LIZIZ(c578910MnB.LLJILJILJ) && (interfaceC1648570t0B = c578910MnB.LLILZIL) != null) {
                    interfaceC1648570t0B.mE1(new C1656120tCM(s.NORMAL));
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOfflineEffectHandler@7df1.onMessageReceived$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
