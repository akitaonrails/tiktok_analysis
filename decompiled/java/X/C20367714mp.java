package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAutoStartDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: renamed from: X.14mp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20367714mp extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ PlaybookAutoStartDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20367714mp(PlaybookAutoStartDialog playbookAutoStartDialog) {
        super(1);
        this.LL = playbookAutoStartDialog;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        DataChannel dataChannel;
        final PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        Fragment fragment;
        C19EG c19egLIZ;
        Integer numValueOf;
        Playbook playbook;
        Playbook playbook2;
        String string;
        Playbook playbook3;
        Integer numValueOf2;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ2;
        ActivePlaybook activePlaybookLIZIZ;
        Playbook playbook4;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ3;
        ActivePlaybook activePlaybookLIZIZ2;
        Playbook playbook5;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ4;
        ActivePlaybook activePlaybookLIZIZ3;
        String string2;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ5;
        ActivePlaybook activePlaybookLIZIZ4;
        Playbook playbook6;
        C20337914i1<Integer> c20337914i1 = InterfaceC1106030et7.R9;
        Integer numLIZIZ = c20337914i1.LIZIZ();
        String str = "";
        long j = 0;
        Boolean boolValueOf = null;
        if (numLIZIZ != null && numLIZIZ.intValue() == 0) {
            c20337914i1.LJFF(1);
            CountDownTimer countDownTimer = this.LL.LLLILZ;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            C782110Um9 c782110Um9 = new C782110Um9(this.LL.getContext());
            c782110Um9.LJIIZILJ(2131855242);
            c782110Um9.LJII(2131855240);
            c782110Um9.LJIILL = false;
            final PlaybookAutoStartDialog playbookAutoStartDialog = this.LL;
            c782110Um9.LJIILIIL(2131855239, new InterfaceC743640TFa() { // from class: X.14mo
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    long j2;
                    String string3;
                    Integer numValueOf3;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ6;
                    ActivePlaybook activePlaybookLIZIZ5;
                    Playbook playbook7;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ7;
                    ActivePlaybook activePlaybookLIZIZ6;
                    Playbook playbook8;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ8;
                    ActivePlaybook activePlaybookLIZIZ7;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ9;
                    ActivePlaybook activePlaybookLIZIZ8;
                    Playbook playbook9;
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    DataChannel dataChannel2 = playbookAutoStartDialog.LLLIILIL;
                    if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ9 = C784920Uqg.LIZIZ(dataChannel2)) != null && (activePlaybookLIZIZ8 = playbookAnchorServiceV2LIZIZ9.LIZIZ()) != null && (playbook9 = activePlaybookLIZIZ8.playbook) != null) {
                        j2 = playbook9.playbookId;
                    } else {
                        j2 = 0;
                    }
                    DataChannel dataChannel3 = playbookAutoStartDialog.LLLIILIL;
                    if (dataChannel3 == null || (playbookAnchorServiceV2LIZIZ8 = C784920Uqg.LIZIZ(dataChannel3)) == null || (activePlaybookLIZIZ7 = playbookAnchorServiceV2LIZIZ8.LIZIZ()) == null || (string3 = Long.valueOf(activePlaybookLIZIZ7.playId).toString()) == null) {
                        string3 = "";
                    }
                    DataChannel dataChannel4 = playbookAutoStartDialog.LLLIILIL;
                    Boolean boolValueOf2 = null;
                    if (dataChannel4 != null && (playbookAnchorServiceV2LIZIZ7 = C784920Uqg.LIZIZ(dataChannel4)) != null && (activePlaybookLIZIZ6 = playbookAnchorServiceV2LIZIZ7.LIZIZ()) != null && (playbook8 = activePlaybookLIZIZ6.playbook) != null) {
                        numValueOf3 = Integer.valueOf(playbook8.playbookType);
                    } else {
                        numValueOf3 = null;
                    }
                    DataChannel dataChannel5 = playbookAutoStartDialog.LLLIILIL;
                    if (dataChannel5 != null && (playbookAnchorServiceV2LIZIZ6 = C784920Uqg.LIZIZ(dataChannel5)) != null && (activePlaybookLIZIZ5 = playbookAnchorServiceV2LIZIZ6.LIZIZ()) != null && (playbook7 = activePlaybookLIZIZ5.playbook) != null) {
                        boolValueOf2 = Boolean.valueOf(playbook7.isMyCreation);
                    }
                    C978360bZC.LJJI("click", j2, "cancel_next", string3, numValueOf3, boolValueOf2);
                    liveDialog.cancel();
                    playbookAutoStartDialog.close(1);
                }
            });
            final PlaybookAutoStartDialog playbookAutoStartDialog2 = this.LL;
            c782110Um9.LJIIJ(2131855241, new InterfaceC743640TFa() { // from class: X.14mn
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    long j2;
                    String string3;
                    Integer numValueOf3;
                    long jLongValue;
                    CharSequence text;
                    String string4;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ6;
                    ActivePlaybook activePlaybookLIZIZ5;
                    Playbook playbook7;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ7;
                    ActivePlaybook activePlaybookLIZIZ6;
                    Playbook playbook8;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ8;
                    ActivePlaybook activePlaybookLIZIZ7;
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ9;
                    ActivePlaybook activePlaybookLIZIZ8;
                    Playbook playbook9;
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    DataChannel dataChannel2 = playbookAutoStartDialog2.LLLIILIL;
                    if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ9 = C784920Uqg.LIZIZ(dataChannel2)) != null && (activePlaybookLIZIZ8 = playbookAnchorServiceV2LIZIZ9.LIZIZ()) != null && (playbook9 = activePlaybookLIZIZ8.playbook) != null) {
                        j2 = playbook9.playbookId;
                    } else {
                        j2 = 0;
                    }
                    DataChannel dataChannel3 = playbookAutoStartDialog2.LLLIILIL;
                    String str2 = "";
                    if (dataChannel3 == null || (playbookAnchorServiceV2LIZIZ8 = C784920Uqg.LIZIZ(dataChannel3)) == null || (activePlaybookLIZIZ7 = playbookAnchorServiceV2LIZIZ8.LIZIZ()) == null || (string3 = Long.valueOf(activePlaybookLIZIZ7.playId).toString()) == null) {
                        string3 = "";
                    }
                    DataChannel dataChannel4 = playbookAutoStartDialog2.LLLIILIL;
                    Boolean boolValueOf2 = null;
                    if (dataChannel4 != null && (playbookAnchorServiceV2LIZIZ7 = C784920Uqg.LIZIZ(dataChannel4)) != null && (activePlaybookLIZIZ6 = playbookAnchorServiceV2LIZIZ7.LIZIZ()) != null && (playbook8 = activePlaybookLIZIZ6.playbook) != null) {
                        numValueOf3 = Integer.valueOf(playbook8.playbookType);
                    } else {
                        numValueOf3 = null;
                    }
                    DataChannel dataChannel5 = playbookAutoStartDialog2.LLLIILIL;
                    if (dataChannel5 != null && (playbookAnchorServiceV2LIZIZ6 = C784920Uqg.LIZIZ(dataChannel5)) != null && (activePlaybookLIZIZ5 = playbookAnchorServiceV2LIZIZ6.LIZIZ()) != null && (playbook7 = activePlaybookLIZIZ5.playbook) != null) {
                        boolValueOf2 = Boolean.valueOf(playbook7.isMyCreation);
                    }
                    C978360bZC.LJJI("cancel", j2, "cancel_next", string3, numValueOf3, boolValueOf2);
                    liveDialog.cancel();
                    PlaybookAutoStartDialog playbookAutoStartDialog3 = playbookAutoStartDialog2;
                    C16FS c16fs = playbookAutoStartDialog3.LLLFFI;
                    if (c16fs != null && (text = c16fs.getText()) != null && (string4 = text.toString()) != null) {
                        str2 = string4;
                    }
                    try {
                        StringBuilder sb = new StringBuilder();
                        int length = str2.length();
                        for (int i = 0; i < length; i++) {
                            char cCharAt = str2.charAt(i);
                            if (Character.isDigit(cCharAt)) {
                                sb.append(cCharAt);
                            }
                        }
                        long j3 = CastLongProtector.parseLong(sb.toString());
                        if (1 <= j3) {
                            Long l = playbookAutoStartDialog3.LLLIL;
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 10000;
                            }
                            if (j3 <= jLongValue / ((long) LSPassThroughRecordSizeConfig.DEFAULT) && j3 > 0) {
                                CountDownTimer countDownTimer2 = playbookAutoStartDialog2.LLLILZ;
                                if (countDownTimer2 != null) {
                                    countDownTimer2.cancel();
                                }
                                PlaybookAutoStartDialog playbookAutoStartDialog4 = playbookAutoStartDialog2;
                                long j4 = j3 * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                final PlaybookAutoStartDialog playbookAutoStartDialog5 = playbookAutoStartDialog2;
                                playbookAutoStartDialog4.LLLILZ = new CountDownTimer(j4) { // from class: X.14mh
                                    @Override // android.os.CountDownTimer
                                    public final void onFinish() {
                                        PlaybookAutoStartDialog playbookAutoStartDialog6 = playbookAutoStartDialog5;
                                        C16FS c16fs2 = playbookAutoStartDialog6.LLLFFI;
                                        if (c16fs2 != null) {
                                            c16fs2.setText(C497740JfY.LJIJJ(playbookAutoStartDialog6.uS(), 0));
                                        }
                                        playbookAutoStartDialog5.wS(true);
                                    }

                                    @Override // android.os.CountDownTimer
                                    public final void onTick(long j5) {
                                        long j6 = j5 / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                                        PlaybookAutoStartDialog playbookAutoStartDialog6 = playbookAutoStartDialog5;
                                        C16FS c16fs2 = playbookAutoStartDialog6.LLLFFI;
                                        if (c16fs2 != null) {
                                            c16fs2.setText(C497740JfY.LJIJJ(playbookAutoStartDialog6.uS(), Long.valueOf(j6)));
                                        }
                                    }
                                }.start();
                                return;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    playbookAutoStartDialog2.wS(true);
                }
            });
            C0FNV.LIZJ(c782110Um9.LIZ());
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            DataChannel dataChannel2 = this.LL.LLLIILIL;
            if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ5 = C784920Uqg.LIZIZ(dataChannel2)) != null && (activePlaybookLIZIZ4 = playbookAnchorServiceV2LIZIZ5.LIZIZ()) != null && (playbook6 = activePlaybookLIZIZ4.playbook) != null) {
                j = playbook6.playbookId;
            }
            DataChannel dataChannel3 = this.LL.LLLIILIL;
            if (dataChannel3 != null && (playbookAnchorServiceV2LIZIZ4 = C784920Uqg.LIZIZ(dataChannel3)) != null && (activePlaybookLIZIZ3 = playbookAnchorServiceV2LIZIZ4.LIZIZ()) != null && (string2 = Long.valueOf(activePlaybookLIZIZ3.playId).toString()) != null) {
                str = string2;
            }
            DataChannel dataChannel4 = this.LL.LLLIILIL;
            if (dataChannel4 != null && (playbookAnchorServiceV2LIZIZ3 = C784920Uqg.LIZIZ(dataChannel4)) != null && (activePlaybookLIZIZ2 = playbookAnchorServiceV2LIZIZ3.LIZIZ()) != null && (playbook5 = activePlaybookLIZIZ2.playbook) != null) {
                numValueOf2 = Integer.valueOf(playbook5.playbookType);
            } else {
                numValueOf2 = null;
            }
            DataChannel dataChannel5 = this.LL.LLLIILIL;
            if (dataChannel5 != null && (playbookAnchorServiceV2LIZIZ2 = C784920Uqg.LIZIZ(dataChannel5)) != null && (activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ2.LIZIZ()) != null && (playbook4 = activePlaybookLIZIZ.playbook) != null) {
                boolValueOf = Boolean.valueOf(playbook4.isMyCreation);
            }
            C978360bZC.LJJI("show", j, "cancel_next", str, numValueOf2, boolValueOf);
        } else {
            this.LL.close(1);
            PlaybookAutoStartDialog playbookAutoStartDialog3 = this.LL;
            playbookAutoStartDialog3.getClass();
            if (c20337914i1.LIZIZ().intValue() < 4) {
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            }
            if (c20337914i1.LIZIZ().intValue() >= 4 && (dataChannel = playbookAutoStartDialog3.LLLIILIL) != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                WeakReference<Fragment> weakReference = playbookAnchorServiceV2LIZIZ.LLJIJIL;
                if (weakReference != null) {
                    fragment = weakReference.get();
                } else {
                    fragment = null;
                }
                WeakReference<C19EG> weakReference2 = playbookAnchorServiceV2LIZIZ.LLJILJIL;
                if (weakReference2 != null) {
                    c19egLIZ = weakReference2.get();
                } else {
                    c19egLIZ = null;
                }
                if (fragment == null) {
                    if (c19egLIZ != null) {
                    }
                } else {
                    Context context = fragment.getContext();
                    if (context == null) {
                        if (c19egLIZ == null) {
                            c19egLIZ = C176600m4.LIZ();
                        }
                    } else {
                        c19egLIZ = context;
                    }
                }
                C782110Um9 c782110Um92 = new C782110Um9(c19egLIZ);
                c782110Um92.LJIIZILJ(2131855238);
                c782110Um92.LJII(2131855237);
                c782110Um92.LJIILL = false;
                c782110Um92.LJIILIIL(2131855239, new InterfaceC743640TFa() { // from class: X.0bZM
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        Playbook playbook7;
                        long j2;
                        String string3;
                        Integer numValueOf3;
                        Playbook playbook8;
                        Playbook playbook9;
                        Playbook playbook10;
                        liveDialog.cancel();
                        ActivePlaybook activePlaybookLIZIZ5 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                        if (activePlaybookLIZIZ5 != null && (playbook7 = activePlaybookLIZIZ5.playbook) != null) {
                            PlaybookAnchorServiceV2 playbookAnchorServiceV2 = playbookAnchorServiceV2LIZIZ;
                            C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                            C978360bZC.LJJ("click", playbook7.playbookId, "off", Integer.valueOf(playbook7.playbookType), Boolean.valueOf(playbook7.isMyCreation));
                            ActivePlaybook activePlaybookLIZIZ6 = playbookAnchorServiceV2.LIZIZ();
                            if (activePlaybookLIZIZ6 != null && (playbook10 = activePlaybookLIZIZ6.playbook) != null) {
                                j2 = playbook10.playbookId;
                            } else {
                                j2 = 0;
                            }
                            ActivePlaybook activePlaybookLIZIZ7 = playbookAnchorServiceV2.LIZIZ();
                            if (activePlaybookLIZIZ7 == null || (string3 = Long.valueOf(activePlaybookLIZIZ7.playId).toString()) == null) {
                                string3 = "";
                            }
                            ActivePlaybook activePlaybookLIZIZ8 = playbookAnchorServiceV2.LIZIZ();
                            Boolean boolValueOf2 = null;
                            if (activePlaybookLIZIZ8 != null && (playbook9 = activePlaybookLIZIZ8.playbook) != null) {
                                numValueOf3 = Integer.valueOf(playbook9.playbookType);
                            } else {
                                numValueOf3 = null;
                            }
                            ActivePlaybook activePlaybookLIZIZ9 = playbookAnchorServiceV2.LIZIZ();
                            if (activePlaybookLIZIZ9 != null && (playbook8 = activePlaybookLIZIZ9.playbook) != null) {
                                boolValueOf2 = Boolean.valueOf(playbook8.isMyCreation);
                            }
                            C978360bZC.LJJI("click", j2, "cancel_all", string3, numValueOf3, boolValueOf2);
                            PlaybookAnchorViewModel playbookAnchorViewModel = (PlaybookAnchorViewModel) playbookAnchorServiceV2.LLILLJJLI;
                            if (playbookAnchorViewModel != null) {
                                playbookAnchorViewModel.TQ2(2, playbook7);
                            }
                        }
                    }
                });
                c782110Um92.LJIIJ(2131855241, new InterfaceC743640TFa() { // from class: X.0bZN
                    @Override // X.InterfaceC743640TFa
                    public final void LIZ(LiveDialog liveDialog) {
                        long j2;
                        String string3;
                        Integer numValueOf3;
                        Playbook playbook7;
                        Playbook playbook8;
                        Playbook playbook9;
                        C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                        ActivePlaybook activePlaybookLIZIZ5 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                        if (activePlaybookLIZIZ5 != null && (playbook9 = activePlaybookLIZIZ5.playbook) != null) {
                            j2 = playbook9.playbookId;
                        } else {
                            j2 = 0;
                        }
                        ActivePlaybook activePlaybookLIZIZ6 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                        if (activePlaybookLIZIZ6 == null || (string3 = Long.valueOf(activePlaybookLIZIZ6.playId).toString()) == null) {
                            string3 = "";
                        }
                        ActivePlaybook activePlaybookLIZIZ7 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                        Boolean boolValueOf2 = null;
                        if (activePlaybookLIZIZ7 != null && (playbook8 = activePlaybookLIZIZ7.playbook) != null) {
                            numValueOf3 = Integer.valueOf(playbook8.playbookType);
                        } else {
                            numValueOf3 = null;
                        }
                        ActivePlaybook activePlaybookLIZIZ8 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                        if (activePlaybookLIZIZ8 != null && (playbook7 = activePlaybookLIZIZ8.playbook) != null) {
                            boolValueOf2 = Boolean.valueOf(playbook7.isMyCreation);
                        }
                        C978360bZC.LJJI("cancel", j2, "cancel_all", string3, numValueOf3, boolValueOf2);
                        liveDialog.cancel();
                    }
                });
                C0FNV.LIZJ(c782110Um92.LIZ());
                C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                ActivePlaybook activePlaybookLIZIZ5 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                if (activePlaybookLIZIZ5 != null && (playbook3 = activePlaybookLIZIZ5.playbook) != null) {
                    j = playbook3.playbookId;
                }
                ActivePlaybook activePlaybookLIZIZ6 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                if (activePlaybookLIZIZ6 != null && (string = Long.valueOf(activePlaybookLIZIZ6.playId).toString()) != null) {
                    str = string;
                }
                ActivePlaybook activePlaybookLIZIZ7 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                if (activePlaybookLIZIZ7 != null && (playbook2 = activePlaybookLIZIZ7.playbook) != null) {
                    numValueOf = Integer.valueOf(playbook2.playbookType);
                } else {
                    numValueOf = null;
                }
                ActivePlaybook activePlaybookLIZIZ8 = playbookAnchorServiceV2LIZIZ.LIZIZ();
                if (activePlaybookLIZIZ8 != null && (playbook = activePlaybookLIZIZ8.playbook) != null) {
                    boolValueOf = Boolean.valueOf(playbook.isMyCreation);
                }
                C978360bZC.LJJI("show", j, "cancel_all", str, numValueOf, boolValueOf);
            }
        }
        return Unit.LIZ;
    }
}
