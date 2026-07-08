package Y;

import X.AbstractC19484711Kz;
import X.AbstractC942990ae9;
import X.C09JN;
import X.C0GYK;
import X.C0HIE;
import X.C0HIF;
import X.C0HIG;
import X.C0HIH;
import X.C0HII;
import X.C0HIJ;
import X.C0HIK;
import X.C0IJT;
import X.C0UO0;
import X.C0VSJ;
import X.C1117360fBO;
import X.C1143680frq;
import X.C12ES;
import X.C1324610kZf;
import X.C1324720kZq;
import X.C1697810uHb;
import X.C16FS;
import X.C1819620xS4;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2286608xc;
import X.C410901il;
import X.C438670HIb;
import X.C439101nJ;
import X.C442320HWc;
import X.C473410IhP;
import X.C474500IjA;
import X.C492400JSs;
import X.C497740JfY;
import X.C748880TZe;
import X.C766270U4b;
import X.C786410Ut5;
import X.C930480aJy;
import X.C930540aK4;
import X.C936270aTJ;
import X.C939000aXi;
import X.C942320ad4;
import X.C942760adm;
import X.C942770adn;
import X.C942780ado;
import X.C942820ads;
import X.C942890adz;
import X.C942900ae0;
import X.C942910ae1;
import X.C942920ae2;
import X.C942940ae4;
import X.C942950ae5;
import X.C942960ae6;
import X.C942970ae7;
import X.C943010aeB;
import X.C943120aeM;
import X.C943140aeO;
import X.C943160aeQ;
import X.C943180aeS;
import X.C943190aeT;
import X.C943210aeV;
import X.C943220aeW;
import X.C943260aea;
import X.C943270aeb;
import X.C943280aec;
import X.C943290aed;
import X.C945890aip;
import X.C954270awL;
import X.C956780b0O;
import X.C961560b86;
import X.C961570b87;
import X.C987140bnM;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.ViewOnClickListenerC1836610xtT;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.DialogManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperUrlEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.anchor.AigcWallpaperManageDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest.AigcWallpaperGuestCreateDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.dialog.guest.AigcWallpaperInvitedDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.anchor.AigcWallpaperAnchorResultFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestEditFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.fragment.guest.AigcWallpaperGuestResultFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcAnchorWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.view.widget.AigcGuestWidget;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperGuestViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixDialogLeakSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S3010000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.WallpaperContext;

/* JADX INFO: loaded from: classes16.dex */
public class AgS296S0100000_15 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            case 4:
                return emit$4(this, obj, interfaceC1364105Vn);
            case 5:
                return emit$5(this, obj, interfaceC1364105Vn);
            case 6:
                return emit$6(this, obj, interfaceC1364105Vn);
            case 7:
                return emit$7(this, obj, interfaceC1364105Vn);
            case 8:
                return emit$8(this, obj, interfaceC1364105Vn);
            case BdTuring.TYPE_ECAF /* 9 */:
                return emit$9(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS296S0100000_15(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C943010aeB) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((AigcWallpaperAnchorEditFragment) agS296S0100000_15.l0).LLILLJJLI;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJII();
            }
        } else if (abstractC942990ae9 instanceof C943260aea) {
            DataChannel dataChannel = ((AigcWallpaperAnchorEditFragment) agS296S0100000_15.l0).LL;
            if (dataChannel != null) {
                dataChannel.zW(AigcWallpaperUrlEvent.class, "");
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = ((AigcWallpaperAnchorEditFragment) agS296S0100000_15.l0).LLILLJJLI;
            if (viewOnClickListenerC1836610xtT2 != null) {
                viewOnClickListenerC1836610xtT2.LJI();
            }
        } else if (abstractC942990ae9 instanceof C438670HIb) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = ((AigcWallpaperAnchorEditFragment) agS296S0100000_15.l0).LLILLJJLI;
            if (viewOnClickListenerC1836610xtT3 != null) {
                viewOnClickListenerC1836610xtT3.LJFF();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createAigcWallpaperMode failed, because: ");
            sbLIZ.append(((C438670HIb) abstractC942990ae9).LIZ);
            C20441214yg.LJ("AigcWallpaperGuestEditFragment", C2188811AlT.LIZIZ(sbLIZ));
        } else if (abstractC942990ae9 instanceof C0HIK) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT4 = ((AigcWallpaperAnchorEditFragment) agS296S0100000_15.l0).LLILLJJLI;
            if (viewOnClickListenerC1836610xtT4 != null) {
                viewOnClickListenerC1836610xtT4.LIZLLL();
            }
            C939000aXi c939000aXi = C939000aXi.LIZ;
            C0HIK c0hik = (C0HIK) abstractC942990ae9;
            Long lLJFF = C2286608xc.LJFF(c0hik.LIZ);
            String str = c0hik.LIZIZ;
            Long lLJFF2 = C2286608xc.LJFF(c0hik.LIZJ);
            Long lLJFF3 = C2286608xc.LJFF(c0hik.LIZLLL);
            c939000aXi.getClass();
            C939000aXi.LIZLLL = lLJFF;
            C939000aXi.LJ = str;
            C939000aXi.LJFF = lLJFF3;
            C930480aJy.LIZ.getClass();
            C939000aXi.LJI = C930480aJy.LJJIJL(lLJFF2);
            C20441214yg.LIZIZ("MultiGuestAigcWallpaperUtil", "onAnchorCreatedAigcSuc");
        }
        return Unit.LIZ;
    }

    public static final Object emit$1(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        TextView textView;
        TextView textView2;
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C943270aeb) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJII();
            }
        } else if (abstractC942990ae9 instanceof C943210aeV) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT2 != null) {
                viewOnClickListenerC1836610xtT2.LJI();
            }
        } else if (abstractC942990ae9 instanceof C943220aeW) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT3 != null) {
                viewOnClickListenerC1836610xtT3.LIZLLL();
            }
        } else if (abstractC942990ae9 instanceof C943160aeQ) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT4 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT4 != null && (textView2 = (TextView) viewOnClickListenerC1836610xtT4.findViewById(R.id.hba)) != null) {
                textView2.setText(2131842448);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT5 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT5 != null) {
                viewOnClickListenerC1836610xtT5.LJFF();
            }
            AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
            if (aigcWallpaperAnchorViewModel != null) {
                aigcWallpaperAnchorViewModel.wQ2();
            }
            AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel2 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
            if (aigcWallpaperAnchorViewModel2 != null) {
                aigcWallpaperAnchorViewModel2.xQ2();
            }
        } else {
            boolean z = false;
            if (abstractC942990ae9 instanceof C945890aip) {
                AigcWallpaperAnchorResultFragment aigcWallpaperAnchorResultFragment = (AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0;
                C945890aip c945890aip = (C945890aip) abstractC942990ae9;
                aigcWallpaperAnchorResultFragment.LLJI = c945890aip.LIZ;
                aigcWallpaperAnchorResultFragment.LLJIJIL = c945890aip.LIZJ;
                aigcWallpaperAnchorResultFragment.LLJILJIL = c945890aip.LIZIZ;
                aigcWallpaperAnchorResultFragment.LLJILJILJ = c945890aip.LJ;
                if (c945890aip.LIZLLL < 100) {
                    C0GYK c0gyk = aigcWallpaperAnchorResultFragment.LLILLJJLI;
                    if (c0gyk != null) {
                        C12ES.LJIILL(0, c0gyk);
                    }
                    C1324720kZq c1324720kZq = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLILZ;
                    if (c1324720kZq != null) {
                        C439101nJ.LJI(c1324720kZq);
                    }
                    C0GYK c0gyk2 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk2 != null) {
                        c0gyk2.setProgress(c945890aip.LIZLLL);
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recive AigcWallpaperUIEvent.AigcWallpaperResult,  downloadProgress >= 100, AigcWallpaperResult = ");
                    sbLIZ.append(abstractC942990ae9);
                    C20441214yg.LIZIZ("AigcWallpaperGuestResultFragment", C2188811AlT.LIZIZ(sbLIZ));
                    C0GYK c0gyk3 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk3 != null) {
                        c0gyk3.LIZ();
                    }
                    C0GYK c0gyk4 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk4 != null) {
                        C439101nJ.LJI(c0gyk4);
                    }
                    C1324720kZq c1324720kZq2 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLILZ;
                    if (c1324720kZq2 != null) {
                        C12ES.LJIILL(0, c1324720kZq2);
                    }
                    AigcWallpaperAnchorResultFragment aigcWallpaperAnchorResultFragment2 = (AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0;
                    aigcWallpaperAnchorResultFragment2.getClass();
                    if (c945890aip.LJ != null) {
                        C20441214yg.LIZIZ("AigcWallpaperGuestResultFragment", "loadLocalImage");
                        C1324720kZq c1324720kZq3 = aigcWallpaperAnchorResultFragment2.LLILZ;
                        if (c1324720kZq3 != null) {
                            C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(c945890aip.LJ));
                            int width = c1324720kZq3.getWidth();
                            int height = c1324720kZq3.getHeight();
                            c1324610kZfLJIIJ.LJ = width;
                            c1324610kZfLJIIJ.LJFF = height;
                            c1324610kZfLJIIJ.LJIJI(Float.valueOf(C497740JfY.LIZIZ(16.0f)));
                            c1324610kZfLJIIJ.LJIIL = new C987140bnM(aigcWallpaperAnchorResultFragment2, 0);
                            c1324610kZfLJIIJ.LJJI(c1324720kZq3);
                        }
                    }
                }
            } else if (abstractC942990ae9 instanceof C0HIF) {
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT6 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
                if (viewOnClickListenerC1836610xtT6 != null && (textView = (TextView) viewOnClickListenerC1836610xtT6.findViewById(R.id.hba)) != null) {
                    textView.setText(2131842441);
                }
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT7 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZ;
                if (viewOnClickListenerC1836610xtT7 != null) {
                    viewOnClickListenerC1836610xtT7.LJFF();
                }
                AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel3 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
                if (aigcWallpaperAnchorViewModel3 != null && aigcWallpaperAnchorViewModel3.LLJILJILJ) {
                    z = true;
                }
                if (z) {
                    C943120aeM.LJII(null, "image_load_fail", null);
                } else {
                    C943120aeM.LJII(null, "review_msg_timeout", null);
                }
                AigcWallpaperAnchorViewModel aigcWallpaperAnchorViewModel4 = ((AigcWallpaperAnchorResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
                if (aigcWallpaperAnchorViewModel4 != null) {
                    aigcWallpaperAnchorViewModel4.wQ2();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$2(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C0HIH) {
            AigcWallpaperGuestEditFragment aigcWallpaperGuestEditFragment = (AigcWallpaperGuestEditFragment) agS296S0100000_15.l0;
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = aigcWallpaperGuestEditFragment.LLILLJJLI;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJ();
            }
            C1143680frq.LIZLLL(aigcWallpaperGuestEditFragment.LLJIJIL, "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_timeout_img.png");
            C943120aeM.LJIIL("guest_timeout");
        } else if (obj instanceof C0HIJ) {
            AigcWallpaperGuestCreateDialog aigcWallpaperGuestCreateDialog = ((AigcWallpaperGuestEditFragment) agS296S0100000_15.l0).LLIZ;
            if (aigcWallpaperGuestCreateDialog != null) {
                aigcWallpaperGuestCreateDialog.dismiss();
            }
            if (C943120aeM.LIZ == 0) {
                C943120aeM.LJIIL("anchor_end");
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$3(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        TextView textView;
        TextView textView2;
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C943270aeb) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJII();
            }
        } else if (abstractC942990ae9 instanceof C943210aeV) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT2 != null) {
                viewOnClickListenerC1836610xtT2.LJI();
            }
        } else if (abstractC942990ae9 instanceof C943220aeW) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT3 != null) {
                viewOnClickListenerC1836610xtT3.LIZLLL();
            }
        } else if (abstractC942990ae9 instanceof C943160aeQ) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT4 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT4 != null && (textView2 = (TextView) viewOnClickListenerC1836610xtT4.findViewById(R.id.hba)) != null) {
                textView2.setText(2131842448);
            }
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT5 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
            if (viewOnClickListenerC1836610xtT5 != null) {
                viewOnClickListenerC1836610xtT5.LJFF();
            }
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
            if (aigcWallpaperGuestViewModel != null) {
                aigcWallpaperGuestViewModel.wQ2();
            }
            AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel2 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
            if (aigcWallpaperGuestViewModel2 != null) {
                aigcWallpaperGuestViewModel2.xQ2();
            }
        } else {
            boolean z = false;
            if (abstractC942990ae9 instanceof C945890aip) {
                AigcWallpaperGuestResultFragment aigcWallpaperGuestResultFragment = (AigcWallpaperGuestResultFragment) agS296S0100000_15.l0;
                C945890aip c945890aip = (C945890aip) abstractC942990ae9;
                aigcWallpaperGuestResultFragment.LLJILJIL = c945890aip.LIZ;
                aigcWallpaperGuestResultFragment.LLJILJILJ = c945890aip.LIZJ;
                aigcWallpaperGuestResultFragment.LLJILLL = c945890aip.LIZIZ;
                aigcWallpaperGuestResultFragment.LLJJ = c945890aip.LJ;
                if (c945890aip.LIZLLL < 100) {
                    C0GYK c0gyk = aigcWallpaperGuestResultFragment.LLILLJJLI;
                    if (c0gyk != null) {
                        C12ES.LJIILL(0, c0gyk);
                    }
                    C1324720kZq c1324720kZq = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZ;
                    if (c1324720kZq != null) {
                        C439101nJ.LJI(c1324720kZq);
                    }
                    C0GYK c0gyk2 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk2 != null) {
                        c0gyk2.setProgress(c945890aip.LIZLLL);
                    }
                    C16FS c16fs = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZIL;
                    if (c16fs != null) {
                        c16fs.setEnabled(false);
                    }
                    C16FS c16fs2 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZLL;
                    if (c16fs2 != null) {
                        c16fs2.setEnabled(false);
                    }
                    C16FS c16fs3 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZLL;
                    if (c16fs3 != null) {
                        c16fs3.j0(R.style.a7g);
                    }
                } else {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("recive AigcWallpaperUIEvent.AigcWallpaperResult,  downloadProgress >= 100, AigcWallpaperResult = ");
                    sbLIZ.append(abstractC942990ae9);
                    C20441214yg.LIZIZ("AigcWallpaperGuestResultFragment", C2188811AlT.LIZIZ(sbLIZ));
                    C0GYK c0gyk3 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk3 != null) {
                        c0gyk3.LIZ();
                    }
                    C0GYK c0gyk4 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                    if (c0gyk4 != null) {
                        C439101nJ.LJI(c0gyk4);
                    }
                    C1324720kZq c1324720kZq2 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZ;
                    if (c1324720kZq2 != null) {
                        C12ES.LJIILL(0, c1324720kZq2);
                    }
                    AigcWallpaperGuestResultFragment aigcWallpaperGuestResultFragment2 = (AigcWallpaperGuestResultFragment) agS296S0100000_15.l0;
                    aigcWallpaperGuestResultFragment2.getClass();
                    if (c945890aip.LJ != null) {
                        C20441214yg.LIZIZ("AigcWallpaperGuestResultFragment", "loadLocalImage");
                        C1324720kZq c1324720kZq3 = aigcWallpaperGuestResultFragment2.LLILZ;
                        if (c1324720kZq3 != null) {
                            C1324610kZf c1324610kZfLJIIJ = C1819620xS4.LIZ().LJIIJ(new C0VSJ(c945890aip.LJ));
                            int width = c1324720kZq3.getWidth();
                            int height = c1324720kZq3.getHeight();
                            c1324610kZfLJIIJ.LJ = width;
                            c1324610kZfLJIIJ.LJFF = height;
                            c1324610kZfLJIIJ.LJIJI(Float.valueOf(C497740JfY.LIZIZ(16.0f)));
                            c1324610kZfLJIIJ.LJIIL = new C987140bnM(aigcWallpaperGuestResultFragment2, 3);
                            c1324610kZfLJIIJ.LJJI(c1324720kZq3);
                        }
                    }
                }
            } else if (abstractC942990ae9 instanceof C0HIH) {
                AigcWallpaperGuestResultFragment aigcWallpaperGuestResultFragment3 = (AigcWallpaperGuestResultFragment) agS296S0100000_15.l0;
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT6 = aigcWallpaperGuestResultFragment3.LLIZ;
                if (viewOnClickListenerC1836610xtT6 != null) {
                    viewOnClickListenerC1836610xtT6.LJ();
                }
                C1143680frq.LIZLLL(aigcWallpaperGuestResultFragment3.LLJI, "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_timeout_img.png");
                C943120aeM.LJIIL("guest_timeout");
                aigcWallpaperGuestResultFragment3.LLJJI = true;
            } else if (abstractC942990ae9 instanceof C0HIJ) {
                C0GYK c0gyk5 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILLJJLI;
                if (c0gyk5 != null) {
                    c0gyk5.LIZ();
                }
                C16FS c16fs4 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLILZIL;
                if (c16fs4 != null) {
                    c16fs4.setEnabled(false);
                }
                AigcWallpaperGuestCreateDialog aigcWallpaperGuestCreateDialog = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLJ;
                if (aigcWallpaperGuestCreateDialog != null) {
                    aigcWallpaperGuestCreateDialog.dismiss();
                }
                if (!((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLJJI) {
                    if (C943120aeM.LIZ == 1) {
                        C943120aeM.LJIIL("anchor_end");
                    }
                    ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLJJI = false;
                }
            } else if (abstractC942990ae9 instanceof C0HIF) {
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT7 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
                if (viewOnClickListenerC1836610xtT7 != null && (textView = (TextView) viewOnClickListenerC1836610xtT7.findViewById(R.id.hba)) != null) {
                    textView.setText(2131842441);
                }
                ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT8 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZ;
                if (viewOnClickListenerC1836610xtT8 != null) {
                    viewOnClickListenerC1836610xtT8.LJFF();
                }
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel3 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
                if (aigcWallpaperGuestViewModel3 != null && aigcWallpaperGuestViewModel3.LLJILJILJ) {
                    z = true;
                }
                if (z) {
                    C943120aeM.LJII(null, "image_load_fail", null);
                } else {
                    C943120aeM.LJII(null, "review_msg_timeout", null);
                }
                AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel4 = ((AigcWallpaperGuestResultFragment) agS296S0100000_15.l0).LLIZLLLIL;
                if (aigcWallpaperGuestViewModel4 != null) {
                    aigcWallpaperGuestViewModel4.wQ2();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$4(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        String str;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel;
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C942950ae5) {
            C20441214yg.LIZIZ("AigcAnchorWidget", "apply aigc pic start");
        } else if (abstractC942990ae9 instanceof C942770adn) {
            C20441214yg.LIZIZ("AigcAnchorWidget", "apply aigc pic succ");
            C942770adn c942770adn = (C942770adn) abstractC942990ae9;
            C942820ads c942820ads = c942770adn.LIZ;
            String str2 = c942820ads.LIZJ;
            if (str2 != null) {
                AigcAnchorWidget aigcAnchorWidget = (AigcAnchorWidget) agS296S0100000_15.l0;
                String str3 = c942820ads.LIZIZ;
                if (str3 != null) {
                    DataChannel dataChannel = aigcAnchorWidget.dataChannel;
                    if (dataChannel != null) {
                        dataChannel.zW(AigcWallpaperUrlEvent.class, str3);
                    }
                    MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel2 = aigcAnchorWidget.LL;
                    if (multiGuestSharedBgAnchorViewModel2 != null) {
                        multiGuestSharedBgAnchorViewModel2.setState(new AwS1S3010000_15(multiGuestSharedBgAnchorViewModel2.BQ2(true), c942770adn.LIZ.LIZ, str3, str2, 0));
                    }
                    C766270U4b.LIZLLL(2131842483);
                }
            }
        } else if (abstractC942990ae9 instanceof C942780ado) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("apply aigc pic failed, ");
            sbLIZ.append(((C942780ado) abstractC942990ae9).LIZ);
            C20441214yg.LJ("AigcAnchorWidget", C2188811AlT.LIZIZ(sbLIZ));
        } else if (abstractC942990ae9 instanceof C942920ae2) {
            C20441214yg.LIZIZ("AigcAnchorWidget", "apply aigc pic offline");
        } else if (abstractC942990ae9 instanceof C942890adz) {
            C20441214yg.LIZIZ("AigcAnchorWidget", "TotalPlayGameOver message receive");
            if (Intrinsics.LJFF(((AigcAnchorWidget) agS296S0100000_15.l0).dataChannel.gg0(AigcWallpaperStatus.class), true)) {
                C20441214yg.LIZIZ("AigcAnchorWidget", "delay to show eng game alert");
                AigcAnchorWidget aigcAnchorWidget2 = (AigcAnchorWidget) agS296S0100000_15.l0;
                ARunnableS84S0200000_15 aRunnableS84S0200000_15 = new ARunnableS84S0200000_15(aigcAnchorWidget2, abstractC942990ae9, 20);
                aigcAnchorWidget2.LLILLL = aRunnableS84S0200000_15;
                C786410Ut5.LJLIIL(MultiGuestAigcWallpaperConfigSetting.INSTANCE.getAnchorEndGameDelayTime() * LSPassThroughRecordSizeConfig.DEFAULT, C473410IhP.LIZ(), aRunnableS84S0200000_15);
            }
        } else if (abstractC942990ae9 instanceof C942940ae4) {
            C20441214yg.LIZIZ("AigcAnchorWidget", "AigcResumeSharedBg");
            DataChannel dataChannel2 = ((AigcAnchorWidget) agS296S0100000_15.l0).dataChannel;
            if (dataChannel2 != null && (str = (String) dataChannel2.gg0(C956780b0O.class)) != null) {
                AigcAnchorWidget aigcAnchorWidget3 = (AigcAnchorWidget) agS296S0100000_15.l0;
                if (C936270aTJ.LIZJ(true) && (multiGuestSharedBgAnchorViewModel = aigcAnchorWidget3.LL) != null) {
                    multiGuestSharedBgAnchorViewModel.GQ2(true, str);
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$5(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel;
        AigcGuestWidget aigcGuestWidget;
        DataChannel dataChannel;
        FragmentManager fragmentManager;
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C0HIG) {
            AigcGuestWidget aigcGuestWidget2 = (AigcGuestWidget) agS296S0100000_15.l0;
            aigcGuestWidget2.getClass();
            AbstractC19484711Kz.LJJIJL(MultiGuestAigcWallpaperConfigSetting.INSTANCE.getInvitedDialogDelayTime(), TimeUnit.SECONDS).LJFF(new C0UO0()).LJJIIZ(new AfS184S0100000_15(aigcGuestWidget2, 91), new C09JN() { // from class: X.00RF
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    C1C7U.LIZ("AigcGuestWidget@6cb0.showInvitedDialog$2");
                    C20441214yg.LJFF("AigcGuestWidget", "showInvitedDialog delay err,", (Throwable) obj2);
                    C1C7U.LIZIZ("AigcGuestWidget@6cb0.showInvitedDialog$2");
                }
            });
        } else if (!(abstractC942990ae9 instanceof C943190aeT)) {
            if (abstractC942990ae9 instanceof C942910ae1) {
                if (((C942910ae1) abstractC942990ae9).LIZ == 1 && (dataChannel = (aigcGuestWidget = (AigcGuestWidget) agS296S0100000_15.l0).dataChannel) != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                    AigcWallpaperGuestViewModel aigcWallpaperGuestViewModel = aigcGuestWidget.LLILLJJLI;
                    AigcWallpaperGuestCreateDialog aigcWallpaperGuestCreateDialog = new AigcWallpaperGuestCreateDialog();
                    aigcWallpaperGuestCreateDialog.LLILLJJLI = aigcWallpaperGuestViewModel;
                    if (MultiGuestFixDialogLeakSetting.INSTANCE.isEnable()) {
                        DialogManager.LIZ((DialogManager) aigcGuestWidget.LLILLL.getValue(), aigcWallpaperGuestCreateDialog, "AigcGuestWidget_create", fragmentManager);
                    } else {
                        C492400JSs.LIZ(aigcWallpaperGuestCreateDialog, fragmentManager, "AigcGuestWidget_create");
                    }
                }
            } else if (!(abstractC942990ae9 instanceof C943140aeO) && !(abstractC942990ae9 instanceof C943180aeS)) {
                if (abstractC942990ae9 instanceof C0HIJ) {
                    if (C930540aK4.LJ()) {
                        C766270U4b.LIZLLL(2131842462);
                        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toast_msg_show");
                        c474500IjALIZ.LJIJJLI(((AigcGuestWidget) agS296S0100000_15.l0).dataChannel);
                        c474500IjALIZ.LJJII("pm_liveAiWallpaper_guestEndScreen_toast", "msg_id");
                        c474500IjALIZ.LIZ();
                    }
                } else if (abstractC942990ae9 instanceof C942950ae5) {
                    C20441214yg.LIZIZ("AigcGuestWidget", "apply aigc pic start");
                } else if (abstractC942990ae9 instanceof C942770adn) {
                    C20441214yg.LIZIZ("AigcGuestWidget", "apply aigc pic succ");
                    C942820ads c942820ads = ((C942770adn) abstractC942990ae9).LIZ;
                    String str = c942820ads.LIZJ;
                    if (str != null) {
                        AigcGuestWidget aigcGuestWidget3 = (AigcGuestWidget) agS296S0100000_15.l0;
                        String str2 = c942820ads.LIZIZ;
                        if (str2 != null && (multiGuestSharedBgGuestViewModel = aigcGuestWidget3.LL) != null) {
                            multiGuestSharedBgGuestViewModel.setState(new AwS1S3010000_15(multiGuestSharedBgGuestViewModel.xQ2(true), c942820ads.LIZ, str2, str, 1));
                        }
                    }
                } else if (abstractC942990ae9 instanceof C942780ado) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("apply aigc pic failed, ");
                    sbLIZ.append(((C942780ado) abstractC942990ae9).LIZ);
                    C20441214yg.LJ("AigcGuestWidget", C2188811AlT.LIZIZ(sbLIZ));
                } else if (abstractC942990ae9 instanceof C942920ae2) {
                    C20441214yg.LIZIZ("AigcGuestWidget", "apply aigc pic offline");
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object emit$6(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C961570b87 c961570b87 = (C961570b87) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Vm=");
        sbLIZ.append(c961570b87);
        C20441214yg.LIZIZ("MultiHostInviteListUpgradeFragment", C2188811AlT.LIZIZ(sbLIZ));
        C961560b86 c961560b86 = (C961560b86) agS296S0100000_15.l0;
        c961560b86.LL.setText(c961570b87.LIZ);
        if (C497740JfY.LJJ()) {
            c961560b86.LLILZ.setText(c961570b87.LIZIZ);
            c961560b86.LLILLL.setText(c961570b87.LIZJ);
            c961560b86.LLILLJJLI.setText(c961570b87.LIZLLL);
        } else {
            c961560b86.LLILLJJLI.setText(c961570b87.LIZIZ);
            c961560b86.LLILLL.setText(c961570b87.LIZJ);
            c961560b86.LLILZ.setText(c961570b87.LIZLLL);
        }
        return Unit.LIZ;
    }

    public static final Object emit$7(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        ((Function1) obj).invoke(((C954270awL) agS296S0100000_15.l0).LJFF);
        return Unit.LIZ;
    }

    public static final Object emit$8(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        int size;
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C942970ae7) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT != null) {
                viewOnClickListenerC1836610xtT.LJI();
            }
        } else if (abstractC942990ae9 instanceof C942960ae6) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT2 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT2 != null) {
                viewOnClickListenerC1836610xtT2.LJII();
            }
        } else if (abstractC942990ae9 instanceof C942760adm) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT3 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT3 != null) {
                viewOnClickListenerC1836610xtT3.LIZLLL();
            }
            C1143680frq.LIZLLL(((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILLJJLI, "tiktok_live_interaction_normal_1", "ttlive_multiguest_aigc_wallpaper_edit_dialog_big_bg.png");
            C1117360fBO c1117360fBO = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILLL;
            if (c1117360fBO != null) {
                C410901il c410901il = new C410901il();
                C942760adm c942760adm = (C942760adm) abstractC942990ae9;
                List<WallpaperContext> list = c942760adm.LIZ;
                if (list != null) {
                    size = list.size();
                } else {
                    size = 0;
                }
                int i = size + 1;
                List<WallpaperContext> list2 = c942760adm.LIZIZ;
                if (list2 != null) {
                    int i2 = 0;
                    for (WallpaperContext wallpaperContext : list2) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            WallpaperContext wallpaperContext2 = wallpaperContext;
                            wallpaperContext2.LIZ = true;
                            wallpaperContext2.LIZIZ = i2 + i;
                            c410901il.add(wallpaperContext2);
                            i2 = i3;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                if (c942760adm.LIZ != null && (!r0.isEmpty())) {
                    c410901il.add(new C942320ad4());
                }
                List<WallpaperContext> list3 = c942760adm.LIZ;
                if (list3 != null) {
                    int i4 = 0;
                    for (WallpaperContext wallpaperContext3 : list3) {
                        int i5 = i4 + 1;
                        if (i4 >= 0) {
                            WallpaperContext wallpaperContext4 = wallpaperContext3;
                            wallpaperContext4.LIZ = false;
                            wallpaperContext4.LIZIZ = i5;
                            c410901il.add(wallpaperContext4);
                            i4 = i5;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                }
                c1117360fBO.LL = c410901il;
            }
            C1117360fBO c1117360fBO2 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILLL;
            if (c1117360fBO2 != null) {
                c1117360fBO2.notifyDataSetChanged();
            }
        } else if (abstractC942990ae9 instanceof C442320HWc) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT4 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT4 != null) {
                viewOnClickListenerC1836610xtT4.LJFF();
            }
        } else if (abstractC942990ae9 instanceof C943290aed) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT5 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT5 != null) {
                viewOnClickListenerC1836610xtT5.LJI();
            }
        } else if (abstractC942990ae9 instanceof C943280aec) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT6 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT6 != null) {
                viewOnClickListenerC1836610xtT6.LJI();
            }
        } else if (abstractC942990ae9 instanceof C0HIJ) {
            C930540aK4.LJJIZ((AigcWallpaperManageDialog) agS296S0100000_15.l0);
        } else if (abstractC942990ae9 instanceof C942900ae0) {
            ViewOnClickListenerC1836610xtT viewOnClickListenerC1836610xtT7 = ((AigcWallpaperManageDialog) agS296S0100000_15.l0).LLILZIL;
            if (viewOnClickListenerC1836610xtT7 != null) {
                viewOnClickListenerC1836610xtT7.LJI();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyAigcWallpaperMode failed, because: ");
            sbLIZ.append(((C942900ae0) abstractC942990ae9).LIZ);
            C20441214yg.LJ("AigcWallpaperManageDialog", C2188811AlT.LIZIZ(sbLIZ));
        } else if (abstractC942990ae9 instanceof C942890adz) {
            C930540aK4.LJJIZ((AigcWallpaperManageDialog) agS296S0100000_15.l0);
        }
        return Unit.LIZ;
    }

    public static final Object emit$9(AgS296S0100000_15 agS296S0100000_15, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        AbstractC942990ae9 abstractC942990ae9 = (AbstractC942990ae9) obj;
        if (abstractC942990ae9 instanceof C0HIE) {
            C16FS c16fs = ((AigcWallpaperInvitedDialog) agS296S0100000_15.l0).LLILLL;
            if (c16fs != null) {
                int i = (int) ((C0HIE) abstractC942990ae9).LIZ;
                c16fs.setText(C497740JfY.LJIIL(2131755558, i, C2286608xc.LJ(i)));
            }
        } else if (abstractC942990ae9 instanceof C0HII) {
            C943120aeM.LJIILIIL("click", "timeout");
            ((AigcWallpaperInvitedDialog) agS296S0100000_15.l0).OR();
        }
        return Unit.LIZ;
    }
}
