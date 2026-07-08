package X;

import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.chatagent.api.config.CommerceAiAgentInteractionConfigModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.MessageSender;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS370S0200000_4;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS583S0100000_4;
import njp.a;

/* JADX INFO: renamed from: X.0ChY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$observeMessageList$2", f = "MessageViewModel.kt", l = {233}, m = "invokeSuspend")
public final class C320620ChY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320620ChY(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C320620ChY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320620ChY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Long lLJFF;
        C1C7U.LIZ("MessageViewModel@2947.observeMessageList$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C320610ChX c320610ChX = C320640Cha.LJIIJ;
            C320640Cha c320640Cha = this.LLILLJJLI.LLILLL;
            Integer numLJ = null;
            if (c320640Cha != null) {
                lLJFF = C2286608xc.LJFF(c320640Cha.LIZLLL);
            } else {
                lLJFF = null;
            }
            C320640Cha c320640Cha2 = this.LLILLJJLI.LLILLL;
            if (c320640Cha2 != null) {
                numLJ = C2286608xc.LJ(c320640Cha2.LJ);
            }
            C05YC c05ycLIZ = c320610ChX.LIZ(numLJ, lLJFF);
            C320870Chx.LIZ(new AwS405S0200000_4(c05ycLIZ, (C05YC<C321110CiL>) this.LLILLJJLI, (MessageViewModel) 49), false);
            if (c05ycLIZ != null) {
                final MessageViewModel messageViewModel = this.LLILLJJLI;
                InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Ci6
                    @Override // X.InterfaceC346701Wf
                    public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                        InterfaceC320970Ci7 interfaceC320970Ci7;
                        boolean z;
                        Vibrator vibrator;
                        Vibrator vibrator2;
                        C321110CiL c321110CiL = (C321110CiL) obj2;
                        C320870Chx.LIZ(new AwS548S0100000_4(c321110CiL, 493), false);
                        int i2 = C320730Chj.LIZ[c321110CiL.LIZ.ordinal()];
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 4) {
                                    if (i2 != 5) {
                                        if (i2 == 6) {
                                            MessageViewModel messageViewModel2 = messageViewModel;
                                            messageViewModel2.getClass();
                                            messageViewModel2.setState(new AwS583S0100000_4(c321110CiL, 298));
                                        }
                                    } else {
                                        messageViewModel.getClass();
                                    }
                                } else {
                                    MessageViewModel messageViewModel3 = messageViewModel;
                                    messageViewModel3.getClass();
                                    messageViewModel3.setState(new AwS583S0100000_4(c321110CiL, 297));
                                }
                            } else {
                                MessageViewModel messageViewModel4 = messageViewModel;
                                messageViewModel4.getClass();
                                messageViewModel4.setState(new AwS370S0200000_4(messageViewModel4, c321110CiL, 88));
                            }
                        } else {
                            MessageViewModel messageViewModel5 = messageViewModel;
                            messageViewModel5.getClass();
                            for (Message message : c321110CiL.LIZIZ) {
                                InterfaceC320970Ci7 interfaceC320970Ci72 = c321110CiL.LJII.LIZLLL;
                                if ((interfaceC320970Ci72 != null && interfaceC320970Ci72.getOp() == 1) || ((interfaceC320970Ci7 = c321110CiL.LJII.LIZLLL) != null && interfaceC320970Ci7.getOp() == 16)) {
                                    MessageSender messageSender = message.sender;
                                    if (messageSender != null && messageSender.isSelf) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        CommerceAiAgentInteractionConfigModel commerceAiAgentInteractionConfigModelLIZ = C320920Ci2.LIZ();
                                        boolean z2 = commerceAiAgentInteractionConfigModelLIZ.hapticEnabled;
                                        long j = commerceAiAgentInteractionConfigModelLIZ.hapticDuration;
                                        if (z2 && j > 0) {
                                            try {
                                                C844470XAv.LIZ.getClass();
                                                Object objH2 = C786410Ut5.H2(C844470XAv.LIZ(), "vibrator");
                                                if ((objH2 instanceof Vibrator) && (vibrator = (Vibrator) objH2) != null) {
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        vibrator.vibrate(VibrationEffect.createOneShot(j, 80));
                                                    } else {
                                                        vibrator.vibrate(j);
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                            }
                                        }
                                        Iterator<InterfaceC320950Ci5> it2 = messageViewModel5.LLILZIL.iterator();
                                        while (it2.hasNext()) {
                                            it2.next().LIZLLL(message);
                                        }
                                    } else {
                                        CommerceAiAgentInteractionConfigModel commerceAiAgentInteractionConfigModelLIZ2 = C320920Ci2.LIZ();
                                        boolean z3 = commerceAiAgentInteractionConfigModelLIZ2.hapticEnabled;
                                        long j2 = commerceAiAgentInteractionConfigModelLIZ2.hapticDuration;
                                        if (z3 && j2 > 0) {
                                            try {
                                                C844470XAv.LIZ.getClass();
                                                Object objH22 = C786410Ut5.H2(C844470XAv.LIZ(), "vibrator");
                                                if ((objH22 instanceof Vibrator) && (vibrator2 = (Vibrator) objH22) != null) {
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                        vibrator2.vibrate(VibrationEffect.createOneShot(j2, 50));
                                                    } else {
                                                        vibrator2.vibrate(j2);
                                                    }
                                                }
                                            } catch (Throwable th2) {
                                                TryCatchGuardChecker.doCheck(th2);
                                            }
                                        }
                                        Iterator<InterfaceC320950Ci5> it3 = messageViewModel5.LLILZIL.iterator();
                                        while (it3.hasNext()) {
                                            it3.next().LIZJ(message);
                                        }
                                    }
                                }
                            }
                            messageViewModel5.setState(new AwS370S0200000_4(messageViewModel5, c321110CiL, 89));
                        }
                        return Unit.LIZ;
                    }
                };
                this.LL = 1;
                if (c05ycLIZ.collect(interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@2947.observeMessageList$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MessageViewModel@2947.observeMessageList$2");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
